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


class RequestEmailConfirmation_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("requestEmailConfirmation_args"); };
  static var EMAIL_CONFIRMATION_FIELD_DESC = { new TField("emailConfirmation", TType.STRUCT, 2); };

  @:isVar
  public var emailConfirmation(get,set) : EmailConfirmation;

  inline static var EMAILCONFIRMATION_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_emailConfirmation() : EmailConfirmation {
    return this.emailConfirmation;
  }

  public function set_emailConfirmation(emailConfirmation:EmailConfirmation) : EmailConfirmation {
    this.emailConfirmation = emailConfirmation;
    return this.emailConfirmation;
  }

  public function unsetEmailConfirmation() : Void {
    this.emailConfirmation = null;
  }

  // Returns true if field emailConfirmation is set (has been assigned a value) and false otherwise
  public function isSetEmailConfirmation() : Bool {
    return this.emailConfirmation != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case EMAILCONFIRMATION_FIELD_ID:
      if (value == null) {
        unsetEmailConfirmation();
      } else {
        this.emailConfirmation = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case EMAILCONFIRMATION_FIELD_ID:
      return this.emailConfirmation;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case EMAILCONFIRMATION_FIELD_ID:
      return isSetEmailConfirmation();
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
          case EMAILCONFIRMATION_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.emailConfirmation = new EmailConfirmation();
              this.emailConfirmation.read(iprot);
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
      if (this.emailConfirmation != null) {
        oprot.writeFieldBegin(EMAIL_CONFIRMATION_FIELD_DESC);
        this.emailConfirmation.write(oprot);
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
    var ret : String = "requestEmailConfirmation_args(";
    var first : Bool = true;

    ret += "emailConfirmation:";
    if (this.emailConfirmation == null) {
      ret += "null";
    } else {
      ret += this.emailConfirmation;
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

