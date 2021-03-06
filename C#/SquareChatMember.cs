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
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class SquareChatMember : TBase
{
  private string _squareMemberMid;
  private string _squareChatMid;
  private long _revision;
  private SquareChatMembershipState _membershipState;
  private bool _notificationForMessage;

  public string SquareMemberMid
  {
    get
    {
      return _squareMemberMid;
    }
    set
    {
      __isset.squareMemberMid = true;
      this._squareMemberMid = value;
    }
  }

  public string SquareChatMid
  {
    get
    {
      return _squareChatMid;
    }
    set
    {
      __isset.squareChatMid = true;
      this._squareChatMid = value;
    }
  }

  public long Revision
  {
    get
    {
      return _revision;
    }
    set
    {
      __isset.revision = true;
      this._revision = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareChatMembershipState"/>
  /// </summary>
  public SquareChatMembershipState MembershipState
  {
    get
    {
      return _membershipState;
    }
    set
    {
      __isset.membershipState = true;
      this._membershipState = value;
    }
  }

  public bool NotificationForMessage
  {
    get
    {
      return _notificationForMessage;
    }
    set
    {
      __isset.notificationForMessage = true;
      this._notificationForMessage = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareMemberMid;
    public bool squareChatMid;
    public bool revision;
    public bool membershipState;
    public bool notificationForMessage;
  }

  public SquareChatMember() {
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
              SquareMemberMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              SquareChatMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I64) {
              Revision = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              MembershipState = (SquareChatMembershipState)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Bool) {
              NotificationForMessage = iprot.ReadBool();
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
      TStruct struc = new TStruct("SquareChatMember");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SquareMemberMid != null && __isset.squareMemberMid) {
        field.Name = "squareMemberMid";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareMemberMid);
        oprot.WriteFieldEnd();
      }
      if (SquareChatMid != null && __isset.squareChatMid) {
        field.Name = "squareChatMid";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareChatMid);
        oprot.WriteFieldEnd();
      }
      if (__isset.revision) {
        field.Name = "revision";
        field.Type = TType.I64;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Revision);
        oprot.WriteFieldEnd();
      }
      if (__isset.membershipState) {
        field.Name = "membershipState";
        field.Type = TType.I32;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)MembershipState);
        oprot.WriteFieldEnd();
      }
      if (__isset.notificationForMessage) {
        field.Name = "notificationForMessage";
        field.Type = TType.Bool;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(NotificationForMessage);
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
    StringBuilder __sb = new StringBuilder("SquareChatMember(");
    bool __first = true;
    if (SquareMemberMid != null && __isset.squareMemberMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareMemberMid: ");
      __sb.Append(SquareMemberMid);
    }
    if (SquareChatMid != null && __isset.squareChatMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareChatMid: ");
      __sb.Append(SquareChatMid);
    }
    if (__isset.revision) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Revision: ");
      __sb.Append(Revision);
    }
    if (__isset.membershipState) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("MembershipState: ");
      __sb.Append(MembershipState);
    }
    if (__isset.notificationForMessage) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("NotificationForMessage: ");
      __sb.Append(NotificationForMessage);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

