/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import java.util.Hashtable;
import java.util.Vector;
import java.util.Enumeration;

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

public class ProductCategory implements TBase {
  private static final TStruct STRUCT_DESC = new TStruct("ProductCategory");

  private static final TField PRODUCT_CATEGORY_ID_FIELD_DESC = new TField("productCategoryId", TType.I64, (short)1);
  private static final TField TITLE_FIELD_DESC = new TField("title", TType.STRING, (short)2);
  private static final TField PRODUCT_COUNT_FIELD_DESC = new TField("productCount", TType.I32, (short)3);
  private static final TField NEW_FLAG_FIELD_DESC = new TField("newFlag", TType.BOOL, (short)4);

  private long productCategoryId;
  private String title;
  private int productCount;
  private boolean newFlag;

  // isset id assignments
  private static final int __PRODUCTCATEGORYID_ISSET_ID = 0;
  private static final int __PRODUCTCOUNT_ISSET_ID = 1;
  private static final int __NEWFLAG_ISSET_ID = 2;
  private boolean[] __isset_vector = new boolean[3];

  public ProductCategory() {
  }

  public ProductCategory(
    long productCategoryId,
    String title,
    int productCount,
    boolean newFlag)
  {
    this();
    this.productCategoryId = productCategoryId;
    setProductCategoryIdIsSet(true);
    this.title = title;
    this.productCount = productCount;
    setProductCountIsSet(true);
    this.newFlag = newFlag;
    setNewFlagIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ProductCategory(ProductCategory other) {
    System.arraycopy(other.__isset_vector, 0, __isset_vector, 0, other.__isset_vector.length);
    this.productCategoryId = other.productCategoryId;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    this.productCount = other.productCount;
    this.newFlag = other.newFlag;
  }

  public ProductCategory deepCopy() {
    return new ProductCategory(this);
  }

  public void clear() {
    setProductCategoryIdIsSet(false);
    this.productCategoryId = 0;
    this.title = null;
    setProductCountIsSet(false);
    this.productCount = 0;
    setNewFlagIsSet(false);
    this.newFlag = false;
  }

  public long getProductCategoryId() {
    return this.productCategoryId;
  }

  public void setProductCategoryId(long productCategoryId) {
    this.productCategoryId = productCategoryId;
    setProductCategoryIdIsSet(true);
  }

  public void unsetProductCategoryId() {
    __isset_vector[__PRODUCTCATEGORYID_ISSET_ID] = false;
  }

  /** Returns true if field productCategoryId is set (has been assigned a value) and false otherwise */
  public boolean isSetProductCategoryId() {
    return __isset_vector[__PRODUCTCATEGORYID_ISSET_ID];
  }

  public void setProductCategoryIdIsSet(boolean value) {
    __isset_vector[__PRODUCTCATEGORYID_ISSET_ID] = value;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public int getProductCount() {
    return this.productCount;
  }

  public void setProductCount(int productCount) {
    this.productCount = productCount;
    setProductCountIsSet(true);
  }

  public void unsetProductCount() {
    __isset_vector[__PRODUCTCOUNT_ISSET_ID] = false;
  }

  /** Returns true if field productCount is set (has been assigned a value) and false otherwise */
  public boolean isSetProductCount() {
    return __isset_vector[__PRODUCTCOUNT_ISSET_ID];
  }

  public void setProductCountIsSet(boolean value) {
    __isset_vector[__PRODUCTCOUNT_ISSET_ID] = value;
  }

  public boolean isNewFlag() {
    return this.newFlag;
  }

  public void setNewFlag(boolean newFlag) {
    this.newFlag = newFlag;
    setNewFlagIsSet(true);
  }

  public void unsetNewFlag() {
    __isset_vector[__NEWFLAG_ISSET_ID] = false;
  }

  /** Returns true if field newFlag is set (has been assigned a value) and false otherwise */
  public boolean isSetNewFlag() {
    return __isset_vector[__NEWFLAG_ISSET_ID];
  }

  public void setNewFlagIsSet(boolean value) {
    __isset_vector[__NEWFLAG_ISSET_ID] = value;
  }

  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ProductCategory)
      return this.equals((ProductCategory)that);
    return false;
  }

  public boolean equals(ProductCategory that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_productCategoryId = true;
    boolean that_present_productCategoryId = true;
    if (this_present_productCategoryId || that_present_productCategoryId) {
      if (!(this_present_productCategoryId && that_present_productCategoryId))
        return false;
      if (this.productCategoryId != that.productCategoryId)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_productCount = true;
    boolean that_present_productCount = true;
    if (this_present_productCount || that_present_productCount) {
      if (!(this_present_productCount && that_present_productCount))
        return false;
      if (this.productCount != that.productCount)
        return false;
    }

    boolean this_present_newFlag = true;
    boolean that_present_newFlag = true;
    if (this_present_newFlag || that_present_newFlag) {
      if (!(this_present_newFlag && that_present_newFlag))
        return false;
      if (this.newFlag != that.newFlag)
        return false;
    }

    return true;
  }

  public int hashCode() {
    return 0;
  }

  public int compareTo(Object otherObject) {
    if (!getClass().equals(otherObject.getClass())) {
      return getClass().getName().compareTo(otherObject.getClass().getName());
    }

    ProductCategory other = (ProductCategory)otherObject;    int lastComparison = 0;

    lastComparison = TBaseHelper.compareTo(isSetProductCategoryId(), other.isSetProductCategoryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductCategoryId()) {
      lastComparison = TBaseHelper.compareTo(this.productCategoryId, other.productCategoryId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetTitle(), other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetProductCount(), other.isSetProductCount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProductCount()) {
      lastComparison = TBaseHelper.compareTo(this.productCount, other.productCount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = TBaseHelper.compareTo(isSetNewFlag(), other.isSetNewFlag());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewFlag()) {
      lastComparison = TBaseHelper.compareTo(this.newFlag, other.newFlag);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // PRODUCT_CATEGORY_ID
          if (field.type == TType.I64) {
            this.productCategoryId = iprot.readI64();
            setProductCategoryIdIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // TITLE
          if (field.type == TType.STRING) {
            this.title = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // PRODUCT_COUNT
          if (field.type == TType.I32) {
            this.productCount = iprot.readI32();
            setProductCountIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 4: // NEW_FLAG
          if (field.type == TType.BOOL) {
            this.newFlag = iprot.readBool();
            setNewFlagIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    oprot.writeFieldBegin(PRODUCT_CATEGORY_ID_FIELD_DESC);
    oprot.writeI64(this.productCategoryId);
    oprot.writeFieldEnd();
    if (this.title != null) {
      oprot.writeFieldBegin(TITLE_FIELD_DESC);
      oprot.writeString(this.title);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(PRODUCT_COUNT_FIELD_DESC);
    oprot.writeI32(this.productCount);
    oprot.writeFieldEnd();
    oprot.writeFieldBegin(NEW_FLAG_FIELD_DESC);
    oprot.writeBool(this.newFlag);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  public String toString() {
    StringBuffer sb = new StringBuffer("ProductCategory(");
    boolean first = true;

    sb.append("productCategoryId:");
    sb.append(this.productCategoryId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("productCount:");
    sb.append(this.productCount);
    first = false;
    if (!first) sb.append(", ");
    sb.append("newFlag:");
    sb.append(this.newFlag);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}
