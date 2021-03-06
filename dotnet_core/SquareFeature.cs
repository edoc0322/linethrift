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



public partial class SquareFeature : TBase
{
  private SquareFeatureControlState _controlState;
  private BooleanState _booleanValue;

  /// <summary>
  /// 
  /// <seealso cref="SquareFeatureControlState"/>
  /// </summary>
  public SquareFeatureControlState ControlState
  {
    get
    {
      return _controlState;
    }
    set
    {
      __isset.controlState = true;
      this._controlState = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="BooleanState"/>
  /// </summary>
  public BooleanState BooleanValue
  {
    get
    {
      return _booleanValue;
    }
    set
    {
      __isset.booleanValue = true;
      this._booleanValue = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool controlState;
    public bool booleanValue;
  }

  public SquareFeature()
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
              ControlState = (SquareFeatureControlState)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I32)
            {
              BooleanValue = (BooleanState)await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("SquareFeature");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (__isset.controlState)
      {
        field.Name = "controlState";
        field.Type = TType.I32;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)ControlState, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.booleanValue)
      {
        field.Name = "booleanValue";
        field.Type = TType.I32;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)BooleanValue, cancellationToken);
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
    var sb = new StringBuilder("SquareFeature(");
    bool __first = true;
    if (__isset.controlState)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ControlState: ");
      sb.Append(ControlState);
    }
    if (__isset.booleanValue)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("BooleanValue: ");
      sb.Append(BooleanValue);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

