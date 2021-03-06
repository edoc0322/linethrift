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

public partial class BotService {
  public interface ISync {
    void notifyLeaveGroup(string groupMid);
    void notifyLeaveRoom(string roomMid);
    BotUseInfo getBotUseInfo(string botMid);
    void sendChatCheckedByWatermark(int seq, string mid, long watermark, sbyte sessionId);
  }

  public interface Iface : ISync {
    #if SILVERLIGHT
    IAsyncResult Begin_notifyLeaveGroup(AsyncCallback callback, object state, string groupMid);
    void End_notifyLeaveGroup(IAsyncResult asyncResult);
    #endif
    #if SILVERLIGHT
    IAsyncResult Begin_notifyLeaveRoom(AsyncCallback callback, object state, string roomMid);
    void End_notifyLeaveRoom(IAsyncResult asyncResult);
    #endif
    #if SILVERLIGHT
    IAsyncResult Begin_getBotUseInfo(AsyncCallback callback, object state, string botMid);
    BotUseInfo End_getBotUseInfo(IAsyncResult asyncResult);
    #endif
    #if SILVERLIGHT
    IAsyncResult Begin_sendChatCheckedByWatermark(AsyncCallback callback, object state, int seq, string mid, long watermark, sbyte sessionId);
    void End_sendChatCheckedByWatermark(IAsyncResult asyncResult);
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
    
    public IAsyncResult Begin_notifyLeaveGroup(AsyncCallback callback, object state, string groupMid)
    {
      return send_notifyLeaveGroup(callback, state, groupMid);
    }

    public void End_notifyLeaveGroup(IAsyncResult asyncResult)
    {
      oprot_.Transport.EndFlush(asyncResult);
      recv_notifyLeaveGroup();
    }

    #endif

    public void notifyLeaveGroup(string groupMid)
    {
      #if SILVERLIGHT
      var asyncResult = Begin_notifyLeaveGroup(null, null, groupMid);
      End_notifyLeaveGroup(asyncResult);

      #else
      send_notifyLeaveGroup(groupMid);
      recv_notifyLeaveGroup();

      #endif
    }
    #if SILVERLIGHT
    public IAsyncResult send_notifyLeaveGroup(AsyncCallback callback, object state, string groupMid)
    {
      oprot_.WriteMessageBegin(new TMessage("notifyLeaveGroup", TMessageType.Call, seqid_));
      notifyLeaveGroup_args args = new notifyLeaveGroup_args();
      args.GroupMid = groupMid;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      return oprot_.Transport.BeginFlush(callback, state);
    }

    #else

    public void send_notifyLeaveGroup(string groupMid)
    {
      oprot_.WriteMessageBegin(new TMessage("notifyLeaveGroup", TMessageType.Call, seqid_));
      notifyLeaveGroup_args args = new notifyLeaveGroup_args();
      args.GroupMid = groupMid;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      oprot_.Transport.Flush();
    }
    #endif

    public void recv_notifyLeaveGroup()
    {
      TMessage msg = iprot_.ReadMessageBegin();
      if (msg.Type == TMessageType.Exception) {
        TApplicationException x = TApplicationException.Read(iprot_);
        iprot_.ReadMessageEnd();
        throw x;
      }
      notifyLeaveGroup_result result = new notifyLeaveGroup_result();
      result.Read(iprot_);
      iprot_.ReadMessageEnd();
      if (result.__isset.e) {
        throw result.E;
      }
      return;
    }

    
    #if SILVERLIGHT
    
    public IAsyncResult Begin_notifyLeaveRoom(AsyncCallback callback, object state, string roomMid)
    {
      return send_notifyLeaveRoom(callback, state, roomMid);
    }

    public void End_notifyLeaveRoom(IAsyncResult asyncResult)
    {
      oprot_.Transport.EndFlush(asyncResult);
      recv_notifyLeaveRoom();
    }

    #endif

    public void notifyLeaveRoom(string roomMid)
    {
      #if SILVERLIGHT
      var asyncResult = Begin_notifyLeaveRoom(null, null, roomMid);
      End_notifyLeaveRoom(asyncResult);

      #else
      send_notifyLeaveRoom(roomMid);
      recv_notifyLeaveRoom();

      #endif
    }
    #if SILVERLIGHT
    public IAsyncResult send_notifyLeaveRoom(AsyncCallback callback, object state, string roomMid)
    {
      oprot_.WriteMessageBegin(new TMessage("notifyLeaveRoom", TMessageType.Call, seqid_));
      notifyLeaveRoom_args args = new notifyLeaveRoom_args();
      args.RoomMid = roomMid;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      return oprot_.Transport.BeginFlush(callback, state);
    }

