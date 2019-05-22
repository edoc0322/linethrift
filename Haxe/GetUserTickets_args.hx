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


class GetUserTickets_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getUserTickets_args"); };
  static var USER_MIDS_FIELD_DESC = { new TField("userMids", TType.LIST, 1); };

  @:isVar
  public var userMids(get,set) : List< String>;

  inline static var USERMIDS_FIELD_ID : Int = 1;


  public function new() {
  }

  public function get_userMids() : List< String> {
    return this.userMids;
  }

  public function set_userMids(userMids:List< String>) : List< String> {
    this.userMids = userMids;
    return this.userMids;
  }

  public function unsetUserMids() : Void {
    this.userMids = null;
  }

  // Returns true if field userMids is set (has been assigned a value) and false otherwise
  public function isSetUserMids() : Bool {
    return this.userMids != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case USERMIDS_FIELD_ID:
      if (value == null) {
        unsetUserMids();
      } else {
        this.userMids = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case USERMIDS_FIELD_ID:
      return this.userMids;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case USERMIDS_FIELD_ID:
      return isSetUserMids();
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
          case USERMIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list1552 = iprot.readListBegin();
                this.userMids = new List< String>();
                for( _i1553 in 0 ... _list1552.size)
                {
                  var _elem1554 : String;
                  _elem1554 = iprot.readString();
                  this.userMids.add(_elem1554);
                }
                iprot.readListEnd();
              }
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
      if (this.userMids != null) {
        oprot.writeFieldBegin(USER_MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.userMids.length));
          for( elem1555 in this.userMids)
          {
            oprot.writeString(elem1555);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
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
    var ret : String = "getUserTickets_args(";
    var first : Bool = true;

    ret += "userMids:";
    if (this.userMids == null) {
      ret += "null";
    } else {
      ret += this.userMids;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

