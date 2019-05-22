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
public partial class SetBuddyOnAirResult : TBase
{
  private string _requestId;
  private BuddyResultState _state;
  private int _eventNo;
  private long _receiverCount;
  private long _successCount;
  private long _failCount;
  private long _cancelCount;
  private long _unregisterCount;
  private long _timestamp;
  private string _message;

  public string RequestId
  {
    get
    {
      return _requestId;
    }
    set
    {
      __isset.requestId = true;
      this._requestId = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="BuddyResultState"/>
  /// </summary>
  public BuddyResultState State
  {
    get
    {
      return _state;
    }
    set
    {
      __isset.state = true;
      this._state = value;
    }
  }

  public int EventNo
  {
    get
    {
      return _eventNo;
    }
    set
    {
      __isset.eventNo = true;
      this._eventNo = value;
    }
  }

  public long ReceiverCount
  {
    get
    {
      return _receiverCount;
    }
    set
    {
      __isset.receiverCount = true;
      this._receiverCount = value;
    }
  }

  public long SuccessCount
  {
    get
    {
      return _successCount;
    }
    set
    {
      __isset.successCount = true;
      this._successCount = value;
    }
  }

  public long FailCount
  {
    get
    {
      return _failCount;
    }
    set
    {
      __isset.failCount = true;
      this._failCount = value;
    }
  }

  public long CancelCount
  {
    get
    {
      return _cancelCount;
    }
    set
    {
      __isset.cancelCount = true;
      this._cancelCount = value;
    }
  }

  public long UnregisterCount
  {
    get
    {
      return _unregisterCount;
    }
    set
    {
      __isset.unregisterCount = true;
      this._unregisterCount = value;
    }
  }

  public long Timestamp
  {
    get
    {
      return _timestamp;
    }
    set
    {
      __isset.timestamp = true;
      this._timestamp = value;
    }
  }

  public string Message
  {
    get
    {
      return _message;
    }
    set
    {
      __isset.message = true;
      this._message = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool requestId;
    public bool state;
    public bool eventNo;
    public bool receiverCount;
    public bool successCount;
    public bool failCount;
    public bool cancelCount;
    public bool unregisterCount;
    public bool timestamp;
    public bool message;
  }

  public SetBuddyOnAirResult() {
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
              RequestId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              State = (BuddyResultState)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              EventNo = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.I64) {
              ReceiverCount = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.I64) {
              SuccessCount = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 13:
            if (field.Type == TType.I64) {
              FailCount = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 14:
            if (field.Type == TType.I64) {
              CancelCount = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 15:
            if (field.Type == TType.I64) {
              UnregisterCount = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 21:
            if (field.Type == TType.I64) {
              Timestamp = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 22:
            if (field.Type == TType.String) {
              Message = iprot.ReadString();
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
      TStruct struc = new TStruct("SetBuddyOnAirResult");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (RequestId != null && __isset.requestId) {
        field.Name = "requestId";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(RequestId);
        oprot.WriteFieldEnd();
      }
      if (__isset.state) {
        field.Name = "state";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)State);
        oprot.WriteFieldEnd();
      }
      if (__isset.eventNo) {
        field.Name = "eventNo";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(EventNo);
        oprot.WriteFieldEnd();
      }
      if (__isset.receiverCount) {
        field.Name = "receiverCount";
        field.Type = TType.I64;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(ReceiverCount);
        oprot.WriteFieldEnd();
      }
      if (__isset.successCount) {
        field.Name = "successCount";
        field.Type = TType.I64;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(SuccessCount);
        oprot.WriteFieldEnd();
      }
      if (__isset.failCount) {
        field.Name = "failCount";
        field.Type = TType.I64;
        field.ID = 13;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(FailCount);
        oprot.WriteFieldEnd();
      }
      if (__isset.cancelCount) {
        field.Name = "cancelCount";
        field.Type = TType.I64;
        field.ID = 14;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CancelCount);
        oprot.WriteFieldEnd();
      }
      if (__isset.unregisterCount) {
        field.Name = "unregisterCount";
        field.Type = TType.I64;
        field.ID = 15;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(UnregisterCount);
        oprot.WriteFieldEnd();
      }
      if (__isset.timestamp) {
        field.Name = "timestamp";
        field.Type = TType.I64;
        field.ID = 21;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Timestamp);
        oprot.WriteFieldEnd();
      }
      if (Message != null && __isset.message) {
        field.Name = "message";
        field.Type = TType.String;
        field.ID = 22;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Message);
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
    StringBuilder __sb = new StringBuilder("SetBuddyOnAirResult(");
    bool __first = true;
    if (RequestId != null && __isset.requestId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("RequestId: ");
      __sb.Append(RequestId);
    }
    if (__isset.state) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("State: ");
      __sb.Append(State);
    }
    if (__isset.eventNo) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("EventNo: ");
      __sb.Append(EventNo);
    }
    if (__isset.receiverCount) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ReceiverCount: ");
      __sb.Append(ReceiverCount);
    }
    if (__isset.successCount) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SuccessCount: ");
      __sb.Append(SuccessCount);
    }
    if (__isset.failCount) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("FailCount: ");
      __sb.Append(FailCount);
    }
    if (__isset.cancelCount) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CancelCount: ");
      __sb.Append(CancelCount);
    }
    if (__isset.unregisterCount) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("UnregisterCount: ");
      __sb.Append(UnregisterCount);
    }
    if (__isset.timestamp) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Timestamp: ");
      __sb.Append(Timestamp);
    }
    if (Message != null && __isset.message) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Message: ");
      __sb.Append(Message);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

