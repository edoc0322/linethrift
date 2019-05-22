/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.identity_credential_request;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class IdentityCredentialRequest implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("IdentityCredentialRequest");
  static final TField _META_DATA_FIELD_DESC = new TField("metaData", TType.MAP, 1);
  static final TField _IDENTITY_PROVIDER_FIELD_DESC = new TField("identityProvider", TType.I32, 2);
  static final TField _CIPHER_KEY_ID_FIELD_DESC = new TField("cipherKeyId", TType.STRING, 3);
  static final TField _CIPHER_TEXT_FIELD_DESC = new TField("cipherText", TType.STRING, 4);
  static final TField _CONFIRMATION_REQUEST_FIELD_DESC = new TField("confirmationRequest", TType.STRUCT, 5);

  Map<String, String> _metaData;
  static const int METADATA = 1;
  int _identityProvider;
  static const int IDENTITYPROVIDER = 2;
  String _cipherKeyId;
  static const int CIPHERKEYID = 3;
  String _cipherText;
  static const int CIPHERTEXT = 4;
  IdentifierConfirmationRequest _confirmationRequest;
  static const int CONFIRMATIONREQUEST = 5;

  bool __isset_identityProvider = false;

  IdentityCredentialRequest() {
  }

  // metaData
  Map<String, String> get metaData => this._metaData;

  set metaData(Map<String, String> metaData) {
    this._metaData = metaData;
  }

  bool isSetMetaData() => this.metaData != null;

  unsetMetaData() {
    this.metaData = null;
  }

  // identityProvider
  int get identityProvider => this._identityProvider;

  set identityProvider(int identityProvider) {
    this._identityProvider = identityProvider;
    this.__isset_identityProvider = true;
  }

  bool isSetIdentityProvider() => this.__isset_identityProvider;

  unsetIdentityProvider() {
    this.__isset_identityProvider = false;
  }

  // cipherKeyId
  String get cipherKeyId => this._cipherKeyId;

  set cipherKeyId(String cipherKeyId) {
    this._cipherKeyId = cipherKeyId;
  }

  bool isSetCipherKeyId() => this.cipherKeyId != null;

  unsetCipherKeyId() {
    this.cipherKeyId = null;
  }

  // cipherText
  String get cipherText => this._cipherText;

  set cipherText(String cipherText) {
    this._cipherText = cipherText;
  }

  bool isSetCipherText() => this.cipherText != null;

  unsetCipherText() {
    this.cipherText = null;
  }

  // confirmationRequest
  IdentifierConfirmationRequest get confirmationRequest => this._confirmationRequest;

  set confirmationRequest(IdentifierConfirmationRequest confirmationRequest) {
    this._confirmationRequest = confirmationRequest;
  }

  bool isSetConfirmationRequest() => this.confirmationRequest != null;

  unsetConfirmationRequest() {
    this.confirmationRequest = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case METADATA:
        return this.metaData;
      case IDENTITYPROVIDER:
        return this.identityProvider;
      case CIPHERKEYID:
        return this.cipherKeyId;
      case CIPHERTEXT:
        return this.cipherText;
      case CONFIRMATIONREQUEST:
        return this.confirmationRequest;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case METADATA:
        if (value == null) {
          unsetMetaData();
        } else {
          this.metaData = value;
        }
        break;

      case IDENTITYPROVIDER:
        if (value == null) {
          unsetIdentityProvider();
        } else {
          this.identityProvider = value;
        }
        break;

      case CIPHERKEYID:
        if (value == null) {
          unsetCipherKeyId();
        } else {
          this.cipherKeyId = value;
        }
        break;

      case CIPHERTEXT:
        if (value == null) {
          unsetCipherText();
        } else {
          this.cipherText = value;
        }
        break;

      case CONFIRMATIONREQUEST:
        if (value == null) {
          unsetConfirmationRequest();
        } else {
          this.confirmationRequest = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case METADATA:
        return isSetMetaData();
      case IDENTITYPROVIDER:
        return isSetIdentityProvider();
      case CIPHERKEYID:
        return isSetCipherKeyId();
      case CIPHERTEXT:
        return isSetCipherText();
      case CONFIRMATIONREQUEST:
        return isSetConfirmationRequest();
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
        case METADATA:
          if (field.type == TType.MAP) {
            {
              TMap _map32 = iprot.readMapBegin();
              this.metaData = new Map<String, String>();
              for (int _i33 = 0; _i33 < _map32.length; ++_i33) {
                String _key34;
                String _val35;
                _key34 = iprot.readString();
                _val35 = iprot.readString();
                this.metaData[_key34] = _val35;
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case IDENTITYPROVIDER:
          if (field.type == TType.I32) {
            this.identityProvider = iprot.readI32();
            this.__isset_identityProvider = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CIPHERKEYID:
          if (field.type == TType.STRING) {
            this.cipherKeyId = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CIPHERTEXT:
          if (field.type == TType.STRING) {
            this.cipherText = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CONFIRMATIONREQUEST:
          if (field.type == TType.STRUCT) {
            this.confirmationRequest = new IdentifierConfirmationRequest();
            this.confirmationRequest.read(iprot);
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
    if (this.metaData != null) {
      oprot.writeFieldBegin(_META_DATA_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, this.metaData.length));
        for (var elem37 in this.metaData.keys) {
          oprot.writeString(elem37);
          oprot.writeString(this.metaData[elem37]);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_IDENTITY_PROVIDER_FIELD_DESC);
    oprot.writeI32(this.identityProvider);
    oprot.writeFieldEnd();
    if (this.cipherKeyId != null) {
      oprot.writeFieldBegin(_CIPHER_KEY_ID_FIELD_DESC);
      oprot.writeString(this.cipherKeyId);
      oprot.writeFieldEnd();
    }
    if (this.cipherText != null) {
      oprot.writeFieldBegin(_CIPHER_TEXT_FIELD_DESC);
      oprot.writeString(this.cipherText);
      oprot.writeFieldEnd();
    }
    if (this.confirmationRequest != null) {
      oprot.writeFieldBegin(_CONFIRMATION_REQUEST_FIELD_DESC);
      this.confirmationRequest.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("IdentityCredentialRequest(");

    ret.write("metaData:");
    if (this.metaData == null) {
      ret.write("null");
    } else {
      ret.write(this.metaData);
    }

    ret.write(", ");
    ret.write("identityProvider:");
    String identityProvider_name = IdentityProvider.VALUES_TO_NAMES[this.identityProvider];
    if (identityProvider_name != null) {
      ret.write(identityProvider_name);
      ret.write(" (");
    }
    ret.write(this.identityProvider);
    if (identityProvider_name != null) {
      ret.write(")");
    }

    ret.write(", ");
    ret.write("cipherKeyId:");
    if (this.cipherKeyId == null) {
      ret.write("null");
    } else {
      ret.write(this.cipherKeyId);
    }

    ret.write(", ");
    ret.write("cipherText:");
    if (this.cipherText == null) {
      ret.write("null");
    } else {
      ret.write(this.cipherText);
    }

    ret.write(", ");
    ret.write("confirmationRequest:");
    if (this.confirmationRequest == null) {
      ret.write("null");
    } else {
      ret.write(this.confirmationRequest);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetIdentityProvider() && !IdentityProvider.VALID_VALUES.contains(identityProvider)) {
      throw new TProtocolError(TProtocolErrorType.UNKNOWN, "The field 'identityProvider' has been assigned the invalid value $identityProvider");
    }
  }

}

