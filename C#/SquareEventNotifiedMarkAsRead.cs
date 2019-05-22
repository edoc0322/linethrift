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
public partial class SquareEventNotifiedMarkAsRead : TBase
{
  private string _squareChatMid;
  private string _sMemberMid;
  private string _messageId;

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

  public string SMemberMid
  {
    get
    {
      return _sMemberMid;
    }
    set
    {
      __isset.sMemberMid = true;
      this._sMemberMid = value;
    }
  }

  public string MessageId
  {
    get
    {
      return _messageId;
    }
    set
    {
      __isset.messageId = true;
      this._messageId = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareChatMid;
    public bool sMemberMid;
    public bool messageId;
  }

  public SquareEventNotifiedMarkAsRead() {
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
              SMemberMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              MessageId = iprot.ReadString();
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
      TStruct struc = new TStruct("SquareEventNotifiedMarkAsRead");
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
      if (SMemberMid != null && __isset.sMemberMid) {
        field.Name = "sMemberMid";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SMemberMid);
        oprot.WriteFieldEnd();
      }
      if (MessageId != null && __isset.messageId) {
        field.Name = "messageId";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(MessageId);
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
    StringBuilder __sb = new StringBuilder("SquareEventNotifiedMarkAsRead(");
    bool __first = true;
    if (SquareChatMid != null && __isset.squareChatMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareChatMid: ");
      __sb.Append(SquareChatMid);
    }
    if (SMemberMid != null && __isset.sMemberMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SMemberMid: ");
      __sb.Append(SMemberMid);
    }
    if (MessageId != null && __isset.messageId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("MessageId: ");
      __sb.Append(MessageId);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

