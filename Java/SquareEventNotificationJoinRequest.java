/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class SquareEventNotificationJoinRequest implements org.apache.thrift.TBase<SquareEventNotificationJoinRequest, SquareEventNotificationJoinRequest._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotificationJoinRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotificationJoinRequest");

  private static final org.apache.thrift.protocol.TField SQUARE_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("squareName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField REQUEST_MEMBER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("requestMemberName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PROFILE_IMAGE_OBS_HASH_FIELD_DESC = new org.apache.thrift.protocol.TField("profileImageObsHash", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareEventNotificationJoinRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareEventNotificationJoinRequestTupleSchemeFactory();

  public java.lang.String squareMid; // required
  public java.lang.String squareName; // required
  public java.lang.String requestMemberName; // required
  public java.lang.String profileImageObsHash; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_MID((short)1, "squareMid"),
    SQUARE_NAME((short)2, "squareName"),
    REQUEST_MEMBER_NAME((short)3, "requestMemberName"),
    PROFILE_IMAGE_OBS_HASH((short)4, "profileImageObsHash");

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
        case 1: // SQUARE_MID
          return SQUARE_MID;
        case 2: // SQUARE_NAME
          return SQUARE_NAME;
        case 3: // REQUEST_MEMBER_NAME
          return REQUEST_MEMBER_NAME;
        case 4: // PROFILE_IMAGE_OBS_HASH
          return PROFILE_IMAGE_OBS_HASH;
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
    tmpMap.put(_Fields.SQUARE_NAME, new org.apache.thrift.meta_data.FieldMetaData("squareName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REQUEST_MEMBER_NAME, new org.apache.thrift.meta_data.FieldMetaData("requestMemberName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PROFILE_IMAGE_OBS_HASH, new org.apache.thrift.meta_data.FieldMetaData("profileImageObsHash", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotificationJoinRequest.class, metaDataMap);
  }

  public SquareEventNotificationJoinRequest() {
  }

  public SquareEventNotificationJoinRequest(
    java.lang.String squareMid,
    java.lang.String squareName,
    java.lang.String requestMemberName,
    java.lang.String profileImageObsHash)
  {
    this();
    this.squareMid = squareMid;
    this.squareName = squareName;
    this.requestMemberName = requestMemberName;
    this.profileImageObsHash = profileImageObsHash;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotificationJoinRequest(SquareEventNotificationJoinRequest other) {
    if (other.isSetSquareMid()) {
      this.squareMid = other.squareMid;
    }
    if (other.isSetSquareName()) {
      this.squareName = other.squareName;
    }
    if (other.isSetRequestMemberName()) {
      this.requestMemberName = other.requestMemberName;
    }
    if (other.isSetProfileImageObsHash()) {
      this.profileImageObsHash = other.profileImageObsHash;
    }
  }

  public SquareEventNotificationJoinRequest deepCopy() {
    return new SquareEventNotificationJoinRequest(this);
  }

  @Override
  public void clear() {
    this.squareMid = null;
    this.squareName = null;
    this.requestMemberName = null;
    this.profileImageObsHash = null;
  }

  public java.lang.String getSquareMid() {
    return this.squareMid;
  }

  public SquareEventNotificationJoinRequest setSquareMid(java.lang.String squareMid) {
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

  public java.lang.String getSquareName() {
    return this.squareName;
  }

  public SquareEventNotificationJoinRequest setSquareName(java.lang.String squareName) {
    this.squareName = squareName;
    return this;
  }

  public void unsetSquareName() {
    this.squareName = null;
  }

  /** Returns true if field squareName is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareName() {
    return this.squareName != null;
  }

  public void setSquareNameIsSet(boolean value) {
    if (!value) {
      this.squareName = null;
    }
  }

  public java.lang.String getRequestMemberName() {
    return this.requestMemberName;
  }

  public SquareEventNotificationJoinRequest setRequestMemberName(java.lang.String requestMemberName) {
    this.requestMemberName = requestMemberName;
    return this;
  }

  public void unsetRequestMemberName() {
    this.requestMemberName = null;
  }

  /** Returns true if field requestMemberName is set (has been assigned a value) and false otherwise */
  public boolean isSetRequestMemberName() {
    return this.requestMemberName != null;
  }

  public void setRequestMemberNameIsSet(boolean value) {
    if (!value) {
      this.requestMemberName = null;
    }
  }

  public java.lang.String getProfileImageObsHash() {
    return this.profileImageObsHash;
  }

  public SquareEventNotificationJoinRequest setProfileImageObsHash(java.lang.String profileImageObsHash) {
    this.profileImageObsHash = profileImageObsHash;
    return this;
  }

  public void unsetProfileImageObsHash() {
    this.profileImageObsHash = null;
  }

  /** Returns true if field profileImageObsHash is set (has been assigned a value) and false otherwise */
  public boolean isSetProfileImageObsHash() {
    return this.profileImageObsHash != null;
  }

  public void setProfileImageObsHashIsSet(boolean value) {
    if (!value) {
      this.profileImageObsHash = null;
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

    case SQUARE_NAME:
      if (value == null) {
        unsetSquareName();
      } else {
        setSquareName((java.lang.String)value);
      }
      break;

    case REQUEST_MEMBER_NAME:
      if (value == null) {
        unsetRequestMemberName();
      } else {
        setRequestMemberName((java.lang.String)value);
      }
      break;

    case PROFILE_IMAGE_OBS_HASH:
      if (value == null) {
        unsetProfileImageObsHash();
      } else {
        setProfileImageObsHash((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_MID:
      return getSquareMid();

    case SQUARE_NAME:
      return getSquareName();

    case REQUEST_MEMBER_NAME:
      return getRequestMemberName();

    case PROFILE_IMAGE_OBS_HASH:
      return getProfileImageObsHash();

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
    case SQUARE_NAME:
      return isSetSquareName();
    case REQUEST_MEMBER_NAME:
      return isSetRequestMemberName();
    case PROFILE_IMAGE_OBS_HASH:
      return isSetProfileImageObsHash();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotificationJoinRequest)
      return this.equals((SquareEventNotificationJoinRequest)that);
    return false;
  }

  public boolean equals(SquareEventNotificationJoinRequest that) {
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

    boolean this_present_squareName = true && this.isSetSquareName();
    boolean that_present_squareName = true && that.isSetSquareName();
    if (this_present_squareName || that_present_squareName) {
      if (!(this_present_squareName && that_present_squareName))
        return false;
      if (!this.squareName.equals(that.squareName))
        return false;
    }

    boolean this_present_requestMemberName = true && this.isSetRequestMemberName();
    boolean that_present_requestMemberName = true && that.isSetRequestMemberName();
    if (this_present_requestMemberName || that_present_requestMemberName) {
      if (!(this_present_requestMemberName && that_present_requestMemberName))
        return false;
      if (!this.requestMemberName.equals(that.requestMemberName))
        return false;
    }

    boolean this_present_profileImageObsHash = true && this.isSetProfileImageObsHash();
    boolean that_present_profileImageObsHash = true && that.isSetProfileImageObsHash();
    if (this_present_profileImageObsHash || that_present_profileImageObsHash) {
      if (!(this_present_profileImageObsHash && that_present_profileImageObsHash))
        return false;
      if (!this.profileImageObsHash.equals(that.profileImageObsHash))
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

    hashCode = hashCode * 8191 + ((isSetSquareName()) ? 131071 : 524287);
    if (isSetSquareName())
      hashCode = hashCode * 8191 + squareName.hashCode();

    hashCode = hashCode * 8191 + ((isSetRequestMemberName()) ? 131071 : 524287);
    if (isSetRequestMemberName())
      hashCode = hashCode * 8191 + requestMemberName.hashCode();

    hashCode = hashCode * 8191 + ((isSetProfileImageObsHash()) ? 131071 : 524287);
    if (isSetProfileImageObsHash())
      hashCode = hashCode * 8191 + profileImageObsHash.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SquareEventNotificationJoinRequest other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetSquareName()).compareTo(other.isSetSquareName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareName, other.squareName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRequestMemberName()).compareTo(other.isSetRequestMemberName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequestMemberName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requestMemberName, other.requestMemberName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetProfileImageObsHash()).compareTo(other.isSetProfileImageObsHash());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProfileImageObsHash()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.profileImageObsHash, other.profileImageObsHash);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareEventNotificationJoinRequest(");
    boolean first = true;

    sb.append("squareMid:");
    if (this.squareMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareName:");
    if (this.squareName == null) {
      sb.append("null");
    } else {
      sb.append(this.squareName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("requestMemberName:");
    if (this.requestMemberName == null) {
      sb.append("null");
    } else {
      sb.append(this.requestMemberName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("profileImageObsHash:");
    if (this.profileImageObsHash == null) {
      sb.append("null");
    } else {
      sb.append(this.profileImageObsHash);
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

  private static class SquareEventNotificationJoinRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotificationJoinRequestStandardScheme getScheme() {
      return new SquareEventNotificationJoinRequestStandardScheme();
    }
  }

  private static class SquareEventNotificationJoinRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareEventNotificationJoinRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotificationJoinRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareMid = iprot.readString();
              struct.setSquareMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SQUARE_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareName = iprot.readString();
              struct.setSquareNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REQUEST_MEMBER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.requestMemberName = iprot.readString();
              struct.setRequestMemberNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PROFILE_IMAGE_OBS_HASH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.profileImageObsHash = iprot.readString();
              struct.setProfileImageObsHashIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotificationJoinRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareMid != null) {
        oprot.writeFieldBegin(SQUARE_MID_FIELD_DESC);
        oprot.writeString(struct.squareMid);
        oprot.writeFieldEnd();
      }
      if (struct.squareName != null) {
        oprot.writeFieldBegin(SQUARE_NAME_FIELD_DESC);
        oprot.writeString(struct.squareName);
        oprot.writeFieldEnd();
      }
      if (struct.requestMemberName != null) {
        oprot.writeFieldBegin(REQUEST_MEMBER_NAME_FIELD_DESC);
        oprot.writeString(struct.requestMemberName);
        oprot.writeFieldEnd();
      }
      if (struct.profileImageObsHash != null) {
        oprot.writeFieldBegin(PROFILE_IMAGE_OBS_HASH_FIELD_DESC);
        oprot.writeString(struct.profileImageObsHash);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotificationJoinRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotificationJoinRequestTupleScheme getScheme() {
      return new SquareEventNotificationJoinRequestTupleScheme();
    }
  }

  private static class SquareEventNotificationJoinRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareEventNotificationJoinRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotificationJoinRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareMid()) {
        optionals.set(0);
      }
      if (struct.isSetSquareName()) {
        optionals.set(1);
      }
      if (struct.isSetRequestMemberName()) {
        optionals.set(2);
      }
      if (struct.isSetProfileImageObsHash()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSquareMid()) {
        oprot.writeString(struct.squareMid);
      }
      if (struct.isSetSquareName()) {
        oprot.writeString(struct.squareName);
      }
      if (struct.isSetRequestMemberName()) {
        oprot.writeString(struct.requestMemberName);
      }
      if (struct.isSetProfileImageObsHash()) {
        oprot.writeString(struct.profileImageObsHash);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotificationJoinRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.squareMid = iprot.readString();
        struct.setSquareMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareName = iprot.readString();
        struct.setSquareNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.requestMemberName = iprot.readString();
        struct.setRequestMemberNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.profileImageObsHash = iprot.readString();
        struct.setProfileImageObsHashIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

