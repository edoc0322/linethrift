/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class AuthQrcode implements org.apache.thrift.TBase<AuthQrcode, AuthQrcode._Fields>, java.io.Serializable, Cloneable, Comparable<AuthQrcode> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthQrcode");

  private static final org.apache.thrift.protocol.TField QRCODE_FIELD_DESC = new org.apache.thrift.protocol.TField("qrcode", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField VERIFIER_FIELD_DESC = new org.apache.thrift.protocol.TField("verifier", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CALLBACK_URL_FIELD_DESC = new org.apache.thrift.protocol.TField("callbackUrl", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new AuthQrcodeStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new AuthQrcodeTupleSchemeFactory();

  public java.lang.String qrcode; // required
  public java.lang.String verifier; // required
  public java.lang.String callbackUrl; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    QRCODE((short)1, "qrcode"),
    VERIFIER((short)2, "verifier"),
    CALLBACK_URL((short)3, "callbackUrl");

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
        case 1: // QRCODE
          return QRCODE;
        case 2: // VERIFIER
          return VERIFIER;
        case 3: // CALLBACK_URL
          return CALLBACK_URL;
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
    tmpMap.put(_Fields.QRCODE, new org.apache.thrift.meta_data.FieldMetaData("qrcode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VERIFIER, new org.apache.thrift.meta_data.FieldMetaData("verifier", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CALLBACK_URL, new org.apache.thrift.meta_data.FieldMetaData("callbackUrl", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthQrcode.class, metaDataMap);
  }

  public AuthQrcode() {
  }

  public AuthQrcode(
    java.lang.String qrcode,
    java.lang.String verifier,
    java.lang.String callbackUrl)
  {
    this();
    this.qrcode = qrcode;
    this.verifier = verifier;
    this.callbackUrl = callbackUrl;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthQrcode(AuthQrcode other) {
    if (other.isSetQrcode()) {
      this.qrcode = other.qrcode;
    }
    if (other.isSetVerifier()) {
      this.verifier = other.verifier;
    }
    if (other.isSetCallbackUrl()) {
      this.callbackUrl = other.callbackUrl;
    }
  }

  public AuthQrcode deepCopy() {
    return new AuthQrcode(this);
  }

  @Override
  public void clear() {
    this.qrcode = null;
    this.verifier = null;
    this.callbackUrl = null;
  }

  public java.lang.String getQrcode() {
    return this.qrcode;
  }

  public AuthQrcode setQrcode(java.lang.String qrcode) {
    this.qrcode = qrcode;
    return this;
  }

  public void unsetQrcode() {
    this.qrcode = null;
  }

  /** Returns true if field qrcode is set (has been assigned a value) and false otherwise */
  public boolean isSetQrcode() {
    return this.qrcode != null;
  }

  public void setQrcodeIsSet(boolean value) {
    if (!value) {
      this.qrcode = null;
    }
  }

  public java.lang.String getVerifier() {
    return this.verifier;
  }

  public AuthQrcode setVerifier(java.lang.String verifier) {
    this.verifier = verifier;
    return this;
  }

  public void unsetVerifier() {
    this.verifier = null;
  }

  /** Returns true if field verifier is set (has been assigned a value) and false otherwise */
  public boolean isSetVerifier() {
    return this.verifier != null;
  }

  public void setVerifierIsSet(boolean value) {
    if (!value) {
      this.verifier = null;
    }
  }

  public java.lang.String getCallbackUrl() {
    return this.callbackUrl;
  }

  public AuthQrcode setCallbackUrl(java.lang.String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  public void unsetCallbackUrl() {
    this.callbackUrl = null;
  }

  /** Returns true if field callbackUrl is set (has been assigned a value) and false otherwise */
  public boolean isSetCallbackUrl() {
    return this.callbackUrl != null;
  }

  public void setCallbackUrlIsSet(boolean value) {
    if (!value) {
      this.callbackUrl = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case QRCODE:
      if (value == null) {
        unsetQrcode();
      } else {
        setQrcode((java.lang.String)value);
      }
      break;

    case VERIFIER:
      if (value == null) {
        unsetVerifier();
      } else {
        setVerifier((java.lang.String)value);
      }
      break;

    case CALLBACK_URL:
      if (value == null) {
        unsetCallbackUrl();
      } else {
        setCallbackUrl((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case QRCODE:
      return getQrcode();

    case VERIFIER:
      return getVerifier();

    case CALLBACK_URL:
      return getCallbackUrl();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case QRCODE:
      return isSetQrcode();
    case VERIFIER:
      return isSetVerifier();
    case CALLBACK_URL:
      return isSetCallbackUrl();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthQrcode)
      return this.equals((AuthQrcode)that);
    return false;
  }

  public boolean equals(AuthQrcode that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_qrcode = true && this.isSetQrcode();
    boolean that_present_qrcode = true && that.isSetQrcode();
    if (this_present_qrcode || that_present_qrcode) {
      if (!(this_present_qrcode && that_present_qrcode))
        return false;
      if (!this.qrcode.equals(that.qrcode))
        return false;
    }

    boolean this_present_verifier = true && this.isSetVerifier();
    boolean that_present_verifier = true && that.isSetVerifier();
    if (this_present_verifier || that_present_verifier) {
      if (!(this_present_verifier && that_present_verifier))
        return false;
      if (!this.verifier.equals(that.verifier))
        return false;
    }

    boolean this_present_callbackUrl = true && this.isSetCallbackUrl();
    boolean that_present_callbackUrl = true && that.isSetCallbackUrl();
    if (this_present_callbackUrl || that_present_callbackUrl) {
      if (!(this_present_callbackUrl && that_present_callbackUrl))
        return false;
      if (!this.callbackUrl.equals(that.callbackUrl))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetQrcode()) ? 131071 : 524287);
    if (isSetQrcode())
      hashCode = hashCode * 8191 + qrcode.hashCode();

    hashCode = hashCode * 8191 + ((isSetVerifier()) ? 131071 : 524287);
    if (isSetVerifier())
      hashCode = hashCode * 8191 + verifier.hashCode();

    hashCode = hashCode * 8191 + ((isSetCallbackUrl()) ? 131071 : 524287);
    if (isSetCallbackUrl())
      hashCode = hashCode * 8191 + callbackUrl.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(AuthQrcode other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetQrcode()).compareTo(other.isSetQrcode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetQrcode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.qrcode, other.qrcode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetVerifier()).compareTo(other.isSetVerifier());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVerifier()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.verifier, other.verifier);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCallbackUrl()).compareTo(other.isSetCallbackUrl());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCallbackUrl()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.callbackUrl, other.callbackUrl);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthQrcode(");
    boolean first = true;

    sb.append("qrcode:");
    if (this.qrcode == null) {
      sb.append("null");
    } else {
      sb.append(this.qrcode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("verifier:");
    if (this.verifier == null) {
      sb.append("null");
    } else {
      sb.append(this.verifier);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("callbackUrl:");
    if (this.callbackUrl == null) {
      sb.append("null");
    } else {
      sb.append(this.callbackUrl);
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

  private static class AuthQrcodeStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AuthQrcodeStandardScheme getScheme() {
      return new AuthQrcodeStandardScheme();
    }
  }

  private static class AuthQrcodeStandardScheme extends org.apache.thrift.scheme.StandardScheme<AuthQrcode> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthQrcode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // QRCODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.qrcode = iprot.readString();
              struct.setQrcodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VERIFIER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.verifier = iprot.readString();
              struct.setVerifierIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CALLBACK_URL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.callbackUrl = iprot.readString();
              struct.setCallbackUrlIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthQrcode struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.qrcode != null) {
        oprot.writeFieldBegin(QRCODE_FIELD_DESC);
        oprot.writeString(struct.qrcode);
        oprot.writeFieldEnd();
      }
      if (struct.verifier != null) {
        oprot.writeFieldBegin(VERIFIER_FIELD_DESC);
        oprot.writeString(struct.verifier);
        oprot.writeFieldEnd();
      }
      if (struct.callbackUrl != null) {
        oprot.writeFieldBegin(CALLBACK_URL_FIELD_DESC);
        oprot.writeString(struct.callbackUrl);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthQrcodeTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public AuthQrcodeTupleScheme getScheme() {
      return new AuthQrcodeTupleScheme();
    }
  }

  private static class AuthQrcodeTupleScheme extends org.apache.thrift.scheme.TupleScheme<AuthQrcode> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuthQrcode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetQrcode()) {
        optionals.set(0);
      }
      if (struct.isSetVerifier()) {
        optionals.set(1);
      }
      if (struct.isSetCallbackUrl()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetQrcode()) {
        oprot.writeString(struct.qrcode);
      }
      if (struct.isSetVerifier()) {
        oprot.writeString(struct.verifier);
      }
      if (struct.isSetCallbackUrl()) {
        oprot.writeString(struct.callbackUrl);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuthQrcode struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.qrcode = iprot.readString();
        struct.setQrcodeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.verifier = iprot.readString();
        struct.setVerifierIsSet(true);
      }
      if (incoming.get(2)) {
        struct.callbackUrl = iprot.readString();
        struct.setCallbackUrlIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

