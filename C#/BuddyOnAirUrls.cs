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
public partial class BuddyOnAirUrls : TBase
{
  private Dictionary<string, string> _hls;
  private Dictionary<string, string> _smoothStreaming;

  public Dictionary<string, string> Hls
  {
    get
    {
      return _hls;
    }
    set
    {
      __isset.hls = true;
      this._hls = value;
    }
  }

  public Dictionary<string, string> SmoothStreaming
  {
    get
    {
      return _smoothStreaming;
    }
    set
    {
      __isset.smoothStreaming = true;
      this._smoothStreaming = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool hls;
    public bool smoothStreaming;
  }

  public BuddyOnAirUrls() {
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
            if (field.Type == TType.Map) {
              {
                Hls = new Dictionary<string, string>();
                TMap _map149 = iprot.ReadMapBegin();
                for( int _i150 = 0; _i150 < _map149.Count; ++_i150)
                {
                  string _key151;
                  string _val152;
                  _key151 = iprot.ReadString();
                  _val152 = iprot.ReadString();
                  Hls[_key151] = _val152;
                }
                iprot.ReadMapEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Map) {
              {
                SmoothStreaming = new Dictionary<string, string>();
                TMap _map153 = iprot.ReadMapBegin();
                for( int _i154 = 0; _i154 < _map153.Count; ++_i154)
                {
                  string _key155;
                  string _val156;
                  _key155 = iprot.ReadString();
                  _val156 = iprot.ReadString();
                  SmoothStreaming[_key155] = _val156;
                }
                iprot.ReadMapEnd();
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
      TStruct struc = new TStruct("BuddyOnAirUrls");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Hls != null && __isset.hls) {
        field.Name = "hls";
        field.Type = TType.Map;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteMapBegin(new TMap(TType.String, TType.String, Hls.Count));
          foreach (string _iter157 in Hls.Keys)
          {
            oprot.WriteString(_iter157);
            oprot.WriteString(Hls[_iter157]);
          }
          oprot.WriteMapEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (SmoothStreaming != null && __isset.smoothStreaming) {
        field.Name = "smoothStreaming";
        field.Type = TType.Map;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteMapBegin(new TMap(TType.String, TType.String, SmoothStreaming.Count));
          foreach (string _iter158 in SmoothStreaming.Keys)
          {
            oprot.WriteString(_iter158);
            oprot.WriteString(SmoothStreaming[_iter158]);
          }
          oprot.WriteMapEnd();
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
    StringBuilder __sb = new StringBuilder("BuddyOnAirUrls(");
    bool __first = true;
    if (Hls != null && __isset.hls) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Hls: ");
      __sb.Append(Hls);
    }
    if (SmoothStreaming != null && __isset.smoothStreaming) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SmoothStreaming: ");
      __sb.Append(SmoothStreaming);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

