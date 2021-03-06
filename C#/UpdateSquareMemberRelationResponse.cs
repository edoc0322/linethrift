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
public partial class UpdateSquareMemberRelationResponse : TBase
{
  private string _squareMid;
  private string _targetSquareMemberMid;
  private THashSet<SquareMemberRelationAttribute> _updatedAttrs;
  private SquareMemberRelation _relation;

  public string SquareMid
  {
    get
    {
      return _squareMid;
    }
    set
    {
      __isset.squareMid = true;
      this._squareMid = value;
    }
  }

  public string TargetSquareMemberMid
  {
    get
    {
      return _targetSquareMemberMid;
    }
    set
    {
      __isset.targetSquareMemberMid = true;
      this._targetSquareMemberMid = value;
    }
  }

  public THashSet<SquareMemberRelationAttribute> UpdatedAttrs
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

  public SquareMemberRelation Relation
  {
    get
    {
      return _relation;
    }
    set
    {
      __isset.relation = true;
      this._relation = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareMid;
    public bool targetSquareMemberMid;
    public bool updatedAttrs;
    public bool relation;
  }

  public UpdateSquareMemberRelationResponse() {
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
              SquareMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              TargetSquareMemberMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Set) {
              {
                UpdatedAttrs = new THashSet<SquareMemberRelationAttribute>();
                TSet _set495 = iprot.ReadSetBegin();
                for( int _i496 = 0; _i496 < _set495.Count; ++_i496)
                {
                  SquareMemberRelationAttribute _elem497;
                  _elem497 = (SquareMemberRelationAttribute)iprot.ReadI32();
                  UpdatedAttrs.Add(_elem497);
                }
                iprot.ReadSetEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Struct) {
              Relation = new SquareMemberRelation();
              Relation.Read(iprot);
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
      TStruct struc = new TStruct("UpdateSquareMemberRelationResponse");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SquareMid != null && __isset.squareMid) {
        field.Name = "squareMid";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareMid);
        oprot.WriteFieldEnd();
      }
      if (TargetSquareMemberMid != null && __isset.targetSquareMemberMid) {
        field.Name = "targetSquareMemberMid";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(TargetSquareMemberMid);
        oprot.WriteFieldEnd();
      }
      if (UpdatedAttrs != null && __isset.updatedAttrs) {
        field.Name = "updatedAttrs";
        field.Type = TType.Set;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteSetBegin(new TSet(TType.I32, UpdatedAttrs.Count));
          foreach (SquareMemberRelationAttribute _iter498 in UpdatedAttrs)
          {
            oprot.WriteI32((int)_iter498);
          }
          oprot.WriteSetEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (Relation != null && __isset.relation) {
        field.Name = "relation";
        field.Type = TType.Struct;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        Relation.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("UpdateSquareMemberRelationResponse(");
    bool __first = true;
    if (SquareMid != null && __isset.squareMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareMid: ");
      __sb.Append(SquareMid);
    }
    if (TargetSquareMemberMid != null && __isset.targetSquareMemberMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("TargetSquareMemberMid: ");
      __sb.Append(TargetSquareMemberMid);
    }
    if (UpdatedAttrs != null && __isset.updatedAttrs) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("UpdatedAttrs: ");
      __sb.Append(UpdatedAttrs);
    }
    if (Relation != null && __isset.relation) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Relation: ");
      __sb.Append(Relation== null ? "<null>" : Relation.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

