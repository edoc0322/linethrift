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


class GetProductListWithCarrier_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getProductListWithCarrier_args"); };
  static var PRODUCT_ID_LIST_FIELD_DESC = { new TField("productIdList", TType.LIST, 2); };
  static var LANGUAGE_FIELD_DESC = { new TField("language", TType.STRING, 3); };
  static var COUNTRY_FIELD_DESC = { new TField("country", TType.STRING, 4); };
  static var CARRIER_CODE_FIELD_DESC = { new TField("carrierCode", TType.STRING, 5); };

  @:isVar
  public var productIdList(get,set) : List< String>;
  @:isVar
  public var language(get,set) : String;
  @:isVar
  public var country(get,set) : String;
  @:isVar
  public var carrierCode(get,set) : String;

  inline static var PRODUCTIDLIST_FIELD_ID : Int = 2;
  inline static var LANGUAGE_FIELD_ID : Int = 3;
  inline static var COUNTRY_FIELD_ID : Int = 4;
  inline static var CARRIERCODE_FIELD_ID : Int = 5;


  public function new() {
  }

  public function get_productIdList() : List< String> {
    return this.productIdList;
  }

  public function set_productIdList(productIdList:List< String>) : List< String> {
    this.productIdList = productIdList;
    return this.productIdList;
  }

  public function unsetProductIdList() : Void {
    this.productIdList = null;
  }

  // Returns true if field productIdList is set (has been assigned a value) and false otherwise
  public function isSetProductIdList() : Bool {
    return this.productIdList != null;
  }

  public function get_language() : String {
    return this.language;
  }

  public function set_language(language:String) : String {
    this.language = language;
    return this.language;
  }

  public function unsetLanguage() : Void {
    this.language = null;
  }

  // Returns true if field language is set (has been assigned a value) and false otherwise
  public function isSetLanguage() : Bool {
    return this.language != null;
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

  public function get_carrierCode() : String {
    return this.carrierCode;
  }

  public function set_carrierCode(carrierCode:String) : String {
    this.carrierCode = carrierCode;
    return this.carrierCode;
  }

  public function unsetCarrierCode() : Void {
    this.carrierCode = null;
  }

  // Returns true if field carrierCode is set (has been assigned a value) and false otherwise
  public function isSetCarrierCode() : Bool {
    return this.carrierCode != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case PRODUCTIDLIST_FIELD_ID:
      if (value == null) {
        unsetProductIdList();
      } else {
        this.productIdList = value;
      }

    case LANGUAGE_FIELD_ID:
      if (value == null) {
        unsetLanguage();
      } else {
        this.language = value;
      }

    case COUNTRY_FIELD_ID:
      if (value == null) {
        unsetCountry();
      } else {
        this.country = value;
      }

    case CARRIERCODE_FIELD_ID:
      if (value == null) {
        unsetCarrierCode();
      } else {
        this.carrierCode = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case PRODUCTIDLIST_FIELD_ID:
      return this.productIdList;
    case LANGUAGE_FIELD_ID:
      return this.language;
    case COUNTRY_FIELD_ID:
      return this.country;
    case CARRIERCODE_FIELD_ID:
      return this.carrierCode;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case PRODUCTIDLIST_FIELD_ID:
      return isSetProductIdList();
    case LANGUAGE_FIELD_ID:
      return isSetLanguage();
    case COUNTRY_FIELD_ID:
      return isSetCountry();
    case CARRIERCODE_FIELD_ID:
      return isSetCarrierCode();
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
          case PRODUCTIDLIST_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list939 = iprot.readListBegin();
                this.productIdList = new List< String>();
                for( _i940 in 0 ... _list939.size)
                {
                  var _elem941 : String;
                  _elem941 = iprot.readString();
                  this.productIdList.add(_elem941);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LANGUAGE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.language = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case COUNTRY_FIELD_ID:
            if (field.type == TType.STRING) {
              this.country = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CARRIERCODE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.carrierCode = iprot.readString();
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
      if (this.productIdList != null) {
        oprot.writeFieldBegin(PRODUCT_ID_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.productIdList.length));
          for( elem942 in this.productIdList)
          {
            oprot.writeString(elem942);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.language != null) {
        oprot.writeFieldBegin(LANGUAGE_FIELD_DESC);
        oprot.writeString(this.language);
        oprot.writeFieldEnd();
      }
      if (this.country != null) {
        oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
        oprot.writeString(this.country);
        oprot.writeFieldEnd();
      }
      if (this.carrierCode != null) {
        oprot.writeFieldBegin(CARRIER_CODE_FIELD_DESC);
        oprot.writeString(this.carrierCode);
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
    var ret : String = "getProductListWithCarrier_args(";
    var first : Bool = true;

    ret += "productIdList:";
    if (this.productIdList == null) {
      ret += "null";
    } else {
      ret += this.productIdList;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "language:";
    if (this.language == null) {
      ret += "null";
    } else {
      ret += this.language;
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
    if (!first) ret +=  ", ";
    ret += "carrierCode:";
    if (this.carrierCode == null) {
      ret += "null";
    } else {
      ret += this.carrierCode;
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

