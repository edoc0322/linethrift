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

using Thrift.Protocol;
using Thrift.Protocol.Entities;
using Thrift.Protocol.Utilities;
using Thrift.Transport;
using Thrift.Transport.Client;
using Thrift.Transport.Server;
using Thrift.Processor;



public partial class Ticket : TBase
{
  private string _id;
  private long _expirationTime;
  private int _maxUseCount;

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

  public long ExpirationTime
  {
    get
    {
      return _expirationTime;
    }
    set
    {
      __isset.expirationTime = true;
      this._expirationTime = value;
    }
  }

  public int MaxUseCount
  {
    get
    {
      return _maxUseCount;
    }
    set
    {
      __isset.maxUseCount = true;
      this._maxUseCount = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool id;
    public bool expirationTime;
    public bool maxUseCount;
  }

  public Ticket()
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
              Id = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 10:
            if (field.Type == TType.I64)
            {
              ExpirationTime = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 21:
            if (field.Type == TType.I32)
            {
              MaxUseCount = await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("Ticket");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Id != null && __isset.id)
      {
        field.Name = "id";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Id, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.expirationTime)
      {
        field.Name = "expirationTime";
        field.Type = TType.I64;
        field.ID = 10;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(ExpirationTime, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.maxUseCount)
      {
        field.Name = "maxUseCount";
        field.Type = TType.I32;
        field.ID = 21;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(MaxUseCount, cancellationToken);
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

  public override bool Equals(object that)
  {
    var other = that as Ticket;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.id == other.__isset.id) && ((!__isset.id) || (System.Object.Equals(Id, other.Id))))
      && ((__isset.expirationTime == other.__isset.expirationTime) && ((!__isset.expirationTime) || (System.Object.Equals(ExpirationTime, other.ExpirationTime))))
      && ((__isset.maxUseCount == other.__isset.maxUseCount) && ((!__isset.maxUseCount) || (System.Object.Equals(MaxUseCount, other.MaxUseCount))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.id)
        hashcode = (hashcode * 397) + Id.GetHashCode();
      if(__isset.expirationTime)
        hashcode = (hashcode * 397) + ExpirationTime.GetHashCode();
      if(__isset.maxUseCount)
        hashcode = (hashcode * 397) + MaxUseCount.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("Ticket(");
    bool __first = true;
    if (Id != null && __isset.id)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Id: ");
      sb.Append(Id);
    }
    if (__isset.expirationTime)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ExpirationTime: ");
      sb.Append(ExpirationTime);
    }
    if (__isset.maxUseCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MaxUseCount: ");
      sb.Append(MaxUseCount);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

