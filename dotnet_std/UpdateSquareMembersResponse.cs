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
using System.Threading;
using System.Threading.Tasks;
using Thrift;
using Thrift.Collections;

using Thrift.Protocol;
using Thrift.Protocol.Entities;
using Thrift.Protocol.Utilities;
using Thrift.Transport;
using Thrift.Transport.Client;
using Thrift.Transport.Server;
using Thrift.Processor;



public partial class UpdateSquareMembersResponse : TBase
{
  private THashSet<SquareMemberAttribute> _updatedAttrs;
  private SquareMember _editor;
  private Dictionary<string, SquareMember> _members;

  public THashSet<SquareMemberAttribute> UpdatedAttrs
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

  public Dictionary<string, SquareMember> Members
  {
    get
    {
      return _members;
    }
    set
    {
      __isset.members = true;
      this._members = value;
    }
  }


  public Isset __isset;
  public struct Isset
  {
    public bool updatedAttrs;
    public bool editor;
    public bool members;
  }

  public UpdateSquareMembersResponse()
  {
  }

  public async Task ReadAsync(TProtocol iprot, CancellationToken cancellationToken)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      await iprot.ReadStructBeginAsync(cancellationToken);
      while (true)
      {
        field = await iprot.ReadFieldBeginAsync(cancellationToken);
        if (field.Type == TType.Stop)
        {
          break;
        }

        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.Set)
            {
              {
                TSet _set441 = await iprot.ReadSetBeginAsync(cancellationToken);
                UpdatedAttrs = new THashSet<SquareMemberAttribute>(_set441.Count);
                for(int _i442 = 0; _i442 < _set441.Count; ++_i442)
                {
                  SquareMemberAttribute _elem443;
                  _elem443 = (SquareMemberAttribute)await iprot.ReadI32Async(cancellationToken);
                  UpdatedAttrs.Add(_elem443);
                }
                await iprot.ReadSetEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 2:
            if (field.Type == TType.Struct)
            {
              Editor = new SquareMember();
              await Editor.ReadAsync(iprot, cancellationToken);
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          case 3:
            if (field.Type == TType.Map)
            {
              {
                TMap _map444 = await iprot.ReadMapBeginAsync(cancellationToken);
                Members = new Dictionary<string, SquareMember>(_map444.Count);
                for(int _i445 = 0; _i445 < _map444.Count; ++_i445)
                {
                  string _key446;
                  SquareMember _val447;
                  _key446 = await iprot.ReadStringAsync(cancellationToken);
                  _val447 = new SquareMember();
                  await _val447.ReadAsync(iprot, cancellationToken);
                  Members[_key446] = _val447;
                }
                await iprot.ReadMapEndAsync(cancellationToken);
              }
            }
            else
            {
              await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            }
            break;
          default: 
            await TProtocolUtil.SkipAsync(iprot, field.Type, cancellationToken);
            break;
        }

        await iprot.ReadFieldEndAsync(cancellationToken);
      }

      await iprot.ReadStructEndAsync(cancellationToken);
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public async Task WriteAsync(TProtocol oprot, CancellationToken cancellationToken)
  {
    oprot.IncrementRecursionDepth();
    try
    {
      var struc = new TStruct("UpdateSquareMembersResponse");
      await oprot.WriteStructBeginAsync(struc, cancellationToken);
      var field = new TField();
      if (UpdatedAttrs != null && __isset.updatedAttrs)
      {
        field.Name = "updatedAttrs";
        field.Type = TType.Set;
        field.ID = 1;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteSetBeginAsync(new TSet(TType.I32, UpdatedAttrs.Count), cancellationToken);
          foreach (SquareMemberAttribute _iter448 in UpdatedAttrs)
          {
            await oprot.WriteI32Async((int)_iter448, cancellationToken);
          }
          await oprot.WriteSetEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Editor != null && __isset.editor)
      {
        field.Name = "editor";
        field.Type = TType.Struct;
        field.ID = 2;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        await Editor.WriteAsync(oprot, cancellationToken);
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      if (Members != null && __isset.members)
      {
        field.Name = "members";
        field.Type = TType.Map;
        field.ID = 3;
        await oprot.WriteFieldBeginAsync(field, cancellationToken);
        {
          await oprot.WriteMapBeginAsync(new TMap(TType.String, TType.Struct, Members.Count), cancellationToken);
          foreach (string _iter449 in Members.Keys)
          {
            await oprot.WriteStringAsync(_iter449, cancellationToken);
            await Members[_iter449].WriteAsync(oprot, cancellationToken);
          }
          await oprot.WriteMapEndAsync(cancellationToken);
        }
        await oprot.WriteFieldEndAsync(cancellationToken);
      }
      await oprot.WriteFieldStopAsync(cancellationToken);
      await oprot.WriteStructEndAsync(cancellationToken);
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override bool Equals(object that)
  {
    var other = that as UpdateSquareMembersResponse;
    if (other == null) return false;
    if (ReferenceEquals(this, other)) return true;
    return ((__isset.updatedAttrs == other.__isset.updatedAttrs) && ((!__isset.updatedAttrs) || (TCollections.Equals(UpdatedAttrs, other.UpdatedAttrs))))
      && ((__isset.editor == other.__isset.editor) && ((!__isset.editor) || (System.Object.Equals(Editor, other.Editor))))
      && ((__isset.members == other.__isset.members) && ((!__isset.members) || (TCollections.Equals(Members, other.Members))));
  }

  public override int GetHashCode() {
    int hashcode = 157;
    unchecked {
      if(__isset.updatedAttrs)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(UpdatedAttrs);
      if(__isset.editor)
        hashcode = (hashcode * 397) + Editor.GetHashCode();
      if(__isset.members)
        hashcode = (hashcode * 397) + TCollections.GetHashCode(Members);
    }
    return hashcode;
  }

  public override string ToString()
  {
    var sb = new StringBuilder("UpdateSquareMembersResponse(");
    bool __first = true;
    if (UpdatedAttrs != null && __isset.updatedAttrs)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("UpdatedAttrs: ");
      sb.Append(UpdatedAttrs);
    }
    if (Editor != null && __isset.editor)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Editor: ");
      sb.Append(Editor== null ? "<null>" : Editor.ToString());
    }
    if (Members != null && __isset.members)
    {
      if(!__first) { sb.Append(", "); }
      __first = false;
      sb.Append("Members: ");
      sb.Append(Members);
    }
    sb.Append(")");
    return sb.ToString();
  }
}

