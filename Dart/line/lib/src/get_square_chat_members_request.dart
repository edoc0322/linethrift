/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.get_square_chat_members_request;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class GetSquareChatMembersRequest implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("GetSquareChatMembersRequest");
  static final TField _SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, 1);
  static final TField _CONTINUATION_TOKEN_FIELD_DESC = new TField("continuationToken", TType.STRING, 2);
  static final TField _LIMIT_FIELD_DESC = new TField("limit", TType.I32, 3);

  String _squareChatMid;
  static const int SQUARECHATMID = 1;
  String _continuationToken;
  static const int CONTINUATIONTOKEN = 2;
  int _limit = 0;
  static const int LIMIT = 3;

  bool __isset_limit = false;

  GetSquareChatMembersRequest() {
  }

  // squareChatMid
  String get squareChatMid => this._squareChatMid;

  set squareChatMid(String squareChatMid) {
    this._squareChatMid = squareChatMid;
  }

  bool isSetSquareChatMid() => this.squareChatMid != null;

  unsetSquareChatMid() {
    this.squareChatMid = null;
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

  // limit
  int get limit => this._limit;

  set limit(int limit) {
    this._limit = limit;
    this.__isset_limit = true;
  }

  bool isSetLimit() => this.__isset_limit;

  unsetLimit() {
    this.__isset_limit = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUARECHATMID:
        return this.squareChatMid;
      case CONTINUATIONTOKEN:
        return this.continuationToken;
      case LIMIT:
        return this.limit;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUARECHATMID:
        if (value == null) {
          unsetSquareChatMid();
        } else {
          this.squareChatMid = value;
        }
        break;

      case CONTINUATIONTOKEN:
        if (value == null) {
          unsetContinuationToken();
        } else {
          this.continuationToken = value;
        }
        break;

      case LIMIT:
        if (value == null) {
          unsetLimit();
        } else {
          this.limit = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUARECHATMID:
        return isSetSquareChatMid();
      case CONTINUATIONTOKEN:
        return isSetContinuationToken();
      case LIMIT:
        return isSetLimit();
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
        case SQUARECHATMID:
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
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
        case LIMIT:
          if (field.type == TType.I32) {
            this.limit = iprot.readI32();
            this.__isset_limit = true;
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
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(_SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    if (this.continuationToken != null) {
      oprot.writeFieldBegin(_CONTINUATION_TOKEN_FIELD_DESC);
      oprot.writeString(this.continuationToken);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_LIMIT_FIELD_DESC);
    oprot.writeI32(this.limit);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("GetSquareChatMembersRequest(");

    ret.write("squareChatMid:");
    if (this.squareChatMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareChatMid);
    }

    ret.write(", ");
    ret.write("continuationToken:");
    if (this.continuationToken == null) {
      ret.write("null");
    } else {
      ret.write(this.continuationToken);
    }

    ret.write(", ");
    ret.write("limit:");
    ret.write(this.limit);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

