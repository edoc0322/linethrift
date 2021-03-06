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
public partial class NotiCenterEventData : TBase
{
  private string _id;
  private string _to;
  private string _from_;
  private string _toChannel;
  private string _fromChannel;
  private string _eventType;
  private long _createdTime;
  private long _operationRevision;
  private Dictionary<string, string> _content;
  private Dictionary<string, string> _push;

  public string Id
  {
    get
    {
      return _id;
    }
    set
    {
      __isset.id = true;
      this._id = value;
    }
  }

  public string To
  {
    get
    {
      return _to;
    }
    set
    {
      __isset.to = true;
      this._to = value;
    }
  }

  public string From_
  {
    get
    {
      return _from_;
    }
    set
    {
      __isset.from_ = true;
      this._from_ = value;
    }
  }

  public string ToChannel
  {
    get
    {
      return _toChannel;
    }
    set
    {
      __isset.toChannel = true;
      this._toChannel = value;
    }
  }

  public string FromChannel
  {
    get
    {
      return _fromChannel;
    }
    set
    {
      __isset.fromChannel = true;
      this._fromChannel = value;
    }
  }

  public string EventType
  {
    get
    {
      return _eventType;
    }
    set
    {
      __isset.eventType = true;
      this._eventType = value;
    }
  }

  public long CreatedTime
  {
    get
    {
      return _createdTime;
    }
    set
    {
      __isset.createdTime = true;
      this._createdTime = value;
    }
  }

  public long OperationRevision
  {
    get
    {
      return _operationRevision;
    }
    set
    {
      __isset.operationRevision = true;
      this._operationRevision = value;
    }
  }

  public Dictionary<string, string> Content
  {
    get
    {
      return _content;
    }
    set
    {
      __isset.content = true;
      this._content = value;
    }
  }

  public Dictionary<string, string> Push
  {
    get
    {
      return _push;
    }
    set
    {
      __isset.push = true;
      this._push = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool id;
    public bool to;
    public bool from_;
    public bool toChannel;
    public bool fromChannel;
    public bool eventType;
    public bool createdTime;
    public bool operationRevision;
    public bool content;
    public bool push;
  }

  public NotiCenterEventData() {
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
              Id = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              To = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              From_ = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              ToChannel = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              FromChannel = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              EventType = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.I64) {
              CreatedTime = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.I64) {
              OperationRevision = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.Map) {
              {
                Content = new Dictionary<string, string>();
                TMap _map95 = iprot.ReadMapBegin();
                for( int _i96 = 0; _i96 < _map95.Count; ++_i96)
                {
                  string _key97;
                  string _val98;
                  _key97 = iprot.ReadString();
                  _val98 = iprot.ReadString();
                  Content[_key97] = _val98;
                }
                iprot.ReadMapEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.Map) {
              {
                Push = new Dictionary<string, string>();
                TMap _map99 = iprot.ReadMapBegin();
                for( int _i100 = 0; _i100 < _map99.Count; ++_i100)
                {
                  string _key101;
                  string _val102;
                  _key101 = iprot.ReadString();
                  _val102 = iprot.ReadString();
                  Push[_key101] = _val102;
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
      TStruct struc = new TStruct("NotiCenterEventData");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Id != null && __isset.id) {
        field.Name = "id";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Id);
        oprot.WriteFieldEnd();
      }
      if (To != null && __isset.to) {
        field.Name = "to";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(To);
        oprot.WriteFieldEnd();
      }
      if (From_ != null && __isset.from_) {
        field.Name = "from_";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(From_);
        oprot.WriteFieldEnd();
      }
      if (ToChannel != null && __isset.toChannel) {
        field.Name = "toChannel";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ToChannel);
        oprot.WriteFieldEnd();
      }
      if (FromChannel != null && __isset.fromChannel) {
        field.Name = "fromChannel";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(FromChannel);
        oprot.WriteFieldEnd();
      }
      if (EventType != null && __isset.eventType) {
        field.Name = "eventType";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(EventType);
        oprot.WriteFieldEnd();
      }
      if (__isset.createdTime) {
        field.Name = "createdTime";
        field.Type = TType.I64;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CreatedTime);
        oprot.WriteFieldEnd();
      }
      if (__isset.operationRevision) {
        field.Name = "operationRevision";
        field.Type = TType.I64;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(OperationRevision);
        oprot.WriteFieldEnd();
      }
      if (Content != null && __isset.content) {
        field.Name = "content";
        field.Type = TType.Map;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteMapBegin(new TMap(TType.String, TType.String, Content.Count));
          foreach (string _iter103 in Content.Keys)
          {
            oprot.WriteString(_iter103);
            oprot.WriteString(Content[_iter103]);
          }
          oprot.WriteMapEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (Push != null && __isset.push) {
        field.Name = "push";
        field.Type = TType.Map;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteMapBegin(new TMap(TType.String, TType.String, Push.Count));
          foreach (string _iter104 in Push.Keys)
          {
            oprot.WriteString(_iter104);
            oprot.WriteString(Push[_iter104]);
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
    StringBuilder __sb = new StringBuilder("NotiCenterEventData(");
    bool __first = true;
    if (Id != null && __isset.id) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Id: ");
      __sb.Append(Id);
    }
    if (To != null && __isset.to) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("To: ");
      __sb.Append(To);
    }
    if (From_ != null && __isset.from_) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("From_: ");
      __sb.Append(From_);
    }
    if (ToChannel != null && __isset.toChannel) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ToChannel: ");
      __sb.Append(ToChannel);
    }
    if (FromChannel != null && __isset.fromChannel) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("FromChannel: ");
      __sb.Append(FromChannel);
    }
    if (EventType != null && __isset.eventType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("EventType: ");
      __sb.Append(EventType);
    }
    if (__isset.createdTime) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CreatedTime: ");
      __sb.Append(CreatedTime);
    }
    if (__isset.operationRevision) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("OperationRevision: ");
      __sb.Append(OperationRevision);
    }
    if (Content != null && __isset.content) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Content: ");
      __sb.Append(Content);
    }
    if (Push != null && __isset.push) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Push: ");
      __sb.Append(Push);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

