/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class PaidCallRedeemResult implements org.apache.thrift.TBase<PaidCallRedeemResult, PaidCallRedeemResult._Fields>, java.io.Serializable, Cloneable, Comparable<PaidCallRedeemResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PaidCallRedeemResult");

  private static final org.apache.thrift.protocol.TField EVENT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("eventName", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField EVENT_AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("eventAmount", org.apache.thrift.protocol.TType.I32, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PaidCallRedeemResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PaidCallRedeemResultTupleSchemeFactory();

  public java.lang.String eventName; // required
  public int eventAmount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EVENT_NAME((short)1, "eventName"),
    EVENT_AMOUNT((short)2, "eventAmount");

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
        case 1: // EVENT_NAME
          return EVENT_NAME;
        case 2: // EVENT_AMOUNT
          return EVENT_AMOUNT;
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
  private static final int __EVENTAMOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EVENT_NAME, new org.apache.thrift.meta_data.FieldMetaData("eventName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EVENT_AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("eventAmount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PaidCallRedeemResult.class, metaDataMap);
  }

  public PaidCallRedeemResult() {
  }

  public PaidCallRedeemResult(
    java.lang.String eventName,
    int eventAmount)
  {
    this();
    this.eventName = eventName;
    this.eventAmount = eventAmount;
    setEventAmountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaidCallRedeemResult(PaidCallRedeemResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetEventName()) {
      this.eventName = other.eventName;
    }
    this.eventAmount = other.eventAmount;
  }

  public PaidCallRedeemResult deepCopy() {
    return new PaidCallRedeemResult(this);
  }

  @Override
  public void clear() {
    this.eventName = null;
    setEventAmountIsSet(false);
    this.eventAmount = 0;
  }

  public java.lang.String getEventName() {
    return this.eventName;
  }

  public PaidCallRedeemResult setEventName(java.lang.String eventName) {
    this.eventName = eventName;
    return this;
  }

  public void unsetEventName() {
    this.eventName = null;
  }

  /** Returns true if field eventName is set (has been assigned a value) and false otherwise */
  public boolean isSetEventName() {
    return this.eventName != null;
  }

  public void setEventNameIsSet(boolean value) {
    if (!value) {
      this.eventName = null;
    }
  }

  public int getEventAmount() {
    return this.eventAmount;
  }

  public PaidCallRedeemResult setEventAmount(int eventAmount) {
    this.eventAmount = eventAmount;
    setEventAmountIsSet(true);
    return this;
  }

  public void unsetEventAmount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __EVENTAMOUNT_ISSET_ID);
  }

  /** Returns true if field eventAmount is set (has been assigned a value) and false otherwise */
  public boolean isSetEventAmount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __EVENTAMOUNT_ISSET_ID);
  }

  public void setEventAmountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __EVENTAMOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case EVENT_NAME:
      if (value == null) {
        unsetEventName();
      } else {
        setEventName((java.lang.String)value);
      }
      break;

    case EVENT_AMOUNT:
      if (value == null) {
        unsetEventAmount();
      } else {
        setEventAmount((java.lang.Integer)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EVENT_NAME:
      return getEventName();

    case EVENT_AMOUNT:
      return getEventAmount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EVENT_NAME:
      return isSetEventName();
    case EVENT_AMOUNT:
      return isSetEventAmount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PaidCallRedeemResult)
      return this.equals((PaidCallRedeemResult)that);
    return false;
  }

  public boolean equals(PaidCallRedeemResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_eventName = true && this.isSetEventName();
    boolean that_present_eventName = true && that.isSetEventName();
    if (this_present_eventName || that_present_eventName) {
      if (!(this_present_eventName && that_present_eventName))
        return false;
      if (!this.eventName.equals(that.eventName))
        return false;
    }

    boolean this_present_eventAmount = true;
    boolean that_present_eventAmount = true;
    if (this_present_eventAmount || that_present_eventAmount) {
      if (!(this_present_eventAmount && that_present_eventAmount))
        return false;
      if (this.eventAmount != that.eventAmount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetEventName()) ? 131071 : 524287);
    if (isSetEventName())
      hashCode = hashCode * 8191 + eventName.hashCode();

    hashCode = hashCode * 8191 + eventAmount;

    return hashCode;
  }

  @Override
  public int compareTo(PaidCallRedeemResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetEventName()).compareTo(other.isSetEventName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventName, other.eventName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEventAmount()).compareTo(other.isSetEventAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventAmount, other.eventAmount);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PaidCallRedeemResult(");
    boolean first = true;

    sb.append("eventName:");
    if (this.eventName == null) {
      sb.append("null");
    } else {
      sb.append(this.eventName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("eventAmount:");
    sb.append(this.eventAmount);
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

  private static class PaidCallRedeemResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PaidCallRedeemResultStandardScheme getScheme() {
      return new PaidCallRedeemResultStandardScheme();
    }
  }

  private static class PaidCallRedeemResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<PaidCallRedeemResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PaidCallRedeemResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EVENT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.eventName = iprot.readString();
              struct.setEventNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EVENT_AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.eventAmount = iprot.readI32();
              struct.setEventAmountIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PaidCallRedeemResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.eventName != null) {
        oprot.writeFieldBegin(EVENT_NAME_FIELD_DESC);
        oprot.writeString(struct.eventName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(EVENT_AMOUNT_FIELD_DESC);
      oprot.writeI32(struct.eventAmount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PaidCallRedeemResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PaidCallRedeemResultTupleScheme getScheme() {
      return new PaidCallRedeemResultTupleScheme();
    }
  }

  private static class PaidCallRedeemResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<PaidCallRedeemResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PaidCallRedeemResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetEventName()) {
        optionals.set(0);
      }
      if (struct.isSetEventAmount()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetEventName()) {
        oprot.writeString(struct.eventName);
      }
      if (struct.isSetEventAmount()) {
        oprot.writeI32(struct.eventAmount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PaidCallRedeemResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.eventName = iprot.readString();
        struct.setEventNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.eventAmount = iprot.readI32();
        struct.setEventAmountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

