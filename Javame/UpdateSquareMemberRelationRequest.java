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

public class UpdateSquareMemberRelationRequest implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("UpdateSquareMemberRelationRequest");

  private static final TField SQUARE_MID_FIELD_DESC = new TField("squareMid", TType.STRING, (short)2);
  private static final TField TARGET_SQUARE_MEMBER_MID_FIELD_DESC = new TField("targetSquareMemberMid", TType.STRING, (short)3);
  private static final TField UPDATED_ATTRS_FIELD_DESC = new TField("updatedAttrs", TType.SET, (short)4);
  private static final TField RELATION_FIELD_DESC = new TField("relation", TType.STRUCT, (short)5);

  private String squareMid;
  private String targetSquareMemberMid;
  private Hashtable updatedAttrs;
  private SquareMemberRelation relation;

  // isset id assignments

  public UpdateSquareMemberRelationRequest() {
  }

  public UpdateSquareMemberRelationRequest(
    String squareMid,
    String targetSquareMemberMid,
    Hashtable updatedAttrs,
    SquareMemberRelation relation)
  {
    this();
    this.squareMid = squareMid;
    this.targetSquareMemberMid = targetSquareMemberMid;
    this.updatedAttrs = updatedAttrs;
    this.relation = relation;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateSquareMemberRelationRequest(UpdateSquareMemberRelationRequest other) {
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    if (other.isSetTargetSquareMemberMid()) {
      this.targetSquareMemberMid = other.targetSquareMemberMid;
    }
    if (other.isSetUpdatedAttrs()) {
      Hashtable __this__updatedAttrs = new Hashtable();
      for (Enumeration other_enum = other.updatedAttrs.elements(); other_enum.hasMoreElements(); ) {
        SquareMemberRelationAttribute other_element = (SquareMemberRelationAttribute)other_enum.nextElement();
        __this__updatedAttrs.addElement(other_element);
      }
      this.updatedAttrs = __this__updatedAttrs;
    }
    if (other.isSetRelation()) {
      this.relation = new SquareMemberRelation(other.relation);
    }
  }

  public UpdateSquareMemberRelationRequest deepCopy() {
    return new UpdateSquareMemberRelationRequest(this);
  }

  public void clear() {
    this.squareMid = null;
    this.targetSquareMemberMid = null;
    this.updatedAttrs = null;
    this.relation = null;
  }

  public String getSquareMid() {
    return this.squareMid;
  }

  public void setSquareMid(String squareMid) {
    this.squareMid = squareMid;
  }

  public void unsetSquareMid() {
    this.squareMid = null;
  }

  /** Returns true if field squareMid is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMid() {
    return this.squareMid != null;
  }

  public void setSquareMidIsSet(boolean value) {
    if (!value) {
      this.squareMid = null;
    }
  }

  public String getTargetSquareMemberMid() {
    return this.targetSquareMemberMid;
  }

  public void setTargetSquareMemberMid(String targetSquareMemberMid) {
    this.targetSquareMemberMid = targetSquareMemberMid;
  }

  public void unsetTargetSquareMemberMid() {
    this.targetSquareMemberMid = null;
  }

  /** Returns true if field targetSquareMemberMid is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetSquareMemberMid() {
    return this.targetSquareMemberMid != null;
  }

  public void setTargetSquareMemberMidIsSet(boolean value) {
    if (!value) {
      this.targetSquareMemberMid = null;
    }
  }

  public int getUpdatedAttrsSize() {
    return (this.updatedAttrs == null) ? 0 : this.updatedAttrs.size();
  }

  public Enumeration getUpdatedAttrsEnumeration() {
    return (this.updatedAttrs == null) ? null : this.updatedAttrs.elements();
  }

  public void addToUpdatedAttrs(SquareMemberRelationAttribute elem) {
    if (this.updatedAttrs == null) {
      this.updatedAttrs = new Hashtable();
    }
    this.updatedAttrs.put(elem, elem);
  }

  public Hashtable getUpdatedAttrs() {
    return this.updatedAttrs;
  }

  public void setUpdatedAttrs(Hashtable updatedAttrs) {
    this.updatedAttrs = updatedAttrs;
  }

  public void unsetUpdatedAttrs() {
    this.updatedAttrs = null;
  }

  /** Returns true if field updatedAttrs is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedAttrs() {
    return this.updatedAttrs != null;
  }

  public void setUpdatedAttrsIsSet(boolean value) {
    if (!value) {
      this.updatedAttrs = null;
    }
  }

  public SquareMemberRelation getRelation() {
    return this.relation;
  }

  public void setRelation(SquareMemberRelation relation) {
    this.relation = relation;
  }

  public void unsetRelation() {
    this.relation = null;
  }

  /** Returns true if field relation is set (has been assigned a value) and false otherwise */
  public boolean isSetRelation() {
    return this.relation != null;
  }

  public void setRelationIsSet(boolean value) {
    if (!value) {
      this.relation = null;
    }
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateSquareMemberRelationRequest)
      return this.equals((UpdateSquareMemberRelationRequest)that);
    return false;
  }

  public boolean equals(UpdateSquareMemberRelationRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareMid = true && this.isSetSquareMid();
    boolean that_present_squareMid = true && that.isSetSquareMid();
    if (this_present_squareMid || that_present_squareMid) {
      if (!(this_present_squareMid && that_present_squareMid))
        return false;
      if (!this.squareMid.equals(that.squareMid))
        return false;
    }

    boolean this_present_targetSquareMemberMid = true && this.isSetTargetSquareMemberMid();
    boolean that_present_targetSquareMemberMid = true && that.isSetTargetSquareMemberMid();
    if (this_present_targetSquareMemberMid || that_present_targetSquareMemberMid) {
      if (!(this_present_targetSquareMemberMid && that_present_targetSquareMemberMid))
        return false;
      if (!this.targetSquareMemberMid.equals(that.targetSquareMemberMid))
        return false;
    }

    boolean this_present_updatedAttrs = true && this.isSetUpdatedAttrs();
    boolean that_present_updatedAttrs = true && that.isSetUpdatedAttrs();
    if (this_present_updatedAttrs || that_present_updatedAttrs) {
      if (!(this_present_updatedAttrs && that_present_updatedAttrs))
        return false;
      if (!this.updatedAttrs.equals(that.updatedAttrs))
        return false;
    }

    boolean this_present_relation = true && this.isSetRelation();
    boolean that_present_relation = true && that.isSetRelation();
    if (this_present_relation || that_present_relation) {
      if (!(this_present_relation && that_present_relation))
        return false;
      if (!this.relation.equals(that.relation))
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

    UpdateSquareMemberRelationRequest other = (UpdateSquareMemberRelationRequest)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetSquareMid(), other.isSetSquareMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMid()) {
      lastComparison = TBaseHelper.compareTo(this.squareMid, other.squareMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTargetSquareMemberMid(), other.isSetTargetSquareMemberMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetSquareMemberMid()) {
      lastComparison = TBaseHelper.compareTo(this.targetSquareMemberMid, other.targetSquareMemberMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetUpdatedAttrs(), other.isSetUpdatedAttrs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedAttrs()) {
      lastComparison = TBaseHelper.compareTo(this.updatedAttrs, other.updatedAttrs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetRelation(), other.isSetRelation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRelation()) {
      lastComparison = this.relation.compareTo(other.relation);
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
        case 2: // SQUARE_MID
          if (field.type == TType.STRING) {
            this.squareMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // TARGET_SQUARE_MEMBER_MID
          if (field.type == TType.STRING) {
            this.targetSquareMemberMid = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // UPDATED_ATTRS
          if (field.type == TType.SET) {
            {
              TSet _set491 = iprot.readSetBegin();
              this.updatedAttrs = new Hashtable(2*_set491.size);
              for (int _i492 = 0; _i492 < _set491.size; ++_i492)
              {
                SquareMemberRelationAttribute _elem493;
                _elem493 = SquareMemberRelationAttribute.findByValue(iprot.readI32());
                this.updatedAttrs.put(_elem493, _elem493);
              }
              iprot.readSetEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 5: // RELATION
          if (field.type == TType.STRUCT) {
            this.relation = new SquareMemberRelation();
            this.relation.read(iprot);
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
    if (this.squareMid != null) {
      oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
      oprot.writeString(this.squareMid);
      oprot.writeFieldEnd();
    }
    if (this.targetSquareMemberMid != null) {
      oprot.writeFieldBegin(TARGET_SQUARE_MEMBER_MID_FIELD_DESC);
      oprot.writeString(this.targetSquareMemberMid);
      oprot.writeFieldEnd();
    }
    if (this.updatedAttrs != null) {
      oprot.writeFieldBegin(UPDATED_ATTRS_FIELD_DESC);
      {
        oprot.writeSetBegin(new TSet(TType.I32, this.updatedAttrs.size()));
        for (Enumeration _iter494_enum = this.updatedAttrs.keys(); _iter494_enum.hasMoreElements(); )         {
          SquareMemberRelationAttribute _iter494 = (SquareMemberRelationAttribute)_iter494_enum.nextElement();
          oprot.writeI32(_iter494.getValue());
        }
        oprot.writeSetEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.relation != null) {
      oprot.writeFieldBegin(RELATION_FIELD_DESC);
      this.relation.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("UpdateSquareMemberRelationRequest(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("targetSquareMemberMid:");
    if (this.targetSquareMemberMid == null) {
      sb.append("null");
    } else {
      sb.append(this.targetSquareMemberMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("updatedAttrs:");
    if (this.updatedAttrs == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedAttrs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("relation:");
    if (this.relation == null) {
      sb.append("null");
    } else {
      sb.append(this.relation);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
