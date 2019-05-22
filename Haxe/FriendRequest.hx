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


class FriendRequest implements TBase {
  
  static var STRUCT_DESC = { new TStruct("FriendRequest"); };
  static var E_MID_FIELD_DESC = { new TField("eMid", TType.STRING, 1); };
  static var MID_FIELD_DESC = { new TField("mid", TType.STRING, 2); };
  static var DIRECTION_FIELD_DESC = { new TField("direction", TType.I32, 3); };
  static var METHOD_FIELD_DESC = { new TField("method", TType.I32, 4); };
  static var PARAM_FIELD_DESC = { new TField("param", TType.STRING, 5); };
  static var TIMESTAMP_FIELD_DESC = { new TField("timestamp", TType.I64, 6); };
  static var SEQ_ID_FIELD_DESC = { new TField("seqId", TType.I64, 7); };
  static var DISPLAY_NAME_FIELD_DESC = { new TField("displayName", TType.STRING, 10); };
  static var PICTURE_PATH_FIELD_DESC = { new TField("picturePath", TType.STRING, 11); };
  static var PICTURE_STATUS_FIELD_DESC = { new TField("pictureStatus", TType.STRING, 12); };

  @:isVar
  public var eMid(get,set) : String;
  @:isVar
  public var mid(get,set) : String;
  @:isVar
  public var direction(get,set) : Int;
  @:isVar
  public var method(get,set) : Int;
  @:isVar
  public var param(get,set) : String;
  @:isVar
  public var timestamp(get,set) : haxe.Int64;
  @:isVar
  public var seqId(get,set) : haxe.Int64;
  @:isVar
  public var displayName(get,set) : String;
  @:isVar
  public var picturePath(get,set) : String;
  @:isVar
  public var pictureStatus(get,set) : String;

  inline static var EMID_FIELD_ID : Int = 1;
  inline static var MID_FIELD_ID : Int = 2;
  inline static var DIRECTION_FIELD_ID : Int = 3;
  inline static var METHOD_FIELD_ID : Int = 4;
  inline static var PARAM_FIELD_ID : Int = 5;
  inline static var TIMESTAMP_FIELD_ID : Int = 6;
  inline static var SEQID_FIELD_ID : Int = 7;
  inline static var DISPLAYNAME_FIELD_ID : Int = 10;
  inline static var PICTUREPATH_FIELD_ID : Int = 11;
  inline static var PICTURESTATUS_FIELD_ID : Int = 12;

  private var __isset_direction : Bool = false;
  private var __isset_method : Bool = false;
  private var __isset_timestamp : Bool = false;
  private var __isset_seqId : Bool = false;

  public function new() {
  }

  public function get_eMid() : String {
    return this.eMid;
  }

  public function set_eMid(eMid:String) : String {
    this.eMid = eMid;
    return this.eMid;
  }

  public function unsetEMid() : Void {
    this.eMid = null;
  }

  // Returns true if field eMid is set (has been assigned a value) and false otherwise
  public function isSetEMid() : Bool {
    return this.eMid != null;
  }

  public function get_mid() : String {
    return this.mid;
  }

  public function set_mid(mid:String) : String {
    this.mid = mid;
    return this.mid;
  }

  public function unsetMid() : Void {
    this.mid = null;
  }

  // Returns true if field mid is set (has been assigned a value) and false otherwise
  public function isSetMid() : Bool {
    return this.mid != null;
  }

  public function get_direction() : Int {
    return this.direction;
  }

  public function set_direction(direction:Int) : Int {
    this.direction = direction;
    this.__isset_direction = true;
    return this.direction;
  }

  public function unsetDirection() : Void {
    this.__isset_direction = false;
  }

  // Returns true if field direction is set (has been assigned a value) and false otherwise
  public function isSetDirection() : Bool {
    return this.__isset_direction;
  }

  public function get_method() : Int {
    return this.method;
  }

  public function set_method(method:Int) : Int {
    this.method = method;
    this.__isset_method = true;
    return this.method;
  }

  public function unsetMethod() : Void {
    this.__isset_method = false;
  }

  // Returns true if field method is set (has been assigned a value) and false otherwise
  public function isSetMethod() : Bool {
    return this.__isset_method;
  }

  public function get_param() : String {
    return this.param;
  }

  public function set_param(param:String) : String {
    this.param = param;
    return this.param;
  }

