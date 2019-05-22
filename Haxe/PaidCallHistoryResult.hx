/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;
import haxe.io.Bytes;
import haxe.ds.IntMap;
import haxe.ds.StringMap;
import haxe.ds.ObjectMap;

#if flash
import flash.errors.ArgumentError;
#end

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;


class PaidCallHistoryResult implements TBase {
  
  static var STRUCT_DESC = { new TStruct("PaidCallHistoryResult"); };
  static var HISTORYS_FIELD_DESC = { new TField("historys", TType.LIST, 1); };
  static var HAS_NEXT_FIELD_DESC = { new TField("hasNext", TType.BOOL, 2); };

  @:isVar
  public var historys(get,set) : List< PaidCallHistory>;
  @:isVar
  public var hasNext(get,set) : Bool;

  inline static var HISTORYS_FIELD_ID : Int = 1;
  inline static var HASNEXT_FIELD_ID : Int = 2;

  private var __isset_hasNext : Bool = false;

  public function new() {
  }

  public function get_historys() : List< PaidCallHistory> {
    return this.historys;
  }

  public function set_historys(historys:List< PaidCallHistory>) : List< PaidCallHistory> {
    this.historys = historys;
    return this.historys;
  }

  public function unsetHistorys() : Void {
    this.historys = null;
  }

  // Returns true if field historys is set (has been assigned a value) and false otherwise
  public function isSetHistorys() : Bool {
    return this.historys != null;
  }

  public function get_hasNext() : Bool {
    return this.hasNext;
  }

  public function set_hasNext(hasNext:Bool) : Bool {
    this.hasNext = hasNext;
    this.__isset_hasNext = true;
    return this.hasNext;
  }

  public function unsetHasNext() : Void {
    this.__isset_hasNext = false;
  }

  // Returns true if field hasNext is set (has been assigned a value) and false otherwise
  public function isSetHasNext() : Bool {
    return this.__isset_hasNext;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case HISTORYS_FIELD_ID:
      if (value == null) {
        unsetHistorys();
      } else {
        this.historys = value;
      }

    case HASNEXT_FIELD_ID:
      if (value == null) {
        unsetHasNext();
      } else {
        this.hasNext = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case HISTORYS_FIELD_ID:
      return this.historys;
    case HASNEXT_FIELD_ID:
      return this.hasNext;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case HISTORYS_FIELD_ID:
      return isSetHistorys();
    case HASNEXT_FIELD_ID:
      return isSetHasNext();
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function read( iprot : TProtocol) : Void {
    iprot.IncrementRecursionDepth();
    try
    {
      var field : TField;
      iprot.readStructBegin();
      while (true)
      {
        field = iprot.readFieldBegin();
        if (field.type == TType.STOP) { 
          break;
        }
        switch (field.id)
        {
          case HISTORYS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list105 = iprot.readListBegin();
                this.historys = new List< PaidCallHistory>();
                for( _i106 in 0 ... _list105.size)
                {
                  var _elem107 : PaidCallHistory;
                  _elem107 = new PaidCallHistory();
                  _elem107.read(iprot);
                  this.historys.add(_elem107);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case HASNEXT_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.hasNext = iprot.readBool();
              this.__isset_hasNext = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          default:
            TProtocolUtil.skip(iprot, field.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      iprot.DecrementRecursionDepth();
    }
    catch(e:Dynamic)
    {
      iprot.DecrementRecursionDepth();
      throw e;
    }

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public function write(oprot:TProtocol) : Void {
    validate();
    oprot.IncrementRecursionDepth();
    try
    {
      oprot.writeStructBegin(STRUCT_DESC);
      if (this.historys != null) {
        oprot.writeFieldBegin(HISTORYS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.historys.length));
          for( elem108 in this.historys)
          {
            elem108.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(HAS_NEXT_FIELD_DESC);
      oprot.writeBool(this.hasNext);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
      oprot.DecrementRecursionDepth();
    }
    catch(e:Dynamic)
    {
      oprot.DecrementRecursionDepth();
      throw e;
    }
  }

  public function toString() : String {
    var ret : String = "PaidCallHistoryResult(";
    var first : Bool = true;

    ret += "historys:";
    if (this.historys == null) {
      ret += "null";
    } else {
      ret += this.historys;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "hasNext:";
    ret += this.hasNext;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

