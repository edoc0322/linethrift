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
public partial class SquareEventNotifiedUpdateSquareChatProfileName : TBase
{
  private string _squareChatMid;
  private SquareMember _editor;
  private string _updatedChatName;

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

  public SquareMember Editor
  {
    get
    {
      return _editor;
    }
    set
    {
      __isset.editor = true;
      this._editor = value;
    }
  }

  public string UpdatedChatName
  {
    get
    {
      return _updatedChatName;
    }
    set
    {
      __isset.updatedChatName = true;
      this._updatedChatName = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareChatMid;
    public bool editor;
    public bool updatedChatName;
  }

  public SquareEventNotifiedUpdateSquareChatProfileName() {
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
              SquareChatMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              Editor = new SquareMember();
              Editor.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              UpdatedChatName = iprot.ReadString();
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
      TStruct struc = new TStruct("SquareEventNotifiedUpdateSquareChatProfileName");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SquareChatMid != null && __isset.squareChatMid) {
        field.Name = "squareChatMid";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareChatMid);
        oprot.WriteFieldEnd();
      }
      if (Editor != null && __isset.editor) {
        field.Name = "editor";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        Editor.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (UpdatedChatName != null && __isset.updatedChatName) {
        field.Name = "updatedChatName";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(UpdatedChatName);
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
    StringBuilder __sb = new StringBuilder("SquareEventNotifiedUpdateSquareChatProfileName(");
    bool __first = true;
    if (SquareChatMid != null && __isset.squareChatMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareChatMid: ");
      __sb.Append(SquareChatMid);
    }
    if (Editor != null && __isset.editor) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Editor: ");
      __sb.Append(Editor== null ? "<null>" : Editor.ToString());
    }
    if (UpdatedChatName != null && __isset.updatedChatName) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("UpdatedChatName: ");
      __sb.Append(UpdatedChatName);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

