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


class SquareMemberSearchOption implements TBase {
  
  static var STRUCT_DESC = { new TStruct("SquareMemberSearchOption"); };
  static var MEMBERSHIP_STATE_FIELD_DESC = { new TField("membershipState", TType.I32, 1); };
  static var MEMBER_ROLES_FIELD_DESC = { new TField("memberRoles", TType.SET, 2); };
  static var DISPLAY_NAME_FIELD_DESC = { new TField("displayName", TType.STRING, 3); };
  static var ABLE_TO_RECEIVE_MESSAGE_FIELD_DESC = { new TField("ableToReceiveMessage", TType.I32, 4); };
  static var ABLE_TO_RECEIVE_FRIEND_REQUEST_FIELD_DESC = { new TField("ableToReceiveFriendRequest", TType.I32, 5); };
  static var CHAT_MID_TO_EXCLUDE_MEMBERS_FIELD_DESC = { new TField("chatMidToExcludeMembers", TType.STRING, 6); };
  static var INCLUDING_ME_FIELD_DESC = { new TField("includingMe", TType.BOOL, 7); };

  @:isVar
  public var membershipState(get,set) : Int;
  @:isVar
  public var memberRoles(get,set) : IntSet;
  @:isVar
  public var displayName(get,set) : String;
  @:isVar
  public var ableToReceiveMessage(get,set) : Int;
  @:isVar
  public var ableToReceiveFriendRequest(get,set) : Int;
  @:isVar
  public var chatMidToExcludeMembers(get,set) : String;
  @:isVar
  public var includingMe(get,set) : Bool;

  inline static var MEMBERSHIPSTATE_FIELD_ID : Int = 1;
  inline static var MEMBERROLES_FIELD_ID : Int = 2;
  inline static var DISPLAYNAME_FIELD_ID : Int = 3;
  inline static var ABLETORECEIVEMESSAGE_FIELD_ID : Int = 4;
  inline static var ABLETORECEIVEFRIENDREQUEST_FIELD_ID : Int = 5;
  inline static var CHATMIDTOEXCLUDEMEMBERS_FIELD_ID : Int = 6;
  inline static var INCLUDINGME_FIELD_ID : Int = 7;

  private var __isset_membershipState : Bool = false;
  private var __isset_ableToReceiveMessage : Bool = false;
  private var __isset_ableToReceiveFriendRequest : Bool = false;
  private var __isset_includingMe : Bool = false;

  public function new() {
  }

  public function get_membershipState() : Int {
    return this.membershipState;
  }

  public function set_membershipState(membershipState:Int) : Int {
    this.membershipState = membershipState;
    this.__isset_membershipState = true;
    return this.membershipState;
  }

  public function unsetMembershipState() : Void {
    this.__isset_membershipState = false;
  }

  // Returns true if field membershipState is set (has been assigned a value) and false otherwise
  public function isSetMembershipState() : Bool {
    return this.__isset_membershipState;
  }

  public function get_memberRoles() : IntSet {
    return this.memberRoles;
  }

  public function set_memberRoles(memberRoles:IntSet) : IntSet {
    this.memberRoles = memberRoles;
    return this.memberRoles;
  }

  public function unsetMemberRoles() : Void {
    this.memberRoles = null;
  }

  // Returns true if field memberRoles is set (has been assigned a value) and false otherwise
  public function isSetMemberRoles() : Bool {
    return this.memberRoles != null;
  }

  public function get_displayName() : String {
    return this.displayName;
  }

  public function set_displayName(displayName:String) : String {
    this.displayName = displayName;
    return this.displayName;
  }

  public function unsetDisplayName() : Void {
    this.displayName = null;
  }

  // Returns true if field displayName is set (has been assigned a value) and false otherwise
  public function isSetDisplayName() : Bool {
    return this.displayName != null;
  }

  public function get_ableToReceiveMessage() : Int {
    return this.ableToReceiveMessage;
  }

  public function set_ableToReceiveMessage(ableToReceiveMessage:Int) : Int {
    this.ableToReceiveMessage = ableToReceiveMessage;
    this.__isset_ableToReceiveMessage = true;
    return this.ableToReceiveMessage;
  }

  public function unsetAbleToReceiveMessage() : Void {
    this.__isset_ableToReceiveMessage = false;
  }

  // Returns true if field ableToReceiveMessage is set (has been assigned a value) and false otherwise
  public function isSetAbleToReceiveMessage() : Bool {
    return this.__isset_ableToReceiveMessage;
  }

  public function get_ableToReceiveFriendRequest() : Int {
    return this.ableToReceiveFriendRequest;
  }

