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
public partial class PlaceSearchInfo : TBase
{
  private string _name;
  private string _address;
  private double _latitude;
  private double _longitude;

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

  public string Address
  {
    get
    {
      return _address;
    }
    set
    {
      __isset.address = true;
      this._address = value;
    }
  }

  public double Latitude
  {
    get
    {
      return _latitude;
    }
    set
    {
      __isset.latitude = true;
      this._latitude = value;
    }
  }

  public double Longitude
  {
    get
    {
      return _longitude;
    }
    set
    {
      __isset.longitude = true;
      this._longitude = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool name;
    public bool address;
    public bool latitude;
    public bool longitude;
  }

  public PlaceSearchInfo() {
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
              Name = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Address = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Double) {
              Latitude = iprot.ReadDouble();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Double) {
              Longitude = iprot.ReadDouble();
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
      TStruct struc = new TStruct("PlaceSearchInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Name != null && __isset.name) {
        field.Name = "name";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Name);
        oprot.WriteFieldEnd();
      }
      if (Address != null && __isset.address) {
        field.Name = "address";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Address);
        oprot.WriteFieldEnd();
      }
      if (__isset.latitude) {
        field.Name = "latitude";
        field.Type = TType.Double;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Latitude);
        oprot.WriteFieldEnd();
      }
      if (__isset.longitude) {
        field.Name = "longitude";
        field.Type = TType.Double;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Longitude);
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
    StringBuilder __sb = new StringBuilder("PlaceSearchInfo(");
    bool __first = true;
    if (Name != null && __isset.name) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Name: ");
      __sb.Append(Name);
    }
    if (Address != null && __isset.address) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Address: ");
      __sb.Append(Address);
    }
    if (__isset.latitude) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Latitude: ");
      __sb.Append(Latitude);
    }
    if (__isset.longitude) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Longitude: ");
      __sb.Append(Longitude);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

