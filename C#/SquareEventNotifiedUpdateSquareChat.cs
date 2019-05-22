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
public partial class SquareEventNotifiedUpdateSquareChat : TBase
{
  private string _squareMid;
  private string _squareChatMid;
  private SquareChat _squareChat;

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

  public SquareChat SquareChat
  {
    get
    {
      return _squareChat;
    }
    set
    {
      __isset.squareChat = true;
      this._squareChat = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareMid;
    public bool squareChatMid;
    public bool squareChat;
  }

  public SquareEventNotifiedUpdateSquareChat() {
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
            if (field.Type == TType.String) {
              SquareChatMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              SquareChat = new SquareChat();
              SquareChat.Read(iprot);
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
      TStruct struc = new TStruct("SquareEventNotifiedUpdateSquareChat");
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
      if (SquareChatMid != null && __isset.squareChatMid) {
        field.Name = "squareChatMid";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareChatMid);
        oprot.WriteFieldEnd();
      }
      if (SquareChat != null && __isset.squareChat) {
        field.Name = "squareChat";
        field.Type = TType.Struct;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        SquareChat.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("SquareEventNotifiedUpdateSquareChat(");
    bool __first = true;
    if (SquareMid != null && __isset.squareMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareMid: ");
      __sb.Append(SquareMid);
    }
    if (SquareChatMid != null && __isset.squareChatMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareChatMid: ");
      __sb.Append(SquareChatMid);
    }
    if (SquareChat != null && __isset.squareChat) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareChat: ");
      __sb.Append(SquareChat== null ? "<null>" : SquareChat.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
