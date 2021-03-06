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



public partial class ContactRegistration : TBase
{
  private Contact _contact;
  private string _luid;
  private ContactType _contactType;
  private string _contactKey;

  public Contact Contact
  {
    get
    {
      return _contact;
    }
    set
    {
      __isset.contact = true;
      this._contact = value;
    }
  }

  public string Luid
  {
    get
    {
      return _luid;
    }
    set
    {
      __isset.luid = true;
      this._luid = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="ContactType"/>
  /// </summary>
  public ContactType ContactType
  {
    get
    {
      return _contactType;
    }
    set
    {
      __isset.contactType = true;
      this._contactType = value;
    }
  }

  public string ContactKey
  {
    get
    {
      return _contactKey;
    }
    set
    {
      __isset.contactKey = true;
      this._contactKey = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool contact;
    public bool luid;
    public bool contactType;
    public bool contactKey;
  }

  public ContactRegistration()
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
              Contact = new Contact();
              await Contact.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 10:
            if (field.Type == TType.String)
            {
              Luid = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 11:
            if (field.Type == TType.I32)
            {
              ContactType = (ContactType)await iprot.ReadI32Async(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 12:
            if (field.Type == TType.String)
            {
              ContactKey = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("ContactRegistration");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (Contact != null && __isset.contact)
      {
        field.Name = "contact";
        field.Type = TType.Struct;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Contact.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Luid != null && __isset.luid)
      {
        field.Name = "luid";
        field.Type = TType.String;
        field.ID = 10;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Luid, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (__isset.contactType)
      {
        field.Name = "contactType";
        field.Type = TType.I32;
        field.ID = 11;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteI32Async((int)ContactType, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (ContactKey != null && __isset.contactKey)
      {
        field.Name = "contactKey";
        field.Type = TType.String;
        field.ID = 12;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(ContactKey, cancellationToken);
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
    var sb = new StringBuilder("ContactRegistration(");
    bool __first = true;
    if (Contact != null && __isset.contact)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Contact: ");
      sb.Append(Contact== null ? "<null>" : Contact.ToString());
    }
    if (Luid != null && __isset.luid)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Luid: ");
      sb.Append(Luid);
    }
    if (__isset.contactType)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ContactType: ");
      sb.Append(ContactType);
    }
    if (ContactKey != null && __isset.contactKey)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("ContactKey: ");
      sb.Append(ContactKey);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

