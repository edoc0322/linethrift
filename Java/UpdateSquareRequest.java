/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2019-09-28")
public class UpdateSquareRequest implements org.apache.thrift.TBase<UpdateSquareRequest, UpdateSquareRequest._Fields>, java.io.Serializable, Cloneable, Comparable<UpdateSquareRequest> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("UpdateSquareRequest");

  private static final org.apache.thrift.protocol.TField UPDATED_ATTRS_FIELD_DESC = new org.apache.thrift.protocol.TField("updatedAttrs", org.apache.thrift.protocol.TType.SET, (short)2);
  private static final org.apache.thrift.protocol.TField SQUARE_FIELD_DESC = new org.apache.thrift.protocol.TField("square", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new UpdateSquareRequestStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new UpdateSquareRequestTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.util.Set<SquareAttribute> updatedAttrs; // required
  public @org.apache.thrift.annotation.Nullable Square square; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    UPDATED_ATTRS((short)2, "updatedAttrs"),
    SQUARE((short)3, "square");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 2: // UPDATED_ATTRS
          return UPDATED_ATTRS;
        case 3: // SQUARE
          return SQUARE;
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
    @org.apache.thrift.annotation.Nullable
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
    tmpMap.put(_Fields.UPDATED_ATTRS, new org.apache.thrift.meta_data.FieldMetaData("updatedAttrs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SquareAttribute.class))));
    tmpMap.put(_Fields.SQUARE, new org.apache.thrift.meta_data.FieldMetaData("square", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Square.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(UpdateSquareRequest.class, metaDataMap);
  }

  public UpdateSquareRequest() {
  }

  public UpdateSquareRequest(
    java.util.Set<SquareAttribute> updatedAttrs,
    Square square)
  {
    this();
    this.updatedAttrs = updatedAttrs;
    this.square = square;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public UpdateSquareRequest(UpdateSquareRequest other) {
    if (other.isSetUpdatedAttrs()) {
      java.util.Set<SquareAttribute> __this__updatedAttrs = java.util.EnumSet.noneOf(SquareAttribute.class);
      for (SquareAttribute other_element : other.updatedAttrs) {
        __this__updatedAttrs.add(other_element);
      }
      this.updatedAttrs = __this__updatedAttrs;
    }
    if (other.isSetSquare()) {
      this.square = new Square(other.square);
    }
  }

  public UpdateSquareRequest deepCopy() {
    return new UpdateSquareRequest(this);
  }

  @Override
  public void clear() {
    this.updatedAttrs = null;
    this.square = null;
  }

  public int getUpdatedAttrsSize() {
    return (this.updatedAttrs == null) ? 0 : this.updatedAttrs.size();
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Iterator<SquareAttribute> getUpdatedAttrsIterator() {
    return (this.updatedAttrs == null) ? null : this.updatedAttrs.iterator();
  }

  public void addToUpdatedAttrs(SquareAttribute elem) {
    if (this.updatedAttrs == null) {
      this.updatedAttrs = java.util.EnumSet.noneOf(SquareAttribute.class);
    }
    this.updatedAttrs.add(elem);
  }

  @org.apache.thrift.annotation.Nullable
  public java.util.Set<SquareAttribute> getUpdatedAttrs() {
    return this.updatedAttrs;
  }

  public UpdateSquareRequest setUpdatedAttrs(@org.apache.thrift.annotation.Nullable java.util.Set<SquareAttribute> updatedAttrs) {
    this.updatedAttrs = updatedAttrs;
    return this;
  }

  public void unsetUpdatedAttrs() {
    this.updatedAttrs = null;
  }

  /** Returns true if field updatedAttrs is set (has been assigned a value) and false otherwise */
  public boolean isSetUpdatedAttrs() {
    return this.updatedAttrs != null;
  }

  public void setUpdatedAttrsIsSet(boolean value) {
    if (!value) {
      this.updatedAttrs = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public Square getSquare() {
    return this.square;
  }

  public UpdateSquareRequest setSquare(@org.apache.thrift.annotation.Nullable Square square) {
    this.square = square;
    return this;
  }

  public void unsetSquare() {
    this.square = null;
  }

  /** Returns true if field square is set (has been assigned a value) and false otherwise */
  public boolean isSetSquare() {
    return this.square != null;
  }

  public void setSquareIsSet(boolean value) {
    if (!value) {
      this.square = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case UPDATED_ATTRS:
      if (value == null) {
        unsetUpdatedAttrs();
      } else {
        setUpdatedAttrs((java.util.Set<SquareAttribute>)value);
      }
      break;

    case SQUARE:
      if (value == null) {
        unsetSquare();
      } else {
        setSquare((Square)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case UPDATED_ATTRS:
      return getUpdatedAttrs();

    case SQUARE:
      return getSquare();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case UPDATED_ATTRS:
      return isSetUpdatedAttrs();
    case SQUARE:
      return isSetSquare();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof UpdateSquareRequest)
      return this.equals((UpdateSquareRequest)that);
    return false;
  }

  public boolean equals(UpdateSquareRequest that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_updatedAttrs = true && this.isSetUpdatedAttrs();
    boolean that_present_updatedAttrs = true && that.isSetUpdatedAttrs();
    if (this_present_updatedAttrs || that_present_updatedAttrs) {
      if (!(this_present_updatedAttrs && that_present_updatedAttrs))
        return false;
      if (!this.updatedAttrs.equals(that.updatedAttrs))
        return false;
    }

    boolean this_present_square = true && this.isSetSquare();
    boolean that_present_square = true && that.isSetSquare();
    if (this_present_square || that_present_square) {
      if (!(this_present_square && that_present_square))
        return false;
      if (!this.square.equals(that.square))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetUpdatedAttrs()) ? 131071 : 524287);
    if (isSetUpdatedAttrs())
      hashCode = hashCode * 8191 + updatedAttrs.hashCode();

    hashCode = hashCode * 8191 + ((isSetSquare()) ? 131071 : 524287);
    if (isSetSquare())
      hashCode = hashCode * 8191 + square.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(UpdateSquareRequest other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetUpdatedAttrs()).compareTo(other.isSetUpdatedAttrs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUpdatedAttrs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.updatedAttrs, other.updatedAttrs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSquare()).compareTo(other.isSetSquare());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSquare()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.square, other.square);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("UpdateSquareRequest(");
    boolean first = true;

    sb.append("updatedAttrs:");
    if (this.updatedAttrs == null) {
      sb.append("null");
    } else {
      sb.append(this.updatedAttrs);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("square:");
    if (this.square == null) {
      sb.append("null");
    } else {
      sb.append(this.square);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (square != null) {
      square.validate();
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

  private static class UpdateSquareRequestStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateSquareRequestStandardScheme getScheme() {
      return new UpdateSquareRequestStandardScheme();
    }
  }

  private static class UpdateSquareRequestStandardScheme extends org.apache.thrift.scheme.StandardScheme<UpdateSquareRequest> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, UpdateSquareRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // UPDATED_ATTRS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set764 = iprot.readSetBegin();
                struct.updatedAttrs = java.util.EnumSet.noneOf(SquareAttribute.class);
                @org.apache.thrift.annotation.Nullable SquareAttribute _elem765;
                for (int _i766 = 0; _i766 < _set764.size; ++_i766)
                {
                  _elem765 = SquareAttribute.findByValue(iprot.readI32());
                  if (_elem765 != null)
                  {
                    struct.updatedAttrs.add(_elem765);
                  }
                }
                iprot.readSetEnd();
              }
              struct.setUpdatedAttrsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SQUARE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.square = new Square();
              struct.square.read(iprot);
              struct.setSquareIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, UpdateSquareRequest struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.updatedAttrs != null) {
        oprot.writeFieldBegin(UPDATED_ATTRS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.updatedAttrs.size()));
          for (SquareAttribute _iter767 : struct.updatedAttrs)
          {
            oprot.writeI32(_iter767.getValue());
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.square != null) {
        oprot.writeFieldBegin(SQUARE_FIELD_DESC);
        struct.square.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class UpdateSquareRequestTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public UpdateSquareRequestTupleScheme getScheme() {
      return new UpdateSquareRequestTupleScheme();
    }
  }

  private static class UpdateSquareRequestTupleScheme extends org.apache.thrift.scheme.TupleScheme<UpdateSquareRequest> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, UpdateSquareRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetUpdatedAttrs()) {
        optionals.set(0);
      }
      if (struct.isSetSquare()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUpdatedAttrs()) {
        {
          oprot.writeI32(struct.updatedAttrs.size());
          for (SquareAttribute _iter768 : struct.updatedAttrs)
          {
            oprot.writeI32(_iter768.getValue());
          }
        }
      }
      if (struct.isSetSquare()) {
        struct.square.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, UpdateSquareRequest struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TSet _set769 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.updatedAttrs = java.util.EnumSet.noneOf(SquareAttribute.class);
          @org.apache.thrift.annotation.Nullable SquareAttribute _elem770;
          for (int _i771 = 0; _i771 < _set769.size; ++_i771)
          {
            _elem770 = SquareAttribute.findByValue(iprot.readI32());
            if (_elem770 != null)
            {
              struct.updatedAttrs.add(_elem770);
            }
          }
        }
        struct.setUpdatedAttrsIsSet(true);
      }
      if (incoming.get(1)) {
        struct.square = new Square();
        struct.square.read(iprot);
        struct.setSquareIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

