/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.paid_call_history;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class PaidCallHistory implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("PaidCallHistory");
  static final TField _SEQ_FIELD_DESC = new TField("seq", TType.I64, 1);
  static final TField _TYPE_FIELD_DESC = new TField("type", TType.I32, 2);
  static final TField _DIALED_NUMBER_FIELD_DESC = new TField("dialedNumber", TType.STRING, 3);
  static final TField _CALLED_NUMBER_FIELD_DESC = new TField("calledNumber", TType.STRING, 4);
  static final TField _TO_MID_FIELD_DESC = new TField("toMid", TType.STRING, 5);
  static final TField _TO_NAME_FIELD_DESC = new TField("toName", TType.STRING, 6);
  static final TField _SETUP_TIME_FIELD_DESC = new TField("setupTime", TType.I64, 7);
  static final TField _START_TIME_FIELD_DESC = new TField("startTime", TType.I64, 8);
  static final TField _END_TIME_FIELD_DESC = new TField("endTime", TType.I64, 9);
  static final TField _DURATION_FIELD_DESC = new TField("duration", TType.I64, 10);
  static final TField _TERMINATE_FIELD_DESC = new TField("terminate", TType.I32, 11);
  static final TField _PRODUCT_TYPE_FIELD_DESC = new TField("productType", TType.I32, 12);
  static final TField _CHARGE_FIELD_DESC = new TField("charge", TType.I32, 13);
  static final TField _UNIT_FIELD_DESC = new TField("unit", TType.STRING, 14);
  static final TField _RESULT_FIELD_DESC = new TField("result", TType.STRING, 15);

  int _seq = 0;
  static const int SEQ = 1;
  int _type;
  static const int TYPE = 2;
  String _dialedNumber;
  static const int DIALEDNUMBER = 3;
  String _calledNumber;
  static const int CALLEDNUMBER = 4;
  String _toMid;
  static const int TOMID = 5;
  String _toName;
  static const int TONAME = 6;
  int _setupTime = 0;
  static const int SETUPTIME = 7;
  int _startTime = 0;
  static const int STARTTIME = 8;
  int _endTime = 0;
  static const int ENDTIME = 9;
  int _duration = 0;
  static const int DURATION = 10;
  int _terminate = 0;
  static const int TERMINATE = 11;
  int _productType;
  static const int PRODUCTTYPE = 12;
  int _charge = 0;
  static const int CHARGE = 13;
  String _unit;
  static const int UNIT = 14;
  String _result;
  static const int RESULT = 15;

  bool __isset_seq = false;
  bool __isset_type = false;
  bool __isset_setupTime = false;
  bool __isset_startTime = false;
  bool __isset_endTime = false;
  bool __isset_duration = false;
  bool __isset_terminate = false;
  bool __isset_productType = false;
  bool __isset_charge = false;

  PaidCallHistory() {
  }

  // seq
  int get seq => this._seq;

  set seq(int seq) {
    this._seq = seq;
    this.__isset_seq = true;
  }

  bool isSetSeq() => this.__isset_seq;

  unsetSeq() {
    this.__isset_seq = false;
  }

  // type
  int get type => this._type;

  set type(int type) {
    this._type = type;
    this.__isset_type = true;
  }

  bool isSetType() => this.__isset_type;

  unsetType() {
    this.__isset_type = false;
  }

  // dialedNumber
  String get dialedNumber => this._dialedNumber;

  set dialedNumber(String dialedNumber) {
    this._dialedNumber = dialedNumber;
  }

  bool isSetDialedNumber() => this.dialedNumber != null;

  unsetDialedNumber() {
    this.dialedNumber = null;
  }

  // calledNumber
  String get calledNumber => this._calledNumber;

  set calledNumber(String calledNumber) {
    this._calledNumber = calledNumber;
  }

  bool isSetCalledNumber() => this.calledNumber != null;

  unsetCalledNumber() {
    this.calledNumber = null;
  }

  // toMid
  String get toMid => this._toMid;

  set toMid(String toMid) {
    this._toMid = toMid;
  }

  bool isSetToMid() => this.toMid != null;

  unsetToMid() {
    this.toMid = null;
  }

  // toName
  String get toName => this._toName;

  set toName(String toName) {
    this._toName = toName;
  }

  bool isSetToName() => this.toName != null;

  unsetToName() {
    this.toName = null;
  }

  // setupTime
  int get setupTime => this._setupTime;

  set setupTime(int setupTime) {
    this._setupTime = setupTime;
    this.__isset_setupTime = true;
  }

  bool isSetSetupTime() => this.__isset_setupTime;

  unsetSetupTime() {
    this.__isset_setupTime = false;
  }

  // startTime
  int get startTime => this._startTime;

  set startTime(int startTime) {
    this._startTime = startTime;
    this.__isset_startTime = true;
  }

  bool isSetStartTime() => this.__isset_startTime;

  unsetStartTime() {
    this.__isset_startTime = false;
  }

  // endTime
  int get endTime => this._endTime;

  set endTime(int endTime) {
    this._endTime = endTime;
    this.__isset_endTime = true;
  }

  bool isSetEndTime() => this.__isset_endTime;

  unsetEndTime() {
    this.__isset_endTime = false;
  }

  // duration
  int get duration => this._duration;

  set duration(int duration) {
    this._duration = duration;
    this.__isset_duration = true;
  }

  bool isSetDuration() => this.__isset_duration;

  unsetDuration() {
    this.__isset_duration = false;
  }

  // terminate
  int get terminate => this._terminate;

  set terminate(int terminate) {
    this._terminate = terminate;
    this.__isset_terminate = true;
  }

  bool isSetTerminate() => this.__isset_terminate;

  unsetTerminate() {
    this.__isset_terminate = false;
  }

  // productType
  int get productType => this._productType;

  set productType(int productType) {
    this._productType = productType;
    this.__isset_productType = true;
  }

  bool isSetProductType() => this.__isset_productType;

  unsetProductType() {
    this.__isset_productType = false;
  }

  // charge
  int get charge => this._charge;

  set charge(int charge) {
    this._charge = charge;
    this.__isset_charge = true;
  }

  bool isSetCharge() => this.__isset_charge;

  unsetCharge() {
    this.__isset_charge = false;
  }

  // unit
  String get unit => this._unit;

  set unit(String unit) {
    this._unit = unit;
  }

  bool isSetUnit() => this.unit != null;

  unsetUnit() {
    this.unit = null;
  }

  // result
  String get result => this._result;

  set result(String result) {
    this._result = result;
  }

  bool isSetResult() => this.result != null;

  unsetResult() {
    this.result = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SEQ:
        return this.seq;
      case TYPE:
        return this.type;
      case DIALEDNUMBER:
        return this.dialedNumber;
      case CALLEDNUMBER:
        return this.calledNumber;
      case TOMID:
        return this.toMid;
      case TONAME:
        return this.toName;
      case SETUPTIME:
        return this.setupTime;
      case STARTTIME:
        return this.startTime;
      case ENDTIME:
        return this.endTime;
      case DURATION:
        return this.duration;
      case TERMINATE:
        return this.terminate;
      case PRODUCTTYPE:
        return this.productType;
      case CHARGE:
        return this.charge;
      case UNIT:
        return this.unit;
      case RESULT:
        return this.result;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SEQ:
        if (value == null) {
          unsetSeq();
        } else {
          this.seq = value;
        }
        break;

      case TYPE:
        if (value == null) {
          unsetType();
        } else {
          this.type = value;
        }
        break;

      case DIALEDNUMBER:
        if (value == null) {
          unsetDialedNumber();
        } else {
          this.dialedNumber = value;
        }
        break;

      case CALLEDNUMBER:
        if (value == null) {
          unsetCalledNumber();
        } else {
          this.calledNumber = value;
        }
        break;

      case TOMID:
        if (value == null) {
          unsetToMid();
        } else {
          this.toMid = value;
        }
        break;

      case TONAME:
        if (value == null) {
          unsetToName();
        } else {
          this.toName = value;
        }
        break;

      case SETUPTIME:
        if (value == null) {
          unsetSetupTime();
        } else {
          this.setupTime = value;
        }
        break;

      case STARTTIME:
        if (value == null) {
          unsetStartTime();
        } else {
          this.startTime = value;
        }
        break;

      case ENDTIME:
        if (value == null) {
          unsetEndTime();
        } else {
          this.endTime = value;
        }
        break;

      case DURATION:
        if (value == null) {
          unsetDuration();
        } else {
          this.duration = value;
        }
        break;

      case TERMINATE:
        if (value == null) {
          unsetTerminate();
        } else {
          this.terminate = value;
        }
        break;

      case PRODUCTTYPE:
        if (value == null) {
          unsetProductType();
        } else {
          this.productType = value;
        }
        break;

      case CHARGE:
        if (value == null) {
          unsetCharge();
        } else {
          this.charge = value;
        }
        break;

      case UNIT:
        if (value == null) {
          unsetUnit();
        } else {
          this.unit = value;
        }
        break;

      case RESULT:
        if (value == null) {
          unsetResult();
        } else {
          this.result = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SEQ:
        return isSetSeq();
      case TYPE:
        return isSetType();
      case DIALEDNUMBER:
        return isSetDialedNumber();
      case CALLEDNUMBER:
        return isSetCalledNumber();
      case TOMID:
        return isSetToMid();
      case TONAME:
        return isSetToName();
      case SETUPTIME:
        return isSetSetupTime();
      case STARTTIME:
        return isSetStartTime();
      case ENDTIME:
        return isSetEndTime();
      case DURATION:
        return isSetDuration();
      case TERMINATE:
        return isSetTerminate();
      case PRODUCTTYPE:
        return isSetProductType();
      case CHARGE:
        return isSetCharge();
      case UNIT:
        return isSetUnit();
      case RESULT:
        return isSetResult();
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
        case SEQ:
          if (field.type == TType.I64) {
            this.seq = iprot.readI64();
            this.__isset_seq = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TYPE:
          if (field.type == TType.I32) {
            this.type = iprot.readI32();
            this.__isset_type = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DIALEDNUMBER:
          if (field.type == TType.STRING) {
            this.dialedNumber = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CALLEDNUMBER:
          if (field.type == TType.STRING) {
            this.calledNumber = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TOMID:
          if (field.type == TType.STRING) {
            this.toMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TONAME:
          if (field.type == TType.STRING) {
            this.toName = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SETUPTIME:
          if (field.type == TType.I64) {
            this.setupTime = iprot.readI64();
            this.__isset_setupTime = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case STARTTIME:
          if (field.type == TType.I64) {
            this.startTime = iprot.readI64();
            this.__isset_startTime = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ENDTIME:
          if (field.type == TType.I64) {
            this.endTime = iprot.readI64();
            this.__isset_endTime = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DURATION:
          if (field.type == TType.I64) {
            this.duration = iprot.readI64();
            this.__isset_duration = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TERMINATE:
          if (field.type == TType.I32) {
            this.terminate = iprot.readI32();
            this.__isset_terminate = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PRODUCTTYPE:
          if (field.type == TType.I32) {
            this.productType = iprot.readI32();
            this.__isset_productType = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CHARGE:
          if (field.type == TType.I32) {
            this.charge = iprot.readI32();
            this.__isset_charge = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case UNIT:
          if (field.type == TType.STRING) {
            this.unit = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RESULT:
          if (field.type == TType.STRING) {
            this.result = iprot.readString();
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
    oprot.writeFieldBegin(_SEQ_FIELD_DESC);
    oprot.writeI64(this.seq);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_TYPE_FIELD_DESC);
    oprot.writeI32(this.type);
    oprot.writeFieldEnd();
    if (this.dialedNumber != null) {
      oprot.writeFieldBegin(_DIALED_NUMBER_FIELD_DESC);
      oprot.writeString(this.dialedNumber);
      oprot.writeFieldEnd();
    }
    if (this.calledNumber != null) {
      oprot.writeFieldBegin(_CALLED_NUMBER_FIELD_DESC);
      oprot.writeString(this.calledNumber);
      oprot.writeFieldEnd();
    }
    if (this.toMid != null) {
      oprot.writeFieldBegin(_TO_MID_FIELD_DESC);
      oprot.writeString(this.toMid);
      oprot.writeFieldEnd();
    }
    if (this.toName != null) {
      oprot.writeFieldBegin(_TO_NAME_FIELD_DESC);
      oprot.writeString(this.toName);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_SETUP_TIME_FIELD_DESC);
    oprot.writeI64(this.setupTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_START_TIME_FIELD_DESC);
    oprot.writeI64(this.startTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_END_TIME_FIELD_DESC);
    oprot.writeI64(this.endTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_DURATION_FIELD_DESC);
    oprot.writeI64(this.duration);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_TERMINATE_FIELD_DESC);
    oprot.writeI32(this.terminate);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_PRODUCT_TYPE_FIELD_DESC);
    oprot.writeI32(this.productType);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_CHARGE_FIELD_DESC);
    oprot.writeI32(this.charge);
    oprot.writeFieldEnd();
    if (this.unit != null) {
      oprot.writeFieldBegin(_UNIT_FIELD_DESC);
      oprot.writeString(this.unit);
      oprot.writeFieldEnd();
    }
    if (this.result != null) {
      oprot.writeFieldBegin(_RESULT_FIELD_DESC);
      oprot.writeString(this.result);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("PaidCallHistory(");

    ret.write("seq:");
    ret.write(this.seq);

    ret.write(", ");
    ret.write("type:");
    String type_name = PaidCallType.VALUES_TO_NAMES[this.type];
    if (type_name != null) {
      ret.write(type_name);
      ret.write(" (");
    }
    ret.write(this.type);
    if (type_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("dialedNumber:");
    if (this.dialedNumber == null) {
      ret.write("null");
    } else {
      ret.write(this.dialedNumber);
    }

    ret.write(", ");
    ret.write("calledNumber:");
    if (this.calledNumber == null) {
      ret.write("null");
    } else {
      ret.write(this.calledNumber);
    }

    ret.write(", ");
    ret.write("toMid:");
    if (this.toMid == null) {
      ret.write("null");
    } else {
      ret.write(this.toMid);
    }

    ret.write(", ");
    ret.write("toName:");
    if (this.toName == null) {
      ret.write("null");
    } else {
      ret.write(this.toName);
    }

    ret.write(", ");
    ret.write("setupTime:");
    ret.write(this.setupTime);

    ret.write(", ");
    ret.write("startTime:");
    ret.write(this.startTime);

    ret.write(", ");
    ret.write("endTime:");
    ret.write(this.endTime);

    ret.write(", ");
    ret.write("duration:");
    ret.write(this.duration);

    ret.write(", ");
    ret.write("terminate:");
    ret.write(this.terminate);

    ret.write(", ");
    ret.write("productType:");
    String productType_name = PaidCallProductType.VALUES_TO_NAMES[this.productType];
    if (productType_name != null) {
      ret.write(productType_name);
      ret.write(" (");
    }
    ret.write(this.productType);
    if (productType_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("charge:");
    ret.write(this.charge);

    ret.write(", ");
    ret.write("unit:");
    if (this.unit == null) {
      ret.write("null");
    } else {
      ret.write(this.unit);
    }

    ret.write(", ");
    ret.write("result:");
    if (this.result == null) {
      ret.write("null");
    } else {
      ret.write(this.result);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetType() && !PaidCallType.VALID_VALUES.contains(type)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'type' has been assigned the invalid value $type");
    }
    if (isSetProductType() && !PaidCallProductType.VALID_VALUES.contains(productType)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'productType' has been assigned the invalid value $productType");
    }
  }

}

