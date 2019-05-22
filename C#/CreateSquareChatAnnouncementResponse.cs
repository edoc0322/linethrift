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
public partial class CreateSquareChatAnnouncementResponse : TBase
{
  private SquareChatAnnouncement _announcement;

  public SquareChatAnnouncement Announcement
  {
    get
    {
      return _announcement;
    }
    set
    {
      __isset.announcement = true;
      this._announcement = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool announcement;
  }

  public CreateSquareChatAnnouncementResponse() {
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
            if (field.Type == TType.Struct) {
              Announcement = new SquareChatAnnouncement();
              Announcement.Read(iprot);
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
      TStruct struc = new TStruct("CreateSquareChatAnnouncementResponse");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Announcement != null && __isset.announcement) {
        field.Name = "announcement";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        Announcement.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("CreateSquareChatAnnouncementResponse(");
    bool __first = true;
    if (Announcement != null && __isset.announcement) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Announcement: ");
      __sb.Append(Announcement== null ? "<null>" : Announcement.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
