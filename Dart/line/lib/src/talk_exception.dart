/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.talk_exception;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class TalkException extends Error implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("TalkException");
  static final TField _CODE_FIELD_DESC = new TField("code", TType.I32, 1);
  static final TField _REASON_FIELD_DESC = new TField("reason", TType.STRING, 2);
  static final TField _PARAMETER_MAP_FIELD_DESC = new TField("parameterMap", TType.MAP, 3);

  int _code;
  static const int CODE = 1;
  String _reason;
  static const int REASON = 2;
  Map<String, String> _parameterMap;
  static const int PARAMETERMAP = 3;

  bool __isset_code = false;

  TalkException() {
  }

  // code
  int get code => this._code;

  set code(int code) {
    this._code = code;
    this.__isset_code = true;
  }

  bool isSetCode() => this.__isset_code;

  unsetCode() {
    this.__isset_code = false;
  }

  // reason
  String get reason => this._reason;

  set reason(String reason) {
    this._reason = reason;
  }

  bool isSetReason() => this.reason != null;

  unsetReason() {
    this.reason = null;
  }

  // parameterMap
  Map<String, String> get parameterMap => this._parameterMap;

  set parameterMap(Map<String, String> parameterMap) {
    this._parameterMap = parameterMap;
  }

  bool isSetParameterMap() => this.parameterMap != null;

  unsetParameterMap() {
    this.parameterMap = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CODE:
        return this.code;
      case REASON:
        return this.reason;
      case PARAMETERMAP:
        return this.parameterMap;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case CODE:
        if (value == null) {
          unsetCode();
        } else {
          this.code = value;
        }
        break;

      case REASON:
        if (value == null) {
          unsetReason();
        } else {
          this.reason = value;
        }
        break;

      case PARAMETERMAP:
        if (value == null) {
          unsetParameterMap();
        } else {
          this.parameterMap = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case CODE:
        return isSetCode();
      case REASON:
        return isSetReason();
      case PARAMETERMAP:
        return isSetParameterMap();
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
        case CODE:
          if (field.type == TType.I32) {
            this.code = iprot.readI32();
            this.__isset_code = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REASON:
          if (field.type == TType.STRING) {
            this.reason = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PARAMETERMAP:
          if (field.type == TType.MAP) {
            {
              TMap _map638 = iprot.readMapBegin();
              this.parameterMap = new Map<String, String>();
              for (int _i639 = 0; _i639 < _map638.length; ++_i639) {
                String _key640;
                String _val641;
                _key640 = iprot.readString();
                _val641 = iprot.readString();
                this.parameterMap[_key640] = _val641;
              }
              iprot.readMapEnd();
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
    oprot.writeFieldBegin(_CODE_FIELD_DESC);
    oprot.writeI32(this.code);
    oprot.writeFieldEnd();
    if (this.reason != null) {
      oprot.writeFieldBegin(_REASON_FIELD_DESC);
      oprot.writeString(this.reason);
      oprot.writeFieldEnd();
    }
    if (this.parameterMap != null) {
      oprot.writeFieldBegin(_PARAMETER_MAP_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.parameterMap.length));
        for (var elem643 in this.parameterMap.keys) {
          oprot.writeString(elem643);
          oprot.writeString(this.parameterMap[elem643]);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("TalkException(");

    ret.write("code:");
    String code_name = ErrorCode.VALUES_TO_NAMES[this.code];
    if (code_name != null) {
      ret.write(code_name);
      ret.write(" (");
    }
    ret.write(this.code);
    if (code_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("reason:");
    if (this.reason == null) {
      ret.write("null");
    } else {
      ret.write(this.reason);
    }

    ret.write(", ");
    ret.write("parameterMap:");
    if (this.parameterMap == null) {
      ret.write("null");
    } else {
      ret.write(this.parameterMap);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCode() && !ErrorCode.VALID_VALUES.contains(code)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'code' has been assigned the invalid value $code");
    }
  }

}

