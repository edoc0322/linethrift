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
public partial class Product : TBase
{
  private string _productId;
  private long _packageId;
  private int _version;
  private string _authorName;
  private bool _onSale;
  private int _validDays;
  private int _saleType;
  private string _copyright;
  private string _title;
  private string _descriptionText;
  private long _shopOrderId;
  private string _fromMid;
  private string _toMid;
  private long _validUntil;
  private int _priceTier;
  private string _price;
  private string _currency;
  private string _currencySymbol;
  private PaymentType _paymentType;
  private long _createDate;
  private bool _ownFlag;
  private ProductEventType _eventType;
  private string _urlSchema;
  private string _downloadUrl;
  private string _buddyMid;
  private long _publishSince;
  private bool _newFlag;
  private bool _missionFlag;
  private List<ProductCategory> _categories;
  private string _missionButtonText;
  private string _missionShortDescription;
  private string _authorId;
  private bool _grantedByDefault;
  private int _displayOrder;
  private bool _availableForPresent;
  private bool _availableForMyself;
  private bool _hasAnimation;
  private bool _hasSound;
  private bool _recommendationsEnabled;
  private StickerResourceType _stickerResourceType;

  public string ProductId
  {
    get
    {
      return _productId;
    }
    set
    {
      __isset.productId = true;
      this._productId = value;
    }
  }

  public long PackageId
  {
    get
    {
      return _packageId;
    }
    set
    {
      __isset.packageId = true;
      this._packageId = value;
    }
  }

  public int Version
  {
    get
    {
      return _version;
    }
    set
    {
      __isset.version = true;
      this._version = value;
    }
  }

  public string AuthorName
  {
    get
    {
      return _authorName;
    }
    set
    {
      __isset.authorName = true;
      this._authorName = value;
    }
  }

  public bool OnSale
  {
    get
    {
      return _onSale;
    }
    set
    {
      __isset.onSale = true;
      this._onSale = value;
    }
  }

  public int ValidDays
  {
    get
    {
      return _validDays;
    }
    set
    {
      __isset.validDays = true;
      this._validDays = value;
    }
  }

  public int SaleType
  {
    get
    {
      return _saleType;
    }
    set
    {
      __isset.saleType = true;
      this._saleType = value;
    }
  }

  public string Copyright
  {
    get
    {
      return _copyright;
    }
    set
    {
      __isset.copyright = true;
      this._copyright = value;
    }
  }

  public string Title
  {
    get
    {
      return _title;
    }
    set
    {
      __isset.title = true;
      this._title = value;
    }
  }

  public string DescriptionText
  {
    get
    {
      return _descriptionText;
    }
    set
    {
      __isset.descriptionText = true;
      this._descriptionText = value;
    }
  }

  public long ShopOrderId
  {
    get
    {
      return _shopOrderId;
    }
    set
    {
      __isset.shopOrderId = true;
      this._shopOrderId = value;
    }
  }

  public string FromMid
  {
    get
    {
      return _fromMid;
    }
    set
    {
      __isset.fromMid = true;
      this._fromMid = value;
    }
  }

  public string ToMid
  {
    get
    {
      return _toMid;
    }
    set
    {
      __isset.toMid = true;
      this._toMid = value;
    }
  }

  public long ValidUntil
  {
    get
    {
      return _validUntil;
    }
    set
    {
      __isset.validUntil = true;
      this._validUntil = value;
    }
  }

  public int PriceTier
  {
    get
    {
      return _priceTier;
    }
    set
    {
      __isset.priceTier = true;
      this._priceTier = value;
    }
  }

  public string Price
  {
    get
    {
      return _price;
    }
    set
    {
      __isset.price = true;
      this._price = value;
    }
  }

  public string Currency
  {
    get
    {
      return _currency;
    }
    set
    {
      __isset.currency = true;
      this._currency = value;
    }
  }

