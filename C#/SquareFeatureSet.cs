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
public partial class SquareFeatureSet : TBase
{
  private string _squareMid;
  private long _revision;
  private SquareFeature _creatingSecretSquareChat;
  private SquareFeature _invitingIntoOpenSquareChat;

  public string SquareMid
  {
    get
    {
      return _squareMid;
    }
    set
    {
      __isset.squareMid = true;
      this._squareMid = value;
    }
  }

  public long Revision
  {
    get
    {
      return _revision;
    }
    set
    {
      __isset.revision = true;
      this._revision = value;
    }
  }

  public SquareFeature CreatingSecretSquareChat
  {
    get
    {
      return _creatingSecretSquareChat;
    }
    set
    {
      __isset.creatingSecretSquareChat = true;
      this._creatingSecretSquareChat = value;
    }
  }

  public SquareFeature InvitingIntoOpenSquareChat
  {
    get
    {
      return _invitingIntoOpenSquareChat;
    }
    set
    {
      __isset.invitingIntoOpenSquareChat = true;
      this._invitingIntoOpenSquareChat = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareMid;
    public bool revision;
    public bool creatingSecretSquareChat;
    public bool invitingIntoOpenSquareChat;
  }

  public SquareFeatureSet() {
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
              SquareMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              Revision = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.Struct) {
              CreatingSecretSquareChat = new SquareFeature();
              CreatingSecretSquareChat.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.Struct) {
              InvitingIntoOpenSquareChat = new SquareFeature();
              InvitingIntoOpenSquareChat.Read(iprot);
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
      TStruct struc = new TStruct("SquareFeatureSet");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SquareMid != null && __isset.squareMid) {
        field.Name = "squareMid";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareMid);
        oprot.WriteFieldEnd();
      }
      if (__isset.revision) {
        field.Name = "revision";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Revision);
        oprot.WriteFieldEnd();
      }
      if (CreatingSecretSquareChat != null && __isset.creatingSecretSquareChat) {
        field.Name = "creatingSecretSquareChat";
        field.Type = TType.Struct;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        CreatingSecretSquareChat.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (InvitingIntoOpenSquareChat != null && __isset.invitingIntoOpenSquareChat) {
        field.Name = "invitingIntoOpenSquareChat";
        field.Type = TType.Struct;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        InvitingIntoOpenSquareChat.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("SquareFeatureSet(");
    bool __first = true;
    if (SquareMid != null && __isset.squareMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareMid: ");
      __sb.Append(SquareMid);
    }
    if (__isset.revision) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Revision: ");
      __sb.Append(Revision);
    }
    if (CreatingSecretSquareChat != null && __isset.creatingSecretSquareChat) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CreatingSecretSquareChat: ");
      __sb.Append(CreatingSecretSquareChat== null ? "<null>" : CreatingSecretSquareChat.ToString());
    }
    if (InvitingIntoOpenSquareChat != null && __isset.invitingIntoOpenSquareChat) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("InvitingIntoOpenSquareChat: ");
      __sb.Append(InvitingIntoOpenSquareChat== null ? "<null>" : InvitingIntoOpenSquareChat.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

