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



public partial class TMessageBoxWrapUp : TBase
{
  private TMessageBox _messageBox;
  private string _name;
  private List<Contact> _contacts;
  private string _pictureRevision;

  public TMessageBox MessageBox
  {
    get
    {
      return _messageBox;
    }
    set
    {
      __isset.messageBox = true;
      this._messageBox = value;
    }
  }

  public string Name
  {
    get
    {
      return _name;
    }
    set
    {
      __isset.name = true;
      this._name = value;
    }
  }

  public List<Contact> Contacts
  {
    get
    {
      return _contacts;
    }
    set
    {
      __isset.contacts = true;
      this._contacts = value;
    }
  }

  public string PictureRevision
  {
    get
    {
      return _pictureRevision;
    }
    set
    {
      __isset.pictureRevision = true;
      this._pictureRevision = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool messageBox;
    public bool name;
    public bool contacts;
    public bool pictureRevision;
  }

  public TMessageBoxWrapUp()
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
              MessageBox = new TMessageBox();
              await MessageBox.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.String)
            {
              Name = await iprot.ReadStringAsync(cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.List)
            {
              {
                Contacts = new List<Contact>();
                TList _list259 = await iprot.ReadListBeginAsync(cancellationToken);
                for(int _i260 = 0; _i260 < _list259.Count; ++_i260)
                {
                  Contact _elem261;
                  _elem261 = new Contact();
                  await _elem261.ReadAsync(iprot, cancellationToken);
                  Contacts.Add(_elem261);
                }
                await iprot.ReadListEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 4:
            if (field.Type == TType.String)
            {
              PictureRevision = await iprot.ReadStringAsync(cancellationToken);
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
      var struc = new TStruct("TMessageBoxWrapUp");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (MessageBox != null && __isset.messageBox)
      {
        field.Name = "messageBox";
        field.Type = TType.Struct;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await MessageBox.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Name != null && __isset.name)
      {
        field.Name = "name";
        field.Type = TType.String;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(Name, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Contacts != null && __isset.contacts)
      {
        field.Name = "contacts";
        field.Type = TType.List;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteListBeginAsync(new TList(TType.Struct, Contacts.Count), cancellationToken);
          foreach (Contact _iter262 in Contacts)
          {
            await _iter262.WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteListEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (PictureRevision != null && __isset.pictureRevision)
      {
        field.Name = "pictureRevision";
        field.Type = TType.String;
        field.ID = 4;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await oprot.WriteStringAsync(PictureRevision, cancellationToken);
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
    var sb = new StringBuilder("TMessageBoxWrapUp(");
    bool __first = true;
    if (MessageBox != null && __isset.messageBox)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("MessageBox: ");
      sb.Append(MessageBox== null ? "<null>" : MessageBox.ToString());
    }
    if (Name != null && __isset.name)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Name: ");
      sb.Append(Name);
    }
    if (Contacts != null && __isset.contacts)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Contacts: ");
      sb.Append(Contacts);
    }
    if (PictureRevision != null && __isset.pictureRevision)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("PictureRevision: ");
      sb.Append(PictureRevision);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

