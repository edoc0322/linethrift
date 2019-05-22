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


class FetchMyEventsResponse implements TBase {
  
  static var STRUCT_DESC = { new TStruct("FetchMyEventsResponse"); };
  static var SUBSCRIPTION_FIELD_DESC = { new TField("subscription", TType.STRUCT, 1); };
  static var EVENTS_FIELD_DESC = { new TField("events", TType.LIST, 2); };
  static var SYNC_TOKEN_FIELD_DESC = { new TField("syncToken", TType.STRING, 3); };
  static var CONTINUATION_TOKEN_FIELD_DESC = { new TField("continuationToken", TType.STRING, 4); };

  @:isVar
  public var subscription(get,set) : SubscriptionState;
  @:isVar
  public var events(get,set) : List< SquareEvent>;
  @:isVar
  public var syncToken(get,set) : String;
  @:isVar
  public var continuationToken(get,set) : String;

  inline static var SUBSCRIPTION_FIELD_ID : Int = 1;
  inline static var EVENTS_FIELD_ID : Int = 2;
  inline static var SYNCTOKEN_FIELD_ID : Int = 3;
  inline static var CONTINUATIONTOKEN_FIELD_ID : Int = 4;


  public function new() {
  }

  public function get_subscription() : SubscriptionState {
    return this.subscription;
  }

  public function set_subscription(subscription:SubscriptionState) : SubscriptionState {
    this.subscription = subscription;
    return this.subscription;
  }

  public function unsetSubscription() : Void {
    this.subscription = null;
  }

  // Returns true if field subscription is set (has been assigned a value) and false otherwise
  public function isSetSubscription() : Bool {
    return this.subscription != null;
  }

  public function get_events() : List< SquareEvent> {
    return this.events;
  }

  public function set_events(events:List< SquareEvent>) : List< SquareEvent> {
    this.events = events;
    return this.events;
  }

  public function unsetEvents() : Void {
    this.events = null;
  }

  // Returns true if field events is set (has been assigned a value) and false otherwise
  public function isSetEvents() : Bool {
    return this.events != null;
  }

  public function get_syncToken() : String {
    return this.syncToken;
  }

  public function set_syncToken(syncToken:String) : String {
    this.syncToken = syncToken;
    return this.syncToken;
  }

  public function unsetSyncToken() : Void {
    this.syncToken = null;
  }

  // Returns true if field syncToken is set (has been assigned a value) and false otherwise
  public function isSetSyncToken() : Bool {
    return this.syncToken != null;
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

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case SUBSCRIPTION_FIELD_ID:
      if (value == null) {
        unsetSubscription();
      } else {
        this.subscription = value;
      }

    case EVENTS_FIELD_ID:
      if (value == null) {
        unsetEvents();
      } else {
        this.events = value;
      }

    case SYNCTOKEN_FIELD_ID:
      if (value == null) {
        unsetSyncToken();
      } else {
        this.syncToken = value;
      }

    case CONTINUATIONTOKEN_FIELD_ID:
      if (value == null) {
        unsetContinuationToken();
      } else {
        this.continuationToken = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case SUBSCRIPTION_FIELD_ID:
      return this.subscription;
    case EVENTS_FIELD_ID:
      return this.events;
    case SYNCTOKEN_FIELD_ID:
      return this.syncToken;
    case CONTINUATIONTOKEN_FIELD_ID:
      return this.continuationToken;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case SUBSCRIPTION_FIELD_ID:
      return isSetSubscription();
    case EVENTS_FIELD_ID:
      return isSetEvents();
    case SYNCTOKEN_FIELD_ID:
      return isSetSyncToken();
    case CONTINUATIONTOKEN_FIELD_ID:
      return isSetContinuationToken();
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
          case SUBSCRIPTION_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.subscription = new SubscriptionState();
              this.subscription.read(iprot);
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case EVENTS_FIELD_ID:
            if (field.type == TType.LIST) {
              {
                var _list483 = iprot.readListBegin();
                this.events = new List< SquareEvent>();
                for( _i484 in 0 ... _list483.size)
                {
                  var _elem485 : SquareEvent;
                  _elem485 = new SquareEvent();
                  _elem485.read(iprot);
                  this.events.add(_elem485);
                }
                iprot.readListEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SYNCTOKEN_FIELD_ID:
            if (field.type == TType.STRING) {
              this.syncToken = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONTINUATIONTOKEN_FIELD_ID:
            if (field.type == TType.STRING) {
              this.continuationToken = iprot.readString();
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
      if (this.subscription != null) {
        oprot.writeFieldBegin(SUBSCRIPTION_FIELD_DESC);
        this.subscription.write(oprot);
        oprot.writeFieldEnd();
      }
      if (this.events != null) {
        oprot.writeFieldBegin(EVENTS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.STRUCT, this.events.length));
          for( elem486 in this.events)
          {
            elem486.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.syncToken != null) {
        oprot.writeFieldBegin(SYNC_TOKEN_FIELD_DESC);
        oprot.writeString(this.syncToken);
        oprot.writeFieldEnd();
      }
      if (this.continuationToken != null) {
        oprot.writeFieldBegin(CONTINUATION_TOKEN_FIELD_DESC);
        oprot.writeString(this.continuationToken);
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
    var ret : String = "FetchMyEventsResponse(";
    var first : Bool = true;

    ret += "subscription:";
    if (this.subscription == null) {
      ret += "null";
    } else {
      ret += this.subscription;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "events:";
    if (this.events == null) {
      ret += "null";
    } else {
      ret += this.events;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "syncToken:";
    if (this.syncToken == null) {
      ret += "null";
    } else {
      ret += this.syncToken;
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
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

