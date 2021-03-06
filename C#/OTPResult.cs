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
public partial class OTPResult : TBase
{
  private string _otpId;
  private string _otp;

  public string OtpId
  {
    get
    {
      return _otpId;
    }
    set
    {
      __isset.otpId = true;
      this._otpId = value;
    }
  }

  public string Otp
  {
    get
    {
      return _otp;
    }
    set
    {
      __isset.otp = true;
      this._otp = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool otpId;
    public bool otp;
  }

  public OTPResult() {
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
              OtpId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Otp = iprot.ReadString();
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
      TStruct struc = new TStruct("OTPResult");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (OtpId != null && __isset.otpId) {
        field.Name = "otpId";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(OtpId);
        oprot.WriteFieldEnd();
      }
      if (Otp != null && __isset.otp) {
        field.Name = "otp";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Otp);
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
    StringBuilder __sb = new StringBuilder("OTPResult(");
    bool __first = true;
    if (OtpId != null && __isset.otpId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("OtpId: ");
      __sb.Append(OtpId);
    }
    if (Otp != null && __isset.otp) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Otp: ");
      __sb.Append(Otp);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

