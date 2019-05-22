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


class GetJoinableSquareChatsRequest implements TBase {
  
  static var STRUCT_DESC = { new TStruct("GetJoinableSquareChatsRequest"); };
  static var SQUARE_MID_FIELD_DESC = { new TField("squareMid", TType.STRING, 1); };
  static var CONTINUATION_TOKEN_FIELD_DESC = { new TField("continuationToken", TType.STRING, 10); };
  static var LIMIT_FIELD_DESC = { new TField("limit", TType.I32, 11); };

  @:isVar
  public var squareMid(get,set) : String;
  @:isVar
  public var continuationToken(get,set) : String;
  @:isVar
  public var limit(get,set) : haxe.Int32;

  inline static var SQUAREMID_FIELD_ID : Int = 1;
  inline static var CONTINUATIONTOKEN_FIELD_ID : Int = 10;
  inline static var LIMIT_FIELD_ID : Int = 11;

  private var __isset_limit : Bool = false;

  public function new() {
  }

  public function get_squareMid() : String {
    return this.squareMid;
  }

  public function set_squareMid(squareMid:String) : String {
    this.squareMid = squareMid;
    return this.squareMid;
  }

  public function unsetSquareMid() : Void {
    this.squareMid = null;
  }

  // Returns true if field squareMid is set (has been assigned a value) and false otherwise
  public function isSetSquareMid() : Bool {
    return this.squareMid != null;
  }

  public function get_continuationToken() : String {
    return this.continuationToken;
  }

  public function set_continuationToken(continuationToken:String) : String {
    this.continuationToken = continuationToken;
    return this.continuationToken;
  }

  public function unsetContinuationToken() : Void {
    this.continuationToken = null;
  }

  // Returns true if field continuationToken is set (has been assigned a value) and false otherwise
  public function isSetContinuationToken() : Bool {
    return this.continuationToken != null;
  }

  public function get_limit() : haxe.Int32 {
    return this.limit;
  }

  public function set_limit(limit:haxe.Int32) : haxe.Int32 {
    this.limit = limit;
    this.__isset_limit = true;
    return this.limit;
  }

  public function unsetLimit() : Void {
    this.__isset_limit = false;
  }

  // Returns true if field limit is set (has been assigned a value) and false otherwise
  public function isSetLimit() : Bool {
    return this.__isset_limit;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      if (value == null) {
        unsetSquareMid();
      } else {
        this.squareMid = value;
      }

    case CONTINUATIONTOKEN_FIELD_ID:
      if (value == null) {
        unsetContinuationToken();
      } else {
        this.continuationToken = value;
      }

    case LIMIT_FIELD_ID:
      if (value == null) {
        unsetLimit();
      } else {
        this.limit = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return this.squareMid;
    case CONTINUATIONTOKEN_FIELD_ID:
      return this.continuationToken;
    case LIMIT_FIELD_ID:
      return this.limit;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return isSetSquareMid();
    case CONTINUATIONTOKEN_FIELD_ID:
      return isSetContinuationToken();
    case LIMIT_FIELD_ID:
      return isSetLimit();
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
          case SQUAREMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.squareMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONTINUATIONTOKEN_FIELD_ID:
            if (field.type == TType.STRING) {
              this.continuationToken = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case LIMIT_FIELD_ID:
            if (field.type == TType.I32) {
              this.limit = iprot.readI32();
              this.__isset_limit = true;
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
      if (this.squareMid != null) {
        oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
        oprot.writeString(this.squareMid);
        oprot.writeFieldEnd();
      }
      if (this.continuationToken != null) {
        oprot.writeFieldBegin(CONTINUATION_TOKEN_FIELD_DESC);
        oprot.writeString(this.continuationToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LIMIT_FIELD_DESC);
      oprot.writeI32(this.limit);
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
    var ret : String = "GetJoinableSquareChatsRequest(";
    var first : Bool = true;

    ret += "squareMid:";
    if (this.squareMid == null) {
      ret += "null";
    } else {
      ret += this.squareMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "continuationToken:";
    if (this.continuationToken == null) {
      ret += "null";
    } else {
      ret += this.continuationToken;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "limit:";
    ret += this.limit;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

