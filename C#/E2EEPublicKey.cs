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
public partial class E2EEPublicKey : TBase
{
  private int _version;
  private int _keyId;
  private byte[] _keyData;
  private long _createdTime;

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

  public int KeyId
  {
    get
    {
      return _keyId;
    }
    set
    {
      __isset.keyId = true;
      this._keyId = value;
    }
  }

  public byte[] KeyData
  {
    get
    {
      return _keyData;
    }
    set
    {
      __isset.keyData = true;
      this._keyData = value;
    }
  }

  public long CreatedTime
  {
    get
    {
      return _createdTime;
    }
    set
    {
      __isset.createdTime = true;
      this._createdTime = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool version;
    public bool keyId;
    public bool keyData;
    public bool createdTime;
  }

  public E2EEPublicKey() {
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
            if (field.Type == TType.I32) {
              Version = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I32) {
              KeyId = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              KeyData = iprot.ReadBinary();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I64) {
              CreatedTime = iprot.ReadI64();
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
      TStruct struc = new TStruct("E2EEPublicKey");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.version) {
        field.Name = "version";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Version);
        oprot.WriteFieldEnd();
      }
      if (__isset.keyId) {
        field.Name = "keyId";
        field.Type = TType.I32;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(KeyId);
        oprot.WriteFieldEnd();
      }
      if (KeyData != null && __isset.keyData) {
        field.Name = "keyData";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteBinary(KeyData);
        oprot.WriteFieldEnd();
      }
      if (__isset.createdTime) {
        field.Name = "createdTime";
        field.Type = TType.I64;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(CreatedTime);
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
    StringBuilder __sb = new StringBuilder("E2EEPublicKey(");
    bool __first = true;
    if (__isset.version) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Version: ");
      __sb.Append(Version);
    }
    if (__isset.keyId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("KeyId: ");
      __sb.Append(KeyId);
    }
    if (KeyData != null && __isset.keyData) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("KeyData: ");
      __sb.Append(KeyData);
    }
    if (__isset.createdTime) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CreatedTime: ");
      __sb.Append(CreatedTime);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

