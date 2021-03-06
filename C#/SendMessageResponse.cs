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
public partial class SendMessageResponse : TBase
{
  private SquareMessage _createdSquareMessage;

  public SquareMessage CreatedSquareMessage
  {
    get
    {
      return _createdSquareMessage;
    }
    set
    {
      __isset.createdSquareMessage = true;
      this._createdSquareMessage = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool createdSquareMessage;
  }

  public SendMessageResponse() {
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
              CreatedSquareMessage = new SquareMessage();
              CreatedSquareMessage.Read(iprot);
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
      TStruct struc = new TStruct("SendMessageResponse");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (CreatedSquareMessage != null && __isset.createdSquareMessage) {
        field.Name = "createdSquareMessage";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        CreatedSquareMessage.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("SendMessageResponse(");
    bool __first = true;
    if (CreatedSquareMessage != null && __isset.createdSquareMessage) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CreatedSquareMessage: ");
      __sb.Append(CreatedSquareMessage== null ? "<null>" : CreatedSquareMessage.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

