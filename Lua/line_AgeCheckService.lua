--
-- Autogenerated by Thrift
--
-- DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
-- @generated
--


require 'Thrift'
require 'line_ttypes'

AgeCheckServiceClient = __TObject.new(__TClient, {
  __type = 'AgeCheckServiceClient'
})

function AgeCheckServiceClient:checkUserAge(carrier, sessionId, verifier, standardAge)
  self:send_checkUserAge(carrier, sessionId, verifier, standardAge)
  return self:recv_checkUserAge(carrier, sessionId, verifier, standardAge)
end

function AgeCheckServiceClient:send_checkUserAge(carrier, sessionId, verifier, standardAge)
  self.oprot:writeMessageBegin('checkUserAge', TMessageType.CALL, self._seqid)
  local args = checkUserAge_args:new{}
  args.carrier = carrier
  args.sessionId = sessionId
  args.verifier = verifier
  args.standardAge = standardAge
  args:write(self.oprot)
  self.oprot:writeMessageEnd()
  self.oprot.trans:flush()
end

function AgeCheckServiceClient:recv_checkUserAge(carrier, sessionId, verifier, standardAge)
  local fname, mtype, rseqid = self.iprot:readMessageBegin()
  if mtype == TMessageType.EXCEPTION then
    local x = TApplicationException:new{}
    x:read(self.iprot)
    self.iprot:readMessageEnd()
    error(x)
  end
  local result = checkUserAge_result:new{}
  result:read(self.iprot)
  self.iprot:readMessageEnd()
  if result.success ~= nil then
    return result.success
  elseif result.e then
    error(result.e)
  end
  error(TApplicationException:new{errorCode = TApplicationException.MISSING_RESULT})
end

function AgeCheckServiceClient:checkUserAgeWithDocomo(openIdRedirectUrl, standardAge, verifier)
  self:send_checkUserAgeWithDocomo(openIdRedirectUrl, standardAge, verifier)
  return self:recv_checkUserAgeWithDocomo(openIdRedirectUrl, standardAge, verifier)
end

function AgeCheckServiceClient:send_checkUserAgeWithDocomo(openIdRedirectUrl, standardAge, verifier)
  self.oprot:writeMessageBegin('checkUserAgeWithDocomo', TMessageType.CALL, self._seqid)
  local args = checkUserAgeWithDocomo_args:new{}
  args.openIdRedirectUrl = openIdRedirectUrl
  args.standardAge = standardAge
  args.verifier = verifier
  args:write(self.oprot)
  self.oprot:writeMessageEnd()
  self.oprot.trans:flush()
end

function AgeCheckServiceClient:recv_checkUserAgeWithDocomo(openIdRedirectUrl, standardAge, verifier)
  local fname, mtype, rseqid = self.iprot:readMessageBegin()
  if mtype == TMessageType.EXCEPTION then
    local x = TApplicationException:new{}
    x:read(self.iprot)
    self.iprot:readMessageEnd()
    error(x)
  end
  local result = checkUserAgeWithDocomo_result:new{}
  result:read(self.iprot)
  self.iprot:readMessageEnd()
  if result.success ~= nil then
    return result.success
  elseif result.e then
    error(result.e)
  end
  error(TApplicationException:new{errorCode = TApplicationException.MISSING_RESULT})
end

function AgeCheckServiceClient:retrieveOpenIdAuthUrlWithDocomo()
  self:send_retrieveOpenIdAuthUrlWithDocomo()
  return self:recv_retrieveOpenIdAuthUrlWithDocomo()
end

function AgeCheckServiceClient:send_retrieveOpenIdAuthUrlWithDocomo()
  self.oprot:writeMessageBegin('retrieveOpenIdAuthUrlWithDocomo', TMessageType.CALL, self._seqid)
  local args = retrieveOpenIdAuthUrlWithDocomo_args:new{}
  args:write(self.oprot)
  self.oprot:writeMessageEnd()
  self.oprot.trans:flush()
end

