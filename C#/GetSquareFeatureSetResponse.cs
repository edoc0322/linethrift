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
public partial class GetSquareFeatureSetResponse : TBase
{
  private SquareFeatureSet _squareFeatureSet;

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


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareFeatureSet;
  }

  public GetSquareFeatureSetResponse() {
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
              SquareFeatureSet = new SquareFeatureSet();
              SquareFeatureSet.Read(iprot);
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
      TStruct struc = new TStruct("GetSquareFeatureSetResponse");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SquareFeatureSet != null && __isset.squareFeatureSet) {
        field.Name = "squareFeatureSet";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        SquareFeatureSet.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("GetSquareFeatureSetResponse(");
    bool __first = true;
    if (SquareFeatureSet != null && __isset.squareFeatureSet) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareFeatureSet: ");
      __sb.Append(SquareFeatureSet== null ? "<null>" : SquareFeatureSet.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

