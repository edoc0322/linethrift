/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class SquareEvent implements org.apache.thrift.TBase<SquareEvent, SquareEvent._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEvent> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEvent");

  private static final org.apache.thrift.protocol.TField CREATED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("createdTime", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PAYLOAD_FIELD_DESC = new org.apache.thrift.protocol.TField("payload", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField SYNC_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("syncToken", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField EVENT_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("eventStatus", org.apache.thrift.protocol.TType.I32, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareEventStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareEventTupleSchemeFactory();

  public long createdTime; // required
  /**
   * 
   * @see SquareEventType
   */
  public SquareEventType type; // required
  public SquareEventPayload payload; // required
  public java.lang.String syncToken; // required
  /**
   * 
   * @see SquareEventStatus
   */
  public SquareEventStatus eventStatus; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CREATED_TIME((short)2, "createdTime"),
    /**
     * 
     * @see SquareEventType
     */
    TYPE((short)3, "type"),
    PAYLOAD((short)4, "payload"),
    SYNC_TOKEN((short)5, "syncToken"),
    /**
     * 
     * @see SquareEventStatus
     */
    EVENT_STATUS((short)6, "eventStatus");

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
        case 2: // CREATED_TIME
          return CREATED_TIME;
        case 3: // TYPE
          return TYPE;
        case 4: // PAYLOAD
          return PAYLOAD;
        case 5: // SYNC_TOKEN
          return SYNC_TOKEN;
        case 6: // EVENT_STATUS
          return EVENT_STATUS;
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
  private static final int __CREATEDTIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CREATED_TIME, new org.apache.thrift.meta_data.FieldMetaData("createdTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquareEventType.class)));
    tmpMap.put(_Fields.PAYLOAD, new org.apache.thrift.meta_data.FieldMetaData("payload", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareEventPayload.class)));
    tmpMap.put(_Fields.SYNC_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("syncToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EVENT_STATUS, new org.apache.thrift.meta_data.FieldMetaData("eventStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquareEventStatus.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEvent.class, metaDataMap);
  }

  public SquareEvent() {
  }

  public SquareEvent(
    long createdTime,
    SquareEventType type,
    SquareEventPayload payload,
    java.lang.String syncToken,
    SquareEventStatus eventStatus)
  {
    this();
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    this.type = type;
    this.payload = payload;
    this.syncToken = syncToken;
    this.eventStatus = eventStatus;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEvent(SquareEvent other) {
    __isset_bitfield = other.__isset_bitfield;
    this.createdTime = other.createdTime;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetPayload()) {
      this.payload = new SquareEventPayload(other.payload);
    }
    if (other.isSetSyncToken()) {
      this.syncToken = other.syncToken;
    }
    if (other.isSetEventStatus()) {
      this.eventStatus = other.eventStatus;
    }
  }

  public SquareEvent deepCopy() {
    return new SquareEvent(this);
  }

  @Override
  public void clear() {
    setCreatedTimeIsSet(false);
    this.createdTime = 0;
    this.type = null;
    this.payload = null;
    this.syncToken = null;
    this.eventStatus = null;
  }

  public long getCreatedTime() {
    return this.createdTime;
  }

  public SquareEvent setCreatedTime(long createdTime) {
    this.createdTime = createdTime;
    setCreatedTimeIsSet(true);
    return this;
  }

  public void unsetCreatedTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  /** Returns true if field createdTime is set (has been assigned a value) and false otherwise */
  public boolean isSetCreatedTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __CREATEDTIME_ISSET_ID);
  }

  public void setCreatedTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __CREATEDTIME_ISSET_ID, value);
  }

  /**
   * 
   * @see SquareEventType
   */
  public SquareEventType getType() {
    return this.type;
  }

  /**
   * 
   * @see SquareEventType
   */
  public SquareEvent setType(SquareEventType type) {
    this.type = type;
    return this;
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

  public SquareEventPayload getPayload() {
    return this.payload;
  }

  public SquareEvent setPayload(SquareEventPayload payload) {
    this.payload = payload;
    return this;
  }

  public void unsetPayload() {
    this.payload = null;
  }

  /** Returns true if field payload is set (has been assigned a value) and false otherwise */
  public boolean isSetPayload() {
    return this.payload != null;
  }

  public void setPayloadIsSet(boolean value) {
    if (!value) {
      this.payload = null;
    }
  }

  public java.lang.String getSyncToken() {
    return this.syncToken;
  }

  public SquareEvent setSyncToken(java.lang.String syncToken) {
    this.syncToken = syncToken;
    return this;
  }

  public void unsetSyncToken() {
    this.syncToken = null;
  }

  /** Returns true if field syncToken is set (has been assigned a value) and false otherwise */
  public boolean isSetSyncToken() {
    return this.syncToken != null;
  }

  public void setSyncTokenIsSet(boolean value) {
    if (!value) {
      this.syncToken = null;
    }
  }

  /**
   * 
   * @see SquareEventStatus
   */
  public SquareEventStatus getEventStatus() {
    return this.eventStatus;
  }

  /**
   * 
   * @see SquareEventStatus
   */
  public SquareEvent setEventStatus(SquareEventStatus eventStatus) {
    this.eventStatus = eventStatus;
    return this;
  }

  public void unsetEventStatus() {
    this.eventStatus = null;
  }

  /** Returns true if field eventStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetEventStatus() {
    return this.eventStatus != null;
  }

  public void setEventStatusIsSet(boolean value) {
    if (!value) {
      this.eventStatus = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CREATED_TIME:
      if (value == null) {
        unsetCreatedTime();
      } else {
        setCreatedTime((java.lang.Long)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((SquareEventType)value);
      }
      break;

    case PAYLOAD:
      if (value == null) {
        unsetPayload();
      } else {
        setPayload((SquareEventPayload)value);
      }
      break;

    case SYNC_TOKEN:
      if (value == null) {
        unsetSyncToken();
      } else {
        setSyncToken((java.lang.String)value);
      }
      break;

    case EVENT_STATUS:
      if (value == null) {
        unsetEventStatus();
      } else {
        setEventStatus((SquareEventStatus)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CREATED_TIME:
      return getCreatedTime();

    case TYPE:
      return getType();

    case PAYLOAD:
      return getPayload();

    case SYNC_TOKEN:
      return getSyncToken();

    case EVENT_STATUS:
      return getEventStatus();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CREATED_TIME:
      return isSetCreatedTime();
    case TYPE:
      return isSetType();
    case PAYLOAD:
      return isSetPayload();
    case SYNC_TOKEN:
      return isSetSyncToken();
    case EVENT_STATUS:
      return isSetEventStatus();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEvent)
      return this.equals((SquareEvent)that);
    return false;
  }

  public boolean equals(SquareEvent that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_createdTime = true;
    boolean that_present_createdTime = true;
    if (this_present_createdTime || that_present_createdTime) {
      if (!(this_present_createdTime && that_present_createdTime))
        return false;
      if (this.createdTime != that.createdTime)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_payload = true && this.isSetPayload();
    boolean that_present_payload = true && that.isSetPayload();
    if (this_present_payload || that_present_payload) {
      if (!(this_present_payload && that_present_payload))
        return false;
      if (!this.payload.equals(that.payload))
        return false;
    }

    boolean this_present_syncToken = true && this.isSetSyncToken();
    boolean that_present_syncToken = true && that.isSetSyncToken();
    if (this_present_syncToken || that_present_syncToken) {
      if (!(this_present_syncToken && that_present_syncToken))
        return false;
      if (!this.syncToken.equals(that.syncToken))
        return false;
    }

    boolean this_present_eventStatus = true && this.isSetEventStatus();
    boolean that_present_eventStatus = true && that.isSetEventStatus();
    if (this_present_eventStatus || that_present_eventStatus) {
      if (!(this_present_eventStatus && that_present_eventStatus))
        return false;
      if (!this.eventStatus.equals(that.eventStatus))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(createdTime);

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetPayload()) ? 131071 : 524287);
    if (isSetPayload())
      hashCode = hashCode * 8191 + payload.hashCode();

    hashCode = hashCode * 8191 + ((isSetSyncToken()) ? 131071 : 524287);
    if (isSetSyncToken())
      hashCode = hashCode * 8191 + syncToken.hashCode();

    hashCode = hashCode * 8191 + ((isSetEventStatus()) ? 131071 : 524287);
    if (isSetEventStatus())
      hashCode = hashCode * 8191 + eventStatus.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(SquareEvent other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCreatedTime()).compareTo(other.isSetCreatedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreatedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.createdTime, other.createdTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPayload()).compareTo(other.isSetPayload());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPayload()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.payload, other.payload);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSyncToken()).compareTo(other.isSetSyncToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSyncToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.syncToken, other.syncToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetEventStatus()).compareTo(other.isSetEventStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEventStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.eventStatus, other.eventStatus);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareEvent(");
    boolean first = true;

    sb.append("createdTime:");
    sb.append(this.createdTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("payload:");
    if (this.payload == null) {
      sb.append("null");
    } else {
      sb.append(this.payload);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("syncToken:");
    if (this.syncToken == null) {
      sb.append("null");
    } else {
      sb.append(this.syncToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("eventStatus:");
    if (this.eventStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.eventStatus);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (payload != null) {
      payload.validate();
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class SquareEventStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventStandardScheme getScheme() {
      return new SquareEventStandardScheme();
    }
  }

  private static class SquareEventStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareEvent> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // CREATED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.createdTime = iprot.readI64();
              struct.setCreatedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = SquareEventType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PAYLOAD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.payload = new SquareEventPayload();
              struct.payload.read(iprot);
              struct.setPayloadIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SYNC_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.syncToken = iprot.readString();
              struct.setSyncTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // EVENT_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.eventStatus = SquareEventStatus.findByValue(iprot.readI32());
              struct.setEventStatusIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEvent struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(CREATED_TIME_FIELD_DESC);
      oprot.writeI64(struct.createdTime);
      oprot.writeFieldEnd();
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.payload != null) {
        oprot.writeFieldBegin(PAYLOAD_FIELD_DESC);
        struct.payload.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.syncToken != null) {
        oprot.writeFieldBegin(SYNC_TOKEN_FIELD_DESC);
        oprot.writeString(struct.syncToken);
        oprot.writeFieldEnd();
      }
      if (struct.eventStatus != null) {
        oprot.writeFieldBegin(EVENT_STATUS_FIELD_DESC);
        oprot.writeI32(struct.eventStatus.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventTupleScheme getScheme() {
      return new SquareEventTupleScheme();
    }
  }

  private static class SquareEventTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareEvent> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCreatedTime()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      if (struct.isSetPayload()) {
        optionals.set(2);
      }
      if (struct.isSetSyncToken()) {
        optionals.set(3);
      }
      if (struct.isSetEventStatus()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetCreatedTime()) {
        oprot.writeI64(struct.createdTime);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetPayload()) {
        struct.payload.write(oprot);
      }
      if (struct.isSetSyncToken()) {
        oprot.writeString(struct.syncToken);
      }
      if (struct.isSetEventStatus()) {
        oprot.writeI32(struct.eventStatus.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEvent struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.createdTime = iprot.readI64();
        struct.setCreatedTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = SquareEventType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.payload = new SquareEventPayload();
        struct.payload.read(iprot);
        struct.setPayloadIsSet(true);
      }
      if (incoming.get(3)) {
        struct.syncToken = iprot.readString();
        struct.setSyncTokenIsSet(true);
      }
      if (incoming.get(4)) {
        struct.eventStatus = SquareEventStatus.findByValue(iprot.readI32());
        struct.setEventStatusIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

