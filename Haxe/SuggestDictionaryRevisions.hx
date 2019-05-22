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


class SuggestDictionaryRevisions implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SuggestDictionaryRevisions"); };
  static var ITEM_REVISION_FIELD_DESC = { new TField("itemRevision", TType.STRUCT, 1); };
  static var TAG_REVISIONS_FIELD_DESC = { new TField("tagRevisions", TType.LIST, 2); };

  @:isVar
  public var itemRevision(get,set) : SuggestItemDictionaryRevision;
  @:isVar
  public var tagRevisions(get,set) : List< SuggestTagDictionaryRevision>;

  inline static var ITEMREVISION_FIELD_ID : Int = 1;
  inline static var TAGREVISIONS_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_itemRevision() : SuggestItemDictionaryRevision {
    return this.itemRevision;
  }

  public function set_itemRevision(itemRevision:SuggestItemDictionaryRevision) : SuggestItemDictionaryRevision {
    this.itemRevision = itemRevision;
    return this.itemRevision;
  }

  public function unsetItemRevision() : Void {
    this.itemRevision = null;
  }

  // Returns true if field itemRevision is set (has been assigned a value) and false otherwise
  public function isSetItemRevision() : Bool {
    return this.itemRevision != null;
  }

  public function get_tagRevisions() : List< SuggestTagDictionaryRevision> {
    return this.tagRevisions;
  }

  public function set_tagRevisions(tagRevisions:List< SuggestTagDictionaryRevision>) : List< SuggestTagDictionaryRevision> {
    this.tagRevisions = tagRevisions;
    return this.tagRevisions;
  }

  public function unsetTagRevisions() : Void {
    this.tagRevisions = null;
  }

  // Returns true if field tagRevisions is set (has been assigned a value) and false otherwise
  public function isSetTagRevisions() : Bool {
    return this.tagRevisions != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case ITEMREVISION_FIELD_ID:
      if (value == null) {
        unsetItemRevision();
      } else {
        this.itemRevision = value;
      }

    case TAGREVISIONS_FIELD_ID:
      if (value == null) {
        unsetTagRevisions();
      } else {
        this.tagRevisions = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case ITEMREVISION_FIELD_ID:
      return this.itemRevision;
    case TAGREVISIONS_FIELD_ID:
      return this.tagRevisions;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case ITEMREVISION_FIELD_ID:
      return isSetItemRevision();
    case TAGREVISIONS_FIELD_ID:
      return isSetTagRevisions();
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
          case ITEMREVISION_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.itemRevision = new SuggestItemDictionaryRevision();
              this.itemRevision.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TAGREVISIONS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list351 = iprot.readListBegin();
                this.tagRevisions = new List< SuggestTagDictionaryRevision>();
                for( _i352 in 0 ... _list351.size)
                {
                  var _elem353 : SuggestTagDictionaryRevision;
                  _elem353 = new SuggestTagDictionaryRevision();
                  _elem353.read(iprot);
                  this.tagRevisions.add(_elem353);
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
      if (this.itemRevision != null) {
        oprot.writeFieldBegin(ITEM_REVISION_FIELD_DESC);
        this.itemRevision.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.tagRevisions != null) {
        oprot.writeFieldBegin(TAG_REVISIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.tagRevisions.length));
          for( elem354 in this.tagRevisions)
          {
            elem354.write(oprot);
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
    var ret : String = "SuggestDictionaryRevisions(";
    var first : Bool = true;

    ret += "itemRevision:";
    if (this.itemRevision == null) {
      ret += "null";
    } else {
      ret += this.itemRevision;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "tagRevisions:";
    if (this.tagRevisions == null) {
      ret += "null";
    } else {
      ret += this.tagRevisions;
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

