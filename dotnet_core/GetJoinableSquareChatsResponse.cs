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



public partial class GetJoinableSquareChatsResponse : TBase
{
  private List<SquareChat> _squareChats;
  private string _continuationToken;
  private int _totalSquareChatCount;
  private Dictionary<string, SquareChatStatus> _squareChatStatuses;

  public List<SquareChat> SquareChats
  {
    get
    {
      return _squareChats;
    }
    set
    {
      __isset.squareChats = true;
      this._squareChats = value;
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

  public int TotalSquareChatCount
  {
    get
    {
      return _totalSquareChatCount;
    }
    set
    {
      __isset.totalSquareChatCount = true;
      this._totalSquareChatCount = value;
    }
  }

  public Dictionary<string, SquareChatStatus> SquareChatStatuses
  {
    get
    {
      return _squareChatStatuses;
    }
    set
    {
      __isset.squareChatStatuses = true;
      this._squareChatStatuses = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareChats;
    public bool continuationToken;
    public bool totalSquareChatCount;
    public bool squareChatStatuses;
  }

  public GetJoinableSquareChatsResponse()
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
            if (field.Type == TType.List)
            {
              {
                SquareChats = new List<SquareChat>();
                TList _list320 = await iprot.ReadListBeginAsync(cancellationToken);
                for(int _i321 = 0; _i321 < _list320.Count; ++_i321)
                {
                  SquareChat _elem322;
                  _elem322 = new SquareChat();
                  await _elem322.ReadAsync(iprot, cancellationToken);
                  SquareChats.Add(_elem322);
                }
                await iprot.ReadListEndAsync(cancellationToken);
              }
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
          case 3:
            if (field.Type == TType.I32)
            {
              TotalSquareChatCount = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Map)
            {
              {
                SquareChatStatuses = new Dictionary<string, SquareChatStatus>();
                TMap _map323 = await iprot.ReadMapBeginAsync(cancellationToken);
                for(int _i324 = 0; _i324 < _map323.Count; ++_i324)
                {
                  string _key325;
                  SquareChatStatus _val326;
                  _key325 = await iprot.ReadStringAsync(cancellationToken);
                  _val326 = new SquareChatStatus();
                  await _val326.ReadAsync(iprot, cancellationToken);
                  SquareChatStatuses[_key325] = _val326;
                }
                await iprot.ReadMapEndAsync(cancellationToken);
              }
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
      var struc = new TStruct("GetJoinableSquareChatsResponse");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (SquareChats != null && __isset.squareChats)
      {
        field.Name = "squareChats";
        field.Type = TType.List;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.Struct, SquareChats.Count), cancellationToken);
          foreach (SquareChat _iter327 in SquareChats)
          {
            await _iter327.WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
        }
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
      if (__isset.totalSquareChatCount)
      {
        field.Name = "totalSquareChatCount";
        field.Type = TType.I32;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(TotalSquareChatCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (SquareChatStatuses != null && __isset.squareChatStatuses)
      {
        field.Name = "squareChatStatuses";
        field.Type = TType.Map;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteMapBeginAsync(new TMap(TType.String, TType.Struct, SquareChatStatuses.Count), cancellationToken);
          foreach (string _iter328 in SquareChatStatuses.Keys)
          {
            await oprot.WriteStringAsync(_iter328, cancellationToken);
            await SquareChatStatuses[_iter328].WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteMapEndAsync(cancellationToken);
        }
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
    var sb = new StringBuilder("GetJoinableSquareChatsResponse(");
    bool __first = true;
    if (SquareChats != null && __isset.squareChats)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChats: ");
      sb.Append(SquareChats);
    }
    if (ContinuationToken != null && __isset.continuationToken)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ContinuationToken: ");
      sb.Append(ContinuationToken);
    }
    if (__isset.totalSquareChatCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("TotalSquareChatCount: ");
      sb.Append(TotalSquareChatCount);
    }
    if (SquareChatStatuses != null && __isset.squareChatStatuses)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareChatStatuses: ");
      sb.Append(SquareChatStatuses);
    }
    sb.Append(")");
    return sb.ToString();
  }
}
