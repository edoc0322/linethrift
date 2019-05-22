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


class RequestResendMessage_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("requestResendMessage_args"); };
  static var REQ_SEQ_FIELD_DESC = { new TField("reqSeq", TType.I32, 1); };
  static var SENDER_MID_FIELD_DESC = { new TField("senderMid", TType.STRING, 2); };
  static var MESSAGE_ID_FIELD_DESC = { new TField("messageId", TType.STRING, 3); };

  @:isVar
  public var reqSeq(get,set) : haxe.Int32;
  @:isVar
  public var senderMid(get,set) : String;
  @:isVar
  public var messageId(get,set) : String;

  inline static var REQSEQ_FIELD_ID : Int = 1;
  inline static var SENDERMID_FIELD_ID : Int = 2;
  inline static var MESSAGEID_FIELD_ID : Int = 3;

  private var __isset_reqSeq : Bool = false;

  public function new() {
  }

  public function get_reqSeq() : haxe.Int32 {
    return this.reqSeq;
  }

  public function set_reqSeq(reqSeq:haxe.Int32) : haxe.Int32 {
    this.reqSeq = reqSeq;
    this.__isset_reqSeq = true;
    return this.reqSeq;
  }

  public function unsetReqSeq() : Void {
    this.__isset_reqSeq = false;
  }

  // Returns true if field reqSeq is set (has been assigned a value) and false otherwise
  public function isSetReqSeq() : Bool {
    return this.__isset_reqSeq;
  }

  public function get_senderMid() : String {
    return this.senderMid;
  }

  public function set_senderMid(senderMid:String) : String {
    this.senderMid = senderMid;
    return this.senderMid;
  }

  public function unsetSenderMid() : Void {
    this.senderMid = null;
  }

  // Returns true if field senderMid is set (has been assigned a value) and false otherwise
  public function isSetSenderMid() : Bool {
    return this.senderMid != null;
  }

  public function get_messageId() : String {
    return this.messageId;
  }

  public function set_messageId(messageId:String) : String {
    this.messageId = messageId;
    return this.messageId;
  }

  public function unsetMessageId() : Void {
    this.messageId = null;
  }

  // Returns true if field messageId is set (has been assigned a value) and false otherwise
  public function isSetMessageId() : Bool {
    return this.messageId != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      if (value == null) {
        unsetReqSeq();
      } else {
        this.reqSeq = value;
      }

    case SENDERMID_FIELD_ID:
      if (value == null) {
        unsetSenderMid();
      } else {
        this.senderMid = value;
      }

    case MESSAGEID_FIELD_ID:
      if (value == null) {
        unsetMessageId();
      } else {
        this.messageId = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return this.reqSeq;
    case SENDERMID_FIELD_ID:
      return this.senderMid;
    case MESSAGEID_FIELD_ID:
      return this.messageId;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REQSEQ_FIELD_ID:
      return isSetReqSeq();
    case SENDERMID_FIELD_ID:
      return isSetSenderMid();
    case MESSAGEID_FIELD_ID:
      return isSetMessageId();
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
          case REQSEQ_FIELD_ID:
            if (field.type == TType.I32) {
              this.reqSeq = iprot.readI32();
              this.__isset_reqSeq = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SENDERMID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.senderMid = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MESSAGEID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.messageId = iprot.readString();
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
      oprot.writeFieldBegin(REQ_SEQ_FIELD_DESC);
      oprot.writeI32(this.reqSeq);
      oprot.writeFieldEnd();
      if (this.senderMid != null) {
        oprot.writeFieldBegin(SENDER_MID_FIELD_DESC);
        oprot.writeString(this.senderMid);
        oprot.writeFieldEnd();
      }
      if (this.messageId != null) {
        oprot.writeFieldBegin(MESSAGE_ID_FIELD_DESC);
        oprot.writeString(this.messageId);
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
    var ret : String = "requestResendMessage_args(";
    var first : Bool = true;

    ret += "reqSeq:";
    ret += this.reqSeq;
    first = false;
    if (!first) ret +=  ", ";
    ret += "senderMid:";
    if (this.senderMid == null) {
      ret += "null";
    } else {
      ret += this.senderMid;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "messageId:";
    if (this.messageId == null) {
      ret += "null";
    } else {
      ret += this.messageId;
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

