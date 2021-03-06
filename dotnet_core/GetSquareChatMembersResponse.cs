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



public partial class GetSquareChatMembersResponse : TBase
{
  private SquareMember _squareChatMembers;
  private string _continuationToken;

  public SquareMember SquareChatMembers
  {
    get
    {
      return _squareChatMembers;
    }
    set
    {
      __isset.squareChatMembers = true;
      this._squareChatMembers = value;
    }
  }

  public string ContinuationToken
  {
    get
    {
      return _continuationToken;
    }
    set
    {
      __isset.continuationToken = true;
      this._continuationToken = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareChatMembers;
    public bool continuationToken;
  }

  public GetSquareChatMembersResponse()
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
              SquareChatMembers = new SquareMember();
              await SquareChatMembers.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              ContinuationToken = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("GetSquareChatMembersResponse");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (SquareChatMembers != null && __isset.squareChatMembers)
      {
        field.Name = "squareChatMembers";
        field.Type = TType.Struct;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareChatMembers.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ContinuationToken != null && __isset.continuationToken)
      {
        field.Name = "continuationToken";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ContinuationToken, cancellationToken);
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
    var sb = new StringBuilder("GetSquareChatMembersResponse(");
    bool __first = true;
    if (SquareChatMembers != null && __isset.squareChatMembers)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatMembers: ");
      sb.Append(SquareChatMembers== null ? "<null>" : SquareChatMembers.ToString());
    }
    if (ContinuationToken != null && __isset.continuationToken)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ContinuationToken: ");
      sb.Append(ContinuationToken);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

