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
public partial class SquareEventNotifiedCreateSquareChatMember : TBase
{
  private string _squareChatMid;
  private string _squareMemberMid;
  private SquareChatMember _squareChatMember;

  public string SquareChatMid
  {
    get
    {
      return _squareChatMid;
    }
    set
    {
      __isset.squareChatMid = true;
      this._squareChatMid = value;
    }
  }

  public string SquareMemberMid
  {
    get
    {
      return _squareMemberMid;
    }
    set
    {
      __isset.squareMemberMid = true;
      this._squareMemberMid = value;
    }
  }

  public SquareChatMember SquareChatMember
  {
    get
    {
      return _squareChatMember;
    }
    set
    {
      __isset.squareChatMember = true;
      this._squareChatMember = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareChatMid;
    public bool squareMemberMid;
    public bool squareChatMember;
  }

  public SquareEventNotifiedCreateSquareChatMember() {
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
              SquareChatMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              SquareMemberMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              SquareChatMember = new SquareChatMember();
              SquareChatMember.Read(iprot);
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
      TStruct struc = new TStruct("SquareEventNotifiedCreateSquareChatMember");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SquareChatMid != null && __isset.squareChatMid) {
        field.Name = "squareChatMid";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareChatMid);
        oprot.WriteFieldEnd();
      }
      if (SquareMemberMid != null && __isset.squareMemberMid) {
        field.Name = "squareMemberMid";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareMemberMid);
        oprot.WriteFieldEnd();
      }
      if (SquareChatMember != null && __isset.squareChatMember) {
        field.Name = "squareChatMember";
        field.Type = TType.Struct;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        SquareChatMember.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("SquareEventNotifiedCreateSquareChatMember(");
    bool __first = true;
    if (SquareChatMid != null && __isset.squareChatMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareChatMid: ");
      __sb.Append(SquareChatMid);
    }
    if (SquareMemberMid != null && __isset.squareMemberMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareMemberMid: ");
      __sb.Append(SquareMemberMid);
    }
    if (SquareChatMember != null && __isset.squareChatMember) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareChatMember: ");
      __sb.Append(SquareChatMember== null ? "<null>" : SquareChatMember.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

