/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.search_result_collection;

import 'dart:typed_data' show Uint8List;
import 'package:thrift/thrift.dart';
import 'package:line/line.dart';

class SearchResultCollection implements TBase {
  static final TStruct _STRUCT_DESC = new TStruct("SearchResultCollection");
  static final TField _COLLECTION_FIELD_DESC = new TField("collection", TType.I32, 1);
  static final TField _TITLE_FIELD_DESC = new TField("title", TType.STRING, 2);
  static final TField _RANK_FIELD_DESC = new TField("rank", TType.I32, 3);
  static final TField _HITS_FIELD_DESC = new TField("hits", TType.I32, 4);
  static final TField _ITEMS_FIELD_DESC = new TField("items", TType.LIST, 5);
  static final TField _HAS_NEXT_FIELD_DESC = new TField("hasNext", TType.BOOL, 6);
  static final TField _CAT_FIELD_DESC = new TField("cat", TType.LIST, 7);
  static final TField _ERROR_FIELD_DESC = new TField("error", TType.STRING, 8);
  static final TField _TAB_TITLE_FIELD_DESC = new TField("tabTitle", TType.STRING, 9);
  static final TField _START_FIELD_DESC = new TField("start", TType.I32, 10);
  static final TField _LENGTH_FIELD_DESC = new TField("length", TType.I32, 11);
  static final TField _SQUARE_CATEGORY_ID_FIELD_DESC = new TField("squareCategoryId", TType.I32, 12);

  int _collection = 0;
  static const int COLLECTION = 1;
  String _title;
  static const int TITLE = 2;
  int _rank = 0;
  static const int RANK = 3;
  int _hits = 0;
  static const int HITS = 4;
  List<SearchResultItem> _items;
  static const int ITEMS = 5;
  bool _hasNext = false;
  static const int HASNEXT = 6;
  List<int> _cat;
  static const int CAT = 7;
  String _error;
  static const int ERROR = 8;
  String _tabTitle;
  static const int TABTITLE = 9;
  int _start = 0;
  static const int START = 10;
  int _length = 0;
  static const int LENGTH = 11;
  int _squareCategoryId = 0;
  static const int SQUARECATEGORYID = 12;

  bool __isset_collection = false;
  bool __isset_rank = false;
  bool __isset_hits = false;
  bool __isset_hasNext = false;
  bool __isset_start = false;
  bool __isset_length = false;
  bool __isset_squareCategoryId = false;

  SearchResultCollection() {
  }

  // collection
  int get collection => this._collection;

  set collection(int collection) {
    this._collection = collection;
    this.__isset_collection = true;
  }

  bool isSetCollection() => this.__isset_collection;

  unsetCollection() {
    this.__isset_collection = false;
  }

  // title
  String get title => this._title;

  set title(String title) {
    this._title = title;
  }

  bool isSetTitle() => this.title != null;

  unsetTitle() {
    this.title = null;
  }

  // rank
  int get rank => this._rank;

  set rank(int rank) {
    this._rank = rank;
    this.__isset_rank = true;
  }

  bool isSetRank() => this.__isset_rank;

  unsetRank() {
    this.__isset_rank = false;
  }

  // hits
  int get hits => this._hits;

  set hits(int hits) {
    this._hits = hits;
    this.__isset_hits = true;
  }

  bool isSetHits() => this.__isset_hits;

  unsetHits() {
    this.__isset_hits = false;
  }

  // items
  List<SearchResultItem> get items => this._items;

  set items(List<SearchResultItem> items) {
    this._items = items;
  }

  bool isSetItems() => this.items != null;

  unsetItems() {
    this.items = null;
  }

  // hasNext
  bool get hasNext => this._hasNext;

  set hasNext(bool hasNext) {
    this._hasNext = hasNext;
    this.__isset_hasNext = true;
  }

  bool isSetHasNext() => this.__isset_hasNext;

  unsetHasNext() {
    this.__isset_hasNext = false;
  }

  // cat
  List<int> get cat => this._cat;

  set cat(List<int> cat) {
    this._cat = cat;
  }

  bool isSetCat() => this.cat != null;

  unsetCat() {
    this.cat = null;
  }

  // error
  String get error => this._error;

  set error(String error) {
    this._error = error;
  }

  bool isSetError() => this.error != null;

  unsetError() {
    this.error = null;
  }

  // tabTitle
  String get tabTitle => this._tabTitle;