    #else

    public void send_notifyLeaveRoom(string roomMid)
    {
      oprot_.WriteMessageBegin(new TMessage("notifyLeaveRoom", TMessageType.Call, seqid_));
      notifyLeaveRoom_args args = new notifyLeaveRoom_args();
      args.RoomMid = roomMid;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      oprot_.Transport.Flush();
    }
    #endif

    public void recv_notifyLeaveRoom()
    {
      TMessage msg = iprot_.ReadMessageBegin();
      if (msg.Type == TMessageType.Exception) {
        TApplicationException x = TApplicationException.Read(iprot_);
        iprot_.ReadMessageEnd();
        throw x;
      }
      notifyLeaveRoom_result result = new notifyLeaveRoom_result();
      result.Read(iprot_);
      iprot_.ReadMessageEnd();
      if (result.__isset.e) {
        throw result.E;
      }
      return;
    }

    
    #if SILVERLIGHT
    
    public IAsyncResult Begin_getBotUseInfo(AsyncCallback callback, object state, string botMid)
    {
      return send_getBotUseInfo(callback, state, botMid);
    }

    public BotUseInfo End_getBotUseInfo(IAsyncResult asyncResult)
    {
      oprot_.Transport.EndFlush(asyncResult);
      return recv_getBotUseInfo();
    }

    #endif

    public BotUseInfo getBotUseInfo(string botMid)
    {
      #if SILVERLIGHT
      var asyncResult = Begin_getBotUseInfo(null, null, botMid);
      return End_getBotUseInfo(asyncResult);

      #else
      send_getBotUseInfo(botMid);
      return recv_getBotUseInfo();

      #endif
    }
    #if SILVERLIGHT
    public IAsyncResult send_getBotUseInfo(AsyncCallback callback, object state, string botMid)
    {
      oprot_.WriteMessageBegin(new TMessage("getBotUseInfo", TMessageType.Call, seqid_));
      getBotUseInfo_args args = new getBotUseInfo_args();
      args.BotMid = botMid;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      return oprot_.Transport.BeginFlush(callback, state);
    }

    #else

    public void send_getBotUseInfo(string botMid)
    {
      oprot_.WriteMessageBegin(new TMessage("getBotUseInfo", TMessageType.Call, seqid_));
      getBotUseInfo_args args = new getBotUseInfo_args();
      args.BotMid = botMid;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      oprot_.Transport.Flush();
    }
    #endif

    public BotUseInfo recv_getBotUseInfo()
    {
      TMessage msg = iprot_.ReadMessageBegin();
      if (msg.Type == TMessageType.Exception) {
        TApplicationException x = TApplicationException.Read(iprot_);
        iprot_.ReadMessageEnd();
        throw x;
      }
      getBotUseInfo_result result = new getBotUseInfo_result();
      result.Read(iprot_);
      iprot_.ReadMessageEnd();
      if (result.__isset.success) {
        return result.Success;
      }
      if (result.__isset.e) {
        throw result.E;
      }
      throw new TApplicationException(TApplicationException.ExceptionType.MissingResult, "getBotUseInfo failed: unknown result");
    }

    
    #if SILVERLIGHT
    
    public IAsyncResult Begin_sendChatCheckedByWatermark(AsyncCallback callback, object state, int seq, string mid, long watermark, sbyte sessionId)
    {
      return send_sendChatCheckedByWatermark(callback, state, seq, mid, watermark, sessionId);
    }

    public void End_sendChatCheckedByWatermark(IAsyncResult asyncResult)
    {
      oprot_.Transport.EndFlush(asyncResult);
      recv_sendChatCheckedByWatermark();
    }

    #endif

