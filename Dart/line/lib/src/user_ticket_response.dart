/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.user_ticket_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class UserTicketResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("UserTicketResponse");
  static final TField _MID_FIELD_DESC = new TField("mid", TType.STRING, 1);
  static final TField _USER_TICKET_FIELD_DESC = new TField("userTicket", TType.STRING, 2);

  String _mid;
  static const int MID = 1;
  String _userTicket;
  static const int USERTICKET = 2;


  UserTicketResponse() {
  }

  // mid
  String get mid => this._mid;

  set mid(String mid) {
    this._mid = mid;
  }

  bool isSetMid() => this.mid != null;

  unsetMid() {
    this.mid = null;
  }

  // userTicket
  String get userTicket => this._userTicket;

  set userTicket(String userTicket) {
    this._userTicket = userTicket;
  }

  bool isSetUserTicket() => this.userTicket != null;

  unsetUserTicket() {
    this.userTicket = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case MID:
        return this.mid;
      case USERTICKET:
        return this.userTicket;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case MID:
        if (value == null) {
          unsetMid();
        } else {
          this.mid = value;
        }
        break;

      case USERTICKET:
        if (value == null) {
          unsetUserTicket();
        } else {
          this.userTicket = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case MID:
        return isSetMid();
      case USERTICKET:
        return isSetUserTicket();
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
        case MID:
          if (field.type == TType.STRING) {
            this.mid = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case USERTICKET:
          if (field.type == TType.STRING) {
            this.userTicket = iprot.readString();
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
    if (this.mid != null) {
      oprot.writeFieldBegin(_MID_FIELD_DESC);
      oprot.writeString(this.mid);
      oprot.writeFieldEnd();
    }
    if (this.userTicket != null) {
      oprot.writeFieldBegin(_USER_TICKET_FIELD_DESC);
      oprot.writeString(this.userTicket);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("UserTicketResponse(");

    ret.write("mid:");
    if (this.mid == null) {
      ret.write("null");
    } else {
      ret.write(this.mid);
    }

    ret.write(", ");
    ret.write("userTicket:");
    if (this.userTicket == null) {
      ret.write("null");
    } else {
      ret.write(this.userTicket);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

