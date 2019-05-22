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
public partial class SpotItem : TBase
{
  private string _name;
  private string _phone;
  private SpotCategory _category;
  private string _mid;
  private string _countryAreaCode;
  private bool _freePhoneCallable;

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

  public string Phone
  {
    get
    {
      return _phone;
    }
    set
    {
      __isset.phone = true;
      this._phone = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SpotCategory"/>
  /// </summary>
  public SpotCategory Category
  {
    get
    {
      return _category;
    }
    set
    {
      __isset.category = true;
      this._category = value;
    }
  }

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

  public string CountryAreaCode
  {
    get
    {
      return _countryAreaCode;
    }
    set
    {
      __isset.countryAreaCode = true;
      this._countryAreaCode = value;
    }
  }

  public bool FreePhoneCallable
  {
    get
    {
      return _freePhoneCallable;
    }
    set
    {
      __isset.freePhoneCallable = true;
      this._freePhoneCallable = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool name;
    public bool phone;
    public bool category;
    public bool mid;
    public bool countryAreaCode;
    public bool freePhoneCallable;
  }

  public SpotItem() {
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
          case 2:
            if (field.Type == TType.String) {
              Name = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Phone = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              Category = (SpotCategory)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              Mid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              CountryAreaCode = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.Bool) {
              FreePhoneCallable = iprot.ReadBool();
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
      TStruct struc = new TStruct("SpotItem");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Name != null && __isset.name) {
        field.Name = "name";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Name);
        oprot.WriteFieldEnd();
      }
      if (Phone != null && __isset.phone) {
        field.Name = "phone";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Phone);
        oprot.WriteFieldEnd();
      }
      if (__isset.category) {
        field.Name = "category";
        field.Type = TType.I32;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Category);
        oprot.WriteFieldEnd();
      }
      if (Mid != null && __isset.mid) {
        field.Name = "mid";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Mid);
        oprot.WriteFieldEnd();
      }
      if (CountryAreaCode != null && __isset.countryAreaCode) {
        field.Name = "countryAreaCode";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CountryAreaCode);
        oprot.WriteFieldEnd();
      }
      if (__isset.freePhoneCallable) {
        field.Name = "freePhoneCallable";
        field.Type = TType.Bool;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(FreePhoneCallable);
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
    StringBuilder __sb = new StringBuilder("SpotItem(");
    bool __first = true;
    if (Name != null && __isset.name) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Name: ");
      __sb.Append(Name);
    }
    if (Phone != null && __isset.phone) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Phone: ");
      __sb.Append(Phone);
    }
    if (__isset.category) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Category: ");
      __sb.Append(Category);
    }
    if (Mid != null && __isset.mid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Mid: ");
      __sb.Append(Mid);
    }
    if (CountryAreaCode != null && __isset.countryAreaCode) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CountryAreaCode: ");
      __sb.Append(CountryAreaCode);
    }
    if (__isset.freePhoneCallable) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("FreePhoneCallable: ");
      __sb.Append(FreePhoneCallable);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

