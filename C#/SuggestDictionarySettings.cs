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
public partial class SuggestDictionarySettings : TBase
{
  private long _revision;
  private long _newRevision;
  private List<SuggestDictionary> _dictionaries;
  private List<string> _preloadedDictionaries;

  public long Revision
  {
    get
    {
      return _revision;
    }
    set
    {
      __isset.revision = true;
      this._revision = value;
    }
  }

  public long NewRevision
  {
    get
    {
      return _newRevision;
    }
    set
    {
      __isset.newRevision = true;
      this._newRevision = value;
    }
  }

  public List<SuggestDictionary> Dictionaries
  {
    get
    {
      return _dictionaries;
    }
    set
    {
      __isset.dictionaries = true;
      this._dictionaries = value;
    }
  }

  public List<string> PreloadedDictionaries
  {
    get
    {
      return _preloadedDictionaries;
    }
    set
    {
      __isset.preloadedDictionaries = true;
      this._preloadedDictionaries = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool revision;
    public bool newRevision;
    public bool dictionaries;
    public bool preloadedDictionaries;
  }

  public SuggestDictionarySettings() {
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
            if (field.Type == TType.I64) {
              Revision = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.I64) {
              NewRevision = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.List) {
              {
                Dictionaries = new List<SuggestDictionary>();
                TList _list233 = iprot.ReadListBegin();
                for( int _i234 = 0; _i234 < _list233.Count; ++_i234)
                {
                  SuggestDictionary _elem235;
                  _elem235 = new SuggestDictionary();
                  _elem235.Read(iprot);
                  Dictionaries.Add(_elem235);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.List) {
              {
                PreloadedDictionaries = new List<string>();
                TList _list236 = iprot.ReadListBegin();
                for( int _i237 = 0; _i237 < _list236.Count; ++_i237)
                {
                  string _elem238;
                  _elem238 = iprot.ReadString();
                  PreloadedDictionaries.Add(_elem238);
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
      TStruct struc = new TStruct("SuggestDictionarySettings");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.revision) {
        field.Name = "revision";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Revision);
        oprot.WriteFieldEnd();
      }
      if (__isset.newRevision) {
        field.Name = "newRevision";
        field.Type = TType.I64;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(NewRevision);
        oprot.WriteFieldEnd();
      }
      if (Dictionaries != null && __isset.dictionaries) {
        field.Name = "dictionaries";
        field.Type = TType.List;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Dictionaries.Count));
          foreach (SuggestDictionary _iter239 in Dictionaries)
          {
            _iter239.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (PreloadedDictionaries != null && __isset.preloadedDictionaries) {
        field.Name = "preloadedDictionaries";
        field.Type = TType.List;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.String, PreloadedDictionaries.Count));
          foreach (string _iter240 in PreloadedDictionaries)
          {
            oprot.WriteString(_iter240);
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
    StringBuilder __sb = new StringBuilder("SuggestDictionarySettings(");
    bool __first = true;
    if (__isset.revision) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Revision: ");
      __sb.Append(Revision);
    }
    if (__isset.newRevision) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("NewRevision: ");
      __sb.Append(NewRevision);
    }
    if (Dictionaries != null && __isset.dictionaries) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Dictionaries: ");
      __sb.Append(Dictionaries);
    }
    if (PreloadedDictionaries != null && __isset.preloadedDictionaries) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("PreloadedDictionaries: ");
      __sb.Append(PreloadedDictionaries);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

