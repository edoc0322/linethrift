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


class SendMessageForChannel_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("sendMessageForChannel_args"); };
  static var MESSAGE_FIELD_DESC = { new TField("message", TType.STRUCT, 2); };

  @:isVar
  public var message(get,set) : Message;

  inline static var MESSAGE_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_message() : Message {
    return this.message;
  }

  public function set_message(message:Message) : Message {
    this.message = message;
    return this.message;
  }

  public function unsetMessage() : Void {
    this.message = null;
  }

  // Returns true if field message is set (has been assigned a value) and false otherwise
  public function isSetMessage() : Bool {
    return this.message != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case MESSAGE_FIELD_ID:
      if (value == null) {
        unsetMessage();
      } else {
        this.message = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case MESSAGE_FIELD_ID:
      return this.message;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case MESSAGE_FIELD_ID:
      return isSetMessage();
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
          case MESSAGE_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.message = new Message();
              this.message.read(iprot);
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
      if (this.message != null) {
        oprot.writeFieldBegin(MESSAGE_FIELD_DESC);
        this.message.write(oprot);
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
    var ret : String = "sendMessageForChannel_args(";
    var first : Bool = true;

    ret += "message:";
    if (this.message == null) {
      ret += "null";
    } else {
      ret += this.message;
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

