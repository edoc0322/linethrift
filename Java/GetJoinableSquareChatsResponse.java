/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class GetJoinableSquareChatsResponse implements org.apache.thrift.TBase<GetJoinableSquareChatsResponse, GetJoinableSquareChatsResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetJoinableSquareChatsResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetJoinableSquareChatsResponse");

  private static final org.apache.thrift.protocol.TField SQUARE_CHATS_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChats", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField CONTINUATION_TOKEN_FIELD_DESC = new org.apache.thrift.protocol.TField("continuationToken", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TOTAL_SQUARE_CHAT_COUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("totalSquareChatCount", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_STATUSES_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatStatuses", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetJoinableSquareChatsResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetJoinableSquareChatsResponseTupleSchemeFactory();

  public java.util.List<SquareChat> squareChats; // required
  public java.lang.String continuationToken; // required
  public int totalSquareChatCount; // required
  public java.util.Map<java.lang.String,SquareChatStatus> squareChatStatuses; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_CHATS((short)1, "squareChats"),
    CONTINUATION_TOKEN((short)2, "continuationToken"),
    TOTAL_SQUARE_CHAT_COUNT((short)3, "totalSquareChatCount"),
    SQUARE_CHAT_STATUSES((short)4, "squareChatStatuses");

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
        case 1: // SQUARE_CHATS
          return SQUARE_CHATS;
        case 2: // CONTINUATION_TOKEN
          return CONTINUATION_TOKEN;
        case 3: // TOTAL_SQUARE_CHAT_COUNT
          return TOTAL_SQUARE_CHAT_COUNT;
        case 4: // SQUARE_CHAT_STATUSES
          return SQUARE_CHAT_STATUSES;
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
  private static final int __TOTALSQUARECHATCOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SQUARE_CHATS, new org.apache.thrift.meta_data.FieldMetaData("squareChats", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareChat.class))));
    tmpMap.put(_Fields.CONTINUATION_TOKEN, new org.apache.thrift.meta_data.FieldMetaData("continuationToken", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TOTAL_SQUARE_CHAT_COUNT, new org.apache.thrift.meta_data.FieldMetaData("totalSquareChatCount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.SQUARE_CHAT_STATUSES, new org.apache.thrift.meta_data.FieldMetaData("squareChatStatuses", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareChatStatus.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetJoinableSquareChatsResponse.class, metaDataMap);
  }

  public GetJoinableSquareChatsResponse() {
  }

  public GetJoinableSquareChatsResponse(
    java.util.List<SquareChat> squareChats,
    java.lang.String continuationToken,
    int totalSquareChatCount,
    java.util.Map<java.lang.String,SquareChatStatus> squareChatStatuses)
  {
    this();
    this.squareChats = squareChats;
    this.continuationToken = continuationToken;
    this.totalSquareChatCount = totalSquareChatCount;
    setTotalSquareChatCountIsSet(true);
    this.squareChatStatuses = squareChatStatuses;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetJoinableSquareChatsResponse(GetJoinableSquareChatsResponse other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetSquareChats()) {
      java.util.List<SquareChat> __this__squareChats = new java.util.ArrayList<SquareChat>(other.squareChats.size());
      for (SquareChat other_element : other.squareChats) {
        __this__squareChats.add(new SquareChat(other_element));
      }
      this.squareChats = __this__squareChats;
    }
    if (other.isSetContinuationToken()) {
      this.continuationToken = other.continuationToken;
    }
    this.totalSquareChatCount = other.totalSquareChatCount;
    if (other.isSetSquareChatStatuses()) {
      java.util.Map<java.lang.String,SquareChatStatus> __this__squareChatStatuses = new java.util.HashMap<java.lang.String,SquareChatStatus>(other.squareChatStatuses.size());
      for (java.util.Map.Entry<java.lang.String, SquareChatStatus> other_element : other.squareChatStatuses.entrySet()) {

        java.lang.String other_element_key = other_element.getKey();
        SquareChatStatus other_element_value = other_element.getValue();

        java.lang.String __this__squareChatStatuses_copy_key = other_element_key;

        SquareChatStatus __this__squareChatStatuses_copy_value = new SquareChatStatus(other_element_value);

        __this__squareChatStatuses.put(__this__squareChatStatuses_copy_key, __this__squareChatStatuses_copy_value);
      }
      this.squareChatStatuses = __this__squareChatStatuses;
    }
  }

  public GetJoinableSquareChatsResponse deepCopy() {
    return new GetJoinableSquareChatsResponse(this);
  }

  @Override
  public void clear() {
    this.squareChats = null;
    this.continuationToken = null;
    setTotalSquareChatCountIsSet(false);
    this.totalSquareChatCount = 0;
    this.squareChatStatuses = null;
  }

  public int getSquareChatsSize() {
    return (this.squareChats == null) ? 0 : this.squareChats.size();
  }

  public java.util.Iterator<SquareChat> getSquareChatsIterator() {
    return (this.squareChats == null) ? null : this.squareChats.iterator();
  }

  public void addToSquareChats(SquareChat elem) {
    if (this.squareChats == null) {
      this.squareChats = new java.util.ArrayList<SquareChat>();
    }
    this.squareChats.add(elem);
  }

  public java.util.List<SquareChat> getSquareChats() {
    return this.squareChats;
  }

  public GetJoinableSquareChatsResponse setSquareChats(java.util.List<SquareChat> squareChats) {
    this.squareChats = squareChats;
    return this;
  }

  public void unsetSquareChats() {
    this.squareChats = null;
  }

  /** Returns true if field squareChats is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChats() {
    return this.squareChats != null;
  }

  public void setSquareChatsIsSet(boolean value) {
    if (!value) {
      this.squareChats = null;
    }
  }

  public java.lang.String getContinuationToken() {
    return this.continuationToken;
  }

  public GetJoinableSquareChatsResponse setContinuationToken(java.lang.String continuationToken) {
    this.continuationToken = continuationToken;
    return this;
  }

  public void unsetContinuationToken() {
    this.continuationToken = null;
  }

  /** Returns true if field continuationToken is set (has been assigned a value) and false otherwise */
  public boolean isSetContinuationToken() {
    return this.continuationToken != null;
  }

  public void setContinuationTokenIsSet(boolean value) {
    if (!value) {
      this.continuationToken = null;
    }
  }

  public int getTotalSquareChatCount() {
    return this.totalSquareChatCount;
  }

  public GetJoinableSquareChatsResponse setTotalSquareChatCount(int totalSquareChatCount) {
    this.totalSquareChatCount = totalSquareChatCount;
    setTotalSquareChatCountIsSet(true);
    return this;
  }

  public void unsetTotalSquareChatCount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTALSQUARECHATCOUNT_ISSET_ID);
  }

  /** Returns true if field totalSquareChatCount is set (has been assigned a value) and false otherwise */
  public boolean isSetTotalSquareChatCount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTALSQUARECHATCOUNT_ISSET_ID);
  }

  public void setTotalSquareChatCountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTALSQUARECHATCOUNT_ISSET_ID, value);
  }

  public int getSquareChatStatusesSize() {
    return (this.squareChatStatuses == null) ? 0 : this.squareChatStatuses.size();
  }

  public void putToSquareChatStatuses(java.lang.String key, SquareChatStatus val) {
    if (this.squareChatStatuses == null) {
      this.squareChatStatuses = new java.util.HashMap<java.lang.String,SquareChatStatus>();
    }
    this.squareChatStatuses.put(key, val);
  }

  public java.util.Map<java.lang.String,SquareChatStatus> getSquareChatStatuses() {
    return this.squareChatStatuses;
  }

  public GetJoinableSquareChatsResponse setSquareChatStatuses(java.util.Map<java.lang.String,SquareChatStatus> squareChatStatuses) {
    this.squareChatStatuses = squareChatStatuses;
    return this;
  }

  public void unsetSquareChatStatuses() {
    this.squareChatStatuses = null;
  }

  /** Returns true if field squareChatStatuses is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareChatStatuses() {
    return this.squareChatStatuses != null;
  }

  public void setSquareChatStatusesIsSet(boolean value) {
    if (!value) {
      this.squareChatStatuses = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SQUARE_CHATS:
      if (value == null) {
        unsetSquareChats();
      } else {
        setSquareChats((java.util.List<SquareChat>)value);
      }
      break;

    case CONTINUATION_TOKEN:
      if (value == null) {
        unsetContinuationToken();
      } else {
        setContinuationToken((java.lang.String)value);
      }
      break;

    case TOTAL_SQUARE_CHAT_COUNT:
      if (value == null) {
        unsetTotalSquareChatCount();
      } else {
        setTotalSquareChatCount((java.lang.Integer)value);
      }
      break;

    case SQUARE_CHAT_STATUSES:
      if (value == null) {
        unsetSquareChatStatuses();
      } else {
        setSquareChatStatuses((java.util.Map<java.lang.String,SquareChatStatus>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_CHATS:
      return getSquareChats();

    case CONTINUATION_TOKEN:
      return getContinuationToken();

    case TOTAL_SQUARE_CHAT_COUNT:
      return getTotalSquareChatCount();

    case SQUARE_CHAT_STATUSES:
      return getSquareChatStatuses();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_CHATS:
      return isSetSquareChats();
    case CONTINUATION_TOKEN:
      return isSetContinuationToken();
    case TOTAL_SQUARE_CHAT_COUNT:
      return isSetTotalSquareChatCount();
    case SQUARE_CHAT_STATUSES:
      return isSetSquareChatStatuses();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetJoinableSquareChatsResponse)
      return this.equals((GetJoinableSquareChatsResponse)that);
    return false;
  }

  public boolean equals(GetJoinableSquareChatsResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareChats = true && this.isSetSquareChats();
    boolean that_present_squareChats = true && that.isSetSquareChats();
    if (this_present_squareChats || that_present_squareChats) {
      if (!(this_present_squareChats && that_present_squareChats))
        return false;
      if (!this.squareChats.equals(that.squareChats))
        return false;
    }

    boolean this_present_continuationToken = true && this.isSetContinuationToken();
    boolean that_present_continuationToken = true && that.isSetContinuationToken();
    if (this_present_continuationToken || that_present_continuationToken) {
      if (!(this_present_continuationToken && that_present_continuationToken))
        return false;
      if (!this.continuationToken.equals(that.continuationToken))
        return false;
    }

    boolean this_present_totalSquareChatCount = true;
    boolean that_present_totalSquareChatCount = true;
    if (this_present_totalSquareChatCount || that_present_totalSquareChatCount) {
      if (!(this_present_totalSquareChatCount && that_present_totalSquareChatCount))
        return false;
      if (this.totalSquareChatCount != that.totalSquareChatCount)
        return false;
    }

    boolean this_present_squareChatStatuses = true && this.isSetSquareChatStatuses();
    boolean that_present_squareChatStatuses = true && that.isSetSquareChatStatuses();
    if (this_present_squareChatStatuses || that_present_squareChatStatuses) {
      if (!(this_present_squareChatStatuses && that_present_squareChatStatuses))
        return false;
      if (!this.squareChatStatuses.equals(that.squareChatStatuses))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSquareChats()) ? 131071 : 524287);
    if (isSetSquareChats())
      hashCode = hashCode * 8191 + squareChats.hashCode();

    hashCode = hashCode * 8191 + ((isSetContinuationToken()) ? 131071 : 524287);
    if (isSetContinuationToken())
      hashCode = hashCode * 8191 + continuationToken.hashCode();

    hashCode = hashCode * 8191 + totalSquareChatCount;

    hashCode = hashCode * 8191 + ((isSetSquareChatStatuses()) ? 131071 : 524287);
    if (isSetSquareChatStatuses())
      hashCode = hashCode * 8191 + squareChatStatuses.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetJoinableSquareChatsResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSquareChats()).compareTo(other.isSetSquareChats());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChats()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChats, other.squareChats);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetContinuationToken()).compareTo(other.isSetContinuationToken());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContinuationToken()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.continuationToken, other.continuationToken);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetTotalSquareChatCount()).compareTo(other.isSetTotalSquareChatCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTotalSquareChatCount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.totalSquareChatCount, other.totalSquareChatCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSquareChatStatuses()).compareTo(other.isSetSquareChatStatuses());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareChatStatuses()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareChatStatuses, other.squareChatStatuses);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetJoinableSquareChatsResponse(");
    boolean first = true;

    sb.append("squareChats:");
    if (this.squareChats == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChats);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("continuationToken:");
    if (this.continuationToken == null) {
      sb.append("null");
    } else {
      sb.append(this.continuationToken);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("totalSquareChatCount:");
    sb.append(this.totalSquareChatCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("squareChatStatuses:");
    if (this.squareChatStatuses == null) {
      sb.append("null");
    } else {
      sb.append(this.squareChatStatuses);
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

  private static class GetJoinableSquareChatsResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetJoinableSquareChatsResponseStandardScheme getScheme() {
      return new GetJoinableSquareChatsResponseStandardScheme();
    }
  }

  private static class GetJoinableSquareChatsResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetJoinableSquareChatsResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetJoinableSquareChatsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_CHATS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list816 = iprot.readListBegin();
                struct.squareChats = new java.util.ArrayList<SquareChat>(_list816.size);
                SquareChat _elem817;
                for (int _i818 = 0; _i818 < _list816.size; ++_i818)
                {
                  _elem817 = new SquareChat();
                  _elem817.read(iprot);
                  struct.squareChats.add(_elem817);
                }
                iprot.readListEnd();
              }
              struct.setSquareChatsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONTINUATION_TOKEN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.continuationToken = iprot.readString();
              struct.setContinuationTokenIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TOTAL_SQUARE_CHAT_COUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.totalSquareChatCount = iprot.readI32();
              struct.setTotalSquareChatCountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SQUARE_CHAT_STATUSES
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map819 = iprot.readMapBegin();
                struct.squareChatStatuses = new java.util.HashMap<java.lang.String,SquareChatStatus>(2*_map819.size);
                java.lang.String _key820;
                SquareChatStatus _val821;
                for (int _i822 = 0; _i822 < _map819.size; ++_i822)
                {
                  _key820 = iprot.readString();
                  _val821 = new SquareChatStatus();
                  _val821.read(iprot);
                  struct.squareChatStatuses.put(_key820, _val821);
                }
                iprot.readMapEnd();
              }
              struct.setSquareChatStatusesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetJoinableSquareChatsResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareChats != null) {
        oprot.writeFieldBegin(SQUARE_CHATS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.squareChats.size()));
          for (SquareChat _iter823 : struct.squareChats)
          {
            _iter823.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.continuationToken != null) {
        oprot.writeFieldBegin(CONTINUATION_TOKEN_FIELD_DESC);
        oprot.writeString(struct.continuationToken);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(TOTAL_SQUARE_CHAT_COUNT_FIELD_DESC);
      oprot.writeI32(struct.totalSquareChatCount);
      oprot.writeFieldEnd();
      if (struct.squareChatStatuses != null) {
        oprot.writeFieldBegin(SQUARE_CHAT_STATUSES_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.squareChatStatuses.size()));
          for (java.util.Map.Entry<java.lang.String, SquareChatStatus> _iter824 : struct.squareChatStatuses.entrySet())
          {
            oprot.writeString(_iter824.getKey());
            _iter824.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetJoinableSquareChatsResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetJoinableSquareChatsResponseTupleScheme getScheme() {
      return new GetJoinableSquareChatsResponseTupleScheme();
    }
  }

  private static class GetJoinableSquareChatsResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetJoinableSquareChatsResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetJoinableSquareChatsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareChats()) {
        optionals.set(0);
      }
      if (struct.isSetContinuationToken()) {
        optionals.set(1);
      }
      if (struct.isSetTotalSquareChatCount()) {
        optionals.set(2);
      }
      if (struct.isSetSquareChatStatuses()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetSquareChats()) {
        {
          oprot.writeI32(struct.squareChats.size());
          for (SquareChat _iter825 : struct.squareChats)
          {
            _iter825.write(oprot);
          }
        }
      }
      if (struct.isSetContinuationToken()) {
        oprot.writeString(struct.continuationToken);
      }
      if (struct.isSetTotalSquareChatCount()) {
        oprot.writeI32(struct.totalSquareChatCount);
      }
      if (struct.isSetSquareChatStatuses()) {
        {
          oprot.writeI32(struct.squareChatStatuses.size());
          for (java.util.Map.Entry<java.lang.String, SquareChatStatus> _iter826 : struct.squareChatStatuses.entrySet())
          {
            oprot.writeString(_iter826.getKey());
            _iter826.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetJoinableSquareChatsResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list827 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.squareChats = new java.util.ArrayList<SquareChat>(_list827.size);
          SquareChat _elem828;
          for (int _i829 = 0; _i829 < _list827.size; ++_i829)
          {
            _elem828 = new SquareChat();
            _elem828.read(iprot);
            struct.squareChats.add(_elem828);
          }
        }
        struct.setSquareChatsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.continuationToken = iprot.readString();
        struct.setContinuationTokenIsSet(true);
      }
      if (incoming.get(2)) {
        struct.totalSquareChatCount = iprot.readI32();
        struct.setTotalSquareChatCountIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map830 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.squareChatStatuses = new java.util.HashMap<java.lang.String,SquareChatStatus>(2*_map830.size);
          java.lang.String _key831;
          SquareChatStatus _val832;
          for (int _i833 = 0; _i833 < _map830.size; ++_i833)
          {
            _key831 = iprot.readString();
            _val832 = new SquareChatStatus();
            _val832.read(iprot);
            struct.squareChatStatuses.put(_key831, _val832);
          }
        }
        struct.setSquareChatStatusesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

