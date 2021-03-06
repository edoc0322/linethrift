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

public class SquareEventNotifiedCreateSquareChatMember implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("SquareEventNotifiedCreateSquareChatMember");

  private static final TField SQUARE_CHAT_MID_FIELD_DESC = new TField("squareChatMid", TType.STRING, (short)1);
  private static final TField SQUARE_MEMBER_MID_FIELD_DESC = new TField("squareMemberMid", TType.STRING, (short)2);
  private static final TField SQUARE_CHAT_MEMBER_FIELD_DESC = new TField("squareChatMember", TType.STRUCT, (short)3);

  private String squareChatMid;
  private String squareMemberMid;
  private SquareChatMember squareChatMember;

  // isset id assignments

  public SquareEventNotifiedCreateSquareChatMember() {
  }

  public SquareEventNotifiedCreateSquareChatMember(
    String squareChatMid,
    String squareMemberMid,
    SquareChatMember squareChatMember)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.squareMemberMid = squareMemberMid;
    this.squareChatMember = squareChatMember;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotifiedCreateSquareChatMember(SquareEventNotifiedCreateSquareChatMember other) {
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetSquareMemberMid()) {
      this.squareMemberMid = other.squareMemberMid;
    }
    if (other.isSetSquareChatMember()) {
      this.squareChatMember = new SquareChatMember(other.squareChatMember);
    }
  }

  public SquareEventNotifiedCreateSquareChatMember deepCopy() {
    return new SquareEventNotifiedCreateSquareChatMember(this);
  }

  public void clear() {
    this.squareChatMid = null;
    this.squareMemberMid = null;
    this.squareChatMember = null;
  }

  public String getSquareChatMid() {
    return this.squareChatMid;
  }

  public void setSquareChatMid(String squareChatMid) {
    this.squareChatMid = squareChatMid;
  }

  public void unsetSquareChatMid() {
    this.squareChatMid = null;
  }

  /** Returns true if field squareChatMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMid() {
    return this.squareChatMid != null;
  }

  public void setSquareChatMidIsSet(boolean value) {
    if (!value) {
      this.squareChatMid = null;
    }
  }

  public String getSquareMemberMid() {
    return this.squareMemberMid;
  }

  public void setSquareMemberMid(String squareMemberMid) {
    this.squareMemberMid = squareMemberMid;
  }

  public void unsetSquareMemberMid() {
    this.squareMemberMid = null;
  }

  /** Returns true if field squareMemberMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMemberMid() {
    return this.squareMemberMid != null;
  }

  public void setSquareMemberMidIsSet(boolean value) {
    if (!value) {
      this.squareMemberMid = null;
    }
  }

  public SquareChatMember getSquareChatMember() {
    return this.squareChatMember;
  }

  public void setSquareChatMember(SquareChatMember squareChatMember) {
    this.squareChatMember = squareChatMember;
  }

  public void unsetSquareChatMember() {
    this.squareChatMember = null;
  }

  /** Returns true if field squareChatMember is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatMember() {
    return this.squareChatMember != null;
  }

  public void setSquareChatMemberIsSet(boolean value) {
    if (!value) {
      this.squareChatMember = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotifiedCreateSquareChatMember)
      return this.equals((SquareEventNotifiedCreateSquareChatMember)that);
    return false;
  }

  public boolean equals(SquareEventNotifiedCreateSquareChatMember that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
        return false;
    }

    boolean this_present_squareMemberMid = true && this.isSetSquareMemberMid();
    boolean that_present_squareMemberMid = true && that.isSetSquareMemberMid();
    if (this_present_squareMemberMid || that_present_squareMemberMid) {
      if (!(this_present_squareMemberMid && that_present_squareMemberMid))
        return false;
      if (!this.squareMemberMid.equals(that.squareMemberMid))
        return false;
    }

    boolean this_present_squareChatMember = true && this.isSetSquareChatMember();
    boolean that_present_squareChatMember = true && that.isSetSquareChatMember();
    if (this_present_squareChatMember || that_present_squareChatMember) {
      if (!(this_present_squareChatMember && that_present_squareChatMember))
        return false;
      if (!this.squareChatMember.equals(that.squareChatMember))
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

    SquareEventNotifiedCreateSquareChatMember other = (SquareEventNotifiedCreateSquareChatMember)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquareChatMid(), other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareMemberMid(), other.isSetSquareMemberMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMemberMid()) {
      lastComparison = TBaseHelper.compareTo(this.squareMemberMid, other.squareMemberMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetSquareChatMember(), other.isSetSquareChatMember());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMember()) {
      lastComparison = this.squareChatMember.compareTo(other.squareChatMember);
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
        case 1: // SQUARE_CHAT_MID
          if (field.type == TType.STRING) {
            this.squareChatMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SQUARE_MEMBER_MID
          if (field.type == TType.STRING) {
            this.squareMemberMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // SQUARE_CHAT_MEMBER
          if (field.type == TType.STRUCT) {
            this.squareChatMember = new SquareChatMember();
            this.squareChatMember.read(iprot);
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
    if (this.squareChatMid != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
      oprot.writeString(this.squareChatMid);
      oprot.writeFieldEnd();
    }
    if (this.squareMemberMid != null) {
      oprot.writeFieldBegin(SQUARE_MEMBER_MID_FIELD_DESC);
      oprot.writeString(this.squareMemberMid);
      oprot.writeFieldEnd();
    }
    if (this.squareChatMember != null) {
      oprot.writeFieldBegin(SQUARE_CHAT_MEMBER_FIELD_DESC);
      this.squareChatMember.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("SquareEventNotifiedCreateSquareChatMember(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareMemberMid:");
    if (this.squareMemberMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMemberMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatMember:");
    if (this.squareChatMember == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMember);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

