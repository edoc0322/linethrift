/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class SquareEventNotificationMessage implements org.apache.thrift.TBase<SquareEventNotificationMessage, SquareEventNotificationMessage._Fields>, java.io.Serializable, Cloneable, Comparable<SquareEventNotificationMessage> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareEventNotificationMessage");

  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("squareMessage", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SENDER_DISPLAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("senderDisplayName", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField UNREAD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("unreadCount", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField REQUIRED_TO_FETCH_CHAT_EVENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("requiredToFetchChatEvents", org.apache.thrift.protocol.TType.BOOL, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareEventNotificationMessageStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareEventNotificationMessageTupleSchemeFactory();

  public java.lang.String squareChatMid; // required
  public SquareMessage squareMessage; // required
  public java.lang.String senderDisplayName; // required
  public int unreadCount; // required
  public boolean requiredToFetchChatEvents; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHAT_MID((short)1, "squareChatMid"),
    SQUARE_MESSAGE((short)2, "squareMessage"),
    SENDER_DISPLAY_NAME((short)3, "senderDisplayName"),
    UNREAD_COUNT((short)4, "unreadCount"),
    REQUIRED_TO_FETCH_CHAT_EVENTS((short)5, "requiredToFetchChatEvents");

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
        case 1: // SQUARE_CHAT_MID
          return SQUARE_CHAT_MID;
        case 2: // SQUARE_MESSAGE
          return SQUARE_MESSAGE;
        case 3: // SENDER_DISPLAY_NAME
          return SENDER_DISPLAY_NAME;
        case 4: // UNREAD_COUNT
          return UNREAD_COUNT;
        case 5: // REQUIRED_TO_FETCH_CHAT_EVENTS
          return REQUIRED_TO_FETCH_CHAT_EVENTS;
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
  private static final int __UNREADCOUNT_ISSET_ID = 0;
  private static final int __REQUIREDTOFETCHCHATEVENTS_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQUARE_CHAT_MID, new org.apache.thrift.meta_data.FieldMetaData("squareChatMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SQUARE_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("squareMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareMessage.class)));
    tmpMap.put(_Fields.SENDER_DISPLAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("senderDisplayName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.UNREAD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("unreadCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.REQUIRED_TO_FETCH_CHAT_EVENTS, new org.apache.thrift.meta_data.FieldMetaData("requiredToFetchChatEvents", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareEventNotificationMessage.class, metaDataMap);
  }

  public SquareEventNotificationMessage() {
  }

  public SquareEventNotificationMessage(
    java.lang.String squareChatMid,
    SquareMessage squareMessage,
    java.lang.String senderDisplayName,
    int unreadCount,
    boolean requiredToFetchChatEvents)
  {
    this();
    this.squareChatMid = squareChatMid;
    this.squareMessage = squareMessage;
    this.senderDisplayName = senderDisplayName;
    this.unreadCount = unreadCount;
    setUnreadCountIsSet(true);
    this.requiredToFetchChatEvents = requiredToFetchChatEvents;
    setRequiredToFetchChatEventsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareEventNotificationMessage(SquareEventNotificationMessage other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
    if (other.isSetSquareMessage()) {
      this.squareMessage = new SquareMessage(other.squareMessage);
    }
    if (other.isSetSenderDisplayName()) {
      this.senderDisplayName = other.senderDisplayName;
    }
    this.unreadCount = other.unreadCount;
    this.requiredToFetchChatEvents = other.requiredToFetchChatEvents;
  }

  public SquareEventNotificationMessage deepCopy() {
    return new SquareEventNotificationMessage(this);
  }

  @Override
  public void clear() {
    this.squareChatMid = null;
    this.squareMessage = null;
    this.senderDisplayName = null;
    setUnreadCountIsSet(false);
    this.unreadCount = 0;
    setRequiredToFetchChatEventsIsSet(false);
    this.requiredToFetchChatEvents = false;
  }

  public java.lang.String getSquareChatMid() {
    return this.squareChatMid;
  }

  public SquareEventNotificationMessage setSquareChatMid(java.lang.String squareChatMid) {
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

  public SquareMessage getSquareMessage() {
    return this.squareMessage;
  }

  public SquareEventNotificationMessage setSquareMessage(SquareMessage squareMessage) {
    this.squareMessage = squareMessage;
    return this;
  }

  public void unsetSquareMessage() {
    this.squareMessage = null;
  }

  /** Returns true if field squareMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareMessage() {
    return this.squareMessage != null;
  }

  public void setSquareMessageIsSet(boolean value) {
    if (!value) {
      this.squareMessage = null;
    }
  }

  public java.lang.String getSenderDisplayName() {
    return this.senderDisplayName;
  }

  public SquareEventNotificationMessage setSenderDisplayName(java.lang.String senderDisplayName) {
    this.senderDisplayName = senderDisplayName;
    return this;
  }

  public void unsetSenderDisplayName() {
    this.senderDisplayName = null;
  }

  /** Returns true if field senderDisplayName is set (has been assigned a value) and false otherwise */
  public boolean isSetSenderDisplayName() {
    return this.senderDisplayName != null;
  }

  public void setSenderDisplayNameIsSet(boolean value) {
    if (!value) {
      this.senderDisplayName = null;
    }
  }

  public int getUnreadCount() {
    return this.unreadCount;
  }

  public SquareEventNotificationMessage setUnreadCount(int unreadCount) {
    this.unreadCount = unreadCount;
    setUnreadCountIsSet(true);
    return this;
  }

  public void unsetUnreadCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __UNREADCOUNT_ISSET_ID);
  }

  /** Returns true if field unreadCount is set (has been assigned a value) and false otherwise */
  public boolean isSetUnreadCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __UNREADCOUNT_ISSET_ID);
  }

  public void setUnreadCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __UNREADCOUNT_ISSET_ID, value);
  }

  public boolean isRequiredToFetchChatEvents() {
    return this.requiredToFetchChatEvents;
  }

  public SquareEventNotificationMessage setRequiredToFetchChatEvents(boolean requiredToFetchChatEvents) {
    this.requiredToFetchChatEvents = requiredToFetchChatEvents;
    setRequiredToFetchChatEventsIsSet(true);
    return this;
  }

  public void unsetRequiredToFetchChatEvents() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REQUIREDTOFETCHCHATEVENTS_ISSET_ID);
  }

  /** Returns true if field requiredToFetchChatEvents is set (has been assigned a value) and false otherwise */
  public boolean isSetRequiredToFetchChatEvents() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REQUIREDTOFETCHCHATEVENTS_ISSET_ID);
  }

  public void setRequiredToFetchChatEventsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REQUIREDTOFETCHCHATEVENTS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SQUARE_CHAT_MID:
      if (value == null) {
        unsetSquareChatMid();
      } else {
        setSquareChatMid((java.lang.String)value);
      }
      break;

    case SQUARE_MESSAGE:
      if (value == null) {
        unsetSquareMessage();
      } else {
        setSquareMessage((SquareMessage)value);
      }
      break;

    case SENDER_DISPLAY_NAME:
      if (value == null) {
        unsetSenderDisplayName();
      } else {
        setSenderDisplayName((java.lang.String)value);
      }
      break;

    case UNREAD_COUNT:
      if (value == null) {
        unsetUnreadCount();
      } else {
        setUnreadCount((java.lang.Integer)value);
      }
      break;

    case REQUIRED_TO_FETCH_CHAT_EVENTS:
      if (value == null) {
        unsetRequiredToFetchChatEvents();
      } else {
        setRequiredToFetchChatEvents((java.lang.Boolean)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHAT_MID:
      return getSquareChatMid();

    case SQUARE_MESSAGE:
      return getSquareMessage();

    case SENDER_DISPLAY_NAME:
      return getSenderDisplayName();

    case UNREAD_COUNT:
      return getUnreadCount();

    case REQUIRED_TO_FETCH_CHAT_EVENTS:
      return isRequiredToFetchChatEvents();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_CHAT_MID:
      return isSetSquareChatMid();
    case SQUARE_MESSAGE:
      return isSetSquareMessage();
    case SENDER_DISPLAY_NAME:
      return isSetSenderDisplayName();
    case UNREAD_COUNT:
      return isSetUnreadCount();
    case REQUIRED_TO_FETCH_CHAT_EVENTS:
      return isSetRequiredToFetchChatEvents();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareEventNotificationMessage)
      return this.equals((SquareEventNotificationMessage)that);
    return false;
  }

  public boolean equals(SquareEventNotificationMessage that) {
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

    boolean this_present_squareMessage = true && this.isSetSquareMessage();
    boolean that_present_squareMessage = true && that.isSetSquareMessage();
    if (this_present_squareMessage || that_present_squareMessage) {
      if (!(this_present_squareMessage && that_present_squareMessage))
        return false;
      if (!this.squareMessage.equals(that.squareMessage))
        return false;
    }

    boolean this_present_senderDisplayName = true && this.isSetSenderDisplayName();
    boolean that_present_senderDisplayName = true && that.isSetSenderDisplayName();
    if (this_present_senderDisplayName || that_present_senderDisplayName) {
      if (!(this_present_senderDisplayName && that_present_senderDisplayName))
        return false;
      if (!this.senderDisplayName.equals(that.senderDisplayName))
        return false;
    }

    boolean this_present_unreadCount = true;
    boolean that_present_unreadCount = true;
    if (this_present_unreadCount || that_present_unreadCount) {
      if (!(this_present_unreadCount && that_present_unreadCount))
        return false;
      if (this.unreadCount != that.unreadCount)
        return false;
    }

    boolean this_present_requiredToFetchChatEvents = true;
    boolean that_present_requiredToFetchChatEvents = true;
    if (this_present_requiredToFetchChatEvents || that_present_requiredToFetchChatEvents) {
      if (!(this_present_requiredToFetchChatEvents && that_present_requiredToFetchChatEvents))
        return false;
      if (this.requiredToFetchChatEvents != that.requiredToFetchChatEvents)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSquareChatMid()) ? 131071 : 524287);
    if (isSetSquareChatMid())
      hashCode = hashCode * 8191 + squareChatMid.hashCode();

    hashCode = hashCode * 8191 + ((isSetSquareMessage()) ? 131071 : 524287);
    if (isSetSquareMessage())
      hashCode = hashCode * 8191 + squareMessage.hashCode();

    hashCode = hashCode * 8191 + ((isSetSenderDisplayName()) ? 131071 : 524287);
    if (isSetSenderDisplayName())
      hashCode = hashCode * 8191 + senderDisplayName.hashCode();

    hashCode = hashCode * 8191 + unreadCount;

    hashCode = hashCode * 8191 + ((requiredToFetchChatEvents) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(SquareEventNotificationMessage other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(isSetSquareMessage()).compareTo(other.isSetSquareMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareMessage, other.squareMessage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSenderDisplayName()).compareTo(other.isSetSenderDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSenderDisplayName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.senderDisplayName, other.senderDisplayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetUnreadCount()).compareTo(other.isSetUnreadCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnreadCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unreadCount, other.unreadCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRequiredToFetchChatEvents()).compareTo(other.isSetRequiredToFetchChatEvents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRequiredToFetchChatEvents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.requiredToFetchChatEvents, other.requiredToFetchChatEvents);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareEventNotificationMessage(");
    boolean first = true;

    sb.append("squareChatMid:");
    if (this.squareChatMid == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatMid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareMessage:");
    if (this.squareMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.squareMessage);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("senderDisplayName:");
    if (this.senderDisplayName == null) {
      sb.append("null");
    } else {
      sb.append(this.senderDisplayName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("unreadCount:");
    sb.append(this.unreadCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("requiredToFetchChatEvents:");
    sb.append(this.requiredToFetchChatEvents);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (squareMessage != null) {
      squareMessage.validate();
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

  private static class SquareEventNotificationMessageStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotificationMessageStandardScheme getScheme() {
      return new SquareEventNotificationMessageStandardScheme();
    }
  }

  private static class SquareEventNotificationMessageStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareEventNotificationMessage> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareEventNotificationMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_CHAT_MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.squareChatMid = iprot.readString();
              struct.setSquareChatMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SQUARE_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareMessage = new SquareMessage();
              struct.squareMessage.read(iprot);
              struct.setSquareMessageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SENDER_DISPLAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.senderDisplayName = iprot.readString();
              struct.setSenderDisplayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // UNREAD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.unreadCount = iprot.readI32();
              struct.setUnreadCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // REQUIRED_TO_FETCH_CHAT_EVENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.requiredToFetchChatEvents = iprot.readBool();
              struct.setRequiredToFetchChatEventsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareEventNotificationMessage struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChatMid != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_MID_FIELD_DESC);
        oprot.writeString(struct.squareChatMid);
        oprot.writeFieldEnd();
      }
      if (struct.squareMessage != null) {
        oprot.writeFieldBegin(SQUARE_MESSAGE_FIELD_DESC);
        struct.squareMessage.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.senderDisplayName != null) {
        oprot.writeFieldBegin(SENDER_DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(struct.senderDisplayName);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(UNREAD_COUNT_FIELD_DESC);
      oprot.writeI32(struct.unreadCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REQUIRED_TO_FETCH_CHAT_EVENTS_FIELD_DESC);
      oprot.writeBool(struct.requiredToFetchChatEvents);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareEventNotificationMessageTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareEventNotificationMessageTupleScheme getScheme() {
      return new SquareEventNotificationMessageTupleScheme();
    }
  }

  private static class SquareEventNotificationMessageTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareEventNotificationMessage> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareEventNotificationMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareChatMid()) {
        optionals.set(0);
      }
      if (struct.isSetSquareMessage()) {
        optionals.set(1);
      }
      if (struct.isSetSenderDisplayName()) {
        optionals.set(2);
      }
      if (struct.isSetUnreadCount()) {
        optionals.set(3);
      }
      if (struct.isSetRequiredToFetchChatEvents()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
      if (struct.isSetSquareMessage()) {
        struct.squareMessage.write(oprot);
      }
      if (struct.isSetSenderDisplayName()) {
        oprot.writeString(struct.senderDisplayName);
      }
      if (struct.isSetUnreadCount()) {
        oprot.writeI32(struct.unreadCount);
      }
      if (struct.isSetRequiredToFetchChatEvents()) {
        oprot.writeBool(struct.requiredToFetchChatEvents);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareEventNotificationMessage struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareMessage = new SquareMessage();
        struct.squareMessage.read(iprot);
        struct.setSquareMessageIsSet(true);
      }
      if (incoming.get(2)) {
        struct.senderDisplayName = iprot.readString();
        struct.setSenderDisplayNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.unreadCount = iprot.readI32();
        struct.setUnreadCountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.requiredToFetchChatEvents = iprot.readBool();
        struct.setRequiredToFetchChatEventsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
