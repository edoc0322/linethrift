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
public partial class TMessageReadRange : TBase
{
  private string _chatId;
  private Dictionary<string, List<TMessageReadRangeEntry>> _ranges;

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

  public Dictionary<string, List<TMessageReadRangeEntry>> Ranges
  {
    get
    {
      return _ranges;
    }
    set
    {
      __isset.ranges = true;
      this._ranges = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool chatId;
    public bool ranges;
  }

  public TMessageReadRange() {
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
            if (field.Type == TType.Map) {
              {
                Ranges = new Dictionary<string, List<TMessageReadRangeEntry>>();
                TMap _map355 = iprot.ReadMapBegin();
                for( int _i356 = 0; _i356 < _map355.Count; ++_i356)
                {
                  string _key357;
                  List<TMessageReadRangeEntry> _val358;
                  _key357 = iprot.ReadString();
                  {
                    _val358 = new List<TMessageReadRangeEntry>();
                    TList _list359 = iprot.ReadListBegin();
                    for( int _i360 = 0; _i360 < _list359.Count; ++_i360)
                    {
                      TMessageReadRangeEntry _elem361;
                      _elem361 = new TMessageReadRangeEntry();
                      _elem361.Read(iprot);
                      _val358.Add(_elem361);
                    }
                    iprot.ReadListEnd();
                  }
                  Ranges[_key357] = _val358;
                }
                iprot.ReadMapEnd();
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
      TStruct struc = new TStruct("TMessageReadRange");
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
      if (Ranges != null && __isset.ranges) {
        field.Name = "ranges";
        field.Type = TType.Map;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteMapBegin(new TMap(TType.String, TType.List, Ranges.Count));
          foreach (string _iter362 in Ranges.Keys)
          {
            oprot.WriteString(_iter362);
            {
              oprot.WriteListBegin(new TList(TType.Struct, Ranges[_iter362].Count));
              foreach (TMessageReadRangeEntry _iter363 in Ranges[_iter362])
              {
                _iter363.Write(oprot);
              }
              oprot.WriteListEnd();
            }
          }
          oprot.WriteMapEnd();
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
    StringBuilder __sb = new StringBuilder("TMessageReadRange(");
    bool __first = true;
    if (ChatId != null && __isset.chatId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ChatId: ");
      __sb.Append(ChatId);
    }
    if (Ranges != null && __isset.ranges) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Ranges: ");
      __sb.Append(Ranges);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

