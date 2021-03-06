/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2019-09-28")
public class PhoneVerificationResult implements org.apache.thrift.TBase<PhoneVerificationResult, PhoneVerificationResult._Fields>, java.io.Serializable, Cloneable, Comparable<PhoneVerificationResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PhoneVerificationResult");

  private static final org.apache.thrift.protocol.TField VERIFICATION_RESULT_FIELD_DESC = new org.apache.thrift.protocol.TField("verificationResult", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ACCOUNT_MIGRATION_CHECK_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("accountMigrationCheckType", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField RECOMMEND_ADD_FRIENDS_FIELD_DESC = new org.apache.thrift.protocol.TField("recommendAddFriends", org.apache.thrift.protocol.TType.BOOL, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PhoneVerificationResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PhoneVerificationResultTupleSchemeFactory();

  /**
   * 
   * @see VerificationResult
   */
  public @org.apache.thrift.annotation.Nullable VerificationResult verificationResult; // required
  /**
   * 
   * @see AccountMigrationCheckType
   */
  public @org.apache.thrift.annotation.Nullable AccountMigrationCheckType accountMigrationCheckType; // required
  public boolean recommendAddFriends; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see VerificationResult
     */
    VERIFICATION_RESULT((short)1, "verificationResult"),
    /**
     * 
     * @see AccountMigrationCheckType
     */
    ACCOUNT_MIGRATION_CHECK_TYPE((short)2, "accountMigrationCheckType"),
    RECOMMEND_ADD_FRIENDS((short)3, "recommendAddFriends");

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
        case 1: // VERIFICATION_RESULT
          return VERIFICATION_RESULT;
        case 2: // ACCOUNT_MIGRATION_CHECK_TYPE
          return ACCOUNT_MIGRATION_CHECK_TYPE;
        case 3: // RECOMMEND_ADD_FRIENDS
          return RECOMMEND_ADD_FRIENDS;
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
  private static final int __RECOMMENDADDFRIENDS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VERIFICATION_RESULT, new org.apache.thrift.meta_data.FieldMetaData("verificationResult", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, VerificationResult.class)));
    tmpMap.put(_Fields.ACCOUNT_MIGRATION_CHECK_TYPE, new org.apache.thrift.meta_data.FieldMetaData("accountMigrationCheckType", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, AccountMigrationCheckType.class)));
    tmpMap.put(_Fields.RECOMMEND_ADD_FRIENDS, new org.apache.thrift.meta_data.FieldMetaData("recommendAddFriends", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PhoneVerificationResult.class, metaDataMap);
  }

  public PhoneVerificationResult() {
  }

  public PhoneVerificationResult(
    VerificationResult verificationResult,
    AccountMigrationCheckType accountMigrationCheckType,
    boolean recommendAddFriends)
  {
    this();
    this.verificationResult = verificationResult;
    this.accountMigrationCheckType = accountMigrationCheckType;
    this.recommendAddFriends = recommendAddFriends;
    setRecommendAddFriendsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PhoneVerificationResult(PhoneVerificationResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetVerificationResult()) {
      this.verificationResult = other.verificationResult;
    }
    if (other.isSetAccountMigrationCheckType()) {
      this.accountMigrationCheckType = other.accountMigrationCheckType;
    }
    this.recommendAddFriends = other.recommendAddFriends;
  }

  public PhoneVerificationResult deepCopy() {
    return new PhoneVerificationResult(this);
  }

  @Override
  public void clear() {
    this.verificationResult = null;
    this.accountMigrationCheckType = null;
    setRecommendAddFriendsIsSet(false);
    this.recommendAddFriends = false;
  }

  /**
   * 
   * @see VerificationResult
   */
  @org.apache.thrift.annotation.Nullable
  public VerificationResult getVerificationResult() {
    return this.verificationResult;
  }

  /**
   * 
   * @see VerificationResult
   */
  public PhoneVerificationResult setVerificationResult(@org.apache.thrift.annotation.Nullable VerificationResult verificationResult) {
    this.verificationResult = verificationResult;
    return this;
  }

  public void unsetVerificationResult() {
    this.verificationResult = null;
  }

  /** Returns true if field verificationResult is set (has been assigned a value) and false otherwise */
  public boolean isSetVerificationResult() {
    return this.verificationResult != null;
  }

  public void setVerificationResultIsSet(boolean value) {
    if (!value) {
      this.verificationResult = null;
    }
  }

  /**
   * 
   * @see AccountMigrationCheckType
   */
  @org.apache.thrift.annotation.Nullable
  public AccountMigrationCheckType getAccountMigrationCheckType() {
    return this.accountMigrationCheckType;
  }

  /**
   * 
   * @see AccountMigrationCheckType
   */
  public PhoneVerificationResult setAccountMigrationCheckType(@org.apache.thrift.annotation.Nullable AccountMigrationCheckType accountMigrationCheckType) {
    this.accountMigrationCheckType = accountMigrationCheckType;
    return this;
  }

  public void unsetAccountMigrationCheckType() {
    this.accountMigrationCheckType = null;
  }

  /** Returns true if field accountMigrationCheckType is set (has been assigned a value) and false otherwise */
  public boolean isSetAccountMigrationCheckType() {
    return this.accountMigrationCheckType != null;
  }

  public void setAccountMigrationCheckTypeIsSet(boolean value) {
    if (!value) {
      this.accountMigrationCheckType = null;
    }
  }

  public boolean isRecommendAddFriends() {
    return this.recommendAddFriends;
  }

  public PhoneVerificationResult setRecommendAddFriends(boolean recommendAddFriends) {
    this.recommendAddFriends = recommendAddFriends;
    setRecommendAddFriendsIsSet(true);
    return this;
  }

  public void unsetRecommendAddFriends() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RECOMMENDADDFRIENDS_ISSET_ID);
  }

  /** Returns true if field recommendAddFriends is set (has been assigned a value) and false otherwise */
  public boolean isSetRecommendAddFriends() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RECOMMENDADDFRIENDS_ISSET_ID);
  }

  public void setRecommendAddFriendsIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RECOMMENDADDFRIENDS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VERIFICATION_RESULT:
      if (value == null) {
        unsetVerificationResult();
      } else {
        setVerificationResult((VerificationResult)value);
      }
      break;

    case ACCOUNT_MIGRATION_CHECK_TYPE:
      if (value == null) {
        unsetAccountMigrationCheckType();
      } else {
        setAccountMigrationCheckType((AccountMigrationCheckType)value);
      }
      break;

    case RECOMMEND_ADD_FRIENDS:
      if (value == null) {
        unsetRecommendAddFriends();
      } else {
        setRecommendAddFriends((java.lang.Boolean)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VERIFICATION_RESULT:
      return getVerificationResult();

    case ACCOUNT_MIGRATION_CHECK_TYPE:
      return getAccountMigrationCheckType();

    case RECOMMEND_ADD_FRIENDS:
      return isRecommendAddFriends();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case VERIFICATION_RESULT:
      return isSetVerificationResult();
    case ACCOUNT_MIGRATION_CHECK_TYPE:
      return isSetAccountMigrationCheckType();
    case RECOMMEND_ADD_FRIENDS:
      return isSetRecommendAddFriends();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof PhoneVerificationResult)
      return this.equals((PhoneVerificationResult)that);
    return false;
  }

  public boolean equals(PhoneVerificationResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_verificationResult = true && this.isSetVerificationResult();
    boolean that_present_verificationResult = true && that.isSetVerificationResult();
    if (this_present_verificationResult || that_present_verificationResult) {
      if (!(this_present_verificationResult && that_present_verificationResult))
        return false;
      if (!this.verificationResult.equals(that.verificationResult))
        return false;
    }

    boolean this_present_accountMigrationCheckType = true && this.isSetAccountMigrationCheckType();
    boolean that_present_accountMigrationCheckType = true && that.isSetAccountMigrationCheckType();
    if (this_present_accountMigrationCheckType || that_present_accountMigrationCheckType) {
      if (!(this_present_accountMigrationCheckType && that_present_accountMigrationCheckType))
        return false;
      if (!this.accountMigrationCheckType.equals(that.accountMigrationCheckType))
        return false;
    }

    boolean this_present_recommendAddFriends = true;
    boolean that_present_recommendAddFriends = true;
    if (this_present_recommendAddFriends || that_present_recommendAddFriends) {
      if (!(this_present_recommendAddFriends && that_present_recommendAddFriends))
        return false;
      if (this.recommendAddFriends != that.recommendAddFriends)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetVerificationResult()) ? 131071 : 524287);
    if (isSetVerificationResult())
      hashCode = hashCode * 8191 + verificationResult.getValue();

    hashCode = hashCode * 8191 + ((isSetAccountMigrationCheckType()) ? 131071 : 524287);
    if (isSetAccountMigrationCheckType())
      hashCode = hashCode * 8191 + accountMigrationCheckType.getValue();

    hashCode = hashCode * 8191 + ((recommendAddFriends) ? 131071 : 524287);

    return hashCode;
  }

  @Override
  public int compareTo(PhoneVerificationResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetVerificationResult()).compareTo(other.isSetVerificationResult());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVerificationResult()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.verificationResult, other.verificationResult);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAccountMigrationCheckType()).compareTo(other.isSetAccountMigrationCheckType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccountMigrationCheckType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accountMigrationCheckType, other.accountMigrationCheckType);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRecommendAddFriends()).compareTo(other.isSetRecommendAddFriends());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRecommendAddFriends()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.recommendAddFriends, other.recommendAddFriends);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("PhoneVerificationResult(");
    boolean first = true;

    sb.append("verificationResult:");
    if (this.verificationResult == null) {
      sb.append("null");
    } else {
      sb.append(this.verificationResult);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("accountMigrationCheckType:");
    if (this.accountMigrationCheckType == null) {
      sb.append("null");
    } else {
      sb.append(this.accountMigrationCheckType);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("recommendAddFriends:");
    sb.append(this.recommendAddFriends);
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

  private static class PhoneVerificationResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PhoneVerificationResultStandardScheme getScheme() {
      return new PhoneVerificationResultStandardScheme();
    }
  }

  private static class PhoneVerificationResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<PhoneVerificationResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PhoneVerificationResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VERIFICATION_RESULT
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.verificationResult = VerificationResult.findByValue(iprot.readI32());
              struct.setVerificationResultIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACCOUNT_MIGRATION_CHECK_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.accountMigrationCheckType = AccountMigrationCheckType.findByValue(iprot.readI32());
              struct.setAccountMigrationCheckTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RECOMMEND_ADD_FRIENDS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.recommendAddFriends = iprot.readBool();
              struct.setRecommendAddFriendsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PhoneVerificationResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.verificationResult != null) {
        oprot.writeFieldBegin(VERIFICATION_RESULT_FIELD_DESC);
        oprot.writeI32(struct.verificationResult.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.accountMigrationCheckType != null) {
        oprot.writeFieldBegin(ACCOUNT_MIGRATION_CHECK_TYPE_FIELD_DESC);
        oprot.writeI32(struct.accountMigrationCheckType.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(RECOMMEND_ADD_FRIENDS_FIELD_DESC);
      oprot.writeBool(struct.recommendAddFriends);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PhoneVerificationResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PhoneVerificationResultTupleScheme getScheme() {
      return new PhoneVerificationResultTupleScheme();
    }
  }

  private static class PhoneVerificationResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<PhoneVerificationResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PhoneVerificationResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetVerificationResult()) {
        optionals.set(0);
      }
      if (struct.isSetAccountMigrationCheckType()) {
        optionals.set(1);
      }
      if (struct.isSetRecommendAddFriends()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetVerificationResult()) {
        oprot.writeI32(struct.verificationResult.getValue());
      }
      if (struct.isSetAccountMigrationCheckType()) {
        oprot.writeI32(struct.accountMigrationCheckType.getValue());
      }
      if (struct.isSetRecommendAddFriends()) {
        oprot.writeBool(struct.recommendAddFriends);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PhoneVerificationResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.verificationResult = VerificationResult.findByValue(iprot.readI32());
        struct.setVerificationResultIsSet(true);
      }
      if (incoming.get(1)) {
        struct.accountMigrationCheckType = AccountMigrationCheckType.findByValue(iprot.readI32());
        struct.setAccountMigrationCheckTypeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.recommendAddFriends = iprot.readBool();
        struct.setRecommendAddFriendsIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

