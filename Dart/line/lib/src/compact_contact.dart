/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.compact_contact;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class CompactContact implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("CompactContact");
  static final TField _MID_FIELD_DESC = new TField("mid", TType.STRING, 1);
  static final TField _CREATED_TIME_FIELD_DESC = new TField("createdTime", TType.I64, 2);
  static final TField _MODIFIED_TIME_FIELD_DESC = new TField("modifiedTime", TType.I64, 3);
  static final TField _STATUS_FIELD_DESC = new TField("status", TType.I32, 4);
  static final TField _SETTINGS_FIELD_DESC = new TField("settings", TType.I64, 5);
  static final TField _DISPLAY_NAME_OVERRIDDEN_FIELD_DESC = new TField("displayNameOverridden", TType.STRING, 6);

  String _mid;
  static const int MID = 1;
  int _createdTime = 0;
  static const int CREATEDTIME = 2;
  int _modifiedTime = 0;
  static const int MODIFIEDTIME = 3;
  int _status;
  static const int STATUS = 4;
  int _settings = 0;
  static const int SETTINGS = 5;
  String _displayNameOverridden;
  static const int DISPLAYNAMEOVERRIDDEN = 6;

  bool __isset_createdTime = false;
  bool __isset_modifiedTime = false;
  bool __isset_status = false;
  bool __isset_settings = false;

  CompactContact() {
  }

  // mid
  String get mid => this._mid;

  set mid(String mid) {
    this._mid = mid;
  }

  bool isSetMid() => this.mid != null;

  unsetMid() {
    this.mid = null;
  }

  // createdTime
  int get createdTime => this._createdTime;

  set createdTime(int createdTime) {
    this._createdTime = createdTime;
    this.__isset_createdTime = true;
  }

  bool isSetCreatedTime() => this.__isset_createdTime;

  unsetCreatedTime() {
    this.__isset_createdTime = false;
  }

  // modifiedTime
  int get modifiedTime => this._modifiedTime;

  set modifiedTime(int modifiedTime) {
    this._modifiedTime = modifiedTime;
    this.__isset_modifiedTime = true;
  }

  bool isSetModifiedTime() => this.__isset_modifiedTime;

  unsetModifiedTime() {
    this.__isset_modifiedTime = false;
  }

  // status
  int get status => this._status;

  set status(int status) {
    this._status = status;
    this.__isset_status = true;
  }

  bool isSetStatus() => this.__isset_status;

  unsetStatus() {
    this.__isset_status = false;
  }

  // settings
  int get settings => this._settings;

  set settings(int settings) {
    this._settings = settings;
    this.__isset_settings = true;
  }

  bool isSetSettings() => this.__isset_settings;

  unsetSettings() {
    this.__isset_settings = false;
  }

  // displayNameOverridden
  String get displayNameOverridden => this._displayNameOverridden;

  set displayNameOverridden(String displayNameOverridden) {
    this._displayNameOverridden = displayNameOverridden;
  }

  bool isSetDisplayNameOverridden() => this.displayNameOverridden != null;

  unsetDisplayNameOverridden() {
    this.displayNameOverridden = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case MID:
        return this.mid;
      case CREATEDTIME:
        return this.createdTime;
      case MODIFIEDTIME:
        return this.modifiedTime;
      case STATUS:
        return this.status;
      case SETTINGS:
        return this.settings;
      case DISPLAYNAMEOVERRIDDEN:
        return this.displayNameOverridden;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case MID:
        if (value == null) {
          unsetMid();
        } else {
          this.mid = value;
        }
        break;

      case CREATEDTIME:
        if (value == null) {
          unsetCreatedTime();
        } else {
          this.createdTime = value;
        }
        break;

      case MODIFIEDTIME:
        if (value == null) {
          unsetModifiedTime();
        } else {
          this.modifiedTime = value;
        }
        break;

      case STATUS:
        if (value == null) {
          unsetStatus();
        } else {
          this.status = value;
        }
        break;

      case SETTINGS:
        if (value == null) {
          unsetSettings();
        } else {
          this.settings = value;
        }
        break;

      case DISPLAYNAMEOVERRIDDEN:
        if (value == null) {
          unsetDisplayNameOverridden();
        } else {
          this.displayNameOverridden = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case MID:
        return isSetMid();
      case CREATEDTIME:
        return isSetCreatedTime();
      case MODIFIEDTIME:
        return isSetModifiedTime();
      case STATUS:
        return isSetStatus();
      case SETTINGS:
        return isSetSettings();
      case DISPLAYNAMEOVERRIDDEN:
        return isSetDisplayNameOverridden();
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  read(TProtocol iprot) {
    TField field;
    iprot.readStructBegin();
    while (true) {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) {
        break;
      }
      switch (field.id) {
        case MID:
          if (field.type == TType.STRING) {
            this.mid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CREATEDTIME:
          if (field.type == TType.I64) {
            this.createdTime = iprot.readI64();
            this.__isset_createdTime = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MODIFIEDTIME:
          if (field.type == TType.I64) {
            this.modifiedTime = iprot.readI64();
            this.__isset_modifiedTime = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case STATUS:
          if (field.type == TType.I32) {
            this.status = iprot.readI32();
            this.__isset_status = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SETTINGS:
          if (field.type == TType.I64) {
            this.settings = iprot.readI64();
            this.__isset_settings = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DISPLAYNAMEOVERRIDDEN:
          if (field.type == TType.STRING) {
            this.displayNameOverridden = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  write(TProtocol oprot) {
    validate();

    oprot.writeStructBegin(_STRUCT_DESC);
    if (this.mid != null) {
      oprot.writeFieldBegin(_MID_FIELD_DESC);
      oprot.writeString(this.mid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_CREATED_TIME_FIELD_DESC);
    oprot.writeI64(this.createdTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_MODIFIED_TIME_FIELD_DESC);
    oprot.writeI64(this.modifiedTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_STATUS_FIELD_DESC);
    oprot.writeI32(this.status);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_SETTINGS_FIELD_DESC);
    oprot.writeI64(this.settings);
    oprot.writeFieldEnd();
    if (this.displayNameOverridden != null) {
      oprot.writeFieldBegin(_DISPLAY_NAME_OVERRIDDEN_FIELD_DESC);
      oprot.writeString(this.displayNameOverridden);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("CompactContact(");

    ret.write("mid:");
    if (this.mid == null) {
      ret.write("null");
    } else {
      ret.write(this.mid);
    }

    ret.write(", ");
    ret.write("createdTime:");
    ret.write(this.createdTime);

    ret.write(", ");
    ret.write("modifiedTime:");
    ret.write(this.modifiedTime);

    ret.write(", ");
    ret.write("status:");
    String status_name = ContactStatus.VALUES_TO_NAMES[this.status];
    if (status_name != null) {
      ret.write(status_name);
      ret.write(" (");
    }
    ret.write(this.status);
    if (status_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("settings:");
    ret.write(this.settings);

    ret.write(", ");
    ret.write("displayNameOverridden:");
    if (this.displayNameOverridden == null) {
      ret.write("null");
    } else {
      ret.write(this.displayNameOverridden);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetStatus() && !ContactStatus.VALID_VALUES.contains(status)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'status' has been assigned the invalid value $status");
    }
  }

}