function AgeCheckServiceClient:recv_retrieveOpenIdAuthUrlWithDocomo()
  local fname, mtype, rseqid = self.iprot:readMessageBegin()
  if mtype == TMessageType.EXCEPTION then
    local x = TApplicationException:new{}
    x:read(self.iprot)
    self.iprot:readMessageEnd()
    error(x)
  end
  local result = retrieveOpenIdAuthUrlWithDocomo_result:new{}
  result:read(self.iprot)
  self.iprot:readMessageEnd()
  if result.success ~= nil then
    return result.success
  elseif result.e then
    error(result.e)
  end
  error(TApplicationException:new{errorCode = TApplicationException.MISSING_RESULT})
end

function AgeCheckServiceClient:retrieveRequestToken(carrier)
  self:send_retrieveRequestToken(carrier)
  return self:recv_retrieveRequestToken(carrier)
end

function AgeCheckServiceClient:send_retrieveRequestToken(carrier)
  self.oprot:writeMessageBegin('retrieveRequestToken', TMessageType.CALL, self._seqid)
  local args = retrieveRequestToken_args:new{}
  args.carrier = carrier
  args:write(self.oprot)
  self.oprot:writeMessageEnd()
  self.oprot.trans:flush()
end

function AgeCheckServiceClient:recv_retrieveRequestToken(carrier)
  local fname, mtype, rseqid = self.iprot:readMessageBegin()
  if mtype == TMessageType.EXCEPTION then
    local x = TApplicationException:new{}
    x:read(self.iprot)
    self.iprot:readMessageEnd()
    error(x)
  end
  local result = retrieveRequestToken_result:new{}
  result:read(self.iprot)
  self.iprot:readMessageEnd()
  if result.success ~= nil then
    return result.success
  elseif result.e then
    error(result.e)
  end
  error(TApplicationException:new{errorCode = TApplicationException.MISSING_RESULT})
end
AgeCheckServiceIface = __TObject:new{
  __type = 'AgeCheckServiceIface'
}


AgeCheckServiceProcessor = __TObject.new(__TProcessor
, {
 __type = 'AgeCheckServiceProcessor'
})

function AgeCheckServiceProcessor:process(iprot, oprot, server_ctx)
  local name, mtype, seqid = iprot:readMessageBegin()
  local func_name = 'process_' .. name
  if not self[func_name] or ttype(self[func_name]) ~= 'function' then
    iprot:skip(TType.STRUCT)
    iprot:readMessageEnd()
    x = TApplicationException:new{
      errorCode = TApplicationException.UNKNOWN_METHOD
    }
    oprot:writeMessageBegin(name, TMessageType.EXCEPTION, seqid)
    x:write(oprot)
    oprot:writeMessageEnd()
    oprot.trans:flush()
  else
    self[func_name](self, seqid, iprot, oprot, server_ctx)
  end
end

function AgeCheckServiceProcessor:process_checkUserAge(seqid, iprot, oprot, server_ctx)
  local args = checkUserAge_args:new{}
  local reply_type = TMessageType.REPLY
  args:read(iprot)
  iprot:readMessageEnd()
  local result = checkUserAge_result:new{}
  local status, res = pcall(self.handler.checkUserAge, self.handler, args.carrier, args.sessionId, args.verifier, args.standardAge)
  if not status then
    reply_type = TMessageType.EXCEPTION
    result = TApplicationException:new{message = res}
  elseif ttype(res) == 'TalkException' then
    result.e = res
  else
    result.success = res
  end
  oprot:writeMessageBegin('checkUserAge', reply_type, seqid)
  result:write(oprot)
  oprot:writeMessageEnd()
  oprot.trans:flush()
end

function AgeCheckServiceProcessor:process_checkUserAgeWithDocomo(seqid, iprot, oprot, server_ctx)
  local args = checkUserAgeWithDocomo_args:new{}
  local reply_type = TMessageType.REPLY
  args:read(iprot)
  iprot:readMessageEnd()
  local result = checkUserAgeWithDocomo_result:new{}
  local status, res = pcall(self.handler.checkUserAgeWithDocomo, self.handler, args.openIdRedirectUrl, args.standardAge, args.verifier)
  if not status then
    reply_type = TMessageType.EXCEPTION
    result = TApplicationException:new{message = res}
  elseif ttype(res) == 'TalkException' then
    result.e = res
  else
    result.success = res
  end
  oprot:writeMessageBegin('checkUserAgeWithDocomo', reply_type, seqid)
  result:write(oprot)
  oprot:writeMessageEnd()
  oprot.trans:flush()