  public function set_ableToReceiveFriendRequest(ableToReceiveFriendRequest:Int) : Int {
    this.ableToReceiveFriendRequest = ableToReceiveFriendRequest;
    this.__isset_ableToReceiveFriendRequest = true;
    return this.ableToReceiveFriendRequest;
  }

  public function unsetAbleToReceiveFriendRequest() : Void {
    this.__isset_ableToReceiveFriendRequest = false;
  }

  // Returns true if field ableToReceiveFriendRequest is set (has been assigned a value) and false otherwise
  public function isSetAbleToReceiveFriendRequest() : Bool {
    return this.__isset_ableToReceiveFriendRequest;
  }

  public function get_chatMidToExcludeMembers() : String {
    return this.chatMidToExcludeMembers;
  }

  public function set_chatMidToExcludeMembers(chatMidToExcludeMembers:String) : String {
    this.chatMidToExcludeMembers = chatMidToExcludeMembers;
    return this.chatMidToExcludeMembers;
  }

  public function unsetChatMidToExcludeMembers() : Void {
    this.chatMidToExcludeMembers = null;
  }

  // Returns true if field chatMidToExcludeMembers is set (has been assigned a value) and false otherwise
  public function isSetChatMidToExcludeMembers() : Bool {
    return this.chatMidToExcludeMembers != null;
  }

  public function get_includingMe() : Bool {
    return this.includingMe;
  }

  public function set_includingMe(includingMe:Bool) : Bool {
    this.includingMe = includingMe;
    this.__isset_includingMe = true;
    return this.includingMe;
  }

  public function unsetIncludingMe() : Void {
    this.__isset_includingMe = false;
  }

