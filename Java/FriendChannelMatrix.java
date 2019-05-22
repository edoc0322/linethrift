/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class FriendChannelMatrix implements org.apache.thrift.TBase<FriendChannelMatrix, FriendChannelMatrix._Fields>, java.io.Serializable, Cloneable, Comparable<FriendChannelMatrix> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FriendChannelMatrix");

  private static final org.apache.thrift.protocol.TField CHANNEL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("channelId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField REPRESENT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("representMid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("count", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField POINT_FIELD_DESC = new org.apache.thrift.protocol.TField("point", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FriendChannelMatrixStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FriendChannelMatrixTupleSchemeFactory();

  public java.lang.String channelId; // required
  public java.lang.String representMid; // required
  public int count; // required
  public int point; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CHANNEL_ID((short)1, "channelId"),
    REPRESENT_MID((short)2, "representMid"),
    COUNT((short)3, "count"),
    POINT((short)4, "point");

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
        case 1: // CHANNEL_ID
          return CHANNEL_ID;
        case 2: // REPRESENT_MID
          return REPRESENT_MID;
        case 3: // COUNT
          return COUNT;
        case 4: // POINT
          return POINT;
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
  private static final int __COUNT_ISSET_ID = 0;
  private static final int __POINT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHANNEL_ID, new org.apache.thrift.meta_data.FieldMetaData("channelId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REPRESENT_MID, new org.apache.thrift.meta_data.FieldMetaData("representMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COUNT, new org.apache.thrift.meta_data.FieldMetaData("count", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.POINT, new org.apache.thrift.meta_data.FieldMetaData("point", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FriendChannelMatrix.class, metaDataMap);
  }

  public FriendChannelMatrix() {
  }

  public FriendChannelMatrix(
    java.lang.String channelId,
    java.lang.String representMid,
    int count,
    int point)
  {
    this();
    this.channelId = channelId;
    this.representMid = representMid;
    this.count = count;
    setCountIsSet(true);
    this.point = point;
    setPointIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FriendChannelMatrix(FriendChannelMatrix other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetChannelId()) {
      this.channelId = other.channelId;
    }
    if (other.isSetRepresentMid()) {
      this.representMid = other.representMid;
    }
    this.count = other.count;
    this.point = other.point;
  }

  public FriendChannelMatrix deepCopy() {
    return new FriendChannelMatrix(this);
  }

  @Override
  public void clear() {
    this.channelId = null;
    this.representMid = null;
    setCountIsSet(false);
    this.count = 0;
    setPointIsSet(false);
    this.point = 0;
  }

  public java.lang.String getChannelId() {
    return this.channelId;
  }

  public FriendChannelMatrix setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  public void unsetChannelId() {
    this.channelId = null;
  }

  /** Returns true if field channelId is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelId() {
    return this.channelId != null;
  }

  public void setChannelIdIsSet(boolean value) {
    if (!value) {
      this.channelId = null;
    }
  }

  public java.lang.String getRepresentMid() {
    return this.representMid;
  }

  public FriendChannelMatrix setRepresentMid(java.lang.String representMid) {
    this.representMid = representMid;
    return this;
  }

  public void unsetRepresentMid() {
    this.representMid = null;
  }

  /** Returns true if field representMid is set (has been assigned a value) and false otherwise */
  public boolean isSetRepresentMid() {
    return this.representMid != null;
  }

  public void setRepresentMidIsSet(boolean value) {
    if (!value) {
      this.representMid = null;
    }
  }

  public int getCount() {
    return this.count;
  }

  public FriendChannelMatrix setCount(int count) {
    this.count = count;
    setCountIsSet(true);
    return this;
  }

  public void unsetCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  /** Returns true if field count is set (has been assigned a value) and false otherwise */
  public boolean isSetCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __COUNT_ISSET_ID);
  }

  public void setCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __COUNT_ISSET_ID, value);
  }

  public int getPoint() {
    return this.point;
  }

  public FriendChannelMatrix setPoint(int point) {
    this.point = point;
    setPointIsSet(true);
    return this;
  }

  public void unsetPoint() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __POINT_ISSET_ID);
  }

  /** Returns true if field point is set (has been assigned a value) and false otherwise */
  public boolean isSetPoint() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __POINT_ISSET_ID);
  }

  public void setPointIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __POINT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CHANNEL_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        setChannelId((java.lang.String)value);
      }
      break;

    case REPRESENT_MID:
      if (value == null) {
        unsetRepresentMid();
      } else {
        setRepresentMid((java.lang.String)value);
      }
      break;

    case COUNT:
      if (value == null) {
        unsetCount();
      } else {
        setCount((java.lang.Integer)value);
      }
      break;

    case POINT:
      if (value == null) {
        unsetPoint();
      } else {
        setPoint((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CHANNEL_ID:
      return getChannelId();

    case REPRESENT_MID:
      return getRepresentMid();

    case COUNT:
      return getCount();

    case POINT:
      return getPoint();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CHANNEL_ID:
      return isSetChannelId();
    case REPRESENT_MID:
      return isSetRepresentMid();
    case COUNT:
      return isSetCount();
    case POINT:
      return isSetPoint();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof FriendChannelMatrix)
      return this.equals((FriendChannelMatrix)that);
    return false;
  }

  public boolean equals(FriendChannelMatrix that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_channelId = true && this.isSetChannelId();
    boolean that_present_channelId = true && that.isSetChannelId();
    if (this_present_channelId || that_present_channelId) {
      if (!(this_present_channelId && that_present_channelId))
        return false;
      if (!this.channelId.equals(that.channelId))
        return false;
    }

    boolean this_present_representMid = true && this.isSetRepresentMid();
    boolean that_present_representMid = true && that.isSetRepresentMid();
    if (this_present_representMid || that_present_representMid) {
      if (!(this_present_representMid && that_present_representMid))
        return false;
      if (!this.representMid.equals(that.representMid))
        return false;
    }

    boolean this_present_count = true;
    boolean that_present_count = true;
    if (this_present_count || that_present_count) {
      if (!(this_present_count && that_present_count))
        return false;
      if (this.count != that.count)
        return false;
    }

    boolean this_present_point = true;
    boolean that_present_point = true;
    if (this_present_point || that_present_point) {
      if (!(this_present_point && that_present_point))
        return false;
      if (this.point != that.point)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetChannelId()) ? 131071 : 524287);
    if (isSetChannelId())
      hashCode = hashCode * 8191 + channelId.hashCode();

    hashCode = hashCode * 8191 + ((isSetRepresentMid()) ? 131071 : 524287);
    if (isSetRepresentMid())
      hashCode = hashCode * 8191 + representMid.hashCode();

    hashCode = hashCode * 8191 + count;

    hashCode = hashCode * 8191 + point;

    return hashCode;
  }

  @Override
  public int compareTo(FriendChannelMatrix other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetChannelId()).compareTo(other.isSetChannelId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channelId, other.channelId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRepresentMid()).compareTo(other.isSetRepresentMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRepresentMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.representMid, other.representMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCount()).compareTo(other.isSetCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.count, other.count);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPoint()).compareTo(other.isSetPoint());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPoint()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.point, other.point);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("FriendChannelMatrix(");
    boolean first = true;

    sb.append("channelId:");
    if (this.channelId == null) {
      sb.append("null");
    } else {
      sb.append(this.channelId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("representMid:");
    if (this.representMid == null) {
      sb.append("null");
    } else {
      sb.append(this.representMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("count:");
    sb.append(this.count);
    first = false;
    if (!first) sb.append(", ");
    sb.append("point:");
    sb.append(this.point);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FriendChannelMatrixStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FriendChannelMatrixStandardScheme getScheme() {
      return new FriendChannelMatrixStandardScheme();
    }
  }

  private static class FriendChannelMatrixStandardScheme extends org.apache.thrift.scheme.StandardScheme<FriendChannelMatrix> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FriendChannelMatrix struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHANNEL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.channelId = iprot.readString();
              struct.setChannelIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REPRESENT_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.representMid = iprot.readString();
              struct.setRepresentMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.count = iprot.readI32();
              struct.setCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // POINT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.point = iprot.readI32();
              struct.setPointIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FriendChannelMatrix struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.channelId != null) {
        oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
        oprot.writeString(struct.channelId);
        oprot.writeFieldEnd();
      }
      if (struct.representMid != null) {
        oprot.writeFieldBegin(REPRESENT_MID_FIELD_DESC);
        oprot.writeString(struct.representMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(COUNT_FIELD_DESC);
      oprot.writeI32(struct.count);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(POINT_FIELD_DESC);
      oprot.writeI32(struct.point);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FriendChannelMatrixTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FriendChannelMatrixTupleScheme getScheme() {
      return new FriendChannelMatrixTupleScheme();
    }
  }

  private static class FriendChannelMatrixTupleScheme extends org.apache.thrift.scheme.TupleScheme<FriendChannelMatrix> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FriendChannelMatrix struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetChannelId()) {
        optionals.set(0);
      }
      if (struct.isSetRepresentMid()) {
        optionals.set(1);
      }
      if (struct.isSetCount()) {
        optionals.set(2);
      }
      if (struct.isSetPoint()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetChannelId()) {
        oprot.writeString(struct.channelId);
      }
      if (struct.isSetRepresentMid()) {
        oprot.writeString(struct.representMid);
      }
      if (struct.isSetCount()) {
        oprot.writeI32(struct.count);
      }
      if (struct.isSetPoint()) {
        oprot.writeI32(struct.point);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FriendChannelMatrix struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.channelId = iprot.readString();
        struct.setChannelIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.representMid = iprot.readString();
        struct.setRepresentMidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.count = iprot.readI32();
        struct.setCountIsSet(true);
      }
      if (incoming.get(3)) {
        struct.point = iprot.readI32();
        struct.setPointIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

