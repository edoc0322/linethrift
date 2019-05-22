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
public partial class VerificationSessionData : TBase
{
  private string _sessionId;
  private VerificationMethod _method;
  private string _callback;
  private string _normalizedPhone;
  private string _countryCode;
  private string _nationalSignificantNumber;
  private List<VerificationMethod> _availableVerificationMethods;
  private string _callerIdMask;

  public string SessionId
  {
    get
    {
      return _sessionId;
    }
    set
    {
      __isset.sessionId = true;
      this._sessionId = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="VerificationMethod"/>
  /// </summary>
  public VerificationMethod Method
  {
    get
    {
      return _method;
    }
    set
    {
      __isset.method = true;
      this._method = value;
    }
  }

  public string Callback
  {
    get
    {
      return _callback;
    }
    set
    {
      __isset.callback = true;
      this._callback = value;
    }
  }

  public string NormalizedPhone
  {
    get
    {
      return _normalizedPhone;
    }
    set
    {
      __isset.normalizedPhone = true;
      this._normalizedPhone = value;
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

  public string NationalSignificantNumber
  {
    get
    {
      return _nationalSignificantNumber;
    }
    set
    {
      __isset.nationalSignificantNumber = true;
      this._nationalSignificantNumber = value;
    }
  }

  public List<VerificationMethod> AvailableVerificationMethods
  {
    get
    {
      return _availableVerificationMethods;
    }
    set
    {
      __isset.availableVerificationMethods = true;
      this._availableVerificationMethods = value;
    }
  }

  public string CallerIdMask
  {
    get
    {
      return _callerIdMask;
    }
    set
    {
      __isset.callerIdMask = true;
      this._callerIdMask = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool sessionId;
    public bool method;
    public bool callback;
    public bool normalizedPhone;
    public bool countryCode;
    public bool nationalSignificantNumber;
    public bool availableVerificationMethods;
    public bool callerIdMask;
  }

  public VerificationSessionData() {
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
              SessionId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              Method = (VerificationMethod)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Callback = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              NormalizedPhone = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              CountryCode = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              NationalSignificantNumber = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.List) {
              {
                AvailableVerificationMethods = new List<VerificationMethod>();
                TList _list241 = iprot.ReadListBegin();
                for( int _i242 = 0; _i242 < _list241.Count; ++_i242)
                {
                  VerificationMethod _elem243;
                  _elem243 = (VerificationMethod)iprot.ReadI32();
                  AvailableVerificationMethods.Add(_elem243);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.String) {
              CallerIdMask = iprot.ReadString();
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
      TStruct struc = new TStruct("VerificationSessionData");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SessionId != null && __isset.sessionId) {
        field.Name = "sessionId";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SessionId);
        oprot.WriteFieldEnd();
      }
      if (__isset.method) {
        field.Name = "method";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Method);
        oprot.WriteFieldEnd();
      }
      if (Callback != null && __isset.callback) {
        field.Name = "callback";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Callback);
        oprot.WriteFieldEnd();
      }
      if (NormalizedPhone != null && __isset.normalizedPhone) {
        field.Name = "normalizedPhone";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(NormalizedPhone);
        oprot.WriteFieldEnd();
      }
      if (CountryCode != null && __isset.countryCode) {
        field.Name = "countryCode";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CountryCode);
        oprot.WriteFieldEnd();
      }
      if (NationalSignificantNumber != null && __isset.nationalSignificantNumber) {
        field.Name = "nationalSignificantNumber";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(NationalSignificantNumber);
        oprot.WriteFieldEnd();
      }
      if (AvailableVerificationMethods != null && __isset.availableVerificationMethods) {
        field.Name = "availableVerificationMethods";
        field.Type = TType.List;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.I32, AvailableVerificationMethods.Count));
          foreach (VerificationMethod _iter244 in AvailableVerificationMethods)
          {
            oprot.WriteI32((int)_iter244);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (CallerIdMask != null && __isset.callerIdMask) {
        field.Name = "callerIdMask";
        field.Type = TType.String;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CallerIdMask);
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
    StringBuilder __sb = new StringBuilder("VerificationSessionData(");
    bool __first = true;
    if (SessionId != null && __isset.sessionId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SessionId: ");
      __sb.Append(SessionId);
    }
    if (__isset.method) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Method: ");
      __sb.Append(Method);
    }
    if (Callback != null && __isset.callback) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Callback: ");
      __sb.Append(Callback);
    }
    if (NormalizedPhone != null && __isset.normalizedPhone) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("NormalizedPhone: ");
      __sb.Append(NormalizedPhone);
    }
    if (CountryCode != null && __isset.countryCode) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CountryCode: ");
      __sb.Append(CountryCode);
    }
    if (NationalSignificantNumber != null && __isset.nationalSignificantNumber) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("NationalSignificantNumber: ");
      __sb.Append(NationalSignificantNumber);
    }
    if (AvailableVerificationMethods != null && __isset.availableVerificationMethods) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AvailableVerificationMethods: ");
      __sb.Append(AvailableVerificationMethods);
    }
    if (CallerIdMask != null && __isset.callerIdMask) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CallerIdMask: ");
      __sb.Append(CallerIdMask);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

