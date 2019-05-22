/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.room;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class Room implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("Room");
  static final TField _MID_FIELD_DESC = new TField("mid", TType.STRING, 1);
  static final TField _CREATED_TIME_FIELD_DESC = new TField("createdTime", TType.I64, 2);
  static final TField _CONTACTS_FIELD_DESC = new TField("contacts", TType.LIST, 10);
  static final TField _NOTIFICATION_DISABLED_FIELD_DESC = new TField("notificationDisabled", TType.BOOL, 31);
  static final TField _MEMBER_MIDS_FIELD_DESC = new TField("memberMids", TType.LIST, 40);

  String _mid;
  static const int MID = 1;
  int _createdTime = 0;
  static const int CREATEDTIME = 2;
  List<Contact> _contacts;
  static const int CONTACTS = 10;
  bool _notificationDisabled = false;
  static const int NOTIFICATIONDISABLED = 31;
  List<String> _memberMids;
  static const int MEMBERMIDS = 40;

  bool __isset_createdTime = false;
  bool __isset_notificationDisabled = false;

  Room() {
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

  // contacts
  List<Contact> get contacts => this._contacts;

  set contacts(List<Contact> contacts) {
    this._contacts = contacts;
  }

  bool isSetContacts() => this.contacts != null;

  unsetContacts() {
    this.contacts = null;
  }

  // notificationDisabled
  bool get notificationDisabled => this._notificationDisabled;

  set notificationDisabled(bool notificationDisabled) {
    this._notificationDisabled = notificationDisabled;
    this.__isset_notificationDisabled = true;
  }

  bool isSetNotificationDisabled() => this.__isset_notificationDisabled;

  unsetNotificationDisabled() {
    this.__isset_notificationDisabled = false;
  }

  // memberMids
  List<String> get memberMids => this._memberMids;

  set memberMids(List<String> memberMids) {
    this._memberMids = memberMids;
  }

  bool isSetMemberMids() => this.memberMids != null;

  unsetMemberMids() {
    this.memberMids = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case MID:
        return this.mid;
      case CREATEDTIME:
        return this.createdTime;
      case CONTACTS:
        return this.contacts;
      case NOTIFICATIONDISABLED:
        return this.notificationDisabled;
      case MEMBERMIDS:
        return this.memberMids;
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

      case CONTACTS:
        if (value == null) {
          unsetContacts();
        } else {
          this.contacts = value;
        }
        break;

      case NOTIFICATIONDISABLED:
        if (value == null) {
          unsetNotificationDisabled();
        } else {
          this.notificationDisabled = value;
        }
        break;

      case MEMBERMIDS:
        if (value == null) {
          unsetMemberMids();
        } else {
          this.memberMids = value;
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
      case CONTACTS:
        return isSetContacts();
      case NOTIFICATIONDISABLED:
        return isSetNotificationDisabled();
      case MEMBERMIDS:
        return isSetMemberMids();
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
        case CONTACTS:
          if (field.type == TType.LIST) {
            {
              TList _list322 = iprot.readListBegin();
              this.contacts = new List<Contact>();
              for (int _i323 = 0; _i323 < _list322.length; ++_i323) {
                Contact _elem324;
                _elem324 = new Contact();
                _elem324.read(iprot);
                this.contacts.add(_elem324);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NOTIFICATIONDISABLED:
          if (field.type == TType.BOOL) {
            this.notificationDisabled = iprot.readBool();
            this.__isset_notificationDisabled = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MEMBERMIDS:
          if (field.type == TType.LIST) {
            {
              TList _list325 = iprot.readListBegin();
              this.memberMids = new List<String>();
              for (int _i326 = 0; _i326 < _list325.length; ++_i326) {
                String _elem327;
                _elem327 = iprot.readString();
                this.memberMids.add(_elem327);
              }
              iprot.readListEnd();
            }
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
    if (this.contacts != null) {
      oprot.writeFieldBegin(_CONTACTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.contacts.length));
        for (var elem328 in this.contacts) {
          elem328.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_NOTIFICATION_DISABLED_FIELD_DESC);
    oprot.writeBool(this.notificationDisabled);
    oprot.writeFieldEnd();
    if (this.memberMids != null) {
      oprot.writeFieldBegin(_MEMBER_MIDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.memberMids.length));
        for (var elem329 in this.memberMids) {
          oprot.writeString(elem329);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("Room(");

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
    ret.write("contacts:");
    if (this.contacts == null) {
      ret.write("null");
    } else {
      ret.write(this.contacts);
    }

    ret.write(", ");
    ret.write("notificationDisabled:");
    ret.write(this.notificationDisabled);

    ret.write(", ");
    ret.write("memberMids:");
    if (this.memberMids == null) {
      ret.write("null");
    } else {
      ret.write(this.memberMids);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

