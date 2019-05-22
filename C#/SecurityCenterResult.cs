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
public partial class SecurityCenterResult : TBase
{
  private string _uri;
  private string _token;
  private string _cookiePath;
  private bool _skip;

  public string Uri
  {
    get
    {
      return _uri;
    }
    set
    {
      __isset.uri = true;
      this._uri = value;
    }
  }

  public string Token
  {
    get
    {
      return _token;
    }
    set
    {
      __isset.token = true;
      this._token = value;
    }
  }

  public string CookiePath
  {
    get
    {
      return _cookiePath;
    }
    set
    {
      __isset.cookiePath = true;
      this._cookiePath = value;
    }
  }

  public bool Skip
  {
    get
    {
      return _skip;
    }
    set
    {
      __isset.skip = true;
      this._skip = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool uri;
    public bool token;
    public bool cookiePath;
    public bool skip;
  }

  public SecurityCenterResult() {
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
              Uri = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Token = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              CookiePath = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Bool) {
              Skip = iprot.ReadBool();
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
      TStruct struc = new TStruct("SecurityCenterResult");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Uri != null && __isset.uri) {
        field.Name = "uri";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Uri);
        oprot.WriteFieldEnd();
      }
      if (Token != null && __isset.token) {
        field.Name = "token";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Token);
        oprot.WriteFieldEnd();
      }
      if (CookiePath != null && __isset.cookiePath) {
        field.Name = "cookiePath";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CookiePath);
        oprot.WriteFieldEnd();
      }
      if (__isset.skip) {
        field.Name = "skip";
        field.Type = TType.Bool;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(Skip);
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
    StringBuilder __sb = new StringBuilder("SecurityCenterResult(");
    bool __first = true;
    if (Uri != null && __isset.uri) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Uri: ");
      __sb.Append(Uri);
    }
    if (Token != null && __isset.token) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Token: ");
      __sb.Append(Token);
    }
    if (CookiePath != null && __isset.cookiePath) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CookiePath: ");
      __sb.Append(CookiePath);
    }
    if (__isset.skip) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Skip: ");
      __sb.Append(Skip);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

