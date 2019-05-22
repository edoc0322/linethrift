/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.spot_phone_number_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SpotPhoneNumberResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SpotPhoneNumberResponse");
  static final TField _SPOT_ITEMS_FIELD_DESC = new TField("spotItems", TType.LIST, 1);

  List<SpotItem> _spotItems;
  static const int SPOTITEMS = 1;


  SpotPhoneNumberResponse() {
  }

  // spotItems
  List<SpotItem> get spotItems => this._spotItems;

  set spotItems(List<SpotItem> spotItems) {
    this._spotItems = spotItems;
  }

  bool isSetSpotItems() => this.spotItems != null;

  unsetSpotItems() {
    this.spotItems = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SPOTITEMS:
        return this.spotItems;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SPOTITEMS:
        if (value == null) {
          unsetSpotItems();
        } else {
          this.spotItems = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SPOTITEMS:
        return isSetSpotItems();
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
        case SPOTITEMS:
          if (field.type == TType.LIST) {
            {
              TList _list94 = iprot.readListBegin();
              this.spotItems = new List<SpotItem>();
              for (int _i95 = 0; _i95 < _list94.length; ++_i95) {
                SpotItem _elem96;
                _elem96 = new SpotItem();
                _elem96.read(iprot);
                this.spotItems.add(_elem96);
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
    if (this.spotItems != null) {
      oprot.writeFieldBegin(_SPOT_ITEMS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.spotItems.length));
        for (var elem97 in this.spotItems) {
          elem97.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SpotPhoneNumberResponse(");

    ret.write("spotItems:");
    if (this.spotItems == null) {
      ret.write("null");
    } else {
      ret.write(this.spotItems);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

