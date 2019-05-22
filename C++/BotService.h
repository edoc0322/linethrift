/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
#ifndef BotService_H
#define BotService_H

#include <thrift/TDispatchProcessor.h>
#include <thrift/async/TConcurrentClientSyncInfo.h>
#include "line_types.h"



#ifdef _MSC_VER
  #pragma warning( push )
  #pragma warning (disable : 4250 ) //inheriting methods via dominance 
#endif

class BotServiceIf {
 public:
  virtual ~BotServiceIf() {}
  virtual void notifyLeaveGroup(const std::string& groupMid) = 0;
  virtual void notifyLeaveRoom(const std::string& roomMid) = 0;
  virtual void getBotUseInfo(BotUseInfo& _return, const std::string& botMid) = 0;
  virtual void sendChatCheckedByWatermark(const int32_t seq, const std::string& mid, const int64_t watermark, const int32_t sessionId) = 0;
};

class BotServiceIfFactory {
 public:
  typedef BotServiceIf Handler;

  virtual ~BotServiceIfFactory() {}

  virtual BotServiceIf* getHandler(const ::apache::thrift::TConnectionInfo& connInfo) = 0;
  virtual void releaseHandler(BotServiceIf* /* handler */) = 0;
};

class BotServiceIfSingletonFactory : virtual public BotServiceIfFactory {
 public:
  BotServiceIfSingletonFactory(const ::apache::thrift::stdcxx::shared_ptr<BotServiceIf>& iface) : iface_(iface) {}
  virtual ~BotServiceIfSingletonFactory() {}

  virtual BotServiceIf* getHandler(const ::apache::thrift::TConnectionInfo&) {
    return iface_.get();
  }
  virtual void releaseHandler(BotServiceIf* /* handler */) {}

 protected:
  ::apache::thrift::stdcxx::shared_ptr<BotServiceIf> iface_;
};

class BotServiceNull : virtual public BotServiceIf {
 public:
  virtual ~BotServiceNull() {}
  void notifyLeaveGroup(const std::string& /* groupMid */) {
    return;
  }
  void notifyLeaveRoom(const std::string& /* roomMid */) {
    return;
  }
  void getBotUseInfo(BotUseInfo& /* _return */, const std::string& /* botMid */) {
    return;
  }
  void sendChatCheckedByWatermark(const int32_t /* seq */, const std::string& /* mid */, const int64_t /* watermark */, const int32_t /* sessionId */) {
    return;
  }
};

typedef struct _BotService_notifyLeaveGroup_args__isset {
  _BotService_notifyLeaveGroup_args__isset() : groupMid(false) {}
  bool groupMid :1;
} _BotService_notifyLeaveGroup_args__isset;

class BotService_notifyLeaveGroup_args {
 public:

  BotService_notifyLeaveGroup_args(const BotService_notifyLeaveGroup_args&);
  BotService_notifyLeaveGroup_args& operator=(const BotService_notifyLeaveGroup_args&);
  BotService_notifyLeaveGroup_args() : groupMid() {
  }

  virtual ~BotService_notifyLeaveGroup_args() throw();
  std::string groupMid;

  _BotService_notifyLeaveGroup_args__isset __isset;

  void __set_groupMid(const std::string& val);

