#
# Autogenerated by Thrift Compiler (0.11.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'line_types'

module AgeCheckService
  class Client
    include ::Thrift::Client

    def checkUserAge(carrier, sessionId, verifier, standardAge)
      send_checkUserAge(carrier, sessionId, verifier, standardAge)
      return recv_checkUserAge()
    end

    def send_checkUserAge(carrier, sessionId, verifier, standardAge)
      send_message('checkUserAge', CheckUserAge_args, :carrier => carrier, :sessionId => sessionId, :verifier => verifier, :standardAge => standardAge)
    end

    def recv_checkUserAge()
      result = receive_message(CheckUserAge_result)
      return result.success unless result.success.nil?
      raise result.e unless result.e.nil?
      raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'checkUserAge failed: unknown result')
    end

    def checkUserAgeWithDocomo(openIdRedirectUrl, standardAge, verifier)
      send_checkUserAgeWithDocomo(openIdRedirectUrl, standardAge, verifier)
      return recv_checkUserAgeWithDocomo()
    end

    def send_checkUserAgeWithDocomo(openIdRedirectUrl, standardAge, verifier)
      send_message('checkUserAgeWithDocomo', CheckUserAgeWithDocomo_args, :openIdRedirectUrl => openIdRedirectUrl, :standardAge => standardAge, :verifier => verifier)
    end

    def recv_checkUserAgeWithDocomo()
      result = receive_message(CheckUserAgeWithDocomo_result)
      return result.success unless result.success.nil?
      raise result.e unless result.e.nil?
      raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'checkUserAgeWithDocomo failed: unknown result')
    end

    def retrieveOpenIdAuthUrlWithDocomo()
      send_retrieveOpenIdAuthUrlWithDocomo()
      return recv_retrieveOpenIdAuthUrlWithDocomo()
    end

    def send_retrieveOpenIdAuthUrlWithDocomo()
      send_message('retrieveOpenIdAuthUrlWithDocomo', RetrieveOpenIdAuthUrlWithDocomo_args)
    end

    def recv_retrieveOpenIdAuthUrlWithDocomo()
      result = receive_message(RetrieveOpenIdAuthUrlWithDocomo_result)
      return result.success unless result.success.nil?
      raise result.e unless result.e.nil?
      raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'retrieveOpenIdAuthUrlWithDocomo failed: unknown result')
    end

    def retrieveRequestToken(carrier)
      send_retrieveRequestToken(carrier)
      return recv_retrieveRequestToken()
    end

    def send_retrieveRequestToken(carrier)
      send_message('retrieveRequestToken', RetrieveRequestToken_args, :carrier => carrier)
    end

    def recv_retrieveRequestToken()
      result = receive_message(RetrieveRequestToken_result)
      return result.success unless result.success.nil?
      raise result.e unless result.e.nil?
      raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'retrieveRequestToken failed: unknown result')
    end

  end

  class Processor
    include ::Thrift::Processor

    def process_checkUserAge(seqid, iprot, oprot)
      args = read_args(iprot, CheckUserAge_args)
      result = CheckUserAge_result.new()
      begin
        result.success = @handler.checkUserAge(args.carrier, args.sessionId, args.verifier, args.standardAge)
      rescue ::TalkException => e
        result.e = e
      end
      write_result(result, oprot, 'checkUserAge', seqid)
    end

    def process_checkUserAgeWithDocomo(seqid, iprot, oprot)
      args = read_args(iprot, CheckUserAgeWithDocomo_args)
      result = CheckUserAgeWithDocomo_result.new()
      begin
        result.success = @handler.checkUserAgeWithDocomo(args.openIdRedirectUrl, args.standardAge, args.verifier)
      rescue ::TalkException => e
        result.e = e
      end
      write_result(result, oprot, 'checkUserAgeWithDocomo', seqid)
    end

    def process_retrieveOpenIdAuthUrlWithDocomo(seqid, iprot, oprot)
      args = read_args(iprot, RetrieveOpenIdAuthUrlWithDocomo_args)
      result = RetrieveOpenIdAuthUrlWithDocomo_result.new()
      begin
        result.success = @handler.retrieveOpenIdAuthUrlWithDocomo()
      rescue ::TalkException => e
        result.e = e
      end
      write_result(result, oprot, 'retrieveOpenIdAuthUrlWithDocomo', seqid)
    end

    def process_retrieveRequestToken(seqid, iprot, oprot)
      args = read_args(iprot, RetrieveRequestToken_args)
      result = RetrieveRequestToken_result.new()
      begin
        result.success = @handler.retrieveRequestToken(args.carrier)
      rescue ::TalkException => e
        result.e = e
      end
      write_result(result, oprot, 'retrieveRequestToken', seqid)
    end

  end

  # HELPER FUNCTIONS AND STRUCTURES

  class CheckUserAge_args
    include ::Thrift::Struct, ::Thrift::Struct_Union
    CARRIER = 2
    SESSIONID = 3
    VERIFIER = 4
    STANDARDAGE = 5

    FIELDS = {
      CARRIER => {:type => ::Thrift::Types::I32, :name => 'carrier', :enum_class => ::CarrierCode},
      SESSIONID => {:type => ::Thrift::Types::STRING, :name => 'sessionId'},
      VERIFIER => {:type => ::Thrift::Types::STRING, :name => 'verifier'},
      STANDARDAGE => {:type => ::Thrift::Types::I32, :name => 'standardAge'}
    }

    def struct_fields; FIELDS; end

    def validate
      unless @carrier.nil? || ::CarrierCode::VALID_VALUES.include?(@carrier)
        raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field carrier!')
      end
    end

    ::Thrift::Struct.generate_accessors self
  end

  class CheckUserAge_result
    include ::Thrift::Struct, ::Thrift::Struct_Union
    SUCCESS = 0
    E = 1

    FIELDS = {
      SUCCESS => {:type => ::Thrift::Types::I32, :name => 'success', :enum_class => ::UserAgeType},
      E => {:type => ::Thrift::Types::STRUCT, :name => 'e', :class => ::TalkException}
    }

    def struct_fields; FIELDS; end

    def validate
      unless @success.nil? || ::UserAgeType::VALID_VALUES.include?(@success)
        raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field success!')
      end
    end

    ::Thrift::Struct.generate_accessors self
  end

  class CheckUserAgeWithDocomo_args
    include ::Thrift::Struct, ::Thrift::Struct_Union
    OPENIDREDIRECTURL = 2
    STANDARDAGE = 3
    VERIFIER = 4

    FIELDS = {
      OPENIDREDIRECTURL => {:type => ::Thrift::Types::STRING, :name => 'openIdRedirectUrl'},
      STANDARDAGE => {:type => ::Thrift::Types::I32, :name => 'standardAge'},
      VERIFIER => {:type => ::Thrift::Types::STRING, :name => 'verifier'}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class CheckUserAgeWithDocomo_result
    include ::Thrift::Struct, ::Thrift::Struct_Union
    SUCCESS = 0
    E = 1

    FIELDS = {
      SUCCESS => {:type => ::Thrift::Types::STRUCT, :name => 'success', :class => ::AgeCheckDocomoResult},
      E => {:type => ::Thrift::Types::STRUCT, :name => 'e', :class => ::TalkException}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class RetrieveOpenIdAuthUrlWithDocomo_args
    include ::Thrift::Struct, ::Thrift::Struct_Union

    FIELDS = {

    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class RetrieveOpenIdAuthUrlWithDocomo_result
    include ::Thrift::Struct, ::Thrift::Struct_Union
    SUCCESS = 0
    E = 1

    FIELDS = {
      SUCCESS => {:type => ::Thrift::Types::STRING, :name => 'success'},
      E => {:type => ::Thrift::Types::STRUCT, :name => 'e', :class => ::TalkException}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

  class RetrieveRequestToken_args
    include ::Thrift::Struct, ::Thrift::Struct_Union
    CARRIER = 2

    FIELDS = {
      CARRIER => {:type => ::Thrift::Types::I32, :name => 'carrier', :enum_class => ::CarrierCode}
    }

    def struct_fields; FIELDS; end

    def validate
      unless @carrier.nil? || ::CarrierCode::VALID_VALUES.include?(@carrier)
        raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field carrier!')
      end
    end

    ::Thrift::Struct.generate_accessors self
  end

  class RetrieveRequestToken_result
    include ::Thrift::Struct, ::Thrift::Struct_Union
    SUCCESS = 0
    E = 1

    FIELDS = {
      SUCCESS => {:type => ::Thrift::Types::STRUCT, :name => 'success', :class => ::AgeCheckRequestResult},
      E => {:type => ::Thrift::Types::STRUCT, :name => 'e', :class => ::TalkException}
    }

    def struct_fields; FIELDS; end

    def validate
    end

    ::Thrift::Struct.generate_accessors self
  end

end

