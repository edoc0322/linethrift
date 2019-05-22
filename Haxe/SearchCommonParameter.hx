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


class SearchCommonParameter implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SearchCommonParameter"); };
  static var LATITUDE_FIELD_DESC = { new TField("latitude", TType.DOUBLE, 1); };
  static var LONGITUDE_FIELD_DESC = { new TField("longitude", TType.DOUBLE, 2); };
  static var SOURCE_FIELD_DESC = { new TField("source", TType.STRING, 3); };
  static var REGION_FIELD_DESC = { new TField("region", TType.STRING, 4); };
  static var SID_FIELD_DESC = { new TField("sid", TType.STRING, 5); };
  static var QUERY_TYPE_FIELD_DESC = { new TField("queryType", TType.I32, 6); };

  @:isVar
  public var latitude(get,set) : Float;
  @:isVar
  public var longitude(get,set) : Float;
  @:isVar
  public var source(get,set) : String;
  @:isVar
  public var region(get,set) : String;
  @:isVar
  public var sid(get,set) : String;
  @:isVar
  public var queryType(get,set) : haxe.Int32;

  inline static var LATITUDE_FIELD_ID : Int = 1;
  inline static var LONGITUDE_FIELD_ID : Int = 2;
  inline static var SOURCE_FIELD_ID : Int = 3;
  inline static var REGION_FIELD_ID : Int = 4;
  inline static var SID_FIELD_ID : Int = 5;
  inline static var QUERYTYPE_FIELD_ID : Int = 6;

  private var __isset_latitude : Bool = false;
  private var __isset_longitude : Bool = false;
  private var __isset_queryType : Bool = false;

  public function new() {
  }

  public function get_latitude() : Float {
    return this.latitude;
  }

  public function set_latitude(latitude:Float) : Float {
    this.latitude = latitude;
    this.__isset_latitude = true;
    return this.latitude;
  }

  public function unsetLatitude() : Void {
    this.__isset_latitude = false;
  }

  // Returns true if field latitude is set (has been assigned a value) and false otherwise
  public function isSetLatitude() : Bool {
    return this.__isset_latitude;
  }

  public function get_longitude() : Float {
    return this.longitude;
  }

  public function set_longitude(longitude:Float) : Float {
    this.longitude = longitude;
    this.__isset_longitude = true;
    return this.longitude;
  }

  public function unsetLongitude() : Void {
    this.__isset_longitude = false;
  }

  // Returns true if field longitude is set (has been assigned a value) and false otherwise
  public function isSetLongitude() : Bool {
    return this.__isset_longitude;
  }

  public function get_source() : String {
    return this.source;
  }

  public function set_source(source:String) : String {
    this.source = source;
    return this.source;
  }

  public function unsetSource() : Void {
    this.source = null;
  }

  // Returns true if field source is set (has been assigned a value) and false otherwise
  public function isSetSource() : Bool {
    return this.source != null;
  }

  public function get_region() : String {
    return this.region;
  }

  public function set_region(region:String) : String {
    this.region = region;
    return this.region;
  }

  public function unsetRegion() : Void {
    this.region = null;
  }

  // Returns true if field region is set (has been assigned a value) and false otherwise
  public function isSetRegion() : Bool {
    return this.region != null;
  }

  public function get_sid() : String {
    return this.sid;
  }

  public function set_sid(sid:String) : String {
    this.sid = sid;
    return this.sid;
  }

  public function unsetSid() : Void {
    this.sid = null;
  }

  // Returns true if field sid is set (has been assigned a value) and false otherwise
  public function isSetSid() : Bool {
    return this.sid != null;
  }

  public function get_queryType() : haxe.Int32 {
    return this.queryType;
  }

  public function set_queryType(queryType:haxe.Int32) : haxe.Int32 {
    this.queryType = queryType;
    this.__isset_queryType = true;
    return this.queryType;
  }

  public function unsetQueryType() : Void {
    this.__isset_queryType = false;
  }

  // Returns true if field queryType is set (has been assigned a value) and false otherwise
  public function isSetQueryType() : Bool {
    return this.__isset_queryType;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case LATITUDE_FIELD_ID:
      if (value == null) {
        unsetLatitude();
      } else {
        this.latitude = value;
      }

    case LONGITUDE_FIELD_ID:
      if (value == null) {
        unsetLongitude();
      } else {
        this.longitude = value;
      }

    case SOURCE_FIELD_ID:
      if (value == null) {
        unsetSource();
      } else {
        this.source = value;
      }

    case REGION_FIELD_ID:
      if (value == null) {
        unsetRegion();
      } else {
        this.region = value;
      }

    case SID_FIELD_ID:
      if (value == null) {
        unsetSid();
      } else {
        this.sid = value;
      }

    case QUERYTYPE_FIELD_ID:
      if (value == null) {
        unsetQueryType();
      } else {
        this.queryType = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case LATITUDE_FIELD_ID:
      return this.latitude;
    case LONGITUDE_FIELD_ID:
      return this.longitude;
    case SOURCE_FIELD_ID:
      return this.source;
    case REGION_FIELD_ID:
      return this.region;
    case SID_FIELD_ID:
      return this.sid;
    case QUERYTYPE_FIELD_ID:
      return this.queryType;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case LATITUDE_FIELD_ID:
      return isSetLatitude();
    case LONGITUDE_FIELD_ID:
      return isSetLongitude();
    case SOURCE_FIELD_ID:
      return isSetSource();
    case REGION_FIELD_ID:
      return isSetRegion();
    case SID_FIELD_ID:
      return isSetSid();
    case QUERYTYPE_FIELD_ID:
      return isSetQueryType();
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
          case LATITUDE_FIELD_ID:
            if (field.type == TType.DOUBLE) {
              this.latitude = iprot.readDouble();
              this.__isset_latitude = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LONGITUDE_FIELD_ID:
            if (field.type == TType.DOUBLE) {
              this.longitude = iprot.readDouble();
              this.__isset_longitude = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SOURCE_FIELD_ID:
            if (field.type == TType.STRING) {
              this.source = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case REGION_FIELD_ID:
            if (field.type == TType.STRING) {
              this.region = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.sid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case QUERYTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.queryType = iprot.readI32();
              this.__isset_queryType = true;
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
      oprot.writeFieldBegin(LATITUDE_FIELD_DESC);
      oprot.writeDouble(this.latitude);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LONGITUDE_FIELD_DESC);
      oprot.writeDouble(this.longitude);
      oprot.writeFieldEnd();
      if (this.source != null) {
        oprot.writeFieldBegin(SOURCE_FIELD_DESC);
        oprot.writeString(this.source);
        oprot.writeFieldEnd();
      }
      if (this.region != null) {
        oprot.writeFieldBegin(REGION_FIELD_DESC);
        oprot.writeString(this.region);
        oprot.writeFieldEnd();
      }
      if (this.sid != null) {
        oprot.writeFieldBegin(SID_FIELD_DESC);
        oprot.writeString(this.sid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(QUERY_TYPE_FIELD_DESC);
      oprot.writeI32(this.queryType);
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
    var ret : String = "SearchCommonParameter(";
    var first : Bool = true;

    ret += "latitude:";
    ret += this.latitude;
    first = false;
    if (!first) ret +=  ", ";
    ret += "longitude:";
    ret += this.longitude;
    first = false;
    if (!first) ret +=  ", ";
    ret += "source:";
    if (this.source == null) {
      ret += "null";
    } else {
      ret += this.source;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "region:";
    if (this.region == null) {
      ret += "null";
    } else {
      ret += this.region;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "sid:";
    if (this.sid == null) {
      ret += "null";
    } else {
      ret += this.sid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "queryType:";
    ret += this.queryType;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

