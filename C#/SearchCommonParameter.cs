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
public partial class SearchCommonParameter : TBase
{
  private double _latitude;
  private double _longitude;
  private string _source;
  private string _region;
  private string _sid;
  private int _queryType;

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

  public string Source
  {
    get
    {
      return _source;
    }
    set
    {
      __isset.source = true;
      this._source = value;
    }
  }

  public string Region
  {
    get
    {
      return _region;
    }
    set
    {
      __isset.region = true;
      this._region = value;
    }
  }

  public string Sid
  {
    get
    {
      return _sid;
    }
    set
    {
      __isset.sid = true;
      this._sid = value;
    }
  }

  public int QueryType
  {
    get
    {
      return _queryType;
    }
    set
    {
      __isset.queryType = true;
      this._queryType = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool latitude;
    public bool longitude;
    public bool source;
    public bool region;
    public bool sid;
    public bool queryType;
  }

  public SearchCommonParameter() {
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
            if (field.Type == TType.Double) {
              Latitude = iprot.ReadDouble();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Double) {
              Longitude = iprot.ReadDouble();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              Source = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              Region = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              Sid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.I32) {
              QueryType = iprot.ReadI32();
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
      TStruct struc = new TStruct("SearchCommonParameter");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.latitude) {
        field.Name = "latitude";
        field.Type = TType.Double;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Latitude);
        oprot.WriteFieldEnd();
      }
      if (__isset.longitude) {
        field.Name = "longitude";
        field.Type = TType.Double;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Longitude);
        oprot.WriteFieldEnd();
      }
      if (Source != null && __isset.source) {
        field.Name = "source";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Source);
        oprot.WriteFieldEnd();
      }
      if (Region != null && __isset.region) {
        field.Name = "region";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Region);
        oprot.WriteFieldEnd();
      }
      if (Sid != null && __isset.sid) {
        field.Name = "sid";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Sid);
        oprot.WriteFieldEnd();
      }
      if (__isset.queryType) {
        field.Name = "queryType";
        field.Type = TType.I32;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(QueryType);
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
    StringBuilder __sb = new StringBuilder("SearchCommonParameter(");
    bool __first = true;
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
    if (Source != null && __isset.source) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Source: ");
      __sb.Append(Source);
    }
    if (Region != null && __isset.region) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Region: ");
      __sb.Append(Region);
    }
    if (Sid != null && __isset.sid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Sid: ");
      __sb.Append(Sid);
    }
    if (__isset.queryType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("QueryType: ");
      __sb.Append(QueryType);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