    public void sendChatCheckedByWatermark(int seq, string mid, long watermark, sbyte sessionId)
    {
      #if SILVERLIGHT
      var asyncResult = Begin_sendChatCheckedByWatermark(null, null, seq, mid, watermark, sessionId);
      End_sendChatCheckedByWatermark(asyncResult);

      #else
      send_sendChatCheckedByWatermark(seq, mid, watermark, sessionId);
      recv_sendChatCheckedByWatermark();

      #endif
    }
    #if SILVERLIGHT
    public IAsyncResult send_sendChatCheckedByWatermark(AsyncCallback callback, object state, int seq, string mid, long watermark, sbyte sessionId)
    {
      oprot_.WriteMessageBegin(new TMessage("sendChatCheckedByWatermark", TMessageType.Call, seqid_));
      sendChatCheckedByWatermark_args args = new sendChatCheckedByWatermark_args();
      args.Seq = seq;
      args.Mid = mid;
      args.Watermark = watermark;
      args.SessionId = sessionId;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      return oprot_.Transport.BeginFlush(callback, state);
    }

    #else

    public void send_sendChatCheckedByWatermark(int seq, string mid, long watermark, sbyte sessionId)
    {
      oprot_.WriteMessageBegin(new TMessage("sendChatCheckedByWatermark", TMessageType.Call, seqid_));
      sendChatCheckedByWatermark_args args = new sendChatCheckedByWatermark_args();
      args.Seq = seq;
      args.Mid = mid;
      args.Watermark = watermark;
      args.SessionId = sessionId;
      args.Write(oprot_);
      oprot_.WriteMessageEnd();
      oprot_.Transport.Flush();
    }
    #endif

