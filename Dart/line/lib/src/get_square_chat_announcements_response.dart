/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.get_square_chat_announcements_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class GetSquareChatAnnouncementsResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("GetSquareChatAnnouncementsResponse");
  static final TField _ANNOUNCEMENTS_FIELD_DESC = new TField("announcements", TType.LIST, 1);

  List<SquareChatAnnouncement> _announcements;
  static const int ANNOUNCEMENTS = 1;


  GetSquareChatAnnouncementsResponse() {
  }

  // announcements
  List<SquareChatAnnouncement> get announcements => this._announcements;

  set announcements(List<SquareChatAnnouncement> announcements) {
    this._announcements = announcements;
  }

  bool isSetAnnouncements() => this.announcements != null;

  unsetAnnouncements() {
    this.announcements = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case ANNOUNCEMENTS:
        return this.announcements;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case ANNOUNCEMENTS:
        if (value == null) {
          unsetAnnouncements();
        } else {
          this.announcements = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case ANNOUNCEMENTS:
        return isSetAnnouncements();
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
        case ANNOUNCEMENTS:
          if (field.type == TType.LIST) {
            {
              TList _list618 = iprot.readListBegin();
              this.announcements = new List<SquareChatAnnouncement>();
              for (int _i619 = 0; _i619 < _list618.length; ++_i619) {
                SquareChatAnnouncement _elem620;
                _elem620 = new SquareChatAnnouncement();
                _elem620.read(iprot);
                this.announcements.add(_elem620);
              }
              iprot.readListEnd();
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
    if (this.announcements != null) {
      oprot.writeFieldBegin(_ANNOUNCEMENTS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.announcements.length));
        for (var elem621 in this.announcements) {
          elem621.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("GetSquareChatAnnouncementsResponse(");

    ret.write("announcements:");
    if (this.announcements == null) {
      ret.write("null");
    } else {
      ret.write(this.announcements);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

