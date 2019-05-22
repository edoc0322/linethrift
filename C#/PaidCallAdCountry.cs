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
public partial class PaidCallAdCountry : TBase
{
  private string _countryCode;
  private string _rateDivision;

  public string CountryCode
  {
    get
    {
      return _countryCode;
    }
    set
    {
      __isset.countryCode = true;
      this._countryCode = value;
    }
  }

  public string RateDivision
  {
    get
    {
      return _rateDivision;
    }
    set
    {
      __isset.rateDivision = true;
      this._rateDivision = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool countryCode;
    public bool rateDivision;
  }

  public PaidCallAdCountry() {
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
              CountryCode = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              RateDivision = iprot.ReadString();
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
      TStruct struc = new TStruct("PaidCallAdCountry");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (CountryCode != null && __isset.countryCode) {
        field.Name = "countryCode";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CountryCode);
        oprot.WriteFieldEnd();
      }
      if (RateDivision != null && __isset.rateDivision) {
        field.Name = "rateDivision";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(RateDivision);
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
    StringBuilder __sb = new StringBuilder("PaidCallAdCountry(");
    bool __first = true;
    if (CountryCode != null && __isset.countryCode) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CountryCode: ");
      __sb.Append(CountryCode);
    }
    if (RateDivision != null && __isset.rateDivision) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("RateDivision: ");
      __sb.Append(RateDivision);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

