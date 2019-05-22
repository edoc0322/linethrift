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


class UpdateSettingsAttribute_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("updateSettingsAttribute_args"); };
  static var REQ_SEQ_FIELD_DESC = { new TField("reqSeq", TType.I32, 1); };
  static var ATTR_FIELD_DESC = { new TField("attr", TType.I32, 2); };
  static var VALUE_FIELD_DESC = { new TField("value", TType.STRING, 3); };

  @:isVar
  public var reqSeq(get,set) : haxe.Int32;
  @:isVar
  public var attr(get,set) : Int;
  @:isVar
  public var value(get,set) : String;

  inline static var REQSEQ_FIELD_ID : Int = 1;
  inline static var ATTR_FIELD_ID : Int = 2;
  inline static var VALUE_FIELD_ID : Int = 3;

  private var __isset_reqSeq : Bool = false;
  private var __isset_attr : Bool = false;

  public function new() {
  }

  public function get_reqSeq() : haxe.Int32 {
    return this.reqSeq;
  }

  public function set_reqSeq(reqSeq:haxe.Int32) : haxe.Int32 {
    this.reqSeq = reqSeq;
    this.__isset_reqSeq = true;
    return this.reqSeq;
  }

  public function unsetReqSeq() : Void {
    this.__isset_reqSeq = false;
  }

  // Returns true if field reqSeq is set (has been assigned a value) and false otherwise
  public function isSetReqSeq() : Bool {
    return this.__isset_reqSeq;
  }

  public function get_attr() : Int {
    return this.attr;
  }

  public function set_attr(attr:Int) : Int {
    this.attr = attr;
    this.__isset_attr = true;
    return this.attr;
  }

  public function unsetAttr() : Void {
    this.__isset_attr = false;
  }

  // Returns true if field attr is set (has been assigned a value) and false otherwise
  public function isSetAttr() : Bool {
    return this.__isset_attr;
  }

  public function get_value() : String {
    return this.value;
  }

  public function set_value(value:String) : String {
    this.value = value;
    return this.value;
  }

  public function unsetValue() : Void {
    this.value = null;
  }

  // Returns true if field value is set (has been assigned a value) and false otherwise
  public function isSetValue() : Bool {
    return this.value != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      if (value == null) {
        unsetReqSeq();
      } else {
        this.reqSeq = value;
      }

    case ATTR_FIELD_ID:
      if (value == null) {
        unsetAttr();
      } else {
        this.attr = value;
      }

    case VALUE_FIELD_ID:
      if (value == null) {
        unsetValue();
      } else {
        this.value = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return this.reqSeq;
    case ATTR_FIELD_ID:
      return this.attr;
    case VALUE_FIELD_ID:
      return this.value;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return isSetReqSeq();
    case ATTR_FIELD_ID:
      return isSetAttr();
    case VALUE_FIELD_ID:
      return isSetValue();
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
          case REQSEQ_FIELD_ID:
            if (field.type == TType.I32) {
              this.reqSeq = iprot.readI32();
              this.__isset_reqSeq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ATTR_FIELD_ID:
            if (field.type == TType.I32) {
              this.attr = iprot.readI32();
              this.__isset_attr = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case VALUE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.value = iprot.readString();
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
      oprot.writeFieldBegin(REQ_SEQ_FIELD_DESC);
      oprot.writeI32(this.reqSeq);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ATTR_FIELD_DESC);
      oprot.writeI32(this.attr);
      oprot.writeFieldEnd();
      if (this.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        oprot.writeString(this.value);
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
    var ret : String = "updateSettingsAttribute_args(";
    var first : Bool = true;

    ret += "reqSeq:";
    ret += this.reqSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "attr:";
    var attr_name : String = .SettingsAttribute.VALUES_TO_NAMES[this.attr];
    if (attr_name != null) {
      ret += attr_name;
      ret += " (";
    }
    ret += this.attr;
    if (attr_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "value:";
    if (this.value == null) {
      ret += "null";
    } else {
      ret += this.value;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetAttr() && !.SettingsAttribute.VALID_VALUES.contains(attr)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'attr' has been assigned the invalid value " + attr);
    }
  }

}