  set tabTitle(String tabTitle) {
    this._tabTitle = tabTitle;
  }

  bool isSetTabTitle() => this.tabTitle != null;

  unsetTabTitle() {
    this.tabTitle = null;
  }

  // start
  int get start => this._start;

  set start(int start) {
    this._start = start;
    this.__isset_start = true;
  }

  bool isSetStart() => this.__isset_start;

  unsetStart() {
    this.__isset_start = false;
  }

  // length
  int get length => this._length;

  set length(int length) {
    this._length = length;
    this.__isset_length = true;
  }

  bool isSetLength() => this.__isset_length;

  unsetLength() {
    this.__isset_length = false;
  }

  // squareCategoryId
  int get squareCategoryId => this._squareCategoryId;

  set squareCategoryId(int squareCategoryId) {
    this._squareCategoryId = squareCategoryId;
    this.__isset_squareCategoryId = true;
  }

  bool isSetSquareCategoryId() => this.__isset_squareCategoryId;

  unsetSquareCategoryId() {
    this.__isset_squareCategoryId = false;
  }

  getFieldValue(int fieldID) {
    switch (fieldID) {
      case COLLECTION:
        return this.collection;
      case TITLE:
        return this.title;
      case RANK:
        return this.rank;
      case HITS:
        return this.hits;
      case ITEMS:
        return this.items;
      case HASNEXT:
        return this.hasNext;
      case CAT:
        return this.cat;
      case ERROR:
        return this.error;
      case TABTITLE:
        return this.tabTitle;
      case START:
        return this.start;
      case LENGTH:
        return this.length;
      case SQUARECATEGORYID:
        return this.squareCategoryId;
      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
      case COLLECTION:
        if (value == null) {
          unsetCollection();
        } else {
          this.collection = value;
        }
        break;

      case TITLE:
        if (value == null) {
          unsetTitle();
        } else {
          this.title = value;
        }
        break;

      case RANK:
        if (value == null) {
          unsetRank();
        } else {
          this.rank = value;
        }
        break;

      case HITS:
        if (value == null) {
          unsetHits();
        } else {
          this.hits = value;
        }
        break;

      case ITEMS:
        if (value == null) {
          unsetItems();
        } else {
          this.items = value;
        }
        break;

      case HASNEXT:
        if (value == null) {
          unsetHasNext();
        } else {
          this.hasNext = value;
        }
        break;

      case CAT:
        if (value == null) {
          unsetCat();
        } else {
          this.cat = value;
        }
        break;

      case ERROR:
        if (value == null) {
          unsetError();
        } else {
          this.error = value;
        }
        break;

      case TABTITLE:
        if (value == null) {
          unsetTabTitle();
        } else {
          this.tabTitle = value;
        }
        break;

      case START:
        if (value == null) {
          unsetStart();
        } else {
          this.start = value;
        }
        break;

      case LENGTH:
        if (value == null) {
          unsetLength();
        } else {
          this.length = value;
        }
        break;

      case SQUARECATEGORYID:
        if (value == null) {
          unsetSquareCategoryId();
        } else {
          this.squareCategoryId = value;
        }
        break;

      default:
        throw new ArgumentError("Field $fieldID doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  bool isSet(int fieldID) {
    switch (fieldID) {
      case COLLECTION:
        return isSetCollection();
      case TITLE:
        return isSetTitle();
      case RANK:
        return isSetRank();
      case HITS:
        return isSetHits();
      case ITEMS:
        return isSetItems();
      case HASNEXT:
        return isSetHasNext();
      case CAT:
        return isSetCat();
      case ERROR:
        return isSetError();
      case TABTITLE:
        return isSetTabTitle();
      case START:
        return isSetStart();
      case LENGTH:
        return isSetLength();
      case SQUARECATEGORYID:
        return isSetSquareCategoryId();
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
        case COLLECTION:
          if (field.type == TType.I32) {
            this.collection = iprot.readI32();
            this.__isset_collection = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TITLE:
          if (field.type == TType.STRING) {
            this.title = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case RANK:
          if (field.type == TType.I32) {
            this.rank = iprot.readI32();
            this.__isset_rank = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case HITS:
          if (field.type == TType.I32) {
            this.hits = iprot.readI32();
            this.__isset_hits = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ITEMS:
          if (field.type == TType.LIST) {
            {
              TList _list70 = iprot.readListBegin();
              this.items = new List<SearchResultItem>();
              for (int _i71 = 0; _i71 < _list70.length; ++_i71) {
                SearchResultItem _elem72;
                _elem72 = new SearchResultItem();
                _elem72.read(iprot);
                this.items.add(_elem72);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case HASNEXT:
          if (field.type == TType.BOOL) {
            this.hasNext = iprot.readBool();
            this.__isset_hasNext = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CAT:
          if (field.type == TType.LIST) {
            {
              TList _list73 = iprot.readListBegin();
              this.cat = new List<int>();
              for (int _i74 = 0; _i74 < _list73.length; ++_i74) {
                int _elem75;
                _elem75 = iprot.readI32();
                this.cat.add(_elem75);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case ERROR:
          if (field.type == TType.STRING) {
            this.error = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case TABTITLE:
          if (field.type == TType.STRING) {
            this.tabTitle = iprot.readString();
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case START:
          if (field.type == TType.I32) {
            this.start = iprot.readI32();
            this.__isset_start = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LENGTH:
          if (field.type == TType.I32) {
            this.length = iprot.readI32();
            this.__isset_length = true;
          } else {
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SQUARECATEGORYID:
          if (field.type == TType.I32) {
            this.squareCategoryId = iprot.readI32();
            this.__isset_squareCategoryId = true;
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
    oprot.writeFieldBegin(_COLLECTION_FIELD_DESC);
    oprot.writeI32(this.collection);
    oprot.writeFieldEnd();
    if (this.title != null) {
      oprot.writeFieldBegin(_TITLE_FIELD_DESC);
      oprot.writeString(this.title);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_RANK_FIELD_DESC);
    oprot.writeI32(this.rank);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_HITS_FIELD_DESC);
    oprot.writeI32(this.hits);
    oprot.writeFieldEnd();
    if (this.items != null) {
      oprot.writeFieldBegin(_ITEMS_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.items.length));
        for (var elem76 in this.items) {
          elem76.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_HAS_NEXT_FIELD_DESC);
    oprot.writeBool(this.hasNext);
    oprot.writeFieldEnd();
    if (this.cat != null) {
      oprot.writeFieldBegin(_CAT_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.cat.length));
        for (var elem77 in this.cat) {
          oprot.writeI32(elem77);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.error != null) {
      oprot.writeFieldBegin(_ERROR_FIELD_DESC);
      oprot.writeString(this.error);
      oprot.writeFieldEnd();
    }
    if (this.tabTitle != null) {
      oprot.writeFieldBegin(_TAB_TITLE_FIELD_DESC);
      oprot.writeString(this.tabTitle);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(_START_FIELD_DESC);
    oprot.writeI32(this.start);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_LENGTH_FIELD_DESC);
    oprot.writeI32(this.length);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(_SQUARE_CATEGORY_ID_FIELD_DESC);
    oprot.writeI32(this.squareCategoryId);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  String toString() {
    StringBuffer ret = new StringBuffer("SearchResultCollection(");

    ret.write("collection:");
    ret.write(this.collection);

    ret.write(", ");
    ret.write("title:");
    if (this.title == null) {
      ret.write("null");
    } else {
      ret.write(this.title);
    }

    ret.write(", ");
    ret.write("rank:");
    ret.write(this.rank);

    ret.write(", ");
    ret.write("hits:");
    ret.write(this.hits);

    ret.write(", ");
    ret.write("items:");
    if (this.items == null) {
      ret.write("null");
    } else {
      ret.write(this.items);
    }

    ret.write(", ");
    ret.write("hasNext:");
    ret.write(this.hasNext);

    ret.write(", ");
    ret.write("cat:");
    if (this.cat == null) {
      ret.write("null");
    } else {
      ret.write(this.cat);
    }

    ret.write(", ");
    ret.write("error:");
    if (this.error == null) {
      ret.write("null");
    } else {
      ret.write(this.error);
    }

    ret.write(", ");
    ret.write("tabTitle:");
    if (this.tabTitle == null) {
      ret.write("null");
    } else {
      ret.write(this.tabTitle);
    }

    ret.write(", ");
    ret.write("start:");
    ret.write(this.start);

    ret.write(", ");
    ret.write("length:");
    ret.write(this.length);

    ret.write(", ");
    ret.write("squareCategoryId:");
    ret.write(this.squareCategoryId);

    ret.write(")");

    return ret.toString();
  }

  validate() {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

