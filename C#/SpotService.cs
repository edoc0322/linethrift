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

public partial class SpotService {
  public interface ISync {
    SpotPhoneNumberResponse lookupByPhoneNumber(string countryAreaCode, string phoneNumber);
    SpotNearbyResponse lookupNearby(Location location, SpotCategory category, string query, string countryAreaCode);
  }

  public interface Iface : ISync {
    #if SILVERLIGHT
    IAsyncResult Begin_lookupByPhoneNumber(AsyncCallback callback, object state, string countryAreaCode, string phoneNumber);
    SpotPhoneNumberResponse End_lookupByPhoneNumber(IAsyncResult asyncResult);
    #endif
    #if SILVERLIGHT
    IAsyncResult Begin_lookupNearby(AsyncCallback callback, object state, Location location, SpotCategory category, string query, string countryAreaCode);
    SpotNearbyResponse End_lookupNearby(IAsyncResult asyncResult);
    #endif
  }

  public class Client : IDisposable, Iface {
    public Client(TProtocol prot) : this(prot, prot)
    {
    }

    public Client(TProtocol iprot, TProtocol oprot)
    {
      iprot_ = iprot;
      oprot_ = oprot;
    }

    protected TProtocol iprot_;
    protected TProtocol oprot_;
    protected int seqid_;

    public TProtocol InputProtocol
    {
      get { return iprot_; }
    }
    public TProtocol OutputProtocol
    {
      get { return oprot_; }
    }


    #region " IDisposable Support "
    private bool _IsDisposed;

    // IDisposable
    public void Dispose()
    {
      Dispose(true);
    }
    

    protected virtual void Dispose(bool disposing)
    {
      if (!_IsDisposed)
      {
        if (disposing)
        {
          if (iprot_ != null)
          {
            ((IDisposable)iprot_).Dispose();
          }
          if (oprot_ != null)
          {
            ((IDisposable)oprot_).Dispose();
          }
        }
      }
      _IsDisposed = true;
    }
    #endregion


    
    #if SILVERLIGHT
    
    public IAsyncResult Begin_lookupByPhoneNumber(AsyncCallback callback, object state, string countryAreaCode, string phoneNumber)
    {
      return send_lookupByPhoneNumber(callback, state, countryAreaCode, phoneNumber);
    }

    public SpotPhoneNumberResponse End_lookupByPhoneNumber(IAsyncResult asyncResult)
    {
      oprot_.Transport.EndFlush(asyncResult);
      return recv_lookupByPhoneNumber();
    }

    #endif

