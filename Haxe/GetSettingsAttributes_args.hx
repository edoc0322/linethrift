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


class GetSettingsAttributes_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getSettingsAttributes_args"); };
  static var ATTR_BITSET_FIELD_DESC = { new TField("attrBitset", TType.I32, 2); };

  @:isVar
  public var attrBitset(get,set) : haxe.Int32;

  inline static var ATTRBITSET_FIELD_ID : Int = 2;

  private var __isset_attrBitset : Bool = false;

  public function new() {
  }

  public function get_attrBitset() : haxe.Int32 {
    return this.attrBitset;
  }

  public function set_attrBitset(attrBitset:haxe.Int32) : haxe.Int32 {
    this.attrBitset = attrBitset;
    this.__isset_attrBitset = true;
    return this.attrBitset;
  }

  public function unsetAttrBitset() : Void {
    this.__isset_attrBitset = false;
  }

  // Returns true if field attrBitset is set (has been assigned a value) and false otherwise
  public function isSetAttrBitset() : Bool {
    return this.__isset_attrBitset;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case ATTRBITSET_FIELD_ID:
      if (value == null) {
        unsetAttrBitset();
      } else {
        this.attrBitset = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case ATTRBITSET_FIELD_ID:
      return this.attrBitset;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case ATTRBITSET_FIELD_ID:
      return isSetAttrBitset();
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
          case ATTRBITSET_FIELD_ID:
            if (field.type == TType.I32) {
              this.attrBitset = iprot.readI32();
              this.__isset_attrBitset = true;
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
      oprot.writeFieldBegin(ATTR_BITSET_FIELD_DESC);
      oprot.writeI32(this.attrBitset);
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
    var ret : String = "getSettingsAttributes_args(";
    var first : Bool = true;

    ret += "attrBitset:";
    ret += this.attrBitset;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

