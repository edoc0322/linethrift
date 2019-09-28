/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.Hashtable;
import java.util.Vector;
import java.util.Enumeration;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class WapInvitation implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("WapInvitation");

  private static final TField TYPE_FIELD_DESC = new TField("type", TType.I32, (short)1);
  private static final TField INVITEE_EMAIL_FIELD_DESC = new TField("inviteeEmail", TType.STRING, (short)10);
  private static final TField INVITER_MID_FIELD_DESC = new TField("inviterMid", TType.STRING, (short)11);
  private static final TField ROOM_MID_FIELD_DESC = new TField("roomMid", TType.STRING, (short)12);

  private WapInvitationType type;
  private String inviteeEmail;
  private String inviterMid;
  private String roomMid;

  // isset id assignments

  public WapInvitation() {
  }

  public WapInvitation(
    WapInvitationType type,
    String inviteeEmail,
    String inviterMid,
    String roomMid)
  {
    this();
    this.type = type;
    this.inviteeEmail = inviteeEmail;
    this.inviterMid = inviterMid;
    this.roomMid = roomMid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public WapInvitation(WapInvitation other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetInviteeEmail()) {
      this.inviteeEmail = other.inviteeEmail;
    }
    if (other.isSetInviterMid()) {
      this.inviterMid = other.inviterMid;
    }
    if (other.isSetRoomMid()) {
      this.roomMid = other.roomMid;
    }
  }

  public WapInvitation deepCopy() {
    return new WapInvitation(this);
  }

  public void clear() {
    this.type = null;
    this.inviteeEmail = null;
    this.inviterMid = null;
    this.roomMid = null;
  }

  /**
   * 
   * @see WapInvitationType
   */
  public WapInvitationType getType() {
    return this.type;
  }

  /**
   * 
   * @see WapInvitationType
   */
  public void setType(WapInvitationType type) {
    this.type = type;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public String getInviteeEmail() {
    return this.inviteeEmail;
  }

  public void setInviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
  }

  public void unsetInviteeEmail() {
    this.inviteeEmail = null;
  }

  /** Returns true if field inviteeEmail is set (has been assigned a value) and false otherwise */
  public boolean isSetInviteeEmail() {
    return this.inviteeEmail != null;
  }

  public void setInviteeEmailIsSet(boolean value) {
    if (!value) {
      this.inviteeEmail = null;
    }
  }

  public String getInviterMid() {
    return this.inviterMid;
  }

  public void setInviterMid(String inviterMid) {
    this.inviterMid = inviterMid;
  }

  public void unsetInviterMid() {
    this.inviterMid = null;
  }

  /** Returns true if field inviterMid is set (has been assigned a value) and false otherwise */
  public boolean isSetInviterMid() {
    return this.inviterMid != null;
  }

  public void setInviterMidIsSet(boolean value) {
    if (!value) {
      this.inviterMid = null;
    }
  }

  public String getRoomMid() {
    return this.roomMid;
  }

  public void setRoomMid(String roomMid) {
    this.roomMid = roomMid;
  }

  public void unsetRoomMid() {
    this.roomMid = null;
  }

  /** Returns true if field roomMid is set (has been assigned a value) and false otherwise */
  public boolean isSetRoomMid() {
    return this.roomMid != null;
  }

  public void setRoomMidIsSet(boolean value) {
    if (!value) {
      this.roomMid = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof WapInvitation)
      return this.equals((WapInvitation)that);
    return false;
  }

  public boolean equals(WapInvitation that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_inviteeEmail = true && this.isSetInviteeEmail();
    boolean that_present_inviteeEmail = true && that.isSetInviteeEmail();
    if (this_present_inviteeEmail || that_present_inviteeEmail) {
      if (!(this_present_inviteeEmail && that_present_inviteeEmail))
        return false;
      if (!this.inviteeEmail.equals(that.inviteeEmail))
        return false;
    }

    boolean this_present_inviterMid = true && this.isSetInviterMid();
    boolean that_present_inviterMid = true && that.isSetInviterMid();
    if (this_present_inviterMid || that_present_inviterMid) {
      if (!(this_present_inviterMid && that_present_inviterMid))
        return false;
      if (!this.inviterMid.equals(that.inviterMid))
        return false;
    }

    boolean this_present_roomMid = true && this.isSetRoomMid();
    boolean that_present_roomMid = true && that.isSetRoomMid();
    if (this_present_roomMid || that_present_roomMid) {
      if (!(this_present_roomMid && that_present_roomMid))
        return false;
      if (!this.roomMid.equals(that.roomMid))
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    WapInvitation other = (WapInvitation)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetType(), other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetInviteeEmail(), other.isSetInviteeEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInviteeEmail()) {
      lastComparison = TBaseHelper.compareTo(this.inviteeEmail, other.inviteeEmail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetInviterMid(), other.isSetInviterMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInviterMid()) {
      lastComparison = TBaseHelper.compareTo(this.inviterMid, other.inviterMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRoomMid(), other.isSetRoomMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRoomMid()) {
      lastComparison = TBaseHelper.compareTo(this.roomMid, other.roomMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // TYPE
          if (field.type == TType.I32) {
            this.type = WapInvitationType.findByValue(iprot.readI32());
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // INVITEE_EMAIL
          if (field.type == TType.STRING) {
            this.inviteeEmail = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 11: // INVITER_MID
          if (field.type == TType.STRING) {
            this.inviterMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 12: // ROOM_MID
          if (field.type == TType.STRING) {
            this.roomMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.type != null) {
      oprot.writeFieldBegin(TYPE_FIELD_DESC);
      oprot.writeI32(this.type.getValue());
      oprot.writeFieldEnd();
    }
    if (this.inviteeEmail != null) {
      oprot.writeFieldBegin(INVITEE_EMAIL_FIELD_DESC);
      oprot.writeString(this.inviteeEmail);
      oprot.writeFieldEnd();
    }
    if (this.inviterMid != null) {
      oprot.writeFieldBegin(INVITER_MID_FIELD_DESC);
      oprot.writeString(this.inviterMid);
      oprot.writeFieldEnd();
    }
    if (this.roomMid != null) {
      oprot.writeFieldBegin(ROOM_MID_FIELD_DESC);
      oprot.writeString(this.roomMid);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("WapInvitation(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("inviteeEmail:");
    if (this.inviteeEmail == null) {
      sb.append("null");
    } else {
      sb.append(this.inviteeEmail);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("inviterMid:");
    if (this.inviterMid == null) {
      sb.append("null");
    } else {
      sb.append(this.inviterMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("roomMid:");
    if (this.roomMid == null) {
      sb.append("null");
    } else {
      sb.append(this.roomMid);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
