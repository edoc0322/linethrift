/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class AgeCheckRequestResult implements org.apache.thrift.TBase<AgeCheckRequestResult, AgeCheckRequestResult._Fields>, java.io.Serializable, Cloneable, Comparable<AgeCheckRequestResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AgeCheckRequestResult");

  private static final org.apache.thrift.protocol.TField AUTH_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("authUrl", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SESSION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("sessionId", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AgeCheckRequestResultStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AgeCheckRequestResultTupleSchemeFactory();

  public java.lang.String authUrl; // required
  public java.lang.String sessionId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    AUTH_URL((short)1, "authUrl"),
    SESSION_ID((short)2, "sessionId");

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
        case 1: // AUTH_URL
          return AUTH_URL;
        case 2: // SESSION_ID
          return SESSION_ID;
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
    tmpMap.put(_Fields.AUTH_URL, new org.apache.thrift.meta_data.FieldMetaData("authUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SESSION_ID, new org.apache.thrift.meta_data.FieldMetaData("sessionId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AgeCheckRequestResult.class, metaDataMap);
  }

  public AgeCheckRequestResult() {
  }

  public AgeCheckRequestResult(
    java.lang.String authUrl,
    java.lang.String sessionId)
  {
    this();
    this.authUrl = authUrl;
    this.sessionId = sessionId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AgeCheckRequestResult(AgeCheckRequestResult other) {
    if (other.isSetAuthUrl()) {
      this.authUrl = other.authUrl;
    }
    if (other.isSetSessionId()) {
      this.sessionId = other.sessionId;
    }
  }

  public AgeCheckRequestResult deepCopy() {
    return new AgeCheckRequestResult(this);
  }

  @Override
  public void clear() {
    this.authUrl = null;
    this.sessionId = null;
  }

  public java.lang.String getAuthUrl() {
    return this.authUrl;
  }

  public AgeCheckRequestResult setAuthUrl(java.lang.String authUrl) {
    this.authUrl = authUrl;
    return this;
  }

  public void unsetAuthUrl() {
    this.authUrl = null;
  }

  /** Returns true if field authUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthUrl() {
    return this.authUrl != null;
  }

  public void setAuthUrlIsSet(boolean value) {
    if (!value) {
      this.authUrl = null;
    }
  }

  public java.lang.String getSessionId() {
    return this.sessionId;
  }

  public AgeCheckRequestResult setSessionId(java.lang.String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public void unsetSessionId() {
    this.sessionId = null;
  }

  /** Returns true if field sessionId is set (has been assigned a value) and false otherwise */
  public boolean isSetSessionId() {
    return this.sessionId != null;
  }

  public void setSessionIdIsSet(boolean value) {
    if (!value) {
      this.sessionId = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case AUTH_URL:
      if (value == null) {
        unsetAuthUrl();
      } else {
        setAuthUrl((java.lang.String)value);
      }
      break;

    case SESSION_ID:
      if (value == null) {
        unsetSessionId();
      } else {
        setSessionId((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case AUTH_URL:
      return getAuthUrl();

    case SESSION_ID:
      return getSessionId();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case AUTH_URL:
      return isSetAuthUrl();
    case SESSION_ID:
      return isSetSessionId();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AgeCheckRequestResult)
      return this.equals((AgeCheckRequestResult)that);
    return false;
  }

  public boolean equals(AgeCheckRequestResult that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_authUrl = true && this.isSetAuthUrl();
    boolean that_present_authUrl = true && that.isSetAuthUrl();
    if (this_present_authUrl || that_present_authUrl) {
      if (!(this_present_authUrl && that_present_authUrl))
        return false;
      if (!this.authUrl.equals(that.authUrl))
        return false;
    }

    boolean this_present_sessionId = true && this.isSetSessionId();
    boolean that_present_sessionId = true && that.isSetSessionId();
    if (this_present_sessionId || that_present_sessionId) {
      if (!(this_present_sessionId && that_present_sessionId))
        return false;
      if (!this.sessionId.equals(that.sessionId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetAuthUrl()) ? 131071 : 524287);
    if (isSetAuthUrl())
      hashCode = hashCode * 8191 + authUrl.hashCode();

    hashCode = hashCode * 8191 + ((isSetSessionId()) ? 131071 : 524287);
    if (isSetSessionId())
      hashCode = hashCode * 8191 + sessionId.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AgeCheckRequestResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetAuthUrl()).compareTo(other.isSetAuthUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authUrl, other.authUrl);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSessionId()).compareTo(other.isSetSessionId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSessionId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sessionId, other.sessionId);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AgeCheckRequestResult(");
    boolean first = true;

    sb.append("authUrl:");
    if (this.authUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.authUrl);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sessionId:");
    if (this.sessionId == null) {
      sb.append("null");
    } else {
      sb.append(this.sessionId);
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

  private static class AgeCheckRequestResultStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AgeCheckRequestResultStandardScheme getScheme() {
      return new AgeCheckRequestResultStandardScheme();
    }
  }

  private static class AgeCheckRequestResultStandardScheme extends org.apache.thrift.scheme.StandardScheme<AgeCheckRequestResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AgeCheckRequestResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AUTH_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.authUrl = iprot.readString();
              struct.setAuthUrlIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SESSION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sessionId = iprot.readString();
              struct.setSessionIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AgeCheckRequestResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.authUrl != null) {
        oprot.writeFieldBegin(AUTH_URL_FIELD_DESC);
        oprot.writeString(struct.authUrl);
        oprot.writeFieldEnd();
      }
      if (struct.sessionId != null) {
        oprot.writeFieldBegin(SESSION_ID_FIELD_DESC);
        oprot.writeString(struct.sessionId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AgeCheckRequestResultTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AgeCheckRequestResultTupleScheme getScheme() {
      return new AgeCheckRequestResultTupleScheme();
    }
  }

  private static class AgeCheckRequestResultTupleScheme extends org.apache.thrift.scheme.TupleScheme<AgeCheckRequestResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AgeCheckRequestResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetAuthUrl()) {
        optionals.set(0);
      }
      if (struct.isSetSessionId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetAuthUrl()) {
        oprot.writeString(struct.authUrl);
      }
      if (struct.isSetSessionId()) {
        oprot.writeString(struct.sessionId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AgeCheckRequestResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.authUrl = iprot.readString();
        struct.setAuthUrlIsSet(true);
      }
      if (incoming.get(1)) {
        struct.sessionId = iprot.readString();
        struct.setSessionIdIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

