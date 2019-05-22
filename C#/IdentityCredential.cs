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
public partial class IdentityCredential : TBase
{
  private IdentityProvider _provider;
  private string _identifier;
  private string _password;

  /// <summary>
  /// 
  /// <seealso cref="IdentityProvider"/>
  /// </summary>
  public IdentityProvider Provider
  {
    get
    {
      return _provider;
    }
    set
    {
      __isset.provider = true;
      this._provider = value;
    }
  }

  public string Identifier
  {
    get
    {
      return _identifier;
    }
    set
    {
      __isset.identifier = true;
      this._identifier = value;
    }
  }

  public string Password
  {
    get
    {
      return _password;
    }
    set
    {
      __isset.password = true;
      this._password = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool provider;
    public bool identifier;
    public bool password;
  }

  public IdentityCredential() {
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
            if (field.Type == TType.I32) {
              Provider = (IdentityProvider)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Identifier = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Password = iprot.ReadString();
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
      TStruct struc = new TStruct("IdentityCredential");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.provider) {
        field.Name = "provider";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Provider);
        oprot.WriteFieldEnd();
      }
      if (Identifier != null && __isset.identifier) {
        field.Name = "identifier";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Identifier);
        oprot.WriteFieldEnd();
      }
      if (Password != null && __isset.password) {
        field.Name = "password";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Password);
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
    StringBuilder __sb = new StringBuilder("IdentityCredential(");
    bool __first = true;
    if (__isset.provider) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Provider: ");
      __sb.Append(Provider);
    }
    if (Identifier != null && __isset.identifier) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Identifier: ");
      __sb.Append(Identifier);
    }
    if (Password != null && __isset.password) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Password: ");
      __sb.Append(Password);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

