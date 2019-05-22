{-# LANGUAGE DeriveDataTypeable #-}
{-# LANGUAGE DeriveGeneric #-}
{-# LANGUAGE OverloadedStrings #-}
{-# OPTIONS_GHC -fno-warn-missing-fields #-}
{-# OPTIONS_GHC -fno-warn-missing-signatures #-}
{-# OPTIONS_GHC -fno-warn-name-shadowing #-}
{-# OPTIONS_GHC -fno-warn-unused-imports #-}
{-# OPTIONS_GHC -fno-warn-unused-matches #-}

-----------------------------------------------------------------
-- Autogenerated by Thrift Compiler (0.11.0)                      --
--                                                             --
-- DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING --
-----------------------------------------------------------------

module ChannelService_Client(issueOTP,approveChannelAndIssueChannelToken,approveChannelAndIssueRequestToken,fetchNotificationItems,getApprovedChannels,getChannelInfo,getChannelNotificationSetting,getChannelNotificationSettings,getChannels,getDomains,getFriendChannelMatrices,updateChannelSettings,getCommonDomains,getNotificationBadgeCount,issueChannelToken,issueRequestToken,issueRequestTokenWithAuthScheme,issueRequestTokenForAutoLogin,getUpdatedChannelIds,reserveCoinUse,revokeChannel,syncChannelData,updateChannelNotificationSetting) where
import qualified Data.IORef as R
import Prelude (($), (.), (>>=), (==), (++))
import qualified Prelude as P
import qualified Control.Exception as X
import qualified Control.Monad as M ( liftM, ap, when )
import Data.Functor ( (<$>) )
import qualified Data.ByteString.Lazy as LBS
import qualified Data.Hashable as H
import qualified Data.Int as I
import qualified Data.Maybe as M (catMaybes)
import qualified Data.Text.Lazy.Encoding as E ( decodeUtf8, encodeUtf8 )
import qualified Data.Text.Lazy as LT
import qualified GHC.Generics as G (Generic)
import qualified Data.Typeable as TY ( Typeable )
import qualified Data.HashMap.Strict as Map
import qualified Data.HashSet as Set
import qualified Data.Vector as Vector
import qualified Test.QuickCheck.Arbitrary as QC ( Arbitrary(..) )
import qualified Test.QuickCheck as QC ( elements )

import qualified Thrift as T
import qualified Thrift.Types as T
import qualified Thrift.Arbitraries as T


import Line_Types
import ChannelService
seqid = R.newIORef 0
issueOTP (ip,op) arg_channelId = do
  send_issueOTP op arg_channelId
  recv_issueOTP ip
send_issueOTP op arg_channelId = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("issueOTP", T.M_CALL, seqn) $
    write_IssueOTP_args op (IssueOTP_args{issueOTP_args_channelId=arg_channelId})
recv_issueOTP ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_IssueOTP_result ip
    P.maybe (P.return ()) X.throw (issueOTP_result_e res)
    P.return $ issueOTP_result_success res
approveChannelAndIssueChannelToken (ip,op) arg_channelId = do
  send_approveChannelAndIssueChannelToken op arg_channelId
  recv_approveChannelAndIssueChannelToken ip
send_approveChannelAndIssueChannelToken op arg_channelId = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("approveChannelAndIssueChannelToken", T.M_CALL, seqn) $
    write_ApproveChannelAndIssueChannelToken_args op (ApproveChannelAndIssueChannelToken_args{approveChannelAndIssueChannelToken_args_channelId=arg_channelId})
recv_approveChannelAndIssueChannelToken ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_ApproveChannelAndIssueChannelToken_result ip
    P.maybe (P.return ()) X.throw (approveChannelAndIssueChannelToken_result_e res)
    P.return $ approveChannelAndIssueChannelToken_result_success res
approveChannelAndIssueRequestToken (ip,op) arg_channelId arg_otpId = do
  send_approveChannelAndIssueRequestToken op arg_channelId arg_otpId
  recv_approveChannelAndIssueRequestToken ip
send_approveChannelAndIssueRequestToken op arg_channelId arg_otpId = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("approveChannelAndIssueRequestToken", T.M_CALL, seqn) $
    write_ApproveChannelAndIssueRequestToken_args op (ApproveChannelAndIssueRequestToken_args{approveChannelAndIssueRequestToken_args_channelId=arg_channelId,approveChannelAndIssueRequestToken_args_otpId=arg_otpId})
recv_approveChannelAndIssueRequestToken ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_ApproveChannelAndIssueRequestToken_result ip
    P.maybe (P.return ()) X.throw (approveChannelAndIssueRequestToken_result_e res)
    P.return $ approveChannelAndIssueRequestToken_result_success res
fetchNotificationItems (ip,op) arg_localRev = do
  send_fetchNotificationItems op arg_localRev
  recv_fetchNotificationItems ip
send_fetchNotificationItems op arg_localRev = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("fetchNotificationItems", T.M_CALL, seqn) $
    write_FetchNotificationItems_args op (FetchNotificationItems_args{fetchNotificationItems_args_localRev=arg_localRev})
recv_fetchNotificationItems ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_FetchNotificationItems_result ip
    P.maybe (P.return ()) X.throw (fetchNotificationItems_result_e res)
    P.return $ fetchNotificationItems_result_success res
getApprovedChannels (ip,op) arg_lastSynced arg_locale = do
  send_getApprovedChannels op arg_lastSynced arg_locale
  recv_getApprovedChannels ip
send_getApprovedChannels op arg_lastSynced arg_locale = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getApprovedChannels", T.M_CALL, seqn) $
    write_GetApprovedChannels_args op (GetApprovedChannels_args{getApprovedChannels_args_lastSynced=arg_lastSynced,getApprovedChannels_args_locale=arg_locale})
recv_getApprovedChannels ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetApprovedChannels_result ip
    P.maybe (P.return ()) X.throw (getApprovedChannels_result_e res)
    P.return $ getApprovedChannels_result_success res
getChannelInfo (ip,op) arg_channelId arg_locale = do
  send_getChannelInfo op arg_channelId arg_locale
  recv_getChannelInfo ip
send_getChannelInfo op arg_channelId arg_locale = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getChannelInfo", T.M_CALL, seqn) $
    write_GetChannelInfo_args op (GetChannelInfo_args{getChannelInfo_args_channelId=arg_channelId,getChannelInfo_args_locale=arg_locale})
recv_getChannelInfo ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetChannelInfo_result ip
    P.maybe (P.return ()) X.throw (getChannelInfo_result_e res)
    P.return $ getChannelInfo_result_success res
getChannelNotificationSetting (ip,op) arg_channelId arg_locale = do
  send_getChannelNotificationSetting op arg_channelId arg_locale
  recv_getChannelNotificationSetting ip
send_getChannelNotificationSetting op arg_channelId arg_locale = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getChannelNotificationSetting", T.M_CALL, seqn) $
    write_GetChannelNotificationSetting_args op (GetChannelNotificationSetting_args{getChannelNotificationSetting_args_channelId=arg_channelId,getChannelNotificationSetting_args_locale=arg_locale})
recv_getChannelNotificationSetting ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetChannelNotificationSetting_result ip
    P.maybe (P.return ()) X.throw (getChannelNotificationSetting_result_e res)
    P.return $ getChannelNotificationSetting_result_success res
getChannelNotificationSettings (ip,op) arg_locale = do
  send_getChannelNotificationSettings op arg_locale
  recv_getChannelNotificationSettings ip
send_getChannelNotificationSettings op arg_locale = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getChannelNotificationSettings", T.M_CALL, seqn) $
    write_GetChannelNotificationSettings_args op (GetChannelNotificationSettings_args{getChannelNotificationSettings_args_locale=arg_locale})
recv_getChannelNotificationSettings ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetChannelNotificationSettings_result ip
    P.maybe (P.return ()) X.throw (getChannelNotificationSettings_result_e res)
    P.return $ getChannelNotificationSettings_result_success res
getChannels (ip,op) arg_lastSynced arg_locale = do
  send_getChannels op arg_lastSynced arg_locale
  recv_getChannels ip
send_getChannels op arg_lastSynced arg_locale = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getChannels", T.M_CALL, seqn) $
    write_GetChannels_args op (GetChannels_args{getChannels_args_lastSynced=arg_lastSynced,getChannels_args_locale=arg_locale})
recv_getChannels ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetChannels_result ip
    P.maybe (P.return ()) X.throw (getChannels_result_e res)
    P.return $ getChannels_result_success res
getDomains (ip,op) arg_lastSynced = do
  send_getDomains op arg_lastSynced
  recv_getDomains ip
send_getDomains op arg_lastSynced = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getDomains", T.M_CALL, seqn) $
    write_GetDomains_args op (GetDomains_args{getDomains_args_lastSynced=arg_lastSynced})
recv_getDomains ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetDomains_result ip
    P.maybe (P.return ()) X.throw (getDomains_result_e res)
    P.return $ getDomains_result_success res
getFriendChannelMatrices (ip,op) arg_channelIds = do
  send_getFriendChannelMatrices op arg_channelIds
  recv_getFriendChannelMatrices ip
send_getFriendChannelMatrices op arg_channelIds = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getFriendChannelMatrices", T.M_CALL, seqn) $
    write_GetFriendChannelMatrices_args op (GetFriendChannelMatrices_args{getFriendChannelMatrices_args_channelIds=arg_channelIds})
recv_getFriendChannelMatrices ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetFriendChannelMatrices_result ip
    P.maybe (P.return ()) X.throw (getFriendChannelMatrices_result_e res)
    P.return $ getFriendChannelMatrices_result_success res
updateChannelSettings (ip,op) arg_channelSettings = do
  send_updateChannelSettings op arg_channelSettings
  recv_updateChannelSettings ip
send_updateChannelSettings op arg_channelSettings = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("updateChannelSettings", T.M_CALL, seqn) $
    write_UpdateChannelSettings_args op (UpdateChannelSettings_args{updateChannelSettings_args_channelSettings=arg_channelSettings})
recv_updateChannelSettings ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_UpdateChannelSettings_result ip
    P.maybe (P.return ()) X.throw (updateChannelSettings_result_e res)
    P.return $ updateChannelSettings_result_success res
getCommonDomains (ip,op) arg_lastSynced = do
  send_getCommonDomains op arg_lastSynced
  recv_getCommonDomains ip
send_getCommonDomains op arg_lastSynced = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getCommonDomains", T.M_CALL, seqn) $
    write_GetCommonDomains_args op (GetCommonDomains_args{getCommonDomains_args_lastSynced=arg_lastSynced})
recv_getCommonDomains ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetCommonDomains_result ip
    P.maybe (P.return ()) X.throw (getCommonDomains_result_e res)
    P.return $ getCommonDomains_result_success res
getNotificationBadgeCount (ip,op) arg_localRev = do
  send_getNotificationBadgeCount op arg_localRev
  recv_getNotificationBadgeCount ip
send_getNotificationBadgeCount op arg_localRev = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getNotificationBadgeCount", T.M_CALL, seqn) $
    write_GetNotificationBadgeCount_args op (GetNotificationBadgeCount_args{getNotificationBadgeCount_args_localRev=arg_localRev})
recv_getNotificationBadgeCount ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetNotificationBadgeCount_result ip
    P.maybe (P.return ()) X.throw (getNotificationBadgeCount_result_e res)
    P.return $ getNotificationBadgeCount_result_success res
issueChannelToken (ip,op) arg_channelId = do
  send_issueChannelToken op arg_channelId
  recv_issueChannelToken ip
send_issueChannelToken op arg_channelId = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("issueChannelToken", T.M_CALL, seqn) $
    write_IssueChannelToken_args op (IssueChannelToken_args{issueChannelToken_args_channelId=arg_channelId})
recv_issueChannelToken ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_IssueChannelToken_result ip
    P.maybe (P.return ()) X.throw (issueChannelToken_result_e res)
    P.return $ issueChannelToken_result_success res
issueRequestToken (ip,op) arg_channelId arg_otpId = do
  send_issueRequestToken op arg_channelId arg_otpId
  recv_issueRequestToken ip
send_issueRequestToken op arg_channelId arg_otpId = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("issueRequestToken", T.M_CALL, seqn) $
    write_IssueRequestToken_args op (IssueRequestToken_args{issueRequestToken_args_channelId=arg_channelId,issueRequestToken_args_otpId=arg_otpId})
recv_issueRequestToken ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_IssueRequestToken_result ip
    P.maybe (P.return ()) X.throw (issueRequestToken_result_e res)
    P.return $ issueRequestToken_result_success res
issueRequestTokenWithAuthScheme (ip,op) arg_channelId arg_otpId arg_authScheme arg_returnUrl = do
  send_issueRequestTokenWithAuthScheme op arg_channelId arg_otpId arg_authScheme arg_returnUrl
  recv_issueRequestTokenWithAuthScheme ip
send_issueRequestTokenWithAuthScheme op arg_channelId arg_otpId arg_authScheme arg_returnUrl = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("issueRequestTokenWithAuthScheme", T.M_CALL, seqn) $
    write_IssueRequestTokenWithAuthScheme_args op (IssueRequestTokenWithAuthScheme_args{issueRequestTokenWithAuthScheme_args_channelId=arg_channelId,issueRequestTokenWithAuthScheme_args_otpId=arg_otpId,issueRequestTokenWithAuthScheme_args_authScheme=arg_authScheme,issueRequestTokenWithAuthScheme_args_returnUrl=arg_returnUrl})
recv_issueRequestTokenWithAuthScheme ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_IssueRequestTokenWithAuthScheme_result ip
    P.maybe (P.return ()) X.throw (issueRequestTokenWithAuthScheme_result_e res)
    P.return $ issueRequestTokenWithAuthScheme_result_success res
issueRequestTokenForAutoLogin (ip,op) arg_channelId arg_otpId arg_redirectUrl = do
  send_issueRequestTokenForAutoLogin op arg_channelId arg_otpId arg_redirectUrl
  recv_issueRequestTokenForAutoLogin ip
send_issueRequestTokenForAutoLogin op arg_channelId arg_otpId arg_redirectUrl = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("issueRequestTokenForAutoLogin", T.M_CALL, seqn) $
    write_IssueRequestTokenForAutoLogin_args op (IssueRequestTokenForAutoLogin_args{issueRequestTokenForAutoLogin_args_channelId=arg_channelId,issueRequestTokenForAutoLogin_args_otpId=arg_otpId,issueRequestTokenForAutoLogin_args_redirectUrl=arg_redirectUrl})
recv_issueRequestTokenForAutoLogin ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_IssueRequestTokenForAutoLogin_result ip
    P.maybe (P.return ()) X.throw (issueRequestTokenForAutoLogin_result_e res)
    P.return $ issueRequestTokenForAutoLogin_result_success res
getUpdatedChannelIds (ip,op) arg_channelIds = do
  send_getUpdatedChannelIds op arg_channelIds
  recv_getUpdatedChannelIds ip
send_getUpdatedChannelIds op arg_channelIds = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getUpdatedChannelIds", T.M_CALL, seqn) $
    write_GetUpdatedChannelIds_args op (GetUpdatedChannelIds_args{getUpdatedChannelIds_args_channelIds=arg_channelIds})
recv_getUpdatedChannelIds ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetUpdatedChannelIds_result ip
    P.maybe (P.return ()) X.throw (getUpdatedChannelIds_result_e res)
    P.return $ getUpdatedChannelIds_result_success res
reserveCoinUse (ip,op) arg_request arg_locale = do
  send_reserveCoinUse op arg_request arg_locale
  recv_reserveCoinUse ip
send_reserveCoinUse op arg_request arg_locale = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("reserveCoinUse", T.M_CALL, seqn) $
    write_ReserveCoinUse_args op (ReserveCoinUse_args{reserveCoinUse_args_request=arg_request,reserveCoinUse_args_locale=arg_locale})
recv_reserveCoinUse ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_ReserveCoinUse_result ip
    P.maybe (P.return ()) X.throw (reserveCoinUse_result_e res)
    P.return $ reserveCoinUse_result_success res
revokeChannel (ip,op) arg_channelId = do
  send_revokeChannel op arg_channelId
  recv_revokeChannel ip
send_revokeChannel op arg_channelId = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("revokeChannel", T.M_CALL, seqn) $
    write_RevokeChannel_args op (RevokeChannel_args{revokeChannel_args_channelId=arg_channelId})
recv_revokeChannel ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_RevokeChannel_result ip
    P.maybe (P.return ()) X.throw (revokeChannel_result_e res)
    P.return ()
syncChannelData (ip,op) arg_lastSynced arg_locale = do
  send_syncChannelData op arg_lastSynced arg_locale
  recv_syncChannelData ip
send_syncChannelData op arg_lastSynced arg_locale = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("syncChannelData", T.M_CALL, seqn) $
    write_SyncChannelData_args op (SyncChannelData_args{syncChannelData_args_lastSynced=arg_lastSynced,syncChannelData_args_locale=arg_locale})
recv_syncChannelData ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_SyncChannelData_result ip
    P.maybe (P.return ()) X.throw (syncChannelData_result_e res)
    P.return $ syncChannelData_result_success res
updateChannelNotificationSetting (ip,op) arg_setting = do
  send_updateChannelNotificationSetting op arg_setting
  recv_updateChannelNotificationSetting ip
send_updateChannelNotificationSetting op arg_setting = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("updateChannelNotificationSetting", T.M_CALL, seqn) $
    write_UpdateChannelNotificationSetting_args op (UpdateChannelNotificationSetting_args{updateChannelNotificationSetting_args_setting=arg_setting})
recv_updateChannelNotificationSetting ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_UpdateChannelNotificationSetting_result ip
    P.maybe (P.return ()) X.throw (updateChannelNotificationSetting_result_e res)
    P.return ()