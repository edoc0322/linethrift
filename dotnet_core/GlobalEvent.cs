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



public partial class GlobalEvent : TBase
{
  private string _key;
  private List<NotificationTarget> _targets;
  private long _createdTime;
  private long _data;
  private int _maxDelay;

  public string Key
  {
    get
    {
      return _key;
    }
    set
    {
      __isset.key = true;
      this._key = value;
    }
  }

  public List<NotificationTarget> Targets
  {
    get
    {
      return _targets;
    }
    set
    {
      __isset.targets = true;
      this._targets = value;
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

  public long Data
  {
    get
    {
      return _data;
    }
    set
    {
      __isset.data = true;
      this._data = value;
    }
  }

  public int MaxDelay
  {
    get
    {
      return _maxDelay;
    }
    set
    {
      __isset.maxDelay = true;
      this._maxDelay = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool key;
    public bool targets;
    public bool createdTime;
    public bool data;
    public bool maxDelay;
  }

  public GlobalEvent()
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
              Key = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.List)
            {
              {
                Targets = new List<NotificationTarget>();
                TList _list137 = await iprot.ReadListBeginAsync(cancellationToken);
                for(int _i138 = 0; _i138 < _list137.Count; ++_i138)
                {
                  NotificationTarget _elem139;
                  _elem139 = new NotificationTarget();
                  await _elem139.ReadAsync(iprot, cancellationToken);
                  Targets.Add(_elem139);
                }
                await iprot.ReadListEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.I64)
            {
              CreatedTime = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.I64)
            {
              Data = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.I32)
            {
              MaxDelay = await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("GlobalEvent");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Key != null && __isset.key)
      {
        field.Name = "key";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Key, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Targets != null && __isset.targets)
      {
        field.Name = "targets";
        field.Type = TType.List;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.Struct, Targets.Count), cancellationToken);
          foreach (NotificationTarget _iter140 in Targets)
          {
            await _iter140.WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.createdTime)
      {
        field.Name = "createdTime";
        field.Type = TType.I64;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(CreatedTime, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.data)
      {
        field.Name = "data";
        field.Type = TType.I64;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(Data, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.maxDelay)
      {
        field.Name = "maxDelay";
        field.Type = TType.I32;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(MaxDelay, cancellationToken);
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
    var sb = new StringBuilder("GlobalEvent(");
    bool __first = true;
    if (Key != null && __isset.key)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Key: ");
      sb.Append(Key);
    }
    if (Targets != null && __isset.targets)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Targets: ");
      sb.Append(Targets);
    }
    if (__isset.createdTime)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CreatedTime: ");
      sb.Append(CreatedTime);
    }
    if (__isset.data)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Data: ");
      sb.Append(Data);
    }
    if (__isset.maxDelay)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MaxDelay: ");
      sb.Append(MaxDelay);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

