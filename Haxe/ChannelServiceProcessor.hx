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


class ChannelServiceProcessor implements TProcessor {

  private var ChannelService_iface_ : ChannelService;
  private var PROCESS_MAP = new StringMap< Int->TProtocol->TProtocol->Void >();

  public function new( iface : ChannelService)
  {
    ChannelService_iface_ = iface;
    PROCESS_MAP.set("issueOTP", issueOTP());
    PROCESS_MAP.set("approveChannelAndIssueChannelToken", approveChannelAndIssueChannelToken());
    PROCESS_MAP.set("approveChannelAndIssueRequestToken", approveChannelAndIssueRequestToken());
    PROCESS_MAP.set("fetchNotificationItems", fetchNotificationItems());
    PROCESS_MAP.set("getApprovedChannels", getApprovedChannels());
    PROCESS_MAP.set("getChannelInfo", getChannelInfo());
    PROCESS_MAP.set("getChannelNotificationSetting", getChannelNotificationSetting());
    PROCESS_MAP.set("getChannelNotificationSettings", getChannelNotificationSettings());
    PROCESS_MAP.set("getChannels", getChannels());
    PROCESS_MAP.set("getDomains", getDomains());
    PROCESS_MAP.set("getFriendChannelMatrices", getFriendChannelMatrices());
    PROCESS_MAP.set("updateChannelSettings", updateChannelSettings());
    PROCESS_MAP.set("getCommonDomains", getCommonDomains());
    PROCESS_MAP.set("getNotificationBadgeCount", getNotificationBadgeCount());
    PROCESS_MAP.set("issueChannelToken", issueChannelToken());
    PROCESS_MAP.set("issueRequestToken", issueRequestToken());
    PROCESS_MAP.set("issueRequestTokenWithAuthScheme", issueRequestTokenWithAuthScheme());
    PROCESS_MAP.set("issueRequestTokenForAutoLogin", issueRequestTokenForAutoLogin());
    PROCESS_MAP.set("getUpdatedChannelIds", getUpdatedChannelIds());
    PROCESS_MAP.set("reserveCoinUse", reserveCoinUse());
    PROCESS_MAP.set("revokeChannel", revokeChannel());
    PROCESS_MAP.set("syncChannelData", syncChannelData());
    PROCESS_MAP.set("updateChannelNotificationSetting", updateChannelNotificationSetting());
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

  private function issueOTP() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : IssueOTP_args = new IssueOTP_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : IssueOTP_result = new IssueOTP_result();
      try {
        result.success = ChannelService_iface_.issueOTP(args.channelId);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing issueOTP", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing issueOTP");
        oprot.writeMessageBegin(new TMessage("issueOTP", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("issueOTP", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function approveChannelAndIssueChannelToken() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : ApproveChannelAndIssueChannelToken_args = new ApproveChannelAndIssueChannelToken_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : ApproveChannelAndIssueChannelToken_result = new ApproveChannelAndIssueChannelToken_result();
      try {
        result.success = ChannelService_iface_.approveChannelAndIssueChannelToken(args.channelId);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing approveChannelAndIssueChannelToken", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing approveChannelAndIssueChannelToken");
        oprot.writeMessageBegin(new TMessage("approveChannelAndIssueChannelToken", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("approveChannelAndIssueChannelToken", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function approveChannelAndIssueRequestToken() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : ApproveChannelAndIssueRequestToken_args = new ApproveChannelAndIssueRequestToken_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : ApproveChannelAndIssueRequestToken_result = new ApproveChannelAndIssueRequestToken_result();
      try {
        result.success = ChannelService_iface_.approveChannelAndIssueRequestToken(args.channelId, args.otpId);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing approveChannelAndIssueRequestToken", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing approveChannelAndIssueRequestToken");
        oprot.writeMessageBegin(new TMessage("approveChannelAndIssueRequestToken", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("approveChannelAndIssueRequestToken", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function fetchNotificationItems() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : FetchNotificationItems_args = new FetchNotificationItems_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : FetchNotificationItems_result = new FetchNotificationItems_result();
      try {
        result.success = ChannelService_iface_.fetchNotificationItems(args.localRev);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing fetchNotificationItems", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing fetchNotificationItems");
        oprot.writeMessageBegin(new TMessage("fetchNotificationItems", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("fetchNotificationItems", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getApprovedChannels() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetApprovedChannels_args = new GetApprovedChannels_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetApprovedChannels_result = new GetApprovedChannels_result();
      try {
        result.success = ChannelService_iface_.getApprovedChannels(args.lastSynced, args.locale);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getApprovedChannels", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getApprovedChannels");
        oprot.writeMessageBegin(new TMessage("getApprovedChannels", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getApprovedChannels", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getChannelInfo() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetChannelInfo_args = new GetChannelInfo_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetChannelInfo_result = new GetChannelInfo_result();
      try {
        result.success = ChannelService_iface_.getChannelInfo(args.channelId, args.locale);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getChannelInfo", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getChannelInfo");
        oprot.writeMessageBegin(new TMessage("getChannelInfo", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getChannelInfo", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getChannelNotificationSetting() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetChannelNotificationSetting_args = new GetChannelNotificationSetting_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetChannelNotificationSetting_result = new GetChannelNotificationSetting_result();
      try {
        result.success = ChannelService_iface_.getChannelNotificationSetting(args.channelId, args.locale);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getChannelNotificationSetting", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getChannelNotificationSetting");
        oprot.writeMessageBegin(new TMessage("getChannelNotificationSetting", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getChannelNotificationSetting", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getChannelNotificationSettings() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetChannelNotificationSettings_args = new GetChannelNotificationSettings_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetChannelNotificationSettings_result = new GetChannelNotificationSettings_result();
      try {
        result.success = ChannelService_iface_.getChannelNotificationSettings(args.locale);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getChannelNotificationSettings", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getChannelNotificationSettings");
        oprot.writeMessageBegin(new TMessage("getChannelNotificationSettings", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getChannelNotificationSettings", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getChannels() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetChannels_args = new GetChannels_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetChannels_result = new GetChannels_result();
      try {
        result.success = ChannelService_iface_.getChannels(args.lastSynced, args.locale);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getChannels", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getChannels");
        oprot.writeMessageBegin(new TMessage("getChannels", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getChannels", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getDomains() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetDomains_args = new GetDomains_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetDomains_result = new GetDomains_result();
      try {
        result.success = ChannelService_iface_.getDomains(args.lastSynced);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getDomains", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getDomains");
        oprot.writeMessageBegin(new TMessage("getDomains", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getDomains", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getFriendChannelMatrices() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetFriendChannelMatrices_args = new GetFriendChannelMatrices_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetFriendChannelMatrices_result = new GetFriendChannelMatrices_result();
      try {
        result.success = ChannelService_iface_.getFriendChannelMatrices(args.channelIds);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getFriendChannelMatrices", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getFriendChannelMatrices");
        oprot.writeMessageBegin(new TMessage("getFriendChannelMatrices", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getFriendChannelMatrices", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function updateChannelSettings() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : UpdateChannelSettings_args = new UpdateChannelSettings_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : UpdateChannelSettings_result = new UpdateChannelSettings_result();
      try {
        result.success = ChannelService_iface_.updateChannelSettings(args.channelSettings);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing updateChannelSettings", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing updateChannelSettings");
        oprot.writeMessageBegin(new TMessage("updateChannelSettings", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("updateChannelSettings", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getCommonDomains() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetCommonDomains_args = new GetCommonDomains_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetCommonDomains_result = new GetCommonDomains_result();
      try {
        result.success = ChannelService_iface_.getCommonDomains(args.lastSynced);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getCommonDomains", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getCommonDomains");
        oprot.writeMessageBegin(new TMessage("getCommonDomains", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getCommonDomains", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getNotificationBadgeCount() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetNotificationBadgeCount_args = new GetNotificationBadgeCount_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetNotificationBadgeCount_result = new GetNotificationBadgeCount_result();
      try {
        result.success = ChannelService_iface_.getNotificationBadgeCount(args.localRev);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getNotificationBadgeCount", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getNotificationBadgeCount");
        oprot.writeMessageBegin(new TMessage("getNotificationBadgeCount", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getNotificationBadgeCount", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function issueChannelToken() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : IssueChannelToken_args = new IssueChannelToken_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : IssueChannelToken_result = new IssueChannelToken_result();
      try {
        result.success = ChannelService_iface_.issueChannelToken(args.channelId);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing issueChannelToken", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing issueChannelToken");
        oprot.writeMessageBegin(new TMessage("issueChannelToken", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("issueChannelToken", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function issueRequestToken() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : IssueRequestToken_args = new IssueRequestToken_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : IssueRequestToken_result = new IssueRequestToken_result();
      try {
        result.success = ChannelService_iface_.issueRequestToken(args.channelId, args.otpId);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing issueRequestToken", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing issueRequestToken");
        oprot.writeMessageBegin(new TMessage("issueRequestToken", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("issueRequestToken", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function issueRequestTokenWithAuthScheme() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : IssueRequestTokenWithAuthScheme_args = new IssueRequestTokenWithAuthScheme_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : IssueRequestTokenWithAuthScheme_result = new IssueRequestTokenWithAuthScheme_result();
      try {
        result.success = ChannelService_iface_.issueRequestTokenWithAuthScheme(args.channelId, args.otpId, args.authScheme, args.returnUrl);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing issueRequestTokenWithAuthScheme", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing issueRequestTokenWithAuthScheme");
        oprot.writeMessageBegin(new TMessage("issueRequestTokenWithAuthScheme", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("issueRequestTokenWithAuthScheme", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function issueRequestTokenForAutoLogin() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : IssueRequestTokenForAutoLogin_args = new IssueRequestTokenForAutoLogin_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : IssueRequestTokenForAutoLogin_result = new IssueRequestTokenForAutoLogin_result();
      try {
        result.success = ChannelService_iface_.issueRequestTokenForAutoLogin(args.channelId, args.otpId, args.redirectUrl);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing issueRequestTokenForAutoLogin", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing issueRequestTokenForAutoLogin");
        oprot.writeMessageBegin(new TMessage("issueRequestTokenForAutoLogin", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("issueRequestTokenForAutoLogin", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function getUpdatedChannelIds() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : GetUpdatedChannelIds_args = new GetUpdatedChannelIds_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : GetUpdatedChannelIds_result = new GetUpdatedChannelIds_result();
      try {
        result.success = ChannelService_iface_.getUpdatedChannelIds(args.channelIds);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing getUpdatedChannelIds", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing getUpdatedChannelIds");
        oprot.writeMessageBegin(new TMessage("getUpdatedChannelIds", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("getUpdatedChannelIds", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function reserveCoinUse() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : ReserveCoinUse_args = new ReserveCoinUse_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : ReserveCoinUse_result = new ReserveCoinUse_result();
      try {
        result.success = ChannelService_iface_.reserveCoinUse(args.request, args.locale);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing reserveCoinUse", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing reserveCoinUse");
        oprot.writeMessageBegin(new TMessage("reserveCoinUse", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("reserveCoinUse", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function revokeChannel() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : RevokeChannel_args = new RevokeChannel_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : RevokeChannel_result = new RevokeChannel_result();
      try {
        ChannelService_iface_.revokeChannel(args.channelId);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing revokeChannel", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing revokeChannel");
        oprot.writeMessageBegin(new TMessage("revokeChannel", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("revokeChannel", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function syncChannelData() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : SyncChannelData_args = new SyncChannelData_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : SyncChannelData_result = new SyncChannelData_result();
      try {
        result.success = ChannelService_iface_.syncChannelData(args.lastSynced, args.locale);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing syncChannelData", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing syncChannelData");
        oprot.writeMessageBegin(new TMessage("syncChannelData", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("syncChannelData", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

  private function updateChannelNotificationSetting() : Int->TProtocol->TProtocol->Void {
    return function( seqid : Int, iprot : TProtocol, oprot : TProtocol) : Void
    {
      var args : UpdateChannelNotificationSetting_args = new UpdateChannelNotificationSetting_args();
      args.read(iprot);
      iprot.readMessageEnd();
      var result : UpdateChannelNotificationSetting_result = new UpdateChannelNotificationSetting_result();
      try {
        ChannelService_iface_.updateChannelNotificationSetting(args.setting);
      } catch (e:ChannelException) {
        result.e = e;
      } catch (th : Dynamic) {
        trace("Internal error processing updateChannelNotificationSetting", th);
        var x = new TApplicationException(TApplicationException.INTERNAL_ERROR, "Internal error processing updateChannelNotificationSetting");
        oprot.writeMessageBegin(new TMessage("updateChannelNotificationSetting", TMessageType.EXCEPTION, seqid));
        x.write(oprot);
        oprot.writeMessageEnd();
        oprot.getTransport().flush();
        return;
      }
      oprot.writeMessageBegin(new TMessage("updateChannelNotificationSetting", TMessageType.REPLY, seqid));
      result.write(oprot);
      oprot.writeMessageEnd();
      oprot.getTransport().flush();
    }

  }

}

