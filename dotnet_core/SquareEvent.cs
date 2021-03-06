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



public partial class SquareEvent : TBase
{
  private long _createdTime;
  private SquareEventType _type;
  private SquareEventPayload _payload;
  private string _syncToken;
  private SquareEventStatus _eventStatus;

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

  /// <summary>
  /// 
  /// <seealso cref="SquareEventType"/>
  /// </summary>
  public SquareEventType Type
  {
    get
    {
      return _type;
    }
    set
    {
      __isset.type = true;
      this._type = value;
    }
  }

  public SquareEventPayload Payload
  {
    get
    {
      return _payload;
    }
    set
    {
      __isset.payload = true;
      this._payload = value;
    }
  }

  public string SyncToken
  {
    get
    {
      return _syncToken;
    }
    set
    {
      __isset.syncToken = true;
      this._syncToken = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareEventStatus"/>
  /// </summary>
  public SquareEventStatus EventStatus
  {
    get
    {
      return _eventStatus;
    }
    set
    {
      __isset.eventStatus = true;
      this._eventStatus = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool createdTime;
    public bool type;
    public bool payload;
    public bool syncToken;
    public bool eventStatus;
  }

  public SquareEvent()
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
          case 2:
            if (field.Type == TType.I64)
            {
              CreatedTime = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.I32)
            {
              Type = (SquareEventType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Struct)
            {
              Payload = new SquareEventPayload();
              await Payload.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.String)
            {
              SyncToken = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 6:
            if (field.Type == TType.I32)
            {
              EventStatus = (SquareEventStatus)await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("SquareEvent");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.createdTime)
      {
        field.Name = "createdTime";
        field.Type = TType.I64;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(CreatedTime, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.type)
      {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)Type, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Payload != null && __isset.payload)
      {
        field.Name = "payload";
        field.Type = TType.Struct;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Payload.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SyncToken != null && __isset.syncToken)
      {
        field.Name = "syncToken";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(SyncToken, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.eventStatus)
      {
        field.Name = "eventStatus";
        field.Type = TType.I32;
        field.ID = 6;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)EventStatus, cancellationToken);
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
    var sb = new StringBuilder("SquareEvent(");
    bool __first = true;
    if (__isset.createdTime)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CreatedTime: ");
      sb.Append(CreatedTime);
    }
    if (__isset.type)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Type: ");
      sb.Append(Type);
    }
    if (Payload != null && __isset.payload)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Payload: ");
      sb.Append(Payload== null ? "<null>" : Payload.ToString());
    }
    if (SyncToken != null && __isset.syncToken)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SyncToken: ");
      sb.Append(SyncToken);
    }
    if (__isset.eventStatus)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("EventStatus: ");
      sb.Append(EventStatus);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

