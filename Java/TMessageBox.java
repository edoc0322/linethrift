/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class TMessageBox implements org.apache.thrift.TBase<TMessageBox, TMessageBox._Fields>, java.io.Serializable, Cloneable, Comparable<TMessageBox> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TMessageBox");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CHANNEL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("channelId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("lastSeq", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField UNREAD_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("unreadCount", org.apache.thrift.protocol.TType.I64, (short)6);
  private static final org.apache.thrift.protocol.TField LAST_MODIFIED_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("lastModifiedTime", org.apache.thrift.protocol.TType.I64, (short)7);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)8);
  private static final org.apache.thrift.protocol.TField MID_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("midType", org.apache.thrift.protocol.TType.I32, (short)9);
  private static final org.apache.thrift.protocol.TField LAST_MESSAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("lastMessages", org.apache.thrift.protocol.TType.LIST, (short)10);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TMessageBoxStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TMessageBoxTupleSchemeFactory();

  public java.lang.String id; // required
  public java.lang.String channelId; // required
  public long lastSeq; // required
  public long unreadCount; // required
  public long lastModifiedTime; // required
  public int status; // required
  /**
   * 
   * @see MIDType
   */
  public MIDType midType; // required
  public java.util.List<Message> lastMessages; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    CHANNEL_ID((short)2, "channelId"),
    LAST_SEQ((short)5, "lastSeq"),
    UNREAD_COUNT((short)6, "unreadCount"),
    LAST_MODIFIED_TIME((short)7, "lastModifiedTime"),
    STATUS((short)8, "status"),
    /**
     * 
     * @see MIDType
     */
    MID_TYPE((short)9, "midType"),
    LAST_MESSAGES((short)10, "lastMessages");

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
        case 1: // ID
          return ID;
        case 2: // CHANNEL_ID
          return CHANNEL_ID;
        case 5: // LAST_SEQ
          return LAST_SEQ;
        case 6: // UNREAD_COUNT
          return UNREAD_COUNT;
        case 7: // LAST_MODIFIED_TIME
          return LAST_MODIFIED_TIME;
        case 8: // STATUS
          return STATUS;
        case 9: // MID_TYPE
          return MID_TYPE;
        case 10: // LAST_MESSAGES
          return LAST_MESSAGES;
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
  private static final int __LASTSEQ_ISSET_ID = 0;
  private static final int __UNREADCOUNT_ISSET_ID = 1;
  private static final int __LASTMODIFIEDTIME_ISSET_ID = 2;
  private static final int __STATUS_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CHANNEL_ID, new org.apache.thrift.meta_data.FieldMetaData("channelId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.LAST_SEQ, new org.apache.thrift.meta_data.FieldMetaData("lastSeq", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.UNREAD_COUNT, new org.apache.thrift.meta_data.FieldMetaData("unreadCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.LAST_MODIFIED_TIME, new org.apache.thrift.meta_data.FieldMetaData("lastModifiedTime", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.MID_TYPE, new org.apache.thrift.meta_data.FieldMetaData("midType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MIDType.class)));
    tmpMap.put(_Fields.LAST_MESSAGES, new org.apache.thrift.meta_data.FieldMetaData("lastMessages", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Message.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TMessageBox.class, metaDataMap);
  }

  public TMessageBox() {
  }

  public TMessageBox(
    java.lang.String id,
    java.lang.String channelId,
    long lastSeq,
    long unreadCount,
    long lastModifiedTime,
    int status,
    MIDType midType,
    java.util.List<Message> lastMessages)
  {
    this();
    this.id = id;
    this.channelId = channelId;
    this.lastSeq = lastSeq;
    setLastSeqIsSet(true);
    this.unreadCount = unreadCount;
    setUnreadCountIsSet(true);
    this.lastModifiedTime = lastModifiedTime;
    setLastModifiedTimeIsSet(true);
    this.status = status;
    setStatusIsSet(true);
    this.midType = midType;
    this.lastMessages = lastMessages;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TMessageBox(TMessageBox other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = other.id;
    }
    if (other.isSetChannelId()) {
      this.channelId = other.channelId;
    }
    this.lastSeq = other.lastSeq;
    this.unreadCount = other.unreadCount;
    this.lastModifiedTime = other.lastModifiedTime;
    this.status = other.status;
    if (other.isSetMidType()) {
      this.midType = other.midType;
    }
    if (other.isSetLastMessages()) {
      java.util.List<Message> __this__lastMessages = new java.util.ArrayList<Message>(other.lastMessages.size());
      for (Message other_element : other.lastMessages) {
        __this__lastMessages.add(new Message(other_element));
      }
      this.lastMessages = __this__lastMessages;
    }
  }

  public TMessageBox deepCopy() {
    return new TMessageBox(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.channelId = null;
    setLastSeqIsSet(false);
    this.lastSeq = 0;
    setUnreadCountIsSet(false);
    this.unreadCount = 0;
    setLastModifiedTimeIsSet(false);
    this.lastModifiedTime = 0;
    setStatusIsSet(false);
    this.status = 0;
    this.midType = null;
    this.lastMessages = null;
  }

  public java.lang.String getId() {
    return this.id;
  }

  public TMessageBox setId(java.lang.String id) {
    this.id = id;
    return this;
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

  public java.lang.String getChannelId() {
    return this.channelId;
  }

  public TMessageBox setChannelId(java.lang.String channelId) {
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

  public long getLastSeq() {
    return this.lastSeq;
  }

  public TMessageBox setLastSeq(long lastSeq) {
    this.lastSeq = lastSeq;
    setLastSeqIsSet(true);
    return this;
  }

  public void unsetLastSeq() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTSEQ_ISSET_ID);
  }

  /** Returns true if field lastSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetLastSeq() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTSEQ_ISSET_ID);
  }

  public void setLastSeqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTSEQ_ISSET_ID, value);
  }

  public long getUnreadCount() {
    return this.unreadCount;
  }

  public TMessageBox setUnreadCount(long unreadCount) {
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

  public long getLastModifiedTime() {
    return this.lastModifiedTime;
  }

  public TMessageBox setLastModifiedTime(long lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    setLastModifiedTimeIsSet(true);
    return this;
  }

  public void unsetLastModifiedTime() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTMODIFIEDTIME_ISSET_ID);
  }

  /** Returns true if field lastModifiedTime is set (has been assigned a value) and false otherwise */
  public boolean isSetLastModifiedTime() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTMODIFIEDTIME_ISSET_ID);
  }

  public void setLastModifiedTimeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTMODIFIEDTIME_ISSET_ID, value);
  }

  public int getStatus() {
    return this.status;
  }

  public TMessageBox setStatus(int status) {
    this.status = status;
    setStatusIsSet(true);
    return this;
  }

  public void unsetStatus() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STATUS_ISSET_ID);
  }

  public void setStatusIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STATUS_ISSET_ID, value);
  }

  /**
   * 
   * @see MIDType
   */
  public MIDType getMidType() {
    return this.midType;
  }

  /**
   * 
   * @see MIDType
   */
  public TMessageBox setMidType(MIDType midType) {
    this.midType = midType;
    return this;
  }

  public void unsetMidType() {
    this.midType = null;
  }

  /** Returns true if field midType is set (has been assigned a value) and false otherwise */
  public boolean isSetMidType() {
    return this.midType != null;
  }

  public void setMidTypeIsSet(boolean value) {
    if (!value) {
      this.midType = null;
    }
  }

  public int getLastMessagesSize() {
    return (this.lastMessages == null) ? 0 : this.lastMessages.size();
  }

  public java.util.Iterator<Message> getLastMessagesIterator() {
    return (this.lastMessages == null) ? null : this.lastMessages.iterator();
  }

  public void addToLastMessages(Message elem) {
    if (this.lastMessages == null) {
      this.lastMessages = new java.util.ArrayList<Message>();
    }
    this.lastMessages.add(elem);
  }

  public java.util.List<Message> getLastMessages() {
    return this.lastMessages;
  }

  public TMessageBox setLastMessages(java.util.List<Message> lastMessages) {
    this.lastMessages = lastMessages;
    return this;
  }

  public void unsetLastMessages() {
    this.lastMessages = null;
  }

  /** Returns true if field lastMessages is set (has been assigned a value) and false otherwise */
  public boolean isSetLastMessages() {
    return this.lastMessages != null;
  }

  public void setLastMessagesIsSet(boolean value) {
    if (!value) {
      this.lastMessages = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((java.lang.String)value);
      }
      break;

    case CHANNEL_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        setChannelId((java.lang.String)value);
      }
      break;

    case LAST_SEQ:
      if (value == null) {
        unsetLastSeq();
      } else {
        setLastSeq((java.lang.Long)value);
      }
      break;

    case UNREAD_COUNT:
      if (value == null) {
        unsetUnreadCount();
      } else {
        setUnreadCount((java.lang.Long)value);
      }
      break;

    case LAST_MODIFIED_TIME:
      if (value == null) {
        unsetLastModifiedTime();
      } else {
        setLastModifiedTime((java.lang.Long)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((java.lang.Integer)value);
      }
      break;

    case MID_TYPE:
      if (value == null) {
        unsetMidType();
      } else {
        setMidType((MIDType)value);
      }
      break;

    case LAST_MESSAGES:
      if (value == null) {
        unsetLastMessages();
      } else {
        setLastMessages((java.util.List<Message>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case CHANNEL_ID:
      return getChannelId();

    case LAST_SEQ:
      return getLastSeq();

    case UNREAD_COUNT:
      return getUnreadCount();

    case LAST_MODIFIED_TIME:
      return getLastModifiedTime();

    case STATUS:
      return getStatus();

    case MID_TYPE:
      return getMidType();

    case LAST_MESSAGES:
      return getLastMessages();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case CHANNEL_ID:
      return isSetChannelId();
    case LAST_SEQ:
      return isSetLastSeq();
    case UNREAD_COUNT:
      return isSetUnreadCount();
    case LAST_MODIFIED_TIME:
      return isSetLastModifiedTime();
    case STATUS:
      return isSetStatus();
    case MID_TYPE:
      return isSetMidType();
    case LAST_MESSAGES:
      return isSetLastMessages();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TMessageBox)
      return this.equals((TMessageBox)that);
    return false;
  }

  public boolean equals(TMessageBox that) {
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

    boolean this_present_channelId = true && this.isSetChannelId();
    boolean that_present_channelId = true && that.isSetChannelId();
    if (this_present_channelId || that_present_channelId) {
      if (!(this_present_channelId && that_present_channelId))
        return false;
      if (!this.channelId.equals(that.channelId))
        return false;
    }

    boolean this_present_lastSeq = true;
    boolean that_present_lastSeq = true;
    if (this_present_lastSeq || that_present_lastSeq) {
      if (!(this_present_lastSeq && that_present_lastSeq))
        return false;
      if (this.lastSeq != that.lastSeq)
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

    boolean this_present_lastModifiedTime = true;
    boolean that_present_lastModifiedTime = true;
    if (this_present_lastModifiedTime || that_present_lastModifiedTime) {
      if (!(this_present_lastModifiedTime && that_present_lastModifiedTime))
        return false;
      if (this.lastModifiedTime != that.lastModifiedTime)
        return false;
    }

    boolean this_present_status = true;
    boolean that_present_status = true;
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (this.status != that.status)
        return false;
    }

    boolean this_present_midType = true && this.isSetMidType();
    boolean that_present_midType = true && that.isSetMidType();
    if (this_present_midType || that_present_midType) {
      if (!(this_present_midType && that_present_midType))
        return false;
      if (!this.midType.equals(that.midType))
        return false;
    }

    boolean this_present_lastMessages = true && this.isSetLastMessages();
    boolean that_present_lastMessages = true && that.isSetLastMessages();
    if (this_present_lastMessages || that_present_lastMessages) {
      if (!(this_present_lastMessages && that_present_lastMessages))
        return false;
      if (!this.lastMessages.equals(that.lastMessages))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetChannelId()) ? 131071 : 524287);
    if (isSetChannelId())
      hashCode = hashCode * 8191 + channelId.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lastSeq);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(unreadCount);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lastModifiedTime);

    hashCode = hashCode * 8191 + status;

    hashCode = hashCode * 8191 + ((isSetMidType()) ? 131071 : 524287);
    if (isSetMidType())
      hashCode = hashCode * 8191 + midType.getValue();

    hashCode = hashCode * 8191 + ((isSetLastMessages()) ? 131071 : 524287);
    if (isSetLastMessages())
      hashCode = hashCode * 8191 + lastMessages.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(TMessageBox other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = java.lang.Boolean.valueOf(isSetLastSeq()).compareTo(other.isSetLastSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastSeq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastSeq, other.lastSeq);
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
    lastComparison = java.lang.Boolean.valueOf(isSetLastModifiedTime()).compareTo(other.isSetLastModifiedTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastModifiedTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastModifiedTime, other.lastModifiedTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetMidType()).compareTo(other.isSetMidType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMidType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.midType, other.midType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastMessages()).compareTo(other.isSetLastMessages());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastMessages()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastMessages, other.lastMessages);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TMessageBox(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("channelId:");
    if (this.channelId == null) {
      sb.append("null");
    } else {
      sb.append(this.channelId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastSeq:");
    sb.append(this.lastSeq);
    first = false;
    if (!first) sb.append(", ");
    sb.append("unreadCount:");
    sb.append(this.unreadCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastModifiedTime:");
    sb.append(this.lastModifiedTime);
    first = false;
    if (!first) sb.append(", ");
    sb.append("status:");
    sb.append(this.status);
    first = false;
    if (!first) sb.append(", ");
    sb.append("midType:");
    if (this.midType == null) {
      sb.append("null");
    } else {
      sb.append(this.midType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastMessages:");
    if (this.lastMessages == null) {
      sb.append("null");
    } else {
      sb.append(this.lastMessages);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TMessageBoxStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMessageBoxStandardScheme getScheme() {
      return new TMessageBoxStandardScheme();
    }
  }

  private static class TMessageBoxStandardScheme extends org.apache.thrift.scheme.StandardScheme<TMessageBox> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TMessageBox struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.id = iprot.readString();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CHANNEL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.channelId = iprot.readString();
              struct.setChannelIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // LAST_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastSeq = iprot.readI64();
              struct.setLastSeqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // UNREAD_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.unreadCount = iprot.readI64();
              struct.setUnreadCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // LAST_MODIFIED_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastModifiedTime = iprot.readI64();
              struct.setLastModifiedTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 8: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = iprot.readI32();
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 9: // MID_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.midType = MIDType.findByValue(iprot.readI32());
              struct.setMidTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 10: // LAST_MESSAGES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list686 = iprot.readListBegin();
                struct.lastMessages = new java.util.ArrayList<Message>(_list686.size);
                Message _elem687;
                for (int _i688 = 0; _i688 < _list686.size; ++_i688)
                {
                  _elem687 = new Message();
                  _elem687.read(iprot);
                  struct.lastMessages.add(_elem687);
                }
                iprot.readListEnd();
              }
              struct.setLastMessagesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TMessageBox struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        oprot.writeString(struct.id);
        oprot.writeFieldEnd();
      }
      if (struct.channelId != null) {
        oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
        oprot.writeString(struct.channelId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(LAST_SEQ_FIELD_DESC);
      oprot.writeI64(struct.lastSeq);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(UNREAD_COUNT_FIELD_DESC);
      oprot.writeI64(struct.unreadCount);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_MODIFIED_TIME_FIELD_DESC);
      oprot.writeI64(struct.lastModifiedTime);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STATUS_FIELD_DESC);
      oprot.writeI32(struct.status);
      oprot.writeFieldEnd();
      if (struct.midType != null) {
        oprot.writeFieldBegin(MID_TYPE_FIELD_DESC);
        oprot.writeI32(struct.midType.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.lastMessages != null) {
        oprot.writeFieldBegin(LAST_MESSAGES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.lastMessages.size()));
          for (Message _iter689 : struct.lastMessages)
          {
            _iter689.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TMessageBoxTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TMessageBoxTupleScheme getScheme() {
      return new TMessageBoxTupleScheme();
    }
  }

  private static class TMessageBoxTupleScheme extends org.apache.thrift.scheme.TupleScheme<TMessageBox> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TMessageBox struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetChannelId()) {
        optionals.set(1);
      }
      if (struct.isSetLastSeq()) {
        optionals.set(2);
      }
      if (struct.isSetUnreadCount()) {
        optionals.set(3);
      }
      if (struct.isSetLastModifiedTime()) {
        optionals.set(4);
      }
      if (struct.isSetStatus()) {
        optionals.set(5);
      }
      if (struct.isSetMidType()) {
        optionals.set(6);
      }
      if (struct.isSetLastMessages()) {
        optionals.set(7);
      }
      oprot.writeBitSet(optionals, 8);
      if (struct.isSetId()) {
        oprot.writeString(struct.id);
      }
      if (struct.isSetChannelId()) {
        oprot.writeString(struct.channelId);
      }
      if (struct.isSetLastSeq()) {
        oprot.writeI64(struct.lastSeq);
      }
      if (struct.isSetUnreadCount()) {
        oprot.writeI64(struct.unreadCount);
      }
      if (struct.isSetLastModifiedTime()) {
        oprot.writeI64(struct.lastModifiedTime);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status);
      }
      if (struct.isSetMidType()) {
        oprot.writeI32(struct.midType.getValue());
      }
      if (struct.isSetLastMessages()) {
        {
          oprot.writeI32(struct.lastMessages.size());
          for (Message _iter690 : struct.lastMessages)
          {
            _iter690.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TMessageBox struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(8);
      if (incoming.get(0)) {
        struct.id = iprot.readString();
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.channelId = iprot.readString();
        struct.setChannelIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastSeq = iprot.readI64();
        struct.setLastSeqIsSet(true);
      }
      if (incoming.get(3)) {
        struct.unreadCount = iprot.readI64();
        struct.setUnreadCountIsSet(true);
      }
      if (incoming.get(4)) {
        struct.lastModifiedTime = iprot.readI64();
        struct.setLastModifiedTimeIsSet(true);
      }
      if (incoming.get(5)) {
        struct.status = iprot.readI32();
        struct.setStatusIsSet(true);
      }
      if (incoming.get(6)) {
        struct.midType = MIDType.findByValue(iprot.readI32());
        struct.setMidTypeIsSet(true);
      }
      if (incoming.get(7)) {
        {
          org.apache.thrift.protocol.TList _list691 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.lastMessages = new java.util.ArrayList<Message>(_list691.size);
          Message _elem692;
          for (int _i693 = 0; _i693 < _list691.size; ++_i693)
          {
            _elem692 = new Message();
            _elem692.read(iprot);
            struct.lastMessages.add(_elem692);
          }
        }
        struct.setLastMessagesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

