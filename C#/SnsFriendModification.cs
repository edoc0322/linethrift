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
public partial class SnsFriendModification : TBase
{
  private ModificationType _type;
  private SnsFriend _snsFriend;

  /// <summary>
  /// 
  /// <seealso cref="ModificationType"/>
  /// </summary>
  public ModificationType Type
  {
    get
    {
      return _type;
    }
    set
    {
      __isset.type = true;
      this._type = value;
    }
  }

  public SnsFriend SnsFriend
  {
    get
    {
      return _snsFriend;
    }
    set
    {
      __isset.snsFriend = true;
      this._snsFriend = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool type;
    public bool snsFriend;
  }

  public SnsFriendModification() {
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
              Type = (ModificationType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              SnsFriend = new SnsFriend();
              SnsFriend.Read(iprot);
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
      TStruct struc = new TStruct("SnsFriendModification");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.type) {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Type);
        oprot.WriteFieldEnd();
      }
      if (SnsFriend != null && __isset.snsFriend) {
        field.Name = "snsFriend";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        SnsFriend.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("SnsFriendModification(");
    bool __first = true;
    if (__isset.type) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Type: ");
      __sb.Append(Type);
    }
    if (SnsFriend != null && __isset.snsFriend) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SnsFriend: ");
      __sb.Append(SnsFriend== null ? "<null>" : SnsFriend.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