  public function unsetParam() : Void {
    this.param = null;
  }

  // Returns true if field param is set (has been assigned a value) and false otherwise
  public function isSetParam() : Bool {
    return this.param != null;
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

  public function get_seqId() : haxe.Int64 {
    return this.seqId;
  }

  public function set_seqId(seqId:haxe.Int64) : haxe.Int64 {
    this.seqId = seqId;
    this.__isset_seqId = true;
    return this.seqId;
  }

  public function unsetSeqId() : Void {
    this.__isset_seqId = false;
  }

  // Returns true if field seqId is set (has been assigned a value) and false otherwise
  public function isSetSeqId() : Bool {
    return this.__isset_seqId;
  }

  public function get_displayName() : String {
    return this.displayName;
  }

  public function set_displayName(displayName:String) : String {
    this.displayName = displayName;
    return this.displayName;
  }

  public function unsetDisplayName() : Void {
    this.displayName = null;
  }

  // Returns true if field displayName is set (has been assigned a value) and false otherwise
  public function isSetDisplayName() : Bool {
    return this.displayName != null;
  }

  public function get_picturePath() : String {
    return this.picturePath;
  }

  public function set_picturePath(picturePath:String) : String {
    this.picturePath = picturePath;
    return this.picturePath;
  }

  public function unsetPicturePath() : Void {
    this.picturePath = null;
  }

  // Returns true if field picturePath is set (has been assigned a value) and false otherwise
  public function isSetPicturePath() : Bool {
    return this.picturePath != null;
  }

  public function get_pictureStatus() : String {
    return this.pictureStatus;
  }

  public function set_pictureStatus(pictureStatus:String) : String {
    this.pictureStatus = pictureStatus;
    return this.pictureStatus;
  }

  public function unsetPictureStatus() : Void {
    this.pictureStatus = null;
  }

  // Returns true if field pictureStatus is set (has been assigned a value) and false otherwise
  public function isSetPictureStatus() : Bool {
    return this.pictureStatus != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case EMID_FIELD_ID:
      if (value == null) {
        unsetEMid();
      } else {
        this.eMid = value;
      }

    case MID_FIELD_ID:
      if (value == null) {
        unsetMid();
      } else {
        this.mid = value;
      }

    case DIRECTION_FIELD_ID:
      if (value == null) {
        unsetDirection();
      } else {
        this.direction = value;
      }

    case METHOD_FIELD_ID:
      if (value == null) {
        unsetMethod();
      } else {
        this.method = value;
      }

    case PARAM_FIELD_ID:
      if (value == null) {
        unsetParam();
      } else {
        this.param = value;
      }

    case TIMESTAMP_FIELD_ID:
      if (value == null) {
        unsetTimestamp();
      } else {
        this.timestamp = value;
      }

    case SEQID_FIELD_ID:
      if (value == null) {
        unsetSeqId();
      } else {
        this.seqId = value;
      }

    case DISPLAYNAME_FIELD_ID:
      if (value == null) {
        unsetDisplayName();
      } else {
        this.displayName = value;
      }

    case PICTUREPATH_FIELD_ID:
      if (value == null) {
        unsetPicturePath();
      } else {
        this.picturePath = value;
      }

    case PICTURESTATUS_FIELD_ID:
      if (value == null) {
        unsetPictureStatus();
      } else {
        this.pictureStatus = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case EMID_FIELD_ID:
      return this.eMid;
    case MID_FIELD_ID:
      return this.mid;
    case DIRECTION_FIELD_ID:
      return this.direction;
    case METHOD_FIELD_ID:
      return this.method;
    case PARAM_FIELD_ID:
      return this.param;
    case TIMESTAMP_FIELD_ID:
      return this.timestamp;
    case SEQID_FIELD_ID:
      return this.seqId;
    case DISPLAYNAME_FIELD_ID:
      return this.displayName;
    case PICTUREPATH_FIELD_ID:
      return this.picturePath;
    case PICTURESTATUS_FIELD_ID:
      return this.pictureStatus;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case EMID_FIELD_ID:
      return isSetEMid();
    case MID_FIELD_ID:
      return isSetMid();
    case DIRECTION_FIELD_ID:
      return isSetDirection();
    case METHOD_FIELD_ID:
      return isSetMethod();
    case PARAM_FIELD_ID:
      return isSetParam();
    case TIMESTAMP_FIELD_ID:
      return isSetTimestamp();
    case SEQID_FIELD_ID:
      return isSetSeqId();
    case DISPLAYNAME_FIELD_ID:
      return isSetDisplayName();
    case PICTUREPATH_FIELD_ID:
      return isSetPicturePath();
    case PICTURESTATUS_FIELD_ID:
      return isSetPictureStatus();
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
          case EMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.eMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.mid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DIRECTION_FIELD_ID:
            if (field.type == TType.I32) {
              this.direction = iprot.readI32();
              this.__isset_direction = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case METHOD_FIELD_ID:
            if (field.type == TType.I32) {
              this.method = iprot.readI32();
              this.__isset_method = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PARAM_FIELD_ID:
            if (field.type == TType.STRING) {
              this.param = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TIMESTAMP_FIELD_ID:
            if (field.type == TType.I64) {
              this.timestamp = iprot.readI64();
              this.__isset_timestamp = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SEQID_FIELD_ID:
            if (field.type == TType.I64) {
              this.seqId = iprot.readI64();
              this.__isset_seqId = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DISPLAYNAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.displayName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PICTUREPATH_FIELD_ID:
            if (field.type == TType.STRING) {
              this.picturePath = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PICTURESTATUS_FIELD_ID:
            if (field.type == TType.STRING) {
              this.pictureStatus = iprot.readString();
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
      if (this.eMid != null) {
        oprot.writeFieldBegin(E_MID_FIELD_DESC);
        oprot.writeString(this.eMid);
        oprot.writeFieldEnd();
      }
      if (this.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(this.mid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(DIRECTION_FIELD_DESC);
      oprot.writeI32(this.direction);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(METHOD_FIELD_DESC);
      oprot.writeI32(this.method);
      oprot.writeFieldEnd();
      if (this.param != null) {
        oprot.writeFieldBegin(PARAM_FIELD_DESC);
        oprot.writeString(this.param);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(this.timestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SEQ_ID_FIELD_DESC);
      oprot.writeI64(this.seqId);
      oprot.writeFieldEnd();
      if (this.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(this.displayName);
        oprot.writeFieldEnd();
      }
      if (this.picturePath != null) {
        oprot.writeFieldBegin(PICTURE_PATH_FIELD_DESC);
        oprot.writeString(this.picturePath);
        oprot.writeFieldEnd();
      }
      if (this.pictureStatus != null) {
        oprot.writeFieldBegin(PICTURE_STATUS_FIELD_DESC);
        oprot.writeString(this.pictureStatus);
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
    var ret : String = "FriendRequest(";
    var first : Bool = true;

    ret += "eMid:";
    if (this.eMid == null) {
      ret += "null";
    } else {
      ret += this.eMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "mid:";
    if (this.mid == null) {
      ret += "null";
    } else {
      ret += this.mid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "direction:";
    var direction_name : String = .FriendRequestDirection.VALUES_TO_NAMES[this.direction];
    if (direction_name != null) {
      ret += direction_name;
      ret += " (";
    }
    ret += this.direction;
    if (direction_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "method:";
    var method_name : String = .FriendRequestMethod.VALUES_TO_NAMES[this.method];
    if (method_name != null) {
      ret += method_name;
      ret += " (";
    }
    ret += this.method;
    if (method_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "param:";
    if (this.param == null) {
      ret += "null";
    } else {
      ret += this.param;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "timestamp:";
    ret += this.timestamp;
    first = false;
    if (!first) ret +=  ", ";
    ret += "seqId:";
    ret += this.seqId;
    first = false;
    if (!first) ret +=  ", ";
    ret += "displayName:";
    if (this.displayName == null) {
      ret += "null";
    } else {
      ret += this.displayName;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "picturePath:";
    if (this.picturePath == null) {
      ret += "null";
    } else {
      ret += this.picturePath;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "pictureStatus:";
    if (this.pictureStatus == null) {
      ret += "null";
    } else {
      ret += this.pictureStatus;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetDirection() && !.FriendRequestDirection.VALID_VALUES.contains(direction)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'direction' has been assigned the invalid value " + direction);
    }
    if (isSetMethod() && !.FriendRequestMethod.VALID_VALUES.contains(method)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'method' has been assigned the invalid value " + method);
    }
  }

}

