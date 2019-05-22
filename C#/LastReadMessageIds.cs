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
public partial class LastReadMessageIds : TBase
{
  private string _chatId;
  private List<LastReadMessageId> _lastReadMessageIds;

  public string ChatId
  {
    get
    {
      return _chatId;
    }
    set
    {
      __isset.chatId = true;
      this._chatId = value;
    }
  }

  public List<LastReadMessageId> LastReadMessageIds_
  {
    get
    {
      return _lastReadMessageIds;
    }
    set
    {
      __isset.lastReadMessageIds = true;
      this._lastReadMessageIds = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool chatId;
    public bool lastReadMessageIds;
  }

  public LastReadMessageIds() {
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
              ChatId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                LastReadMessageIds_ = new List<LastReadMessageId>();
                TList _list237 = iprot.ReadListBegin();
                for( int _i238 = 0; _i238 < _list237.Count; ++_i238)
                {
                  LastReadMessageId _elem239;
                  _elem239 = new LastReadMessageId();
                  _elem239.Read(iprot);
                  LastReadMessageIds_.Add(_elem239);
                }
                iprot.ReadListEnd();
              }
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
      TStruct struc = new TStruct("LastReadMessageIds");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ChatId != null && __isset.chatId) {
        field.Name = "chatId";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ChatId);
        oprot.WriteFieldEnd();
      }
      if (LastReadMessageIds_ != null && __isset.lastReadMessageIds) {
        field.Name = "lastReadMessageIds";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, LastReadMessageIds_.Count));
          foreach (LastReadMessageId _iter240 in LastReadMessageIds_)
          {
            _iter240.Write(oprot);
          }
          oprot.WriteListEnd();
        }
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
    StringBuilder __sb = new StringBuilder("LastReadMessageIds(");
    bool __first = true;
    if (ChatId != null && __isset.chatId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ChatId: ");
      __sb.Append(ChatId);
    }
    if (LastReadMessageIds_ != null && __isset.lastReadMessageIds) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("LastReadMessageIds_: ");
      __sb.Append(LastReadMessageIds_);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

