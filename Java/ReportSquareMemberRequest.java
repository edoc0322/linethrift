/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class ReportSquareMemberRequest implements org.apache.thrift.TBase<ReportSquareMemberRequest, ReportSquareMemberRequest._Fields>, java.io.Serializable, Cloneable, Comparable<ReportSquareMemberRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ReportSquareMemberRequest");

  private static final org.apache.thrift.protocol.TField SQUARE_MEMBER_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMemberMid", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField REPORT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("reportType", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField OTHER_REASON_FIELD_DESC = new org.apache.thrift.protocol.TField("otherReason", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ReportSquareMemberRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ReportSquareMemberRequestTupleSchemeFactory();

  public java.lang.String squareMemberMid; // required
  /**
   * 
   * @see ReportType
   */
  public ReportType reportType; // required
  public java.lang.String otherReason; // required
  public java.lang.String squareChatMid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_MEMBER_MID((short)2, "squareMemberMid"),
    /**
     * 
     * @see ReportType
     */
    REPORT_TYPE((short)3, "reportType"),
    OTHER_REASON((short)4, "otherReason"),
    SQUARE_CHAT_MID((short)5, "squareChatMid");

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
        case 2: // SQUARE_MEMBER_MID
          return SQUARE_MEMBER_MID;
        case 3: // REPORT_TYPE
          return REPORT_TYPE;
        case 4: // OTHER_REASON
          return OTHER_REASON;
        case 5: // SQUARE_CHAT_MID
          return SQUARE_CHAT_MID;
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
    tmpMap.put(_Fields.SQUARE_MEMBER_MID, new org.apache.thrift.meta_data.FieldMetaData("squareMemberMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.REPORT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("reportType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ReportType.class)));
    tmpMap.put(_Fields.OTHER_REASON, new org.apache.thrift.meta_data.FieldMetaData("otherReason", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SQUARE_CHAT_MID, new org.apache.thrift.meta_data.FieldMetaData("squareChatMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ReportSquareMemberRequest.class, metaDataMap);
  }

  public ReportSquareMemberRequest() {
  }

  public ReportSquareMemberRequest(
    java.lang.String squareMemberMid,
    ReportType reportType,
    java.lang.String otherReason,
    java.lang.String squareChatMid)
  {
    this();
    this.squareMemberMid = squareMemberMid;
    this.reportType = reportType;
    this.otherReason = otherReason;
    this.squareChatMid = squareChatMid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ReportSquareMemberRequest(ReportSquareMemberRequest other) {
    if (other.isSetSquareMemberMid()) {
      this.squareMemberMid = other.squareMemberMid;
    }
    if (other.isSetReportType()) {
      this.reportType = other.reportType;
    }
    if (other.isSetOtherReason()) {
      this.otherReason = other.otherReason;
    }
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
  }

  public ReportSquareMemberRequest deepCopy() {
    return new ReportSquareMemberRequest(this);
  }

  @Override
  public void clear() {
    this.squareMemberMid = null;
    this.reportType = null;
    this.otherReason = null;
    this.squareChatMid = null;
  }

  public java.lang.String getSquareMemberMid() {
    return this.squareMemberMid;
  }

  public ReportSquareMemberRequest setSquareMemberMid(java.lang.String squareMemberMid) {
    this.squareMemberMid = squareMemberMid;
    return this;
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

  /**
   * 
   * @see ReportType
   */
  public ReportType getReportType() {
    return this.reportType;
  }

  /**
   * 
   * @see ReportType
   */
  public ReportSquareMemberRequest setReportType(ReportType reportType) {
    this.reportType = reportType;
    return this;
  }

  public void unsetReportType() {
    this.reportType = null;
  }

  /** Returns true if field reportType is set (has been assigned a value) and false otherwise */
  public boolean isSetReportType() {
    return this.reportType != null;
  }

  public void setReportTypeIsSet(boolean value) {
    if (!value) {
      this.reportType = null;
    }
  }

  public java.lang.String getOtherReason() {
    return this.otherReason;
  }

  public ReportSquareMemberRequest setOtherReason(java.lang.String otherReason) {
    this.otherReason = otherReason;
    return this;
  }

  public void unsetOtherReason() {
    this.otherReason = null;
  }

  /** Returns true if field otherReason is set (has been assigned a value) and false otherwise */
  public boolean isSetOtherReason() {
    return this.otherReason != null;
  }

  public void setOtherReasonIsSet(boolean value) {
    if (!value) {
      this.otherReason = null;
    }
  }

  public java.lang.String getSquareChatMid() {
    return this.squareChatMid;
  }

  public ReportSquareMemberRequest setSquareChatMid(java.lang.String squareChatMid) {
    this.squareChatMid = squareChatMid;
    return this;
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

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SQUARE_MEMBER_MID:
      if (value == null) {
        unsetSquareMemberMid();
      } else {
        setSquareMemberMid((java.lang.String)value);
      }
      break;

    case REPORT_TYPE:
      if (value == null) {
        unsetReportType();
      } else {
        setReportType((ReportType)value);
      }
      break;

    case OTHER_REASON:
      if (value == null) {
        unsetOtherReason();
      } else {
        setOtherReason((java.lang.String)value);
      }
      break;

    case SQUARE_CHAT_MID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        setSquareChatMid((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_MEMBER_MID:
      return getSquareMemberMid();

    case REPORT_TYPE:
      return getReportType();

    case OTHER_REASON:
      return getOtherReason();

    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_MEMBER_MID:
      return isSetSquareMemberMid();
    case REPORT_TYPE:
      return isSetReportType();
    case OTHER_REASON:
      return isSetOtherReason();
    case SQUARE_CHAT_MID:
      return isSetSquareChatMid();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ReportSquareMemberRequest)
      return this.equals((ReportSquareMemberRequest)that);
    return false;
  }

  public boolean equals(ReportSquareMemberRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareMemberMid = true && this.isSetSquareMemberMid();
    boolean that_present_squareMemberMid = true && that.isSetSquareMemberMid();
    if (this_present_squareMemberMid || that_present_squareMemberMid) {
      if (!(this_present_squareMemberMid && that_present_squareMemberMid))
        return false;
      if (!this.squareMemberMid.equals(that.squareMemberMid))
        return false;
    }

    boolean this_present_reportType = true && this.isSetReportType();
    boolean that_present_reportType = true && that.isSetReportType();
    if (this_present_reportType || that_present_reportType) {
      if (!(this_present_reportType && that_present_reportType))
        return false;
      if (!this.reportType.equals(that.reportType))
        return false;
    }

    boolean this_present_otherReason = true && this.isSetOtherReason();
    boolean that_present_otherReason = true && that.isSetOtherReason();
    if (this_present_otherReason || that_present_otherReason) {
      if (!(this_present_otherReason && that_present_otherReason))
        return false;
      if (!this.otherReason.equals(that.otherReason))
        return false;
    }

    boolean this_present_squareChatMid = true && this.isSetSquareChatMid();
    boolean that_present_squareChatMid = true && that.isSetSquareChatMid();
    if (this_present_squareChatMid || that_present_squareChatMid) {
      if (!(this_present_squareChatMid && that_present_squareChatMid))
        return false;
      if (!this.squareChatMid.equals(that.squareChatMid))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSquareMemberMid()) ? 131071 : 524287);
    if (isSetSquareMemberMid())
      hashCode = hashCode * 8191 + squareMemberMid.hashCode();

    hashCode = hashCode * 8191 + ((isSetReportType()) ? 131071 : 524287);
    if (isSetReportType())
      hashCode = hashCode * 8191 + reportType.getValue();

    hashCode = hashCode * 8191 + ((isSetOtherReason()) ? 131071 : 524287);
    if (isSetOtherReason())
      hashCode = hashCode * 8191 + otherReason.hashCode();

    hashCode = hashCode * 8191 + ((isSetSquareChatMid()) ? 131071 : 524287);
    if (isSetSquareChatMid())
      hashCode = hashCode * 8191 + squareChatMid.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ReportSquareMemberRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSquareMemberMid()).compareTo(other.isSetSquareMemberMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMemberMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareMemberMid, other.squareMemberMid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReportType()).compareTo(other.isSetReportType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReportType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reportType, other.reportType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOtherReason()).compareTo(other.isSetOtherReason());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOtherReason()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.otherReason, other.otherReason);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSquareChatMid()).compareTo(other.isSetSquareChatMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatMid, other.squareChatMid);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ReportSquareMemberRequest(");
    boolean first = true;

    sb.append("squareMemberMid:");
    if (this.squareMemberMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMemberMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("reportType:");
    if (this.reportType == null) {
      sb.append("null");
    } else {
      sb.append(this.reportType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("otherReason:");
    if (this.otherReason == null) {
      sb.append("null");
    } else {
      sb.append(this.otherReason);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
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

  private static class ReportSquareMemberRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReportSquareMemberRequestStandardScheme getScheme() {
      return new ReportSquareMemberRequestStandardScheme();
    }
  }

  private static class ReportSquareMemberRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<ReportSquareMemberRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ReportSquareMemberRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // SQUARE_MEMBER_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareMemberMid = iprot.readString();
              struct.setSquareMemberMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // REPORT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.reportType = ReportType.findByValue(iprot.readI32());
              struct.setReportTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OTHER_REASON
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.otherReason = iprot.readString();
              struct.setOtherReasonIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SQUARE_CHAT_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareChatMid = iprot.readString();
              struct.setSquareChatMidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ReportSquareMemberRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareMemberMid != null) {
        oprot.writeFieldBegin(SQUARE_MEMBER_MID_FIELD_DESC);
        oprot.writeString(struct.squareMemberMid);
        oprot.writeFieldEnd();
      }
      if (struct.reportType != null) {
        oprot.writeFieldBegin(REPORT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.reportType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.otherReason != null) {
        oprot.writeFieldBegin(OTHER_REASON_FIELD_DESC);
        oprot.writeString(struct.otherReason);
        oprot.writeFieldEnd();
      }
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ReportSquareMemberRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ReportSquareMemberRequestTupleScheme getScheme() {
      return new ReportSquareMemberRequestTupleScheme();
    }
  }

  private static class ReportSquareMemberRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<ReportSquareMemberRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ReportSquareMemberRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareMemberMid()) {
        optionals.set(0);
      }
      if (struct.isSetReportType()) {
        optionals.set(1);
      }
      if (struct.isSetOtherReason()) {
        optionals.set(2);
      }
      if (struct.isSetSquareChatMid()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSquareMemberMid()) {
        oprot.writeString(struct.squareMemberMid);
      }
      if (struct.isSetReportType()) {
        oprot.writeI32(struct.reportType.getValue());
      }
      if (struct.isSetOtherReason()) {
        oprot.writeString(struct.otherReason);
      }
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ReportSquareMemberRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.squareMemberMid = iprot.readString();
        struct.setSquareMemberMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reportType = ReportType.findByValue(iprot.readI32());
        struct.setReportTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.otherReason = iprot.readString();
        struct.setOtherReasonIsSet(true);
      }
      if (incoming.get(3)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

