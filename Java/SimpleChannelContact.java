/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.11.0)", date = "2018-11-17")
public class SimpleChannelContact implements org.apache.thrift.TBase<SimpleChannelContact, SimpleChannelContact._Fields>, java.io.Serializable, Cloneable, Comparable<SimpleChannelContact> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SimpleChannelContact");

  private static final org.apache.thrift.protocol.TField MID_FIELD_DESC = new org.apache.thrift.protocol.TField("mid", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField DISPLAY_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("displayName", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField PICTURE_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("pictureStatus", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField PICTURE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("picturePath", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField STATUS_MESSAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("statusMessage", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SimpleChannelContactStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SimpleChannelContactTupleSchemeFactory();

  public java.lang.String mid; // required
  public java.lang.String displayName; // required
  public java.lang.String pictureStatus; // required
  public java.lang.String picturePath; // required
  public java.lang.String statusMessage; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    MID((short)1, "mid"),
    DISPLAY_NAME((short)2, "displayName"),
    PICTURE_STATUS((short)3, "pictureStatus"),
    PICTURE_PATH((short)4, "picturePath"),
    STATUS_MESSAGE((short)5, "statusMessage");

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
        case 1: // MID
          return MID;
        case 2: // DISPLAY_NAME
          return DISPLAY_NAME;
        case 3: // PICTURE_STATUS
          return PICTURE_STATUS;
        case 4: // PICTURE_PATH
          return PICTURE_PATH;
        case 5: // STATUS_MESSAGE
          return STATUS_MESSAGE;
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
    tmpMap.put(_Fields.MID, new org.apache.thrift.meta_data.FieldMetaData("mid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DISPLAY_NAME, new org.apache.thrift.meta_data.FieldMetaData("displayName", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PICTURE_STATUS, new org.apache.thrift.meta_data.FieldMetaData("pictureStatus", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PICTURE_PATH, new org.apache.thrift.meta_data.FieldMetaData("picturePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STATUS_MESSAGE, new org.apache.thrift.meta_data.FieldMetaData("statusMessage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SimpleChannelContact.class, metaDataMap);
  }

  public SimpleChannelContact() {
  }

  public SimpleChannelContact(
    java.lang.String mid,
    java.lang.String displayName,
    java.lang.String pictureStatus,
    java.lang.String picturePath,
    java.lang.String statusMessage)
  {
    this();
    this.mid = mid;
    this.displayName = displayName;
    this.pictureStatus = pictureStatus;
    this.picturePath = picturePath;
    this.statusMessage = statusMessage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SimpleChannelContact(SimpleChannelContact other) {
    if (other.isSetMid()) {
      this.mid = other.mid;
    }
    if (other.isSetDisplayName()) {
      this.displayName = other.displayName;
    }
    if (other.isSetPictureStatus()) {
      this.pictureStatus = other.pictureStatus;
    }
    if (other.isSetPicturePath()) {
      this.picturePath = other.picturePath;
    }
    if (other.isSetStatusMessage()) {
      this.statusMessage = other.statusMessage;
    }
  }

  public SimpleChannelContact deepCopy() {
    return new SimpleChannelContact(this);
  }

  @Override
  public void clear() {
    this.mid = null;
    this.displayName = null;
    this.pictureStatus = null;
    this.picturePath = null;
    this.statusMessage = null;
  }

  public java.lang.String getMid() {
    return this.mid;
  }

  public SimpleChannelContact setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  public void unsetMid() {
    this.mid = null;
  }

  /** Returns true if field mid is set (has been assigned a value) and false otherwise */
  public boolean isSetMid() {
    return this.mid != null;
  }

  public void setMidIsSet(boolean value) {
    if (!value) {
      this.mid = null;
    }
  }

  public java.lang.String getDisplayName() {
    return this.displayName;
  }

  public SimpleChannelContact setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  public void unsetDisplayName() {
    this.displayName = null;
  }

  /** Returns true if field displayName is set (has been assigned a value) and false otherwise */
  public boolean isSetDisplayName() {
    return this.displayName != null;
  }

  public void setDisplayNameIsSet(boolean value) {
    if (!value) {
      this.displayName = null;
    }
  }

  public java.lang.String getPictureStatus() {
    return this.pictureStatus;
  }

  public SimpleChannelContact setPictureStatus(java.lang.String pictureStatus) {
    this.pictureStatus = pictureStatus;
    return this;
  }

  public void unsetPictureStatus() {
    this.pictureStatus = null;
  }

  /** Returns true if field pictureStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetPictureStatus() {
    return this.pictureStatus != null;
  }

  public void setPictureStatusIsSet(boolean value) {
    if (!value) {
      this.pictureStatus = null;
    }
  }

  public java.lang.String getPicturePath() {
    return this.picturePath;
  }

  public SimpleChannelContact setPicturePath(java.lang.String picturePath) {
    this.picturePath = picturePath;
    return this;
  }

  public void unsetPicturePath() {
    this.picturePath = null;
  }

  /** Returns true if field picturePath is set (has been assigned a value) and false otherwise */
  public boolean isSetPicturePath() {
    return this.picturePath != null;
  }

  public void setPicturePathIsSet(boolean value) {
    if (!value) {
      this.picturePath = null;
    }
  }

  public java.lang.String getStatusMessage() {
    return this.statusMessage;
  }

  public SimpleChannelContact setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  public void unsetStatusMessage() {
    this.statusMessage = null;
  }

  /** Returns true if field statusMessage is set (has been assigned a value) and false otherwise */
  public boolean isSetStatusMessage() {
    return this.statusMessage != null;
  }

  public void setStatusMessageIsSet(boolean value) {
    if (!value) {
      this.statusMessage = null;
    }
  }

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case MID:
      if (value == null) {
        unsetMid();
      } else {
        setMid((java.lang.String)value);
      }
      break;

    case DISPLAY_NAME:
      if (value == null) {
        unsetDisplayName();
      } else {
        setDisplayName((java.lang.String)value);
      }
      break;

    case PICTURE_STATUS:
      if (value == null) {
        unsetPictureStatus();
      } else {
        setPictureStatus((java.lang.String)value);
      }
      break;

    case PICTURE_PATH:
      if (value == null) {
        unsetPicturePath();
      } else {
        setPicturePath((java.lang.String)value);
      }
      break;

    case STATUS_MESSAGE:
      if (value == null) {
        unsetStatusMessage();
      } else {
        setStatusMessage((java.lang.String)value);
      }
      break;

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case MID:
      return getMid();

    case DISPLAY_NAME:
      return getDisplayName();

    case PICTURE_STATUS:
      return getPictureStatus();

    case PICTURE_PATH:
      return getPicturePath();

    case STATUS_MESSAGE:
      return getStatusMessage();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case MID:
      return isSetMid();
    case DISPLAY_NAME:
      return isSetDisplayName();
    case PICTURE_STATUS:
      return isSetPictureStatus();
    case PICTURE_PATH:
      return isSetPicturePath();
    case STATUS_MESSAGE:
      return isSetStatusMessage();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SimpleChannelContact)
      return this.equals((SimpleChannelContact)that);
    return false;
  }

  public boolean equals(SimpleChannelContact that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_mid = true && this.isSetMid();
    boolean that_present_mid = true && that.isSetMid();
    if (this_present_mid || that_present_mid) {
      if (!(this_present_mid && that_present_mid))
        return false;
      if (!this.mid.equals(that.mid))
        return false;
    }

    boolean this_present_displayName = true && this.isSetDisplayName();
    boolean that_present_displayName = true && that.isSetDisplayName();
    if (this_present_displayName || that_present_displayName) {
      if (!(this_present_displayName && that_present_displayName))
        return false;
      if (!this.displayName.equals(that.displayName))
        return false;
    }

    boolean this_present_pictureStatus = true && this.isSetPictureStatus();
    boolean that_present_pictureStatus = true && that.isSetPictureStatus();
    if (this_present_pictureStatus || that_present_pictureStatus) {
      if (!(this_present_pictureStatus && that_present_pictureStatus))
        return false;
      if (!this.pictureStatus.equals(that.pictureStatus))
        return false;
    }

    boolean this_present_picturePath = true && this.isSetPicturePath();
    boolean that_present_picturePath = true && that.isSetPicturePath();
    if (this_present_picturePath || that_present_picturePath) {
      if (!(this_present_picturePath && that_present_picturePath))
        return false;
      if (!this.picturePath.equals(that.picturePath))
        return false;
    }

    boolean this_present_statusMessage = true && this.isSetStatusMessage();
    boolean that_present_statusMessage = true && that.isSetStatusMessage();
    if (this_present_statusMessage || that_present_statusMessage) {
      if (!(this_present_statusMessage && that_present_statusMessage))
        return false;
      if (!this.statusMessage.equals(that.statusMessage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetMid()) ? 131071 : 524287);
    if (isSetMid())
      hashCode = hashCode * 8191 + mid.hashCode();

    hashCode = hashCode * 8191 + ((isSetDisplayName()) ? 131071 : 524287);
    if (isSetDisplayName())
      hashCode = hashCode * 8191 + displayName.hashCode();

    hashCode = hashCode * 8191 + ((isSetPictureStatus()) ? 131071 : 524287);
    if (isSetPictureStatus())
      hashCode = hashCode * 8191 + pictureStatus.hashCode();

    hashCode = hashCode * 8191 + ((isSetPicturePath()) ? 131071 : 524287);
    if (isSetPicturePath())
      hashCode = hashCode * 8191 + picturePath.hashCode();

    hashCode = hashCode * 8191 + ((isSetStatusMessage()) ? 131071 : 524287);
    if (isSetStatusMessage())
      hashCode = hashCode * 8191 + statusMessage.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SimpleChannelContact other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetMid()).compareTo(other.isSetMid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.mid, other.mid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDisplayName()).compareTo(other.isSetDisplayName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDisplayName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.displayName, other.displayName);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPictureStatus()).compareTo(other.isSetPictureStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPictureStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.pictureStatus, other.pictureStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPicturePath()).compareTo(other.isSetPicturePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPicturePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.picturePath, other.picturePath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStatusMessage()).compareTo(other.isSetStatusMessage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatusMessage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.statusMessage, other.statusMessage);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SimpleChannelContact(");
    boolean first = true;

    sb.append("mid:");
    if (this.mid == null) {
      sb.append("null");
    } else {
      sb.append(this.mid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("displayName:");
    if (this.displayName == null) {
      sb.append("null");
    } else {
      sb.append(this.displayName);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("pictureStatus:");
    if (this.pictureStatus == null) {
      sb.append("null");
    } else {
      sb.append(this.pictureStatus);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("picturePath:");
    if (this.picturePath == null) {
      sb.append("null");
    } else {
      sb.append(this.picturePath);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("statusMessage:");
    if (this.statusMessage == null) {
      sb.append("null");
    } else {
      sb.append(this.statusMessage);
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

  private static class SimpleChannelContactStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SimpleChannelContactStandardScheme getScheme() {
      return new SimpleChannelContactStandardScheme();
    }
  }

  private static class SimpleChannelContactStandardScheme extends org.apache.thrift.scheme.StandardScheme<SimpleChannelContact> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SimpleChannelContact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // MID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.mid = iprot.readString();
              struct.setMidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DISPLAY_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.displayName = iprot.readString();
              struct.setDisplayNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PICTURE_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.pictureStatus = iprot.readString();
              struct.setPictureStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // PICTURE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.picturePath = iprot.readString();
              struct.setPicturePathIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // STATUS_MESSAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.statusMessage = iprot.readString();
              struct.setStatusMessageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SimpleChannelContact struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.mid != null) {
        oprot.writeFieldBegin(MID_FIELD_DESC);
        oprot.writeString(struct.mid);
        oprot.writeFieldEnd();
      }
      if (struct.displayName != null) {
        oprot.writeFieldBegin(DISPLAY_NAME_FIELD_DESC);
        oprot.writeString(struct.displayName);
        oprot.writeFieldEnd();
      }
      if (struct.pictureStatus != null) {
        oprot.writeFieldBegin(PICTURE_STATUS_FIELD_DESC);
        oprot.writeString(struct.pictureStatus);
        oprot.writeFieldEnd();
      }
      if (struct.picturePath != null) {
        oprot.writeFieldBegin(PICTURE_PATH_FIELD_DESC);
        oprot.writeString(struct.picturePath);
        oprot.writeFieldEnd();
      }
      if (struct.statusMessage != null) {
        oprot.writeFieldBegin(STATUS_MESSAGE_FIELD_DESC);
        oprot.writeString(struct.statusMessage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SimpleChannelContactTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SimpleChannelContactTupleScheme getScheme() {
      return new SimpleChannelContactTupleScheme();
    }
  }

  private static class SimpleChannelContactTupleScheme extends org.apache.thrift.scheme.TupleScheme<SimpleChannelContact> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SimpleChannelContact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetMid()) {
        optionals.set(0);
      }
      if (struct.isSetDisplayName()) {
        optionals.set(1);
      }
      if (struct.isSetPictureStatus()) {
        optionals.set(2);
      }
      if (struct.isSetPicturePath()) {
        optionals.set(3);
      }
      if (struct.isSetStatusMessage()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetMid()) {
        oprot.writeString(struct.mid);
      }
      if (struct.isSetDisplayName()) {
        oprot.writeString(struct.displayName);
      }
      if (struct.isSetPictureStatus()) {
        oprot.writeString(struct.pictureStatus);
      }
      if (struct.isSetPicturePath()) {
        oprot.writeString(struct.picturePath);
      }
      if (struct.isSetStatusMessage()) {
        oprot.writeString(struct.statusMessage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SimpleChannelContact struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.mid = iprot.readString();
        struct.setMidIsSet(true);
      }
      if (incoming.get(1)) {
        struct.displayName = iprot.readString();
        struct.setDisplayNameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.pictureStatus = iprot.readString();
        struct.setPictureStatusIsSet(true);
      }
      if (incoming.get(3)) {
        struct.picturePath = iprot.readString();
        struct.setPicturePathIsSet(true);
      }
      if (incoming.get(4)) {
        struct.statusMessage = iprot.readString();
        struct.setStatusMessageIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

