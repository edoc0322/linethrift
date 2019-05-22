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


class PromotionInstallInfo implements TBase {
  
  static var STRUCT_DESC = { new TStruct("PromotionInstallInfo"); };
  static var DOWNLOAD_URL_FIELD_DESC = { new TField("downloadUrl", TType.STRING, 1); };
  static var CUSTOM_URL_SCHEMA_FIELD_DESC = { new TField("customUrlSchema", TType.STRING, 2); };

  @:isVar
  public var downloadUrl(get,set) : String;
  @:isVar
  public var customUrlSchema(get,set) : String;

  inline static var DOWNLOADURL_FIELD_ID : Int = 1;
  inline static var CUSTOMURLSCHEMA_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_downloadUrl() : String {
    return this.downloadUrl;
  }

  public function set_downloadUrl(downloadUrl:String) : String {
    this.downloadUrl = downloadUrl;
    return this.downloadUrl;
  }

  public function unsetDownloadUrl() : Void {
    this.downloadUrl = null;
  }

  // Returns true if field downloadUrl is set (has been assigned a value) and false otherwise
  public function isSetDownloadUrl() : Bool {
    return this.downloadUrl != null;
  }

  public function get_customUrlSchema() : String {
    return this.customUrlSchema;
  }

  public function set_customUrlSchema(customUrlSchema:String) : String {
    this.customUrlSchema = customUrlSchema;
    return this.customUrlSchema;
  }

  public function unsetCustomUrlSchema() : Void {
    this.customUrlSchema = null;
  }

  // Returns true if field customUrlSchema is set (has been assigned a value) and false otherwise
  public function isSetCustomUrlSchema() : Bool {
    return this.customUrlSchema != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case DOWNLOADURL_FIELD_ID:
      if (value == null) {
        unsetDownloadUrl();
      } else {
        this.downloadUrl = value;
      }

    case CUSTOMURLSCHEMA_FIELD_ID:
      if (value == null) {
        unsetCustomUrlSchema();
      } else {
        this.customUrlSchema = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case DOWNLOADURL_FIELD_ID:
      return this.downloadUrl;
    case CUSTOMURLSCHEMA_FIELD_ID:
      return this.customUrlSchema;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case DOWNLOADURL_FIELD_ID:
      return isSetDownloadUrl();
    case CUSTOMURLSCHEMA_FIELD_ID:
      return isSetCustomUrlSchema();
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
          case DOWNLOADURL_FIELD_ID:
            if (field.type == TType.STRING) {
              this.downloadUrl = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CUSTOMURLSCHEMA_FIELD_ID:
            if (field.type == TType.STRING) {
              this.customUrlSchema = iprot.readString();
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
      if (this.downloadUrl != null) {
        oprot.writeFieldBegin(DOWNLOAD_URL_FIELD_DESC);
        oprot.writeString(this.downloadUrl);
        oprot.writeFieldEnd();
      }
      if (this.customUrlSchema != null) {
        oprot.writeFieldBegin(CUSTOM_URL_SCHEMA_FIELD_DESC);
        oprot.writeString(this.customUrlSchema);
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
    var ret : String = "PromotionInstallInfo(";
    var first : Bool = true;

    ret += "downloadUrl:";
    if (this.downloadUrl == null) {
      ret += "null";
    } else {
      ret += this.downloadUrl;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "customUrlSchema:";
    if (this.customUrlSchema == null) {
      ret += "null";
    } else {
      ret += this.customUrlSchema;
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

