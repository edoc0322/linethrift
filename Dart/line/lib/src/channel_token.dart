/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.channel_token;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class ChannelToken implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("ChannelToken");
  static final TField _TOKEN_FIELD_DESC = new TField("token", TType.STRING, 1);
  static final TField _OBS_TOKEN_FIELD_DESC = new TField("obsToken", TType.STRING, 2);
  static final TField _EXPIRATION_FIELD_DESC = new TField("expiration", TType.I64, 3);
  static final TField _REFRESH_TOKEN_FIELD_DESC = new TField("refreshToken", TType.STRING, 4);
  static final TField _CHANNEL_ACCESS_TOKEN_FIELD_DESC = new TField("channelAccessToken", TType.STRING, 5);

  String _token;
  static const int TOKEN = 1;
  String _obsToken;
  static const int OBSTOKEN = 2;
  int _expiration = 0;
  static const int EXPIRATION = 3;
  String _refreshToken;
  static const int REFRESHTOKEN = 4;
  String _channelAccessToken;
  static const int CHANNELACCESSTOKEN = 5;

  bool __isset_expiration = false;

  ChannelToken() {
  }

  // token
  String get token => this._token;

  set token(String token) {
    this._token = token;
  }

  bool isSetToken() => this.token != null;

  unsetToken() {
    this.token = null;
  }

  // obsToken
  String get obsToken => this._obsToken;

  set obsToken(String obsToken) {
    this._obsToken = obsToken;
  }

  bool isSetObsToken() => this.obsToken != null;

  unsetObsToken() {
    this.obsToken = null;
  }

  // expiration
  int get expiration => this._expiration;

  set expiration(int expiration) {
    this._expiration = expiration;
    this.__isset_expiration = true;
  }

  bool isSetExpiration() => this.__isset_expiration;

  unsetExpiration() {
    this.__isset_expiration = false;
  }

  // refreshToken
  String get refreshToken => this._refreshToken;

  set refreshToken(String refreshToken) {
    this._refreshToken = refreshToken;
  }

  bool isSetRefreshToken() => this.refreshToken != null;

  unsetRefreshToken() {
    this.refreshToken = null;
  }

  // channelAccessToken
  String get channelAccessToken => this._channelAccessToken;

  set channelAccessToken(String channelAccessToken) {
    this._channelAccessToken = channelAccessToken;
  }

  bool isSetChannelAccessToken() => this.channelAccessToken != null;

  unsetChannelAccessToken() {
    this.channelAccessToken = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case TOKEN:
        return this.token;
      case OBSTOKEN:
        return this.obsToken;
      case EXPIRATION:
        return this.expiration;
      case REFRESHTOKEN:
        return this.refreshToken;
      case CHANNELACCESSTOKEN:
        return this.channelAccessToken;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case TOKEN:
        if (value == null) {
          unsetToken();
        } else {
          this.token = value;
        }
        break;

      case OBSTOKEN:
        if (value == null) {
          unsetObsToken();
        } else {
          this.obsToken = value;
        }
        break;

      case EXPIRATION:
        if (value == null) {
          unsetExpiration();
        } else {
          this.expiration = value;
        }
        break;

      case REFRESHTOKEN:
        if (value == null) {
          unsetRefreshToken();
        } else {
          this.refreshToken = value;
        }
        break;

      case CHANNELACCESSTOKEN:
        if (value == null) {
          unsetChannelAccessToken();
        } else {
          this.channelAccessToken = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case TOKEN:
        return isSetToken();
      case OBSTOKEN:
        return isSetObsToken();
      case EXPIRATION:
        return isSetExpiration();
      case REFRESHTOKEN:
        return isSetRefreshToken();
      case CHANNELACCESSTOKEN:
        return isSetChannelAccessToken();
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
        case TOKEN:
          if (field.type == TType.STRING) {
            this.token = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case OBSTOKEN:
          if (field.type == TType.STRING) {
            this.obsToken = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EXPIRATION:
          if (field.type == TType.I64) {
            this.expiration = iprot.readI64();
            this.__isset_expiration = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REFRESHTOKEN:
          if (field.type == TType.STRING) {
            this.refreshToken = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CHANNELACCESSTOKEN:
          if (field.type == TType.STRING) {
            this.channelAccessToken = iprot.readString();
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
    if (this.token != null) {
      oprot.writeFieldBegin(_TOKEN_FIELD_DESC);
      oprot.writeString(this.token);
      oprot.writeFieldEnd();
    }
    if (this.obsToken != null) {
      oprot.writeFieldBegin(_OBS_TOKEN_FIELD_DESC);
      oprot.writeString(this.obsToken);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_EXPIRATION_FIELD_DESC);
    oprot.writeI64(this.expiration);
    oprot.writeFieldEnd();
    if (this.refreshToken != null) {
      oprot.writeFieldBegin(_REFRESH_TOKEN_FIELD_DESC);
      oprot.writeString(this.refreshToken);
      oprot.writeFieldEnd();
    }
    if (this.channelAccessToken != null) {
      oprot.writeFieldBegin(_CHANNEL_ACCESS_TOKEN_FIELD_DESC);
      oprot.writeString(this.channelAccessToken);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("ChannelToken(");

    ret.write("token:");
    if (this.token == null) {
      ret.write("null");
    } else {
      ret.write(this.token);
    }

    ret.write(", ");
    ret.write("obsToken:");
    if (this.obsToken == null) {
      ret.write("null");
    } else {
      ret.write(this.obsToken);
    }

    ret.write(", ");
    ret.write("expiration:");
    ret.write(this.expiration);

    ret.write(", ");
    ret.write("refreshToken:");
    if (this.refreshToken == null) {
      ret.write("null");
    } else {
      ret.write(this.refreshToken);
    }

    ret.write(", ");
    ret.write("channelAccessToken:");
    if (this.channelAccessToken == null) {
      ret.write("null");
    } else {
      ret.write(this.channelAccessToken);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

