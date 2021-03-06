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



public partial class BuddyDetail : TBase
{
  private string _mid;
  private long _memberCount;
  private bool _onAir;
  private bool _businessAccount;
  private bool _addable;
  private THashSet<ContentType> _acceptableContentTypes;
  private bool _capableMyhome;

  public string Mid
  {
    get
    {
      return _mid;
    }
    set
    {
      __isset.mid = true;
      this._mid = value;
    }
  }

  public long MemberCount
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

  public bool OnAir
  {
    get
    {
      return _onAir;
    }
    set
    {
      __isset.onAir = true;
      this._onAir = value;
    }
  }

  public bool BusinessAccount
  {
    get
    {
      return _businessAccount;
    }
    set
    {
      __isset.businessAccount = true;
      this._businessAccount = value;
    }
  }

  public bool Addable
  {
    get
    {
      return _addable;
    }
    set
    {
      __isset.addable = true;
      this._addable = value;
    }
  }

  public THashSet<ContentType> AcceptableContentTypes
  {
    get
    {
      return _acceptableContentTypes;
    }
    set
    {
      __isset.acceptableContentTypes = true;
      this._acceptableContentTypes = value;
    }
  }

  public bool CapableMyhome
  {
    get
    {
      return _capableMyhome;
    }
    set
    {
      __isset.capableMyhome = true;
      this._capableMyhome = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool mid;
    public bool memberCount;
    public bool onAir;
    public bool businessAccount;
    public bool addable;
    public bool acceptableContentTypes;
    public bool capableMyhome;
  }

  public BuddyDetail()
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
              Mid = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I64)
            {
              MemberCount = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Bool)
            {
              OnAir = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Bool)
            {
              BusinessAccount = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.Bool)
            {
              Addable = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 6:
            if (field.Type == TType.Set)
            {
              {
                AcceptableContentTypes = new THashSet<ContentType>();
                TSet _set56 = await iprot.ReadSetBeginAsync(cancellationToken);
                for(int _i57 = 0; _i57 < _set56.Count; ++_i57)
                {
                  ContentType _elem58;
                  _elem58 = (ContentType)await iprot.ReadI32Async(cancellationToken);
                  AcceptableContentTypes.Add(_elem58);
                }
                await iprot.ReadSetEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 7:
            if (field.Type == TType.Bool)
            {
              CapableMyhome = await iprot.ReadBoolAsync(cancellationToken);
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
      var struc = new TStruct("BuddyDetail");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Mid != null && __isset.mid)
      {
        field.Name = "mid";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Mid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.memberCount)
      {
        field.Name = "memberCount";
        field.Type = TType.I64;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(MemberCount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.onAir)
      {
        field.Name = "onAir";
        field.Type = TType.Bool;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(OnAir, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.businessAccount)
      {
        field.Name = "businessAccount";
        field.Type = TType.Bool;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(BusinessAccount, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.addable)
      {
        field.Name = "addable";
        field.Type = TType.Bool;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(Addable, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (AcceptableContentTypes != null && __isset.acceptableContentTypes)
      {
        field.Name = "acceptableContentTypes";
        field.Type = TType.Set;
        field.ID = 6;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteSetBeginAsync(new TSet(TType.I32, AcceptableContentTypes.Count), cancellationToken);
          foreach (ContentType _iter59 in AcceptableContentTypes)
          {
            await oprot.WriteI32Async((int)_iter59, cancellationToken);
          }
          await oprot.WriteSetEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.capableMyhome)
      {
        field.Name = "capableMyhome";
        field.Type = TType.Bool;
        field.ID = 7;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(CapableMyhome, cancellationToken);
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
    var sb = new StringBuilder("BuddyDetail(");
    bool __first = true;
    if (Mid != null && __isset.mid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Mid: ");
      sb.Append(Mid);
    }
    if (__isset.memberCount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MemberCount: ");
      sb.Append(MemberCount);
    }
    if (__isset.onAir)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("OnAir: ");
      sb.Append(OnAir);
    }
    if (__isset.businessAccount)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("BusinessAccount: ");
      sb.Append(BusinessAccount);
    }
    if (__isset.addable)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Addable: ");
      sb.Append(Addable);
    }
    if (AcceptableContentTypes != null && __isset.acceptableContentTypes)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AcceptableContentTypes: ");
      sb.Append(AcceptableContentTypes);
    }
    if (__isset.capableMyhome)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("CapableMyhome: ");
      sb.Append(CapableMyhome);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

