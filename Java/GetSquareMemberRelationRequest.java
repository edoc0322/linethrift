/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class GetSquareMemberRelationRequest implements org.apache.thrift.TBase<GetSquareMemberRelationRequest, GetSquareMemberRelationRequest._Fields>, java.io.Serializable, Cloneable, Comparable<GetSquareMemberRelationRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetSquareMemberRelationRequest");

  private static final org.apache.thrift.protocol.TField SQUARE_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TARGET_SQUARE_MEMBER_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("targetSquareMemberMid", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetSquareMemberRelationRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetSquareMemberRelationRequestTupleSchemeFactory();

  public java.lang.String squareMid; // required
  public java.lang.String targetSquareMemberMid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_MID((short)2, "squareMid"),
    TARGET_SQUARE_MEMBER_MID((short)3, "targetSquareMemberMid");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 2: // SQUARE_MID
          return SQUARE_MID;
        case 3: // TARGET_SQUARE_MEMBER_MID
          return TARGET_SQUARE_MEMBER_MID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQUARE_MID, new org.apache.thrift.meta_data.FieldMetaData("squareMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TARGET_SQUARE_MEMBER_MID, new org.apache.thrift.meta_data.FieldMetaData("targetSquareMemberMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetSquareMemberRelationRequest.class, metaDataMap);
  }

  public GetSquareMemberRelationRequest() {
  }

  public GetSquareMemberRelationRequest(
    java.lang.String squareMid,
    java.lang.String targetSquareMemberMid)
  {
    this();
    this.squareMid = squareMid;
    this.targetSquareMemberMid = targetSquareMemberMid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareMemberRelationRequest(GetSquareMemberRelationRequest other) {
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    if (other.isSetTargetSquareMemberMid()) {
      this.targetSquareMemberMid = other.targetSquareMemberMid;
    }
  }

  public GetSquareMemberRelationRequest deepCopy() {
    return new GetSquareMemberRelationRequest(this);
  }

  @Override
  public void clear() {
    this.squareMid = null;
    this.targetSquareMemberMid = null;
  }

  public java.lang.String getSquareMid() {
    return this.squareMid;
  }

  public GetSquareMemberRelationRequest setSquareMid(java.lang.String squareMid) {
    this.squareMid = squareMid;
    return this;
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

  public java.lang.String getTargetSquareMemberMid() {
    return this.targetSquareMemberMid;
  }

  public GetSquareMemberRelationRequest setTargetSquareMemberMid(java.lang.String targetSquareMemberMid) {
    this.targetSquareMemberMid = targetSquareMemberMid;
    return this;
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

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SQUARE_MID:
      if (value == null) {
        unsetSquareMid();
      } else {
        setSquareMid((java.lang.String)value);
      }
      break;

    case TARGET_SQUARE_MEMBER_MID:
      if (value == null) {
        unsetTargetSquareMemberMid();
      } else {
        setTargetSquareMemberMid((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_MID:
      return getSquareMid();

    case TARGET_SQUARE_MEMBER_MID:
      return getTargetSquareMemberMid();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_MID:
      return isSetSquareMid();
    case TARGET_SQUARE_MEMBER_MID:
      return isSetTargetSquareMemberMid();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSquareMemberRelationRequest)
      return this.equals((GetSquareMemberRelationRequest)that);
    return false;
  }

  public boolean equals(GetSquareMemberRelationRequest that) {
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

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSquareMid()) ? 131071 : 524287);
    if (isSetSquareMid())
      hashCode = hashCode * 8191 + squareMid.hashCode();

    hashCode = hashCode * 8191 + ((isSetTargetSquareMemberMid()) ? 131071 : 524287);
    if (isSetTargetSquareMemberMid())
      hashCode = hashCode * 8191 + targetSquareMemberMid.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetSquareMemberRelationRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSquareMid()).compareTo(other.isSetSquareMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareMid, other.squareMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTargetSquareMemberMid()).compareTo(other.isSetTargetSquareMemberMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetSquareMemberMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetSquareMemberMid, other.targetSquareMemberMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSquareMemberRelationRequest(");
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
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetSquareMemberRelationRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSquareMemberRelationRequestStandardScheme getScheme() {
      return new GetSquareMemberRelationRequestStandardScheme();
    }
  }

  private static class GetSquareMemberRelationRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetSquareMemberRelationRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetSquareMemberRelationRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // SQUARE_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareMid = iprot.readString();
              struct.setSquareMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TARGET_SQUARE_MEMBER_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.targetSquareMemberMid = iprot.readString();
              struct.setTargetSquareMemberMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetSquareMemberRelationRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareMid != null) {
        oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
        oprot.writeString(struct.squareMid);
        oprot.writeFieldEnd();
      }
      if (struct.targetSquareMemberMid != null) {
        oprot.writeFieldBegin(TARGET_SQUARE_MEMBER_MID_FIELD_DESC);
        oprot.writeString(struct.targetSquareMemberMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetSquareMemberRelationRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSquareMemberRelationRequestTupleScheme getScheme() {
      return new GetSquareMemberRelationRequestTupleScheme();
    }
  }

  private static class GetSquareMemberRelationRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetSquareMemberRelationRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetSquareMemberRelationRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareMid()) {
        optionals.set(0);
      }
      if (struct.isSetTargetSquareMemberMid()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSquareMid()) {
        oprot.writeString(struct.squareMid);
      }
      if (struct.isSetTargetSquareMemberMid()) {
        oprot.writeString(struct.targetSquareMemberMid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetSquareMemberRelationRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.squareMid = iprot.readString();
        struct.setSquareMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.targetSquareMemberMid = iprot.readString();
        struct.setTargetSquareMemberMidIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

