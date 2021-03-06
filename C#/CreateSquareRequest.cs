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
public partial class CreateSquareRequest : TBase
{
  private int _reqSeq;
  private Square _square;
  private SquareMember _creator;

  public int ReqSeq
  {
    get
    {
      return _reqSeq;
    }
    set
    {
      __isset.reqSeq = true;
      this._reqSeq = value;
    }
  }

  public Square Square
  {
    get
    {
      return _square;
    }
    set
    {
      __isset.square = true;
      this._square = value;
    }
  }

  public SquareMember Creator
  {
    get
    {
      return _creator;
    }
    set
    {
      __isset.creator = true;
      this._creator = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool reqSeq;
    public bool square;
    public bool creator;
  }

  public CreateSquareRequest() {
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
              ReqSeq = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              Square = new Square();
              Square.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              Creator = new SquareMember();
              Creator.Read(iprot);
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
      TStruct struc = new TStruct("CreateSquareRequest");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.reqSeq) {
        field.Name = "reqSeq";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(ReqSeq);
        oprot.WriteFieldEnd();
      }
      if (Square != null && __isset.square) {
        field.Name = "square";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        Square.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Creator != null && __isset.creator) {
        field.Name = "creator";
        field.Type = TType.Struct;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        Creator.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("CreateSquareRequest(");
    bool __first = true;
    if (__isset.reqSeq) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ReqSeq: ");
      __sb.Append(ReqSeq);
    }
    if (Square != null && __isset.square) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Square: ");
      __sb.Append(Square== null ? "<null>" : Square.ToString());
    }
    if (Creator != null && __isset.creator) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Creator: ");
      __sb.Append(Creator== null ? "<null>" : Creator.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

