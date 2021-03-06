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


class CoinUseReservation implements TBase {
  
  static var STRUCT_DESC = { new TStruct("CoinUseReservation"); };
  static var CHANNEL_ID_FIELD_DESC = { new TField("channelId", TType.STRING, 1); };
  static var SHOP_ORDER_ID_FIELD_DESC = { new TField("shopOrderId", TType.STRING, 2); };
  static var APP_STORE_CODE_FIELD_DESC = { new TField("appStoreCode", TType.I32, 3); };
  static var ITEMS_FIELD_DESC = { new TField("items", TType.LIST, 4); };
  static var COUNTRY_FIELD_DESC = { new TField("country", TType.STRING, 5); };

  @:isVar
  public var channelId(get,set) : String;
  @:isVar
  public var shopOrderId(get,set) : String;
  @:isVar
  public var appStoreCode(get,set) : Int;
  @:isVar
  public var items(get,set) : List< CoinUseReservationItem>;
  @:isVar
  public var country(get,set) : String;

  inline static var CHANNELID_FIELD_ID : Int = 1;
  inline static var SHOPORDERID_FIELD_ID : Int = 2;
  inline static var APPSTORECODE_FIELD_ID : Int = 3;
  inline static var ITEMS_FIELD_ID : Int = 4;
  inline static var COUNTRY_FIELD_ID : Int = 5;

  private var __isset_appStoreCode : Bool = false;

  public function new() {
  }

  public function get_channelId() : String {
    return this.channelId;
  }

  public function set_channelId(channelId:String) : String {
    this.channelId = channelId;
    return this.channelId;
  }

  public function unsetChannelId() : Void {
    this.channelId = null;
  }

  // Returns true if field channelId is set (has been assigned a value) and false otherwise
  public function isSetChannelId() : Bool {
    return this.channelId != null;
  }

  public function get_shopOrderId() : String {
    return this.shopOrderId;
  }

  public function set_shopOrderId(shopOrderId:String) : String {
    this.shopOrderId = shopOrderId;
    return this.shopOrderId;
  }

  public function unsetShopOrderId() : Void {
    this.shopOrderId = null;
  }

  // Returns true if field shopOrderId is set (has been assigned a value) and false otherwise
  public function isSetShopOrderId() : Bool {
    return this.shopOrderId != null;
  }

  public function get_appStoreCode() : Int {
    return this.appStoreCode;
  }

  public function set_appStoreCode(appStoreCode:Int) : Int {
    this.appStoreCode = appStoreCode;
    this.__isset_appStoreCode = true;
    return this.appStoreCode;
  }

  public function unsetAppStoreCode() : Void {
    this.__isset_appStoreCode = false;
  }

  // Returns true if field appStoreCode is set (has been assigned a value) and false otherwise
  public function isSetAppStoreCode() : Bool {
    return this.__isset_appStoreCode;
  }

  public function get_items() : List< CoinUseReservationItem> {
    return this.items;
  }

  public function set_items(items:List< CoinUseReservationItem>) : List< CoinUseReservationItem> {
    this.items = items;
    return this.items;
  }

  public function unsetItems() : Void {
    this.items = null;
  }

  // Returns true if field items is set (has been assigned a value) and false otherwise
  public function isSetItems() : Bool {
    return this.items != null;
  }

  public function get_country() : String {
    return this.country;
  }

  public function set_country(country:String) : String {
    this.country = country;
    return this.country;
  }

  public function unsetCountry() : Void {
    this.country = null;
  }

  // Returns true if field country is set (has been assigned a value) and false otherwise
  public function isSetCountry() : Bool {
    return this.country != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case CHANNELID_FIELD_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        this.channelId = value;
      }

    case SHOPORDERID_FIELD_ID:
      if (value == null) {
        unsetShopOrderId();
      } else {
        this.shopOrderId = value;
      }

    case APPSTORECODE_FIELD_ID:
      if (value == null) {
        unsetAppStoreCode();
      } else {
        this.appStoreCode = value;
      }

    case ITEMS_FIELD_ID:
      if (value == null) {
        unsetItems();
      } else {
        this.items = value;
      }

    case COUNTRY_FIELD_ID:
      if (value == null) {
        unsetCountry();
      } else {
        this.country = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case CHANNELID_FIELD_ID:
      return this.channelId;
    case SHOPORDERID_FIELD_ID:
      return this.shopOrderId;
    case APPSTORECODE_FIELD_ID:
      return this.appStoreCode;
    case ITEMS_FIELD_ID:
      return this.items;
    case COUNTRY_FIELD_ID:
      return this.country;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case CHANNELID_FIELD_ID:
      return isSetChannelId();
    case SHOPORDERID_FIELD_ID:
      return isSetShopOrderId();
    case APPSTORECODE_FIELD_ID:
      return isSetAppStoreCode();
    case ITEMS_FIELD_ID:
      return isSetItems();
    case COUNTRY_FIELD_ID:
      return isSetCountry();
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
          case CHANNELID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.channelId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SHOPORDERID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.shopOrderId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case APPSTORECODE_FIELD_ID:
            if (field.type == TType.I32) {
              this.appStoreCode = iprot.readI32();
              this.__isset_appStoreCode = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ITEMS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list119 = iprot.readListBegin();
                this.items = new List< CoinUseReservationItem>();
                for( _i120 in 0 ... _list119.size)
                {
                  var _elem121 : CoinUseReservationItem;
                  _elem121 = new CoinUseReservationItem();
                  _elem121.read(iprot);
                  this.items.add(_elem121);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case COUNTRY_FIELD_ID:
            if (field.type == TType.STRING) {
              this.country = iprot.readString();
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
      if (this.channelId != null) {
        oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
        oprot.writeString(this.channelId);
        oprot.writeFieldEnd();
      }
      if (this.shopOrderId != null) {
        oprot.writeFieldBegin(SHOP_ORDER_ID_FIELD_DESC);
        oprot.writeString(this.shopOrderId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(APP_STORE_CODE_FIELD_DESC);
      oprot.writeI32(this.appStoreCode);
      oprot.writeFieldEnd();
      if (this.items != null) {
        oprot.writeFieldBegin(ITEMS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.items.length));
          for( elem122 in this.items)
          {
            elem122.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.country != null) {
        oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
        oprot.writeString(this.country);
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
    var ret : String = "CoinUseReservation(";
    var first : Bool = true;

    ret += "channelId:";
    if (this.channelId == null) {
      ret += "null";
    } else {
      ret += this.channelId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "shopOrderId:";
    if (this.shopOrderId == null) {
      ret += "null";
    } else {
      ret += this.shopOrderId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "appStoreCode:";
    var appStoreCode_name : String = .PaymentType.VALUES_TO_NAMES[this.appStoreCode];
    if (appStoreCode_name != null) {
      ret += appStoreCode_name;
      ret += " (";
    }
    ret += this.appStoreCode;
    if (appStoreCode_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "items:";
    if (this.items == null) {
      ret += "null";
    } else {
      ret += this.items;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "country:";
    if (this.country == null) {
      ret += "null";
    } else {
      ret += this.country;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetAppStoreCode() && !.PaymentType.VALID_VALUES.contains(appStoreCode)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'appStoreCode' has been assigned the invalid value " + appStoreCode);
    }
  }

}

