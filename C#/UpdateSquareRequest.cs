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
public partial class UpdateSquareRequest : TBase
{
  private THashSet<SquareAttribute> _updatedAttrs;
  private Square _square;

  public THashSet<SquareAttribute> UpdatedAttrs
  {
    get
    {
      return _updatedAttrs;
    }
    set
    {
      __isset.updatedAttrs = true;
      this._updatedAttrs = value;
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


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool updatedAttrs;
    public bool square;
  }

  public UpdateSquareRequest() {
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
          case 2:
            if (field.Type == TType.Set) {
              {
                UpdatedAttrs = new THashSet<SquareAttribute>();
                TSet _set382 = iprot.ReadSetBegin();
                for( int _i383 = 0; _i383 < _set382.Count; ++_i383)
                {
                  SquareAttribute _elem384;
                  _elem384 = (SquareAttribute)iprot.ReadI32();
                  UpdatedAttrs.Add(_elem384);
                }
                iprot.ReadSetEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              Square = new Square();
              Square.Read(iprot);
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
      TStruct struc = new TStruct("UpdateSquareRequest");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (UpdatedAttrs != null && __isset.updatedAttrs) {
        field.Name = "updatedAttrs";
        field.Type = TType.Set;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteSetBegin(new TSet(TType.I32, UpdatedAttrs.Count));
          foreach (SquareAttribute _iter385 in UpdatedAttrs)
          {
            oprot.WriteI32((int)_iter385);
          }
          oprot.WriteSetEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (Square != null && __isset.square) {
        field.Name = "square";
        field.Type = TType.Struct;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        Square.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("UpdateSquareRequest(");
    bool __first = true;
    if (UpdatedAttrs != null && __isset.updatedAttrs) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("UpdatedAttrs: ");
      __sb.Append(UpdatedAttrs);
    }
    if (Square != null && __isset.square) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Square: ");
      __sb.Append(Square== null ? "<null>" : Square.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

