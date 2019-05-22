/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.channel_domains;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class ChannelDomains implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("ChannelDomains");
  static final TField _CHANNEL_DOMAINS_FIELD_DESC = new TField("channelDomains", TType.LIST, 1);
  static final TField _REVISION_FIELD_DESC = new TField("revision", TType.I64, 2);

  List<ChannelDomain> _channelDomains;
  static const int CHANNELDOMAINS = 1;
  int _revision = 0;
  static const int REVISION = 2;

  bool __isset_revision = false;

  ChannelDomains() {
  }

  // channelDomains
  List<ChannelDomain> get channelDomains => this._channelDomains;

  set channelDomains(List<ChannelDomain> channelDomains) {
    this._channelDomains = channelDomains;
  }

  bool isSetChannelDomains() => this.channelDomains != null;

  unsetChannelDomains() {
    this.channelDomains = null;
  }

  // revision
  int get revision => this._revision;

  set revision(int revision) {
    this._revision = revision;
    this.__isset_revision = true;
  }

  bool isSetRevision() => this.__isset_revision;

  unsetRevision() {
    this.__isset_revision = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case CHANNELDOMAINS:
        return this.channelDomains;
      case REVISION:
        return this.revision;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case CHANNELDOMAINS:
        if (value == null) {
          unsetChannelDomains();
        } else {
          this.channelDomains = value;
        }
        break;

      case REVISION:
        if (value == null) {
          unsetRevision();
        } else {
          this.revision = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case CHANNELDOMAINS:
        return isSetChannelDomains();
      case REVISION:
        return isSetRevision();
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
        case CHANNELDOMAINS:
          if (field.type == TType.LIST) {
            {
              TList _list170 = iprot.readListBegin();
              this.channelDomains = new List<ChannelDomain>();
              for (int _i171 = 0; _i171 < _list170.length; ++_i171) {
                ChannelDomain _elem172;
                _elem172 = new ChannelDomain();
                _elem172.read(iprot);
                this.channelDomains.add(_elem172);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case REVISION:
          if (field.type == TType.I64) {
            this.revision = iprot.readI64();
            this.__isset_revision = true;
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
    if (this.channelDomains != null) {
      oprot.writeFieldBegin(_CHANNEL_DOMAINS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.channelDomains.length));
        for (var elem173 in this.channelDomains) {
          elem173.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_REVISION_FIELD_DESC);
    oprot.writeI64(this.revision);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("ChannelDomains(");

    ret.write("channelDomains:");
    if (this.channelDomains == null) {
      ret.write("null");
    } else {
      ret.write(this.channelDomains);
    }

    ret.write(", ");
    ret.write("revision:");
    ret.write(this.revision);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

