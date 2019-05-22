/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class SpotNearbyItem implements org.apache.thrift.TBase<SpotNearbyItem, SpotNearbyItem._Fields>, java.io.Serializable, Cloneable, Comparable<SpotNearbyItem> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SpotNearbyItem");

  private static final org.apache.thrift.protocol.TField SPOT_ITEM_FIELD_DESC = new org.apache.thrift.protocol.TField("spotItem", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField LOCATION_FIELD_DESC = new org.apache.thrift.protocol.TField("location", org.apache.thrift.protocol.TType.STRUCT, (short)11);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SpotNearbyItemStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SpotNearbyItemTupleSchemeFactory();

  public SpotItem spotItem; // required
  public Location location; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SPOT_ITEM((short)2, "spotItem"),
    LOCATION((short)11, "location");

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
        case 2: // SPOT_ITEM
          return SPOT_ITEM;
        case 11: // LOCATION
          return LOCATION;
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
    tmpMap.put(_Fields.SPOT_ITEM, new org.apache.thrift.meta_data.FieldMetaData("spotItem", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SpotItem.class)));
    tmpMap.put(_Fields.LOCATION, new org.apache.thrift.meta_data.FieldMetaData("location", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Location.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SpotNearbyItem.class, metaDataMap);
  }

  public SpotNearbyItem() {
  }

  public SpotNearbyItem(
    SpotItem spotItem,
    Location location)
  {
    this();
    this.spotItem = spotItem;
    this.location = location;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SpotNearbyItem(SpotNearbyItem other) {
    if (other.isSetSpotItem()) {
      this.spotItem = new SpotItem(other.spotItem);
    }
    if (other.isSetLocation()) {
      this.location = new Location(other.location);
    }
  }

  public SpotNearbyItem deepCopy() {
    return new SpotNearbyItem(this);
  }

  @Override
  public void clear() {
    this.spotItem = null;
    this.location = null;
  }

  public SpotItem getSpotItem() {
    return this.spotItem;
  }

  public SpotNearbyItem setSpotItem(SpotItem spotItem) {
    this.spotItem = spotItem;
    return this;
  }

  public void unsetSpotItem() {
    this.spotItem = null;
  }

  /** Returns true if field spotItem is set (has been assigned a value) and false otherwise */
  public boolean isSetSpotItem() {
    return this.spotItem != null;
  }

  public void setSpotItemIsSet(boolean value) {
    if (!value) {
      this.spotItem = null;
    }
  }

  public Location getLocation() {
    return this.location;
  }

  public SpotNearbyItem setLocation(Location location) {
    this.location = location;
    return this;
  }

  public void unsetLocation() {
    this.location = null;
  }

  /** Returns true if field location is set (has been assigned a value) and false otherwise */
  public boolean isSetLocation() {
    return this.location != null;
  }

  public void setLocationIsSet(boolean value) {
    if (!value) {
      this.location = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case SPOT_ITEM:
      if (value == null) {
        unsetSpotItem();
      } else {
        setSpotItem((SpotItem)value);
      }
      break;

    case LOCATION:
      if (value == null) {
        unsetLocation();
      } else {
        setLocation((Location)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case SPOT_ITEM:
      return getSpotItem();

    case LOCATION:
      return getLocation();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case SPOT_ITEM:
      return isSetSpotItem();
    case LOCATION:
      return isSetLocation();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SpotNearbyItem)
      return this.equals((SpotNearbyItem)that);
    return false;
  }

  public boolean equals(SpotNearbyItem that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_spotItem = true && this.isSetSpotItem();
    boolean that_present_spotItem = true && that.isSetSpotItem();
    if (this_present_spotItem || that_present_spotItem) {
      if (!(this_present_spotItem && that_present_spotItem))
        return false;
      if (!this.spotItem.equals(that.spotItem))
        return false;
    }

    boolean this_present_location = true && this.isSetLocation();
    boolean that_present_location = true && that.isSetLocation();
    if (this_present_location || that_present_location) {
      if (!(this_present_location && that_present_location))
        return false;
      if (!this.location.equals(that.location))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetSpotItem()) ? 131071 : 524287);
    if (isSetSpotItem())
      hashCode = hashCode * 8191 + spotItem.hashCode();

    hashCode = hashCode * 8191 + ((isSetLocation()) ? 131071 : 524287);
    if (isSetLocation())
      hashCode = hashCode * 8191 + location.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SpotNearbyItem other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetSpotItem()).compareTo(other.isSetSpotItem());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSpotItem()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.spotItem, other.spotItem);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLocation()).compareTo(other.isSetLocation());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLocation()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.location, other.location);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SpotNearbyItem(");
    boolean first = true;

    sb.append("spotItem:");
    if (this.spotItem == null) {
      sb.append("null");
    } else {
      sb.append(this.spotItem);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("location:");
    if (this.location == null) {
      sb.append("null");
    } else {
      sb.append(this.location);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (spotItem != null) {
      spotItem.validate();
    }
    if (location != null) {
      location.validate();
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

  private static class SpotNearbyItemStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SpotNearbyItemStandardScheme getScheme() {
      return new SpotNearbyItemStandardScheme();
    }
  }

  private static class SpotNearbyItemStandardScheme extends org.apache.thrift.scheme.StandardScheme<SpotNearbyItem> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SpotNearbyItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 2: // SPOT_ITEM
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.spotItem = new SpotItem();
              struct.spotItem.read(iprot);
              struct.setSpotItemIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 11: // LOCATION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.location = new Location();
              struct.location.read(iprot);
              struct.setLocationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SpotNearbyItem struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.spotItem != null) {
        oprot.writeFieldBegin(SPOT_ITEM_FIELD_DESC);
        struct.spotItem.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.location != null) {
        oprot.writeFieldBegin(LOCATION_FIELD_DESC);
        struct.location.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SpotNearbyItemTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SpotNearbyItemTupleScheme getScheme() {
      return new SpotNearbyItemTupleScheme();
    }
  }

  private static class SpotNearbyItemTupleScheme extends org.apache.thrift.scheme.TupleScheme<SpotNearbyItem> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SpotNearbyItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetSpotItem()) {
        optionals.set(0);
      }
      if (struct.isSetLocation()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetSpotItem()) {
        struct.spotItem.write(oprot);
      }
      if (struct.isSetLocation()) {
        struct.location.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SpotNearbyItem struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.spotItem = new SpotItem();
        struct.spotItem.read(iprot);
        struct.setSpotItemIsSet(true);
      }
      if (incoming.get(1)) {
        struct.location = new Location();
        struct.location.read(iprot);
        struct.setLocationIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

