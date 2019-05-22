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
public partial class FetchMyEventsResponse : TBase
{
  private SubscriptionState _subscription;
  private List<SquareEvent> _events;
  private string _syncToken;
  private string _continuationToken;

  public SubscriptionState Subscription
  {
    get
    {
      return _subscription;
    }
    set
    {
      __isset.subscription = true;
      this._subscription = value;
    }
  }

  public List<SquareEvent> Events
  {
    get
    {
      return _events;
    }
    set
    {
      __isset.events = true;
      this._events = value;
    }
  }

  public string SyncToken
  {
    get
    {
      return _syncToken;
    }
    set
    {
      __isset.syncToken = true;
      this._syncToken = value;
    }
  }

  public string ContinuationToken
  {
    get
    {
      return _continuationToken;
    }
    set
    {
      __isset.continuationToken = true;
      this._continuationToken = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool subscription;
    public bool events;
    public bool syncToken;
    public bool continuationToken;
  }

  public FetchMyEventsResponse() {
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
              Subscription = new SubscriptionState();
              Subscription.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                Events = new List<SquareEvent>();
                TList _list433 = iprot.ReadListBegin();
                for( int _i434 = 0; _i434 < _list433.Count; ++_i434)
                {
                  SquareEvent _elem435;
                  _elem435 = new SquareEvent();
                  _elem435.Read(iprot);
                  Events.Add(_elem435);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              SyncToken = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              ContinuationToken = iprot.ReadString();
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
      TStruct struc = new TStruct("FetchMyEventsResponse");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Subscription != null && __isset.subscription) {
        field.Name = "subscription";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        Subscription.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Events != null && __isset.events) {
        field.Name = "events";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Events.Count));
          foreach (SquareEvent _iter436 in Events)
          {
            _iter436.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (SyncToken != null && __isset.syncToken) {
        field.Name = "syncToken";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SyncToken);
        oprot.WriteFieldEnd();
      }
      if (ContinuationToken != null && __isset.continuationToken) {
        field.Name = "continuationToken";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ContinuationToken);
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
    StringBuilder __sb = new StringBuilder("FetchMyEventsResponse(");
    bool __first = true;
    if (Subscription != null && __isset.subscription) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Subscription: ");
      __sb.Append(Subscription== null ? "<null>" : Subscription.ToString());
    }
    if (Events != null && __isset.events) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Events: ");
      __sb.Append(Events);
    }
    if (SyncToken != null && __isset.syncToken) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SyncToken: ");
      __sb.Append(SyncToken);
    }
    if (ContinuationToken != null && __isset.continuationToken) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ContinuationToken: ");
      __sb.Append(ContinuationToken);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

