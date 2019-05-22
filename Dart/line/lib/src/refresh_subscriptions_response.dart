/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.refresh_subscriptions_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class RefreshSubscriptionsResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("RefreshSubscriptionsResponse");
  static final TField _TTL_MILLIS_FIELD_DESC = new TField("ttlMillis", TType.I64, 1);
  static final TField _SUBSCRIPTION_STATES_FIELD_DESC = new TField("subscriptionStates", TType.MAP, 2);

  int _ttlMillis = 0;
  static const int TTLMILLIS = 1;
  Map<int, SubscriptionState> _subscriptionStates;
  static const int SUBSCRIPTIONSTATES = 2;

  bool __isset_ttlMillis = false;

  RefreshSubscriptionsResponse() {
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

  // subscriptionStates
  Map<int, SubscriptionState> get subscriptionStates => this._subscriptionStates;

  set subscriptionStates(Map<int, SubscriptionState> subscriptionStates) {
    this._subscriptionStates = subscriptionStates;
  }

  bool isSetSubscriptionStates() => this.subscriptionStates != null;

  unsetSubscriptionStates() {
    this.subscriptionStates = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case TTLMILLIS:
        return this.ttlMillis;
      case SUBSCRIPTIONSTATES:
        return this.subscriptionStates;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case TTLMILLIS:
        if (value == null) {
          unsetTtlMillis();
        } else {
          this.ttlMillis = value;
        }
        break;

      case SUBSCRIPTIONSTATES:
        if (value == null) {
          unsetSubscriptionStates();
        } else {
          this.subscriptionStates = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case TTLMILLIS:
        return isSetTtlMillis();
      case SUBSCRIPTIONSTATES:
        return isSetSubscriptionStates();
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
        case TTLMILLIS:
          if (field.type == TType.I64) {
            this.ttlMillis = iprot.readI64();
            this.__isset_ttlMillis = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SUBSCRIPTIONSTATES:
          if (field.type == TType.MAP) {
            {
              TMap _map584 = iprot.readMapBegin();
              this.subscriptionStates = new Map<int, SubscriptionState>();
              for (int _i585 = 0; _i585 < _map584.length; ++_i585) {
                int _key586;
                SubscriptionState _val587;
                _key586 = iprot.readI64();
                _val587 = new SubscriptionState();
                _val587.read(iprot);
                this.subscriptionStates[_key586] = _val587;
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
    oprot.writeFieldBegin(_TTL_MILLIS_FIELD_DESC);
    oprot.writeI64(this.ttlMillis);
    oprot.writeFieldEnd();
    if (this.subscriptionStates != null) {
      oprot.writeFieldBegin(_SUBSCRIPTION_STATES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I64, TType.STRUCT, this.subscriptionStates.length));
        for (var elem589 in this.subscriptionStates.keys) {
          oprot.writeI64(elem589);
          this.subscriptionStates[elem589].write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("RefreshSubscriptionsResponse(");

    ret.write("ttlMillis:");
    ret.write(this.ttlMillis);

    ret.write(", ");
    ret.write("subscriptionStates:");
    if (this.subscriptionStates == null) {
      ret.write("null");
    } else {
      ret.write(this.subscriptionStates);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

