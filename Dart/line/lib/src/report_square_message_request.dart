/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.report_square_message_request;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class ReportSquareMessageRequest implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("ReportSquareMessageRequest");
  static final TField _SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, 2);
  static final TField _SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, 3);
  static final TField _SQUARE_MESSAGE_ID_FIELD_DESC = new TField("squareMessageId", TType.STRING, 4);
  static final TField _REPORT_TYPE_FIELD_DESC = new TField("reportType", TType.I32, 5);
  static final TField _OTHER_REASON_FIELD_DESC = new TField("otherReason", TType.STRING, 6);

  String _squareMid;
  static const int SQUAREMID = 2;
  String _squareChatMid;
  static const int SQUARECHATMID = 3;
  String _squareMessageId;
  static const int SQUAREMESSAGEID = 4;
  int _reportType;
  static const int REPORTTYPE = 5;
  String _otherReason;
  static const int OTHERREASON = 6;

  bool __isset_reportType = false;

  ReportSquareMessageRequest() {
  }

  // squareMid
  String get squareMid => this._squareMid;

  set squareMid(String squareMid) {
    this._squareMid = squareMid;
  }

  bool isSetSquareMid() => this.squareMid != null;

  unsetSquareMid() {
    this.squareMid = null;
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

  // squareMessageId
  String get squareMessageId => this._squareMessageId;

  set squareMessageId(String squareMessageId) {
    this._squareMessageId = squareMessageId;
  }

  bool isSetSquareMessageId() => this.squareMessageId != null;

  unsetSquareMessageId() {
    this.squareMessageId = null;
  }

  // reportType
  int get reportType => this._reportType;

  set reportType(int reportType) {
    this._reportType = reportType;
    this.__isset_reportType = true;
  }

  bool isSetReportType() => this.__isset_reportType;

  unsetReportType() {
    this.__isset_reportType = false;
  }

  // otherReason
  String get otherReason => this._otherReason;

  set otherReason(String otherReason) {
    this._otherReason = otherReason;
  }

  bool isSetOtherReason() => this.otherReason != null;

  unsetOtherReason() {
    this.otherReason = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUAREMID:
        return this.squareMid;
      case SQUARECHATMID:
        return this.squareChatMid;
      case SQUAREMESSAGEID:
        return this.squareMessageId;
      case REPORTTYPE:
        return this.reportType;
      case OTHERREASON:
        return this.otherReason;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUAREMID:
        if (value == null) {
          unsetSquareMid();
        } else {
          this.squareMid = value;
        }
        break;

      case SQUARECHATMID:
        if (value == null) {
          unsetSquareChatMid();
        } else {
          this.squareChatMid = value;
        }
        break;

      case SQUAREMESSAGEID:
        if (value == null) {
          unsetSquareMessageId();
        } else {
          this.squareMessageId = value;
        }
        break;

      case REPORTTYPE:
        if (value == null) {
          unsetReportType();
        } else {
          this.reportType = value;
        }
        break;

      case OTHERREASON:
        if (value == null) {
          unsetOtherReason();
        } else {
          this.otherReason = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUAREMID:
        return isSetSquareMid();
      case SQUARECHATMID:
        return isSetSquareChatMid();
      case SQUAREMESSAGEID:
        return isSetSquareMessageId();
      case REPORTTYPE:
        return isSetReportType();
      case OTHERREASON:
        return isSetOtherReason();
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
        case SQUAREMID:
          if (field.type == TType.STRING) {
            this.squareMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQUARECHATMID:
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQUAREMESSAGEID:
          if (field.type == TType.STRING) {
            this.squareMessageId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REPORTTYPE:
          if (field.type == TType.I32) {
            this.reportType = iprot.readI32();
            this.__isset_reportType = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case OTHERREASON:
          if (field.type == TType.STRING) {
            this.otherReason = iprot.readString();
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
    if (this.squareMid != null) {
      oprot.writeFieldBegin(_SQUARE_MID_FIELD_DESC);
      oprot.writeString(this.squareMid);
      oprot.writeFieldEnd();
    }
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(_SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    if (this.squareMessageId != null) {
      oprot.writeFieldBegin(_SQUARE_MESSAGE_ID_FIELD_DESC);
      oprot.writeString(this.squareMessageId);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_REPORT_TYPE_FIELD_DESC);
    oprot.writeI32(this.reportType);
    oprot.writeFieldEnd();
    if (this.otherReason != null) {
      oprot.writeFieldBegin(_OTHER_REASON_FIELD_DESC);
      oprot.writeString(this.otherReason);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("ReportSquareMessageRequest(");

    ret.write("squareMid:");
    if (this.squareMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMid);
    }

    ret.write(", ");
    ret.write("squareChatMid:");
    if (this.squareChatMid == null) {
      ret.write("null");
    } else {
      ret.write(this.squareChatMid);
    }

    ret.write(", ");
    ret.write("squareMessageId:");
    if (this.squareMessageId == null) {
      ret.write("null");
    } else {
      ret.write(this.squareMessageId);
    }

    ret.write(", ");
    ret.write("reportType:");
    String reportType_name = ReportType.VALUES_TO_NAMES[this.reportType];
    if (reportType_name != null) {
      ret.write(reportType_name);
      ret.write(" (");
    }
    ret.write(this.reportType);
    if (reportType_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("otherReason:");
    if (this.otherReason == null) {
      ret.write("null");
    } else {
      ret.write(this.otherReason);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetReportType() && !ReportType.VALID_VALUES.contains(reportType)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'reportType' has been assigned the invalid value $reportType");
    }
  }

}

