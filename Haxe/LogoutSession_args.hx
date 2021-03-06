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


class LogoutSession_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("logoutSession_args"); };
  static var TOKEN_KEY_FIELD_DESC = { new TField("tokenKey", TType.STRING, 2); };

  @:isVar
  public var tokenKey(get,set) : String;

  inline static var TOKENKEY_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_tokenKey() : String {
    return this.tokenKey;
  }

  public function set_tokenKey(tokenKey:String) : String {
    this.tokenKey = tokenKey;
    return this.tokenKey;
  }

  public function unsetTokenKey() : Void {
    this.tokenKey = null;
  }

  // Returns true if field tokenKey is set (has been assigned a value) and false otherwise
  public function isSetTokenKey() : Bool {
    return this.tokenKey != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case TOKENKEY_FIELD_ID:
      if (value == null) {
        unsetTokenKey();
      } else {
        this.tokenKey = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case TOKENKEY_FIELD_ID:
      return this.tokenKey;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case TOKENKEY_FIELD_ID:
      return isSetTokenKey();
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
          case TOKENKEY_FIELD_ID:
            if (field.type == TType.STRING) {
              this.tokenKey = iprot.readString();
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
      if (this.tokenKey != null) {
        oprot.writeFieldBegin(TOKEN_KEY_FIELD_DESC);
        oprot.writeString(this.tokenKey);
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
    var ret : String = "logoutSession_args(";
    var first : Bool = true;

    ret += "tokenKey:";
    if (this.tokenKey == null) {
      ret += "null";
    } else {
      ret += this.tokenKey;
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

