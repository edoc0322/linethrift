/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.noti_center_event_data;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class NotiCenterEventData implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("NotiCenterEventData");
  static final TField _ID_FIELD_DESC = new TField("id", TType.STRING, 1);
  static final TField _TO_FIELD_DESC = new TField("to", TType.STRING, 2);
  static final TField _FROM__FIELD_DESC = new TField("from_", TType.STRING, 3);
  static final TField _TO_CHANNEL_FIELD_DESC = new TField("toChannel", TType.STRING, 4);
  static final TField _FROM_CHANNEL_FIELD_DESC = new TField("fromChannel", TType.STRING, 5);
  static final TField _EVENT_TYPE_FIELD_DESC = new TField("eventType", TType.STRING, 6);
  static final TField _CREATED_TIME_FIELD_DESC = new TField("createdTime", TType.I64, 7);
  static final TField _OPERATION_REVISION_FIELD_DESC = new TField("operationRevision", TType.I64, 8);
  static final TField _CONTENT_FIELD_DESC = new TField("content", TType.MAP, 9);
  static final TField _PUSH_FIELD_DESC = new TField("push", TType.MAP, 10);

  String _id;
  static const int ID = 1;
  String _to;
  static const int TO = 2;
  String _from_;
  static const int FROM_ = 3;
  String _toChannel;
  static const int TOCHANNEL = 4;
  String _fromChannel;
  static const int FROMCHANNEL = 5;
  String _eventType;
  static const int EVENTTYPE = 6;
  int _createdTime = 0;
  static const int CREATEDTIME = 7;
  int _operationRevision = 0;
  static const int OPERATIONREVISION = 8;
  Map<String, String> _content;
  static const int CONTENT = 9;
  Map<String, String> _push;
  static const int PUSH = 10;

  bool __isset_createdTime = false;
  bool __isset_operationRevision = false;

  NotiCenterEventData() {
  }

  // id
  String get id => this._id;

  set id(String id) {
    this._id = id;
  }

  bool isSetId() => this.id != null;

  unsetId() {
    this.id = null;
  }

  // to
  String get to => this._to;

  set to(String to) {
    this._to = to;
  }

  bool isSetTo() => this.to != null;

  unsetTo() {
    this.to = null;
  }

  // from_
  String get from_ => this._from_;

  set from_(String from_) {
    this._from_ = from_;
  }

  bool isSetFrom_() => this.from_ != null;

  unsetFrom_() {
    this.from_ = null;
  }

  // toChannel
  String get toChannel => this._toChannel;

  set toChannel(String toChannel) {
    this._toChannel = toChannel;
  }

  bool isSetToChannel() => this.toChannel != null;

  unsetToChannel() {
    this.toChannel = null;
  }

  // fromChannel
  String get fromChannel => this._fromChannel;

  set fromChannel(String fromChannel) {
    this._fromChannel = fromChannel;
  }

  bool isSetFromChannel() => this.fromChannel != null;

  unsetFromChannel() {
    this.fromChannel = null;
  }

  // eventType
  String get eventType => this._eventType;

  set eventType(String eventType) {
    this._eventType = eventType;
  }

  bool isSetEventType() => this.eventType != null;

  unsetEventType() {
    this.eventType = null;
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

  // operationRevision
  int get operationRevision => this._operationRevision;

  set operationRevision(int operationRevision) {
    this._operationRevision = operationRevision;
    this.__isset_operationRevision = true;
  }

  bool isSetOperationRevision() => this.__isset_operationRevision;

  unsetOperationRevision() {
    this.__isset_operationRevision = false;
  }

  // content
  Map<String, String> get content => this._content;

  set content(Map<String, String> content) {
    this._content = content;
  }

  bool isSetContent() => this.content != null;

  unsetContent() {
    this.content = null;
  }

  // push
  Map<String, String> get push => this._push;

  set push(Map<String, String> push) {
    this._push = push;
  }

  bool isSetPush() => this.push != null;

  unsetPush() {
    this.push = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case ID:
        return this.id;
      case TO:
        return this.to;
      case FROM_:
        return this.from_;
      case TOCHANNEL:
        return this.toChannel;
      case FROMCHANNEL:
        return this.fromChannel;
      case EVENTTYPE:
        return this.eventType;
      case CREATEDTIME:
        return this.createdTime;
      case OPERATIONREVISION:
        return this.operationRevision;
      case CONTENT:
        return this.content;
      case PUSH:
        return this.push;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case ID:
        if (value == null) {
          unsetId();
        } else {
          this.id = value;
        }
        break;

      case TO:
        if (value == null) {
          unsetTo();
        } else {
          this.to = value;
        }
        break;

      case FROM_:
        if (value == null) {
          unsetFrom_();
        } else {
          this.from_ = value;
        }
        break;

      case TOCHANNEL:
        if (value == null) {
          unsetToChannel();
        } else {
          this.toChannel = value;
        }
        break;

      case FROMCHANNEL:
        if (value == null) {
          unsetFromChannel();
        } else {
          this.fromChannel = value;
        }
        break;

      case EVENTTYPE:
        if (value == null) {
          unsetEventType();
        } else {
          this.eventType = value;
        }
        break;

      case CREATEDTIME:
        if (value == null) {
          unsetCreatedTime();
        } else {
          this.createdTime = value;
        }
        break;

      case OPERATIONREVISION:
        if (value == null) {
          unsetOperationRevision();
        } else {
          this.operationRevision = value;
        }
        break;

      case CONTENT:
        if (value == null) {
          unsetContent();
        } else {
          this.content = value;
        }
        break;

      case PUSH:
        if (value == null) {
          unsetPush();
        } else {
          this.push = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case ID:
        return isSetId();
      case TO:
        return isSetTo();
      case FROM_:
        return isSetFrom_();
      case TOCHANNEL:
        return isSetToChannel();
      case FROMCHANNEL:
        return isSetFromChannel();
      case EVENTTYPE:
        return isSetEventType();
      case CREATEDTIME:
        return isSetCreatedTime();
      case OPERATIONREVISION:
        return isSetOperationRevision();
      case CONTENT:
        return isSetContent();
      case PUSH:
        return isSetPush();
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
        case ID:
          if (field.type == TType.STRING) {
            this.id = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TO:
          if (field.type == TType.STRING) {
            this.to = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FROM_:
          if (field.type == TType.STRING) {
            this.from_ = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TOCHANNEL:
          if (field.type == TType.STRING) {
            this.toChannel = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case FROMCHANNEL:
          if (field.type == TType.STRING) {
            this.fromChannel = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EVENTTYPE:
          if (field.type == TType.STRING) {
            this.eventType = iprot.readString();
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
        case OPERATIONREVISION:
          if (field.type == TType.I64) {
            this.operationRevision = iprot.readI64();
            this.__isset_operationRevision = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CONTENT:
          if (field.type == TType.MAP) {
            {
              TMap _map186 = iprot.readMapBegin();
              this.content = new Map<String, String>();
              for (int _i187 = 0; _i187 < _map186.length; ++_i187) {
                String _key188;
                String _val189;
                _key188 = iprot.readString();
                _val189 = iprot.readString();
                this.content[_key188] = _val189;
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case PUSH:
          if (field.type == TType.MAP) {
            {
              TMap _map190 = iprot.readMapBegin();
              this.push = new Map<String, String>();
              for (int _i191 = 0; _i191 < _map190.length; ++_i191) {
                String _key192;
                String _val193;
                _key192 = iprot.readString();
                _val193 = iprot.readString();
                this.push[_key192] = _val193;
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
    if (this.id != null) {
      oprot.writeFieldBegin(_ID_FIELD_DESC);
      oprot.writeString(this.id);
      oprot.writeFieldEnd();
    }
    if (this.to != null) {
      oprot.writeFieldBegin(_TO_FIELD_DESC);
      oprot.writeString(this.to);
      oprot.writeFieldEnd();
    }
    if (this.from_ != null) {
      oprot.writeFieldBegin(_FROM__FIELD_DESC);
      oprot.writeString(this.from_);
      oprot.writeFieldEnd();
    }
    if (this.toChannel != null) {
      oprot.writeFieldBegin(_TO_CHANNEL_FIELD_DESC);
      oprot.writeString(this.toChannel);
      oprot.writeFieldEnd();
    }
    if (this.fromChannel != null) {
      oprot.writeFieldBegin(_FROM_CHANNEL_FIELD_DESC);
      oprot.writeString(this.fromChannel);
      oprot.writeFieldEnd();
    }
    if (this.eventType != null) {
      oprot.writeFieldBegin(_EVENT_TYPE_FIELD_DESC);
      oprot.writeString(this.eventType);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_CREATED_TIME_FIELD_DESC);
    oprot.writeI64(this.createdTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_OPERATION_REVISION_FIELD_DESC);
    oprot.writeI64(this.operationRevision);
    oprot.writeFieldEnd();
    if (this.content != null) {
      oprot.writeFieldBegin(_CONTENT_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.content.length));
        for (var elem195 in this.content.keys) {
          oprot.writeString(elem195);
          oprot.writeString(this.content[elem195]);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.push != null) {
      oprot.writeFieldBegin(_PUSH_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.push.length));
        for (var elem197 in this.push.keys) {
          oprot.writeString(elem197);
          oprot.writeString(this.push[elem197]);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("NotiCenterEventData(");

    ret.write("id:");
    if (this.id == null) {
      ret.write("null");
    } else {
      ret.write(this.id);
    }

    ret.write(", ");
    ret.write("to:");
    if (this.to == null) {
      ret.write("null");
    } else {
      ret.write(this.to);
    }

    ret.write(", ");
    ret.write("from_:");
    if (this.from_ == null) {
      ret.write("null");
    } else {
      ret.write(this.from_);
    }

    ret.write(", ");
    ret.write("toChannel:");
    if (this.toChannel == null) {
      ret.write("null");
    } else {
      ret.write(this.toChannel);
    }

    ret.write(", ");
    ret.write("fromChannel:");
    if (this.fromChannel == null) {
      ret.write("null");
    } else {
      ret.write(this.fromChannel);
    }

    ret.write(", ");
    ret.write("eventType:");
    if (this.eventType == null) {
      ret.write("null");
    } else {
      ret.write(this.eventType);
    }

    ret.write(", ");
    ret.write("createdTime:");
    ret.write(this.createdTime);

    ret.write(", ");
    ret.write("operationRevision:");
    ret.write(this.operationRevision);

    ret.write(", ");
    ret.write("content:");
    if (this.content == null) {
      ret.write("null");
    } else {
      ret.write(this.content);
    }

    ret.write(", ");
    ret.write("push:");
    if (this.push == null) {
      ret.write("null");
    } else {
      ret.write(this.push);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

