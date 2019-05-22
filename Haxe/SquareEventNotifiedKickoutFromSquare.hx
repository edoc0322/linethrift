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


class SquareEventNotifiedKickoutFromSquare implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SquareEventNotifiedKickoutFromSquare"); };
  static var SQUARE_CHAT_MID_FIELD_DESC = { new TField("squareChatMid", TType.STRING, 1); };
  static var KICKEES_FIELD_DESC = { new TField("kickees", TType.LIST, 2); };

  @:isVar
  public var squareChatMid(get,set) : String;
  @:isVar
  public var kickees(get,set) : List< SquareMember>;

  inline static var SQUARECHATMID_FIELD_ID : Int = 1;
  inline static var KICKEES_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_squareChatMid() : String {
    return this.squareChatMid;
  }

  public function set_squareChatMid(squareChatMid:String) : String {
    this.squareChatMid = squareChatMid;
    return this.squareChatMid;
  }

  public function unsetSquareChatMid() : Void {
    this.squareChatMid = null;
  }

  // Returns true if field squareChatMid is set (has been assigned a value) and false otherwise
  public function isSetSquareChatMid() : Bool {
    return this.squareChatMid != null;
  }

  public function get_kickees() : List< SquareMember> {
    return this.kickees;
  }

  public function set_kickees(kickees:List< SquareMember>) : List< SquareMember> {
    this.kickees = kickees;
    return this.kickees;
  }

  public function unsetKickees() : Void {
    this.kickees = null;
  }

  // Returns true if field kickees is set (has been assigned a value) and false otherwise
  public function isSetKickees() : Bool {
    return this.kickees != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUARECHATMID_FIELD_ID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        this.squareChatMid = value;
      }

    case KICKEES_FIELD_ID:
      if (value == null) {
        unsetKickees();
      } else {
        this.kickees = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUARECHATMID_FIELD_ID:
      return this.squareChatMid;
    case KICKEES_FIELD_ID:
      return this.kickees;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUARECHATMID_FIELD_ID:
      return isSetSquareChatMid();
    case KICKEES_FIELD_ID:
      return isSetKickees();
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
          case SQUARECHATMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.squareChatMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case KICKEES_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list479 = iprot.readListBegin();
                this.kickees = new List< SquareMember>();
                for( _i480 in 0 ... _list479.size)
                {
                  var _elem481 : SquareMember;
                  _elem481 = new SquareMember();
                  _elem481.read(iprot);
                  this.kickees.add(_elem481);
                }
                iprot.readListEnd();
              }
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
      if (this.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(this.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (this.kickees != null) {
        oprot.writeFieldBegin(KICKEES_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.kickees.length));
          for( elem482 in this.kickees)
          {
            elem482.write(oprot);
          }
          oprot.writeListEnd();
        }
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
    var ret : String = "SquareEventNotifiedKickoutFromSquare(";
    var first : Bool = true;

    ret += "squareChatMid:";
    if (this.squareChatMid == null) {
      ret += "null";
    } else {
      ret += this.squareChatMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "kickees:";
    if (this.kickees == null) {
      ret += "null";
    } else {
      ret += this.kickees;
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

