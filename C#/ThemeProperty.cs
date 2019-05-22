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
public partial class ThemeProperty : TBase
{
  private string _thumbnailUrl;
  private TRType _themeResourceType;

  public string ThumbnailUrl
  {
    get
    {
      return _thumbnailUrl;
    }
    set
    {
      __isset.thumbnailUrl = true;
      this._thumbnailUrl = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="TRType"/>
  /// </summary>
  public TRType ThemeResourceType
  {
    get
    {
      return _themeResourceType;
    }
    set
    {
      __isset.themeResourceType = true;
      this._themeResourceType = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool thumbnailUrl;
    public bool themeResourceType;
  }

  public ThemeProperty() {
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
              ThumbnailUrl = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              ThemeResourceType = (TRType)iprot.ReadI32();
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
      TStruct struc = new TStruct("ThemeProperty");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ThumbnailUrl != null && __isset.thumbnailUrl) {
        field.Name = "thumbnailUrl";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ThumbnailUrl);
        oprot.WriteFieldEnd();
      }
      if (__isset.themeResourceType) {
        field.Name = "themeResourceType";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)ThemeResourceType);
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
    StringBuilder __sb = new StringBuilder("ThemeProperty(");
    bool __first = true;
    if (ThumbnailUrl != null && __isset.thumbnailUrl) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ThumbnailUrl: ");
      __sb.Append(ThumbnailUrl);
    }
    if (__isset.themeResourceType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ThemeResourceType: ");
      __sb.Append(ThemeResourceType);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

