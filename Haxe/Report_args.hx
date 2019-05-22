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


class Report_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("report_args"); };
  static var SYNC_OP_REVISION_FIELD_DESC = { new TField("syncOpRevision", TType.I64, 2); };
  static var CATEGORY_FIELD_DESC = { new TField("category", TType.I32, 3); };
  static var REPORT_FIELD_DESC = { new TField("report", TType.STRING, 4); };

  @:isVar
  public var syncOpRevision(get,set) : haxe.Int64;
  @:isVar
  public var category(get,set) : Int;
  @:isVar
  public var report(get,set) : String;

  inline static var SYNCOPREVISION_FIELD_ID : Int = 2;
  inline static var CATEGORY_FIELD_ID : Int = 3;
  inline static var REPORT_FIELD_ID : Int = 4;

  private var __isset_syncOpRevision : Bool = false;
  private var __isset_category : Bool = false;

  public function new() {
  }

  public function get_syncOpRevision() : haxe.Int64 {
    return this.syncOpRevision;
  }

  public function set_syncOpRevision(syncOpRevision:haxe.Int64) : haxe.Int64 {
    this.syncOpRevision = syncOpRevision;
    this.__isset_syncOpRevision = true;
    return this.syncOpRevision;
  }

  public function unsetSyncOpRevision() : Void {
    this.__isset_syncOpRevision = false;
  }

  // Returns true if field syncOpRevision is set (has been assigned a value) and false otherwise
  public function isSetSyncOpRevision() : Bool {
    return this.__isset_syncOpRevision;
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

  public function get_report() : String {
    return this.report;
  }

  public function set_report(report:String) : String {
    this.report = report;
    return this.report;
  }

  public function unsetReport() : Void {
    this.report = null;
  }

  // Returns true if field report is set (has been assigned a value) and false otherwise
  public function isSetReport() : Bool {
    return this.report != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SYNCOPREVISION_FIELD_ID:
      if (value == null) {
        unsetSyncOpRevision();
      } else {
        this.syncOpRevision = value;
      }

    case CATEGORY_FIELD_ID:
      if (value == null) {
        unsetCategory();
      } else {
        this.category = value;
      }

    case REPORT_FIELD_ID:
      if (value == null) {
        unsetReport();
      } else {
        this.report = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SYNCOPREVISION_FIELD_ID:
      return this.syncOpRevision;
    case CATEGORY_FIELD_ID:
      return this.category;
    case REPORT_FIELD_ID:
      return this.report;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SYNCOPREVISION_FIELD_ID:
      return isSetSyncOpRevision();
    case CATEGORY_FIELD_ID:
      return isSetCategory();
    case REPORT_FIELD_ID:
      return isSetReport();
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
          case SYNCOPREVISION_FIELD_ID:
            if (field.type == TType.I64) {
              this.syncOpRevision = iprot.readI64();
              this.__isset_syncOpRevision = true;
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
          case REPORT_FIELD_ID:
            if (field.type == TType.STRING) {
              this.report = iprot.readString();
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
      oprot.writeFieldBegin(SYNC_OP_REVISION_FIELD_DESC);
      oprot.writeI64(this.syncOpRevision);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CATEGORY_FIELD_DESC);
      oprot.writeI32(this.category);
      oprot.writeFieldEnd();
      if (this.report != null) {
        oprot.writeFieldBegin(REPORT_FIELD_DESC);
        oprot.writeString(this.report);
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
    var ret : String = "report_args(";
    var first : Bool = true;

    ret += "syncOpRevision:";
    ret += this.syncOpRevision;
    first = false;
    if (!first) ret +=  ", ";
    ret += "category:";
    var category_name : String = .SyncCategory.VALUES_TO_NAMES[this.category];
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
    ret += "report:";
    if (this.report == null) {
      ret += "null";
    } else {
      ret += this.report;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCategory() && !.SyncCategory.VALID_VALUES.contains(category)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'category' has been assigned the invalid value " + category);
    }
  }

}