end

function AgeCheckServiceProcessor:process_retrieveOpenIdAuthUrlWithDocomo(seqid, iprot, oprot, server_ctx)
  local args = retrieveOpenIdAuthUrlWithDocomo_args:new{}
  local reply_type = TMessageType.REPLY
  args:read(iprot)
  iprot:readMessageEnd()
  local result = retrieveOpenIdAuthUrlWithDocomo_result:new{}
  local status, res = pcall(self.handler.retrieveOpenIdAuthUrlWithDocomo, self.handler)
  if not status then
    reply_type = TMessageType.EXCEPTION
    result = TApplicationException:new{message = res}
  elseif ttype(res) == 'TalkException' then
    result.e = res
  else
    result.success = res
  end
  oprot:writeMessageBegin('retrieveOpenIdAuthUrlWithDocomo', reply_type, seqid)
  result:write(oprot)
  oprot:writeMessageEnd()
  oprot.trans:flush()
end

function AgeCheckServiceProcessor:process_retrieveRequestToken(seqid, iprot, oprot, server_ctx)
  local args = retrieveRequestToken_args:new{}
  local reply_type = TMessageType.REPLY
  args:read(iprot)
  iprot:readMessageEnd()
  local result = retrieveRequestToken_result:new{}
  local status, res = pcall(self.handler.retrieveRequestToken, self.handler, args.carrier)
  if not status then
    reply_type = TMessageType.EXCEPTION
    result = TApplicationException:new{message = res}
  elseif ttype(res) == 'TalkException' then
    result.e = res
  else
    result.success = res
  end
  oprot:writeMessageBegin('retrieveRequestToken', reply_type, seqid)
  result:write(oprot)
  oprot:writeMessageEnd()
  oprot.trans:flush()
end

-- HELPER FUNCTIONS AND STRUCTURES

checkUserAge_args = __TObject:new{
  carrier,
  sessionId,
  verifier,
  standardAge
}

function checkUserAge_args:read(iprot)
  iprot:readStructBegin()
  while true do
    local fname, ftype, fid = iprot:readFieldBegin()
    if ftype == TType.STOP then
      break
    elseif fid == 2 then
      if ftype == TType.I32 then
        self.carrier = iprot:readI32()
      else
        iprot:skip(ftype)
      end
    elseif fid == 3 then
      if ftype == TType.STRING then
        self.sessionId = iprot:readString()
      else
        iprot:skip(ftype)
      end
    elseif fid == 4 then
      if ftype == TType.STRING then
        self.verifier = iprot:readString()
      else
        iprot:skip(ftype)
      end
    elseif fid == 5 then
      if ftype == TType.I32 then
        self.standardAge = iprot:readI32()
      else
        iprot:skip(ftype)
      end
    else
      iprot:skip(ftype)
    end
    iprot:readFieldEnd()
  end
  iprot:readStructEnd()
end

function checkUserAge_args:write(oprot)
  oprot:writeStructBegin('checkUserAge_args')
  if self.carrier ~= nil then
    oprot:writeFieldBegin('carrier', TType.I32, 2)
    oprot:writeI32(self.carrier)
    oprot:writeFieldEnd()
  end
  if self.sessionId ~= nil then
    oprot:writeFieldBegin('sessionId', TType.STRING, 3)
    oprot:writeString(self.sessionId)
    oprot:writeFieldEnd()
  end
  if self.verifier ~= nil then
    oprot:writeFieldBegin('verifier', TType.STRING, 4)
    oprot:writeString(self.verifier)
    oprot:writeFieldEnd()
  end
  if self.standardAge ~= nil then
    oprot:writeFieldBegin('standardAge', TType.I32, 5)
    oprot:writeI32(self.standardAge)
    oprot:writeFieldEnd()
  end
  oprot:writeFieldStop()
  oprot:writeStructEnd()
end

checkUserAge_result = __TObject:new{
  success,
  e
}

