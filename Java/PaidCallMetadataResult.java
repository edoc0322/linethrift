/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class PaidCallMetadataResult implements org.apache.thrift.TBase<PaidCallMetadataResult, PaidCallMetadataResult._Fields>, java.io.Serializable, Cloneable, Comparable<PaidCallMetadataResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PaidCallMetadataResult");

  private static final org.apache.thrift.protocol.TField CURRENCY_EXCHANGE_RATES_FIELD_DESC = new org.apache.thrift.protocol.TField("currencyExchangeRates", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField RECOMMENDED_COUNTRY_CODES_FIELD_DESC = new org.apache.thrift.protocol.TField("recommendedCountryCodes", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField AD_COUNTRIES_FIELD_DESC = new org.apache.thrift.protocol.TField("adCountries", org.apache.thrift.protocol.TType.LIST, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PaidCallMetadataResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PaidCallMetadataResultTupleSchemeFactory();

  public java.util.List<PaidCallCurrencyExchangeRate> currencyExchangeRates; // required
  public java.util.List<java.lang.String> recommendedCountryCodes; // required
  public java.util.List<PaidCallAdCountry> adCountries; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CURRENCY_EXCHANGE_RATES((short)1, "currencyExchangeRates"),
    RECOMMENDED_COUNTRY_CODES((short)2, "recommendedCountryCodes"),
    AD_COUNTRIES((short)3, "adCountries");

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
        case 1: // CURRENCY_EXCHANGE_RATES
          return CURRENCY_EXCHANGE_RATES;
        case 2: // RECOMMENDED_COUNTRY_CODES
          return RECOMMENDED_COUNTRY_CODES;
        case 3: // AD_COUNTRIES
          return AD_COUNTRIES;
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
    tmpMap.put(_Fields.CURRENCY_EXCHANGE_RATES, new org.apache.thrift.meta_data.FieldMetaData("currencyExchangeRates", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PaidCallCurrencyExchangeRate.class))));
    tmpMap.put(_Fields.RECOMMENDED_COUNTRY_CODES, new org.apache.thrift.meta_data.FieldMetaData("recommendedCountryCodes", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.AD_COUNTRIES, new org.apache.thrift.meta_data.FieldMetaData("adCountries", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PaidCallAdCountry.class))));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PaidCallMetadataResult.class, metaDataMap);
  }

  public PaidCallMetadataResult() {
  }

  public PaidCallMetadataResult(
    java.util.List<PaidCallCurrencyExchangeRate> currencyExchangeRates,
    java.util.List<java.lang.String> recommendedCountryCodes,
    java.util.List<PaidCallAdCountry> adCountries)
  {
    this();
    this.currencyExchangeRates = currencyExchangeRates;
    this.recommendedCountryCodes = recommendedCountryCodes;
    this.adCountries = adCountries;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PaidCallMetadataResult(PaidCallMetadataResult other) {
    if (other.isSetCurrencyExchangeRates()) {
      java.util.List<PaidCallCurrencyExchangeRate> __this__currencyExchangeRates = new java.util.ArrayList<PaidCallCurrencyExchangeRate>(other.currencyExchangeRates.size());
      for (PaidCallCurrencyExchangeRate other_element : other.currencyExchangeRates) {
        __this__currencyExchangeRates.add(new PaidCallCurrencyExchangeRate(other_element));
      }
      this.currencyExchangeRates = __this__currencyExchangeRates;
    }
    if (other.isSetRecommendedCountryCodes()) {
      java.util.List<java.lang.String> __this__recommendedCountryCodes = new java.util.ArrayList<java.lang.String>(other.recommendedCountryCodes);
      this.recommendedCountryCodes = __this__recommendedCountryCodes;
    }
    if (other.isSetAdCountries()) {
      java.util.List<PaidCallAdCountry> __this__adCountries = new java.util.ArrayList<PaidCallAdCountry>(other.adCountries.size());
      for (PaidCallAdCountry other_element : other.adCountries) {
        __this__adCountries.add(new PaidCallAdCountry(other_element));
      }
      this.adCountries = __this__adCountries;
    }
  }

  public PaidCallMetadataResult deepCopy() {
    return new PaidCallMetadataResult(this);
  }

  @Override
  public void clear() {
    this.currencyExchangeRates = null;
    this.recommendedCountryCodes = null;
    this.adCountries = null;
  }

  public int getCurrencyExchangeRatesSize() {
    return (this.currencyExchangeRates == null) ? 0 : this.currencyExchangeRates.size();
  }

  public java.util.Iterator<PaidCallCurrencyExchangeRate> getCurrencyExchangeRatesIterator() {
    return (this.currencyExchangeRates == null) ? null : this.currencyExchangeRates.iterator();
  }

  public void addToCurrencyExchangeRates(PaidCallCurrencyExchangeRate elem) {
    if (this.currencyExchangeRates == null) {
      this.currencyExchangeRates = new java.util.ArrayList<PaidCallCurrencyExchangeRate>();
    }
    this.currencyExchangeRates.add(elem);
  }

  public java.util.List<PaidCallCurrencyExchangeRate> getCurrencyExchangeRates() {
    return this.currencyExchangeRates;
  }

  public PaidCallMetadataResult setCurrencyExchangeRates(java.util.List<PaidCallCurrencyExchangeRate> currencyExchangeRates) {
    this.currencyExchangeRates = currencyExchangeRates;
    return this;
  }

  public void unsetCurrencyExchangeRates() {
    this.currencyExchangeRates = null;
  }

  /** Returns true if field currencyExchangeRates is set (has been assigned a value) and false otherwise */
  public boolean isSetCurrencyExchangeRates() {
    return this.currencyExchangeRates != null;
  }

  public void setCurrencyExchangeRatesIsSet(boolean value) {
    if (!value) {
      this.currencyExchangeRates = null;
    }
  }

  public int getRecommendedCountryCodesSize() {
    return (this.recommendedCountryCodes == null) ? 0 : this.recommendedCountryCodes.size();
  }

  public java.util.Iterator<java.lang.String> getRecommendedCountryCodesIterator() {
    return (this.recommendedCountryCodes == null) ? null : this.recommendedCountryCodes.iterator();
  }

  public void addToRecommendedCountryCodes(java.lang.String elem) {
    if (this.recommendedCountryCodes == null) {
      this.recommendedCountryCodes = new java.util.ArrayList<java.lang.String>();
    }
    this.recommendedCountryCodes.add(elem);
  }

  public java.util.List<java.lang.String> getRecommendedCountryCodes() {
    return this.recommendedCountryCodes;
  }

  public PaidCallMetadataResult setRecommendedCountryCodes(java.util.List<java.lang.String> recommendedCountryCodes) {
    this.recommendedCountryCodes = recommendedCountryCodes;
    return this;
  }

  public void unsetRecommendedCountryCodes() {
    this.recommendedCountryCodes = null;
  }

  /** Returns true if field recommendedCountryCodes is set (has been assigned a value) and false otherwise */
  public boolean isSetRecommendedCountryCodes() {
    return this.recommendedCountryCodes != null;
  }

  public void setRecommendedCountryCodesIsSet(boolean value) {
    if (!value) {
      this.recommendedCountryCodes = null;
    }
  }

  public int getAdCountriesSize() {
    return (this.adCountries == null) ? 0 : this.adCountries.size();
  }

  public java.util.Iterator<PaidCallAdCountry> getAdCountriesIterator() {
    return (this.adCountries == null) ? null : this.adCountries.iterator();
  }

  public void addToAdCountries(PaidCallAdCountry elem) {
    if (this.adCountries == null) {
      this.adCountries = new java.util.ArrayList<PaidCallAdCountry>();
    }
    this.adCountries.add(elem);
  }

  public java.util.List<PaidCallAdCountry> getAdCountries() {
    return this.adCountries;
  }

  public PaidCallMetadataResult setAdCountries(java.util.List<PaidCallAdCountry> adCountries) {
    this.adCountries = adCountries;
    return this;
  }

  public void unsetAdCountries() {
    this.adCountries = null;
  }

  /** Returns true if field adCountries is set (has been assigned a value) and false otherwise */
  public boolean isSetAdCountries() {
    return this.adCountries != null;
  }

  public void setAdCountriesIsSet(boolean value) {
    if (!value) {
      this.adCountries = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case CURRENCY_EXCHANGE_RATES:
      if (value == null) {
        unsetCurrencyExchangeRates();
      } else {
        setCurrencyExchangeRates((java.util.List<PaidCallCurrencyExchangeRate>)value);
      }
      break;

    case RECOMMENDED_COUNTRY_CODES:
      if (value == null) {
        unsetRecommendedCountryCodes();
      } else {
        setRecommendedCountryCodes((java.util.List<java.lang.String>)value);
      }
      break;

    case AD_COUNTRIES:
      if (value == null) {
        unsetAdCountries();
      } else {
        setAdCountries((java.util.List<PaidCallAdCountry>)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case CURRENCY_EXCHANGE_RATES:
      return getCurrencyExchangeRates();

    case RECOMMENDED_COUNTRY_CODES:
      return getRecommendedCountryCodes();

    case AD_COUNTRIES:
      return getAdCountries();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case CURRENCY_EXCHANGE_RATES:
      return isSetCurrencyExchangeRates();
    case RECOMMENDED_COUNTRY_CODES:
      return isSetRecommendedCountryCodes();
    case AD_COUNTRIES:
      return isSetAdCountries();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PaidCallMetadataResult)
      return this.equals((PaidCallMetadataResult)that);
    return false;
  }

  public boolean equals(PaidCallMetadataResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_currencyExchangeRates = true && this.isSetCurrencyExchangeRates();
    boolean that_present_currencyExchangeRates = true && that.isSetCurrencyExchangeRates();
    if (this_present_currencyExchangeRates || that_present_currencyExchangeRates) {
      if (!(this_present_currencyExchangeRates && that_present_currencyExchangeRates))
        return false;
      if (!this.currencyExchangeRates.equals(that.currencyExchangeRates))
        return false;
    }

    boolean this_present_recommendedCountryCodes = true && this.isSetRecommendedCountryCodes();
    boolean that_present_recommendedCountryCodes = true && that.isSetRecommendedCountryCodes();
    if (this_present_recommendedCountryCodes || that_present_recommendedCountryCodes) {
      if (!(this_present_recommendedCountryCodes && that_present_recommendedCountryCodes))
        return false;
      if (!this.recommendedCountryCodes.equals(that.recommendedCountryCodes))
        return false;
    }

    boolean this_present_adCountries = true && this.isSetAdCountries();
    boolean that_present_adCountries = true && that.isSetAdCountries();
    if (this_present_adCountries || that_present_adCountries) {
      if (!(this_present_adCountries && that_present_adCountries))
        return false;
      if (!this.adCountries.equals(that.adCountries))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetCurrencyExchangeRates()) ? 131071 : 524287);
    if (isSetCurrencyExchangeRates())
      hashCode = hashCode * 8191 + currencyExchangeRates.hashCode();

    hashCode = hashCode * 8191 + ((isSetRecommendedCountryCodes()) ? 131071 : 524287);
    if (isSetRecommendedCountryCodes())
      hashCode = hashCode * 8191 + recommendedCountryCodes.hashCode();

    hashCode = hashCode * 8191 + ((isSetAdCountries()) ? 131071 : 524287);
    if (isSetAdCountries())
      hashCode = hashCode * 8191 + adCountries.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(PaidCallMetadataResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetCurrencyExchangeRates()).compareTo(other.isSetCurrencyExchangeRates());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurrencyExchangeRates()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.currencyExchangeRates, other.currencyExchangeRates);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecommendedCountryCodes()).compareTo(other.isSetRecommendedCountryCodes());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecommendedCountryCodes()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recommendedCountryCodes, other.recommendedCountryCodes);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAdCountries()).compareTo(other.isSetAdCountries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAdCountries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.adCountries, other.adCountries);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PaidCallMetadataResult(");
    boolean first = true;

    sb.append("currencyExchangeRates:");
    if (this.currencyExchangeRates == null) {
      sb.append("null");
    } else {
      sb.append(this.currencyExchangeRates);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("recommendedCountryCodes:");
    if (this.recommendedCountryCodes == null) {
      sb.append("null");
    } else {
      sb.append(this.recommendedCountryCodes);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("adCountries:");
    if (this.adCountries == null) {
      sb.append("null");
    } else {
      sb.append(this.adCountries);
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PaidCallMetadataResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PaidCallMetadataResultStandardScheme getScheme() {
      return new PaidCallMetadataResultStandardScheme();
    }
  }

  private static class PaidCallMetadataResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<PaidCallMetadataResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PaidCallMetadataResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CURRENCY_EXCHANGE_RATES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list190 = iprot.readListBegin();
                struct.currencyExchangeRates = new java.util.ArrayList<PaidCallCurrencyExchangeRate>(_list190.size);
                PaidCallCurrencyExchangeRate _elem191;
                for (int _i192 = 0; _i192 < _list190.size; ++_i192)
                {
                  _elem191 = new PaidCallCurrencyExchangeRate();
                  _elem191.read(iprot);
                  struct.currencyExchangeRates.add(_elem191);
                }
                iprot.readListEnd();
              }
              struct.setCurrencyExchangeRatesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // RECOMMENDED_COUNTRY_CODES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list193 = iprot.readListBegin();
                struct.recommendedCountryCodes = new java.util.ArrayList<java.lang.String>(_list193.size);
                java.lang.String _elem194;
                for (int _i195 = 0; _i195 < _list193.size; ++_i195)
                {
                  _elem194 = iprot.readString();
                  struct.recommendedCountryCodes.add(_elem194);
                }
                iprot.readListEnd();
              }
              struct.setRecommendedCountryCodesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AD_COUNTRIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list196 = iprot.readListBegin();
                struct.adCountries = new java.util.ArrayList<PaidCallAdCountry>(_list196.size);
                PaidCallAdCountry _elem197;
                for (int _i198 = 0; _i198 < _list196.size; ++_i198)
                {
                  _elem197 = new PaidCallAdCountry();
                  _elem197.read(iprot);
                  struct.adCountries.add(_elem197);
                }
                iprot.readListEnd();
              }
              struct.setAdCountriesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PaidCallMetadataResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.currencyExchangeRates != null) {
        oprot.writeFieldBegin(CURRENCY_EXCHANGE_RATES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.currencyExchangeRates.size()));
          for (PaidCallCurrencyExchangeRate _iter199 : struct.currencyExchangeRates)
          {
            _iter199.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.recommendedCountryCodes != null) {
        oprot.writeFieldBegin(RECOMMENDED_COUNTRY_CODES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.recommendedCountryCodes.size()));
          for (java.lang.String _iter200 : struct.recommendedCountryCodes)
          {
            oprot.writeString(_iter200);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.adCountries != null) {
        oprot.writeFieldBegin(AD_COUNTRIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.adCountries.size()));
          for (PaidCallAdCountry _iter201 : struct.adCountries)
          {
            _iter201.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PaidCallMetadataResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PaidCallMetadataResultTupleScheme getScheme() {
      return new PaidCallMetadataResultTupleScheme();
    }
  }

  private static class PaidCallMetadataResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<PaidCallMetadataResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PaidCallMetadataResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetCurrencyExchangeRates()) {
        optionals.set(0);
      }
      if (struct.isSetRecommendedCountryCodes()) {
        optionals.set(1);
      }
      if (struct.isSetAdCountries()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCurrencyExchangeRates()) {
        {
          oprot.writeI32(struct.currencyExchangeRates.size());
          for (PaidCallCurrencyExchangeRate _iter202 : struct.currencyExchangeRates)
          {
            _iter202.write(oprot);
          }
        }
      }
      if (struct.isSetRecommendedCountryCodes()) {
        {
          oprot.writeI32(struct.recommendedCountryCodes.size());
          for (java.lang.String _iter203 : struct.recommendedCountryCodes)
          {
            oprot.writeString(_iter203);
          }
        }
      }
      if (struct.isSetAdCountries()) {
        {
          oprot.writeI32(struct.adCountries.size());
          for (PaidCallAdCountry _iter204 : struct.adCountries)
          {
            _iter204.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PaidCallMetadataResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list205 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.currencyExchangeRates = new java.util.ArrayList<PaidCallCurrencyExchangeRate>(_list205.size);
          PaidCallCurrencyExchangeRate _elem206;
          for (int _i207 = 0; _i207 < _list205.size; ++_i207)
          {
            _elem206 = new PaidCallCurrencyExchangeRate();
            _elem206.read(iprot);
            struct.currencyExchangeRates.add(_elem206);
          }
        }
        struct.setCurrencyExchangeRatesIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list208 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.recommendedCountryCodes = new java.util.ArrayList<java.lang.String>(_list208.size);
          java.lang.String _elem209;
          for (int _i210 = 0; _i210 < _list208.size; ++_i210)
          {
            _elem209 = iprot.readString();
            struct.recommendedCountryCodes.add(_elem209);
          }
        }
        struct.setRecommendedCountryCodesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list211 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.adCountries = new java.util.ArrayList<PaidCallAdCountry>(_list211.size);
          PaidCallAdCountry _elem212;
          for (int _i213 = 0; _i213 < _list211.size; ++_i213)
          {
            _elem212 = new PaidCallAdCountry();
            _elem212.read(iprot);
            struct.adCountries.add(_elem212);
          }
        }
        struct.setAdCountriesIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

