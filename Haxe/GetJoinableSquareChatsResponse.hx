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


class GetJoinableSquareChatsResponse implements TBase {
  
  static var STRUCT_DESC = { new TStruct("GetJoinableSquareChatsResponse"); };
  static var SQUARE_CHATS_FIELD_DESC = { new TField("squareChats", TType.LIST, 1); };
  static var CONTINUATION_TOKEN_FIELD_DESC = { new TField("continuationToken", TType.STRING, 2); };
  static var TOTAL_SQUARE_CHAT_COUNT_FIELD_DESC = { new TField("totalSquareChatCount", TType.I32, 3); };
  static var SQUARE_CHAT_STATUSES_FIELD_DESC = { new TField("squareChatStatuses", TType.MAP, 4); };

  @:isVar
  public var squareChats(get,set) : List< SquareChat>;
  @:isVar
  public var continuationToken(get,set) : String;
  @:isVar
  public var totalSquareChatCount(get,set) : haxe.Int32;
  @:isVar
  public var squareChatStatuses(get,set) : StringMap< SquareChatStatus>;

  inline static var SQUARECHATS_FIELD_ID : Int = 1;
  inline static var CONTINUATIONTOKEN_FIELD_ID : Int = 2;
  inline static var TOTALSQUARECHATCOUNT_FIELD_ID : Int = 3;
  inline static var SQUARECHATSTATUSES_FIELD_ID : Int = 4;

  private var __isset_totalSquareChatCount : Bool = false;

  public function new() {
  }

  public function get_squareChats() : List< SquareChat> {
    return this.squareChats;
  }

  public function set_squareChats(squareChats:List< SquareChat>) : List< SquareChat> {
    this.squareChats = squareChats;
    return this.squareChats;
  }

  public function unsetSquareChats() : Void {
    this.squareChats = null;
  }

  // Returns true if field squareChats is set (has been assigned a value) and false otherwise
  public function isSetSquareChats() : Bool {
    return this.squareChats != null;
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

  public function get_totalSquareChatCount() : haxe.Int32 {
    return this.totalSquareChatCount;
  }

  public function set_totalSquareChatCount(totalSquareChatCount:haxe.Int32) : haxe.Int32 {
    this.totalSquareChatCount = totalSquareChatCount;
    this.__isset_totalSquareChatCount = true;
    return this.totalSquareChatCount;
  }

  public function unsetTotalSquareChatCount() : Void {
    this.__isset_totalSquareChatCount = false;
  }

  // Returns true if field totalSquareChatCount is set (has been assigned a value) and false otherwise
  public function isSetTotalSquareChatCount() : Bool {
    return this.__isset_totalSquareChatCount;
  }

  public function get_squareChatStatuses() : StringMap< SquareChatStatus> {
    return this.squareChatStatuses;
  }

  public function set_squareChatStatuses(squareChatStatuses:StringMap< SquareChatStatus>) : StringMap< SquareChatStatus> {
    this.squareChatStatuses = squareChatStatuses;
    return this.squareChatStatuses;
  }

  public function unsetSquareChatStatuses() : Void {
    this.squareChatStatuses = null;
  }

  // Returns true if field squareChatStatuses is set (has been assigned a value) and false otherwise
  public function isSetSquareChatStatuses() : Bool {
    return this.squareChatStatuses != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SQUARECHATS_FIELD_ID:
      if (value == null) {
        unsetSquareChats();
      } else {
        this.squareChats = value;
      }

    case CONTINUATIONTOKEN_FIELD_ID:
      if (value == null) {
        unsetContinuationToken();
      } else {
        this.continuationToken = value;
      }

    case TOTALSQUARECHATCOUNT_FIELD_ID:
      if (value == null) {
        unsetTotalSquareChatCount();
      } else {
        this.totalSquareChatCount = value;
      }

    case SQUARECHATSTATUSES_FIELD_ID:
      if (value == null) {
        unsetSquareChatStatuses();
      } else {
        this.squareChatStatuses = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SQUARECHATS_FIELD_ID:
      return this.squareChats;
    case CONTINUATIONTOKEN_FIELD_ID:
      return this.continuationToken;
    case TOTALSQUARECHATCOUNT_FIELD_ID:
      return this.totalSquareChatCount;
    case SQUARECHATSTATUSES_FIELD_ID:
      return this.squareChatStatuses;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SQUARECHATS_FIELD_ID:
      return isSetSquareChats();
    case CONTINUATIONTOKEN_FIELD_ID:
      return isSetContinuationToken();
    case TOTALSQUARECHATCOUNT_FIELD_ID:
      return isSetTotalSquareChatCount();
    case SQUARECHATSTATUSES_FIELD_ID:
      return isSetSquareChatStatuses();
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
          case SQUARECHATS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list352 = iprot.readListBegin();
                this.squareChats = new List< SquareChat>();
                for( _i353 in 0 ... _list352.size)
                {
                  var _elem354 : SquareChat;
                  _elem354 = new SquareChat();
                  _elem354.read(iprot);
                  this.squareChats.add(_elem354);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONTINUATIONTOKEN_FIELD_ID:
            if (field.type == TType.STRING) {
              this.continuationToken = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case TOTALSQUARECHATCOUNT_FIELD_ID:
            if (field.type == TType.I32) {
              this.totalSquareChatCount = iprot.readI32();
              this.__isset_totalSquareChatCount = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SQUARECHATSTATUSES_FIELD_ID:
            if (field.type == TType.MAP) {
              {
                var _map355 = iprot.readMapBegin();
                this.squareChatStatuses = new StringMap< SquareChatStatus>();
                for( _i356 in 0 ... _map355.size)
                {
                  var _key357 : String;
                  var _val358 : SquareChatStatus;
                  _key357 = iprot.readString();
                  _val358 = new SquareChatStatus();
                  _val358.read(iprot);
                  this.squareChatStatuses.set( _key357, _val358);
                }
                iprot.readMapEnd();
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
      if (this.squareChats != null) {
        oprot.writeFieldBegin(SQUARE_CHATS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.squareChats.length));
          for( elem359 in this.squareChats)
          {
            elem359.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.continuationToken != null) {
        oprot.writeFieldBegin(CONTINUATION_TOKEN_FIELD_DESC);
        oprot.writeString(this.continuationToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOTAL_SQUARE_CHAT_COUNT_FIELD_DESC);
      oprot.writeI32(this.totalSquareChatCount);
      oprot.writeFieldEnd();
      if (this.squareChatStatuses != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_STATUSES_FIELD_DESC);
        {
          var _sizeCounter361 : Int = 0;
          for( _key360 in this.squareChatStatuses) {
            _sizeCounter361++;
          }
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, _sizeCounter361));
          for( elem362 in this.squareChatStatuses.keys())
          {
            oprot.writeString(elem362);
            this.squareChatStatuses.get(elem362).write(oprot);
          }
          oprot.writeMapEnd();
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
    var ret : String = "GetJoinableSquareChatsResponse(";
    var first : Bool = true;

    ret += "squareChats:";
    if (this.squareChats == null) {
      ret += "null";
    } else {
      ret += this.squareChats;
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
    ret += "totalSquareChatCount:";
    ret += this.totalSquareChatCount;
    first = false;
    if (!first) ret +=  ", ";
    ret += "squareChatStatuses:";
    if (this.squareChatStatuses == null) {
      ret += "null";
    } else {
      ret += this.squareChatStatuses;
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

