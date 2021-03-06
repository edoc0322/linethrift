/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.group_call;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class GroupCall implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("GroupCall");
  static final TField _ONLINE_FIELD_DESC = new TField("online", TType.BOOL, 1);
  static final TField _CHAT_MID_FIELD_DESC = new TField("chatMid", TType.STRING, 2);
  static final TField _HOST_MIDS_FIELD_DESC = new TField("hostMids", TType.STRING, 3);
  static final TField _MEMBER_MIDS_FIELD_DESC = new TField("memberMids", TType.LIST, 4);
  static final TField _STARTED_FIELD_DESC = new TField("started", TType.I64, 5);
  static final TField _MEDIA_TYPE_FIELD_DESC = new TField("mediaType", TType.I32, 6);

  bool _online = false;
  static const int ONLINE = 1;
  String _chatMid;
  static const int CHATMID = 2;
  String _hostMids;
  static const int HOSTMIDS = 3;
  List<String> _memberMids;
  static const int MEMBERMIDS = 4;
  int _started = 0;
  static const int STARTED = 5;
  int _mediaType;
  static const int MEDIATYPE = 6;

  bool __isset_online = false;
  bool __isset_started = false;
  bool __isset_mediaType = false;

  GroupCall() {
  }

  // online
  bool get online => this._online;

  set online(bool online) {
    this._online = online;
    this.__isset_online = true;
  }

  bool isSetOnline() => this.__isset_online;

  unsetOnline() {
    this.__isset_online = false;
  }

  // chatMid
  String get chatMid => this._chatMid;

  set chatMid(String chatMid) {
    this._chatMid = chatMid;
  }

  bool isSetChatMid() => this.chatMid != null;

  unsetChatMid() {
    this.chatMid = null;
  }

  // hostMids
  String get hostMids => this._hostMids;

  set hostMids(String hostMids) {
    this._hostMids = hostMids;
  }

  bool isSetHostMids() => this.hostMids != null;

  unsetHostMids() {
    this.hostMids = null;
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

  // started
  int get started => this._started;

  set started(int started) {
    this._started = started;
    this.__isset_started = true;
  }

  bool isSetStarted() => this.__isset_started;

  unsetStarted() {
    this.__isset_started = false;
  }

  // mediaType
  int get mediaType => this._mediaType;

  set mediaType(int mediaType) {
    this._mediaType = mediaType;
    this.__isset_mediaType = true;
  }

  bool isSetMediaType() => this.__isset_mediaType;

  unsetMediaType() {
    this.__isset_mediaType = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case ONLINE:
        return this.online;
      case CHATMID:
        return this.chatMid;
      case HOSTMIDS:
        return this.hostMids;
      case MEMBERMIDS:
        return this.memberMids;
      case STARTED:
        return this.started;
      case MEDIATYPE:
        return this.mediaType;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case ONLINE:
        if (value == null) {
          unsetOnline();
        } else {
          this.online = value;
        }
        break;

      case CHATMID:
        if (value == null) {
          unsetChatMid();
        } else {
          this.chatMid = value;
        }
        break;

      case HOSTMIDS:
        if (value == null) {
          unsetHostMids();
        } else {
          this.hostMids = value;
        }
        break;

      case MEMBERMIDS:
        if (value == null) {
          unsetMemberMids();
        } else {
          this.memberMids = value;
        }
        break;

      case STARTED:
        if (value == null) {
          unsetStarted();
        } else {
          this.started = value;
        }
        break;

      case MEDIATYPE:
        if (value == null) {
          unsetMediaType();
        } else {
          this.mediaType = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case ONLINE:
        return isSetOnline();
      case CHATMID:
        return isSetChatMid();
      case HOSTMIDS:
        return isSetHostMids();
      case MEMBERMIDS:
        return isSetMemberMids();
      case STARTED:
        return isSetStarted();
      case MEDIATYPE:
        return isSetMediaType();
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
        case ONLINE:
          if (field.type == TType.BOOL) {
            this.online = iprot.readBool();
            this.__isset_online = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CHATMID:
          if (field.type == TType.STRING) {
            this.chatMid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case HOSTMIDS:
          if (field.type == TType.STRING) {
            this.hostMids = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MEMBERMIDS:
          if (field.type == TType.LIST) {
            {
              TList _list570 = iprot.readListBegin();
              this.memberMids = new List<String>();
              for (int _i571 = 0; _i571 < _list570.length; ++_i571) {
                String _elem572;
                _elem572 = iprot.readString();
                this.memberMids.add(_elem572);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case STARTED:
          if (field.type == TType.I64) {
            this.started = iprot.readI64();
            this.__isset_started = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MEDIATYPE:
          if (field.type == TType.I32) {
            this.mediaType = iprot.readI32();
            this.__isset_mediaType = true;
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
    oprot.writeFieldBegin(_ONLINE_FIELD_DESC);
    oprot.writeBool(this.online);
    oprot.writeFieldEnd();
    if (this.chatMid != null) {
      oprot.writeFieldBegin(_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.chatMid);
      oprot.writeFieldEnd();
    }
    if (this.hostMids != null) {
      oprot.writeFieldBegin(_HOST_MIDS_FIELD_DESC);
      oprot.writeString(this.hostMids);
      oprot.writeFieldEnd();
    }
    if (this.memberMids != null) {
      oprot.writeFieldBegin(_MEMBER_MIDS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRING, this.memberMids.length));
        for (var elem573 in this.memberMids) {
          oprot.writeString(elem573);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_STARTED_FIELD_DESC);
    oprot.writeI64(this.started);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_MEDIA_TYPE_FIELD_DESC);
    oprot.writeI32(this.mediaType);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("GroupCall(");

    ret.write("online:");
    ret.write(this.online);

    ret.write(", ");
    ret.write("chatMid:");
    if (this.chatMid == null) {
      ret.write("null");
    } else {
      ret.write(this.chatMid);
    }

    ret.write(", ");
    ret.write("hostMids:");
    if (this.hostMids == null) {
      ret.write("null");
    } else {
      ret.write(this.hostMids);
    }

    ret.write(", ");
    ret.write("memberMids:");
    if (this.memberMids == null) {
      ret.write("null");
    } else {
      ret.write(this.memberMids);
    }

    ret.write(", ");
    ret.write("started:");
    ret.write(this.started);

    ret.write(", ");
    ret.write("mediaType:");
    String mediaType_name = GroupCallMediaType.VALUES_TO_NAMES[this.mediaType];
    if (mediaType_name != null) {
      ret.write(mediaType_name);
      ret.write(" (");
    }
    ret.write(this.mediaType);
    if (mediaType_name != null) {
      ret.write(")");
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetMediaType() && !GroupCallMediaType.VALID_VALUES.contains(mediaType)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'mediaType' has been assigned the invalid value $mediaType");
    }
  }

}