  // Returns true if field includingMe is set (has been assigned a value) and false otherwise
  public function isSetIncludingMe() : Bool {
    return this.__isset_includingMe;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case MEMBERSHIPSTATE_FIELD_ID:
      if (value == null) {
        unsetMembershipState();
      } else {
        this.membershipState = value;
      }

    case MEMBERROLES_FIELD_ID:
      if (value == null) {
        unsetMemberRoles();
      } else {
        this.memberRoles = value;
      }

    case DISPLAYNAME_FIELD_ID:
      if (value == null) {
        unsetDisplayName();
      } else {
        this.displayName = value;
      }

    case ABLETORECEIVEMESSAGE_FIELD_ID:
      if (value == null) {
        unsetAbleToReceiveMessage();
      } else {
        this.ableToReceiveMessage = value;
      }

    case ABLETORECEIVEFRIENDREQUEST_FIELD_ID:
      if (value == null) {
        unsetAbleToReceiveFriendRequest();
      } else {
        this.ableToReceiveFriendRequest = value;
      }

    case CHATMIDTOEXCLUDEMEMBERS_FIELD_ID:
      if (value == null) {
        unsetChatMidToExcludeMembers();
      } else {
        this.chatMidToExcludeMembers = value;
      }

    case INCLUDINGME_FIELD_ID:
      if (value == null) {
        unsetIncludingMe();
      } else {
        this.includingMe = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case MEMBERSHIPSTATE_FIELD_ID:
      return this.membershipState;
    case MEMBERROLES_FIELD_ID:
      return this.memberRoles;
    case DISPLAYNAME_FIELD_ID:
      return this.displayName;
    case ABLETORECEIVEMESSAGE_FIELD_ID:
      return this.ableToReceiveMessage;
    case ABLETORECEIVEFRIENDREQUEST_FIELD_ID:
      return this.ableToReceiveFriendRequest;
    case CHATMIDTOEXCLUDEMEMBERS_FIELD_ID:
      return this.chatMidToExcludeMembers;
    case INCLUDINGME_FIELD_ID:
      return this.includingMe;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case MEMBERSHIPSTATE_FIELD_ID:
      return isSetMembershipState();
    case MEMBERROLES_FIELD_ID:
      return isSetMemberRoles();
    case DISPLAYNAME_FIELD_ID:
      return isSetDisplayName();
    case ABLETORECEIVEMESSAGE_FIELD_ID:
      return isSetAbleToReceiveMessage();
    case ABLETORECEIVEFRIENDREQUEST_FIELD_ID:
      return isSetAbleToReceiveFriendRequest();
    case CHATMIDTOEXCLUDEMEMBERS_FIELD_ID:
      return isSetChatMidToExcludeMembers();
    case INCLUDINGME_FIELD_ID:
      return isSetIncludingMe();
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
          case MEMBERSHIPSTATE_FIELD_ID:
            if (field.type == TType.I32) {
              this.membershipState = iprot.readI32();
              this.__isset_membershipState = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case MEMBERROLES_FIELD_ID:
            if (field.type == TType.SET) {
              {
                var _set467 = iprot.readSetBegin();
                this.memberRoles = new IntSet();
                for( _i468 in 0 ... _set467.size)
                {
                  var _elem469 : Int;
                  _elem469 = iprot.readI32();
                  this.memberRoles.add(_elem469);
                }
                iprot.readSetEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case DISPLAYNAME_FIELD_ID:
            if (field.type == TType.STRING) {
              this.displayName = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ABLETORECEIVEMESSAGE_FIELD_ID:
            if (field.type == TType.I32) {
              this.ableToReceiveMessage = iprot.readI32();
              this.__isset_ableToReceiveMessage = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case ABLETORECEIVEFRIENDREQUEST_FIELD_ID:
            if (field.type == TType.I32) {
              this.ableToReceiveFriendRequest = iprot.readI32();
              this.__isset_ableToReceiveFriendRequest = true;
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CHATMIDTOEXCLUDEMEMBERS_FIELD_ID:
            if (field.type == TType.STRING) {
              this.chatMidToExcludeMembers = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case INCLUDINGME_FIELD_ID:
            if (field.type == TType.BOOL) {
              this.includingMe = iprot.readBool();
              this.__isset_includingMe = true;
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
      oprot.writeFieldBegin(MEMBERSHIP_STATE_FIELD_DESC);
      oprot.writeI32(this.membershipState);
      oprot.writeFieldEnd();
      if (this.memberRoles != null) {
        oprot.writeFieldBegin(MEMBER_ROLES_FIELD_DESC);
        {
          oprot.writeSetBegin(new TSet(TType.I32, this.memberRoles.size));
          for( elem470 in this.memberRoles.toArray())
          {
            oprot.writeI32(elem470);
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(this.displayName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(ABLE_TO_RECEIVE_MESSAGE_FIELD_DESC);
      oprot.writeI32(this.ableToReceiveMessage);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ABLE_TO_RECEIVE_FRIEND_REQUEST_FIELD_DESC);
      oprot.writeI32(this.ableToReceiveFriendRequest);
      oprot.writeFieldEnd();
      if (this.chatMidToExcludeMembers != null) {
        oprot.writeFieldBegin(CHAT_MID_TO_EXCLUDE_MEMBERS_FIELD_DESC);
        oprot.writeString(this.chatMidToExcludeMembers);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INCLUDING_ME_FIELD_DESC);
      oprot.writeBool(this.includingMe);
      oprot.writeFieldEnd();
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
    var ret : String = "SquareMemberSearchOption(";
    var first : Bool = true;

    ret += "membershipState:";
    var membershipState_name : String = .SquareMembershipState.VALUES_TO_NAMES[this.membershipState];
    if (membershipState_name != null) {
      ret += membershipState_name;
      ret += " (";
    }
    ret += this.membershipState;
    if (membershipState_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "memberRoles:";
    if (this.memberRoles == null) {
      ret += "null";
    } else {
      ret += this.memberRoles;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "displayName:";
    if (this.displayName == null) {
      ret += "null";
    } else {
      ret += this.displayName;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "ableToReceiveMessage:";
    var ableToReceiveMessage_name : String = .BooleanState.VALUES_TO_NAMES[this.ableToReceiveMessage];
    if (ableToReceiveMessage_name != null) {
      ret += ableToReceiveMessage_name;
      ret += " (";
    }
    ret += this.ableToReceiveMessage;
    if (ableToReceiveMessage_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "ableToReceiveFriendRequest:";
    var ableToReceiveFriendRequest_name : String = .BooleanState.VALUES_TO_NAMES[this.ableToReceiveFriendRequest];
    if (ableToReceiveFriendRequest_name != null) {
      ret += ableToReceiveFriendRequest_name;
      ret += " (";
    }
    ret += this.ableToReceiveFriendRequest;
    if (ableToReceiveFriendRequest_name != null) {
      ret += ")";
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "chatMidToExcludeMembers:";
    if (this.chatMidToExcludeMembers == null) {
      ret += "null";
    } else {
      ret += this.chatMidToExcludeMembers;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "includingMe:";
    ret += this.includingMe;
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetMembershipState() && !.SquareMembershipState.VALID_VALUES.contains(membershipState)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'membershipState' has been assigned the invalid value " + membershipState);
    }
    if (isSetAbleToReceiveMessage() && !.BooleanState.VALID_VALUES.contains(ableToReceiveMessage)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'ableToReceiveMessage' has been assigned the invalid value " + ableToReceiveMessage);
    }
    if (isSetAbleToReceiveFriendRequest() && !.BooleanState.VALID_VALUES.contains(ableToReceiveFriendRequest)){
      throw new TProtocolException(TProtocolException.UNKNOWN, "The field 'ableToReceiveFriendRequest' has been assigned the invalid value " + ableToReceiveFriendRequest);
    }
  }

}

