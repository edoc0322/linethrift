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


class IssueTokenForAccountMigrationSettings_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("issueTokenForAccountMigrationSettings_args"); };
  static var ENFORCE_FIELD_DESC = { new TField("enforce", TType.BOOL, 2); };

  @:isVar
  public var enforce(get,set) : Bool;

  inline static var ENFORCE_FIELD_ID : Int = 2;

  private var __isset_enforce : Bool = false;

  public function new() {
  }

  public function get_enforce() : Bool {
    return this.enforce;
  }

  public function set_enforce(enforce:Bool) : Bool {
    this.enforce = enforce;
    this.__isset_enforce = true;
    return this.enforce;
  }

  public function unsetEnforce() : Void {
    this.__isset_enforce = false;
  }

  // Returns true if field enforce is set (has been assigned a value) and false otherwise
  public function isSetEnforce() : Bool {
    return this.__isset_enforce;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case ENFORCE_FIELD_ID:
      if (value == null) {
        unsetEnforce();
      } else {
        this.enforce = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case ENFORCE_FIELD_ID:
      return this.enforce;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case ENFORCE_FIELD_ID:
      return isSetEnforce();
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
          case ENFORCE_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.enforce = iprot.readBool();
              this.__isset_enforce = true;
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
      oprot.writeFieldBegin(ENFORCE_FIELD_DESC);
      oprot.writeBool(this.enforce);
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
    var ret : String = "issueTokenForAccountMigrationSettings_args(";
    var first : Bool = true;

    ret += "enforce:";
    ret += this.enforce;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

