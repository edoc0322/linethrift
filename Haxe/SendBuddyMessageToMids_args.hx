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


class SendBuddyMessageToMids_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("sendBuddyMessageToMids_args"); };
  static var REQUEST_ID_FIELD_DESC = { new TField("requestId", TType.STRING, 1); };
  static var MSG_FIELD_DESC = { new TField("msg", TType.STRUCT, 2); };
  static var MIDS_FIELD_DESC = { new TField("mids", TType.LIST, 3); };

  @:isVar
  public var requestId(get,set) : String;
  @:isVar
  public var msg(get,set) : Message;
  @:isVar
  public var mids(get,set) : List< String>;

  inline static var REQUESTID_FIELD_ID : Int = 1;
  inline static var MSG_FIELD_ID : Int = 2;
  inline static var MIDS_FIELD_ID : Int = 3;


  public function new() {
  }

  public function get_requestId() : String {
    return this.requestId;
  }

  public function set_requestId(requestId:String) : String {
    this.requestId = requestId;
    return this.requestId;
  }

  public function unsetRequestId() : Void {
    this.requestId = null;
  }

  // Returns true if field requestId is set (has been assigned a value) and false otherwise
  public function isSetRequestId() : Bool {
    return this.requestId != null;
  }

  public function get_msg() : Message {
    return this.msg;
  }

  public function set_msg(msg:Message) : Message {
    this.msg = msg;
    return this.msg;
  }

  public function unsetMsg() : Void {
    this.msg = null;
  }

  // Returns true if field msg is set (has been assigned a value) and false otherwise
  public function isSetMsg() : Bool {
    return this.msg != null;
  }

  public function get_mids() : List< String> {
    return this.mids;
  }

  public function set_mids(mids:List< String>) : List< String> {
    this.mids = mids;
    return this.mids;
  }

  public function unsetMids() : Void {
    this.mids = null;
  }

  // Returns true if field mids is set (has been assigned a value) and false otherwise
  public function isSetMids() : Bool {
    return this.mids != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case REQUESTID_FIELD_ID:
      if (value == null) {
        unsetRequestId();
      } else {
        this.requestId = value;
      }

    case MSG_FIELD_ID:
      if (value == null) {
        unsetMsg();
      } else {
        this.msg = value;
      }

    case MIDS_FIELD_ID:
      if (value == null) {
        unsetMids();
      } else {
        this.mids = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case REQUESTID_FIELD_ID:
      return this.requestId;
    case MSG_FIELD_ID:
      return this.msg;
    case MIDS_FIELD_ID:
      return this.mids;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case REQUESTID_FIELD_ID:
      return isSetRequestId();
    case MSG_FIELD_ID:
      return isSetMsg();
    case MIDS_FIELD_ID:
      return isSetMids();
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
          case REQUESTID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.requestId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MSG_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.msg = new Message();
              this.msg.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MIDS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list669 = iprot.readListBegin();
                this.mids = new List< String>();
                for( _i670 in 0 ... _list669.size)
                {
                  var _elem671 : String;
                  _elem671 = iprot.readString();
                  this.mids.add(_elem671);
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
      if (this.requestId != null) {
        oprot.writeFieldBegin(REQUEST_ID_FIELD_DESC);
        oprot.writeString(this.requestId);
        oprot.writeFieldEnd();
      }
      if (this.msg != null) {
        oprot.writeFieldBegin(MSG_FIELD_DESC);
        this.msg.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.mids != null) {
        oprot.writeFieldBegin(MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRING, this.mids.length));
          for( elem672 in this.mids)
          {
            oprot.writeString(elem672);
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
    var ret : String = "sendBuddyMessageToMids_args(";
    var first : Bool = true;

    ret += "requestId:";
    if (this.requestId == null) {
      ret += "null";
    } else {
      ret += this.requestId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "msg:";
    if (this.msg == null) {
      ret += "null";
    } else {
      ret += this.msg;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "mids:";
    if (this.mids == null) {
      ret += "null";
    } else {
      ret += this.mids;
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