function checkUserAge_result:read(iprot)
  iprot:readStructBegin()
  while true do
    local fname, ftype, fid = iprot:readFieldBegin()
    if ftype == TType.STOP then
      break
    elseif fid == 0 then
      if ftype == TType.I32 then
        self.success = iprot:readI32()
      else
        iprot:skip(ftype)
      end
    elseif fid == 1 then
      if ftype == TType.STRUCT then
        self.e = TalkException:new{}
        self.e:read(iprot)
      else
        iprot:skip(ftype)
      end
    else
      iprot:skip(ftype)
    end
    iprot:readFieldEnd()
  end
  iprot:readStructEnd()
end

function checkUserAge_result:write(oprot)
  oprot:writeStructBegin('checkUserAge_result')
  if self.success ~= nil then
    oprot:writeFieldBegin('success', TType.I32, 0)
    oprot:writeI32(self.success)
    oprot:writeFieldEnd()
  end
  if self.e ~= nil then
    oprot:writeFieldBegin('e', TType.STRUCT, 1)
    self.e:write(oprot)
    oprot:writeFieldEnd()
  end
  oprot:writeFieldStop()
  oprot:writeStructEnd()
end

checkUserAgeWithDocomo_args = __TObject:new{
  openIdRedirectUrl,
  standardAge,
  verifier
}

function checkUserAgeWithDocomo_args:read(iprot)
  iprot:readStructBegin()
  while true do
    local fname, ftype, fid = iprot:readFieldBegin()
    if ftype == TType.STOP then
      break
    elseif fid == 2 then
      if ftype == TType.STRING then
        self.openIdRedirectUrl = iprot:readString()
      else
        iprot:skip(ftype)
      end
    elseif fid == 3 then
      if ftype == TType.I32 then
        self.standardAge = iprot:readI32()
      else
        iprot:skip(ftype)
      end
    elseif fid == 4 then
      if ftype == TType.STRING then
        self.verifier = iprot:readString()
      else
        iprot:skip(ftype)
      end
    else
      iprot:skip(ftype)
    end
    iprot:readFieldEnd()
  end
  iprot:readStructEnd()
end

function checkUserAgeWithDocomo_args:write(oprot)
  oprot:writeStructBegin('checkUserAgeWithDocomo_args')
  if self.openIdRedirectUrl ~= nil then
    oprot:writeFieldBegin('openIdRedirectUrl', TType.STRING, 2)
    oprot:writeString(self.openIdRedirectUrl)
    oprot:writeFieldEnd()
  end
  if self.standardAge ~= nil then
    oprot:writeFieldBegin('standardAge', TType.I32, 3)
    oprot:writeI32(self.standardAge)
    oprot:writeFieldEnd()
  end
  if self.verifier ~= nil then
    oprot:writeFieldBegin('verifier', TType.STRING, 4)
    oprot:writeString(self.verifier)
    oprot:writeFieldEnd()
  end
  oprot:writeFieldStop()
  oprot:writeStructEnd()
end

checkUserAgeWithDocomo_result = __TObject:new{
  success,
  e
}

function checkUserAgeWithDocomo_result:read(iprot)
  iprot:readStructBegin()
  while true do
    local fname, ftype, fid = iprot:readFieldBegin()
    if ftype == TType.STOP then
      break
    elseif fid == 0 then
      if ftype == TType.STRUCT then
        self.success = AgeCheckDocomoResult:new{}
        self.success:read(iprot)
      else
        iprot:skip(ftype)
      end
    elseif fid == 1 then
      if ftype == TType.STRUCT then
        self.e = TalkException:new{}
        self.e:read(iprot)
      else
        iprot:skip(ftype)
      end
    else
      iprot:skip(ftype)
    end
    iprot:readFieldEnd()
  end
  iprot:readStructEnd()
end

function checkUserAgeWithDocomo_result:write(oprot)
  oprot:writeStructBegin('checkUserAgeWithDocomo_result')
  if self.success ~= nil then
    oprot:writeFieldBegin('success', TType.STRUCT, 0)
    self.success:write(oprot)
    oprot:writeFieldEnd()
  end
  if self.e ~= nil then
    oprot:writeFieldBegin('e', TType.STRUCT, 1)
    self.e:write(oprot)
    oprot:writeFieldEnd()
  end
  oprot:writeFieldStop()
  oprot:writeStructEnd()
end

retrieveOpenIdAuthUrlWithDocomo_args = __TObject:new{

}

