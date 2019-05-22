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
public partial class SuggestDictionaryRevisions : TBase
{
  private SuggestItemDictionaryRevision _itemRevision;
  private List<SuggestTagDictionaryRevision> _tagRevisions;

  public SuggestItemDictionaryRevision ItemRevision
  {
    get
    {
      return _itemRevision;
    }
    set
    {
      __isset.itemRevision = true;
      this._itemRevision = value;
    }
  }

  public List<SuggestTagDictionaryRevision> TagRevisions
  {
    get
    {
      return _tagRevisions;
    }
    set
    {
      __isset.tagRevisions = true;
      this._tagRevisions = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool itemRevision;
    public bool tagRevisions;
  }

  public SuggestDictionaryRevisions() {
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
              ItemRevision = new SuggestItemDictionaryRevision();
              ItemRevision.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                TagRevisions = new List<SuggestTagDictionaryRevision>();
                TList _list317 = iprot.ReadListBegin();
                for( int _i318 = 0; _i318 < _list317.Count; ++_i318)
                {
                  SuggestTagDictionaryRevision _elem319;
                  _elem319 = new SuggestTagDictionaryRevision();
                  _elem319.Read(iprot);
                  TagRevisions.Add(_elem319);
                }
                iprot.ReadListEnd();
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
      TStruct struc = new TStruct("SuggestDictionaryRevisions");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (ItemRevision != null && __isset.itemRevision) {
        field.Name = "itemRevision";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        ItemRevision.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (TagRevisions != null && __isset.tagRevisions) {
        field.Name = "tagRevisions";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, TagRevisions.Count));
          foreach (SuggestTagDictionaryRevision _iter320 in TagRevisions)
          {
            _iter320.Write(oprot);
          }
          oprot.WriteListEnd();
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
    StringBuilder __sb = new StringBuilder("SuggestDictionaryRevisions(");
    bool __first = true;
    if (ItemRevision != null && __isset.itemRevision) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ItemRevision: ");
      __sb.Append(ItemRevision== null ? "<null>" : ItemRevision.ToString());
    }
    if (TagRevisions != null && __isset.tagRevisions) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("TagRevisions: ");
      __sb.Append(TagRevisions);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

