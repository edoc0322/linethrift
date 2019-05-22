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
public partial class SquareChatAnnouncementContents : TBase
{
  private TextMessageAnnouncementContents _textMessageAnnouncementContents;

  public TextMessageAnnouncementContents TextMessageAnnouncementContents
  {
    get
    {
      return _textMessageAnnouncementContents;
    }
    set
    {
      __isset.textMessageAnnouncementContents = true;
      this._textMessageAnnouncementContents = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool textMessageAnnouncementContents;
  }

  public SquareChatAnnouncementContents() {
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
              TextMessageAnnouncementContents = new TextMessageAnnouncementContents();
              TextMessageAnnouncementContents.Read(iprot);
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
      TStruct struc = new TStruct("SquareChatAnnouncementContents");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (TextMessageAnnouncementContents != null && __isset.textMessageAnnouncementContents) {
        field.Name = "textMessageAnnouncementContents";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        TextMessageAnnouncementContents.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("SquareChatAnnouncementContents(");
    bool __first = true;
    if (TextMessageAnnouncementContents != null && __isset.textMessageAnnouncementContents) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("TextMessageAnnouncementContents: ");
      __sb.Append(TextMessageAnnouncementContents== null ? "<null>" : TextMessageAnnouncementContents.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
