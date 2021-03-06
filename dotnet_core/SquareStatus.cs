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



public partial class SquareStatus : TBase
{
  private int _memberCount;
  private int _joinRequestCount;
  private long _lastJoinRequestAt;
  private int _openChatCount;

  public int MemberCount
  {
    get
    {
      return _memberCount;
    }
    set
    {
      __isset.memberCount = true;
      this._memberCount = value;
    }
  }

  public int JoinRequestCount
  {
    get
    {
      return _joinRequestCount;
    }
    set
    {
      __isset.joinRequestCount = true;
      this._joinRequestCount = value;
    }
  }

  public long LastJoinRequestAt
  {
    get
    {
      return _lastJoinRequestAt;
    }
    set
    {
      __isset.lastJoinRequestAt = true;
      this._lastJoinRequestAt = value;
    }
  }

  public int OpenChatCount
  {
    get
    {
      return _openChatCount;
    }
    set
    {
      __isset.openChatCount = true;
      this._openChatCount = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool memberCount;
    public bool joinRequestCount;
    public bool lastJoinRequestAt;
    public bool openChatCount;
  }

  public SquareStatus()
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
            if (field.Type == TType.I32)
            {
              MemberCount = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I32)
            {
              JoinRequestCount = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.I64)
            {
              LastJoinRequestAt = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.I32)
            {
              OpenChatCount = await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("SquareStatus");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.memberCount)
      {
        field.Name = "memberCount";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(MemberCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.joinRequestCount)
      {
        field.Name = "joinRequestCount";
        field.Type = TType.I32;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(JoinRequestCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.lastJoinRequestAt)
      {
        field.Name = "lastJoinRequestAt";
        field.Type = TType.I64;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(LastJoinRequestAt, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.openChatCount)
      {
        field.Name = "openChatCount";
        field.Type = TType.I32;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(OpenChatCount, cancellationToken);
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
    var sb = new StringBuilder("SquareStatus(");
    bool __first = true;
    if (__isset.memberCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MemberCount: ");
      sb.Append(MemberCount);
    }
    if (__isset.joinRequestCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("JoinRequestCount: ");
      sb.Append(JoinRequestCount);
    }
    if (__isset.lastJoinRequestAt)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("LastJoinRequestAt: ");
      sb.Append(LastJoinRequestAt);
    }
    if (__isset.openChatCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("OpenChatCount: ");
      sb.Append(OpenChatCount);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

