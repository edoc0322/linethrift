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



public partial class UpdateSquareChatRequest : TBase
{
  private THashSet<SquareChatAttribute> _updatedAttrs;
  private SquareChat _squareChat;

  public THashSet<SquareChatAttribute> UpdatedAttrs
  {
    get
    {
      return _updatedAttrs;
    }
    set
    {
      __isset.updatedAttrs = true;
      this._updatedAttrs = value;
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
  public struct Isset
  {
    public bool updatedAttrs;
    public bool squareChat;
  }

  public UpdateSquareChatRequest()
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
            if (field.Type == TType.Set)
            {
              {
                UpdatedAttrs = new THashSet<SquareChatAttribute>();
                TSet _set471 = await iprot.ReadSetBeginAsync(cancellationToken);
                for(int _i472 = 0; _i472 < _set471.Count; ++_i472)
                {
                  SquareChatAttribute _elem473;
                  _elem473 = (SquareChatAttribute)await iprot.ReadI32Async(cancellationToken);
                  UpdatedAttrs.Add(_elem473);
                }
                await iprot.ReadSetEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Struct)
            {
              SquareChat = new SquareChat();
              await SquareChat.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("UpdateSquareChatRequest");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (UpdatedAttrs != null && __isset.updatedAttrs)
      {
        field.Name = "updatedAttrs";
        field.Type = TType.Set;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteSetBeginAsync(new TSet(TType.I32, UpdatedAttrs.Count), cancellationToken);
          foreach (SquareChatAttribute _iter474 in UpdatedAttrs)
          {
            await oprot.WriteI32Async((int)_iter474, cancellationToken);
          }
          await oprot.WriteSetEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareChat != null && __isset.squareChat)
      {
        field.Name = "squareChat";
        field.Type = TType.Struct;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareChat.WriteAsync(oprot, cancellationToken);
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
    var sb = new StringBuilder("UpdateSquareChatRequest(");
    bool __first = true;
    if (UpdatedAttrs != null && __isset.updatedAttrs)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("UpdatedAttrs: ");
      sb.Append(UpdatedAttrs);
    }
    if (SquareChat != null && __isset.squareChat)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChat: ");
      sb.Append(SquareChat== null ? "<null>" : SquareChat.ToString());
    }
    sb.Append(")");
    return sb.ToString();
  }
}

