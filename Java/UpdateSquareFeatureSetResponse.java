/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class UpdateSquareFeatureSetResponse implements org.apache.thrift.TBase<UpdateSquareFeatureSetResponse, UpdateSquareFeatureSetResponse._Fields>, java.io.Serializable, Cloneable, Comparable<UpdateSquareFeatureSetResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateSquareFeatureSetResponse");

  private static final org.apache.thrift.protocol.TField UPDATE_ATTRIBUTES_FIELD_DESC = new org.apache.thrift.protocol.TField("updateAttributes", org.apache.thrift.protocol.TType.SET, (short)1);
  private static final org.apache.thrift.protocol.TField SQUARE_FEATURE_SET_FIELD_DESC = new org.apache.thrift.protocol.TField("squareFeatureSet", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UpdateSquareFeatureSetResponseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UpdateSquareFeatureSetResponseTupleSchemeFactory();

  public java.util.Set<SquareFeatureSetAttribute> updateAttributes; // required
  public SquareFeatureSet squareFeatureSet; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UPDATE_ATTRIBUTES((short)1, "updateAttributes"),
    SQUARE_FEATURE_SET((short)2, "squareFeatureSet");

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
        case 1: // UPDATE_ATTRIBUTES
          return UPDATE_ATTRIBUTES;
        case 2: // SQUARE_FEATURE_SET
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
    tmpMap.put(_Fields.UPDATE_ATTRIBUTES, new org.apache.thrift.meta_data.FieldMetaData("updateAttributes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquareFeatureSetAttribute.class))));
    tmpMap.put(_Fields.SQUARE_FEATURE_SET, new org.apache.thrift.meta_data.FieldMetaData("squareFeatureSet", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SquareFeatureSet.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateSquareFeatureSetResponse.class, metaDataMap);
  }

  public UpdateSquareFeatureSetResponse() {
  }

  public UpdateSquareFeatureSetResponse(
    java.util.Set<SquareFeatureSetAttribute> updateAttributes,
    SquareFeatureSet squareFeatureSet)
  {
    this();
    this.updateAttributes = updateAttributes;
    this.squareFeatureSet = squareFeatureSet;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateSquareFeatureSetResponse(UpdateSquareFeatureSetResponse other) {
    if (other.isSetUpdateAttributes()) {
      java.util.Set<SquareFeatureSetAttribute> __this__updateAttributes = java.util.EnumSet.noneOf(SquareFeatureSetAttribute.class);
      for (SquareFeatureSetAttribute other_element : other.updateAttributes) {
        __this__updateAttributes.add(other_element);
      }
      this.updateAttributes = __this__updateAttributes;
    }
    if (other.isSetSquareFeatureSet()) {
      this.squareFeatureSet = new SquareFeatureSet(other.squareFeatureSet);
    }
  }

  public UpdateSquareFeatureSetResponse deepCopy() {
    return new UpdateSquareFeatureSetResponse(this);
  }

  @Override
  public void clear() {
    this.updateAttributes = null;
    this.squareFeatureSet = null;
  }

  public int getUpdateAttributesSize() {
    return (this.updateAttributes == null) ? 0 : this.updateAttributes.size();
  }

  public java.util.Iterator<SquareFeatureSetAttribute> getUpdateAttributesIterator() {
    return (this.updateAttributes == null) ? null : this.updateAttributes.iterator();
  }

  public void addToUpdateAttributes(SquareFeatureSetAttribute elem) {
    if (this.updateAttributes == null) {
      this.updateAttributes = java.util.EnumSet.noneOf(SquareFeatureSetAttribute.class);
    }
    this.updateAttributes.add(elem);
  }

  public java.util.Set<SquareFeatureSetAttribute> getUpdateAttributes() {
    return this.updateAttributes;
  }

  public UpdateSquareFeatureSetResponse setUpdateAttributes(java.util.Set<SquareFeatureSetAttribute> updateAttributes) {
    this.updateAttributes = updateAttributes;
    return this;
  }

  public void unsetUpdateAttributes() {
    this.updateAttributes = null;
  }

  /** Returns true if field updateAttributes is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdateAttributes() {
    return this.updateAttributes != null;
  }

  public void setUpdateAttributesIsSet(boolean value) {
    if (!value) {
      this.updateAttributes = null;
    }
  }

  public SquareFeatureSet getSquareFeatureSet() {
    return this.squareFeatureSet;
  }

  public UpdateSquareFeatureSetResponse setSquareFeatureSet(SquareFeatureSet squareFeatureSet) {
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
    case UPDATE_ATTRIBUTES:
      if (value == null) {
        unsetUpdateAttributes();
      } else {
        setUpdateAttributes((java.util.Set<SquareFeatureSetAttribute>)value);
      }
      break;

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
    case UPDATE_ATTRIBUTES:
      return getUpdateAttributes();

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
    case UPDATE_ATTRIBUTES:
      return isSetUpdateAttributes();
    case SQUARE_FEATURE_SET:
      return isSetSquareFeatureSet();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateSquareFeatureSetResponse)
      return this.equals((UpdateSquareFeatureSetResponse)that);
    return false;
  }

  public boolean equals(UpdateSquareFeatureSetResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_updateAttributes = true && this.isSetUpdateAttributes();
    boolean that_present_updateAttributes = true && that.isSetUpdateAttributes();
    if (this_present_updateAttributes || that_present_updateAttributes) {
      if (!(this_present_updateAttributes && that_present_updateAttributes))
        return false;
      if (!this.updateAttributes.equals(that.updateAttributes))
        return false;
    }

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

    hashCode = hashCode * 8191 + ((isSetUpdateAttributes()) ? 131071 : 524287);
    if (isSetUpdateAttributes())
      hashCode = hashCode * 8191 + updateAttributes.hashCode();

    hashCode = hashCode * 8191 + ((isSetSquareFeatureSet()) ? 131071 : 524287);
    if (isSetSquareFeatureSet())
      hashCode = hashCode * 8191 + squareFeatureSet.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UpdateSquareFeatureSetResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUpdateAttributes()).compareTo(other.isSetUpdateAttributes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdateAttributes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updateAttributes, other.updateAttributes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSquareFeatureSetResponse(");
    boolean first = true;

    sb.append("updateAttributes:");
    if (this.updateAttributes == null) {
      sb.append("null");
    } else {
      sb.append(this.updateAttributes);
    }
    first = false;
    if (!first) sb.append(", ");
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

  private static class UpdateSquareFeatureSetResponseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateSquareFeatureSetResponseStandardScheme getScheme() {
      return new UpdateSquareFeatureSetResponseStandardScheme();
    }
  }

  private static class UpdateSquareFeatureSetResponseStandardScheme extends org.apache.thrift.scheme.StandardScheme<UpdateSquareFeatureSetResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UpdateSquareFeatureSetResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // UPDATE_ATTRIBUTES
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set1002 = iprot.readSetBegin();
                struct.updateAttributes = java.util.EnumSet.noneOf(SquareFeatureSetAttribute.class);
                SquareFeatureSetAttribute _elem1003;
                for (int _i1004 = 0; _i1004 < _set1002.size; ++_i1004)
                {
                  _elem1003 = SquareFeatureSetAttribute.findByValue(iprot.readI32());
                  if (_elem1003 != null)
                  {
                    struct.updateAttributes.add(_elem1003);
                  }
                }
                iprot.readSetEnd();
              }
              struct.setUpdateAttributesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SQUARE_FEATURE_SET
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UpdateSquareFeatureSetResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.updateAttributes != null) {
        oprot.writeFieldBegin(UPDATE_ATTRIBUTES_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.updateAttributes.size()));
          for (SquareFeatureSetAttribute _iter1005 : struct.updateAttributes)
          {
            oprot.writeI32(_iter1005.getValue());
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.squareFeatureSet != null) {
        oprot.writeFieldBegin(SQUARE_FEATURE_SET_FIELD_DESC);
        struct.squareFeatureSet.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UpdateSquareFeatureSetResponseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateSquareFeatureSetResponseTupleScheme getScheme() {
      return new UpdateSquareFeatureSetResponseTupleScheme();
    }
  }

  private static class UpdateSquareFeatureSetResponseTupleScheme extends org.apache.thrift.scheme.TupleScheme<UpdateSquareFeatureSetResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UpdateSquareFeatureSetResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUpdateAttributes()) {
        optionals.set(0);
      }
      if (struct.isSetSquareFeatureSet()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUpdateAttributes()) {
        {
          oprot.writeI32(struct.updateAttributes.size());
          for (SquareFeatureSetAttribute _iter1006 : struct.updateAttributes)
          {
            oprot.writeI32(_iter1006.getValue());
          }
        }
      }
      if (struct.isSetSquareFeatureSet()) {
        struct.squareFeatureSet.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UpdateSquareFeatureSetResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set1007 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.updateAttributes = java.util.EnumSet.noneOf(SquareFeatureSetAttribute.class);
          SquareFeatureSetAttribute _elem1008;
          for (int _i1009 = 0; _i1009 < _set1007.size; ++_i1009)
          {
            _elem1008 = SquareFeatureSetAttribute.findByValue(iprot.readI32());
            if (_elem1008 != null)
            {
              struct.updateAttributes.add(_elem1008);
            }
          }
        }
        struct.setUpdateAttributesIsSet(true);
      }
      if (incoming.get(1)) {
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

