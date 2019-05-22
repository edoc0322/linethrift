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
public partial class SticonProperty : TBase
{
  private THashSet<string> _sticonIds;

  public THashSet<string> SticonIds
  {
    get
    {
      return _sticonIds;
    }
    set
    {
      __isset.sticonIds = true;
      this._sticonIds = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool sticonIds;
  }

  public SticonProperty() {
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
            if (field.Type == TType.Set) {
              {
                SticonIds = new THashSet<string>();
                TSet _set42 = iprot.ReadSetBegin();
                for( int _i43 = 0; _i43 < _set42.Count; ++_i43)
                {
                  string _elem44;
                  _elem44 = iprot.ReadString();
                  SticonIds.Add(_elem44);
                }
                iprot.ReadSetEnd();
              }
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
      TStruct struc = new TStruct("SticonProperty");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SticonIds != null && __isset.sticonIds) {
        field.Name = "sticonIds";
        field.Type = TType.Set;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteSetBegin(new TSet(TType.String, SticonIds.Count));
          foreach (string _iter45 in SticonIds)
          {
            oprot.WriteString(_iter45);
          }
          oprot.WriteSetEnd();
        }
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
    StringBuilder __sb = new StringBuilder("SticonProperty(");
    bool __first = true;
    if (SticonIds != null && __isset.sticonIds) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SticonIds: ");
      __sb.Append(SticonIds);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

