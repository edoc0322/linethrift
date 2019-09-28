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



public partial class CoinPurchaseConfirm : TBase
{
  private string _orderId;
  private PaymentType _appStoreCode;
  private string _receipt;
  private string _signature;
  private string _seller;
  private string _requestType;
  private bool _ignoreReceipt;

  public string OrderId
  {
    get
    {
      return _orderId;
    }
    set
    {
      __isset.orderId = true;
      this._orderId = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="PaymentType"/>
  /// </summary>
  public PaymentType AppStoreCode
  {
    get
    {
      return _appStoreCode;
    }
    set
    {
      __isset.appStoreCode = true;
      this._appStoreCode = value;
    }
  }

  public string Receipt
  {
    get
    {
      return _receipt;
    }
    set
    {
      __isset.receipt = true;
      this._receipt = value;
    }
  }

  public string Signature
  {
    get
    {
      return _signature;
    }
    set
    {
      __isset.signature = true;
      this._signature = value;
    }
  }

  public string Seller
  {
    get
    {
      return _seller;
    }
    set
    {
      __isset.seller = true;
      this._seller = value;
    }
  }

  public string RequestType
  {
    get
    {
      return _requestType;
    }
    set
    {
      __isset.requestType = true;
      this._requestType = value;
    }
  }

  public bool IgnoreReceipt
  {
    get
    {
      return _ignoreReceipt;
    }
    set
    {
      __isset.ignoreReceipt = true;
      this._ignoreReceipt = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool orderId;
    public bool appStoreCode;
    public bool receipt;
    public bool signature;
    public bool seller;
    public bool requestType;
    public bool ignoreReceipt;
  }

  public CoinPurchaseConfirm()
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
              OrderId = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I32)
            {
              AppStoreCode = (PaymentType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.String)
            {
              Receipt = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.String)
            {
              Signature = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.String)
            {
              Seller = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 6:
            if (field.Type == TType.String)
            {
              RequestType = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 7:
            if (field.Type == TType.Bool)
            {
              IgnoreReceipt = await iprot.ReadBoolAsync(cancellationToken);
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
      var struc = new TStruct("CoinPurchaseConfirm");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (OrderId != null && __isset.orderId)
      {
        field.Name = "orderId";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(OrderId, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.appStoreCode)
      {
        field.Name = "appStoreCode";
        field.Type = TType.I32;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)AppStoreCode, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Receipt != null && __isset.receipt)
      {
        field.Name = "receipt";
        field.Type = TType.String;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Receipt, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Signature != null && __isset.signature)
      {
        field.Name = "signature";
        field.Type = TType.String;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Signature, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Seller != null && __isset.seller)
      {
        field.Name = "seller";
        field.Type = TType.String;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Seller, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (RequestType != null && __isset.requestType)
      {
        field.Name = "requestType";
        field.Type = TType.String;
        field.ID = 6;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(RequestType, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.ignoreReceipt)
      {
        field.Name = "ignoreReceipt";
        field.Type = TType.Bool;
        field.ID = 7;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(IgnoreReceipt, cancellationToken);
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
    var other = that as CoinPurchaseConfirm;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.orderId == other.__isset.orderId) && ((!__isset.orderId) || (System.Object.Equals(OrderId, other.OrderId))))
      && ((__isset.appStoreCode == other.__isset.appStoreCode) && ((!__isset.appStoreCode) || (System.Object.Equals(AppStoreCode, other.AppStoreCode))))
      && ((__isset.receipt == other.__isset.receipt) && ((!__isset.receipt) || (System.Object.Equals(Receipt, other.Receipt))))
      && ((__isset.signature == other.__isset.signature) && ((!__isset.signature) || (System.Object.Equals(Signature, other.Signature))))
      && ((__isset.seller == other.__isset.seller) && ((!__isset.seller) || (System.Object.Equals(Seller, other.Seller))))
      && ((__isset.requestType == other.__isset.requestType) && ((!__isset.requestType) || (System.Object.Equals(RequestType, other.RequestType))))
      && ((__isset.ignoreReceipt == other.__isset.ignoreReceipt) && ((!__isset.ignoreReceipt) || (System.Object.Equals(IgnoreReceipt, other.IgnoreReceipt))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.orderId)
        hashcode = (hashcode * 397) + OrderId.GetHashCode();
      if(__isset.appStoreCode)
        hashcode = (hashcode * 397) + AppStoreCode.GetHashCode();
      if(__isset.receipt)
        hashcode = (hashcode * 397) + Receipt.GetHashCode();
      if(__isset.signature)
        hashcode = (hashcode * 397) + Signature.GetHashCode();
      if(__isset.seller)
        hashcode = (hashcode * 397) + Seller.GetHashCode();
      if(__isset.requestType)
        hashcode = (hashcode * 397) + RequestType.GetHashCode();
      if(__isset.ignoreReceipt)
        hashcode = (hashcode * 397) + IgnoreReceipt.GetHashCode();
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("CoinPurchaseConfirm(");
    bool __first = true;
    if (OrderId != null && __isset.orderId)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("OrderId: ");
      sb.Append(OrderId);
    }
    if (__isset.appStoreCode)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("AppStoreCode: ");
      sb.Append(AppStoreCode);
    }
    if (Receipt != null && __isset.receipt)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Receipt: ");
      sb.Append(Receipt);
    }
    if (Signature != null && __isset.signature)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Signature: ");
      sb.Append(Signature);
    }
    if (Seller != null && __isset.seller)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Seller: ");
      sb.Append(Seller);
    }
    if (RequestType != null && __isset.requestType)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("RequestType: ");
      sb.Append(RequestType);
    }
    if (__isset.ignoreReceipt)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("IgnoreReceipt: ");
      sb.Append(IgnoreReceipt);
    }
    sb.Append(")");
    return sb.ToString();
  }
}
