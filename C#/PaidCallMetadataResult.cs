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
public partial class PaidCallMetadataResult : TBase
{
  private List<PaidCallCurrencyExchangeRate> _currencyExchangeRates;
  private List<string> _recommendedCountryCodes;
  private List<PaidCallAdCountry> _adCountries;

  public List<PaidCallCurrencyExchangeRate> CurrencyExchangeRates
  {
    get
    {
      return _currencyExchangeRates;
    }
    set
    {
      __isset.currencyExchangeRates = true;
      this._currencyExchangeRates = value;
    }
  }

  public List<string> RecommendedCountryCodes
  {
    get
    {
      return _recommendedCountryCodes;
    }
    set
    {
      __isset.recommendedCountryCodes = true;
      this._recommendedCountryCodes = value;
    }
  }

  public List<PaidCallAdCountry> AdCountries
  {
    get
    {
      return _adCountries;
    }
    set
    {
      __isset.adCountries = true;
      this._adCountries = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool currencyExchangeRates;
    public bool recommendedCountryCodes;
    public bool adCountries;
  }

  public PaidCallMetadataResult() {
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
            if (field.Type == TType.List) {
              {
                CurrencyExchangeRates = new List<PaidCallCurrencyExchangeRate>();
                TList _list95 = iprot.ReadListBegin();
                for( int _i96 = 0; _i96 < _list95.Count; ++_i96)
                {
                  PaidCallCurrencyExchangeRate _elem97;
                  _elem97 = new PaidCallCurrencyExchangeRate();
                  _elem97.Read(iprot);
                  CurrencyExchangeRates.Add(_elem97);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                RecommendedCountryCodes = new List<string>();
                TList _list98 = iprot.ReadListBegin();
                for( int _i99 = 0; _i99 < _list98.Count; ++_i99)
                {
                  string _elem100;
                  _elem100 = iprot.ReadString();
                  RecommendedCountryCodes.Add(_elem100);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.List) {
              {
                AdCountries = new List<PaidCallAdCountry>();
                TList _list101 = iprot.ReadListBegin();
                for( int _i102 = 0; _i102 < _list101.Count; ++_i102)
                {
                  PaidCallAdCountry _elem103;
                  _elem103 = new PaidCallAdCountry();
                  _elem103.Read(iprot);
                  AdCountries.Add(_elem103);
                }
                iprot.ReadListEnd();
              }
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
      TStruct struc = new TStruct("PaidCallMetadataResult");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (CurrencyExchangeRates != null && __isset.currencyExchangeRates) {
        field.Name = "currencyExchangeRates";
        field.Type = TType.List;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, CurrencyExchangeRates.Count));
          foreach (PaidCallCurrencyExchangeRate _iter104 in CurrencyExchangeRates)
          {
            _iter104.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (RecommendedCountryCodes != null && __isset.recommendedCountryCodes) {
        field.Name = "recommendedCountryCodes";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.String, RecommendedCountryCodes.Count));
          foreach (string _iter105 in RecommendedCountryCodes)
          {
            oprot.WriteString(_iter105);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (AdCountries != null && __isset.adCountries) {
        field.Name = "adCountries";
        field.Type = TType.List;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, AdCountries.Count));
          foreach (PaidCallAdCountry _iter106 in AdCountries)
          {
            _iter106.Write(oprot);
          }
          oprot.WriteListEnd();
        }
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
    StringBuilder __sb = new StringBuilder("PaidCallMetadataResult(");
    bool __first = true;
    if (CurrencyExchangeRates != null && __isset.currencyExchangeRates) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CurrencyExchangeRates: ");
      __sb.Append(CurrencyExchangeRates);
    }
    if (RecommendedCountryCodes != null && __isset.recommendedCountryCodes) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("RecommendedCountryCodes: ");
      __sb.Append(RecommendedCountryCodes);
    }
    if (AdCountries != null && __isset.adCountries) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AdCountries: ");
      __sb.Append(AdCountries);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

