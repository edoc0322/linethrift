/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class GetSquareFeatureSetResponse implements org.apache.thrift.TBase<GetSquareFeatureSetResponse, GetSquareFeatureSetResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetSquareFeatureSetResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetSquareFeatureSetResponse");

  private static final org.apache.thrift.protocol.TField SQUARE_FEATURE_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("squareFeatureSet", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new GetSquareFeatureSetResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new GetSquareFeatureSetResponseTupleSchemeFactory();

  public SquareFeatureSet squareFeatureSet; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SQUARE_FEATURE_SET((short)1, "squareFeatureSet");

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
        case 1: // SQUARE_FEATURE_SET
          return SQUARE_FEATURE_SET;
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
    tmpMap.put(_Fields.SQUARE_FEATURE_SET, new org.apache.thrift.meta_data.FieldMetaData("squareFeatureSet", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareFeatureSet.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetSquareFeatureSetResponse.class, metaDataMap);
  }

  public GetSquareFeatureSetResponse() {
  }

  public GetSquareFeatureSetResponse(
    SquareFeatureSet squareFeatureSet)
  {
    this();
    this.squareFeatureSet = squareFeatureSet;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetSquareFeatureSetResponse(GetSquareFeatureSetResponse other) {
    if (other.isSetSquareFeatureSet()) {
      this.squareFeatureSet = new SquareFeatureSet(other.squareFeatureSet);
    }
  }

  public GetSquareFeatureSetResponse deepCopy() {
    return new GetSquareFeatureSetResponse(this);
  }

  @Override
  public void clear() {
    this.squareFeatureSet = null;
  }

  public SquareFeatureSet getSquareFeatureSet() {
    return this.squareFeatureSet;
  }

  public GetSquareFeatureSetResponse setSquareFeatureSet(SquareFeatureSet squareFeatureSet) {
    this.squareFeatureSet = squareFeatureSet;
    return this;
  }

  public void unsetSquareFeatureSet() {
    this.squareFeatureSet = null;
  }

  /** Returns true if field squareFeatureSet is set (has been assigned a value) and false otherwise */
  public boolean isSetSquareFeatureSet() {
    return this.squareFeatureSet != null;
  }

  public void setSquareFeatureSetIsSet(boolean value) {
    if (!value) {
      this.squareFeatureSet = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SQUARE_FEATURE_SET:
      if (value == null) {
        unsetSquareFeatureSet();
      } else {
        setSquareFeatureSet((SquareFeatureSet)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SQUARE_FEATURE_SET:
      return getSquareFeatureSet();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SQUARE_FEATURE_SET:
      return isSetSquareFeatureSet();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof GetSquareFeatureSetResponse)
      return this.equals((GetSquareFeatureSetResponse)that);
    return false;
  }

  public boolean equals(GetSquareFeatureSetResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_squareFeatureSet = true && this.isSetSquareFeatureSet();
    boolean that_present_squareFeatureSet = true && that.isSetSquareFeatureSet();
    if (this_present_squareFeatureSet || that_present_squareFeatureSet) {
      if (!(this_present_squareFeatureSet && that_present_squareFeatureSet))
        return false;
      if (!this.squareFeatureSet.equals(that.squareFeatureSet))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSquareFeatureSet()) ? 131071 : 524287);
    if (isSetSquareFeatureSet())
      hashCode = hashCode * 8191 + squareFeatureSet.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(GetSquareFeatureSetResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSquareFeatureSet()).compareTo(other.isSetSquareFeatureSet());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquareFeatureSet()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.squareFeatureSet, other.squareFeatureSet);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("GetSquareFeatureSetResponse(");
    boolean first = true;

    sb.append("squareFeatureSet:");
    if (this.squareFeatureSet == null) {
      sb.append("null");
    } else {
      sb.append(this.squareFeatureSet);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (squareFeatureSet != null) {
      squareFeatureSet.validate();
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

  private static class GetSquareFeatureSetResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSquareFeatureSetResponseStandardScheme getScheme() {
      return new GetSquareFeatureSetResponseStandardScheme();
    }
  }

  private static class GetSquareFeatureSetResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<GetSquareFeatureSetResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetSquareFeatureSetResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SQUARE_FEATURE_SET
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.squareFeatureSet = new SquareFeatureSet();
              struct.squareFeatureSet.read(iprot);
              struct.setSquareFeatureSetIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetSquareFeatureSetResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.squareFeatureSet != null) {
        oprot.writeFieldBegin(SQUARE_FEATURE_SET_FIELD_DESC);
        struct.squareFeatureSet.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetSquareFeatureSetResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public GetSquareFeatureSetResponseTupleScheme getScheme() {
      return new GetSquareFeatureSetResponseTupleScheme();
    }
  }

  private static class GetSquareFeatureSetResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<GetSquareFeatureSetResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetSquareFeatureSetResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSquareFeatureSet()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSquareFeatureSet()) {
        struct.squareFeatureSet.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetSquareFeatureSetResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.squareFeatureSet = new SquareFeatureSet();
        struct.squareFeatureSet.read(iprot);
        struct.setSquareFeatureSetIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

