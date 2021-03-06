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



public partial class ProductSimple : TBase
{
  private string _productId;
  private long _packageId;
  private int _version;
  private bool _onSale;
  private long _validUntil;
  private List<StickerIdRange> _stickerIdRanges;
  private bool _grantedByDefault;
  private int _displayOrder;

  public string ProductId
  {
    get
    {
      return _productId;
    }
    set
    {
      __isset.productId = true;
      this._productId = value;
    }
  }

  public long PackageId
  {
    get
    {
      return _packageId;
    }
    set
    {
      __isset.packageId = true;
      this._packageId = value;
    }
  }

  public int Version
  {
    get
    {
      return _version;
    }
    set
    {
      __isset.version = true;
      this._version = value;
    }
  }

  public bool OnSale
  {
    get
    {
      return _onSale;
    }
    set
    {
      __isset.onSale = true;
      this._onSale = value;
    }
  }

  public long ValidUntil
  {
    get
    {
      return _validUntil;
    }
    set
    {
      __isset.validUntil = true;
      this._validUntil = value;
    }
  }

  public List<StickerIdRange> StickerIdRanges
  {
    get
    {
      return _stickerIdRanges;
    }
    set
    {
      __isset.stickerIdRanges = true;
      this._stickerIdRanges = value;
    }
  }

  public bool GrantedByDefault
  {
    get
    {
      return _grantedByDefault;
    }
    set
    {
      __isset.grantedByDefault = true;
      this._grantedByDefault = value;
    }
  }

  public int DisplayOrder
  {
    get
    {
      return _displayOrder;
    }
    set
    {
      __isset.displayOrder = true;
      this._displayOrder = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool productId;
    public bool packageId;
    public bool version;
    public bool onSale;
    public bool validUntil;
    public bool stickerIdRanges;
    public bool grantedByDefault;
    public bool displayOrder;
  }

  public ProductSimple()
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
              ProductId = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.I64)
            {
              PackageId = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.I32)
            {
              Version = await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.Bool)
            {
              OnSale = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 5:
            if (field.Type == TType.I64)
            {
              ValidUntil = await iprot.ReadI64Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 10:
            if (field.Type == TType.List)
            {
              {
                StickerIdRanges = new List<StickerIdRange>();
                TList _list201 = await iprot.ReadListBeginAsync(cancellationToken);
                for(int _i202 = 0; _i202 < _list201.Count; ++_i202)
                {
                  StickerIdRange _elem203;
                  _elem203 = new StickerIdRange();
                  await _elem203.ReadAsync(iprot, cancellationToken);
                  StickerIdRanges.Add(_elem203);
                }
                await iprot.ReadListEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 41:
            if (field.Type == TType.Bool)
            {
              GrantedByDefault = await iprot.ReadBoolAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 42:
            if (field.Type == TType.I32)
            {
              DisplayOrder = await iprot.ReadI32Async(cancellationToken);
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
      var struc = new TStruct("ProductSimple");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (ProductId != null && __isset.productId)
      {
        field.Name = "productId";
        field.Type = TType.String;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ProductId, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.packageId)
      {
        field.Name = "packageId";
        field.Type = TType.I64;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(PackageId, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.version)
      {
        field.Name = "version";
        field.Type = TType.I32;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(Version, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.onSale)
      {
        field.Name = "onSale";
        field.Type = TType.Bool;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(OnSale, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.validUntil)
      {
        field.Name = "validUntil";
        field.Type = TType.I64;
        field.ID = 5;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI64Async(ValidUntil, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (StickerIdRanges != null && __isset.stickerIdRanges)
      {
        field.Name = "stickerIdRanges";
        field.Type = TType.List;
        field.ID = 10;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.Struct, StickerIdRanges.Count), cancellationToken);
          foreach (StickerIdRange _iter204 in StickerIdRanges)
          {
            await _iter204.WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.grantedByDefault)
      {
        field.Name = "grantedByDefault";
        field.Type = TType.Bool;
        field.ID = 41;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteBoolAsync(GrantedByDefault, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.displayOrder)
      {
        field.Name = "displayOrder";
        field.Type = TType.I32;
        field.ID = 42;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async(DisplayOrder, cancellationToken);
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
    var sb = new StringBuilder("ProductSimple(");
    bool __first = true;
    if (ProductId != null && __isset.productId)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ProductId: ");
      sb.Append(ProductId);
    }
    if (__isset.packageId)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("PackageId: ");
      sb.Append(PackageId);
    }
    if (__isset.version)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Version: ");
      sb.Append(Version);
    }
    if (__isset.onSale)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("OnSale: ");
      sb.Append(OnSale);
    }
    if (__isset.validUntil)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ValidUntil: ");
      sb.Append(ValidUntil);
    }
    if (StickerIdRanges != null && __isset.stickerIdRanges)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("StickerIdRanges: ");
      sb.Append(StickerIdRanges);
    }
    if (__isset.grantedByDefault)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("GrantedByDefault: ");
      sb.Append(GrantedByDefault);
    }
    if (__isset.displayOrder)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("DisplayOrder: ");
      sb.Append(DisplayOrder);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

