/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.subscription_state;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SubscriptionState implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SubscriptionState");
  static final TField _SUBSCRIPTION_ID_FIELD_DESC = new TField("subscriptionId", TType.I64, 1);
  static final TField _TTL_MILLIS_FIELD_DESC = new TField("ttlMillis", TType.I64, 2);

  int _subscriptionId = 0;
  static const int SUBSCRIPTIONID = 1;
  int _ttlMillis = 0;
  static const int TTLMILLIS = 2;

  bool __isset_subscriptionId = false;
  bool __isset_ttlMillis = false;

  SubscriptionState() {
  }

  // subscriptionId
  int get subscriptionId => this._subscriptionId;

  set subscriptionId(int subscriptionId) {
    this._subscriptionId = subscriptionId;
    this.__isset_subscriptionId = true;
  }

  bool isSetSubscriptionId() => this.__isset_subscriptionId;

  unsetSubscriptionId() {
    this.__isset_subscriptionId = false;
  }

  // ttlMillis
  int get ttlMillis => this._ttlMillis;

  set ttlMillis(int ttlMillis) {
    this._ttlMillis = ttlMillis;
    this.__isset_ttlMillis = true;
  }

  bool isSetTtlMillis() => this.__isset_ttlMillis;

  unsetTtlMillis() {
    this.__isset_ttlMillis = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SUBSCRIPTIONID:
        return this.subscriptionId;
      case TTLMILLIS:
        return this.ttlMillis;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SUBSCRIPTIONID:
        if (value == null) {
          unsetSubscriptionId();
        } else {
          this.subscriptionId = value;
        }
        break;

      case TTLMILLIS:
        if (value == null) {
          unsetTtlMillis();
        } else {
          this.ttlMillis = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SUBSCRIPTIONID:
        return isSetSubscriptionId();
      case TTLMILLIS:
        return isSetTtlMillis();
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
        case SUBSCRIPTIONID:
          if (field.type == TType.I64) {
            this.subscriptionId = iprot.readI64();
            this.__isset_subscriptionId = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TTLMILLIS:
          if (field.type == TType.I64) {
            this.ttlMillis = iprot.readI64();
            this.__isset_ttlMillis = true;
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
    oprot.writeFieldBegin(_SUBSCRIPTION_ID_FIELD_DESC);
    oprot.writeI64(this.subscriptionId);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_TTL_MILLIS_FIELD_DESC);
    oprot.writeI64(this.ttlMillis);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SubscriptionState(");

    ret.write("subscriptionId:");
    ret.write(this.subscriptionId);

    ret.write(", ");
    ret.write("ttlMillis:");
    ret.write(this.ttlMillis);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

