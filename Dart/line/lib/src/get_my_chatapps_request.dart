/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.get_my_chatapps_request;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class GetMyChatappsRequest implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("GetMyChatappsRequest");
  static final TField _LANGUAGE_FIELD_DESC = new TField("language", TType.STRING, 1);
  static final TField _CONTINUATION_TOKEN_FIELD_DESC = new TField("continuationToken", TType.STRING, 2);

  String _language;
  static const int LANGUAGE = 1;
  String _continuationToken;
  static const int CONTINUATIONTOKEN = 2;


  GetMyChatappsRequest() {
  }

  // language
  String get language => this._language;

  set language(String language) {
    this._language = language;
  }

  bool isSetLanguage() => this.language != null;

  unsetLanguage() {
    this.language = null;
  }

  // continuationToken
  String get continuationToken => this._continuationToken;

  set continuationToken(String continuationToken) {
    this._continuationToken = continuationToken;
  }

  bool isSetContinuationToken() => this.continuationToken != null;

  unsetContinuationToken() {
    this.continuationToken = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case LANGUAGE:
        return this.language;
      case CONTINUATIONTOKEN:
        return this.continuationToken;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case LANGUAGE:
        if (value == null) {
          unsetLanguage();
        } else {
          this.language = value;
        }
        break;

      case CONTINUATIONTOKEN:
        if (value == null) {
          unsetContinuationToken();
        } else {
          this.continuationToken = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case LANGUAGE:
        return isSetLanguage();
      case CONTINUATIONTOKEN:
        return isSetContinuationToken();
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
        case LANGUAGE:
          if (field.type == TType.STRING) {
            this.language = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CONTINUATIONTOKEN:
          if (field.type == TType.STRING) {
            this.continuationToken = iprot.readString();
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
    if (this.language != null) {
      oprot.writeFieldBegin(_LANGUAGE_FIELD_DESC);
      oprot.writeString(this.language);
      oprot.writeFieldEnd();
    }
    if (this.continuationToken != null) {
      oprot.writeFieldBegin(_CONTINUATION_TOKEN_FIELD_DESC);
      oprot.writeString(this.continuationToken);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("GetMyChatappsRequest(");

    ret.write("language:");
    if (this.language == null) {
      ret.write("null");
    } else {
      ret.write(this.language);
    }

    ret.write(", ");
    ret.write("continuationToken:");
    if (this.continuationToken == null) {
      ret.write("null");
    } else {
      ret.write(this.continuationToken);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

