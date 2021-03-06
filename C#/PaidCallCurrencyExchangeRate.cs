/**
 * Autogenerated by Thrift Compiler (0.13.0)
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
public partial class PaidCallCurrencyExchangeRate : TBase
{
  private string _currencyCode;
  private string _currencyName;
  private string _currencySign;
  private bool _preferred;
  private string _coinRate;
  private string _creditRate;

  public string CurrencyCode
  {
    get
    {
      return _currencyCode;
    }
    set
    {
      __isset.currencyCode = true;
      this._currencyCode = value;
    }
  }

  public string CurrencyName
  {
    get
    {
      return _currencyName;
    }
    set
    {
      __isset.currencyName = true;
      this._currencyName = value;
    }
  }

  public string CurrencySign
  {
    get
    {
      return _currencySign;
    }
    set
    {
      __isset.currencySign = true;
      this._currencySign = value;
    }
  }

  public bool Preferred
  {
    get
    {
      return _preferred;
    }
    set
    {
      __isset.preferred = true;
      this._preferred = value;
    }
  }

  public string CoinRate
  {
    get
    {
      return _coinRate;
    }
    set
    {
      __isset.coinRate = true;
      this._coinRate = value;
    }
  }

  public string CreditRate
  {
    get
    {
      return _creditRate;
    }
    set
    {
      __isset.creditRate = true;
      this._creditRate = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool currencyCode;
    public bool currencyName;
    public bool currencySign;
    public bool preferred;
    public bool coinRate;
    public bool creditRate;
  }

  public PaidCallCurrencyExchangeRate() {
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
              CurrencyCode = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              CurrencyName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              CurrencySign = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Bool) {
              Preferred = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              CoinRate = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              CreditRate = iprot.ReadString();
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
      TStruct struc = new TStruct("PaidCallCurrencyExchangeRate");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (CurrencyCode != null && __isset.currencyCode) {
        field.Name = "currencyCode";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CurrencyCode);
        oprot.WriteFieldEnd();
      }
      if (CurrencyName != null && __isset.currencyName) {
        field.Name = "currencyName";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CurrencyName);
        oprot.WriteFieldEnd();
      }
      if (CurrencySign != null && __isset.currencySign) {
        field.Name = "currencySign";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CurrencySign);
        oprot.WriteFieldEnd();
      }
      if (__isset.preferred) {
        field.Name = "preferred";
        field.Type = TType.Bool;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(Preferred);
        oprot.WriteFieldEnd();
      }
      if (CoinRate != null && __isset.coinRate) {
        field.Name = "coinRate";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CoinRate);
        oprot.WriteFieldEnd();
      }
      if (CreditRate != null && __isset.creditRate) {
        field.Name = "creditRate";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CreditRate);
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
    StringBuilder __sb = new StringBuilder("PaidCallCurrencyExchangeRate(");
    bool __first = true;
    if (CurrencyCode != null && __isset.currencyCode) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CurrencyCode: ");
      __sb.Append(CurrencyCode);
    }
    if (CurrencyName != null && __isset.currencyName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CurrencyName: ");
      __sb.Append(CurrencyName);
    }
    if (CurrencySign != null && __isset.currencySign) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CurrencySign: ");
      __sb.Append(CurrencySign);
    }
    if (__isset.preferred) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Preferred: ");
      __sb.Append(Preferred);
    }
    if (CoinRate != null && __isset.coinRate) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CoinRate: ");
      __sb.Append(CoinRate);
    }
    if (CreditRate != null && __isset.creditRate) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CreditRate: ");
      __sb.Append(CreditRate);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

