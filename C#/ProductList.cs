/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class ProductList : TBase
{
  private bool _hasNext;
  private long _bannerSequence;
  private ProductBannerLinkType _bannerTargetType;
  private string _bannerTargetPath;
  private List<Product> _productList;
  private string _bannerLang;

  public bool HasNext
  {
    get
    {
      return _hasNext;
    }
    set
    {
      __isset.hasNext = true;
      this._hasNext = value;
    }
  }

  public long BannerSequence
  {
    get
    {
      return _bannerSequence;
    }
    set
    {
      __isset.bannerSequence = true;
      this._bannerSequence = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="ProductBannerLinkType"/>
  /// </summary>
  public ProductBannerLinkType BannerTargetType
  {
    get
    {
      return _bannerTargetType;
    }
    set
    {
      __isset.bannerTargetType = true;
      this._bannerTargetType = value;
    }
  }

  public string BannerTargetPath
  {
    get
    {
      return _bannerTargetPath;
    }
    set
    {
      __isset.bannerTargetPath = true;
      this._bannerTargetPath = value;
    }
  }

  public List<Product> ProductList_
  {
    get
    {
      return _productList;
    }
    set
    {
      __isset.productList = true;
      this._productList = value;
    }
  }

  public string BannerLang
  {
    get
    {
      return _bannerLang;
    }
    set
    {
      __isset.bannerLang = true;
      this._bannerLang = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool hasNext;
    public bool bannerSequence;
    public bool bannerTargetType;
    public bool bannerTargetPath;
    public bool productList;
    public bool bannerLang;
  }

  public ProductList() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.Bool) {
              HasNext = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I64) {
              BannerSequence = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I32) {
              BannerTargetType = (ProductBannerLinkType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              BannerTargetPath = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.List) {
              {
                ProductList_ = new List<Product>();
                TList _list285 = iprot.ReadListBegin();
                for( int _i286 = 0; _i286 < _list285.Count; ++_i286)
                {
                  Product _elem287;
                  _elem287 = new Product();
                  _elem287.Read(iprot);
                  ProductList_.Add(_elem287);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.String) {
              BannerLang = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("ProductList");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.hasNext) {
        field.Name = "hasNext";
        field.Type = TType.Bool;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(HasNext);
        oprot.WriteFieldEnd();
      }
      if (__isset.bannerSequence) {
        field.Name = "bannerSequence";
        field.Type = TType.I64;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(BannerSequence);
        oprot.WriteFieldEnd();
      }
      if (__isset.bannerTargetType) {
        field.Name = "bannerTargetType";
        field.Type = TType.I32;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)BannerTargetType);
        oprot.WriteFieldEnd();
      }
      if (BannerTargetPath != null && __isset.bannerTargetPath) {
        field.Name = "bannerTargetPath";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(BannerTargetPath);
        oprot.WriteFieldEnd();
      }
      if (ProductList_ != null && __isset.productList) {
        field.Name = "productList";
        field.Type = TType.List;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, ProductList_.Count));
          foreach (Product _iter288 in ProductList_)
          {
            _iter288.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (BannerLang != null && __isset.bannerLang) {
        field.Name = "bannerLang";
        field.Type = TType.String;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(BannerLang);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("ProductList(");
    bool __first = true;
    if (__isset.hasNext) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("HasNext: ");
      __sb.Append(HasNext);
    }
    if (__isset.bannerSequence) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("BannerSequence: ");
      __sb.Append(BannerSequence);
    }
    if (__isset.bannerTargetType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("BannerTargetType: ");
      __sb.Append(BannerTargetType);
    }
    if (BannerTargetPath != null && __isset.bannerTargetPath) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("BannerTargetPath: ");
      __sb.Append(BannerTargetPath);
    }
    if (ProductList_ != null && __isset.productList) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ProductList_: ");
      __sb.Append(ProductList_);
    }
    if (BannerLang != null && __isset.bannerLang) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("BannerLang: ");
      __sb.Append(BannerLang);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

