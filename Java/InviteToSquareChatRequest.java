/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class InviteToSquareChatRequest implements org.apache.thrift.TBase<InviteToSquareChatRequest, InviteToSquareChatRequest._Fields>, java.io.Serializable, Cloneable, Comparable<InviteToSquareChatRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("InviteToSquareChatRequest");

  private static final org.apache.thrift.protocol.TField INVITEE_MIDS_FIELD_DESC = new org.apache.thrift.protocol.TField("inviteeMids", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_CHAT_MID_FIELD_DESC = new org.apache.thrift.protocol.TField("squareChatMid", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new InviteToSquareChatRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new InviteToSquareChatRequestTupleSchemeFactory();

  public java.util.List<java.lang.String> inviteeMids; // required
  public java.lang.String squareChatMid; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INVITEE_MIDS((short)1, "inviteeMids"),
    SQUARE_CHAT_MID((short)2, "squareChatMid");

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
        case 1: // INVITEE_MIDS
          return INVITEE_MIDS;
        case 2: // SQUARE_CHAT_MID
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
    tmpMap.put(_Fields.INVITEE_MIDS, new org.apache.thrift.meta_data.FieldMetaData("inviteeMids", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.SQUARE_CHAT_MID, new org.apache.thrift.meta_data.FieldMetaData("squareChatMid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(InviteToSquareChatRequest.class, metaDataMap);
  }

  public InviteToSquareChatRequest() {
  }

  public InviteToSquareChatRequest(
    java.util.List<java.lang.String> inviteeMids,
    java.lang.String squareChatMid)
  {
    this();
    this.inviteeMids = inviteeMids;
    this.squareChatMid = squareChatMid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public InviteToSquareChatRequest(InviteToSquareChatRequest other) {
    if (other.isSetInviteeMids()) {
      java.util.List<java.lang.String> __this__inviteeMids = new java.util.ArrayList<java.lang.String>(other.inviteeMids);
      this.inviteeMids = __this__inviteeMids;
    }
    if (other.isSetSquareChatMid()) {
      this.squareChatMid = other.squareChatMid;
    }
  }

  public InviteToSquareChatRequest deepCopy() {
    return new InviteToSquareChatRequest(this);
  }

  @Override
  public void clear() {
    this.inviteeMids = null;
    this.squareChatMid = null;
  }

  public int getInviteeMidsSize() {
    return (this.inviteeMids == null) ? 0 : this.inviteeMids.size();
  }

  public java.util.Iterator<java.lang.String> getInviteeMidsIterator() {
    return (this.inviteeMids == null) ? null : this.inviteeMids.iterator();
  }

  public void addToInviteeMids(java.lang.String elem) {
    if (this.inviteeMids == null) {
      this.inviteeMids = new java.util.ArrayList<java.lang.String>();
    }
    this.inviteeMids.add(elem);
  }

  public java.util.List<java.lang.String> getInviteeMids() {
    return this.inviteeMids;
  }

  public InviteToSquareChatRequest setInviteeMids(java.util.List<java.lang.String> inviteeMids) {
    this.inviteeMids = inviteeMids;
    return this;
  }

  public void unsetInviteeMids() {
    this.inviteeMids = null;
  }

  /** Returns true if field inviteeMids is set (has been assigned a value) and false otherwise */
  public boolean isSetInviteeMids() {
    return this.inviteeMids != null;
  }

  public void setInviteeMidsIsSet(boolean value) {
    if (!value) {
      this.inviteeMids = null;
    }
  }

  public java.lang.String getSquareChatMid() {
    return this.squareChatMid;
  }

  public InviteToSquareChatRequest setSquareChatMid(java.lang.String squareChatMid) {
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
    case INVITEE_MIDS:
      if (value == null) {
        unsetInviteeMids();
      } else {
        setInviteeMids((java.util.List<java.lang.String>)value);
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
    case INVITEE_MIDS:
      return getInviteeMids();

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
    case INVITEE_MIDS:
      return isSetInviteeMids();
    case SQUARE_CHAT_MID:
      return isSetSquareChatMid();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof InviteToSquareChatRequest)
      return this.equals((InviteToSquareChatRequest)that);
    return false;
  }

  public boolean equals(InviteToSquareChatRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_inviteeMids = true && this.isSetInviteeMids();
    boolean that_present_inviteeMids = true && that.isSetInviteeMids();
    if (this_present_inviteeMids || that_present_inviteeMids) {
      if (!(this_present_inviteeMids && that_present_inviteeMids))
        return false;
      if (!this.inviteeMids.equals(that.inviteeMids))
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

    hashCode = hashCode * 8191 + ((isSetInviteeMids()) ? 131071 : 524287);
    if (isSetInviteeMids())
      hashCode = hashCode * 8191 + inviteeMids.hashCode();

    hashCode = hashCode * 8191 + ((isSetSquareChatMid()) ? 131071 : 524287);
    if (isSetSquareChatMid())
      hashCode = hashCode * 8191 + squareChatMid.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(InviteToSquareChatRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetInviteeMids()).compareTo(other.isSetInviteeMids());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInviteeMids()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.inviteeMids, other.inviteeMids);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("InviteToSquareChatRequest(");
    boolean first = true;

    sb.append("inviteeMids:");
    if (this.inviteeMids == null) {
      sb.append("null");
    } else {
      sb.append(this.inviteeMids);
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

  private static class InviteToSquareChatRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public InviteToSquareChatRequestStandardScheme getScheme() {
      return new InviteToSquareChatRequestStandardScheme();
    }
  }

  private static class InviteToSquareChatRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<InviteToSquareChatRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, InviteToSquareChatRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INVITEE_MIDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list890 = iprot.readListBegin();
                struct.inviteeMids = new java.util.ArrayList<java.lang.String>(_list890.size);
                java.lang.String _elem891;
                for (int _i892 = 0; _i892 < _list890.size; ++_i892)
                {
                  _elem891 = iprot.readString();
                  struct.inviteeMids.add(_elem891);
                }
                iprot.readListEnd();
              }
              struct.setInviteeMidsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SQUARE_CHAT_MID
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, InviteToSquareChatRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.inviteeMids != null) {
        oprot.writeFieldBegin(INVITEE_MIDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.inviteeMids.size()));
          for (java.lang.String _iter893 : struct.inviteeMids)
          {
            oprot.writeString(_iter893);
          }
          oprot.writeListEnd();
        }
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

  private static class InviteToSquareChatRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public InviteToSquareChatRequestTupleScheme getScheme() {
      return new InviteToSquareChatRequestTupleScheme();
    }
  }

  private static class InviteToSquareChatRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<InviteToSquareChatRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, InviteToSquareChatRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetInviteeMids()) {
        optionals.set(0);
      }
      if (struct.isSetSquareChatMid()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetInviteeMids()) {
        {
          oprot.writeI32(struct.inviteeMids.size());
          for (java.lang.String _iter894 : struct.inviteeMids)
          {
            oprot.writeString(_iter894);
          }
        }
      }
      if (struct.isSetSquareChatMid()) {
        oprot.writeString(struct.squareChatMid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, InviteToSquareChatRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list895 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.inviteeMids = new java.util.ArrayList<java.lang.String>(_list895.size);
          java.lang.String _elem896;
          for (int _i897 = 0; _i897 < _list895.size; ++_i897)
          {
            _elem896 = iprot.readString();
            struct.inviteeMids.add(_elem896);
          }
        }
        struct.setInviteeMidsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.squareChatMid = iprot.readString();
        struct.setSquareChatMidIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

