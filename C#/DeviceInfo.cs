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
public partial class DeviceInfo : TBase
{
  private string _deviceName;
  private string _systemName;
  private string _systemVersion;
  private string _model;
  private CarrierCode _carrierCode;
  private string _carrierName;
  private ApplicationType _applicationType;

  public string DeviceName
  {
    get
    {
      return _deviceName;
    }
    set
    {
      __isset.deviceName = true;
      this._deviceName = value;
    }
  }

  public string SystemName
  {
    get
    {
      return _systemName;
    }
    set
    {
      __isset.systemName = true;
      this._systemName = value;
    }
  }

  public string SystemVersion
  {
    get
    {
      return _systemVersion;
    }
    set
    {
      __isset.systemVersion = true;
      this._systemVersion = value;
    }
  }

  public string Model
  {
    get
    {
      return _model;
    }
    set
    {
      __isset.model = true;
      this._model = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="CarrierCode"/>
  /// </summary>
  public CarrierCode CarrierCode
  {
    get
    {
      return _carrierCode;
    }
    set
    {
      __isset.carrierCode = true;
      this._carrierCode = value;
    }
  }

  public string CarrierName
  {
    get
    {
      return _carrierName;
    }
    set
    {
      __isset.carrierName = true;
      this._carrierName = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="ApplicationType"/>
  /// </summary>
  public ApplicationType ApplicationType
  {
    get
    {
      return _applicationType;
    }
    set
    {
      __isset.applicationType = true;
      this._applicationType = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool deviceName;
    public bool systemName;
    public bool systemVersion;
    public bool model;
    public bool carrierCode;
    public bool carrierName;
    public bool applicationType;
  }

  public DeviceInfo() {
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
              DeviceName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              SystemName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              SystemVersion = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              Model = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.I32) {
              CarrierCode = (CarrierCode)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.String) {
              CarrierName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 20:
            if (field.Type == TType.I32) {
              ApplicationType = (ApplicationType)iprot.ReadI32();
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
      TStruct struc = new TStruct("DeviceInfo");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (DeviceName != null && __isset.deviceName) {
        field.Name = "deviceName";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(DeviceName);
        oprot.WriteFieldEnd();
      }
      if (SystemName != null && __isset.systemName) {
        field.Name = "systemName";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SystemName);
        oprot.WriteFieldEnd();
      }
      if (SystemVersion != null && __isset.systemVersion) {
        field.Name = "systemVersion";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SystemVersion);
        oprot.WriteFieldEnd();
      }
      if (Model != null && __isset.model) {
        field.Name = "model";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Model);
        oprot.WriteFieldEnd();
      }
      if (__isset.carrierCode) {
        field.Name = "carrierCode";
        field.Type = TType.I32;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)CarrierCode);
        oprot.WriteFieldEnd();
      }
      if (CarrierName != null && __isset.carrierName) {
        field.Name = "carrierName";
        field.Type = TType.String;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(CarrierName);
        oprot.WriteFieldEnd();
      }
      if (__isset.applicationType) {
        field.Name = "applicationType";
        field.Type = TType.I32;
        field.ID = 20;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)ApplicationType);
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
    StringBuilder __sb = new StringBuilder("DeviceInfo(");
    bool __first = true;
    if (DeviceName != null && __isset.deviceName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("DeviceName: ");
      __sb.Append(DeviceName);
    }
    if (SystemName != null && __isset.systemName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SystemName: ");
      __sb.Append(SystemName);
    }
    if (SystemVersion != null && __isset.systemVersion) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SystemVersion: ");
      __sb.Append(SystemVersion);
    }
    if (Model != null && __isset.model) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Model: ");
      __sb.Append(Model);
    }
    if (__isset.carrierCode) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CarrierCode: ");
      __sb.Append(CarrierCode);
    }
    if (CarrierName != null && __isset.carrierName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CarrierName: ");
      __sb.Append(CarrierName);
    }
    if (__isset.applicationType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ApplicationType: ");
      __sb.Append(ApplicationType);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

