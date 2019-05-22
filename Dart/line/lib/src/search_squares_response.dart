/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.search_squares_response;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SearchSquaresResponse implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SearchSquaresResponse");
  static final TField _SQUARES_FIELD_DESC = new TField("squares", TType.LIST, 1);
  static final TField _SQUARE_STATUSES_FIELD_DESC = new TField("squareStatuses", TType.MAP, 2);
  static final TField _MY_MEMBERSHIPS_FIELD_DESC = new TField("myMemberships", TType.MAP, 3);
  static final TField _CONTINUATION_TOKEN_FIELD_DESC = new TField("continuationToken", TType.STRING, 4);
  static final TField _NOTE_STATUSES_FIELD_DESC = new TField("noteStatuses", TType.MAP, 5);

  List<Square> _squares;
  static const int SQUARES = 1;
  Map<String, SquareStatus> _squareStatuses;
  static const int SQUARESTATUSES = 2;
  Map<String, SquareMember> _myMemberships;
  static const int MYMEMBERSHIPS = 3;
  String _continuationToken;
  static const int CONTINUATIONTOKEN = 4;
  Map<String, NoteStatus> _noteStatuses;
  static const int NOTESTATUSES = 5;


  SearchSquaresResponse() {
  }

  // squares
  List<Square> get squares => this._squares;

  set squares(List<Square> squares) {
    this._squares = squares;
  }

  bool isSetSquares() => this.squares != null;

  unsetSquares() {
    this.squares = null;
  }

  // squareStatuses
  Map<String, SquareStatus> get squareStatuses => this._squareStatuses;

  set squareStatuses(Map<String, SquareStatus> squareStatuses) {
    this._squareStatuses = squareStatuses;
  }

  bool isSetSquareStatuses() => this.squareStatuses != null;

  unsetSquareStatuses() {
    this.squareStatuses = null;
  }

  // myMemberships
  Map<String, SquareMember> get myMemberships => this._myMemberships;

  set myMemberships(Map<String, SquareMember> myMemberships) {
    this._myMemberships = myMemberships;
  }

  bool isSetMyMemberships() => this.myMemberships != null;

  unsetMyMemberships() {
    this.myMemberships = null;
  }

  // continuationToken
  String get continuationToken => this._continuationToken;

  set continuationToken(String continuationToken) {
    this._continuationToken = continuationToken;
  }

  bool isSetContinuationToken() => this.continuationToken != null;

  unsetContinuationToken() {
    this.continuationToken = null;
  }

  // noteStatuses
  Map<String, NoteStatus> get noteStatuses => this._noteStatuses;

  set noteStatuses(Map<String, NoteStatus> noteStatuses) {
    this._noteStatuses = noteStatuses;
  }

  bool isSetNoteStatuses() => this.noteStatuses != null;

  unsetNoteStatuses() {
    this.noteStatuses = null;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case SQUARES:
        return this.squares;
      case SQUARESTATUSES:
        return this.squareStatuses;
      case MYMEMBERSHIPS:
        return this.myMemberships;
      case CONTINUATIONTOKEN:
        return this.continuationToken;
      case NOTESTATUSES:
        return this.noteStatuses;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case SQUARES:
        if (value == null) {
          unsetSquares();
        } else {
          this.squares = value;
        }
        break;

      case SQUARESTATUSES:
        if (value == null) {
          unsetSquareStatuses();
        } else {
          this.squareStatuses = value;
        }
        break;

      case MYMEMBERSHIPS:
        if (value == null) {
          unsetMyMemberships();
        } else {
          this.myMemberships = value;
        }
        break;

      case CONTINUATIONTOKEN:
        if (value == null) {
          unsetContinuationToken();
        } else {
          this.continuationToken = value;
        }
        break;

      case NOTESTATUSES:
        if (value == null) {
          unsetNoteStatuses();
        } else {
          this.noteStatuses = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case SQUARES:
        return isSetSquares();
      case SQUARESTATUSES:
        return isSetSquareStatuses();
      case MYMEMBERSHIPS:
        return isSetMyMemberships();
      case CONTINUATIONTOKEN:
        return isSetContinuationToken();
      case NOTESTATUSES:
        return isSetNoteStatuses();
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
        case SQUARES:
          if (field.type == TType.LIST) {
            {
              TList _list504 = iprot.readListBegin();
              this.squares = new List<Square>();
              for (int _i505 = 0; _i505 < _list504.length; ++_i505) {
                Square _elem506;
                _elem506 = new Square();
                _elem506.read(iprot);
                this.squares.add(_elem506);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQUARESTATUSES:
          if (field.type == TType.MAP) {
            {
              TMap _map507 = iprot.readMapBegin();
              this.squareStatuses = new Map<String, SquareStatus>();
              for (int _i508 = 0; _i508 < _map507.length; ++_i508) {
                String _key509;
                SquareStatus _val510;
                _key509 = iprot.readString();
                _val510 = new SquareStatus();
                _val510.read(iprot);
                this.squareStatuses[_key509] = _val510;
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case MYMEMBERSHIPS:
          if (field.type == TType.MAP) {
            {
              TMap _map511 = iprot.readMapBegin();
              this.myMemberships = new Map<String, SquareMember>();
              for (int _i512 = 0; _i512 < _map511.length; ++_i512) {
                String _key513;
                SquareMember _val514;
                _key513 = iprot.readString();
                _val514 = new SquareMember();
                _val514.read(iprot);
                this.myMemberships[_key513] = _val514;
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CONTINUATIONTOKEN:
          if (field.type == TType.STRING) {
            this.continuationToken = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case NOTESTATUSES:
          if (field.type == TType.MAP) {
            {
              TMap _map515 = iprot.readMapBegin();
              this.noteStatuses = new Map<String, NoteStatus>();
              for (int _i516 = 0; _i516 < _map515.length; ++_i516) {
                String _key517;
                NoteStatus _val518;
                _key517 = iprot.readString();
                _val518 = new NoteStatus();
                _val518.read(iprot);
                this.noteStatuses[_key517] = _val518;
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
    if (this.squares != null) {
      oprot.writeFieldBegin(_SQUARES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.squares.length));
        for (var elem519 in this.squares) {
          elem519.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.squareStatuses != null) {
      oprot.writeFieldBegin(_SQUARE_STATUSES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.squareStatuses.length));
        for (var elem521 in this.squareStatuses.keys) {
          oprot.writeString(elem521);
          this.squareStatuses[elem521].write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.myMemberships != null) {
      oprot.writeFieldBegin(_MY_MEMBERSHIPS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.myMemberships.length));
        for (var elem523 in this.myMemberships.keys) {
          oprot.writeString(elem523);
          this.myMemberships[elem523].write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.continuationToken != null) {
      oprot.writeFieldBegin(_CONTINUATION_TOKEN_FIELD_DESC);
      oprot.writeString(this.continuationToken);
      oprot.writeFieldEnd();
    }
    if (this.noteStatuses != null) {
      oprot.writeFieldBegin(_NOTE_STATUSES_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.noteStatuses.length));
        for (var elem525 in this.noteStatuses.keys) {
          oprot.writeString(elem525);
          this.noteStatuses[elem525].write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SearchSquaresResponse(");

    ret.write("squares:");
    if (this.squares == null) {
      ret.write("null");
    } else {
      ret.write(this.squares);
    }

    ret.write(", ");
    ret.write("squareStatuses:");
    if (this.squareStatuses == null) {
      ret.write("null");
    } else {
      ret.write(this.squareStatuses);
    }

    ret.write(", ");
    ret.write("myMemberships:");
    if (this.myMemberships == null) {
      ret.write("null");
    } else {
      ret.write(this.myMemberships);
    }

    ret.write(", ");
    ret.write("continuationToken:");
    if (this.continuationToken == null) {
      ret.write("null");
    } else {
      ret.write(this.continuationToken);
    }

    ret.write(", ");
    ret.write("noteStatuses:");
    if (this.noteStatuses == null) {
      ret.write("null");
    } else {
      ret.write(this.noteStatuses);
    }

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

