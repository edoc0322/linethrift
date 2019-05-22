/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class ProductProperty implements org.apache.thrift.TBase<ProductProperty, ProductProperty._Fields>, java.io.Serializable, Cloneable, Comparable<ProductProperty> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProductProperty");

  private static final org.apache.thrift.protocol.TField STICKER_PROPERTY_FIELD_DESC = new org.apache.thrift.protocol.TField("stickerProperty", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STICON_PROPERTY_FIELD_DESC = new org.apache.thrift.protocol.TField("sticonProperty", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField THEME_PROPERTY_FIELD_DESC = new org.apache.thrift.protocol.TField("themeProperty", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProductPropertyStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProductPropertyTupleSchemeFactory();

  public StickerProperty stickerProperty; // required
  public SticonProperty sticonProperty; // required
  public ThemeProperty themeProperty; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STICKER_PROPERTY((short)1, "stickerProperty"),
    STICON_PROPERTY((short)3, "sticonProperty"),
    THEME_PROPERTY((short)2, "themeProperty");

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
        case 1: // STICKER_PROPERTY
          return STICKER_PROPERTY;
        case 3: // STICON_PROPERTY
          return STICON_PROPERTY;
        case 2: // THEME_PROPERTY
          return THEME_PROPERTY;
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
    tmpMap.put(_Fields.STICKER_PROPERTY, new org.apache.thrift.meta_data.FieldMetaData("stickerProperty", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StickerProperty.class)));
    tmpMap.put(_Fields.STICON_PROPERTY, new org.apache.thrift.meta_data.FieldMetaData("sticonProperty", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SticonProperty.class)));
    tmpMap.put(_Fields.THEME_PROPERTY, new org.apache.thrift.meta_data.FieldMetaData("themeProperty", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ThemeProperty.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProductProperty.class, metaDataMap);
  }

  public ProductProperty() {
  }

  public ProductProperty(
    StickerProperty stickerProperty,
    SticonProperty sticonProperty,
    ThemeProperty themeProperty)
  {
    this();
    this.stickerProperty = stickerProperty;
    this.sticonProperty = sticonProperty;
    this.themeProperty = themeProperty;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProductProperty(ProductProperty other) {
    if (other.isSetStickerProperty()) {
      this.stickerProperty = new StickerProperty(other.stickerProperty);
    }
    if (other.isSetSticonProperty()) {
      this.sticonProperty = new SticonProperty(other.sticonProperty);
    }
    if (other.isSetThemeProperty()) {
      this.themeProperty = new ThemeProperty(other.themeProperty);
    }
  }

  public ProductProperty deepCopy() {
    return new ProductProperty(this);
  }

  @Override
  public void clear() {
    this.stickerProperty = null;
    this.sticonProperty = null;
    this.themeProperty = null;
  }

  public StickerProperty getStickerProperty() {
    return this.stickerProperty;
  }

  public ProductProperty setStickerProperty(StickerProperty stickerProperty) {
    this.stickerProperty = stickerProperty;
    return this;
  }

  public void unsetStickerProperty() {
    this.stickerProperty = null;
  }

  /** Returns true if field stickerProperty is set (has been assigned a value) and false otherwise */
  public boolean isSetStickerProperty() {
    return this.stickerProperty != null;
  }

  public void setStickerPropertyIsSet(boolean value) {
    if (!value) {
      this.stickerProperty = null;
    }
  }

  public SticonProperty getSticonProperty() {
    return this.sticonProperty;
  }

  public ProductProperty setSticonProperty(SticonProperty sticonProperty) {
    this.sticonProperty = sticonProperty;
    return this;
  }

  public void unsetSticonProperty() {
    this.sticonProperty = null;
  }

  /** Returns true if field sticonProperty is set (has been assigned a value) and false otherwise */
  public boolean isSetSticonProperty() {
    return this.sticonProperty != null;
  }

  public void setSticonPropertyIsSet(boolean value) {
    if (!value) {
      this.sticonProperty = null;
    }
  }

  public ThemeProperty getThemeProperty() {
    return this.themeProperty;
  }

  public ProductProperty setThemeProperty(ThemeProperty themeProperty) {
    this.themeProperty = themeProperty;
    return this;
  }

  public void unsetThemeProperty() {
    this.themeProperty = null;
  }

  /** Returns true if field themeProperty is set (has been assigned a value) and false otherwise */
  public boolean isSetThemeProperty() {
    return this.themeProperty != null;
  }

  public void setThemePropertyIsSet(boolean value) {
    if (!value) {
      this.themeProperty = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case STICKER_PROPERTY:
      if (value == null) {
        unsetStickerProperty();
      } else {
        setStickerProperty((StickerProperty)value);
      }
      break;

    case STICON_PROPERTY:
      if (value == null) {
        unsetSticonProperty();
      } else {
        setSticonProperty((SticonProperty)value);
      }
      break;

    case THEME_PROPERTY:
      if (value == null) {
        unsetThemeProperty();
      } else {
        setThemeProperty((ThemeProperty)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case STICKER_PROPERTY:
      return getStickerProperty();

    case STICON_PROPERTY:
      return getSticonProperty();

    case THEME_PROPERTY:
      return getThemeProperty();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case STICKER_PROPERTY:
      return isSetStickerProperty();
    case STICON_PROPERTY:
      return isSetSticonProperty();
    case THEME_PROPERTY:
      return isSetThemeProperty();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ProductProperty)
      return this.equals((ProductProperty)that);
    return false;
  }

  public boolean equals(ProductProperty that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_stickerProperty = true && this.isSetStickerProperty();
    boolean that_present_stickerProperty = true && that.isSetStickerProperty();
    if (this_present_stickerProperty || that_present_stickerProperty) {
      if (!(this_present_stickerProperty && that_present_stickerProperty))
        return false;
      if (!this.stickerProperty.equals(that.stickerProperty))
        return false;
    }

    boolean this_present_sticonProperty = true && this.isSetSticonProperty();
    boolean that_present_sticonProperty = true && that.isSetSticonProperty();
    if (this_present_sticonProperty || that_present_sticonProperty) {
      if (!(this_present_sticonProperty && that_present_sticonProperty))
        return false;
      if (!this.sticonProperty.equals(that.sticonProperty))
        return false;
    }

    boolean this_present_themeProperty = true && this.isSetThemeProperty();
    boolean that_present_themeProperty = true && that.isSetThemeProperty();
    if (this_present_themeProperty || that_present_themeProperty) {
      if (!(this_present_themeProperty && that_present_themeProperty))
        return false;
      if (!this.themeProperty.equals(that.themeProperty))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetStickerProperty()) ? 131071 : 524287);
    if (isSetStickerProperty())
      hashCode = hashCode * 8191 + stickerProperty.hashCode();

    hashCode = hashCode * 8191 + ((isSetSticonProperty()) ? 131071 : 524287);
    if (isSetSticonProperty())
      hashCode = hashCode * 8191 + sticonProperty.hashCode();

    hashCode = hashCode * 8191 + ((isSetThemeProperty()) ? 131071 : 524287);
    if (isSetThemeProperty())
      hashCode = hashCode * 8191 + themeProperty.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(ProductProperty other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetStickerProperty()).compareTo(other.isSetStickerProperty());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStickerProperty()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stickerProperty, other.stickerProperty);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSticonProperty()).compareTo(other.isSetSticonProperty());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSticonProperty()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sticonProperty, other.sticonProperty);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetThemeProperty()).compareTo(other.isSetThemeProperty());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThemeProperty()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.themeProperty, other.themeProperty);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductProperty(");
    boolean first = true;

    sb.append("stickerProperty:");
    if (this.stickerProperty == null) {
      sb.append("null");
    } else {
      sb.append(this.stickerProperty);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sticonProperty:");
    if (this.sticonProperty == null) {
      sb.append("null");
    } else {
      sb.append(this.sticonProperty);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("themeProperty:");
    if (this.themeProperty == null) {
      sb.append("null");
    } else {
      sb.append(this.themeProperty);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stickerProperty != null) {
      stickerProperty.validate();
    }
    if (sticonProperty != null) {
      sticonProperty.validate();
    }
    if (themeProperty != null) {
      themeProperty.validate();
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

  private static class ProductPropertyStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProductPropertyStandardScheme getScheme() {
      return new ProductPropertyStandardScheme();
    }
  }

  private static class ProductPropertyStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProductProperty> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProductProperty struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STICKER_PROPERTY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stickerProperty = new StickerProperty();
              struct.stickerProperty.read(iprot);
              struct.setStickerPropertyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STICON_PROPERTY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.sticonProperty = new SticonProperty();
              struct.sticonProperty.read(iprot);
              struct.setSticonPropertyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // THEME_PROPERTY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.themeProperty = new ThemeProperty();
              struct.themeProperty.read(iprot);
              struct.setThemePropertyIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProductProperty struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.stickerProperty != null) {
        oprot.writeFieldBegin(STICKER_PROPERTY_FIELD_DESC);
        struct.stickerProperty.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.themeProperty != null) {
        oprot.writeFieldBegin(THEME_PROPERTY_FIELD_DESC);
        struct.themeProperty.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.sticonProperty != null) {
        oprot.writeFieldBegin(STICON_PROPERTY_FIELD_DESC);
        struct.sticonProperty.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProductPropertyTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProductPropertyTupleScheme getScheme() {
      return new ProductPropertyTupleScheme();
    }
  }

  private static class ProductPropertyTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProductProperty> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProductProperty struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetStickerProperty()) {
        optionals.set(0);
      }
      if (struct.isSetSticonProperty()) {
        optionals.set(1);
      }
      if (struct.isSetThemeProperty()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStickerProperty()) {
        struct.stickerProperty.write(oprot);
      }
      if (struct.isSetSticonProperty()) {
        struct.sticonProperty.write(oprot);
      }
      if (struct.isSetThemeProperty()) {
        struct.themeProperty.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProductProperty struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.stickerProperty = new StickerProperty();
        struct.stickerProperty.read(iprot);
        struct.setStickerPropertyIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sticonProperty = new SticonProperty();
        struct.sticonProperty.read(iprot);
        struct.setSticonPropertyIsSet(true);
      }
      if (incoming.get(2)) {
        struct.themeProperty = new ThemeProperty();
        struct.themeProperty.read(iprot);
        struct.setThemePropertyIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

