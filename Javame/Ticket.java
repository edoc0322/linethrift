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

public class Ticket implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("Ticket");

  private static final TField ID_FIELD_DESC = new TField("id", TType.STRING, (short)1);
  private static final TField EXPIRATION_TIME_FIELD_DESC = new TField("expirationTime", TType.I64, (short)10);
  private static final TField MAX_USE_COUNT_FIELD_DESC = new TField("maxUseCount", TType.I32, (short)21);

  private String id;
  private long expirationTime;
  private int maxUseCount;

  // isset id assignments
  private static final int __EXPIRATIONTIME_ISSET_ID = 0;
  private static final int __MAXUSECOUNT_ISSET_ID = 1;
  private boolean[] __isset_vector = new boolean[2];

  public Ticket() {
  }

  public Ticket(
    String id,
    long expirationTime,
    int maxUseCount)
  {
    this();
    this.id = id;
    this.expirationTime = expirationTime;
    setExpirationTimeIsSet(true);
    this.maxUseCount = maxUseCount;
    setMaxUseCountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Ticket(Ticket other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    if (other.isSetId()) {
      this.id = other.id;
    }
    this.expirationTime = other.expirationTime;
    this.maxUseCount = other.maxUseCount;
  }

  public Ticket deepCopy() {
    return new Ticket(this);
  }

  public void clear() {
    this.id = null;
    setExpirationTimeIsSet(false);
    this.expirationTime = 0;
    setMaxUseCountIsSet(false);
    this.maxUseCount = 0;
  }

  public String getId() {
    return this.id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public long getExpirationTime() {
    return this.expirationTime;
  }

  public void setExpirationTime(long expirationTime) {
    this.expirationTime = expirationTime;
    setExpirationTimeIsSet(true);
  }

  public void unsetExpirationTime() {
    __isset_vector[__EXPIRATIONTIME_ISSET_ID] = false;
  }

  /** Returns true if field expirationTime is set (has been assigned a value) and false otherwise */
  public boolean isSetExpirationTime() {
    return __isset_vector[__EXPIRATIONTIME_ISSET_ID];
  }

  public void setExpirationTimeIsSet(boolean value) {
    __isset_vector[__EXPIRATIONTIME_ISSET_ID] = value;
  }

  public int getMaxUseCount() {
    return this.maxUseCount;
  }

  public void setMaxUseCount(int maxUseCount) {
    this.maxUseCount = maxUseCount;
    setMaxUseCountIsSet(true);
  }

  public void unsetMaxUseCount() {
    __isset_vector[__MAXUSECOUNT_ISSET_ID] = false;
  }

  /** Returns true if field maxUseCount is set (has been assigned a value) and false otherwise */
  public boolean isSetMaxUseCount() {
    return __isset_vector[__MAXUSECOUNT_ISSET_ID];
  }

  public void setMaxUseCountIsSet(boolean value) {
    __isset_vector[__MAXUSECOUNT_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Ticket)
      return this.equals((Ticket)that);
    return false;
  }

  public boolean equals(Ticket that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_expirationTime = true;
    boolean that_present_expirationTime = true;
    if (this_present_expirationTime || that_present_expirationTime) {
      if (!(this_present_expirationTime && that_present_expirationTime))
        return false;
      if (this.expirationTime != that.expirationTime)
        return false;
    }

    boolean this_present_maxUseCount = true;
    boolean that_present_maxUseCount = true;
    if (this_present_maxUseCount || that_present_maxUseCount) {
      if (!(this_present_maxUseCount && that_present_maxUseCount))
        return false;
      if (this.maxUseCount != that.maxUseCount)
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

    Ticket other = (Ticket)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetId(), other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetExpirationTime(), other.isSetExpirationTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExpirationTime()) {
      lastComparison = TBaseHelper.compareTo(this.expirationTime, other.expirationTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetMaxUseCount(), other.isSetMaxUseCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaxUseCount()) {
      lastComparison = TBaseHelper.compareTo(this.maxUseCount, other.maxUseCount);
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
        case 1: // ID
          if (field.type == TType.STRING) {
            this.id = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 10: // EXPIRATION_TIME
          if (field.type == TType.I64) {
            this.expirationTime = iprot.readI64();
            setExpirationTimeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 21: // MAX_USE_COUNT
          if (field.type == TType.I32) {
            this.maxUseCount = iprot.readI32();
            setMaxUseCountIsSet(true);
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
    if (this.id != null) {
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeString(this.id);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(EXPIRATION_TIME_FIELD_DESC);
    oprot.writeI64(this.expirationTime);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(MAX_USE_COUNT_FIELD_DESC);
    oprot.writeI32(this.maxUseCount);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("Ticket(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("expirationTime:");
    sb.append(this.expirationTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("maxUseCount:");
    sb.append(this.maxUseCount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

