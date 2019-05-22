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


class GetCompactContactsModifiedSince_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getCompactContactsModifiedSince_args"); };
  static var TIMESTAMP_FIELD_DESC = { new TField("timestamp", TType.I64, 2); };

  @:isVar
  public var timestamp(get,set) : haxe.Int64;

  inline static var TIMESTAMP_FIELD_ID : Int = 2;

  private var __isset_timestamp : Bool = false;

  public function new() {
  }

  public function get_timestamp() : haxe.Int64 {
    return this.timestamp;
  }

  public function set_timestamp(timestamp:haxe.Int64) : haxe.Int64 {
    this.timestamp = timestamp;
    this.__isset_timestamp = true;
    return this.timestamp;
  }

  public function unsetTimestamp() : Void {
    this.__isset_timestamp = false;
  }

  // Returns true if field timestamp is set (has been assigned a value) and false otherwise
  public function isSetTimestamp() : Bool {
    return this.__isset_timestamp;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case TIMESTAMP_FIELD_ID:
      if (value == null) {
        unsetTimestamp();
      } else {
        this.timestamp = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case TIMESTAMP_FIELD_ID:
      return this.timestamp;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case TIMESTAMP_FIELD_ID:
      return isSetTimestamp();
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
          case TIMESTAMP_FIELD_ID:
            if (field.type == TType.I64) {
              this.timestamp = iprot.readI64();
              this.__isset_timestamp = true;
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
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(this.timestamp);
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
    var ret : String = "getCompactContactsModifiedSince_args(";
    var first : Bool = true;

    ret += "timestamp:";
    ret += this.timestamp;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

