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
public partial class UpdateSquareFeatureSetRequest : TBase
{
  private THashSet<SquareFeatureSetAttribute> _updateAttributes;
  private SquareFeatureSet _squareFeatureSet;

  public THashSet<SquareFeatureSetAttribute> UpdateAttributes
  {
    get
    {
      return _updateAttributes;
    }
    set
    {
      __isset.updateAttributes = true;
      this._updateAttributes = value;
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


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool updateAttributes;
    public bool squareFeatureSet;
  }

  public UpdateSquareFeatureSetRequest() {
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
                UpdateAttributes = new THashSet<SquareFeatureSetAttribute>();
                TSet _set409 = iprot.ReadSetBegin();
                for( int _i410 = 0; _i410 < _set409.Count; ++_i410)
                {
                  SquareFeatureSetAttribute _elem411;
                  _elem411 = (SquareFeatureSetAttribute)iprot.ReadI32();
                  UpdateAttributes.Add(_elem411);
                }
                iprot.ReadSetEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
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
      TStruct struc = new TStruct("UpdateSquareFeatureSetRequest");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (UpdateAttributes != null && __isset.updateAttributes) {
        field.Name = "updateAttributes";
        field.Type = TType.Set;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteSetBegin(new TSet(TType.I32, UpdateAttributes.Count));
          foreach (SquareFeatureSetAttribute _iter412 in UpdateAttributes)
          {
            oprot.WriteI32((int)_iter412);
          }
          oprot.WriteSetEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (SquareFeatureSet != null && __isset.squareFeatureSet) {
        field.Name = "squareFeatureSet";
        field.Type = TType.Struct;
        field.ID = 3;
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
    StringBuilder __sb = new StringBuilder("UpdateSquareFeatureSetRequest(");
    bool __first = true;
    if (UpdateAttributes != null && __isset.updateAttributes) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("UpdateAttributes: ");
      __sb.Append(UpdateAttributes);
    }
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

