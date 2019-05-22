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


class GetSquareMemberRelationRequest implements TBase {
  
  static var STRUCT_DESC = { new TStruct("GetSquareMemberRelationRequest"); };
  static var SQUARE_MID_FIELD_DESC = { new TField("squareMid", TType.STRING, 2); };
  static var TARGET_SQUARE_MEMBER_MID_FIELD_DESC = { new TField("targetSquareMemberMid", TType.STRING, 3); };

  @:isVar
  public var squareMid(get,set) : String;
  @:isVar
  public var targetSquareMemberMid(get,set) : String;

  inline static var SQUAREMID_FIELD_ID : Int = 2;
  inline static var TARGETSQUAREMEMBERMID_FIELD_ID : Int = 3;


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

  public function get_targetSquareMemberMid() : String {
    return this.targetSquareMemberMid;
  }

  public function set_targetSquareMemberMid(targetSquareMemberMid:String) : String {
    this.targetSquareMemberMid = targetSquareMemberMid;
    return this.targetSquareMemberMid;
  }

  public function unsetTargetSquareMemberMid() : Void {
    this.targetSquareMemberMid = null;
  }

  // Returns true if field targetSquareMemberMid is set (has been assigned a value) and false otherwise
  public function isSetTargetSquareMemberMid() : Bool {
    return this.targetSquareMemberMid != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      if (value == null) {
        unsetSquareMid();
      } else {
        this.squareMid = value;
      }

    case TARGETSQUAREMEMBERMID_FIELD_ID:
      if (value == null) {
        unsetTargetSquareMemberMid();
      } else {
        this.targetSquareMemberMid = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return this.squareMid;
    case TARGETSQUAREMEMBERMID_FIELD_ID:
      return this.targetSquareMemberMid;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUAREMID_FIELD_ID:
      return isSetSquareMid();
    case TARGETSQUAREMEMBERMID_FIELD_ID:
      return isSetTargetSquareMemberMid();
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
          case TARGETSQUAREMEMBERMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.targetSquareMemberMid = iprot.readString();
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
      if (this.targetSquareMemberMid != null) {
        oprot.writeFieldBegin(TARGET_SQUARE_MEMBER_MID_FIELD_DESC);
        oprot.writeString(this.targetSquareMemberMid);
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
    var ret : String = "GetSquareMemberRelationRequest(";
    var first : Bool = true;

    ret += "squareMid:";
    if (this.squareMid == null) {
      ret += "null";
    } else {
      ret += this.squareMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "targetSquareMemberMid:";
    if (this.targetSquareMemberMid == null) {
      ret += "null";
    } else {
      ret += this.targetSquareMemberMid;
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

