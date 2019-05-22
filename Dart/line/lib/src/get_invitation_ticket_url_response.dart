/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.get_invitation_ticket_url_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class GetInvitationTicketUrlResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("GetInvitationTicketUrlResponse");
  static final TField _INVITATION_URL_FIELD_DESC = new TField("invitationURL", TType.STRING, 1);

  String _invitationURL;
  static const int INVITATIONURL = 1;


  GetInvitationTicketUrlResponse() {
  }

  // invitationURL
  String get invitationURL => this._invitationURL;

  set invitationURL(String invitationURL) {
    this._invitationURL = invitationURL;
  }

  bool isSetInvitationURL() => this.invitationURL != null;

  unsetInvitationURL() {
    this.invitationURL = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case INVITATIONURL:
        return this.invitationURL;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case INVITATIONURL:
        if (value == null) {
          unsetInvitationURL();
        } else {
          this.invitationURL = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case INVITATIONURL:
        return isSetInvitationURL();
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
        case INVITATIONURL:
          if (field.type == TType.STRING) {
            this.invitationURL = iprot.readString();
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
    if (this.invitationURL != null) {
      oprot.writeFieldBegin(_INVITATION_URL_FIELD_DESC);
      oprot.writeString(this.invitationURL);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("GetInvitationTicketUrlResponse(");

    ret.write("invitationURL:");
    if (this.invitationURL == null) {
      ret.write("null");
    } else {
      ret.write(this.invitationURL);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

