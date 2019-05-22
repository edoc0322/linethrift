/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class AdditionalInfoItem : TBase
{
  private string _id;
  private int _g;
  private string _title;
  private string _descr;
  private string _iconUrl;
  private string _link;

  public string Id
  {
    get
    {
      return _id;
    }
    set
    {
      __isset.id = true;
      this._id = value;
    }
  }

  public int G
  {
    get
    {
      return _g;
    }
    set
    {
      __isset.g = true;
      this._g = value;
    }
  }

  public string Title
  {
    get
    {
      return _title;
    }
    set
    {
      __isset.title = true;
      this._title = value;
    }
  }

  public string Descr
  {
    get
    {
      return _descr;
    }
    set
    {
      __isset.descr = true;
      this._descr = value;
    }
  }

  public string IconUrl
  {
    get
    {
      return _iconUrl;
    }
    set
    {
      __isset.iconUrl = true;
      this._iconUrl = value;
    }
  }

  public string Link
  {
    get
    {
      return _link;
    }
    set
    {
      __isset.link = true;
      this._link = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool id;
    public bool g;
    public bool title;
    public bool descr;
    public bool iconUrl;
    public bool link;
  }

  public AdditionalInfoItem() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.String) {
              Id = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              G = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Title = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              Descr = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              IconUrl = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              Link = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("AdditionalInfoItem");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Id != null && __isset.id) {
        field.Name = "id";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Id);
        oprot.WriteFieldEnd();
      }
      if (__isset.g) {
        field.Name = "g";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(G);
        oprot.WriteFieldEnd();
      }
      if (Title != null && __isset.title) {
        field.Name = "title";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Title);
        oprot.WriteFieldEnd();
      }
      if (Descr != null && __isset.descr) {
        field.Name = "descr";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Descr);
        oprot.WriteFieldEnd();
      }
      if (IconUrl != null && __isset.iconUrl) {
        field.Name = "iconUrl";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(IconUrl);
        oprot.WriteFieldEnd();
      }
      if (Link != null && __isset.link) {
        field.Name = "link";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Link);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("AdditionalInfoItem(");
    bool __first = true;
    if (Id != null && __isset.id) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Id: ");
      __sb.Append(Id);
    }
    if (__isset.g) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("G: ");
      __sb.Append(G);
    }
    if (Title != null && __isset.title) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Title: ");
      __sb.Append(Title);
    }
    if (Descr != null && __isset.descr) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Descr: ");
      __sb.Append(Descr);
    }
    if (IconUrl != null && __isset.iconUrl) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("IconUrl: ");
      __sb.Append(IconUrl);
    }
    if (Link != null && __isset.link) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Link: ");
      __sb.Append(Link);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

