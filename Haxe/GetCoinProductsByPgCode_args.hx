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


class GetCoinProductsByPgCode_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("getCoinProductsByPgCode_args"); };
  static var APP_STORE_CODE_FIELD_DESC = { new TField("appStoreCode", TType.I32, 2); };
  static var PG_CODE_FIELD_DESC = { new TField("pgCode", TType.I32, 3); };
  static var COUNTRY_FIELD_DESC = { new TField("country", TType.STRING, 4); };
  static var LANGUAGE_FIELD_DESC = { new TField("language", TType.STRING, 5); };

  @:isVar
  public var appStoreCode(get,set) : Int;
  @:isVar
  public var pgCode(get,set) : Int;
  @:isVar
  public var country(get,set) : String;
  @:isVar
  public var language(get,set) : String;

  inline static var APPSTORECODE_FIELD_ID : Int = 2;
  inline static var PGCODE_FIELD_ID : Int = 3;
  inline static var COUNTRY_FIELD_ID : Int = 4;
  inline static var LANGUAGE_FIELD_ID : Int = 5;

  private var __isset_appStoreCode : Bool = false;
  private var __isset_pgCode : Bool = false;

  public function new() {
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

  public function get_pgCode() : Int {
    return this.pgCode;
  }

  public function set_pgCode(pgCode:Int) : Int {
    this.pgCode = pgCode;
    this.__isset_pgCode = true;
    return this.pgCode;
  }

  public function unsetPgCode() : Void {
    this.__isset_pgCode = false;
  }

  // Returns true if field pgCode is set (has been assigned a value) and false otherwise
  public function isSetPgCode() : Bool {
    return this.__isset_pgCode;
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

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case APPSTORECODE_FIELD_ID:
      if (value == null) {
        unsetAppStoreCode();
      } else {
        this.appStoreCode = value;
      }

    case PGCODE_FIELD_ID:
      if (value == null) {
        unsetPgCode();
      } else {
        this.pgCode = value;
      }

    case COUNTRY_FIELD_ID:
      if (value == null) {
        unsetCountry();
      } else {
        this.country = value;
      }

    case LANGUAGE_FIELD_ID:
      if (value == null) {
        unsetLanguage();
      } else {
        this.language = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case APPSTORECODE_FIELD_ID:
      return this.appStoreCode;
    case PGCODE_FIELD_ID:
      return this.pgCode;
    case COUNTRY_FIELD_ID:
      return this.country;
    case LANGUAGE_FIELD_ID:
      return this.language;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case APPSTORECODE_FIELD_ID:
      return isSetAppStoreCode();
    case PGCODE_FIELD_ID:
      return isSetPgCode();
    case COUNTRY_FIELD_ID:
      return isSetCountry();
    case LANGUAGE_FIELD_ID:
      return isSetLanguage();
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
          case APPSTORECODE_FIELD_ID:
            if (field.type == TType.I32) {
              this.appStoreCode = iprot.readI32();
              this.__isset_appStoreCode = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PGCODE_FIELD_ID:
            if (field.type == TType.I32) {
              this.pgCode = iprot.readI32();
              this.__isset_pgCode = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case COUNTRY_FIELD_ID:
            if (field.type == TType.STRING) {
              this.country = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LANGUAGE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.language = iprot.readString();
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
      oprot.writeFieldBegin(APP_STORE_CODE_FIELD_DESC);
      oprot.writeI32(this.appStoreCode);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PG_CODE_FIELD_DESC);
      oprot.writeI32(this.pgCode);
      oprot.writeFieldEnd();
      if (this.country != null) {
        oprot.writeFieldBegin(COUNTRY_FIELD_DESC);
        oprot.writeString(this.country);
        oprot.writeFieldEnd();
      }
      if (this.language != null) {
        oprot.writeFieldBegin(LANGUAGE_FIELD_DESC);
        oprot.writeString(this.language);
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
    var ret : String = "getCoinProductsByPgCode_args(";
    var first : Bool = true;

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
    ret += "pgCode:";
    var pgCode_name : String = .PaymentPgType.VALUES_TO_NAMES[this.pgCode];
    if (pgCode_name != null) {
      ret += pgCode_name;
      ret += " (";
    }
    ret += this.pgCode;
    if (pgCode_name != null) {
      ret += ")";
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
    ret += "language:";
    if (this.language == null) {
      ret += "null";
    } else {
      ret += this.language;
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
    if (isSetPgCode() && !.PaymentPgType.VALID_VALUES.contains(pgCode)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'pgCode' has been assigned the invalid value " + pgCode);
    }
  }

}

