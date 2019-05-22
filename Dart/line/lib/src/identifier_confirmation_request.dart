/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.identifier_confirmation_request;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class IdentifierConfirmationRequest implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("IdentifierConfirmationRequest");
  static final TField _META_DATA_FIELD_DESC = new TField("metaData", TType.MAP, 1);
  static final TField _FORCE_REGISTRATION_FIELD_DESC = new TField("forceRegistration", TType.BOOL, 2);
  static final TField _VERIFICATION_CODE_FIELD_DESC = new TField("verificationCode", TType.STRING, 3);

  Map<String, String> _metaData;
  static const int METADATA = 1;
  bool _forceRegistration = false;
  static const int FORCEREGISTRATION = 2;
  String _verificationCode;
  static const int VERIFICATIONCODE = 3;

  bool __isset_forceRegistration = false;

  IdentifierConfirmationRequest() {
  }

  // metaData
  Map<String, String> get metaData => this._metaData;

  set metaData(Map<String, String> metaData) {
    this._metaData = metaData;
  }

  bool isSetMetaData() => this.metaData != null;

  unsetMetaData() {
    this.metaData = null;
  }

  // forceRegistration
  bool get forceRegistration => this._forceRegistration;

  set forceRegistration(bool forceRegistration) {
    this._forceRegistration = forceRegistration;
    this.__isset_forceRegistration = true;
  }

  bool isSetForceRegistration() => this.__isset_forceRegistration;

  unsetForceRegistration() {
    this.__isset_forceRegistration = false;
  }

  // verificationCode
  String get verificationCode => this._verificationCode;

  set verificationCode(String verificationCode) {
    this._verificationCode = verificationCode;
  }

  bool isSetVerificationCode() => this.verificationCode != null;

  unsetVerificationCode() {
    this.verificationCode = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case METADATA:
        return this.metaData;
      case FORCEREGISTRATION:
        return this.forceRegistration;
      case VERIFICATIONCODE:
        return this.verificationCode;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case METADATA:
        if (value == null) {
          unsetMetaData();
        } else {
          this.metaData = value;
        }
        break;

      case FORCEREGISTRATION:
        if (value == null) {
          unsetForceRegistration();
        } else {
          this.forceRegistration = value;
        }
        break;

      case VERIFICATIONCODE:
        if (value == null) {
          unsetVerificationCode();
        } else {
          this.verificationCode = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case METADATA:
        return isSetMetaData();
      case FORCEREGISTRATION:
        return isSetForceRegistration();
      case VERIFICATIONCODE:
        return isSetVerificationCode();
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
        case METADATA:
          if (field.type == TType.MAP) {
            {
              TMap _map26 = iprot.readMapBegin();
              this.metaData = new Map<String, String>();
              for (int _i27 = 0; _i27 < _map26.length; ++_i27) {
                String _key28;
                String _val29;
                _key28 = iprot.readString();
                _val29 = iprot.readString();
                this.metaData[_key28] = _val29;
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FORCEREGISTRATION:
          if (field.type == TType.BOOL) {
            this.forceRegistration = iprot.readBool();
            this.__isset_forceRegistration = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case VERIFICATIONCODE:
          if (field.type == TType.STRING) {
            this.verificationCode = iprot.readString();
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
    if (this.metaData != null) {
      oprot.writeFieldBegin(_META_DATA_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.metaData.length));
        for (var elem31 in this.metaData.keys) {
          oprot.writeString(elem31);
          oprot.writeString(this.metaData[elem31]);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_FORCE_REGISTRATION_FIELD_DESC);
    oprot.writeBool(this.forceRegistration);
    oprot.writeFieldEnd();
    if (this.verificationCode != null) {
      oprot.writeFieldBegin(_VERIFICATION_CODE_FIELD_DESC);
      oprot.writeString(this.verificationCode);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("IdentifierConfirmationRequest(");

    ret.write("metaData:");
    if (this.metaData == null) {
      ret.write("null");
    } else {
      ret.write(this.metaData);
    }

    ret.write(", ");
    ret.write("forceRegistration:");
    ret.write(this.forceRegistration);

    ret.write(", ");
    ret.write("verificationCode:");
    if (this.verificationCode == null) {
      ret.write("null");
    } else {
      ret.write(this.verificationCode);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
