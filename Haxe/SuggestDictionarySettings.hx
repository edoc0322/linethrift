/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;
import haxe.io.Bytes;
import haxe.ds.IntMap;
import haxe.ds.StringMap;
import haxe.ds.ObjectMap;

#if flash
import flash.errors.ArgumentError;
#end

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;


class SuggestDictionarySettings implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SuggestDictionarySettings"); };
  static var REVISION_FIELD_DESC = { new TField("revision", TType.I64, 1); };
  static var NEW_REVISION_FIELD_DESC = { new TField("newRevision", TType.I64, 2); };
  static var DICTIONARIES_FIELD_DESC = { new TField("dictionaries", TType.LIST, 3); };
  static var PRELOADED_DICTIONARIES_FIELD_DESC = { new TField("preloadedDictionaries", TType.LIST, 4); };

  @:isVar
  public var revision(get,set) : haxe.Int64;
  @:isVar
  public var newRevision(get,set) : haxe.Int64;
  @:isVar
  public var dictionaries(get,set) : List< SuggestDictionary>;
  @:isVar
  public var preloadedDictionaries(get,set) : List< String>;

  inline static var REVISION_FIELD_ID : Int = 1;
  inline static var NEWREVISION_FIELD_ID : Int = 2;
  inline static var DICTIONARIES_FIELD_ID : Int = 3;
  inline static var PRELOADEDDICTIONARIES_FIELD_ID : Int = 4;

  private var __isset_revision : Bool = false;
  private var __isset_newRevision : Bool = false;

  public function new() {
  }

  public function get_revision() : haxe.Int64 {
    return this.revision;
  }

  public function set_revision(revision:haxe.Int64) : haxe.Int64 {
    this.revision = revision;
    this.__isset_revision = true;
    return this.revision;
  }

  public function unsetRevision() : Void {
    this.__isset_revision = false;
  }

  // Returns true if field revision is set (has been assigned a value) and false otherwise
  public function isSetRevision() : Bool {
    return this.__isset_revision;
  }

  public function get_newRevision() : haxe.Int64 {
    return this.newRevision;
  }

  public function set_newRevision(newRevision:haxe.Int64) : haxe.Int64 {
    this.newRevision = newRevision;
    this.__isset_newRevision = true;
    return this.newRevision;
  }

  public function unsetNewRevision() : Void {
    this.__isset_newRevision = false;
  }

  // Returns true if field newRevision is set (has been assigned a value) and false otherwise
  public function isSetNewRevision() : Bool {
    return this.__isset_newRevision;
  }

  public function get_dictionaries() : List< SuggestDictionary> {
    return this.dictionaries;
  }

  public function set_dictionaries(dictionaries:List< SuggestDictionary>) : List< SuggestDictionary> {
    this.dictionaries = dictionaries;
    return this.dictionaries;
  }

  public function unsetDictionaries() : Void {
    this.dictionaries = null;
  }

  // Returns true if field dictionaries is set (has been assigned a value) and false otherwise
  public function isSetDictionaries() : Bool {
    return this.dictionaries != null;
  }

  public function get_preloadedDictionaries() : List< String> {
    return this.preloadedDictionaries;
  }

  public function set_preloadedDictionaries(preloadedDictionaries:List< String>) : List< String> {
    this.preloadedDictionaries = preloadedDictionaries;
    return this.preloadedDictionaries;
  }

  public function unsetPreloadedDictionaries() : Void {
    this.preloadedDictionaries = null;
  }

  // Returns true if field preloadedDictionaries is set (has been assigned a value) and false otherwise
  public function isSetPreloadedDictionaries() : Bool {
    return this.preloadedDictionaries != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REVISION_FIELD_ID:
      if (value == null) {
        unsetRevision();
      } else {
        this.revision = value;
      }

    case NEWREVISION_FIELD_ID:
      if (value == null) {
        unsetNewRevision();
      } else {
        this.newRevision = value;
      }

    case DICTIONARIES_FIELD_ID:
      if (value == null) {
        unsetDictionaries();
      } else {
        this.dictionaries = value;
      }

    case PRELOADEDDICTIONARIES_FIELD_ID:
      if (value == null) {
        unsetPreloadedDictionaries();
      } else {
        this.preloadedDictionaries = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REVISION_FIELD_ID:
      return this.revision;
    case NEWREVISION_FIELD_ID:
      return this.newRevision;
    case DICTIONARIES_FIELD_ID:
      return this.dictionaries;
    case PRELOADEDDICTIONARIES_FIELD_ID:
      return this.preloadedDictionaries;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REVISION_FIELD_ID:
      return isSetRevision();
    case NEWREVISION_FIELD_ID:
      return isSetNewRevision();
    case DICTIONARIES_FIELD_ID:
      return isSetDictionaries();
    case PRELOADEDDICTIONARIES_FIELD_ID:
      return isSetPreloadedDictionaries();
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function read( iprot : TProtocol) : Void {
    iprot.IncrementRecursionDepth();
    try
    {
      var field : TField;
      iprot.readStructBegin();
      while (true)
      {
        field = iprot.readFieldBegin();
        if (field.type == TType.STOP) { 
          break;
        }
        switch (field.id)
        {
          case REVISION_FIELD_ID:
            if (field.type == TType.I64) {
              this.revision = iprot.readI64();
              this.__isset_revision = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case NEWREVISION_FIELD_ID:
            if (field.type == TType.I64) {
              this.newRevision = iprot.readI64();
              this.__isset_newRevision = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DICTIONARIES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list355 = iprot.readListBegin();
                this.dictionaries = new List< SuggestDictionary>();
                for( _i356 in 0 ... _list355.size)
                {
                  var _elem357 : SuggestDictionary;
                  _elem357 = new SuggestDictionary();
                  _elem357.read(iprot);
                  this.dictionaries.add(_elem357);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PRELOADEDDICTIONARIES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list358 = iprot.readListBegin();
                this.preloadedDictionaries = new List< String>();
                for( _i359 in 0 ... _list358.size)
                {
                  var _elem360 : String;
                  _elem360 = iprot.readString();
                  this.preloadedDictionaries.add(_elem360);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          default:
            TProtocolUtil.skip(iprot, field.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      iprot.DecrementRecursionDepth();
    }
    catch(e:Dynamic)
    {
      iprot.DecrementRecursionDepth();
      throw e;
    }

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public function write(oprot:TProtocol) : Void {
    validate();
    oprot.IncrementRecursionDepth();
    try
    {
      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(this.revision);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NEW_REVISION_FIELD_DESC);
      oprot.writeI64(this.newRevision);
      oprot.writeFieldEnd();
      if (this.dictionaries != null) {
        oprot.writeFieldBegin(DICTIONARIES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.dictionaries.length));
          for( elem361 in this.dictionaries)
          {
            elem361.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.preloadedDictionaries != null) {
        oprot.writeFieldBegin(PRELOADED_DICTIONARIES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.preloadedDictionaries.length));
          for( elem362 in this.preloadedDictionaries)
          {
            oprot.writeString(elem362);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
      oprot.DecrementRecursionDepth();
    }
    catch(e:Dynamic)
    {
      oprot.DecrementRecursionDepth();
      throw e;
    }
  }

  public function toString() : String {
    var ret : String = "SuggestDictionarySettings(";
    var first : Bool = true;

    ret += "revision:";
    ret += this.revision;
    first = false;
    if (!first) ret +=  ", ";
    ret += "newRevision:";
    ret += this.newRevision;
    first = false;
    if (!first) ret +=  ", ";
    ret += "dictionaries:";
    if (this.dictionaries == null) {
      ret += "null";
    } else {
      ret += this.dictionaries;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "preloadedDictionaries:";
    if (this.preloadedDictionaries == null) {
      ret += "null";
    } else {
      ret += this.preloadedDictionaries;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
