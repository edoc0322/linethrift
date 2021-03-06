/**
 * Autogenerated by Thrift Compiler (0.13.0)
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


class ProductCategory implements TBase {
  
  static var STRUCT_DESC = { new TStruct("ProductCategory"); };
  static var PRODUCT_CATEGORY_ID_FIELD_DESC = { new TField("productCategoryId", TType.I64, 1); };
  static var TITLE_FIELD_DESC = { new TField("title", TType.STRING, 2); };
  static var PRODUCT_COUNT_FIELD_DESC = { new TField("productCount", TType.I32, 3); };
  static var NEW_FLAG_FIELD_DESC = { new TField("newFlag", TType.BOOL, 4); };

  @:isVar
  public var productCategoryId(get,set) : haxe.Int64;
  @:isVar
  public var title(get,set) : String;
  @:isVar
  public var productCount(get,set) : haxe.Int32;
  @:isVar
  public var newFlag(get,set) : Bool;

  inline static var PRODUCTCATEGORYID_FIELD_ID : Int = 1;
  inline static var TITLE_FIELD_ID : Int = 2;
  inline static var PRODUCTCOUNT_FIELD_ID : Int = 3;
  inline static var NEWFLAG_FIELD_ID : Int = 4;

  private var __isset_productCategoryId : Bool = false;
  private var __isset_productCount : Bool = false;
  private var __isset_newFlag : Bool = false;

  public function new() {
  }

  public function get_productCategoryId() : haxe.Int64 {
    return this.productCategoryId;
  }

  public function set_productCategoryId(productCategoryId:haxe.Int64) : haxe.Int64 {
    this.productCategoryId = productCategoryId;
    this.__isset_productCategoryId = true;
    return this.productCategoryId;
  }

  public function unsetProductCategoryId() : Void {
    this.__isset_productCategoryId = false;
  }

  // Returns true if field productCategoryId is set (has been assigned a value) and false otherwise
  public function isSetProductCategoryId() : Bool {
    return this.__isset_productCategoryId;
  }

  public function get_title() : String {
    return this.title;
  }

  public function set_title(title:String) : String {
    this.title = title;
    return this.title;
  }

  public function unsetTitle() : Void {
    this.title = null;
  }

  // Returns true if field title is set (has been assigned a value) and false otherwise
  public function isSetTitle() : Bool {
    return this.title != null;
  }

  public function get_productCount() : haxe.Int32 {
    return this.productCount;
  }

  public function set_productCount(productCount:haxe.Int32) : haxe.Int32 {
    this.productCount = productCount;
    this.__isset_productCount = true;
    return this.productCount;
  }

  public function unsetProductCount() : Void {
    this.__isset_productCount = false;
  }

  // Returns true if field productCount is set (has been assigned a value) and false otherwise
  public function isSetProductCount() : Bool {
    return this.__isset_productCount;
  }

  public function get_newFlag() : Bool {
    return this.newFlag;
  }

  public function set_newFlag(newFlag:Bool) : Bool {
    this.newFlag = newFlag;
    this.__isset_newFlag = true;
    return this.newFlag;
  }

  public function unsetNewFlag() : Void {
    this.__isset_newFlag = false;
  }

  // Returns true if field newFlag is set (has been assigned a value) and false otherwise
  public function isSetNewFlag() : Bool {
    return this.__isset_newFlag;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case PRODUCTCATEGORYID_FIELD_ID:
      if (value == null) {
        unsetProductCategoryId();
      } else {
        this.productCategoryId = value;
      }

    case TITLE_FIELD_ID:
      if (value == null) {
        unsetTitle();
      } else {
        this.title = value;
      }

    case PRODUCTCOUNT_FIELD_ID:
      if (value == null) {
        unsetProductCount();
      } else {
        this.productCount = value;
      }

    case NEWFLAG_FIELD_ID:
      if (value == null) {
        unsetNewFlag();
      } else {
        this.newFlag = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case PRODUCTCATEGORYID_FIELD_ID:
      return this.productCategoryId;
    case TITLE_FIELD_ID:
      return this.title;
    case PRODUCTCOUNT_FIELD_ID:
      return this.productCount;
    case NEWFLAG_FIELD_ID:
      return this.newFlag;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case PRODUCTCATEGORYID_FIELD_ID:
      return isSetProductCategoryId();
    case TITLE_FIELD_ID:
      return isSetTitle();
    case PRODUCTCOUNT_FIELD_ID:
      return isSetProductCount();
    case NEWFLAG_FIELD_ID:
      return isSetNewFlag();
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
          case PRODUCTCATEGORYID_FIELD_ID:
            if (field.type == TType.I64) {
              this.productCategoryId = iprot.readI64();
              this.__isset_productCategoryId = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TITLE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.title = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PRODUCTCOUNT_FIELD_ID:
            if (field.type == TType.I32) {
              this.productCount = iprot.readI32();
              this.__isset_productCount = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case NEWFLAG_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.newFlag = iprot.readBool();
              this.__isset_newFlag = true;
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
      oprot.writeFieldBegin(PRODUCT_CATEGORY_ID_FIELD_DESC);
      oprot.writeI64(this.productCategoryId);
      oprot.writeFieldEnd();
      if (this.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(this.title);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PRODUCT_COUNT_FIELD_DESC);
      oprot.writeI32(this.productCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NEW_FLAG_FIELD_DESC);
      oprot.writeBool(this.newFlag);
      oprot.writeFieldEnd();
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
    var ret : String = "ProductCategory(";
    var first : Bool = true;

    ret += "productCategoryId:";
    ret += this.productCategoryId;
    first = false;
    if (!first) ret +=  ", ";
    ret += "title:";
    if (this.title == null) {
      ret += "null";
    } else {
      ret += this.title;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "productCount:";
    ret += this.productCount;
    first = false;
    if (!first) ret +=  ", ";
    ret += "newFlag:";
    ret += this.newFlag;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