  bool operator == (const BotService_notifyLeaveGroup_args & rhs) const
  {
    if (!(groupMid == rhs.groupMid))
      return false;
    return true;
  }
  bool operator != (const BotService_notifyLeaveGroup_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const BotService_notifyLeaveGroup_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class BotService_notifyLeaveGroup_pargs {
 public:


  virtual ~BotService_notifyLeaveGroup_pargs() throw();
  const std::string* groupMid;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _BotService_notifyLeaveGroup_result__isset {
  _BotService_notifyLeaveGroup_result__isset() : e(false) {}
  bool e :1;
} _BotService_notifyLeaveGroup_result__isset;

class BotService_notifyLeaveGroup_result {
 public:

  BotService_notifyLeaveGroup_result(const BotService_notifyLeaveGroup_result&);
  BotService_notifyLeaveGroup_result& operator=(const BotService_notifyLeaveGroup_result&);
  BotService_notifyLeaveGroup_result() {
  }

  virtual ~BotService_notifyLeaveGroup_result() throw();
  TalkException e;

  _BotService_notifyLeaveGroup_result__isset __isset;

  void __set_e(const TalkException& val);

  bool operator == (const BotService_notifyLeaveGroup_result & rhs) const
  {
    if (!(e == rhs.e))
      return false;
    return true;
  }
  bool operator != (const BotService_notifyLeaveGroup_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const BotService_notifyLeaveGroup_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _BotService_notifyLeaveGroup_presult__isset {
  _BotService_notifyLeaveGroup_presult__isset() : e(false) {}
  bool e :1;
} _BotService_notifyLeaveGroup_presult__isset;

class BotService_notifyLeaveGroup_presult {
 public:


  virtual ~BotService_notifyLeaveGroup_presult() throw();
  TalkException e;

  _BotService_notifyLeaveGroup_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

typedef struct _BotService_notifyLeaveRoom_args__isset {
  _BotService_notifyLeaveRoom_args__isset() : roomMid(false) {}
  bool roomMid :1;
} _BotService_notifyLeaveRoom_args__isset;

class BotService_notifyLeaveRoom_args {
 public:

  BotService_notifyLeaveRoom_args(const BotService_notifyLeaveRoom_args&);
  BotService_notifyLeaveRoom_args& operator=(const BotService_notifyLeaveRoom_args&);
  BotService_notifyLeaveRoom_args() : roomMid() {
  }

  virtual ~BotService_notifyLeaveRoom_args() throw();
  std::string roomMid;

  _BotService_notifyLeaveRoom_args__isset __isset;

  void __set_roomMid(const std::string& val);

  bool operator == (const BotService_notifyLeaveRoom_args & rhs) const
  {
    if (!(roomMid == rhs.roomMid))
      return false;
    return true;
  }
  bool operator != (const BotService_notifyLeaveRoom_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const BotService_notifyLeaveRoom_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class BotService_notifyLeaveRoom_pargs {
 public:


  virtual ~BotService_notifyLeaveRoom_pargs() throw();
  const std::string* roomMid;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _BotService_notifyLeaveRoom_result__isset {
  _BotService_notifyLeaveRoom_result__isset() : e(false) {}
  bool e :1;
} _BotService_notifyLeaveRoom_result__isset;

class BotService_notifyLeaveRoom_result {
 public:

  BotService_notifyLeaveRoom_result(const BotService_notifyLeaveRoom_result&);
  BotService_notifyLeaveRoom_result& operator=(const BotService_notifyLeaveRoom_result&);
  BotService_notifyLeaveRoom_result() {
  }

  virtual ~BotService_notifyLeaveRoom_result() throw();
  TalkException e;

  _BotService_notifyLeaveRoom_result__isset __isset;

  void __set_e(const TalkException& val);

  bool operator == (const BotService_notifyLeaveRoom_result & rhs) const
  {
    if (!(e == rhs.e))
      return false;
    return true;
  }
  bool operator != (const BotService_notifyLeaveRoom_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const BotService_notifyLeaveRoom_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _BotService_notifyLeaveRoom_presult__isset {
  _BotService_notifyLeaveRoom_presult__isset() : e(false) {}
  bool e :1;
} _BotService_notifyLeaveRoom_presult__isset;

class BotService_notifyLeaveRoom_presult {
 public:


  virtual ~BotService_notifyLeaveRoom_presult() throw();
  TalkException e;

  _BotService_notifyLeaveRoom_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

typedef struct _BotService_getBotUseInfo_args__isset {
  _BotService_getBotUseInfo_args__isset() : botMid(false) {}
  bool botMid :1;
} _BotService_getBotUseInfo_args__isset;

class BotService_getBotUseInfo_args {
 public:

  BotService_getBotUseInfo_args(const BotService_getBotUseInfo_args&);
  BotService_getBotUseInfo_args& operator=(const BotService_getBotUseInfo_args&);
  BotService_getBotUseInfo_args() : botMid() {
  }

  virtual ~BotService_getBotUseInfo_args() throw();
  std::string botMid;

  _BotService_getBotUseInfo_args__isset __isset;

  void __set_botMid(const std::string& val);

  bool operator == (const BotService_getBotUseInfo_args & rhs) const
  {
    if (!(botMid == rhs.botMid))
      return false;
    return true;
  }
  bool operator != (const BotService_getBotUseInfo_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const BotService_getBotUseInfo_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class BotService_getBotUseInfo_pargs {
 public:


  virtual ~BotService_getBotUseInfo_pargs() throw();
  const std::string* botMid;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _BotService_getBotUseInfo_result__isset {
  _BotService_getBotUseInfo_result__isset() : success(false), e(false) {}
  bool success :1;
  bool e :1;
} _BotService_getBotUseInfo_result__isset;

class BotService_getBotUseInfo_result {
 public:

  BotService_getBotUseInfo_result(const BotService_getBotUseInfo_result&);
  BotService_getBotUseInfo_result& operator=(const BotService_getBotUseInfo_result&);
  BotService_getBotUseInfo_result() {
  }

  virtual ~BotService_getBotUseInfo_result() throw();
  BotUseInfo success;
  TalkException e;

  _BotService_getBotUseInfo_result__isset __isset;

  void __set_success(const BotUseInfo& val);

  void __set_e(const TalkException& val);

  bool operator == (const BotService_getBotUseInfo_result & rhs) const
  {
    if (!(success == rhs.success))
      return false;
    if (!(e == rhs.e))
      return false;
    return true;
  }
  bool operator != (const BotService_getBotUseInfo_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const BotService_getBotUseInfo_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _BotService_getBotUseInfo_presult__isset {
  _BotService_getBotUseInfo_presult__isset() : success(false), e(false) {}
  bool success :1;
  bool e :1;
} _BotService_getBotUseInfo_presult__isset;

class BotService_getBotUseInfo_presult {
 public:


  virtual ~BotService_getBotUseInfo_presult() throw();
  BotUseInfo* success;
  TalkException e;

  _BotService_getBotUseInfo_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

typedef struct _BotService_sendChatCheckedByWatermark_args__isset {
  _BotService_sendChatCheckedByWatermark_args__isset() : seq(false), mid(false), watermark(false), sessionId(false) {}
  bool seq :1;
  bool mid :1;
  bool watermark :1;
  bool sessionId :1;
} _BotService_sendChatCheckedByWatermark_args__isset;

class BotService_sendChatCheckedByWatermark_args {
 public:

  BotService_sendChatCheckedByWatermark_args(const BotService_sendChatCheckedByWatermark_args&);
  BotService_sendChatCheckedByWatermark_args& operator=(const BotService_sendChatCheckedByWatermark_args&);
  BotService_sendChatCheckedByWatermark_args() : seq(0), mid(), watermark(0), sessionId(0) {
  }

  virtual ~BotService_sendChatCheckedByWatermark_args() throw();
  int32_t seq;
  std::string mid;
  int64_t watermark;
  int32_t sessionId;

  _BotService_sendChatCheckedByWatermark_args__isset __isset;

  void __set_seq(const int32_t val);

  void __set_mid(const std::string& val);

  void __set_watermark(const int64_t val);

  void __set_sessionId(const int32_t val);

  bool operator == (const BotService_sendChatCheckedByWatermark_args & rhs) const
  {
    if (!(seq == rhs.seq))
      return false;
    if (!(mid == rhs.mid))
      return false;
    if (!(watermark == rhs.watermark))
      return false;
    if (!(sessionId == rhs.sessionId))
      return false;
    return true;
  }
  bool operator != (const BotService_sendChatCheckedByWatermark_args &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const BotService_sendChatCheckedByWatermark_args & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};


class BotService_sendChatCheckedByWatermark_pargs {
 public:


  virtual ~BotService_sendChatCheckedByWatermark_pargs() throw();
  const int32_t* seq;
  const std::string* mid;
  const int64_t* watermark;
  const int32_t* sessionId;

  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _BotService_sendChatCheckedByWatermark_result__isset {
  _BotService_sendChatCheckedByWatermark_result__isset() : e(false) {}
  bool e :1;
} _BotService_sendChatCheckedByWatermark_result__isset;

class BotService_sendChatCheckedByWatermark_result {
 public:

  BotService_sendChatCheckedByWatermark_result(const BotService_sendChatCheckedByWatermark_result&);
  BotService_sendChatCheckedByWatermark_result& operator=(const BotService_sendChatCheckedByWatermark_result&);
  BotService_sendChatCheckedByWatermark_result() {
  }

  virtual ~BotService_sendChatCheckedByWatermark_result() throw();
  TalkException e;

  _BotService_sendChatCheckedByWatermark_result__isset __isset;

  void __set_e(const TalkException& val);

  bool operator == (const BotService_sendChatCheckedByWatermark_result & rhs) const
  {
    if (!(e == rhs.e))
      return false;
    return true;
  }
  bool operator != (const BotService_sendChatCheckedByWatermark_result &rhs) const {
    return !(*this == rhs);
  }

  bool operator < (const BotService_sendChatCheckedByWatermark_result & ) const;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);
  uint32_t write(::apache::thrift::protocol::TProtocol* oprot) const;

};

typedef struct _BotService_sendChatCheckedByWatermark_presult__isset {
  _BotService_sendChatCheckedByWatermark_presult__isset() : e(false) {}
  bool e :1;
} _BotService_sendChatCheckedByWatermark_presult__isset;

class BotService_sendChatCheckedByWatermark_presult {
 public:


  virtual ~BotService_sendChatCheckedByWatermark_presult() throw();
  TalkException e;

  _BotService_sendChatCheckedByWatermark_presult__isset __isset;

  uint32_t read(::apache::thrift::protocol::TProtocol* iprot);

};

class BotServiceClient : virtual public BotServiceIf {
 public:
  BotServiceClient(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
    setProtocol(prot);
  }
  BotServiceClient(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    setProtocol(iprot,oprot);
  }
 private:
  void setProtocol(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
  setProtocol(prot,prot);
  }
  void setProtocol(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    piprot_=iprot;
    poprot_=oprot;
    iprot_ = iprot.get();
    oprot_ = oprot.get();
  }
 public:
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  void notifyLeaveGroup(const std::string& groupMid);
  void send_notifyLeaveGroup(const std::string& groupMid);
  void recv_notifyLeaveGroup();
  void notifyLeaveRoom(const std::string& roomMid);
  void send_notifyLeaveRoom(const std::string& roomMid);
  void recv_notifyLeaveRoom();
  void getBotUseInfo(BotUseInfo& _return, const std::string& botMid);
  void send_getBotUseInfo(const std::string& botMid);
  void recv_getBotUseInfo(BotUseInfo& _return);
  void sendChatCheckedByWatermark(const int32_t seq, const std::string& mid, const int64_t watermark, const int32_t sessionId);
  void send_sendChatCheckedByWatermark(const int32_t seq, const std::string& mid, const int64_t watermark, const int32_t sessionId);
  void recv_sendChatCheckedByWatermark();
 protected:
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> piprot_;
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> poprot_;
  ::apache::thrift::protocol::TProtocol* iprot_;
  ::apache::thrift::protocol::TProtocol* oprot_;
};

class BotServiceProcessor : public ::apache::thrift::TDispatchProcessor {
 protected:
  ::apache::thrift::stdcxx::shared_ptr<BotServiceIf> iface_;
  virtual bool dispatchCall(::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, const std::string& fname, int32_t seqid, void* callContext);
 private:
  typedef  void (BotServiceProcessor::*ProcessFunction)(int32_t, ::apache::thrift::protocol::TProtocol*, ::apache::thrift::protocol::TProtocol*, void*);
  typedef std::map<std::string, ProcessFunction> ProcessMap;
  ProcessMap processMap_;
  void process_notifyLeaveGroup(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
  void process_notifyLeaveRoom(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
  void process_getBotUseInfo(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
  void process_sendChatCheckedByWatermark(int32_t seqid, ::apache::thrift::protocol::TProtocol* iprot, ::apache::thrift::protocol::TProtocol* oprot, void* callContext);
 public:
  BotServiceProcessor(::apache::thrift::stdcxx::shared_ptr<BotServiceIf> iface) :
    iface_(iface) {
    processMap_["notifyLeaveGroup"] = &BotServiceProcessor::process_notifyLeaveGroup;
    processMap_["notifyLeaveRoom"] = &BotServiceProcessor::process_notifyLeaveRoom;
    processMap_["getBotUseInfo"] = &BotServiceProcessor::process_getBotUseInfo;
    processMap_["sendChatCheckedByWatermark"] = &BotServiceProcessor::process_sendChatCheckedByWatermark;
  }

  virtual ~BotServiceProcessor() {}
};

class BotServiceProcessorFactory : public ::apache::thrift::TProcessorFactory {
 public:
  BotServiceProcessorFactory(const ::apache::thrift::stdcxx::shared_ptr< BotServiceIfFactory >& handlerFactory) :
      handlerFactory_(handlerFactory) {}

  ::apache::thrift::stdcxx::shared_ptr< ::apache::thrift::TProcessor > getProcessor(const ::apache::thrift::TConnectionInfo& connInfo);

 protected:
  ::apache::thrift::stdcxx::shared_ptr< BotServiceIfFactory > handlerFactory_;
};

class BotServiceMultiface : virtual public BotServiceIf {
 public:
  BotServiceMultiface(std::vector<apache::thrift::stdcxx::shared_ptr<BotServiceIf> >& ifaces) : ifaces_(ifaces) {
  }
  virtual ~BotServiceMultiface() {}
 protected:
  std::vector<apache::thrift::stdcxx::shared_ptr<BotServiceIf> > ifaces_;
  BotServiceMultiface() {}
  void add(::apache::thrift::stdcxx::shared_ptr<BotServiceIf> iface) {
    ifaces_.push_back(iface);
  }
 public:
  void notifyLeaveGroup(const std::string& groupMid) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->notifyLeaveGroup(groupMid);
    }
    ifaces_[i]->notifyLeaveGroup(groupMid);
  }

  void notifyLeaveRoom(const std::string& roomMid) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->notifyLeaveRoom(roomMid);
    }
    ifaces_[i]->notifyLeaveRoom(roomMid);
  }

  void getBotUseInfo(BotUseInfo& _return, const std::string& botMid) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->getBotUseInfo(_return, botMid);
    }
    ifaces_[i]->getBotUseInfo(_return, botMid);
    return;
  }

  void sendChatCheckedByWatermark(const int32_t seq, const std::string& mid, const int64_t watermark, const int32_t sessionId) {
    size_t sz = ifaces_.size();
    size_t i = 0;
    for (; i < (sz - 1); ++i) {
      ifaces_[i]->sendChatCheckedByWatermark(seq, mid, watermark, sessionId);
    }
    ifaces_[i]->sendChatCheckedByWatermark(seq, mid, watermark, sessionId);
  }

};

// The 'concurrent' client is a thread safe client that correctly handles
// out of order responses.  It is slower than the regular client, so should
// only be used when you need to share a connection among multiple threads
class BotServiceConcurrentClient : virtual public BotServiceIf {
 public:
  BotServiceConcurrentClient(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
    setProtocol(prot);
  }
  BotServiceConcurrentClient(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    setProtocol(iprot,oprot);
  }
 private:
  void setProtocol(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> prot) {
  setProtocol(prot,prot);
  }
  void setProtocol(apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> iprot, apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> oprot) {
    piprot_=iprot;
    poprot_=oprot;
    iprot_ = iprot.get();
    oprot_ = oprot.get();
  }
 public:
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> getInputProtocol() {
    return piprot_;
  }
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> getOutputProtocol() {
    return poprot_;
  }
  void notifyLeaveGroup(const std::string& groupMid);
  int32_t send_notifyLeaveGroup(const std::string& groupMid);
  void recv_notifyLeaveGroup(const int32_t seqid);
  void notifyLeaveRoom(const std::string& roomMid);
  int32_t send_notifyLeaveRoom(const std::string& roomMid);
  void recv_notifyLeaveRoom(const int32_t seqid);
  void getBotUseInfo(BotUseInfo& _return, const std::string& botMid);
  int32_t send_getBotUseInfo(const std::string& botMid);
  void recv_getBotUseInfo(BotUseInfo& _return, const int32_t seqid);
  void sendChatCheckedByWatermark(const int32_t seq, const std::string& mid, const int64_t watermark, const int32_t sessionId);
  int32_t send_sendChatCheckedByWatermark(const int32_t seq, const std::string& mid, const int64_t watermark, const int32_t sessionId);
  void recv_sendChatCheckedByWatermark(const int32_t seqid);
 protected:
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> piprot_;
  apache::thrift::stdcxx::shared_ptr< ::apache::thrift::protocol::TProtocol> poprot_;
  ::apache::thrift::protocol::TProtocol* iprot_;
  ::apache::thrift::protocol::TProtocol* oprot_;
  ::apache::thrift::async::TConcurrentClientSyncInfo sync_;
};

#ifdef _MSC_VER
  #pragma warning( pop )
#endif



#endif
