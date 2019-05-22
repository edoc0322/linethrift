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
public partial class CoinProductItem : TBase
{
  private string _itemId;
  private int _coin;
  private int _freeCoin;
  private string _currency;
  private string _price;
  private string _displayPrice;
  private string _name;
  private string _desc;

  public string ItemId
  {
    get
    {
      return _itemId;
    }
    set
    {
      __isset.itemId = true;
      this._itemId = value;
    }
  }

  public int Coin
  {
    get
    {
      return _coin;
    }
    set
    {
      __isset.coin = true;
      this._coin = value;
    }
  }

  public int FreeCoin
  {
    get
    {
      return _freeCoin;
    }
    set
    {
      __isset.freeCoin = true;
      this._freeCoin = value;
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

  public string DisplayPrice
  {
    get
    {
      return _displayPrice;
    }
    set
    {
      __isset.displayPrice = true;
      this._displayPrice = value;
    }
  }

  public string Name
  {
    get
    {
      return _name;
    }
    set
    {
      __isset.name = true;
      this._name = value;
    }
  }

  public string Desc
  {
    get
    {
      return _desc;
    }
    set
    {
      __isset.desc = true;
      this._desc = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool itemId;
    public bool coin;
    public bool freeCoin;
    public bool currency;
    public bool price;
    public bool displayPrice;
    public bool name;
    public bool desc;
  }

  public CoinProductItem() {
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
              ItemId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              Coin = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              FreeCoin = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              Currency = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              Price = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.String) {
              DisplayPrice = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.String) {
              Name = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.String) {
              Desc = iprot.ReadString();
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
      TStruct struc = new TStruct("CoinProductItem");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ItemId != null && __isset.itemId) {
        field.Name = "itemId";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ItemId);
        oprot.WriteFieldEnd();
      }
      if (__isset.coin) {
        field.Name = "coin";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Coin);
        oprot.WriteFieldEnd();
      }
      if (__isset.freeCoin) {
        field.Name = "freeCoin";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(FreeCoin);
        oprot.WriteFieldEnd();
      }
      if (Currency != null && __isset.currency) {
        field.Name = "currency";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Currency);
        oprot.WriteFieldEnd();
      }
      if (Price != null && __isset.price) {
        field.Name = "price";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Price);
        oprot.WriteFieldEnd();
      }
      if (DisplayPrice != null && __isset.displayPrice) {
        field.Name = "displayPrice";
        field.Type = TType.String;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(DisplayPrice);
        oprot.WriteFieldEnd();
      }
      if (Name != null && __isset.name) {
        field.Name = "name";
        field.Type = TType.String;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Name);
        oprot.WriteFieldEnd();
      }
      if (Desc != null && __isset.desc) {
        field.Name = "desc";
        field.Type = TType.String;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Desc);
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
    StringBuilder __sb = new StringBuilder("CoinProductItem(");
    bool __first = true;
    if (ItemId != null && __isset.itemId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ItemId: ");
      __sb.Append(ItemId);
    }
    if (__isset.coin) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Coin: ");
      __sb.Append(Coin);
    }
    if (__isset.freeCoin) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("FreeCoin: ");
      __sb.Append(FreeCoin);
    }
    if (Currency != null && __isset.currency) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Currency: ");
      __sb.Append(Currency);
    }
    if (Price != null && __isset.price) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Price: ");
      __sb.Append(Price);
    }
    if (DisplayPrice != null && __isset.displayPrice) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("DisplayPrice: ");
      __sb.Append(DisplayPrice);
    }
    if (Name != null && __isset.name) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Name: ");
      __sb.Append(Name);
    }
    if (Desc != null && __isset.desc) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Desc: ");
      __sb.Append(Desc);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

