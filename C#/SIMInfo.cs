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
public partial class SIMInfo : TBase
{
  private string _phoneNumber;
  private string _countryCode;

  public string PhoneNumber
  {
    get
    {
      return _phoneNumber;
    }
    set
    {
      __isset.phoneNumber = true;
      this._phoneNumber = value;
    }
  }

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


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool phoneNumber;
    public bool countryCode;
  }

  public SIMInfo() {
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
              PhoneNumber = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              CountryCode = iprot.ReadString();
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
      TStruct struc = new TStruct("SIMInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (PhoneNumber != null && __isset.phoneNumber) {
        field.Name = "phoneNumber";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(PhoneNumber);
        oprot.WriteFieldEnd();
      }
      if (CountryCode != null && __isset.countryCode) {
        field.Name = "countryCode";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CountryCode);
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
    StringBuilder __sb = new StringBuilder("SIMInfo(");
    bool __first = true;
    if (PhoneNumber != null && __isset.phoneNumber) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PhoneNumber: ");
      __sb.Append(PhoneNumber);
    }
    if (CountryCode != null && __isset.countryCode) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CountryCode: ");
      __sb.Append(CountryCode);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

