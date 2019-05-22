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


class BotServiceProcessor implements TProcessor {

  private var BotService_iface_ : BotService;
  private var PROCESS_MAP = new StringMap< Int->TProtocol->TProtocol->Void >();

  public function new( iface : BotService)
  {
    BotService_iface_ = iface;
    PROCESS_MAP.set("notifyLeaveGroup", notifyLeaveGroup());
    PROCESS_MAP.set("notifyLeaveRoom", notifyLeaveRoom());
    PROCESS_MAP.set("getBotUseInfo", getBotUseInfo());
    PROCESS_MAP.set("sendChatCheckedByWatermark", sendChatCheckedByWatermark());
  }

  public function process( iprot : TProtocol, oprot : TProtocol) : Bool
  {
    var msg : TMessage = iprot.readMessageBegin();
    var fn  = PROCESS_MAP.get(msg.name);
    if (fn == null) {
      TProtocolUtil.skip(iprot, TType.STRUCT);
      iprot.readMessageEnd();
      var x = new TApplicationException(TApplicationException.UNKNOWN_METHOD, "Invalid method name: '"+msg.name+"'");
      oprot.writeMessageBegin(new TMessage(msg.name, TMessageType.EXCEPTION, msg.seqid));
      x.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
      return true;
    }
    fn( msg.seqid, iprot, oprot);
    return true;
  }

  private function notifyLeaveGroup() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : NotifyLeaveGroup_args = new NotifyLeaveGroup_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : NotifyLeaveGroup_result = new NotifyLeaveGroup_result();
      try {
        BotService_iface_.notifyLeaveGroup(args.groupMid);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing notifyLeaveGroup", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing notifyLeaveGroup");
        oprot.writeMessageBegin(new TMessage("notifyLeaveGroup", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("notifyLeaveGroup", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function notifyLeaveRoom() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : NotifyLeaveRoom_args = new NotifyLeaveRoom_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : NotifyLeaveRoom_result = new NotifyLeaveRoom_result();
      try {
        BotService_iface_.notifyLeaveRoom(args.roomMid);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing notifyLeaveRoom", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing notifyLeaveRoom");
        oprot.writeMessageBegin(new TMessage("notifyLeaveRoom", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("notifyLeaveRoom", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getBotUseInfo() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetBotUseInfo_args = new GetBotUseInfo_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetBotUseInfo_result = new GetBotUseInfo_result();
      try {
        result.success = BotService_iface_.getBotUseInfo(args.botMid);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getBotUseInfo", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getBotUseInfo");
        oprot.writeMessageBegin(new TMessage("getBotUseInfo", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getBotUseInfo", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function sendChatCheckedByWatermark() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : SendChatCheckedByWatermark_args = new SendChatCheckedByWatermark_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : SendChatCheckedByWatermark_result = new SendChatCheckedByWatermark_result();
      try {
        BotService_iface_.sendChatCheckedByWatermark(args.seq, args.mid, args.watermark, args.sessionId);
      } catch (e:TalkException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing sendChatCheckedByWatermark", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing sendChatCheckedByWatermark");
        oprot.writeMessageBegin(new TMessage("sendChatCheckedByWatermark", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("sendChatCheckedByWatermark", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

}

