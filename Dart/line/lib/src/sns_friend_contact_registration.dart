/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.sns_friend_contact_registration;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SnsFriendContactRegistration implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SnsFriendContactRegistration");
  static final TField _CONTACT_FIELD_DESC = new TField("contact", TType.STRUCT, 1);
  static final TField _SNS_ID_TYPE_FIELD_DESC = new TField("snsIdType", TType.I32, 2);
  static final TField _SNS_USER_ID_FIELD_DESC = new TField("snsUserId", TType.STRING, 3);

  Contact _contact;
  static const int CONTACT = 1;
  int _snsIdType;
  static const int SNSIDTYPE = 2;
  String _snsUserId;
  static const int SNSUSERID = 3;

  bool __isset_snsIdType = false;

  SnsFriendContactRegistration() {
  }

  // contact
  Contact get contact => this._contact;

  set contact(Contact contact) {
    this._contact = contact;
  }

  bool isSetContact() => this.contact != null;

  unsetContact() {
    this.contact = null;
  }

  // snsIdType
  int get snsIdType => this._snsIdType;

  set snsIdType(int snsIdType) {
    this._snsIdType = snsIdType;
    this.__isset_snsIdType = true;
  }

  bool isSetSnsIdType() => this.__isset_snsIdType;

  unsetSnsIdType() {
    this.__isset_snsIdType = false;
  }

  // snsUserId
  String get snsUserId => this._snsUserId;

  set snsUserId(String snsUserId) {
    this._snsUserId = snsUserId;
  }

  bool isSetSnsUserId() => this.snsUserId != null;

  unsetSnsUserId() {
    this.snsUserId = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CONTACT:
        return this.contact;
      case SNSIDTYPE:
        return this.snsIdType;
      case SNSUSERID:
        return this.snsUserId;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case CONTACT:
        if (value == null) {
          unsetContact();
        } else {
          this.contact = value;
        }
        break;

      case SNSIDTYPE:
        if (value == null) {
          unsetSnsIdType();
        } else {
          this.snsIdType = value;
        }
        break;

      case SNSUSERID:
        if (value == null) {
          unsetSnsUserId();
        } else {
          this.snsUserId = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case CONTACT:
        return isSetContact();
      case SNSIDTYPE:
        return isSetSnsIdType();
      case SNSUSERID:
        return isSetSnsUserId();
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
        case CONTACT:
          if (field.type == TType.STRUCT) {
            this.contact = new Contact();
            this.contact.read(iprot);
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SNSIDTYPE:
          if (field.type == TType.I32) {
            this.snsIdType = iprot.readI32();
            this.__isset_snsIdType = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SNSUSERID:
          if (field.type == TType.STRING) {
            this.snsUserId = iprot.readString();
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
    if (this.contact != null) {
      oprot.writeFieldBegin(_CONTACT_FIELD_DESC);
      this.contact.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_SNS_ID_TYPE_FIELD_DESC);
    oprot.writeI32(this.snsIdType);
    oprot.writeFieldEnd();
    if (this.snsUserId != null) {
      oprot.writeFieldBegin(_SNS_USER_ID_FIELD_DESC);
      oprot.writeString(this.snsUserId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SnsFriendContactRegistration(");

    ret.write("contact:");
    if (this.contact == null) {
      ret.write("null");
    } else {
      ret.write(this.contact);
    }

    ret.write(", ");
    ret.write("snsIdType:");
    String snsIdType_name = SnsIdType.VALUES_TO_NAMES[this.snsIdType];
    if (snsIdType_name != null) {
      ret.write(snsIdType_name);
      ret.write(" (");
    }
    ret.write(this.snsIdType);
    if (snsIdType_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("snsUserId:");
    if (this.snsUserId == null) {
      ret.write("null");
    } else {
      ret.write(this.snsUserId);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetSnsIdType() && !SnsIdType.VALID_VALUES.contains(snsIdType)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'snsIdType' has been assigned the invalid value $snsIdType");
    }
  }

}

