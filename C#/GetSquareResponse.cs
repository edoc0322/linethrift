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
public partial class GetSquareResponse : TBase
{
  private Square _square;
  private SquareMember _myMembership;
  private SquareAuthority _squareAuthority;
  private SquareStatus _squareStatus;
  private SquareFeatureSet _squareFeatureSet;
  private NoteStatus _noteStatus;

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

  public SquareMember MyMembership
  {
    get
    {
      return _myMembership;
    }
    set
    {
      __isset.myMembership = true;
      this._myMembership = value;
    }
  }

  public SquareAuthority SquareAuthority
  {
    get
    {
      return _squareAuthority;
    }
    set
    {
      __isset.squareAuthority = true;
      this._squareAuthority = value;
    }
  }

  public SquareStatus SquareStatus
  {
    get
    {
      return _squareStatus;
    }
    set
    {
      __isset.squareStatus = true;
      this._squareStatus = value;
    }
  }

  public SquareFeatureSet SquareFeatureSet
  {
    get
    {
      return _squareFeatureSet;
    }
    set
    {
      __isset.squareFeatureSet = true;
      this._squareFeatureSet = value;
    }
  }

  public NoteStatus NoteStatus
  {
    get
    {
      return _noteStatus;
    }
    set
    {
      __isset.noteStatus = true;
      this._noteStatus = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool square;
    public bool myMembership;
    public bool squareAuthority;
    public bool squareStatus;
    public bool squareFeatureSet;
    public bool noteStatus;
  }

  public GetSquareResponse() {
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
              Square = new Square();
              Square.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              MyMembership = new SquareMember();
              MyMembership.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              SquareAuthority = new SquareAuthority();
              SquareAuthority.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Struct) {
              SquareStatus = new SquareStatus();
              SquareStatus.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Struct) {
              SquareFeatureSet = new SquareFeatureSet();
              SquareFeatureSet.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Struct) {
              NoteStatus = new NoteStatus();
              NoteStatus.Read(iprot);
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
      TStruct struc = new TStruct("GetSquareResponse");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Square != null && __isset.square) {
        field.Name = "square";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        Square.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (MyMembership != null && __isset.myMembership) {
        field.Name = "myMembership";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        MyMembership.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (SquareAuthority != null && __isset.squareAuthority) {
        field.Name = "squareAuthority";
        field.Type = TType.Struct;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        SquareAuthority.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (SquareStatus != null && __isset.squareStatus) {
        field.Name = "squareStatus";
        field.Type = TType.Struct;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        SquareStatus.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (SquareFeatureSet != null && __isset.squareFeatureSet) {
        field.Name = "squareFeatureSet";
        field.Type = TType.Struct;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        SquareFeatureSet.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (NoteStatus != null && __isset.noteStatus) {
        field.Name = "noteStatus";
        field.Type = TType.Struct;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        NoteStatus.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("GetSquareResponse(");
    bool __first = true;
    if (Square != null && __isset.square) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Square: ");
      __sb.Append(Square== null ? "<null>" : Square.ToString());
    }
    if (MyMembership != null && __isset.myMembership) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("MyMembership: ");
      __sb.Append(MyMembership== null ? "<null>" : MyMembership.ToString());
    }
    if (SquareAuthority != null && __isset.squareAuthority) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareAuthority: ");
      __sb.Append(SquareAuthority== null ? "<null>" : SquareAuthority.ToString());
    }
    if (SquareStatus != null && __isset.squareStatus) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareStatus: ");
      __sb.Append(SquareStatus== null ? "<null>" : SquareStatus.ToString());
    }
    if (SquareFeatureSet != null && __isset.squareFeatureSet) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareFeatureSet: ");
      __sb.Append(SquareFeatureSet== null ? "<null>" : SquareFeatureSet.ToString());
    }
    if (NoteStatus != null && __isset.noteStatus) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("NoteStatus: ");
      __sb.Append(NoteStatus== null ? "<null>" : NoteStatus.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

