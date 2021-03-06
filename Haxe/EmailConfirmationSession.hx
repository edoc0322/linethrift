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


class EmailConfirmationSession implements TBase {
  
  static var STRUCT_DESC = { new TStruct("EmailConfirmationSession"); };
  static var EMAIL_CONFIRMATION_TYPE_FIELD_DESC = { new TField("emailConfirmationType", TType.I32, 1); };
  static var VERIFIER_FIELD_DESC = { new TField("verifier", TType.STRING, 2); };
  static var TARGET_EMAIL_FIELD_DESC = { new TField("targetEmail", TType.STRING, 3); };

  @:isVar
  public var emailConfirmationType(get,set) : Int;
  @:isVar
  public var verifier(get,set) : String;
  @:isVar
  public var targetEmail(get,set) : String;

  inline static var EMAILCONFIRMATIONTYPE_FIELD_ID : Int = 1;
  inline static var VERIFIER_FIELD_ID : Int = 2;
  inline static var TARGETEMAIL_FIELD_ID : Int = 3;

  private var __isset_emailConfirmationType : Bool = false;

  public function new() {
  }

  public function get_emailConfirmationType() : Int {
    return this.emailConfirmationType;
  }

  public function set_emailConfirmationType(emailConfirmationType:Int) : Int {
    this.emailConfirmationType = emailConfirmationType;
    this.__isset_emailConfirmationType = true;
    return this.emailConfirmationType;
  }

  public function unsetEmailConfirmationType() : Void {
    this.__isset_emailConfirmationType = false;
  }

  // Returns true if field emailConfirmationType is set (has been assigned a value) and false otherwise
  public function isSetEmailConfirmationType() : Bool {
    return this.__isset_emailConfirmationType;
  }

  public function get_verifier() : String {
    return this.verifier;
  }

  public function set_verifier(verifier:String) : String {
    this.verifier = verifier;
    return this.verifier;
  }

  public function unsetVerifier() : Void {
    this.verifier = null;
  }

  // Returns true if field verifier is set (has been assigned a value) and false otherwise
  public function isSetVerifier() : Bool {
    return this.verifier != null;
  }

  public function get_targetEmail() : String {
    return this.targetEmail;
  }

  public function set_targetEmail(targetEmail:String) : String {
    this.targetEmail = targetEmail;
    return this.targetEmail;
  }

  public function unsetTargetEmail() : Void {
    this.targetEmail = null;
  }

  // Returns true if field targetEmail is set (has been assigned a value) and false otherwise
  public function isSetTargetEmail() : Bool {
    return this.targetEmail != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case EMAILCONFIRMATIONTYPE_FIELD_ID:
      if (value == null) {
        unsetEmailConfirmationType();
      } else {
        this.emailConfirmationType = value;
      }

    case VERIFIER_FIELD_ID:
      if (value == null) {
        unsetVerifier();
      } else {
        this.verifier = value;
      }

    case TARGETEMAIL_FIELD_ID:
      if (value == null) {
        unsetTargetEmail();
      } else {
        this.targetEmail = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case EMAILCONFIRMATIONTYPE_FIELD_ID:
      return this.emailConfirmationType;
    case VERIFIER_FIELD_ID:
      return this.verifier;
    case TARGETEMAIL_FIELD_ID:
      return this.targetEmail;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case EMAILCONFIRMATIONTYPE_FIELD_ID:
      return isSetEmailConfirmationType();
    case VERIFIER_FIELD_ID:
      return isSetVerifier();
    case TARGETEMAIL_FIELD_ID:
      return isSetTargetEmail();
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
          case EMAILCONFIRMATIONTYPE_FIELD_ID:
            if (field.type == TType.I32) {
              this.emailConfirmationType = iprot.readI32();
              this.__isset_emailConfirmationType = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case VERIFIER_FIELD_ID:
            if (field.type == TType.STRING) {
              this.verifier = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TARGETEMAIL_FIELD_ID:
            if (field.type == TType.STRING) {
              this.targetEmail = iprot.readString();
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
      oprot.writeFieldBegin(EMAIL_CONFIRMATION_TYPE_FIELD_DESC);
      oprot.writeI32(this.emailConfirmationType);
      oprot.writeFieldEnd();
      if (this.verifier != null) {
        oprot.writeFieldBegin(VERIFIER_FIELD_DESC);
        oprot.writeString(this.verifier);
        oprot.writeFieldEnd();
      }
      if (this.targetEmail != null) {
        oprot.writeFieldBegin(TARGET_EMAIL_FIELD_DESC);
        oprot.writeString(this.targetEmail);
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
    var ret : String = "EmailConfirmationSession(";
    var first : Bool = true;

    ret += "emailConfirmationType:";
    var emailConfirmationType_name : String = .EmailConfirmationType.VALUES_TO_NAMES[this.emailConfirmationType];
    if (emailConfirmationType_name != null) {
      ret += emailConfirmationType_name;
      ret += " (";
    }
    ret += this.emailConfirmationType;
    if (emailConfirmationType_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "verifier:";
    if (this.verifier == null) {
      ret += "null";
    } else {
      ret += this.verifier;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "targetEmail:";
    if (this.targetEmail == null) {
      ret += "null";
    } else {
      ret += this.targetEmail;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetEmailConfirmationType() && !.EmailConfirmationType.VALID_VALUES.contains(emailConfirmationType)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'emailConfirmationType' has been assigned the invalid value " + emailConfirmationType);
    }
  }

}

