/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class SquareChatAnnouncement implements org.apache.thrift.TBase<SquareChatAnnouncement, SquareChatAnnouncement._Fields>, java.io.Serializable, Cloneable, Comparable<SquareChatAnnouncement> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareChatAnnouncement");

  private static final org.apache.thrift.protocol.TField ANNOUNCEMENT_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("announcementSeq", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField CONTENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("contents", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareChatAnnouncementStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareChatAnnouncementTupleSchemeFactory();

  public long announcementSeq; // required
  /**
   * 
   * @see SquareChatAnnouncementType
   */
  public SquareChatAnnouncementType type; // required
  public SquareChatAnnouncementContents contents; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ANNOUNCEMENT_SEQ((short)1, "announcementSeq"),
    /**
     * 
     * @see SquareChatAnnouncementType
     */
    TYPE((short)2, "type"),
    CONTENTS((short)3, "contents");

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
        case 1: // ANNOUNCEMENT_SEQ
          return ANNOUNCEMENT_SEQ;
        case 2: // TYPE
          return TYPE;
        case 3: // CONTENTS
          return CONTENTS;
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
  private static final int __ANNOUNCEMENTSEQ_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ANNOUNCEMENT_SEQ, new org.apache.thrift.meta_data.FieldMetaData("announcementSeq", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquareChatAnnouncementType.class)));
    tmpMap.put(_Fields.CONTENTS, new org.apache.thrift.meta_data.FieldMetaData("contents", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareChatAnnouncementContents.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareChatAnnouncement.class, metaDataMap);
  }

  public SquareChatAnnouncement() {
  }

  public SquareChatAnnouncement(
    long announcementSeq,
    SquareChatAnnouncementType type,
    SquareChatAnnouncementContents contents)
  {
    this();
    this.announcementSeq = announcementSeq;
    setAnnouncementSeqIsSet(true);
    this.type = type;
    this.contents = contents;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareChatAnnouncement(SquareChatAnnouncement other) {
    __isset_bitfield = other.__isset_bitfield;
    this.announcementSeq = other.announcementSeq;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetContents()) {
      this.contents = new SquareChatAnnouncementContents(other.contents);
    }
  }

  public SquareChatAnnouncement deepCopy() {
    return new SquareChatAnnouncement(this);
  }

  @Override
  public void clear() {
    setAnnouncementSeqIsSet(false);
    this.announcementSeq = 0;
    this.type = null;
    this.contents = null;
  }

  public long getAnnouncementSeq() {
    return this.announcementSeq;
  }

  public SquareChatAnnouncement setAnnouncementSeq(long announcementSeq) {
    this.announcementSeq = announcementSeq;
    setAnnouncementSeqIsSet(true);
    return this;
  }

  public void unsetAnnouncementSeq() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __ANNOUNCEMENTSEQ_ISSET_ID);
  }

  /** Returns true if field announcementSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetAnnouncementSeq() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __ANNOUNCEMENTSEQ_ISSET_ID);
  }

  public void setAnnouncementSeqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __ANNOUNCEMENTSEQ_ISSET_ID, value);
  }

  /**
   * 
   * @see SquareChatAnnouncementType
   */
  public SquareChatAnnouncementType getType() {
    return this.type;
  }

  /**
   * 
   * @see SquareChatAnnouncementType
   */
  public SquareChatAnnouncement setType(SquareChatAnnouncementType type) {
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

  public SquareChatAnnouncementContents getContents() {
    return this.contents;
  }

  public SquareChatAnnouncement setContents(SquareChatAnnouncementContents contents) {
    this.contents = contents;
    return this;
  }

  public void unsetContents() {
    this.contents = null;
  }

  /** Returns true if field contents is set (has been assigned a value) and false otherwise */
  public boolean isSetContents() {
    return this.contents != null;
  }

  public void setContentsIsSet(boolean value) {
    if (!value) {
      this.contents = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case ANNOUNCEMENT_SEQ:
      if (value == null) {
        unsetAnnouncementSeq();
      } else {
        setAnnouncementSeq((java.lang.Long)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((SquareChatAnnouncementType)value);
      }
      break;

    case CONTENTS:
      if (value == null) {
        unsetContents();
      } else {
        setContents((SquareChatAnnouncementContents)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ANNOUNCEMENT_SEQ:
      return getAnnouncementSeq();

    case TYPE:
      return getType();

    case CONTENTS:
      return getContents();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ANNOUNCEMENT_SEQ:
      return isSetAnnouncementSeq();
    case TYPE:
      return isSetType();
    case CONTENTS:
      return isSetContents();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareChatAnnouncement)
      return this.equals((SquareChatAnnouncement)that);
    return false;
  }

  public boolean equals(SquareChatAnnouncement that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_announcementSeq = true;
    boolean that_present_announcementSeq = true;
    if (this_present_announcementSeq || that_present_announcementSeq) {
      if (!(this_present_announcementSeq && that_present_announcementSeq))
        return false;
      if (this.announcementSeq != that.announcementSeq)
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

    boolean this_present_contents = true && this.isSetContents();
    boolean that_present_contents = true && that.isSetContents();
    if (this_present_contents || that_present_contents) {
      if (!(this_present_contents && that_present_contents))
        return false;
      if (!this.contents.equals(that.contents))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(announcementSeq);

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetContents()) ? 131071 : 524287);
    if (isSetContents())
      hashCode = hashCode * 8191 + contents.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SquareChatAnnouncement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAnnouncementSeq()).compareTo(other.isSetAnnouncementSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAnnouncementSeq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.announcementSeq, other.announcementSeq);
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
    lastComparison = java.lang.Boolean.valueOf(isSetContents()).compareTo(other.isSetContents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contents, other.contents);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareChatAnnouncement(");
    boolean first = true;

    sb.append("announcementSeq:");
    sb.append(this.announcementSeq);
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
    sb.append("contents:");
    if (this.contents == null) {
      sb.append("null");
    } else {
      sb.append(this.contents);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (contents != null) {
      contents.validate();
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

  private static class SquareChatAnnouncementStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareChatAnnouncementStandardScheme getScheme() {
      return new SquareChatAnnouncementStandardScheme();
    }
  }

  private static class SquareChatAnnouncementStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareChatAnnouncement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareChatAnnouncement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ANNOUNCEMENT_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.announcementSeq = iprot.readI64();
              struct.setAnnouncementSeqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = SquareChatAnnouncementType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.contents = new SquareChatAnnouncementContents();
              struct.contents.read(iprot);
              struct.setContentsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareChatAnnouncement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ANNOUNCEMENT_SEQ_FIELD_DESC);
      oprot.writeI64(struct.announcementSeq);
      oprot.writeFieldEnd();
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.contents != null) {
        oprot.writeFieldBegin(CONTENTS_FIELD_DESC);
        struct.contents.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareChatAnnouncementTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareChatAnnouncementTupleScheme getScheme() {
      return new SquareChatAnnouncementTupleScheme();
    }
  }

  private static class SquareChatAnnouncementTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareChatAnnouncement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareChatAnnouncement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAnnouncementSeq()) {
        optionals.set(0);
      }
      if (struct.isSetType()) {
        optionals.set(1);
      }
      if (struct.isSetContents()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetAnnouncementSeq()) {
        oprot.writeI64(struct.announcementSeq);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetContents()) {
        struct.contents.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareChatAnnouncement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.announcementSeq = iprot.readI64();
        struct.setAnnouncementSeqIsSet(true);
      }
      if (incoming.get(1)) {
        struct.type = SquareChatAnnouncementType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.contents = new SquareChatAnnouncementContents();
        struct.contents.read(iprot);
        struct.setContentsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

