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
using System.Threading;
using System.Threading.Tasks;
using Thrift;
using Thrift.Collections;

using Thrift.Protocols;
using Thrift.Protocols.Entities;
using Thrift.Protocols.Utilities;
using Thrift.Transports;
using Thrift.Transports.Client;
using Thrift.Transports.Server;



public partial class MessageCommitResult : TBase
{
  private string _requestId;
  private BuddyResultState _state;
  private string _messageStoreRequestId;
  private List<string> _messageIds;
  private long _receiverCount;
  private long _successCount;
  private long _failCount;
  private long _blockCount;
  private long _unregisteredCount;
  private long _unrelatedCount;
  private string _errorDescription;

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

  public string MessageStoreRequestId
  {
    get
    {
      return _messageStoreRequestId;
    }
    set
    {
      __isset.messageStoreRequestId = true;
      this._messageStoreRequestId = value;
    }
  }

  public List<string> MessageIds
  {
    get
    {
      return _messageIds;
    }
    set
    {
      __isset.messageIds = true;
      this._messageIds = value;
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

  public long BlockCount
  {
    get
    {
      return _blockCount;
    }
    set
    {
      __isset.blockCount = true;
      this._blockCount = value;
    }
  }

  public long UnregisteredCount
  {
    get
    {
      return _unregisteredCount;
    }
    set
    {
      __isset.unregisteredCount = true;
      this._unregisteredCount = value;
    }
  }

  public long UnrelatedCount
  {
    get
    {
      return _unrelatedCount;
    }
    set
    {
      __isset.unrelatedCount = true;
      this._unrelatedCount = value;
    }
  }

  public string ErrorDescription
  {
    get
    {
      return _errorDescription;
    }
    set
    {
      __isset.errorDescription = true;
      this._errorDescription = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool requestId;
    public bool state;
    public bool messageStoreRequestId;
    public bool messageIds;
    public bool receiverCount;
    public bool successCount;
    public bool failCount;
    public bool blockCount;
    public bool unregisteredCount;
    public bool unrelatedCount;
    public bool errorDescription;
  }

  public MessageCommitResult()
  {
  }

  public async Task ReadAsync(TProtocol iprot, CancellationToken cancellationToken)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      await iprot.ReadStructBeginAsync(cancellationToken);
      while (true)
      {
        field = await iprot.ReadFieldBeginAsync(cancellationToken);
        if (field.Type == TType.Stop)
        {
          break;
        }

        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.String)
            {
              RequestId = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I32)
            {
              State = (BuddyResultState)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              MessageStoreRequestId = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.List)
            {
              {
                MessageIds = new List<string>();
                TList _list0 = await iprot.ReadListBeginAsync(cancellationToken);
                for(int _i1 = 0; _i1 < _list0.Count; ++_i1)
                {
                  string _elem2;
                  _elem2 = await iprot.ReadStringAsync(cancellationToken);
                  MessageIds.Add(_elem2);
                }
                await iprot.ReadListEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 11:
            if (field.Type == TType.I64)
            {
              ReceiverCount = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 12:
            if (field.Type == TType.I64)
            {
              SuccessCount = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 13:
            if (field.Type == TType.I64)
            {
              FailCount = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 14:
            if (field.Type == TType.I64)
            {
              BlockCount = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 15:
            if (field.Type == TType.I64)
            {
              UnregisteredCount = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 16:
            if (field.Type == TType.I64)
            {
              UnrelatedCount = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 21:
            if (field.Type == TType.String)
            {
              ErrorDescription = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          default: 
            await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            break;
        }

        await iprot.ReadFieldEndAsync(cancellationToken);
      }

      await iprot.ReadStructEndAsync(cancellationToken);
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public async Task WriteAsync(TProtocol oprot, CancellationToken cancellationToken)
  {
    oprot.IncrementRecursionDepth();
    try
    {
      var struc = new TStruct("MessageCommitResult");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (RequestId != null && __isset.requestId)
      {
        field.Name = "requestId";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(RequestId, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.state)
      {
        field.Name = "state";
        field.Type = TType.I32;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)State, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (MessageStoreRequestId != null && __isset.messageStoreRequestId)
      {
        field.Name = "messageStoreRequestId";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(MessageStoreRequestId, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (MessageIds != null && __isset.messageIds)
      {
        field.Name = "messageIds";
        field.Type = TType.List;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.String, MessageIds.Count), cancellationToken);
          foreach (string _iter3 in MessageIds)
          {
            await oprot.WriteStringAsync(_iter3, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.receiverCount)
      {
        field.Name = "receiverCount";
        field.Type = TType.I64;
        field.ID = 11;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(ReceiverCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.successCount)
      {
        field.Name = "successCount";
        field.Type = TType.I64;
        field.ID = 12;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(SuccessCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.failCount)
      {
        field.Name = "failCount";
        field.Type = TType.I64;
        field.ID = 13;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(FailCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.blockCount)
      {
        field.Name = "blockCount";
        field.Type = TType.I64;
        field.ID = 14;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(BlockCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.unregisteredCount)
      {
        field.Name = "unregisteredCount";
        field.Type = TType.I64;
        field.ID = 15;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(UnregisteredCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.unrelatedCount)
      {
        field.Name = "unrelatedCount";
        field.Type = TType.I64;
        field.ID = 16;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(UnrelatedCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ErrorDescription != null && __isset.errorDescription)
      {
        field.Name = "errorDescription";
        field.Type = TType.String;
        field.ID = 21;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ErrorDescription, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      await oprot.WriteFieldStopAsync(cancellationToken);
      await oprot.WriteStructEndAsync(cancellationToken);
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString()
  {
    var sb = new StringBuilder("MessageCommitResult(");
    bool __first = true;
    if (RequestId != null && __isset.requestId)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("RequestId: ");
      sb.Append(RequestId);
    }
    if (__isset.state)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("State: ");
      sb.Append(State);
    }
    if (MessageStoreRequestId != null && __isset.messageStoreRequestId)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MessageStoreRequestId: ");
      sb.Append(MessageStoreRequestId);
    }
    if (MessageIds != null && __isset.messageIds)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MessageIds: ");
      sb.Append(MessageIds);
    }
    if (__isset.receiverCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ReceiverCount: ");
      sb.Append(ReceiverCount);
    }
    if (__isset.successCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SuccessCount: ");
      sb.Append(SuccessCount);
    }
    if (__isset.failCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("FailCount: ");
      sb.Append(FailCount);
    }
    if (__isset.blockCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("BlockCount: ");
      sb.Append(BlockCount);
    }
    if (__isset.unregisteredCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("UnregisteredCount: ");
      sb.Append(UnregisteredCount);
    }
    if (__isset.unrelatedCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("UnrelatedCount: ");
      sb.Append(UnrelatedCount);
    }
    if (ErrorDescription != null && __isset.errorDescription)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ErrorDescription: ");
      sb.Append(ErrorDescription);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

