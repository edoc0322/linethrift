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


class ProductSimple implements TBase {
  
  static var STRUCT_DESC = { new TStruct("ProductSimple"); };
  static var PRODUCT_ID_FIELD_DESC = { new TField("productId", TType.STRING, 1); };
  static var PACKAGE_ID_FIELD_DESC = { new TField("packageId", TType.I64, 2); };
  static var VERSION_FIELD_DESC = { new TField("version", TType.I32, 3); };
  static var ON_SALE_FIELD_DESC = { new TField("onSale", TType.BOOL, 4); };
  static var VALID_UNTIL_FIELD_DESC = { new TField("validUntil", TType.I64, 5); };
  static var STICKER_ID_RANGES_FIELD_DESC = { new TField("stickerIdRanges", TType.LIST, 10); };
  static var GRANTED_BY_DEFAULT_FIELD_DESC = { new TField("grantedByDefault", TType.BOOL, 41); };
  static var DISPLAY_ORDER_FIELD_DESC = { new TField("displayOrder", TType.I32, 42); };

  @:isVar
  public var productId(get,set) : String;
  @:isVar
  public var packageId(get,set) : haxe.Int64;
  @:isVar
  public var version(get,set) : haxe.Int32;
  @:isVar
  public var onSale(get,set) : Bool;
  @:isVar
  public var validUntil(get,set) : haxe.Int64;
  @:isVar
  public var stickerIdRanges(get,set) : List< StickerIdRange>;
  @:isVar
  public var grantedByDefault(get,set) : Bool;
  @:isVar
  public var displayOrder(get,set) : haxe.Int32;

  inline static var PRODUCTID_FIELD_ID : Int = 1;
  inline static var PACKAGEID_FIELD_ID : Int = 2;
  inline static var VERSION_FIELD_ID : Int = 3;
  inline static var ONSALE_FIELD_ID : Int = 4;
  inline static var VALIDUNTIL_FIELD_ID : Int = 5;
  inline static var STICKERIDRANGES_FIELD_ID : Int = 10;
  inline static var GRANTEDBYDEFAULT_FIELD_ID : Int = 41;
  inline static var DISPLAYORDER_FIELD_ID : Int = 42;

  private var __isset_packageId : Bool = false;
  private var __isset_version : Bool = false;
  private var __isset_onSale : Bool = false;
  private var __isset_validUntil : Bool = false;
  private var __isset_grantedByDefault : Bool = false;
  private var __isset_displayOrder : Bool = false;

  public function new() {
  }

  public function get_productId() : String {
    return this.productId;
  }

  public function set_productId(productId:String) : String {
    this.productId = productId;
    return this.productId;
  }

  public function unsetProductId() : Void {
    this.productId = null;
  }

  // Returns true if field productId is set (has been assigned a value) and false otherwise
  public function isSetProductId() : Bool {
    return this.productId != null;
  }

  public function get_packageId() : haxe.Int64 {
    return this.packageId;
  }

  public function set_packageId(packageId:haxe.Int64) : haxe.Int64 {
    this.packageId = packageId;
    this.__isset_packageId = true;
    return this.packageId;
  }

  public function unsetPackageId() : Void {
    this.__isset_packageId = false;
  }

  // Returns true if field packageId is set (has been assigned a value) and false otherwise
  public function isSetPackageId() : Bool {
    return this.__isset_packageId;
  }

  public function get_version() : haxe.Int32 {
    return this.version;
  }

  public function set_version(version:haxe.Int32) : haxe.Int32 {
    this.version = version;
    this.__isset_version = true;
    return this.version;
  }

  public function unsetVersion() : Void {
    this.__isset_version = false;
  }

  // Returns true if field version is set (has been assigned a value) and false otherwise
  public function isSetVersion() : Bool {
    return this.__isset_version;
  }

  public function get_onSale() : Bool {
    return this.onSale;
  }

  public function set_onSale(onSale:Bool) : Bool {
    this.onSale = onSale;
    this.__isset_onSale = true;
    return this.onSale;
  }

