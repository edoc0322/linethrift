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



public partial class SquareEventNotifiedUpdateSquareFeatureSet : TBase
{
  private SquareFeatureSet _squareFeatureSet;

  public SquareFeatureSet SquareFeatureSet
  {
    get
    {
      return _squareFeatureSet;
    }
    set
    {
      __isset.squareFeatureSet = true;
      this._squareFeatureSet = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool squareFeatureSet;
  }

  public SquareEventNotifiedUpdateSquareFeatureSet()
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
              SquareFeatureSet = new SquareFeatureSet();
              await SquareFeatureSet.ReadAsync(iprot, cancellationToken);
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
      var struc = new TStruct("SquareEventNotifiedUpdateSquareFeatureSet");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (SquareFeatureSet != null && __isset.squareFeatureSet)
      {
        field.Name = "squareFeatureSet";
        field.Type = TType.Struct;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await SquareFeatureSet.WriteAsync(oprot, cancellationToken);
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
    var sb = new StringBuilder("SquareEventNotifiedUpdateSquareFeatureSet(");
    bool __first = true;
    if (SquareFeatureSet != null && __isset.squareFeatureSet)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("SquareFeatureSet: ");
      sb.Append(SquareFeatureSet== null ? "<null>" : SquareFeatureSet.ToString());
    }
    sb.Append(")");
    return sb.ToString();
  }
}

