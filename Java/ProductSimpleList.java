/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class ProductSimpleList implements org.apache.thrift.TBase<ProductSimpleList, ProductSimpleList._Fields>, java.io.Serializable, Cloneable, Comparable<ProductSimpleList> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ProductSimpleList");

  private static final org.apache.thrift.protocol.TField HAS_NEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("hasNext", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField REINVOKE_HOUR_FIELD_DESC = new org.apache.thrift.protocol.TField("reinvokeHour", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField LAST_VERSION_SEQ_FIELD_DESC = new org.apache.thrift.protocol.TField("lastVersionSeq", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField PRODUCT_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("productList", org.apache.thrift.protocol.TType.LIST, (short)4);
  private static final org.apache.thrift.protocol.TField RECENT_NEW_RELEASE_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("recentNewReleaseDate", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField RECENT_EVENT_RELEASE_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("recentEventReleaseDate", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProductSimpleListStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProductSimpleListTupleSchemeFactory();

  public boolean hasNext; // required
  public int reinvokeHour; // required
  public long lastVersionSeq; // required
  public java.util.List<ProductSimple> productList; // required
  public long recentNewReleaseDate; // required
  public long recentEventReleaseDate; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HAS_NEXT((short)1, "hasNext"),
    REINVOKE_HOUR((short)2, "reinvokeHour"),
    LAST_VERSION_SEQ((short)3, "lastVersionSeq"),
    PRODUCT_LIST((short)4, "productList"),
    RECENT_NEW_RELEASE_DATE((short)5, "recentNewReleaseDate"),
    RECENT_EVENT_RELEASE_DATE((short)6, "recentEventReleaseDate");

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
        case 1: // HAS_NEXT
          return HAS_NEXT;
        case 2: // REINVOKE_HOUR
          return REINVOKE_HOUR;
        case 3: // LAST_VERSION_SEQ
          return LAST_VERSION_SEQ;
        case 4: // PRODUCT_LIST
          return PRODUCT_LIST;
        case 5: // RECENT_NEW_RELEASE_DATE
          return RECENT_NEW_RELEASE_DATE;
        case 6: // RECENT_EVENT_RELEASE_DATE
          return RECENT_EVENT_RELEASE_DATE;
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
  private static final int __HASNEXT_ISSET_ID = 0;
  private static final int __REINVOKEHOUR_ISSET_ID = 1;
  private static final int __LASTVERSIONSEQ_ISSET_ID = 2;
  private static final int __RECENTNEWRELEASEDATE_ISSET_ID = 3;
  private static final int __RECENTEVENTRELEASEDATE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HAS_NEXT, new org.apache.thrift.meta_data.FieldMetaData("hasNext", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.REINVOKE_HOUR, new org.apache.thrift.meta_data.FieldMetaData("reinvokeHour", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.LAST_VERSION_SEQ, new org.apache.thrift.meta_data.FieldMetaData("lastVersionSeq", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.PRODUCT_LIST, new org.apache.thrift.meta_data.FieldMetaData("productList", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ProductSimple.class))));
    tmpMap.put(_Fields.RECENT_NEW_RELEASE_DATE, new org.apache.thrift.meta_data.FieldMetaData("recentNewReleaseDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.RECENT_EVENT_RELEASE_DATE, new org.apache.thrift.meta_data.FieldMetaData("recentEventReleaseDate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ProductSimpleList.class, metaDataMap);
  }

  public ProductSimpleList() {
  }

  public ProductSimpleList(
    boolean hasNext,
    int reinvokeHour,
    long lastVersionSeq,
    java.util.List<ProductSimple> productList,
    long recentNewReleaseDate,
    long recentEventReleaseDate)
  {
    this();
    this.hasNext = hasNext;
    setHasNextIsSet(true);
    this.reinvokeHour = reinvokeHour;
    setReinvokeHourIsSet(true);
    this.lastVersionSeq = lastVersionSeq;
    setLastVersionSeqIsSet(true);
    this.productList = productList;
    this.recentNewReleaseDate = recentNewReleaseDate;
    setRecentNewReleaseDateIsSet(true);
    this.recentEventReleaseDate = recentEventReleaseDate;
    setRecentEventReleaseDateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProductSimpleList(ProductSimpleList other) {
    __isset_bitfield = other.__isset_bitfield;
    this.hasNext = other.hasNext;
    this.reinvokeHour = other.reinvokeHour;
    this.lastVersionSeq = other.lastVersionSeq;
    if (other.isSetProductList()) {
      java.util.List<ProductSimple> __this__productList = new java.util.ArrayList<ProductSimple>(other.productList.size());
      for (ProductSimple other_element : other.productList) {
        __this__productList.add(new ProductSimple(other_element));
      }
      this.productList = __this__productList;
    }
    this.recentNewReleaseDate = other.recentNewReleaseDate;
    this.recentEventReleaseDate = other.recentEventReleaseDate;
  }

  public ProductSimpleList deepCopy() {
    return new ProductSimpleList(this);
  }

  @Override
  public void clear() {
    setHasNextIsSet(false);
    this.hasNext = false;
    setReinvokeHourIsSet(false);
    this.reinvokeHour = 0;
    setLastVersionSeqIsSet(false);
    this.lastVersionSeq = 0;
    this.productList = null;
    setRecentNewReleaseDateIsSet(false);
    this.recentNewReleaseDate = 0;
    setRecentEventReleaseDateIsSet(false);
    this.recentEventReleaseDate = 0;
  }

  public boolean isHasNext() {
    return this.hasNext;
  }

  public ProductSimpleList setHasNext(boolean hasNext) {
    this.hasNext = hasNext;
    setHasNextIsSet(true);
    return this;
  }

  public void unsetHasNext() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __HASNEXT_ISSET_ID);
  }

  /** Returns true if field hasNext is set (has been assigned a value) and false otherwise */
  public boolean isSetHasNext() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __HASNEXT_ISSET_ID);
  }

  public void setHasNextIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __HASNEXT_ISSET_ID, value);
  }

  public int getReinvokeHour() {
    return this.reinvokeHour;
  }

  public ProductSimpleList setReinvokeHour(int reinvokeHour) {
    this.reinvokeHour = reinvokeHour;
    setReinvokeHourIsSet(true);
    return this;
  }

  public void unsetReinvokeHour() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __REINVOKEHOUR_ISSET_ID);
  }

  /** Returns true if field reinvokeHour is set (has been assigned a value) and false otherwise */
  public boolean isSetReinvokeHour() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __REINVOKEHOUR_ISSET_ID);
  }

  public void setReinvokeHourIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __REINVOKEHOUR_ISSET_ID, value);
  }

  public long getLastVersionSeq() {
    return this.lastVersionSeq;
  }

  public ProductSimpleList setLastVersionSeq(long lastVersionSeq) {
    this.lastVersionSeq = lastVersionSeq;
    setLastVersionSeqIsSet(true);
    return this;
  }

  public void unsetLastVersionSeq() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __LASTVERSIONSEQ_ISSET_ID);
  }

  /** Returns true if field lastVersionSeq is set (has been assigned a value) and false otherwise */
  public boolean isSetLastVersionSeq() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __LASTVERSIONSEQ_ISSET_ID);
  }

  public void setLastVersionSeqIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __LASTVERSIONSEQ_ISSET_ID, value);
  }

  public int getProductListSize() {
    return (this.productList == null) ? 0 : this.productList.size();
  }

  public java.util.Iterator<ProductSimple> getProductListIterator() {
    return (this.productList == null) ? null : this.productList.iterator();
  }

  public void addToProductList(ProductSimple elem) {
    if (this.productList == null) {
      this.productList = new java.util.ArrayList<ProductSimple>();
    }
    this.productList.add(elem);
  }

  public java.util.List<ProductSimple> getProductList() {
    return this.productList;
  }

  public ProductSimpleList setProductList(java.util.List<ProductSimple> productList) {
    this.productList = productList;
    return this;
  }

  public void unsetProductList() {
    this.productList = null;
  }

  /** Returns true if field productList is set (has been assigned a value) and false otherwise */
  public boolean isSetProductList() {
    return this.productList != null;
  }

  public void setProductListIsSet(boolean value) {
    if (!value) {
      this.productList = null;
    }
  }

  public long getRecentNewReleaseDate() {
    return this.recentNewReleaseDate;
  }

  public ProductSimpleList setRecentNewReleaseDate(long recentNewReleaseDate) {
    this.recentNewReleaseDate = recentNewReleaseDate;
    setRecentNewReleaseDateIsSet(true);
    return this;
  }

  public void unsetRecentNewReleaseDate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RECENTNEWRELEASEDATE_ISSET_ID);
  }

  /** Returns true if field recentNewReleaseDate is set (has been assigned a value) and false otherwise */
  public boolean isSetRecentNewReleaseDate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RECENTNEWRELEASEDATE_ISSET_ID);
  }

  public void setRecentNewReleaseDateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RECENTNEWRELEASEDATE_ISSET_ID, value);
  }

  public long getRecentEventReleaseDate() {
    return this.recentEventReleaseDate;
  }

  public ProductSimpleList setRecentEventReleaseDate(long recentEventReleaseDate) {
    this.recentEventReleaseDate = recentEventReleaseDate;
    setRecentEventReleaseDateIsSet(true);
    return this;
  }

  public void unsetRecentEventReleaseDate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RECENTEVENTRELEASEDATE_ISSET_ID);
  }

  /** Returns true if field recentEventReleaseDate is set (has been assigned a value) and false otherwise */
  public boolean isSetRecentEventReleaseDate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RECENTEVENTRELEASEDATE_ISSET_ID);
  }

  public void setRecentEventReleaseDateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RECENTEVENTRELEASEDATE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case HAS_NEXT:
      if (value == null) {
        unsetHasNext();
      } else {
        setHasNext((java.lang.Boolean)value);
      }
      break;

    case REINVOKE_HOUR:
      if (value == null) {
        unsetReinvokeHour();
      } else {
        setReinvokeHour((java.lang.Integer)value);
      }
      break;

    case LAST_VERSION_SEQ:
      if (value == null) {
        unsetLastVersionSeq();
      } else {
        setLastVersionSeq((java.lang.Long)value);
      }
      break;

    case PRODUCT_LIST:
      if (value == null) {
        unsetProductList();
      } else {
        setProductList((java.util.List<ProductSimple>)value);
      }
      break;

    case RECENT_NEW_RELEASE_DATE:
      if (value == null) {
        unsetRecentNewReleaseDate();
      } else {
        setRecentNewReleaseDate((java.lang.Long)value);
      }
      break;

    case RECENT_EVENT_RELEASE_DATE:
      if (value == null) {
        unsetRecentEventReleaseDate();
      } else {
        setRecentEventReleaseDate((java.lang.Long)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case HAS_NEXT:
      return isHasNext();

    case REINVOKE_HOUR:
      return getReinvokeHour();

    case LAST_VERSION_SEQ:
      return getLastVersionSeq();

    case PRODUCT_LIST:
      return getProductList();

    case RECENT_NEW_RELEASE_DATE:
      return getRecentNewReleaseDate();

    case RECENT_EVENT_RELEASE_DATE:
      return getRecentEventReleaseDate();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case HAS_NEXT:
      return isSetHasNext();
    case REINVOKE_HOUR:
      return isSetReinvokeHour();
    case LAST_VERSION_SEQ:
      return isSetLastVersionSeq();
    case PRODUCT_LIST:
      return isSetProductList();
    case RECENT_NEW_RELEASE_DATE:
      return isSetRecentNewReleaseDate();
    case RECENT_EVENT_RELEASE_DATE:
      return isSetRecentEventReleaseDate();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof ProductSimpleList)
      return this.equals((ProductSimpleList)that);
    return false;
  }

  public boolean equals(ProductSimpleList that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_hasNext = true;
    boolean that_present_hasNext = true;
    if (this_present_hasNext || that_present_hasNext) {
      if (!(this_present_hasNext && that_present_hasNext))
        return false;
      if (this.hasNext != that.hasNext)
        return false;
    }

    boolean this_present_reinvokeHour = true;
    boolean that_present_reinvokeHour = true;
    if (this_present_reinvokeHour || that_present_reinvokeHour) {
      if (!(this_present_reinvokeHour && that_present_reinvokeHour))
        return false;
      if (this.reinvokeHour != that.reinvokeHour)
        return false;
    }

    boolean this_present_lastVersionSeq = true;
    boolean that_present_lastVersionSeq = true;
    if (this_present_lastVersionSeq || that_present_lastVersionSeq) {
      if (!(this_present_lastVersionSeq && that_present_lastVersionSeq))
        return false;
      if (this.lastVersionSeq != that.lastVersionSeq)
        return false;
    }

    boolean this_present_productList = true && this.isSetProductList();
    boolean that_present_productList = true && that.isSetProductList();
    if (this_present_productList || that_present_productList) {
      if (!(this_present_productList && that_present_productList))
        return false;
      if (!this.productList.equals(that.productList))
        return false;
    }

    boolean this_present_recentNewReleaseDate = true;
    boolean that_present_recentNewReleaseDate = true;
    if (this_present_recentNewReleaseDate || that_present_recentNewReleaseDate) {
      if (!(this_present_recentNewReleaseDate && that_present_recentNewReleaseDate))
        return false;
      if (this.recentNewReleaseDate != that.recentNewReleaseDate)
        return false;
    }

    boolean this_present_recentEventReleaseDate = true;
    boolean that_present_recentEventReleaseDate = true;
    if (this_present_recentEventReleaseDate || that_present_recentEventReleaseDate) {
      if (!(this_present_recentEventReleaseDate && that_present_recentEventReleaseDate))
        return false;
      if (this.recentEventReleaseDate != that.recentEventReleaseDate)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((hasNext) ? 131071 : 524287);

    hashCode = hashCode * 8191 + reinvokeHour;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(lastVersionSeq);

    hashCode = hashCode * 8191 + ((isSetProductList()) ? 131071 : 524287);
    if (isSetProductList())
      hashCode = hashCode * 8191 + productList.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(recentNewReleaseDate);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(recentEventReleaseDate);

    return hashCode;
  }

  @Override
  public int compareTo(ProductSimpleList other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetHasNext()).compareTo(other.isSetHasNext());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHasNext()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.hasNext, other.hasNext);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetReinvokeHour()).compareTo(other.isSetReinvokeHour());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetReinvokeHour()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.reinvokeHour, other.reinvokeHour);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetLastVersionSeq()).compareTo(other.isSetLastVersionSeq());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetLastVersionSeq()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.lastVersionSeq, other.lastVersionSeq);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetProductList()).compareTo(other.isSetProductList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.productList, other.productList);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecentNewReleaseDate()).compareTo(other.isSetRecentNewReleaseDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecentNewReleaseDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recentNewReleaseDate, other.recentNewReleaseDate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecentEventReleaseDate()).compareTo(other.isSetRecentEventReleaseDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecentEventReleaseDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recentEventReleaseDate, other.recentEventReleaseDate);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("ProductSimpleList(");
    boolean first = true;

    sb.append("hasNext:");
    sb.append(this.hasNext);
    first = false;
    if (!first) sb.append(", ");
    sb.append("reinvokeHour:");
    sb.append(this.reinvokeHour);
    first = false;
    if (!first) sb.append(", ");
    sb.append("lastVersionSeq:");
    sb.append(this.lastVersionSeq);
    first = false;
    if (!first) sb.append(", ");
    sb.append("productList:");
    if (this.productList == null) {
      sb.append("null");
    } else {
      sb.append(this.productList);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("recentNewReleaseDate:");
    sb.append(this.recentNewReleaseDate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("recentEventReleaseDate:");
    sb.append(this.recentEventReleaseDate);
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

  private static class ProductSimpleListStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProductSimpleListStandardScheme getScheme() {
      return new ProductSimpleListStandardScheme();
    }
  }

  private static class ProductSimpleListStandardScheme extends org.apache.thrift.scheme.StandardScheme<ProductSimpleList> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ProductSimpleList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HAS_NEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.hasNext = iprot.readBool();
              struct.setHasNextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // REINVOKE_HOUR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.reinvokeHour = iprot.readI32();
              struct.setReinvokeHourIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // LAST_VERSION_SEQ
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.lastVersionSeq = iprot.readI64();
              struct.setLastVersionSeqIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PRODUCT_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list586 = iprot.readListBegin();
                struct.productList = new java.util.ArrayList<ProductSimple>(_list586.size);
                ProductSimple _elem587;
                for (int _i588 = 0; _i588 < _list586.size; ++_i588)
                {
                  _elem587 = new ProductSimple();
                  _elem587.read(iprot);
                  struct.productList.add(_elem587);
                }
                iprot.readListEnd();
              }
              struct.setProductListIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RECENT_NEW_RELEASE_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.recentNewReleaseDate = iprot.readI64();
              struct.setRecentNewReleaseDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RECENT_EVENT_RELEASE_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.recentEventReleaseDate = iprot.readI64();
              struct.setRecentEventReleaseDateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ProductSimpleList struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(HAS_NEXT_FIELD_DESC);
      oprot.writeBool(struct.hasNext);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(REINVOKE_HOUR_FIELD_DESC);
      oprot.writeI32(struct.reinvokeHour);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(LAST_VERSION_SEQ_FIELD_DESC);
      oprot.writeI64(struct.lastVersionSeq);
      oprot.writeFieldEnd();
      if (struct.productList != null) {
        oprot.writeFieldBegin(PRODUCT_LIST_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.productList.size()));
          for (ProductSimple _iter589 : struct.productList)
          {
            _iter589.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RECENT_NEW_RELEASE_DATE_FIELD_DESC);
      oprot.writeI64(struct.recentNewReleaseDate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RECENT_EVENT_RELEASE_DATE_FIELD_DESC);
      oprot.writeI64(struct.recentEventReleaseDate);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProductSimpleListTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProductSimpleListTupleScheme getScheme() {
      return new ProductSimpleListTupleScheme();
    }
  }

  private static class ProductSimpleListTupleScheme extends org.apache.thrift.scheme.TupleScheme<ProductSimpleList> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ProductSimpleList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetHasNext()) {
        optionals.set(0);
      }
      if (struct.isSetReinvokeHour()) {
        optionals.set(1);
      }
      if (struct.isSetLastVersionSeq()) {
        optionals.set(2);
      }
      if (struct.isSetProductList()) {
        optionals.set(3);
      }
      if (struct.isSetRecentNewReleaseDate()) {
        optionals.set(4);
      }
      if (struct.isSetRecentEventReleaseDate()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetHasNext()) {
        oprot.writeBool(struct.hasNext);
      }
      if (struct.isSetReinvokeHour()) {
        oprot.writeI32(struct.reinvokeHour);
      }
      if (struct.isSetLastVersionSeq()) {
        oprot.writeI64(struct.lastVersionSeq);
      }
      if (struct.isSetProductList()) {
        {
          oprot.writeI32(struct.productList.size());
          for (ProductSimple _iter590 : struct.productList)
          {
            _iter590.write(oprot);
          }
        }
      }
      if (struct.isSetRecentNewReleaseDate()) {
        oprot.writeI64(struct.recentNewReleaseDate);
      }
      if (struct.isSetRecentEventReleaseDate()) {
        oprot.writeI64(struct.recentEventReleaseDate);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ProductSimpleList struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.hasNext = iprot.readBool();
        struct.setHasNextIsSet(true);
      }
      if (incoming.get(1)) {
        struct.reinvokeHour = iprot.readI32();
        struct.setReinvokeHourIsSet(true);
      }
      if (incoming.get(2)) {
        struct.lastVersionSeq = iprot.readI64();
        struct.setLastVersionSeqIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list591 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.productList = new java.util.ArrayList<ProductSimple>(_list591.size);
          ProductSimple _elem592;
          for (int _i593 = 0; _i593 < _list591.size; ++_i593)
          {
            _elem592 = new ProductSimple();
            _elem592.read(iprot);
            struct.productList.add(_elem592);
          }
        }
        struct.setProductListIsSet(true);
      }
      if (incoming.get(4)) {
        struct.recentNewReleaseDate = iprot.readI64();
        struct.setRecentNewReleaseDateIsSet(true);
      }
      if (incoming.get(5)) {
        struct.recentEventReleaseDate = iprot.readI64();
        struct.setRecentEventReleaseDateIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