  public function unsetOnSale() : Void {
    this.__isset_onSale = false;
  }

  // Returns true if field onSale is set (has been assigned a value) and false otherwise
  public function isSetOnSale() : Bool {
    return this.__isset_onSale;
  }

  public function get_validUntil() : haxe.Int64 {
    return this.validUntil;
  }

  public function set_validUntil(validUntil:haxe.Int64) : haxe.Int64 {
    this.validUntil = validUntil;
    this.__isset_validUntil = true;
    return this.validUntil;
  }

  public function unsetValidUntil() : Void {
    this.__isset_validUntil = false;
  }

  // Returns true if field validUntil is set (has been assigned a value) and false otherwise
  public function isSetValidUntil() : Bool {
    return this.__isset_validUntil;
  }

  public function get_stickerIdRanges() : List< StickerIdRange> {
    return this.stickerIdRanges;
  }

  public function set_stickerIdRanges(stickerIdRanges:List< StickerIdRange>) : List< StickerIdRange> {
    this.stickerIdRanges = stickerIdRanges;
    return this.stickerIdRanges;
  }

  public function unsetStickerIdRanges() : Void {
    this.stickerIdRanges = null;
  }

  // Returns true if field stickerIdRanges is set (has been assigned a value) and false otherwise
  public function isSetStickerIdRanges() : Bool {
    return this.stickerIdRanges != null;
  }

  public function get_grantedByDefault() : Bool {
    return this.grantedByDefault;
  }

  public function set_grantedByDefault(grantedByDefault:Bool) : Bool {
    this.grantedByDefault = grantedByDefault;
    this.__isset_grantedByDefault = true;
    return this.grantedByDefault;
  }

  public function unsetGrantedByDefault() : Void {
    this.__isset_grantedByDefault = false;
  }

  // Returns true if field grantedByDefault is set (has been assigned a value) and false otherwise
  public function isSetGrantedByDefault() : Bool {
    return this.__isset_grantedByDefault;
  }

  public function get_displayOrder() : haxe.Int32 {
    return this.displayOrder;
  }

  public function set_displayOrder(displayOrder:haxe.Int32) : haxe.Int32 {
    this.displayOrder = displayOrder;
    this.__isset_displayOrder = true;
    return this.displayOrder;
  }

  public function unsetDisplayOrder() : Void {
    this.__isset_displayOrder = false;
  }

