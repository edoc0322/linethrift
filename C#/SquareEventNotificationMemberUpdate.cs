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
public partial class SquareEventNotificationMemberUpdate : TBase
{
  private string _squareMid;
  private string _squareName;
  private string _profileImageObsHash;

  public string SquareMid
  {
    get
    {
      return _squareMid;
    }
    set
    {
      __isset.squareMid = true;
      this._squareMid = value;
    }
  }

  public string SquareName
  {
    get
    {
      return _squareName;
    }
    set
    {
      __isset.squareName = true;
      this._squareName = value;
    }
  }

  public string ProfileImageObsHash
  {
    get
    {
      return _profileImageObsHash;
    }
    set
    {
      __isset.profileImageObsHash = true;
      this._profileImageObsHash = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareMid;
    public bool squareName;
    public bool profileImageObsHash;
  }

  public SquareEventNotificationMemberUpdate() {
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
              SquareMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              SquareName = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              ProfileImageObsHash = iprot.ReadString();
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
      TStruct struc = new TStruct("SquareEventNotificationMemberUpdate");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SquareMid != null && __isset.squareMid) {
        field.Name = "squareMid";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareMid);
        oprot.WriteFieldEnd();
      }
      if (SquareName != null && __isset.squareName) {
        field.Name = "squareName";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareName);
        oprot.WriteFieldEnd();
      }
      if (ProfileImageObsHash != null && __isset.profileImageObsHash) {
        field.Name = "profileImageObsHash";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ProfileImageObsHash);
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
    StringBuilder __sb = new StringBuilder("SquareEventNotificationMemberUpdate(");
    bool __first = true;
    if (SquareMid != null && __isset.squareMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareMid: ");
      __sb.Append(SquareMid);
    }
    if (SquareName != null && __isset.squareName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareName: ");
      __sb.Append(SquareName);
    }
    if (ProfileImageObsHash != null && __isset.profileImageObsHash) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ProfileImageObsHash: ");
      __sb.Append(ProfileImageObsHash);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