    public void recv_sendChatCheckedByWatermark()
    {
      TMessage msg = iprot_.ReadMessageBegin();
      if (msg.Type == TMessageType.Exception) {
        TApplicationException x = TApplicationException.Read(iprot_);
        iprot_.ReadMessageEnd();
        throw x;
      }
      sendChatCheckedByWatermark_result result = new sendChatCheckedByWatermark_result();
      result.Read(iprot_);
      iprot_.ReadMessageEnd();
      if (result.__isset.e) {
        throw result.E;
      }
      return;
    }

  }
  public class Processor : TProcessor {
    public Processor(ISync iface)
    {
      iface_ = iface;
      processMap_["notifyLeaveGroup"] = notifyLeaveGroup_Process;
      processMap_["notifyLeaveRoom"] = notifyLeaveRoom_Process;
      processMap_["getBotUseInfo"] = getBotUseInfo_Process;
      processMap_["sendChatCheckedByWatermark"] = sendChatCheckedByWatermark_Process;
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

    public void notifyLeaveGroup_Process(int seqid, TProtocol iprot, TProtocol oprot)
    {
      notifyLeaveGroup_args args = new notifyLeaveGroup_args();
      args.Read(iprot);
      iprot.ReadMessageEnd();
      notifyLeaveGroup_result result = new notifyLeaveGroup_result();
      try
      {
        try
        {
          iface_.notifyLeaveGroup(args.GroupMid);
        }
        catch (TalkException e)
        {
          result.E = e;
        }
        oprot.WriteMessageBegin(new TMessage("notifyLeaveGroup", TMessageType.Reply, seqid)); 
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
        oprot.WriteMessageBegin(new TMessage("notifyLeaveGroup", TMessageType.Exception, seqid));
        x.Write(oprot);
      }
      oprot.WriteMessageEnd();
      oprot.Transport.Flush();
    }

    public void notifyLeaveRoom_Process(int seqid, TProtocol iprot, TProtocol oprot)
    {
      notifyLeaveRoom_args args = new notifyLeaveRoom_args();
      args.Read(iprot);
      iprot.ReadMessageEnd();
      notifyLeaveRoom_result result = new notifyLeaveRoom_result();
      try
      {
        try
        {
          iface_.notifyLeaveRoom(args.RoomMid);
        }
        catch (TalkException e)
        {
          result.E = e;
        }
        oprot.WriteMessageBegin(new TMessage("notifyLeaveRoom", TMessageType.Reply, seqid)); 
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
        oprot.WriteMessageBegin(new TMessage("notifyLeaveRoom", TMessageType.Exception, seqid));
        x.Write(oprot);
      }
      oprot.WriteMessageEnd();
      oprot.Transport.Flush();
    }

    public void getBotUseInfo_Process(int seqid, TProtocol iprot, TProtocol oprot)
    {
      getBotUseInfo_args args = new getBotUseInfo_args();
      args.Read(iprot);
      iprot.ReadMessageEnd();
      getBotUseInfo_result result = new getBotUseInfo_result();
      try
      {
        try
        {
          result.Success = iface_.getBotUseInfo(args.BotMid);
        }
        catch (TalkException e)
        {
          result.E = e;
        }
        oprot.WriteMessageBegin(new TMessage("getBotUseInfo", TMessageType.Reply, seqid)); 
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
        oprot.WriteMessageBegin(new TMessage("getBotUseInfo", TMessageType.Exception, seqid));
        x.Write(oprot);
      }
      oprot.WriteMessageEnd();
      oprot.Transport.Flush();
    }

    public void sendChatCheckedByWatermark_Process(int seqid, TProtocol iprot, TProtocol oprot)
    {
      sendChatCheckedByWatermark_args args = new sendChatCheckedByWatermark_args();
      args.Read(iprot);
      iprot.ReadMessageEnd();
      sendChatCheckedByWatermark_result result = new sendChatCheckedByWatermark_result();
      try
      {
        try
        {
          iface_.sendChatCheckedByWatermark(args.Seq, args.Mid, args.Watermark, args.SessionId);
        }
        catch (TalkException e)
        {
          result.E = e;
        }
        oprot.WriteMessageBegin(new TMessage("sendChatCheckedByWatermark", TMessageType.Reply, seqid)); 
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
        oprot.WriteMessageBegin(new TMessage("sendChatCheckedByWatermark", TMessageType.Exception, seqid));
        x.Write(oprot);
      }
      oprot.WriteMessageEnd();
      oprot.Transport.Flush();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class notifyLeaveGroup_args : TBase
  {
    private string _groupMid;

    public string GroupMid
    {
      get
      {
        return _groupMid;
      }
      set
      {
        __isset.groupMid = true;
        this._groupMid = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool groupMid;
    }

    public notifyLeaveGroup_args() {
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
                GroupMid = iprot.ReadString();
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
        TStruct struc = new TStruct("notifyLeaveGroup_args");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (GroupMid != null && __isset.groupMid) {
          field.Name = "groupMid";
          field.Type = TType.String;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(GroupMid);
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
      StringBuilder __sb = new StringBuilder("notifyLeaveGroup_args(");
      bool __first = true;
      if (GroupMid != null && __isset.groupMid) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("GroupMid: ");
        __sb.Append(GroupMid);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class notifyLeaveGroup_result : TBase
  {
    private TalkException _e;

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
      public bool e;
    }

    public notifyLeaveGroup_result() {
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
        TStruct struc = new TStruct("notifyLeaveGroup_result");
        oprot.WriteStructBegin(struc);
        TField field = new TField();

        if (this.__isset.e) {
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
      StringBuilder __sb = new StringBuilder("notifyLeaveGroup_result(");
      bool __first = true;
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
  public partial class notifyLeaveRoom_args : TBase
  {
    private string _roomMid;

    public string RoomMid
    {
      get
      {
        return _roomMid;
      }
      set
      {
        __isset.roomMid = true;
        this._roomMid = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool roomMid;
    }

    public notifyLeaveRoom_args() {
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
                RoomMid = iprot.ReadString();
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
        TStruct struc = new TStruct("notifyLeaveRoom_args");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (RoomMid != null && __isset.roomMid) {
          field.Name = "roomMid";
          field.Type = TType.String;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(RoomMid);
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
      StringBuilder __sb = new StringBuilder("notifyLeaveRoom_args(");
      bool __first = true;
      if (RoomMid != null && __isset.roomMid) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("RoomMid: ");
        __sb.Append(RoomMid);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class notifyLeaveRoom_result : TBase
  {
    private TalkException _e;

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
      public bool e;
    }

    public notifyLeaveRoom_result() {
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
        TStruct struc = new TStruct("notifyLeaveRoom_result");
        oprot.WriteStructBegin(struc);
        TField field = new TField();

        if (this.__isset.e) {
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
      StringBuilder __sb = new StringBuilder("notifyLeaveRoom_result(");
      bool __first = true;
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
  public partial class getBotUseInfo_args : TBase
  {
    private string _botMid;

    public string BotMid
    {
      get
      {
        return _botMid;
      }
      set
      {
        __isset.botMid = true;
        this._botMid = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool botMid;
    }

    public getBotUseInfo_args() {
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
                BotMid = iprot.ReadString();
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
        TStruct struc = new TStruct("getBotUseInfo_args");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (BotMid != null && __isset.botMid) {
          field.Name = "botMid";
          field.Type = TType.String;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(BotMid);
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
      StringBuilder __sb = new StringBuilder("getBotUseInfo_args(");
      bool __first = true;
      if (BotMid != null && __isset.botMid) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("BotMid: ");
        __sb.Append(BotMid);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class getBotUseInfo_result : TBase
  {
    private BotUseInfo _success;
    private TalkException _e;

    public BotUseInfo Success
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

    public getBotUseInfo_result() {
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
                Success = new BotUseInfo();
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
        TStruct struc = new TStruct("getBotUseInfo_result");
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
      StringBuilder __sb = new StringBuilder("getBotUseInfo_result(");
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
  public partial class sendChatCheckedByWatermark_args : TBase
  {
    private int _seq;
    private string _mid;
    private long _watermark;
    private sbyte _sessionId;

    public int Seq
    {
      get
      {
        return _seq;
      }
      set
      {
        __isset.seq = true;
        this._seq = value;
      }
    }

    public string Mid
    {
      get
      {
        return _mid;
      }
      set
      {
        __isset.mid = true;
        this._mid = value;
      }
    }

    public long Watermark
    {
      get
      {
        return _watermark;
      }
      set
      {
        __isset.watermark = true;
        this._watermark = value;
      }
    }

    public sbyte SessionId
    {
      get
      {
        return _sessionId;
      }
      set
      {
        __isset.sessionId = true;
        this._sessionId = value;
      }
    }


    public Isset __isset;
    #if !SILVERLIGHT
    [Serializable]
    #endif
    public struct Isset {
      public bool seq;
      public bool mid;
      public bool watermark;
      public bool sessionId;
    }

    public sendChatCheckedByWatermark_args() {
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
                Seq = iprot.ReadI32();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 2:
              if (field.Type == TType.String) {
                Mid = iprot.ReadString();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 3:
              if (field.Type == TType.I64) {
                Watermark = iprot.ReadI64();
              } else { 
                TProtocolUtil.Skip(iprot, field.Type);
              }
              break;
            case 4:
              if (field.Type == TType.Byte) {
                SessionId = iprot.ReadByte();
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
        TStruct struc = new TStruct("sendChatCheckedByWatermark_args");
        oprot.WriteStructBegin(struc);
        TField field = new TField();
        if (__isset.seq) {
          field.Name = "seq";
          field.Type = TType.I32;
          field.ID = 1;
          oprot.WriteFieldBegin(field);
          oprot.WriteI32(Seq);
          oprot.WriteFieldEnd();
        }
        if (Mid != null && __isset.mid) {
          field.Name = "mid";
          field.Type = TType.String;
          field.ID = 2;
          oprot.WriteFieldBegin(field);
          oprot.WriteString(Mid);
          oprot.WriteFieldEnd();
        }
        if (__isset.watermark) {
          field.Name = "watermark";
          field.Type = TType.I64;
          field.ID = 3;
          oprot.WriteFieldBegin(field);
          oprot.WriteI64(Watermark);
          oprot.WriteFieldEnd();
        }
        if (__isset.sessionId) {
          field.Name = "sessionId";
          field.Type = TType.Byte;
          field.ID = 4;
          oprot.WriteFieldBegin(field);
          oprot.WriteByte(SessionId);
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
      StringBuilder __sb = new StringBuilder("sendChatCheckedByWatermark_args(");
      bool __first = true;
      if (__isset.seq) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Seq: ");
        __sb.Append(Seq);
      }
      if (Mid != null && __isset.mid) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Mid: ");
        __sb.Append(Mid);
      }
      if (__isset.watermark) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("Watermark: ");
        __sb.Append(Watermark);
      }
      if (__isset.sessionId) {
        if(!__first) { __sb.Append(", "); }
        __first = false;
        __sb.Append("SessionId: ");
        __sb.Append(SessionId);
      }
      __sb.Append(")");
      return __sb.ToString();
    }

  }


  #if !SILVERLIGHT
  [Serializable]
  #endif
  public partial class sendChatCheckedByWatermark_result : TBase
  {
    private TalkException _e;

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
      public bool e;
    }

    public sendChatCheckedByWatermark_result() {
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
        TStruct struc = new TStruct("sendChatCheckedByWatermark_result");
        oprot.WriteStructBegin(struc);
        TField field = new TField();

        if (this.__isset.e) {
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
      StringBuilder __sb = new StringBuilder("sendChatCheckedByWatermark_result(");
      bool __first = true;
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
