/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class SnsFriendModification implements org.apache.thrift.TBase<SnsFriendModification, SnsFriendModification._Fields>, java.io.Serializable, Cloneable, Comparable<SnsFriendModification> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SnsFriendModification");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField SNS_FRIEND_FIELD_DESC = new org.apache.thrift.protocol.TField("snsFriend", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SnsFriendModificationStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SnsFriendModificationTupleSchemeFactory();

  /**
   * 
   * @see ModificationType
   */
  public ModificationType type; // required
  public SnsFriend snsFriend; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ModificationType
     */
    TYPE((short)1, "type"),
    SNS_FRIEND((short)2, "snsFriend");

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
        case 1: // TYPE
          return TYPE;
        case 2: // SNS_FRIEND
          return SNS_FRIEND;
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
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ModificationType.class)));
    tmpMap.put(_Fields.SNS_FRIEND, new org.apache.thrift.meta_data.FieldMetaData("snsFriend", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SnsFriend.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SnsFriendModification.class, metaDataMap);
  }

  public SnsFriendModification() {
  }

  public SnsFriendModification(
    ModificationType type,
    SnsFriend snsFriend)
  {
    this();
    this.type = type;
    this.snsFriend = snsFriend;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SnsFriendModification(SnsFriendModification other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetSnsFriend()) {
      this.snsFriend = new SnsFriend(other.snsFriend);
    }
  }

  public SnsFriendModification deepCopy() {
    return new SnsFriendModification(this);
  }

  @Override
  public void clear() {
    this.type = null;
    this.snsFriend = null;
  }

  /**
   * 
   * @see ModificationType
   */
  public ModificationType getType() {
    return this.type;
  }

  /**
   * 
   * @see ModificationType
   */
  public SnsFriendModification setType(ModificationType type) {
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

  public SnsFriend getSnsFriend() {
    return this.snsFriend;
  }

  public SnsFriendModification setSnsFriend(SnsFriend snsFriend) {
    this.snsFriend = snsFriend;
    return this;
  }

  public void unsetSnsFriend() {
    this.snsFriend = null;
  }

  /** Returns true if field snsFriend is set (has been assigned a value) and false otherwise */
  public boolean isSetSnsFriend() {
    return this.snsFriend != null;
  }

  public void setSnsFriendIsSet(boolean value) {
    if (!value) {
      this.snsFriend = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((ModificationType)value);
      }
      break;

    case SNS_FRIEND:
      if (value == null) {
        unsetSnsFriend();
      } else {
        setSnsFriend((SnsFriend)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case SNS_FRIEND:
      return getSnsFriend();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case SNS_FRIEND:
      return isSetSnsFriend();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SnsFriendModification)
      return this.equals((SnsFriendModification)that);
    return false;
  }

  public boolean equals(SnsFriendModification that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_snsFriend = true && this.isSetSnsFriend();
    boolean that_present_snsFriend = true && that.isSetSnsFriend();
    if (this_present_snsFriend || that_present_snsFriend) {
      if (!(this_present_snsFriend && that_present_snsFriend))
        return false;
      if (!this.snsFriend.equals(that.snsFriend))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetSnsFriend()) ? 131071 : 524287);
    if (isSetSnsFriend())
      hashCode = hashCode * 8191 + snsFriend.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SnsFriendModification other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

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
    lastComparison = java.lang.Boolean.valueOf(isSetSnsFriend()).compareTo(other.isSetSnsFriend());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSnsFriend()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.snsFriend, other.snsFriend);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SnsFriendModification(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("snsFriend:");
    if (this.snsFriend == null) {
      sb.append("null");
    } else {
      sb.append(this.snsFriend);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (snsFriend != null) {
      snsFriend.validate();
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

  private static class SnsFriendModificationStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SnsFriendModificationStandardScheme getScheme() {
      return new SnsFriendModificationStandardScheme();
    }
  }

  private static class SnsFriendModificationStandardScheme extends org.apache.thrift.scheme.StandardScheme<SnsFriendModification> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SnsFriendModification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = ModificationType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SNS_FRIEND
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.snsFriend = new SnsFriend();
              struct.snsFriend.read(iprot);
              struct.setSnsFriendIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SnsFriendModification struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.snsFriend != null) {
        oprot.writeFieldBegin(SNS_FRIEND_FIELD_DESC);
        struct.snsFriend.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SnsFriendModificationTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SnsFriendModificationTupleScheme getScheme() {
      return new SnsFriendModificationTupleScheme();
    }
  }

  private static class SnsFriendModificationTupleScheme extends org.apache.thrift.scheme.TupleScheme<SnsFriendModification> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SnsFriendModification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetSnsFriend()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetSnsFriend()) {
        struct.snsFriend.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SnsFriendModification struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.type = ModificationType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.snsFriend = new SnsFriend();
        struct.snsFriend.read(iprot);
        struct.setSnsFriendIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

