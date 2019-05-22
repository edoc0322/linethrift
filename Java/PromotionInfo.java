/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class PromotionInfo implements org.apache.thrift.TBase<PromotionInfo, PromotionInfo._Fields>, java.io.Serializable, Cloneable, Comparable<PromotionInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PromotionInfo");

  private static final org.apache.thrift.protocol.TField PROMOTION_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("promotionType", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField BUDDY_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("buddyInfo", org.apache.thrift.protocol.TType.STRUCT, (short)51);
  private static final org.apache.thrift.protocol.TField PROMOTION_DETAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("promotionDetail", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PromotionInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PromotionInfoTupleSchemeFactory();

  /**
   * 
   * @see PromotionType
   */
  public PromotionType promotionType; // required
  public PromotionBuddyInfo buddyInfo; // required
  public PromotionDetail promotionDetail; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see PromotionType
     */
    PROMOTION_TYPE((short)1, "promotionType"),
    BUDDY_INFO((short)51, "buddyInfo"),
    PROMOTION_DETAIL((short)2, "promotionDetail");

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
        case 1: // PROMOTION_TYPE
          return PROMOTION_TYPE;
        case 51: // BUDDY_INFO
          return BUDDY_INFO;
        case 2: // PROMOTION_DETAIL
          return PROMOTION_DETAIL;
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
    tmpMap.put(_Fields.PROMOTION_TYPE, new org.apache.thrift.meta_data.FieldMetaData("promotionType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, PromotionType.class)));
    tmpMap.put(_Fields.BUDDY_INFO, new org.apache.thrift.meta_data.FieldMetaData("buddyInfo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PromotionBuddyInfo.class)));
    tmpMap.put(_Fields.PROMOTION_DETAIL, new org.apache.thrift.meta_data.FieldMetaData("promotionDetail", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PromotionDetail.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PromotionInfo.class, metaDataMap);
  }

  public PromotionInfo() {
  }

  public PromotionInfo(
    PromotionType promotionType,
    PromotionBuddyInfo buddyInfo,
    PromotionDetail promotionDetail)
  {
    this();
    this.promotionType = promotionType;
    this.buddyInfo = buddyInfo;
    this.promotionDetail = promotionDetail;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PromotionInfo(PromotionInfo other) {
    if (other.isSetPromotionType()) {
      this.promotionType = other.promotionType;
    }
    if (other.isSetBuddyInfo()) {
      this.buddyInfo = new PromotionBuddyInfo(other.buddyInfo);
    }
    if (other.isSetPromotionDetail()) {
      this.promotionDetail = new PromotionDetail(other.promotionDetail);
    }
  }

  public PromotionInfo deepCopy() {
    return new PromotionInfo(this);
  }

  @Override
  public void clear() {
    this.promotionType = null;
    this.buddyInfo = null;
    this.promotionDetail = null;
  }

  /**
   * 
   * @see PromotionType
   */
  public PromotionType getPromotionType() {
    return this.promotionType;
  }

  /**
   * 
   * @see PromotionType
   */
  public PromotionInfo setPromotionType(PromotionType promotionType) {
    this.promotionType = promotionType;
    return this;
  }

  public void unsetPromotionType() {
    this.promotionType = null;
  }

  /** Returns true if field promotionType is set (has been assigned a value) and false otherwise */
  public boolean isSetPromotionType() {
    return this.promotionType != null;
  }

  public void setPromotionTypeIsSet(boolean value) {
    if (!value) {
      this.promotionType = null;
    }
  }

  public PromotionBuddyInfo getBuddyInfo() {
    return this.buddyInfo;
  }

  public PromotionInfo setBuddyInfo(PromotionBuddyInfo buddyInfo) {
    this.buddyInfo = buddyInfo;
    return this;
  }

  public void unsetBuddyInfo() {
    this.buddyInfo = null;
  }

  /** Returns true if field buddyInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetBuddyInfo() {
    return this.buddyInfo != null;
  }

  public void setBuddyInfoIsSet(boolean value) {
    if (!value) {
      this.buddyInfo = null;
    }
  }

  public PromotionDetail getPromotionDetail() {
    return this.promotionDetail;
  }

  public PromotionInfo setPromotionDetail(PromotionDetail promotionDetail) {
    this.promotionDetail = promotionDetail;
    return this;
  }

  public void unsetPromotionDetail() {
    this.promotionDetail = null;
  }

  /** Returns true if field promotionDetail is set (has been assigned a value) and false otherwise */
  public boolean isSetPromotionDetail() {
    return this.promotionDetail != null;
  }

  public void setPromotionDetailIsSet(boolean value) {
    if (!value) {
      this.promotionDetail = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case PROMOTION_TYPE:
      if (value == null) {
        unsetPromotionType();
      } else {
        setPromotionType((PromotionType)value);
      }
      break;

    case BUDDY_INFO:
      if (value == null) {
        unsetBuddyInfo();
      } else {
        setBuddyInfo((PromotionBuddyInfo)value);
      }
      break;

    case PROMOTION_DETAIL:
      if (value == null) {
        unsetPromotionDetail();
      } else {
        setPromotionDetail((PromotionDetail)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case PROMOTION_TYPE:
      return getPromotionType();

    case BUDDY_INFO:
      return getBuddyInfo();

    case PROMOTION_DETAIL:
      return getPromotionDetail();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case PROMOTION_TYPE:
      return isSetPromotionType();
    case BUDDY_INFO:
      return isSetBuddyInfo();
    case PROMOTION_DETAIL:
      return isSetPromotionDetail();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PromotionInfo)
      return this.equals((PromotionInfo)that);
    return false;
  }

  public boolean equals(PromotionInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_promotionType = true && this.isSetPromotionType();
    boolean that_present_promotionType = true && that.isSetPromotionType();
    if (this_present_promotionType || that_present_promotionType) {
      if (!(this_present_promotionType && that_present_promotionType))
        return false;
      if (!this.promotionType.equals(that.promotionType))
        return false;
    }

    boolean this_present_buddyInfo = true && this.isSetBuddyInfo();
    boolean that_present_buddyInfo = true && that.isSetBuddyInfo();
    if (this_present_buddyInfo || that_present_buddyInfo) {
      if (!(this_present_buddyInfo && that_present_buddyInfo))
        return false;
      if (!this.buddyInfo.equals(that.buddyInfo))
        return false;
    }

    boolean this_present_promotionDetail = true && this.isSetPromotionDetail();
    boolean that_present_promotionDetail = true && that.isSetPromotionDetail();
    if (this_present_promotionDetail || that_present_promotionDetail) {
      if (!(this_present_promotionDetail && that_present_promotionDetail))
        return false;
      if (!this.promotionDetail.equals(that.promotionDetail))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetPromotionType()) ? 131071 : 524287);
    if (isSetPromotionType())
      hashCode = hashCode * 8191 + promotionType.getValue();

    hashCode = hashCode * 8191 + ((isSetBuddyInfo()) ? 131071 : 524287);
    if (isSetBuddyInfo())
      hashCode = hashCode * 8191 + buddyInfo.hashCode();

    hashCode = hashCode * 8191 + ((isSetPromotionDetail()) ? 131071 : 524287);
    if (isSetPromotionDetail())
      hashCode = hashCode * 8191 + promotionDetail.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PromotionInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetPromotionType()).compareTo(other.isSetPromotionType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPromotionType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.promotionType, other.promotionType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetBuddyInfo()).compareTo(other.isSetBuddyInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuddyInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buddyInfo, other.buddyInfo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPromotionDetail()).compareTo(other.isSetPromotionDetail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPromotionDetail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.promotionDetail, other.promotionDetail);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PromotionInfo(");
    boolean first = true;

    sb.append("promotionType:");
    if (this.promotionType == null) {
      sb.append("null");
    } else {
      sb.append(this.promotionType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("buddyInfo:");
    if (this.buddyInfo == null) {
      sb.append("null");
    } else {
      sb.append(this.buddyInfo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("promotionDetail:");
    if (this.promotionDetail == null) {
      sb.append("null");
    } else {
      sb.append(this.promotionDetail);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (buddyInfo != null) {
      buddyInfo.validate();
    }
    if (promotionDetail != null) {
      promotionDetail.validate();
    }
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

  private static class PromotionInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PromotionInfoStandardScheme getScheme() {
      return new PromotionInfoStandardScheme();
    }
  }

  private static class PromotionInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<PromotionInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PromotionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROMOTION_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.promotionType = PromotionType.findByValue(iprot.readI32());
              struct.setPromotionTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 51: // BUDDY_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buddyInfo = new PromotionBuddyInfo();
              struct.buddyInfo.read(iprot);
              struct.setBuddyInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROMOTION_DETAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.promotionDetail = new PromotionDetail();
              struct.promotionDetail.read(iprot);
              struct.setPromotionDetailIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PromotionInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.promotionType != null) {
        oprot.writeFieldBegin(PROMOTION_TYPE_FIELD_DESC);
        oprot.writeI32(struct.promotionType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.promotionDetail != null) {
        oprot.writeFieldBegin(PROMOTION_DETAIL_FIELD_DESC);
        struct.promotionDetail.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.buddyInfo != null) {
        oprot.writeFieldBegin(BUDDY_INFO_FIELD_DESC);
        struct.buddyInfo.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PromotionInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PromotionInfoTupleScheme getScheme() {
      return new PromotionInfoTupleScheme();
    }
  }

  private static class PromotionInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<PromotionInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PromotionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetPromotionType()) {
        optionals.set(0);
      }
      if (struct.isSetBuddyInfo()) {
        optionals.set(1);
      }
      if (struct.isSetPromotionDetail()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPromotionType()) {
        oprot.writeI32(struct.promotionType.getValue());
      }
      if (struct.isSetBuddyInfo()) {
        struct.buddyInfo.write(oprot);
      }
      if (struct.isSetPromotionDetail()) {
        struct.promotionDetail.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PromotionInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.promotionType = PromotionType.findByValue(iprot.readI32());
        struct.setPromotionTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.buddyInfo = new PromotionBuddyInfo();
        struct.buddyInfo.read(iprot);
        struct.setBuddyInfoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.promotionDetail = new PromotionDetail();
        struct.promotionDetail.read(iprot);
        struct.setPromotionDetailIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

