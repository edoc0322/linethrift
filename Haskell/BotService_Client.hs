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

module BotService_Client(notifyLeaveGroup,notifyLeaveRoom,getBotUseInfo,sendChatCheckedByWatermark) where
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
import BotService
seqid = R.newIORef 0
notifyLeaveGroup (ip,op) arg_groupMid = do
  send_notifyLeaveGroup op arg_groupMid
  recv_notifyLeaveGroup ip
send_notifyLeaveGroup op arg_groupMid = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("notifyLeaveGroup", T.M_CALL, seqn) $
    write_NotifyLeaveGroup_args op (NotifyLeaveGroup_args{notifyLeaveGroup_args_groupMid=arg_groupMid})
recv_notifyLeaveGroup ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_NotifyLeaveGroup_result ip
    P.maybe (P.return ()) X.throw (notifyLeaveGroup_result_e res)
    P.return ()
notifyLeaveRoom (ip,op) arg_roomMid = do
  send_notifyLeaveRoom op arg_roomMid
  recv_notifyLeaveRoom ip
send_notifyLeaveRoom op arg_roomMid = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("notifyLeaveRoom", T.M_CALL, seqn) $
    write_NotifyLeaveRoom_args op (NotifyLeaveRoom_args{notifyLeaveRoom_args_roomMid=arg_roomMid})
recv_notifyLeaveRoom ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_NotifyLeaveRoom_result ip
    P.maybe (P.return ()) X.throw (notifyLeaveRoom_result_e res)
    P.return ()
getBotUseInfo (ip,op) arg_botMid = do
  send_getBotUseInfo op arg_botMid
  recv_getBotUseInfo ip
send_getBotUseInfo op arg_botMid = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("getBotUseInfo", T.M_CALL, seqn) $
    write_GetBotUseInfo_args op (GetBotUseInfo_args{getBotUseInfo_args_botMid=arg_botMid})
recv_getBotUseInfo ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_GetBotUseInfo_result ip
    P.maybe (P.return ()) X.throw (getBotUseInfo_result_e res)
    P.return $ getBotUseInfo_result_success res
sendChatCheckedByWatermark (ip,op) arg_seq arg_mid arg_watermark arg_sessionId = do
  send_sendChatCheckedByWatermark op arg_seq arg_mid arg_watermark arg_sessionId
  recv_sendChatCheckedByWatermark ip
send_sendChatCheckedByWatermark op arg_seq arg_mid arg_watermark arg_sessionId = do
  seq <- seqid
  seqn <- R.readIORef seq
  T.writeMessage op ("sendChatCheckedByWatermark", T.M_CALL, seqn) $
    write_SendChatCheckedByWatermark_args op (SendChatCheckedByWatermark_args{sendChatCheckedByWatermark_args_seq=arg_seq,sendChatCheckedByWatermark_args_mid=arg_mid,sendChatCheckedByWatermark_args_watermark=arg_watermark,sendChatCheckedByWatermark_args_sessionId=arg_sessionId})
recv_sendChatCheckedByWatermark ip = do
  T.readMessage ip $ \(fname, mtype, rseqid) -> do
    M.when (mtype == T.M_EXCEPTION) $ do { exn <- T.readAppExn ip ; X.throw exn }
    res <- read_SendChatCheckedByWatermark_result ip
    P.maybe (P.return ()) X.throw (sendChatCheckedByWatermark_result_e res)
    P.return ()