  public string CurrencySymbol
  {
    get
    {
      return _currencySymbol;
    }
    set
    {
      __isset.currencySymbol = true;
      this._currencySymbol = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="PaymentType"/>
  /// </summary>
  public PaymentType PaymentType
  {
    get
    {
      return _paymentType;
    }
    set
    {
      __isset.paymentType = true;
      this._paymentType = value;
    }
  }

  public long CreateDate
  {
    get
    {
      return _createDate;
    }
    set
    {
      __isset.createDate = true;
      this._createDate = value;
    }
  }

  public bool OwnFlag
  {
    get
    {
      return _ownFlag;
    }
    set
    {
      __isset.ownFlag = true;
      this._ownFlag = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="ProductEventType"/>
  /// </summary>
  public ProductEventType EventType
  {
    get
    {
      return _eventType;
    }
    set
    {
      __isset.eventType = true;
      this._eventType = value;
    }
  }

  public string UrlSchema
  {
    get
    {
      return _urlSchema;
    }
    set
    {
      __isset.urlSchema = true;
      this._urlSchema = value;
    }
  }

  public string DownloadUrl
  {
    get
    {
      return _downloadUrl;
    }
    set
    {
      __isset.downloadUrl = true;
      this._downloadUrl = value;
    }
  }

  public string BuddyMid
  {
    get
    {
      return _buddyMid;
    }
    set
    {
      __isset.buddyMid = true;
      this._buddyMid = value;
    }
  }

  public long PublishSince
  {
    get
    {
      return _publishSince;
    }
    set
    {
      __isset.publishSince = true;
      this._publishSince = value;
    }
  }

  public bool NewFlag
  {
    get
    {
      return _newFlag;
    }
    set
    {
      __isset.newFlag = true;
      this._newFlag = value;
    }
  }

  public bool MissionFlag
  {
    get
    {
      return _missionFlag;
    }
    set
    {
      __isset.missionFlag = true;
      this._missionFlag = value;
    }
  }

  public List<ProductCategory> Categories
  {
    get
    {
      return _categories;
    }
    set
    {
      __isset.categories = true;
      this._categories = value;
    }
  }

  public string MissionButtonText
  {
    get
    {
      return _missionButtonText;
    }
    set
    {
      __isset.missionButtonText = true;
      this._missionButtonText = value;
    }
  }

  public string MissionShortDescription
  {
    get
    {
      return _missionShortDescription;
    }
    set
    {
      __isset.missionShortDescription = true;
      this._missionShortDescription = value;
    }
  }

  public string AuthorId
  {
    get
    {
      return _authorId;
    }
    set
    {
      __isset.authorId = true;
      this._authorId = value;
    }
  }

  public bool GrantedByDefault
  {
    get
    {
      return _grantedByDefault;
    }
    set
    {
      __isset.grantedByDefault = true;
      this._grantedByDefault = value;
    }
  }

  public int DisplayOrder
  {
    get
    {
      return _displayOrder;
    }
    set
    {
      __isset.displayOrder = true;
      this._displayOrder = value;
    }
  }

  public bool AvailableForPresent
  {
    get
    {
      return _availableForPresent;
    }
    set
    {
      __isset.availableForPresent = true;
      this._availableForPresent = value;
    }
  }

  public bool AvailableForMyself
  {
    get
    {
      return _availableForMyself;
    }
    set
    {
      __isset.availableForMyself = true;
      this._availableForMyself = value;
    }
  }

  public bool HasAnimation
  {
    get
    {
      return _hasAnimation;
    }
    set
    {
      __isset.hasAnimation = true;
      this._hasAnimation = value;
    }
  }

  public bool HasSound
  {
    get
    {
      return _hasSound;
    }
    set
    {
      __isset.hasSound = true;
      this._hasSound = value;
    }
  }

  public bool RecommendationsEnabled
  {
    get
    {
      return _recommendationsEnabled;
    }
    set
    {
      __isset.recommendationsEnabled = true;
      this._recommendationsEnabled = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="StickerResourceType"/>
  /// </summary>
  public StickerResourceType StickerResourceType
  {
    get
    {
      return _stickerResourceType;
    }
    set
    {
      __isset.stickerResourceType = true;
      this._stickerResourceType = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool productId;
    public bool packageId;
    public bool version;
    public bool authorName;
    public bool onSale;
    public bool validDays;
    public bool saleType;
    public bool copyright;
    public bool title;
    public bool descriptionText;
    public bool shopOrderId;
    public bool fromMid;
    public bool toMid;
    public bool validUntil;
    public bool priceTier;
    public bool price;
    public bool currency;
    public bool currencySymbol;
    public bool paymentType;
    public bool createDate;
    public bool ownFlag;
    public bool eventType;
    public bool urlSchema;
    public bool downloadUrl;
    public bool buddyMid;
    public bool publishSince;
    public bool newFlag;
    public bool missionFlag;
    public bool categories;
    public bool missionButtonText;
    public bool missionShortDescription;
    public bool authorId;
    public bool grantedByDefault;
    public bool displayOrder;
    public bool availableForPresent;
    public bool availableForMyself;
    public bool hasAnimation;
    public bool hasSound;
    public bool recommendationsEnabled;
    public bool stickerResourceType;
  }

  public Product() {
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
            if (field.Type == TType.String) {
              ProductId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              PackageId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              Version = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              AuthorName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Bool) {
              OnSale = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.I32) {
              ValidDays = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.I32) {
              SaleType = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.String) {
              Copyright = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.String) {
              Title = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.String) {
              DescriptionText = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.I64) {
              ShopOrderId = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.String) {
              FromMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 13:
            if (field.Type == TType.String) {
              ToMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 14:
            if (field.Type == TType.I64) {
              ValidUntil = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 15:
            if (field.Type == TType.I32) {
              PriceTier = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 16:
            if (field.Type == TType.String) {
              Price = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 17:
            if (field.Type == TType.String) {
              Currency = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 18:
            if (field.Type == TType.String) {
              CurrencySymbol = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 19:
            if (field.Type == TType.I32) {
              PaymentType = (PaymentType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 20:
            if (field.Type == TType.I64) {
              CreateDate = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 21:
            if (field.Type == TType.Bool) {
              OwnFlag = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 22:
            if (field.Type == TType.I32) {
              EventType = (ProductEventType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 23:
            if (field.Type == TType.String) {
              UrlSchema = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 24:
            if (field.Type == TType.String) {
              DownloadUrl = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 25:
            if (field.Type == TType.String) {
              BuddyMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 26:
            if (field.Type == TType.I64) {
              PublishSince = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 27:
            if (field.Type == TType.Bool) {
              NewFlag = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 28:
            if (field.Type == TType.Bool) {
              MissionFlag = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 29:
            if (field.Type == TType.List) {
              {
                Categories = new List<ProductCategory>();
                TList _list281 = iprot.ReadListBegin();
                for( int _i282 = 0; _i282 < _list281.Count; ++_i282)
                {
                  ProductCategory _elem283;
                  _elem283 = new ProductCategory();
                  _elem283.Read(iprot);
                  Categories.Add(_elem283);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 30:
            if (field.Type == TType.String) {
              MissionButtonText = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 31:
            if (field.Type == TType.String) {
              MissionShortDescription = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 32:
            if (field.Type == TType.String) {
              AuthorId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 41:
            if (field.Type == TType.Bool) {
              GrantedByDefault = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 42:
            if (field.Type == TType.I32) {
              DisplayOrder = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 43:
            if (field.Type == TType.Bool) {
              AvailableForPresent = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 44:
            if (field.Type == TType.Bool) {
              AvailableForMyself = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 51:
            if (field.Type == TType.Bool) {
              HasAnimation = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 52:
            if (field.Type == TType.Bool) {
              HasSound = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 53:
            if (field.Type == TType.Bool) {
              RecommendationsEnabled = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 54:
            if (field.Type == TType.I32) {
              StickerResourceType = (StickerResourceType)iprot.ReadI32();
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
      TStruct struc = new TStruct("Product");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ProductId != null && __isset.productId) {
        field.Name = "productId";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ProductId);
        oprot.WriteFieldEnd();
      }
      if (__isset.packageId) {
        field.Name = "packageId";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(PackageId);
        oprot.WriteFieldEnd();
      }
      if (__isset.version) {
        field.Name = "version";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Version);
        oprot.WriteFieldEnd();
      }
      if (AuthorName != null && __isset.authorName) {
        field.Name = "authorName";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(AuthorName);
        oprot.WriteFieldEnd();
      }
      if (__isset.onSale) {
        field.Name = "onSale";
        field.Type = TType.Bool;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(OnSale);
        oprot.WriteFieldEnd();
      }
      if (__isset.validDays) {
        field.Name = "validDays";
        field.Type = TType.I32;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(ValidDays);
        oprot.WriteFieldEnd();
      }
      if (__isset.saleType) {
        field.Name = "saleType";
        field.Type = TType.I32;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(SaleType);
        oprot.WriteFieldEnd();
      }
      if (Copyright != null && __isset.copyright) {
        field.Name = "copyright";
        field.Type = TType.String;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Copyright);
        oprot.WriteFieldEnd();
      }
      if (Title != null && __isset.title) {
        field.Name = "title";
        field.Type = TType.String;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Title);
        oprot.WriteFieldEnd();
      }
      if (DescriptionText != null && __isset.descriptionText) {
        field.Name = "descriptionText";
        field.Type = TType.String;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(DescriptionText);
        oprot.WriteFieldEnd();
      }
      if (__isset.shopOrderId) {
        field.Name = "shopOrderId";
        field.Type = TType.I64;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(ShopOrderId);
        oprot.WriteFieldEnd();
      }
      if (FromMid != null && __isset.fromMid) {
        field.Name = "fromMid";
        field.Type = TType.String;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(FromMid);
        oprot.WriteFieldEnd();
      }
      if (ToMid != null && __isset.toMid) {
        field.Name = "toMid";
        field.Type = TType.String;
        field.ID = 13;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ToMid);
        oprot.WriteFieldEnd();
      }
      if (__isset.validUntil) {
        field.Name = "validUntil";
        field.Type = TType.I64;
        field.ID = 14;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(ValidUntil);
        oprot.WriteFieldEnd();
      }
      if (__isset.priceTier) {
        field.Name = "priceTier";
        field.Type = TType.I32;
        field.ID = 15;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(PriceTier);
        oprot.WriteFieldEnd();
      }
      if (Price != null && __isset.price) {
        field.Name = "price";
        field.Type = TType.String;
        field.ID = 16;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Price);
        oprot.WriteFieldEnd();
      }
      if (Currency != null && __isset.currency) {
        field.Name = "currency";
        field.Type = TType.String;
        field.ID = 17;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Currency);
        oprot.WriteFieldEnd();
      }
      if (CurrencySymbol != null && __isset.currencySymbol) {
        field.Name = "currencySymbol";
        field.Type = TType.String;
        field.ID = 18;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CurrencySymbol);
        oprot.WriteFieldEnd();
      }
      if (__isset.paymentType) {
        field.Name = "paymentType";
        field.Type = TType.I32;
        field.ID = 19;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)PaymentType);
        oprot.WriteFieldEnd();
      }
      if (__isset.createDate) {
        field.Name = "createDate";
        field.Type = TType.I64;
        field.ID = 20;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CreateDate);
        oprot.WriteFieldEnd();
      }
      if (__isset.ownFlag) {
        field.Name = "ownFlag";
        field.Type = TType.Bool;
        field.ID = 21;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(OwnFlag);
        oprot.WriteFieldEnd();
      }
      if (__isset.eventType) {
        field.Name = "eventType";
        field.Type = TType.I32;
        field.ID = 22;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)EventType);
        oprot.WriteFieldEnd();
      }
      if (UrlSchema != null && __isset.urlSchema) {
        field.Name = "urlSchema";
        field.Type = TType.String;
        field.ID = 23;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(UrlSchema);
        oprot.WriteFieldEnd();
      }
      if (DownloadUrl != null && __isset.downloadUrl) {
        field.Name = "downloadUrl";
        field.Type = TType.String;
        field.ID = 24;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(DownloadUrl);
        oprot.WriteFieldEnd();
      }
      if (BuddyMid != null && __isset.buddyMid) {
        field.Name = "buddyMid";
        field.Type = TType.String;
        field.ID = 25;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(BuddyMid);
        oprot.WriteFieldEnd();
      }
      if (__isset.publishSince) {
        field.Name = "publishSince";
        field.Type = TType.I64;
        field.ID = 26;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(PublishSince);
        oprot.WriteFieldEnd();
      }
      if (__isset.newFlag) {
        field.Name = "newFlag";
        field.Type = TType.Bool;
        field.ID = 27;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(NewFlag);
        oprot.WriteFieldEnd();
      }
      if (__isset.missionFlag) {
        field.Name = "missionFlag";
        field.Type = TType.Bool;
        field.ID = 28;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(MissionFlag);
        oprot.WriteFieldEnd();
      }
      if (Categories != null && __isset.categories) {
        field.Name = "categories";
        field.Type = TType.List;
        field.ID = 29;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Categories.Count));
          foreach (ProductCategory _iter284 in Categories)
          {
            _iter284.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (MissionButtonText != null && __isset.missionButtonText) {
        field.Name = "missionButtonText";
        field.Type = TType.String;
        field.ID = 30;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(MissionButtonText);
        oprot.WriteFieldEnd();
      }
      if (MissionShortDescription != null && __isset.missionShortDescription) {
        field.Name = "missionShortDescription";
        field.Type = TType.String;
        field.ID = 31;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(MissionShortDescription);
        oprot.WriteFieldEnd();
      }
      if (AuthorId != null && __isset.authorId) {
        field.Name = "authorId";
        field.Type = TType.String;
        field.ID = 32;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(AuthorId);
        oprot.WriteFieldEnd();
      }
      if (__isset.grantedByDefault) {
        field.Name = "grantedByDefault";
        field.Type = TType.Bool;
        field.ID = 41;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(GrantedByDefault);
        oprot.WriteFieldEnd();
      }
      if (__isset.displayOrder) {
        field.Name = "displayOrder";
        field.Type = TType.I32;
        field.ID = 42;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(DisplayOrder);
        oprot.WriteFieldEnd();
      }
      if (__isset.availableForPresent) {
        field.Name = "availableForPresent";
        field.Type = TType.Bool;
        field.ID = 43;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(AvailableForPresent);
        oprot.WriteFieldEnd();
      }
      if (__isset.availableForMyself) {
        field.Name = "availableForMyself";
        field.Type = TType.Bool;
        field.ID = 44;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(AvailableForMyself);
        oprot.WriteFieldEnd();
      }
      if (__isset.hasAnimation) {
        field.Name = "hasAnimation";
        field.Type = TType.Bool;
        field.ID = 51;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(HasAnimation);
        oprot.WriteFieldEnd();
      }
      if (__isset.hasSound) {
        field.Name = "hasSound";
        field.Type = TType.Bool;
        field.ID = 52;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(HasSound);
        oprot.WriteFieldEnd();
      }
      if (__isset.recommendationsEnabled) {
        field.Name = "recommendationsEnabled";
        field.Type = TType.Bool;
        field.ID = 53;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(RecommendationsEnabled);
        oprot.WriteFieldEnd();
      }
      if (__isset.stickerResourceType) {
        field.Name = "stickerResourceType";
        field.Type = TType.I32;
        field.ID = 54;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)StickerResourceType);
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
    StringBuilder __sb = new StringBuilder("Product(");
    bool __first = true;
    if (ProductId != null && __isset.productId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ProductId: ");
      __sb.Append(ProductId);
    }
    if (__isset.packageId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PackageId: ");
      __sb.Append(PackageId);
    }
    if (__isset.version) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Version: ");
      __sb.Append(Version);
    }
    if (AuthorName != null && __isset.authorName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AuthorName: ");
      __sb.Append(AuthorName);
    }
    if (__isset.onSale) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("OnSale: ");
      __sb.Append(OnSale);
    }
    if (__isset.validDays) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ValidDays: ");
      __sb.Append(ValidDays);
    }
    if (__isset.saleType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SaleType: ");
      __sb.Append(SaleType);
    }
    if (Copyright != null && __isset.copyright) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Copyright: ");
      __sb.Append(Copyright);
    }
    if (Title != null && __isset.title) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Title: ");
      __sb.Append(Title);
    }
    if (DescriptionText != null && __isset.descriptionText) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("DescriptionText: ");
      __sb.Append(DescriptionText);
    }
    if (__isset.shopOrderId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ShopOrderId: ");
      __sb.Append(ShopOrderId);
    }
    if (FromMid != null && __isset.fromMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("FromMid: ");
      __sb.Append(FromMid);
    }
    if (ToMid != null && __isset.toMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ToMid: ");
      __sb.Append(ToMid);
    }
    if (__isset.validUntil) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ValidUntil: ");
      __sb.Append(ValidUntil);
    }
    if (__isset.priceTier) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PriceTier: ");
      __sb.Append(PriceTier);
    }
    if (Price != null && __isset.price) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Price: ");
      __sb.Append(Price);
    }
    if (Currency != null && __isset.currency) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Currency: ");
      __sb.Append(Currency);
    }
    if (CurrencySymbol != null && __isset.currencySymbol) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CurrencySymbol: ");
      __sb.Append(CurrencySymbol);
    }
    if (__isset.paymentType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PaymentType: ");
      __sb.Append(PaymentType);
    }
    if (__isset.createDate) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CreateDate: ");
      __sb.Append(CreateDate);
    }
    if (__isset.ownFlag) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("OwnFlag: ");
      __sb.Append(OwnFlag);
    }
    if (__isset.eventType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("EventType: ");
      __sb.Append(EventType);
    }
    if (UrlSchema != null && __isset.urlSchema) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("UrlSchema: ");
      __sb.Append(UrlSchema);
    }
    if (DownloadUrl != null && __isset.downloadUrl) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("DownloadUrl: ");
      __sb.Append(DownloadUrl);
    }
    if (BuddyMid != null && __isset.buddyMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("BuddyMid: ");
      __sb.Append(BuddyMid);
    }
    if (__isset.publishSince) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PublishSince: ");
      __sb.Append(PublishSince);
    }
    if (__isset.newFlag) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("NewFlag: ");
      __sb.Append(NewFlag);
    }
    if (__isset.missionFlag) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("MissionFlag: ");
      __sb.Append(MissionFlag);
    }
    if (Categories != null && __isset.categories) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Categories: ");
      __sb.Append(Categories);
    }
    if (MissionButtonText != null && __isset.missionButtonText) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("MissionButtonText: ");
      __sb.Append(MissionButtonText);
    }
    if (MissionShortDescription != null && __isset.missionShortDescription) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("MissionShortDescription: ");
      __sb.Append(MissionShortDescription);
    }
    if (AuthorId != null && __isset.authorId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AuthorId: ");
      __sb.Append(AuthorId);
    }
    if (__isset.grantedByDefault) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("GrantedByDefault: ");
      __sb.Append(GrantedByDefault);
    }
    if (__isset.displayOrder) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("DisplayOrder: ");
      __sb.Append(DisplayOrder);
    }
    if (__isset.availableForPresent) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AvailableForPresent: ");
      __sb.Append(AvailableForPresent);
    }
    if (__isset.availableForMyself) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AvailableForMyself: ");
      __sb.Append(AvailableForMyself);
    }
    if (__isset.hasAnimation) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("HasAnimation: ");
      __sb.Append(HasAnimation);
    }
    if (__isset.hasSound) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("HasSound: ");
      __sb.Append(HasSound);
    }
    if (__isset.recommendationsEnabled) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("RecommendationsEnabled: ");
      __sb.Append(RecommendationsEnabled);
    }
    if (__isset.stickerResourceType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("StickerResourceType: ");
      __sb.Append(StickerResourceType);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

