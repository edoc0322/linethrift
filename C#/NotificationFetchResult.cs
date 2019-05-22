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
public partial class NotificationFetchResult : TBase
{
  private NotificationItemFetchMode _fetchMode;
  private List<NotificationItem> _itemList;

  /// <summary>
  /// 
  /// <seealso cref="NotificationItemFetchMode"/>
  /// </summary>
  public NotificationItemFetchMode FetchMode
  {
    get
    {
      return _fetchMode;
    }
    set
    {
      __isset.fetchMode = true;
      this._fetchMode = value;
    }
  }

  public List<NotificationItem> ItemList
  {
    get
    {
      return _itemList;
    }
    set
    {
      __isset.itemList = true;
      this._itemList = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool fetchMode;
    public bool itemList;
  }

  public NotificationFetchResult() {
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
            if (field.Type == TType.I32) {
              FetchMode = (NotificationItemFetchMode)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                ItemList = new List<NotificationItem>();
                TList _list272 = iprot.ReadListBegin();
                for( int _i273 = 0; _i273 < _list272.Count; ++_i273)
                {
                  NotificationItem _elem274;
                  _elem274 = new NotificationItem();
                  _elem274.Read(iprot);
                  ItemList.Add(_elem274);
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
      TStruct struc = new TStruct("NotificationFetchResult");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.fetchMode) {
        field.Name = "fetchMode";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)FetchMode);
        oprot.WriteFieldEnd();
      }
      if (ItemList != null && __isset.itemList) {
        field.Name = "itemList";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, ItemList.Count));
          foreach (NotificationItem _iter275 in ItemList)
          {
            _iter275.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("NotificationFetchResult(");
    bool __first = true;
    if (__isset.fetchMode) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("FetchMode: ");
      __sb.Append(FetchMode);
    }
    if (ItemList != null && __isset.itemList) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ItemList: ");
      __sb.Append(ItemList);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

