/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class SuggestItemDictionaryRevision implements org.apache.thrift.TBase<SuggestItemDictionaryRevision, SuggestItemDictionaryRevision._Fields>, java.io.Serializable, Cloneable, Comparable<SuggestItemDictionaryRevision> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SuggestItemDictionaryRevision");

  private static final org.apache.thrift.protocol.TField REVISION_FIELD_DESC = new org.apache.thrift.protocol.TField("revision", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField SCHEME_FIELD_DESC = new org.apache.thrift.protocol.TField("scheme", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SuggestItemDictionaryRevisionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SuggestItemDictionaryRevisionTupleSchemeFactory();

  public long revision; // required
  public java.lang.String scheme; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    REVISION((short)1, "revision"),
    SCHEME((short)2, "scheme");

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
        case 1: // REVISION
          return REVISION;
        case 2: // SCHEME
          return SCHEME;
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
  private static final int __REVISION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.REVISION, new org.apache.thrift.meta_data.FieldMetaData("revision", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.SCHEME, new org.apache.thrift.meta_data.FieldMetaData("scheme", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SuggestItemDictionaryRevision.class, metaDataMap);
  }

  public SuggestItemDictionaryRevision() {
  }

  public SuggestItemDictionaryRevision(
    long revision,
    java.lang.String scheme)
  {
    this();
    this.revision = revision;
    setRevisionIsSet(true);
    this.scheme = scheme;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SuggestItemDictionaryRevision(SuggestItemDictionaryRevision other) {
    __isset_bitfield = other.__isset_bitfield;
    this.revision = other.revision;
    if (other.isSetScheme()) {
      this.scheme = other.scheme;
    }
  }

  public SuggestItemDictionaryRevision deepCopy() {
    return new SuggestItemDictionaryRevision(this);
  }

  @Override
  public void clear() {
    setRevisionIsSet(false);
    this.revision = 0;
    this.scheme = null;
  }

  public long getRevision() {
    return this.revision;
  }

  public SuggestItemDictionaryRevision setRevision(long revision) {
    this.revision = revision;
    setRevisionIsSet(true);
    return this;
  }

  public void unsetRevision() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  /** Returns true if field revision is set (has been assigned a value) and false otherwise */
  public boolean isSetRevision() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REVISION_ISSET_ID);
  }

  public void setRevisionIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REVISION_ISSET_ID, value);
  }

  public java.lang.String getScheme() {
    return this.scheme;
  }

  public SuggestItemDictionaryRevision setScheme(java.lang.String scheme) {
    this.scheme = scheme;
    return this;
  }

  public void unsetScheme() {
    this.scheme = null;
  }

  /** Returns true if field scheme is set (has been assigned a value) and false otherwise */
  public boolean isSetScheme() {
    return this.scheme != null;
  }

  public void setSchemeIsSet(boolean value) {
    if (!value) {
      this.scheme = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case REVISION:
      if (value == null) {
        unsetRevision();
      } else {
        setRevision((java.lang.Long)value);
      }
      break;

    case SCHEME:
      if (value == null) {
        unsetScheme();
      } else {
        setScheme((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case REVISION:
      return getRevision();

    case SCHEME:
      return getScheme();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case REVISION:
      return isSetRevision();
    case SCHEME:
      return isSetScheme();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SuggestItemDictionaryRevision)
      return this.equals((SuggestItemDictionaryRevision)that);
    return false;
  }

  public boolean equals(SuggestItemDictionaryRevision that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_revision = true;
    boolean that_present_revision = true;
    if (this_present_revision || that_present_revision) {
      if (!(this_present_revision && that_present_revision))
        return false;
      if (this.revision != that.revision)
        return false;
    }

    boolean this_present_scheme = true && this.isSetScheme();
    boolean that_present_scheme = true && that.isSetScheme();
    if (this_present_scheme || that_present_scheme) {
      if (!(this_present_scheme && that_present_scheme))
        return false;
      if (!this.scheme.equals(that.scheme))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(revision);

    hashCode = hashCode * 8191 + ((isSetScheme()) ? 131071 : 524287);
    if (isSetScheme())
      hashCode = hashCode * 8191 + scheme.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SuggestItemDictionaryRevision other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetRevision()).compareTo(other.isSetRevision());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRevision()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.revision, other.revision);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetScheme()).compareTo(other.isSetScheme());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetScheme()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.scheme, other.scheme);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SuggestItemDictionaryRevision(");
    boolean first = true;

    sb.append("revision:");
    sb.append(this.revision);
    first = false;
    if (!first) sb.append(", ");
    sb.append("scheme:");
    if (this.scheme == null) {
      sb.append("null");
    } else {
      sb.append(this.scheme);
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

  private static class SuggestItemDictionaryRevisionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SuggestItemDictionaryRevisionStandardScheme getScheme() {
      return new SuggestItemDictionaryRevisionStandardScheme();
    }
  }

  private static class SuggestItemDictionaryRevisionStandardScheme extends org.apache.thrift.scheme.StandardScheme<SuggestItemDictionaryRevision> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SuggestItemDictionaryRevision struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // REVISION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.revision = iprot.readI64();
              struct.setRevisionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SCHEME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.scheme = iprot.readString();
              struct.setSchemeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SuggestItemDictionaryRevision struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(REVISION_FIELD_DESC);
      oprot.writeI64(struct.revision);
      oprot.writeFieldEnd();
      if (struct.scheme != null) {
        oprot.writeFieldBegin(SCHEME_FIELD_DESC);
        oprot.writeString(struct.scheme);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SuggestItemDictionaryRevisionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SuggestItemDictionaryRevisionTupleScheme getScheme() {
      return new SuggestItemDictionaryRevisionTupleScheme();
    }
  }

  private static class SuggestItemDictionaryRevisionTupleScheme extends org.apache.thrift.scheme.TupleScheme<SuggestItemDictionaryRevision> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SuggestItemDictionaryRevision struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetRevision()) {
        optionals.set(0);
      }
      if (struct.isSetScheme()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetRevision()) {
        oprot.writeI64(struct.revision);
      }
      if (struct.isSetScheme()) {
        oprot.writeString(struct.scheme);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SuggestItemDictionaryRevision struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.revision = iprot.readI64();
        struct.setRevisionIsSet(true);
      }
      if (incoming.get(1)) {
        struct.scheme = iprot.readString();
        struct.setSchemeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}