    public SpotPhoneNumberResponse lookupByPhoneNumber(string countryAreaCode, string phoneNumber)
    {
      #if SILVERLIGHT
      var asyncResult = Begin_lookupByPhoneNumber(null, null, countryAreaCode, phoneNumber);
      return End_lookupByPhoneNumber(asyncResult);

      #else
      send_lookupByPhoneNumber(countryAreaCode, phoneNumber);
      return recv_lookupByPhoneNumber();

      #endif
    }
    #if SILVERLIGHT
    public IAsyncResult send_lookupByPhoneNumber(AsyncCallback callback, object state, string countryAreaCode, string phoneNumber)
    {
      oprot_.WriteMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.Call, seqid_));
      lookupByPhoneNumber_args args = new lookupByPhoneNumber_args();
      args.CountryAreaCode = countryAreaCode;
      args.PhoneNumber = phoneNumber;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      return oprot_.Transport.BeginFlush(callback, state);
    }

    #else

    public void send_lookupByPhoneNumber(string countryAreaCode, string phoneNumber)
    {
      oprot_.WriteMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.Call, seqid_));
      lookupByPhoneNumber_args args = new lookupByPhoneNumber_args();
      args.CountryAreaCode = countryAreaCode;
      args.PhoneNumber = phoneNumber;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      oprot_.Transport.Flush();
    }
    #endif

    public SpotPhoneNumberResponse recv_lookupByPhoneNumber()
    {
      TMessage msg = iprot_.ReadMessageBegin();
      if (msg.Type == TMessageType.Exception) {
        TApplicationException x = TApplicationException.Read(iprot_);
        iprot_.ReadMessageEnd();
        throw x;
      }
      lookupByPhoneNumber_result result = new lookupByPhoneNumber_result();
      result.Read(iprot_);
      iprot_.ReadMessageEnd();
      if (result.__isset.success) {
        return result.Success;
      }
      if (result.__isset.e) {
        throw result.E;
      }
      throw new TApplicationException(TApplicationException.ExceptionType.MissingResult, "lookupByPhoneNumber failed: unknown result");
    }

    
    #if SILVERLIGHT
    
    public IAsyncResult Begin_lookupNearby(AsyncCallback callback, object state, Location location, SpotCategory category, string query, string countryAreaCode)
    {
      return send_lookupNearby(callback, state, location, category, query, countryAreaCode);
    }

    public SpotNearbyResponse End_lookupNearby(IAsyncResult asyncResult)
    {
      oprot_.Transport.EndFlush(asyncResult);
      return recv_lookupNearby();
    }

    #endif

    public SpotNearbyResponse lookupNearby(Location location, SpotCategory category, string query, string countryAreaCode)
    {
      #if SILVERLIGHT
      var asyncResult = Begin_lookupNearby(null, null, location, category, query, countryAreaCode);
      return End_lookupNearby(asyncResult);

      #else
      send_lookupNearby(location, category, query, countryAreaCode);
      return recv_lookupNearby();

      #endif
    }
    #if SILVERLIGHT
    public IAsyncResult send_lookupNearby(AsyncCallback callback, object state, Location location, SpotCategory category, string query, string countryAreaCode)
    {
      oprot_.WriteMessageBegin(new TMessage("lookupNearby", TMessageType.Call, seqid_));
      lookupNearby_args args = new lookupNearby_args();
      args.Location = location;
      args.Category = category;
      args.Query = query;
      args.CountryAreaCode = countryAreaCode;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      return oprot_.Transport.BeginFlush(callback, state);
    }

    #else

    public void send_lookupNearby(Location location, SpotCategory category, string query, string countryAreaCode)
    {
      oprot_.WriteMessageBegin(new TMessage("lookupNearby", TMessageType.Call, seqid_));
      lookupNearby_args args = new lookupNearby_args();
      args.Location = location;
      args.Category = category;
      args.Query = query;
      args.CountryAreaCode = countryAreaCode;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      oprot_.Transport.Flush();
    }
    #endif

    public SpotNearbyResponse recv_lookupNearby()
    {
      TMessage msg = iprot_.ReadMessageBegin();
      if (msg.Type == TMessageType.Exception) {
        TApplicationException x = TApplicationException.Read(iprot_);
        iprot_.ReadMessageEnd();
        throw x;
      }
      lookupNearby_result result = new lookupNearby_result();
      result.Read(iprot_);
      iprot_.ReadMessageEnd();
      if (result.__isset.success) {
        return result.Success;
      }
      if (result.__isset.e) {
        throw result.E;
      }
      throw new TApplicationException(TApplicationException.ExceptionType.MissingResult, "lookupNearby failed: unknown result");
    }

  }
  public class Processor : TProcessor {
    public Processor(ISync iface)
    {
      iface_ = iface;
      processMap_["lookupByPhoneNumber"] = lookupByPhoneNumber_Process;
      processMap_["lookupNearby"] = lookupNearby_Process;
    }

    protected delegate void ProcessFunction(int seqid, TProtocol iprot, TProtocol oprot);
    private ISync iface_;
    protected Dictionary<string, ProcessFunction> processMap_ = new Dictionary<string, ProcessFunction>();

    public bool Process(TProtocol iprot, TProtocol oprot)
    {
      try
      {
        TMessage msg = iprot.ReadMessageBegin();
        ProcessFunction fn;
        processMap_.TryGetValue(msg.Name, out fn);
        if (fn == null) {
          TProtocolUtil.Skip(iprot, TType.Struct);
          iprot.ReadMessageEnd();
          TApplicationException x = new TApplicationException (TApplicationException.ExceptionType.UnknownMethod, "Invalid method name: '" + msg.Name + "'");
          oprot.WriteMessageBegin(new TMessage(msg.Name, TMessageType.Exception, msg.SeqID));
          x.Write(oprot);
          oprot.WriteMessageEnd();
          oprot.Transport.Flush();
          return true;
        }
        fn(msg.SeqID, iprot, oprot);
      }
      catch (IOException)
      {
        return false;
      }
      return true;
    }

    public void lookupByPhoneNumber_Process(int seqid, TProtocol iprot, TProtocol oprot)
    {
      lookupByPhoneNumber_args args = new lookupByPhoneNumber_args();
      args.Read(iprot);
      iprot.ReadMessageEnd();
      lookupByPhoneNumber_result result = new lookupByPhoneNumber_result();
      try
      {
        try
        {
          result.Success = iface_.lookupByPhoneNumber(args.CountryAreaCode, args.PhoneNumber);
        }
        catch (TalkException e)
        {
          result.E = e;
        }
        oprot.WriteMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.Reply, seqid)); 
        result.Write(oprot);
      }
      catch (TTransportException)
      {
        throw;
      }
      catch (Exception ex)
      {
        Console.Error.WriteLine("Error occurred in processor:");
        Console.Error.WriteLine(ex.ToString());
        TApplicationException x = new TApplicationException      (TApplicationException.ExceptionType.InternalError," Internal error.");
        oprot.WriteMessageBegin(new TMessage("lookupByPhoneNumber", TMessageType.Exception, seqid));
        x.Write(oprot);
      }
      oprot.WriteMessageEnd();
      oprot.Transport.Flush();
    }

    public void lookupNearby_Process(int seqid, TProtocol iprot, TProtocol oprot)
    {
      lookupNearby_args args = new lookupNearby_args();
      args.Read(iprot);
      iprot.ReadMessageEnd();
      lookupNearby_result result = new lookupNearby_result();
      try
      {
        try
        {
          result.Success = iface_.lookupNearby(args.Location, args.Category, args.Query, args.CountryAreaCode);
        }
        catch (TalkException e)
        {
          result.E = e;
        }
        oprot.WriteMessageBegin(new TMessage("lookupNearby", TMessageType.Reply, seqid)); 
        result.Write(oprot);
      }
      catch (TTransportException)
      {
        throw;
      }
      catch (Exception ex)
      {
        Console.Error.WriteLine("Error occurred in processor:");
        Console.Error.WriteLine(ex.ToString());
        TApplicationException x = new TApplicationException      (TApplicationException.ExceptionType.InternalError," Internal error.");
        oprot.WriteMessageBegin(new TMessage("lookupNearby", TMessageType.Exception, seqid));
        x.Write(oprot);
      }
      oprot.WriteMessageEnd();
      oprot.Transport.Flush();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class lookupByPhoneNumber_args : TBase
  {
    private string _countryAreaCode;
    private string _phoneNumber;

    public string CountryAreaCode
    {
      get
      {
        return _countryAreaCode;
      }
      set
      {
        __isset.countryAreaCode = true;
        this._countryAreaCode = value;
      }
    }

    public string PhoneNumber
    {
      get
      {
        return _phoneNumber;
      }
      set
      {
        __isset.phoneNumber = true;
        this._phoneNumber = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool countryAreaCode;
      public bool phoneNumber;
    }

    public lookupByPhoneNumber_args() {
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
              if (field.Type == TType.String) {
                CountryAreaCode = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.String) {
                PhoneNumber = iprot.ReadString();
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
        TStruct struc = new TStruct("lookupByPhoneNumber_args");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (CountryAreaCode != null && __isset.countryAreaCode) {
          field.Name = "countryAreaCode";
          field.Type = TType.String;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(CountryAreaCode);
          oprot.WriteFieldEnd();
        }
        if (PhoneNumber != null && __isset.phoneNumber) {
          field.Name = "phoneNumber";
          field.Type = TType.String;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(PhoneNumber);
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
      StringBuilder __sb = new StringBuilder("lookupByPhoneNumber_args(");
      bool __first = true;
      if (CountryAreaCode != null && __isset.countryAreaCode) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("CountryAreaCode: ");
        __sb.Append(CountryAreaCode);
      }
      if (PhoneNumber != null && __isset.phoneNumber) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("PhoneNumber: ");
        __sb.Append(PhoneNumber);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class lookupByPhoneNumber_result : TBase
  {
    private SpotPhoneNumberResponse _success;
    private TalkException _e;

    public SpotPhoneNumberResponse Success
    {
      get
      {
        return _success;
      }
      set
      {
        __isset.success = true;
        this._success = value;
      }
    }

    public TalkException E
    {
      get
      {
        return _e;
      }
      set
      {
        __isset.e = true;
        this._e = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool success;
      public bool e;
    }

    public lookupByPhoneNumber_result() {
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
            case 0:
              if (field.Type == TType.Struct) {
                Success = new SpotPhoneNumberResponse();
                Success.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 1:
              if (field.Type == TType.Struct) {
                E = new TalkException();
                E.Read(iprot);
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
        TStruct struc = new TStruct("lookupByPhoneNumber_result");
        oprot.WriteStructBegin(struc);
        TField field = new TField();

        if (this.__isset.success) {
          if (Success != null) {
            field.Name = "Success";
            field.Type = TType.Struct;
            field.ID = 0;
            oprot.WriteFieldBegin(field);
            Success.Write(oprot);
            oprot.WriteFieldEnd();
          }
        } else if (this.__isset.e) {
          if (E != null) {
            field.Name = "E";
            field.Type = TType.Struct;
            field.ID = 1;
            oprot.WriteFieldBegin(field);
            E.Write(oprot);
            oprot.WriteFieldEnd();
          }
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
      StringBuilder __sb = new StringBuilder("lookupByPhoneNumber_result(");
      bool __first = true;
      if (Success != null && __isset.success) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Success: ");
        __sb.Append(Success== null ? "<null>" : Success.ToString());
      }
      if (E != null && __isset.e) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("E: ");
        __sb.Append(E== null ? "<null>" : E.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class lookupNearby_args : TBase
  {
    private Location _location;
    private SpotCategory _category;
    private string _query;
    private string _countryAreaCode;

    public Location Location
    {
      get
      {
        return _location;
      }
      set
      {
        __isset.location = true;
        this._location = value;
      }
    }

    /// <summary>
    /// 
    /// <seealso cref="SpotCategory"/>
    /// </summary>
    public SpotCategory Category
    {
      get
      {
        return _category;
      }
      set
      {
        __isset.category = true;
        this._category = value;
      }
    }

    public string Query
    {
      get
      {
        return _query;
      }
      set
      {
        __isset.query = true;
        this._query = value;
      }
    }

    public string CountryAreaCode
    {
      get
      {
        return _countryAreaCode;
      }
      set
      {
        __isset.countryAreaCode = true;
        this._countryAreaCode = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool location;
      public bool category;
      public bool query;
      public bool countryAreaCode;
    }

    public lookupNearby_args() {
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
              if (field.Type == TType.Struct) {
                Location = new Location();
                Location.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.I32) {
                Category = (SpotCategory)iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.String) {
                Query = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 5:
              if (field.Type == TType.String) {
                CountryAreaCode = iprot.ReadString();
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
        TStruct struc = new TStruct("lookupNearby_args");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (Location != null && __isset.location) {
          field.Name = "location";
          field.Type = TType.Struct;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          Location.Write(oprot);
          oprot.WriteFieldEnd();
        }
        if (__isset.category) {
          field.Name = "category";
          field.Type = TType.I32;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32((int)Category);
          oprot.WriteFieldEnd();
        }
        if (Query != null && __isset.query) {
          field.Name = "query";
          field.Type = TType.String;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Query);
          oprot.WriteFieldEnd();
        }
        if (CountryAreaCode != null && __isset.countryAreaCode) {
          field.Name = "countryAreaCode";
          field.Type = TType.String;
          field.ID = 5;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(CountryAreaCode);
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
      StringBuilder __sb = new StringBuilder("lookupNearby_args(");
      bool __first = true;
      if (Location != null && __isset.location) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Location: ");
        __sb.Append(Location== null ? "<null>" : Location.ToString());
      }
      if (__isset.category) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Category: ");
        __sb.Append(Category);
      }
      if (Query != null && __isset.query) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Query: ");
        __sb.Append(Query);
      }
      if (CountryAreaCode != null && __isset.countryAreaCode) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("CountryAreaCode: ");
        __sb.Append(CountryAreaCode);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class lookupNearby_result : TBase
  {
    private SpotNearbyResponse _success;
    private TalkException _e;

    public SpotNearbyResponse Success
    {
      get
      {
        return _success;
      }
      set
      {
        __isset.success = true;
        this._success = value;
      }
    }

    public TalkException E
    {
      get
      {
        return _e;
      }
      set
      {
        __isset.e = true;
        this._e = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool success;
      public bool e;
    }

    public lookupNearby_result() {
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
            case 0:
              if (field.Type == TType.Struct) {
                Success = new SpotNearbyResponse();
                Success.Read(iprot);
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 1:
              if (field.Type == TType.Struct) {
                E = new TalkException();
                E.Read(iprot);
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
        TStruct struc = new TStruct("lookupNearby_result");
        oprot.WriteStructBegin(struc);
        TField field = new TField();

        if (this.__isset.success) {
          if (Success != null) {
            field.Name = "Success";
            field.Type = TType.Struct;
            field.ID = 0;
            oprot.WriteFieldBegin(field);
            Success.Write(oprot);
            oprot.WriteFieldEnd();
          }
        } else if (this.__isset.e) {
          if (E != null) {
            field.Name = "E";
            field.Type = TType.Struct;
            field.ID = 1;
            oprot.WriteFieldBegin(field);
            E.Write(oprot);
            oprot.WriteFieldEnd();
          }
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
      StringBuilder __sb = new StringBuilder("lookupNearby_result(");
      bool __first = true;
      if (Success != null && __isset.success) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Success: ");
        __sb.Append(Success== null ? "<null>" : Success.ToString());
      }
      if (E != null && __isset.e) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("E: ");
        __sb.Append(E== null ? "<null>" : E.ToString());
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }

}
