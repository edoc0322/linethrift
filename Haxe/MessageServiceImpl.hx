/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;
import haxe.io.Bytes;
import haxe.ds.IntMap;
import haxe.ds.StringMap;
import haxe.ds.ObjectMap;

#if flash
import flash.errors.ArgumentError;
#end

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;



class MessageServiceImpl implements MessageService {

  public function new( iprot : TProtocol, oprot : TProtocol = null)
  {
    iprot_ = iprot;
    if (oprot == null) {
      oprot_ = iprot;
    } else {
      oprot_ = oprot;
    }
  }

  private var iprot_ : TProtocol;
  private var oprot_ : TProtocol;
  private var seqid_ : Int;

  public function getInputProtocol() : TProtocol
  {
    return this.iprot_;
  }

  public function getOutputProtocol() : TProtocol
  {
    return this.oprot_;
  }

  public function fetchMessageOperations(localRevision : haxe.Int64, lastOpTimestamp : haxe.Int64, count : haxe.Int32) : MessageOperations {
    oprot_.writeMessageBegin(new TMessage("fetchMessageOperations", TMessageType.CALL, seqid_));
    var args : FetchMessageOperations_args = new FetchMessageOperations_args();
    args.localRevision = localRevision;
    args.lastOpTimestamp = lastOpTimestamp;
    args.count = count;
    args.write(oprot_);
    oprot_.writeMessageEnd();
    var retval : MessageOperations;
    oprot_.getTransport().flush(function(error:Dynamic) : Void {
      if (error != null) {
        throw error;
      }
      var msg : TMessage = iprot_.readMessageBegin();
      if (msg.type == TMessageType.EXCEPTION) {
        var x = TApplicationException.read(iprot_);
        iprot_.readMessageEnd();
        throw x;
      }
      var result : FetchMessageOperations_result = new FetchMessageOperations_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.isSetSuccess()) {
        retval = result.success;
        return;
      }
      if (result.e != null) {
        throw result.e;
      }
      throw new TApplicationException(TApplicationException.MISSING_RESULT,
                                  "fetchMessageOperations failed: unknown result");
    });
    return retval;
  }

  public function getLastReadMessageIds(chatId : String) : LastReadMessageIds {
    oprot_.writeMessageBegin(new TMessage("getLastReadMessageIds", TMessageType.CALL, seqid_));
    var args : GetLastReadMessageIds_args = new GetLastReadMessageIds_args();
    args.chatId = chatId;
    args.write(oprot_);
    oprot_.writeMessageEnd();
    var retval : LastReadMessageIds;
    oprot_.getTransport().flush(function(error:Dynamic) : Void {
      if (error != null) {
        throw error;
      }
      var msg : TMessage = iprot_.readMessageBegin();
      if (msg.type == TMessageType.EXCEPTION) {
        var x = TApplicationException.read(iprot_);
        iprot_.readMessageEnd();
        throw x;
      }
      var result : GetLastReadMessageIds_result = new GetLastReadMessageIds_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.isSetSuccess()) {
        retval = result.success;
        return;
      }
      if (result.e != null) {
        throw result.e;
      }
      throw new TApplicationException(TApplicationException.MISSING_RESULT,
                                  "getLastReadMessageIds failed: unknown result");
    });
    return retval;
  }

  public function multiGetLastReadMessageIds(chatIds : List< String>) : List< LastReadMessageIds> {
    oprot_.writeMessageBegin(new TMessage("multiGetLastReadMessageIds", TMessageType.CALL, seqid_));
    var args : MultiGetLastReadMessageIds_args = new MultiGetLastReadMessageIds_args();
    args.chatIds = chatIds;
    args.write(oprot_);
    oprot_.writeMessageEnd();
    var retval : List< LastReadMessageIds>;
    oprot_.getTransport().flush(function(error:Dynamic) : Void {
      if (error != null) {
        throw error;
      }
      var msg : TMessage = iprot_.readMessageBegin();
      if (msg.type == TMessageType.EXCEPTION) {
        var x = TApplicationException.read(iprot_);
        iprot_.readMessageEnd();
        throw x;
      }
      var result : MultiGetLastReadMessageIds_result = new MultiGetLastReadMessageIds_result();
      result.read(iprot_);
      iprot_.readMessageEnd();
      if (result.isSetSuccess()) {
        retval = result.success;
        return;
      }
      if (result.e != null) {
        throw result.e;
      }
      throw new TApplicationException(TApplicationException.MISSING_RESULT,
                                  "multiGetLastReadMessageIds failed: unknown result");
    });
    return retval;
  }

}
