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
public partial class EmailConfirmation : TBase
{
  private bool _usePasswordSet;
  private string _email;
  private string _password;
  private bool _ignoreDuplication;

  public bool UsePasswordSet
  {
    get
    {
      return _usePasswordSet;
    }
    set
    {
      __isset.usePasswordSet = true;
      this._usePasswordSet = value;
    }
  }

  public string Email
  {
    get
    {
      return _email;
    }
    set
    {
      __isset.email = true;
      this._email = value;
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

  public bool IgnoreDuplication
  {
    get
    {
      return _ignoreDuplication;
    }
    set
    {
      __isset.ignoreDuplication = true;
      this._ignoreDuplication = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool usePasswordSet;
    public bool email;
    public bool password;
    public bool ignoreDuplication;
  }

  public EmailConfirmation() {
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
            if (field.Type == TType.Bool) {
              UsePasswordSet = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Email = iprot.ReadString();
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
          case 4:
            if (field.Type == TType.Bool) {
              IgnoreDuplication = iprot.ReadBool();
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
      TStruct struc = new TStruct("EmailConfirmation");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.usePasswordSet) {
        field.Name = "usePasswordSet";
        field.Type = TType.Bool;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(UsePasswordSet);
        oprot.WriteFieldEnd();
      }
      if (Email != null && __isset.email) {
        field.Name = "email";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Email);
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
      if (__isset.ignoreDuplication) {
        field.Name = "ignoreDuplication";
        field.Type = TType.Bool;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(IgnoreDuplication);
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
    StringBuilder __sb = new StringBuilder("EmailConfirmation(");
    bool __first = true;
    if (__isset.usePasswordSet) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("UsePasswordSet: ");
      __sb.Append(UsePasswordSet);
    }
    if (Email != null && __isset.email) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Email: ");
      __sb.Append(Email);
    }
    if (Password != null && __isset.password) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Password: ");
      __sb.Append(Password);
    }
    if (__isset.ignoreDuplication) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("IgnoreDuplication: ");
      __sb.Append(IgnoreDuplication);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

