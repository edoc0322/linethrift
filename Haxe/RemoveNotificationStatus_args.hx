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


class RemoveNotificationStatus_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("removeNotificationStatus_args"); };
  static var NOTIFICATION_STATUS_FIELD_DESC = { new TField("notificationStatus", TType.I32, 2); };

  @:isVar
  public var notificationStatus(get,set) : Int;

  inline static var NOTIFICATIONSTATUS_FIELD_ID : Int = 2;

  private var __isset_notificationStatus : Bool = false;

  public function new() {
  }

  public function get_notificationStatus() : Int {
    return this.notificationStatus;
  }

  public function set_notificationStatus(notificationStatus:Int) : Int {
    this.notificationStatus = notificationStatus;
    this.__isset_notificationStatus = true;
    return this.notificationStatus;
  }

  public function unsetNotificationStatus() : Void {
    this.__isset_notificationStatus = false;
  }

  // Returns true if field notificationStatus is set (has been assigned a value) and false otherwise
  public function isSetNotificationStatus() : Bool {
    return this.__isset_notificationStatus;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case NOTIFICATIONSTATUS_FIELD_ID:
      if (value == null) {
        unsetNotificationStatus();
      } else {
        this.notificationStatus = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case NOTIFICATIONSTATUS_FIELD_ID:
      return this.notificationStatus;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case NOTIFICATIONSTATUS_FIELD_ID:
      return isSetNotificationStatus();
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
          case NOTIFICATIONSTATUS_FIELD_ID:
            if (field.type == TType.I32) {
              this.notificationStatus = iprot.readI32();
              this.__isset_notificationStatus = true;
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
      oprot.writeFieldBegin(NOTIFICATION_STATUS_FIELD_DESC);
      oprot.writeI32(this.notificationStatus);
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
    var ret : String = "removeNotificationStatus_args(";
    var first : Bool = true;

    ret += "notificationStatus:";
    var notificationStatus_name : String = .NotificationStatus.VALUES_TO_NAMES[this.notificationStatus];
    if (notificationStatus_name != null) {
      ret += notificationStatus_name;
      ret += " (";
    }
    ret += this.notificationStatus;
    if (notificationStatus_name != null) {
      ret += ")";
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetNotificationStatus() && !.NotificationStatus.VALID_VALUES.contains(notificationStatus)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'notificationStatus' has been assigned the invalid value " + notificationStatus);
    }
  }

}