  // Returns true if field displayOrder is set (has been assigned a value) and false otherwise
  public function isSetDisplayOrder() : Bool {
    return this.__isset_displayOrder;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case PRODUCTID_FIELD_ID:
      if (value == null) {
        unsetProductId();
      } else {
        this.productId = value;
      }

    case PACKAGEID_FIELD_ID:
      if (value == null) {
        unsetPackageId();
      } else {
        this.packageId = value;
      }

    case VERSION_FIELD_ID:
      if (value == null) {
        unsetVersion();
      } else {
        this.version = value;
      }

    case ONSALE_FIELD_ID:
      if (value == null) {
        unsetOnSale();
      } else {
        this.onSale = value;
      }

    case VALIDUNTIL_FIELD_ID:
      if (value == null) {
        unsetValidUntil();
      } else {
        this.validUntil = value;
      }

    case STICKERIDRANGES_FIELD_ID:
      if (value == null) {
        unsetStickerIdRanges();
      } else {
        this.stickerIdRanges = value;
      }

    case GRANTEDBYDEFAULT_FIELD_ID:
      if (value == null) {
        unsetGrantedByDefault();
      } else {
        this.grantedByDefault = value;
      }

    case DISPLAYORDER_FIELD_ID:
      if (value == null) {
        unsetDisplayOrder();
      } else {
        this.displayOrder = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case PRODUCTID_FIELD_ID:
      return this.productId;
    case PACKAGEID_FIELD_ID:
      return this.packageId;
    case VERSION_FIELD_ID:
      return this.version;
    case ONSALE_FIELD_ID:
      return this.onSale;
    case VALIDUNTIL_FIELD_ID:
      return this.validUntil;
    case STICKERIDRANGES_FIELD_ID:
      return this.stickerIdRanges;
    case GRANTEDBYDEFAULT_FIELD_ID:
      return this.grantedByDefault;
    case DISPLAYORDER_FIELD_ID:
      return this.displayOrder;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case PRODUCTID_FIELD_ID:
      return isSetProductId();
    case PACKAGEID_FIELD_ID:
      return isSetPackageId();
    case VERSION_FIELD_ID:
      return isSetVersion();
    case ONSALE_FIELD_ID:
      return isSetOnSale();
    case VALIDUNTIL_FIELD_ID:
      return isSetValidUntil();
    case STICKERIDRANGES_FIELD_ID:
      return isSetStickerIdRanges();
    case GRANTEDBYDEFAULT_FIELD_ID:
      return isSetGrantedByDefault();
    case DISPLAYORDER_FIELD_ID:
      return isSetDisplayOrder();
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
          case PRODUCTID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.productId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PACKAGEID_FIELD_ID:
            if (field.type == TType.I64) {
              this.packageId = iprot.readI64();
              this.__isset_packageId = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case VERSION_FIELD_ID:
            if (field.type == TType.I32) {
              this.version = iprot.readI32();
              this.__isset_version = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ONSALE_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.onSale = iprot.readBool();
              this.__isset_onSale = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case VALIDUNTIL_FIELD_ID:
            if (field.type == TType.I64) {
              this.validUntil = iprot.readI64();
              this.__isset_validUntil = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case STICKERIDRANGES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list323 = iprot.readListBegin();
                this.stickerIdRanges = new List< StickerIdRange>();
                for( _i324 in 0 ... _list323.size)
                {
                  var _elem325 : StickerIdRange;
                  _elem325 = new StickerIdRange();
                  _elem325.read(iprot);
                  this.stickerIdRanges.add(_elem325);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case GRANTEDBYDEFAULT_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.grantedByDefault = iprot.readBool();
              this.__isset_grantedByDefault = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DISPLAYORDER_FIELD_ID:
            if (field.type == TType.I32) {
              this.displayOrder = iprot.readI32();
              this.__isset_displayOrder = true;
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
      if (this.productId != null) {
        oprot.writeFieldBegin(PRODUCT_ID_FIELD_DESC);
        oprot.writeString(this.productId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PACKAGE_ID_FIELD_DESC);
      oprot.writeI64(this.packageId);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeI32(this.version);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ON_SALE_FIELD_DESC);
      oprot.writeBool(this.onSale);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VALID_UNTIL_FIELD_DESC);
      oprot.writeI64(this.validUntil);
      oprot.writeFieldEnd();
      if (this.stickerIdRanges != null) {
        oprot.writeFieldBegin(STICKER_ID_RANGES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.stickerIdRanges.length));
          for( elem326 in this.stickerIdRanges)
          {
            elem326.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(GRANTED_BY_DEFAULT_FIELD_DESC);
      oprot.writeBool(this.grantedByDefault);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DISPLAY_ORDER_FIELD_DESC);
      oprot.writeI32(this.displayOrder);
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
    var ret : String = "ProductSimple(";
    var first : Bool = true;

    ret += "productId:";
    if (this.productId == null) {
      ret += "null";
    } else {
      ret += this.productId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "packageId:";
    ret += this.packageId;
    first = false;
    if (!first) ret +=  ", ";
    ret += "version:";
    ret += this.version;
    first = false;
    if (!first) ret +=  ", ";
    ret += "onSale:";
    ret += this.onSale;
    first = false;
    if (!first) ret +=  ", ";
    ret += "validUntil:";
    ret += this.validUntil;
    first = false;
    if (!first) ret +=  ", ";
    ret += "stickerIdRanges:";
    if (this.stickerIdRanges == null) {
      ret += "null";
    } else {
      ret += this.stickerIdRanges;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "grantedByDefault:";
    ret += this.grantedByDefault;
    first = false;
    if (!first) ret +=  ", ";
    ret += "displayOrder:";
    ret += this.displayOrder;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}
