/**
 * Autogenerated by Thrift Compiler (0.13.0)
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


class SnsFriend implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SnsFriend"); };
  static var SNS_USER_ID_FIELD_DESC = { new TField("snsUserId", TType.STRING, 1); };
  static var SNS_USER_NAME_FIELD_DESC = { new TField("snsUserName", TType.STRING, 2); };
  static var SNS_ID_TYPE_FIELD_DESC = { new TField("snsIdType", TType.I32, 3); };

  @:isVar
  public var snsUserId(get,set) : String;
  @:isVar
  public var snsUserName(get,set) : String;
  @:isVar
  public var snsIdType(get,set) : Int;

  inline static var SNSUSERID_FIELD_ID : Int = 1;
  inline static var SNSUSERNAME_FIELD_ID : Int = 2;
  inline static var SNSIDTYPE_FIELD_ID : Int = 3;

  private var __isset_snsIdType : Bool = false;

  public function new() {
  }

  public function get_snsUserId() : String {
    return this.snsUserId;
  }

  public function set_snsUserId(snsUserId:String) : String {
    this.snsUserId = snsUserId;
    return this.snsUserId;
  }

  public function unsetSnsUserId() : Void {
    this.snsUserId = null;
  }

  // Returns true if field snsUserId is set (has been assigned a value) and false otherwise
  public function isSetSnsUserId() : Bool {
    return this.snsUserId != null;
  }

  public function get_snsUserName() : String {
    return this.snsUserName;
  }

  public function set_snsUserName(snsUserName:String) : String {
    this.snsUserName = snsUserName;
    return this.snsUserName;
  }

  public function unsetSnsUserName() : Void {
    this.snsUserName = null;
  }

  // Returns true if field snsUserName is set (has been assigned a value) and false otherwise
  public function isSetSnsUserName() : Bool {
    return this.snsUserName != null;
  }

  public function get_snsIdType() : Int {
    return this.snsIdType;
  }

  public function set_snsIdType(snsIdType:Int) : Int {
    this.snsIdType = snsIdType;
    this.__isset_snsIdType = true;
    return this.snsIdType;
  }

  public function unsetSnsIdType() : Void {
    this.__isset_snsIdType = false;
  }

  // Returns true if field snsIdType is set (has been assigned a value) and false otherwise
  public function isSetSnsIdType() : Bool {
    return this.__isset_snsIdType;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SNSUSERID_FIELD_ID:
      if (value == null) {
        unsetSnsUserId();
      } else {
        this.snsUserId = value;
      }

    case SNSUSERNAME_FIELD_ID:
      if (value == null) {
        unsetSnsUserName();
      } else {
        this.snsUserName = value;
      }

    case SNSIDTYPE_FIELD_ID:
      if (value == null) {
        unsetSnsIdType();
      } else {
        this.snsIdType = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SNSUSERID_FIELD_ID:
      return this.snsUserId;
    case SNSUSERNAME_FIELD_ID:
      return this.snsUserName;
    case SNSIDTYPE_FIELD_ID:
      return this.snsIdType;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SNSUSERID_FIELD_ID:
      return isSetSnsUserId();
    case SNSUSERNAME_FIELD_ID:
      return isSetSnsUserName();
    case SNSIDTYPE_FIELD_ID:
      return isSetSnsIdType();
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
          case SNSUSERID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.snsUserId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SNSUSERNAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.snsUserName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SNSIDTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.snsIdType = iprot.readI32();
              this.__isset_snsIdType = true;
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
      if (this.snsUserId != null) {
        oprot.writeFieldBegin(SNS_USER_ID_FIELD_DESC);
        oprot.writeString(this.snsUserId);
        oprot.writeFieldEnd();
      }
      if (this.snsUserName != null) {
        oprot.writeFieldBegin(SNS_USER_NAME_FIELD_DESC);
        oprot.writeString(this.snsUserName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SNS_ID_TYPE_FIELD_DESC);
      oprot.writeI32(this.snsIdType);
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
    var ret : String = "SnsFriend(";
    var first : Bool = true;

    ret += "snsUserId:";
    if (this.snsUserId == null) {
      ret += "null";
    } else {
      ret += this.snsUserId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "snsUserName:";
    if (this.snsUserName == null) {
      ret += "null";
    } else {
      ret += this.snsUserName;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "snsIdType:";
    var snsIdType_name : String = .SnsIdType.VALUES_TO_NAMES[this.snsIdType];
    if (snsIdType_name != null) {
      ret += snsIdType_name;
      ret += " (";
    }
    ret += this.snsIdType;
    if (snsIdType_name != null) {
      ret += ")";
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetSnsIdType() && !.SnsIdType.VALID_VALUES.contains(snsIdType)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'snsIdType' has been assigned the invalid value " + snsIdType);
    }
  }

}

