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


class ReportClientStatistics_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("reportClientStatistics_args"); };
  static var REQ_SEQ_FIELD_DESC = { new TField("reqSeq", TType.I32, 1); };
  static var CATEGORY_FIELD_DESC = { new TField("category", TType.I32, 2); };
  static var COUNT_FIELD_DESC = { new TField("count", TType.I32, 3); };

  @:isVar
  public var reqSeq(get,set) : haxe.Int32;
  @:isVar
  public var category(get,set) : Int;
  @:isVar
  public var count(get,set) : haxe.Int32;

  inline static var REQSEQ_FIELD_ID : Int = 1;
  inline static var CATEGORY_FIELD_ID : Int = 2;
  inline static var COUNT_FIELD_ID : Int = 3;

  private var __isset_reqSeq : Bool = false;
  private var __isset_category : Bool = false;
  private var __isset_count : Bool = false;

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

  public function get_category() : Int {
    return this.category;
  }

  public function set_category(category:Int) : Int {
    this.category = category;
    this.__isset_category = true;
    return this.category;
  }

  public function unsetCategory() : Void {
    this.__isset_category = false;
  }

  // Returns true if field category is set (has been assigned a value) and false otherwise
  public function isSetCategory() : Bool {
    return this.__isset_category;
  }

  public function get_count() : haxe.Int32 {
    return this.count;
  }

  public function set_count(count:haxe.Int32) : haxe.Int32 {
    this.count = count;
    this.__isset_count = true;
    return this.count;
  }

  public function unsetCount() : Void {
    this.__isset_count = false;
  }

  // Returns true if field count is set (has been assigned a value) and false otherwise
  public function isSetCount() : Bool {
    return this.__isset_count;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      if (value == null) {
        unsetReqSeq();
      } else {
        this.reqSeq = value;
      }

    case CATEGORY_FIELD_ID:
      if (value == null) {
        unsetCategory();
      } else {
        this.category = value;
      }

    case COUNT_FIELD_ID:
      if (value == null) {
        unsetCount();
      } else {
        this.count = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return this.reqSeq;
    case CATEGORY_FIELD_ID:
      return this.category;
    case COUNT_FIELD_ID:
      return this.count;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return isSetReqSeq();
    case CATEGORY_FIELD_ID:
      return isSetCategory();
    case COUNT_FIELD_ID:
      return isSetCount();
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
          case CATEGORY_FIELD_ID:
            if (field.type == TType.I32) {
              this.category = iprot.readI32();
              this.__isset_category = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case COUNT_FIELD_ID:
            if (field.type == TType.I32) {
              this.count = iprot.readI32();
              this.__isset_count = true;
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
      oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
      oprot.writeI32(this.category);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(this.count);
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
    var ret : String = "reportClientStatistics_args(";
    var first : Bool = true;

    ret += "reqSeq:";
    ret += this.reqSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "category:";
    var category_name : String = .ReportCategory.VALUES_TO_NAMES[this.category];
    if (category_name != null) {
      ret += category_name;
      ret += " (";
    }
    ret += this.category;
    if (category_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "count:";
    ret += this.count;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCategory() && !.ReportCategory.VALID_VALUES.contains(category)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'category' has been assigned the invalid value " + category);
    }
  }

}