function retrieveOpenIdAuthUrlWithDocomo_args:read(iprot)
  iprot:readStructBegin()
  while true do
    local fname, ftype, fid = iprot:readFieldBegin()
    if ftype == TType.STOP then
      break
    else
      iprot:skip(ftype)
    end
    iprot:readFieldEnd()
  end
  iprot:readStructEnd()
end

function retrieveOpenIdAuthUrlWithDocomo_args:write(oprot)
  oprot:writeStructBegin('retrieveOpenIdAuthUrlWithDocomo_args')
  oprot:writeFieldStop()
  oprot:writeStructEnd()
end

retrieveOpenIdAuthUrlWithDocomo_result = __TObject:new{
  success,
  e
}

function retrieveOpenIdAuthUrlWithDocomo_result:read(iprot)
  iprot:readStructBegin()
  while true do
    local fname, ftype, fid = iprot:readFieldBegin()
    if ftype == TType.STOP then
      break
    elseif fid == 0 then
      if ftype == TType.STRING then
        self.success = iprot:readString()
      else
        iprot:skip(ftype)
      end
    elseif fid == 1 then
      if ftype == TType.STRUCT then
        self.e = TalkException:new{}
        self.e:read(iprot)
      else
        iprot:skip(ftype)
      end
    else
      iprot:skip(ftype)
    end
    iprot:readFieldEnd()
  end
  iprot:readStructEnd()
end

function retrieveOpenIdAuthUrlWithDocomo_result:write(oprot)
  oprot:writeStructBegin('retrieveOpenIdAuthUrlWithDocomo_result')
  if self.success ~= nil then
    oprot:writeFieldBegin('success', TType.STRING, 0)
    oprot:writeString(self.success)
    oprot:writeFieldEnd()
  end
  if self.e ~= nil then
    oprot:writeFieldBegin('e', TType.STRUCT, 1)
    self.e:write(oprot)
    oprot:writeFieldEnd()
  end
  oprot:writeFieldStop()
  oprot:writeStructEnd()
end

retrieveRequestToken_args = __TObject:new{
  carrier
}

function retrieveRequestToken_args:read(iprot)
  iprot:readStructBegin()
  while true do
    local fname, ftype, fid = iprot:readFieldBegin()
    if ftype == TType.STOP then
      break
    elseif fid == 2 then
      if ftype == TType.I32 then
        self.carrier = iprot:readI32()
      else
        iprot:skip(ftype)
      end
    else
      iprot:skip(ftype)
    end
    iprot:readFieldEnd()
  end
  iprot:readStructEnd()
end

function retrieveRequestToken_args:write(oprot)
  oprot:writeStructBegin('retrieveRequestToken_args')
  if self.carrier ~= nil then
    oprot:writeFieldBegin('carrier', TType.I32, 2)
    oprot:writeI32(self.carrier)
    oprot:writeFieldEnd()
  end
  oprot:writeFieldStop()
  oprot:writeStructEnd()
end

retrieveRequestToken_result = __TObject:new{
  success,
  e
}

function retrieveRequestToken_result:read(iprot)
  iprot:readStructBegin()
  while true do
    local fname, ftype, fid = iprot:readFieldBegin()
    if ftype == TType.STOP then
      break
    elseif fid == 0 then
      if ftype == TType.STRUCT then
        self.success = AgeCheckRequestResult:new{}
        self.success:read(iprot)
      else
        iprot:skip(ftype)
      end
    elseif fid == 1 then
      if ftype == TType.STRUCT then
        self.e = TalkException:new{}
        self.e:read(iprot)
      else
        iprot:skip(ftype)
      end
    else
      iprot:skip(ftype)
    end
    iprot:readFieldEnd()
  end
  iprot:readStructEnd()
end

function retrieveRequestToken_result:write(oprot)
  oprot:writeStructBegin('retrieveRequestToken_result')
  if self.success ~= nil then
    oprot:writeFieldBegin('success', TType.STRUCT, 0)
    self.success:write(oprot)
    oprot:writeFieldEnd()
  end
  if self.e ~= nil then
    oprot:writeFieldBegin('e', TType.STRUCT, 1)
    self.e:write(oprot)
    oprot:writeFieldEnd()
  end
  oprot:writeFieldStop()
  oprot:writeStructEnd()
end