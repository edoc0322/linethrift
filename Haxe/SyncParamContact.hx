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


class SyncParamContact implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SyncParamContact"); };
  static var SYNC_PARAM_MID_FIELD_DESC = { new TField("syncParamMid", TType.STRUCT, 1); };
  static var CONTACT_STATUS_FIELD_DESC = { new TField("contactStatus", TType.I32, 2); };

  @:isVar
  public var syncParamMid(get,set) : SyncParamMid;
  @:isVar
  public var contactStatus(get,set) : Int;

  inline static var SYNCPARAMMID_FIELD_ID : Int = 1;
  inline static var CONTACTSTATUS_FIELD_ID : Int = 2;

  private var __isset_contactStatus : Bool = false;

  public function new() {
  }

  public function get_syncParamMid() : SyncParamMid {
    return this.syncParamMid;
  }

  public function set_syncParamMid(syncParamMid:SyncParamMid) : SyncParamMid {
    this.syncParamMid = syncParamMid;
    return this.syncParamMid;
  }

  public function unsetSyncParamMid() : Void {
    this.syncParamMid = null;
  }

  // Returns true if field syncParamMid is set (has been assigned a value) and false otherwise
  public function isSetSyncParamMid() : Bool {
    return this.syncParamMid != null;
  }

  public function get_contactStatus() : Int {
    return this.contactStatus;
  }

  public function set_contactStatus(contactStatus:Int) : Int {
    this.contactStatus = contactStatus;
    this.__isset_contactStatus = true;
    return this.contactStatus;
  }

  public function unsetContactStatus() : Void {
    this.__isset_contactStatus = false;
  }

  // Returns true if field contactStatus is set (has been assigned a value) and false otherwise
  public function isSetContactStatus() : Bool {
    return this.__isset_contactStatus;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SYNCPARAMMID_FIELD_ID:
      if (value == null) {
        unsetSyncParamMid();
      } else {
        this.syncParamMid = value;
      }

    case CONTACTSTATUS_FIELD_ID:
      if (value == null) {
        unsetContactStatus();
      } else {
        this.contactStatus = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SYNCPARAMMID_FIELD_ID:
      return this.syncParamMid;
    case CONTACTSTATUS_FIELD_ID:
      return this.contactStatus;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SYNCPARAMMID_FIELD_ID:
      return isSetSyncParamMid();
    case CONTACTSTATUS_FIELD_ID:
      return isSetContactStatus();
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
          case SYNCPARAMMID_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.syncParamMid = new SyncParamMid();
              this.syncParamMid.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONTACTSTATUS_FIELD_ID:
            if (field.type == TType.I32) {
              this.contactStatus = iprot.readI32();
              this.__isset_contactStatus = true;
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
      if (this.syncParamMid != null) {
        oprot.writeFieldBegin(SYNC_PARAM_MID_FIELD_DESC);
        this.syncParamMid.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(CONTACT_STATUS_FIELD_DESC);
      oprot.writeI32(this.contactStatus);
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
    var ret : String = "SyncParamContact(";
    var first : Bool = true;

    ret += "syncParamMid:";
    if (this.syncParamMid == null) {
      ret += "null";
    } else {
      ret += this.syncParamMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "contactStatus:";
    var contactStatus_name : String = .ContactStatus.VALUES_TO_NAMES[this.contactStatus];
    if (contactStatus_name != null) {
      ret += contactStatus_name;
      ret += " (";
    }
    ret += this.contactStatus;
    if (contactStatus_name != null) {
      ret += ")";
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetContactStatus() && !.ContactStatus.VALID_VALUES.contains(contactStatus)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'contactStatus' has been assigned the invalid value " + contactStatus);
    }
  }

}

