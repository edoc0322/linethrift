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
public partial class GroupCallRoute : TBase
{
  private string _token;
  private CallHost _cscf;
  private CallHost _mix;

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

  public CallHost Cscf
  {
    get
    {
      return _cscf;
    }
    set
    {
      __isset.cscf = true;
      this._cscf = value;
    }
  }

  public CallHost Mix
  {
    get
    {
      return _mix;
    }
    set
    {
      __isset.mix = true;
      this._mix = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool token;
    public bool cscf;
    public bool mix;
  }

  public GroupCallRoute() {
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
              Token = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              Cscf = new CallHost();
              Cscf.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              Mix = new CallHost();
              Mix.Read(iprot);
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
      TStruct struc = new TStruct("GroupCallRoute");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Token != null && __isset.token) {
        field.Name = "token";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Token);
        oprot.WriteFieldEnd();
      }
      if (Cscf != null && __isset.cscf) {
        field.Name = "cscf";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        Cscf.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Mix != null && __isset.mix) {
        field.Name = "mix";
        field.Type = TType.Struct;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        Mix.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("GroupCallRoute(");
    bool __first = true;
    if (Token != null && __isset.token) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Token: ");
      __sb.Append(Token);
    }
    if (Cscf != null && __isset.cscf) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Cscf: ");
      __sb.Append(Cscf== null ? "<null>" : Cscf.ToString());
    }
    if (Mix != null && __isset.mix) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Mix: ");
      __sb.Append(Mix== null ? "<null>" : Mix.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
