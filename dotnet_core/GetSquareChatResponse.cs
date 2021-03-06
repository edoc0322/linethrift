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



public partial class GetSquareChatResponse : TBase
{
  private SquareChat _squareChat;
  private SquareChatMember _squareChatMember;
  private SquareChatStatus _squareChatStatus;

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

  public SquareChatMember SquareChatMember
  {
    get
    {
      return _squareChatMember;
    }
    set
    {
      __isset.squareChatMember = true;
      this._squareChatMember = value;
    }
  }

  public SquareChatStatus SquareChatStatus
  {
    get
    {
      return _squareChatStatus;
    }
    set
    {
      __isset.squareChatStatus = true;
      this._squareChatStatus = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareChat;
    public bool squareChatMember;
    public bool squareChatStatus;
  }

  public GetSquareChatResponse()
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
          case 2:
            if (field.Type == TType.Struct)
            {
              SquareChatMember = new SquareChatMember();
              await SquareChatMember.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Struct)
            {
              SquareChatStatus = new SquareChatStatus();
              await SquareChatStatus.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("GetSquareChatResponse");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (SquareChat != null && __isset.squareChat)
      {
        field.Name = "squareChat";
        field.Type = TType.Struct;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareChat.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareChatMember != null && __isset.squareChatMember)
      {
        field.Name = "squareChatMember";
        field.Type = TType.Struct;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareChatMember.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareChatStatus != null && __isset.squareChatStatus)
      {
        field.Name = "squareChatStatus";
        field.Type = TType.Struct;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareChatStatus.WriteAsync(oprot, cancellationToken);
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
    var sb = new StringBuilder("GetSquareChatResponse(");
    bool __first = true;
    if (SquareChat != null && __isset.squareChat)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChat: ");
      sb.Append(SquareChat== null ? "<null>" : SquareChat.ToString());
    }
    if (SquareChatMember != null && __isset.squareChatMember)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatMember: ");
      sb.Append(SquareChatMember== null ? "<null>" : SquareChatMember.ToString());
    }
    if (SquareChatStatus != null && __isset.squareChatStatus)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatStatus: ");
      sb.Append(SquareChatStatus== null ? "<null>" : SquareChatStatus.ToString());
    }
    sb.Append(")");
    return sb.ToString();
  }
}

