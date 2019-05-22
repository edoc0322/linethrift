/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class SquareChatAnnouncementContents implements org.apache.thrift.TBase<SquareChatAnnouncementContents, SquareChatAnnouncementContents._Fields>, java.io.Serializable, Cloneable, Comparable<SquareChatAnnouncementContents> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SquareChatAnnouncementContents");

  private static final org.apache.thrift.protocol.TField TEXT_MESSAGE_ANNOUNCEMENT_CONTENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("textMessageAnnouncementContents", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SquareChatAnnouncementContentsStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SquareChatAnnouncementContentsTupleSchemeFactory();

  public TextMessageAnnouncementContents textMessageAnnouncementContents; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TEXT_MESSAGE_ANNOUNCEMENT_CONTENTS((short)1, "textMessageAnnouncementContents");

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
        case 1: // TEXT_MESSAGE_ANNOUNCEMENT_CONTENTS
          return TEXT_MESSAGE_ANNOUNCEMENT_CONTENTS;
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
    tmpMap.put(_Fields.TEXT_MESSAGE_ANNOUNCEMENT_CONTENTS, new org.apache.thrift.meta_data.FieldMetaData("textMessageAnnouncementContents", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TextMessageAnnouncementContents.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SquareChatAnnouncementContents.class, metaDataMap);
  }

  public SquareChatAnnouncementContents() {
  }

  public SquareChatAnnouncementContents(
    TextMessageAnnouncementContents textMessageAnnouncementContents)
  {
    this();
    this.textMessageAnnouncementContents = textMessageAnnouncementContents;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SquareChatAnnouncementContents(SquareChatAnnouncementContents other) {
    if (other.isSetTextMessageAnnouncementContents()) {
      this.textMessageAnnouncementContents = new TextMessageAnnouncementContents(other.textMessageAnnouncementContents);
    }
  }

  public SquareChatAnnouncementContents deepCopy() {
    return new SquareChatAnnouncementContents(this);
  }

  @Override
  public void clear() {
    this.textMessageAnnouncementContents = null;
  }

  public TextMessageAnnouncementContents getTextMessageAnnouncementContents() {
    return this.textMessageAnnouncementContents;
  }

  public SquareChatAnnouncementContents setTextMessageAnnouncementContents(TextMessageAnnouncementContents textMessageAnnouncementContents) {
    this.textMessageAnnouncementContents = textMessageAnnouncementContents;
    return this;
  }

  public void unsetTextMessageAnnouncementContents() {
    this.textMessageAnnouncementContents = null;
  }

  /** Returns true if field textMessageAnnouncementContents is set (has been assigned a value) and false otherwise */
  public boolean isSetTextMessageAnnouncementContents() {
    return this.textMessageAnnouncementContents != null;
  }

  public void setTextMessageAnnouncementContentsIsSet(boolean value) {
    if (!value) {
      this.textMessageAnnouncementContents = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TEXT_MESSAGE_ANNOUNCEMENT_CONTENTS:
      if (value == null) {
        unsetTextMessageAnnouncementContents();
      } else {
        setTextMessageAnnouncementContents((TextMessageAnnouncementContents)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TEXT_MESSAGE_ANNOUNCEMENT_CONTENTS:
      return getTextMessageAnnouncementContents();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TEXT_MESSAGE_ANNOUNCEMENT_CONTENTS:
      return isSetTextMessageAnnouncementContents();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SquareChatAnnouncementContents)
      return this.equals((SquareChatAnnouncementContents)that);
    return false;
  }

  public boolean equals(SquareChatAnnouncementContents that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_textMessageAnnouncementContents = true && this.isSetTextMessageAnnouncementContents();
    boolean that_present_textMessageAnnouncementContents = true && that.isSetTextMessageAnnouncementContents();
    if (this_present_textMessageAnnouncementContents || that_present_textMessageAnnouncementContents) {
      if (!(this_present_textMessageAnnouncementContents && that_present_textMessageAnnouncementContents))
        return false;
      if (!this.textMessageAnnouncementContents.equals(that.textMessageAnnouncementContents))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTextMessageAnnouncementContents()) ? 131071 : 524287);
    if (isSetTextMessageAnnouncementContents())
      hashCode = hashCode * 8191 + textMessageAnnouncementContents.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SquareChatAnnouncementContents other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetTextMessageAnnouncementContents()).compareTo(other.isSetTextMessageAnnouncementContents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTextMessageAnnouncementContents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.textMessageAnnouncementContents, other.textMessageAnnouncementContents);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SquareChatAnnouncementContents(");
    boolean first = true;

    sb.append("textMessageAnnouncementContents:");
    if (this.textMessageAnnouncementContents == null) {
      sb.append("null");
    } else {
      sb.append(this.textMessageAnnouncementContents);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (textMessageAnnouncementContents != null) {
      textMessageAnnouncementContents.validate();
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

  private static class SquareChatAnnouncementContentsStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareChatAnnouncementContentsStandardScheme getScheme() {
      return new SquareChatAnnouncementContentsStandardScheme();
    }
  }

  private static class SquareChatAnnouncementContentsStandardScheme extends org.apache.thrift.scheme.StandardScheme<SquareChatAnnouncementContents> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SquareChatAnnouncementContents struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TEXT_MESSAGE_ANNOUNCEMENT_CONTENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.textMessageAnnouncementContents = new TextMessageAnnouncementContents();
              struct.textMessageAnnouncementContents.read(iprot);
              struct.setTextMessageAnnouncementContentsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SquareChatAnnouncementContents struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.textMessageAnnouncementContents != null) {
        oprot.writeFieldBegin(TEXT_MESSAGE_ANNOUNCEMENT_CONTENTS_FIELD_DESC);
        struct.textMessageAnnouncementContents.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SquareChatAnnouncementContentsTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SquareChatAnnouncementContentsTupleScheme getScheme() {
      return new SquareChatAnnouncementContentsTupleScheme();
    }
  }

  private static class SquareChatAnnouncementContentsTupleScheme extends org.apache.thrift.scheme.TupleScheme<SquareChatAnnouncementContents> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SquareChatAnnouncementContents struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTextMessageAnnouncementContents()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetTextMessageAnnouncementContents()) {
        struct.textMessageAnnouncementContents.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SquareChatAnnouncementContents struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.textMessageAnnouncementContents = new TextMessageAnnouncementContents();
        struct.textMessageAnnouncementContents.read(iprot);
        struct.setTextMessageAnnouncementContentsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

