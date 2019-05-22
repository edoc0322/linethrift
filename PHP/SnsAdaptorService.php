<?php
/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


interface SnsAdaptorServiceIf {
  /**
   * @param int $snsIdType
   * @param string $snsAccessToken
   * @param int $startIdx
   * @param int $limit
   * @return \SnsFriends
   * @throws \TalkException
   */
  public function getSnsFriends($snsIdType, $snsAccessToken, $startIdx, $limit);
  /**
   * @param int $snsIdType
   * @param string $snsAccessToken
   * @return \SnsProfile
   * @throws \TalkException
   */
  public function getSnsMyProfile($snsIdType, $snsAccessToken);
  /**
   * @param int $snsIdType
   * @param string $snsAccessToken
   * @param string $toSnsUserId
   * @throws \TalkException
   */
  public function postSnsInvitationMessage($snsIdType, $snsAccessToken, $toSnsUserId);
}


class SnsAdaptorServiceClient implements \SnsAdaptorServiceIf {
  protected $input_ = null;
  protected $output_ = null;

  protected $seqid_ = 0;

  public function __construct($input, $output=null) {
    $this->input_ = $input;
    $this->output_ = $output ? $output : $input;
  }

  public function getSnsFriends($snsIdType, $snsAccessToken, $startIdx, $limit)
  {
    $this->send_getSnsFriends($snsIdType, $snsAccessToken, $startIdx, $limit);
    return $this->recv_getSnsFriends();
  }

  public function send_getSnsFriends($snsIdType, $snsAccessToken, $startIdx, $limit)
  {
    $args = new \SnsAdaptorService_getSnsFriends_args();
    $args->snsIdType = $snsIdType;
    $args->snsAccessToken = $snsAccessToken;
    $args->startIdx = $startIdx;
    $args->limit = $limit;
    $bin_accel = ($this->output_ instanceof TBinaryProtocolAccelerated) && function_exists('thrift_protocol_write_binary');
    if ($bin_accel)
    {
      thrift_protocol_write_binary($this->output_, 'getSnsFriends', TMessageType::CALL, $args, $this->seqid_, $this->output_->isStrictWrite());
    }
    else
    {
      $this->output_->writeMessageBegin('getSnsFriends', TMessageType::CALL, $this->seqid_);
      $args->write($this->output_);
      $this->output_->writeMessageEnd();
      $this->output_->getTransport()->flush();
    }
  }

  public function recv_getSnsFriends()
  {
    $bin_accel = ($this->input_ instanceof TBinaryProtocolAccelerated) && function_exists('thrift_protocol_read_binary');
    if ($bin_accel) $result = thrift_protocol_read_binary($this->input_, '\SnsAdaptorService_getSnsFriends_result', $this->input_->isStrictRead());
    else
    {
      $rseqid = 0;
      $fname = null;
      $mtype = 0;

      $this->input_->readMessageBegin($fname, $mtype, $rseqid);
      if ($mtype == TMessageType::EXCEPTION) {
        $x = new TApplicationException();
        $x->read($this->input_);
        $this->input_->readMessageEnd();
        throw $x;
      }
      $result = new \SnsAdaptorService_getSnsFriends_result();
      $result->read($this->input_);
      $this->input_->readMessageEnd();
    }
    if ($result->success !== null) {
      return $result->success;
    }
    if ($result->e !== null) {
      throw $result->e;
    }
    throw new \Exception("getSnsFriends failed: unknown result");
  }

  public function getSnsMyProfile($snsIdType, $snsAccessToken)
  {
    $this->send_getSnsMyProfile($snsIdType, $snsAccessToken);
    return $this->recv_getSnsMyProfile();
  }

  public function send_getSnsMyProfile($snsIdType, $snsAccessToken)
  {
    $args = new \SnsAdaptorService_getSnsMyProfile_args();
    $args->snsIdType = $snsIdType;
    $args->snsAccessToken = $snsAccessToken;
    $bin_accel = ($this->output_ instanceof TBinaryProtocolAccelerated) && function_exists('thrift_protocol_write_binary');
    if ($bin_accel)
    {
      thrift_protocol_write_binary($this->output_, 'getSnsMyProfile', TMessageType::CALL, $args, $this->seqid_, $this->output_->isStrictWrite());
    }
    else
    {
      $this->output_->writeMessageBegin('getSnsMyProfile', TMessageType::CALL, $this->seqid_);
      $args->write($this->output_);
      $this->output_->writeMessageEnd();
      $this->output_->getTransport()->flush();
    }
  }

  public function recv_getSnsMyProfile()
  {
    $bin_accel = ($this->input_ instanceof TBinaryProtocolAccelerated) && function_exists('thrift_protocol_read_binary');
    if ($bin_accel) $result = thrift_protocol_read_binary($this->input_, '\SnsAdaptorService_getSnsMyProfile_result', $this->input_->isStrictRead());
    else
    {
      $rseqid = 0;
      $fname = null;
      $mtype = 0;

      $this->input_->readMessageBegin($fname, $mtype, $rseqid);
      if ($mtype == TMessageType::EXCEPTION) {
        $x = new TApplicationException();
        $x->read($this->input_);
        $this->input_->readMessageEnd();
        throw $x;
      }
      $result = new \SnsAdaptorService_getSnsMyProfile_result();
      $result->read($this->input_);
      $this->input_->readMessageEnd();
    }
    if ($result->success !== null) {
      return $result->success;
    }
    if ($result->e !== null) {
      throw $result->e;
    }
    throw new \Exception("getSnsMyProfile failed: unknown result");
  }

  public function postSnsInvitationMessage($snsIdType, $snsAccessToken, $toSnsUserId)
  {
    $this->send_postSnsInvitationMessage($snsIdType, $snsAccessToken, $toSnsUserId);
    $this->recv_postSnsInvitationMessage();
  }

  public function send_postSnsInvitationMessage($snsIdType, $snsAccessToken, $toSnsUserId)
  {
    $args = new \SnsAdaptorService_postSnsInvitationMessage_args();
    $args->snsIdType = $snsIdType;
    $args->snsAccessToken = $snsAccessToken;
    $args->toSnsUserId = $toSnsUserId;
    $bin_accel = ($this->output_ instanceof TBinaryProtocolAccelerated) && function_exists('thrift_protocol_write_binary');
    if ($bin_accel)
    {
      thrift_protocol_write_binary($this->output_, 'postSnsInvitationMessage', TMessageType::CALL, $args, $this->seqid_, $this->output_->isStrictWrite());
    }
    else
    {
      $this->output_->writeMessageBegin('postSnsInvitationMessage', TMessageType::CALL, $this->seqid_);
      $args->write($this->output_);
      $this->output_->writeMessageEnd();
      $this->output_->getTransport()->flush();
    }
  }

  public function recv_postSnsInvitationMessage()
  {
    $bin_accel = ($this->input_ instanceof TBinaryProtocolAccelerated) && function_exists('thrift_protocol_read_binary');
    if ($bin_accel) $result = thrift_protocol_read_binary($this->input_, '\SnsAdaptorService_postSnsInvitationMessage_result', $this->input_->isStrictRead());
    else
    {
      $rseqid = 0;
      $fname = null;
      $mtype = 0;

      $this->input_->readMessageBegin($fname, $mtype, $rseqid);
      if ($mtype == TMessageType::EXCEPTION) {
        $x = new TApplicationException();
        $x->read($this->input_);
        $this->input_->readMessageEnd();
        throw $x;
      }
      $result = new \SnsAdaptorService_postSnsInvitationMessage_result();
      $result->read($this->input_);
      $this->input_->readMessageEnd();
    }
    if ($result->e !== null) {
      throw $result->e;
    }
    return;
  }

}


// HELPER FUNCTIONS AND STRUCTURES

class SnsAdaptorService_getSnsFriends_args {
  static $isValidate = false;

  static $_TSPEC = array(
    2 => array(
      'var' => 'snsIdType',
      'isRequired' => false,
      'type' => TType::I32,
      ),
    3 => array(
      'var' => 'snsAccessToken',
      'isRequired' => false,
      'type' => TType::STRING,
      ),
    4 => array(
      'var' => 'startIdx',
      'isRequired' => false,
      'type' => TType::I32,
      ),
    5 => array(
      'var' => 'limit',
      'isRequired' => false,
      'type' => TType::I32,
      ),
    );

  /**
   * @var int
   */
  public $snsIdType = null;
  /**
   * @var string
   */
  public $snsAccessToken = null;
  /**
   * @var int
   */
  public $startIdx = null;
  /**
   * @var int
   */
  public $limit = null;

  public function __construct($vals=null) {
    if (is_array($vals)) {
      if (isset($vals['snsIdType'])) {
        $this->snsIdType = $vals['snsIdType'];
      }
      if (isset($vals['snsAccessToken'])) {
        $this->snsAccessToken = $vals['snsAccessToken'];
      }
      if (isset($vals['startIdx'])) {
        $this->startIdx = $vals['startIdx'];
      }
      if (isset($vals['limit'])) {
        $this->limit = $vals['limit'];
      }
    }
  }

  public function getName() {
    return 'SnsAdaptorService_getSnsFriends_args';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 2:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->snsIdType);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->snsAccessToken);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->startIdx);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->limit);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('SnsAdaptorService_getSnsFriends_args');
    if ($this->snsIdType !== null) {
      $xfer += $output->writeFieldBegin('snsIdType', TType::I32, 2);
      $xfer += $output->writeI32($this->snsIdType);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->snsAccessToken !== null) {
      $xfer += $output->writeFieldBegin('snsAccessToken', TType::STRING, 3);
      $xfer += $output->writeString($this->snsAccessToken);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->startIdx !== null) {
      $xfer += $output->writeFieldBegin('startIdx', TType::I32, 4);
      $xfer += $output->writeI32($this->startIdx);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->limit !== null) {
      $xfer += $output->writeFieldBegin('limit', TType::I32, 5);
      $xfer += $output->writeI32($this->limit);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class SnsAdaptorService_getSnsFriends_result {
  static $isValidate = false;

  static $_TSPEC = array(
    0 => array(
      'var' => 'success',
      'isRequired' => false,
      'type' => TType::STRUCT,
      'class' => '\SnsFriends',
      ),
    1 => array(
      'var' => 'e',
      'isRequired' => false,
      'type' => TType::STRUCT,
      'class' => '\TalkException',
      ),
    );

  /**
   * @var \SnsFriends
   */
  public $success = null;
  /**
   * @var \TalkException
   */
  public $e = null;

  public function __construct($vals=null) {
    if (is_array($vals)) {
      if (isset($vals['success'])) {
        $this->success = $vals['success'];
      }
      if (isset($vals['e'])) {
        $this->e = $vals['e'];
      }
    }
  }

  public function getName() {
    return 'SnsAdaptorService_getSnsFriends_result';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 0:
          if ($ftype == TType::STRUCT) {
            $this->success = new \SnsFriends();
            $xfer += $this->success->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->e = new \TalkException();
            $xfer += $this->e->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('SnsAdaptorService_getSnsFriends_result');
    if ($this->success !== null) {
      if (!is_object($this->success)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('success', TType::STRUCT, 0);
      $xfer += $this->success->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->e !== null) {
      $xfer += $output->writeFieldBegin('e', TType::STRUCT, 1);
      $xfer += $this->e->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class SnsAdaptorService_getSnsMyProfile_args {
  static $isValidate = false;

  static $_TSPEC = array(
    2 => array(
      'var' => 'snsIdType',
      'isRequired' => false,
      'type' => TType::I32,
      ),
    3 => array(
      'var' => 'snsAccessToken',
      'isRequired' => false,
      'type' => TType::STRING,
      ),
    );

  /**
   * @var int
   */
  public $snsIdType = null;
  /**
   * @var string
   */
  public $snsAccessToken = null;

  public function __construct($vals=null) {
    if (is_array($vals)) {
      if (isset($vals['snsIdType'])) {
        $this->snsIdType = $vals['snsIdType'];
      }
      if (isset($vals['snsAccessToken'])) {
        $this->snsAccessToken = $vals['snsAccessToken'];
      }
    }
  }

  public function getName() {
    return 'SnsAdaptorService_getSnsMyProfile_args';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 2:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->snsIdType);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->snsAccessToken);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('SnsAdaptorService_getSnsMyProfile_args');
    if ($this->snsIdType !== null) {
      $xfer += $output->writeFieldBegin('snsIdType', TType::I32, 2);
      $xfer += $output->writeI32($this->snsIdType);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->snsAccessToken !== null) {
      $xfer += $output->writeFieldBegin('snsAccessToken', TType::STRING, 3);
      $xfer += $output->writeString($this->snsAccessToken);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class SnsAdaptorService_getSnsMyProfile_result {
  static $isValidate = false;

  static $_TSPEC = array(
    0 => array(
      'var' => 'success',
      'isRequired' => false,
      'type' => TType::STRUCT,
      'class' => '\SnsProfile',
      ),
    1 => array(
      'var' => 'e',
      'isRequired' => false,
      'type' => TType::STRUCT,
      'class' => '\TalkException',
      ),
    );

  /**
   * @var \SnsProfile
   */
  public $success = null;
  /**
   * @var \TalkException
   */
  public $e = null;

  public function __construct($vals=null) {
    if (is_array($vals)) {
      if (isset($vals['success'])) {
        $this->success = $vals['success'];
      }
      if (isset($vals['e'])) {
        $this->e = $vals['e'];
      }
    }
  }

  public function getName() {
    return 'SnsAdaptorService_getSnsMyProfile_result';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 0:
          if ($ftype == TType::STRUCT) {
            $this->success = new \SnsProfile();
            $xfer += $this->success->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->e = new \TalkException();
            $xfer += $this->e->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('SnsAdaptorService_getSnsMyProfile_result');
    if ($this->success !== null) {
      if (!is_object($this->success)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('success', TType::STRUCT, 0);
      $xfer += $this->success->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->e !== null) {
      $xfer += $output->writeFieldBegin('e', TType::STRUCT, 1);
      $xfer += $this->e->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class SnsAdaptorService_postSnsInvitationMessage_args {
  static $isValidate = false;

  static $_TSPEC = array(
    2 => array(
      'var' => 'snsIdType',
      'isRequired' => false,
      'type' => TType::I32,
      ),
    3 => array(
      'var' => 'snsAccessToken',
      'isRequired' => false,
      'type' => TType::STRING,
      ),
    4 => array(
      'var' => 'toSnsUserId',
      'isRequired' => false,
      'type' => TType::STRING,
      ),
    );

  /**
   * @var int
   */
  public $snsIdType = null;
  /**
   * @var string
   */
  public $snsAccessToken = null;
  /**
   * @var string
   */
  public $toSnsUserId = null;

  public function __construct($vals=null) {
    if (is_array($vals)) {
      if (isset($vals['snsIdType'])) {
        $this->snsIdType = $vals['snsIdType'];
      }
      if (isset($vals['snsAccessToken'])) {
        $this->snsAccessToken = $vals['snsAccessToken'];
      }
      if (isset($vals['toSnsUserId'])) {
        $this->toSnsUserId = $vals['toSnsUserId'];
      }
    }
  }

  public function getName() {
    return 'SnsAdaptorService_postSnsInvitationMessage_args';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 2:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->snsIdType);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->snsAccessToken);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->toSnsUserId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('SnsAdaptorService_postSnsInvitationMessage_args');
    if ($this->snsIdType !== null) {
      $xfer += $output->writeFieldBegin('snsIdType', TType::I32, 2);
      $xfer += $output->writeI32($this->snsIdType);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->snsAccessToken !== null) {
      $xfer += $output->writeFieldBegin('snsAccessToken', TType::STRING, 3);
      $xfer += $output->writeString($this->snsAccessToken);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->toSnsUserId !== null) {
      $xfer += $output->writeFieldBegin('toSnsUserId', TType::STRING, 4);
      $xfer += $output->writeString($this->toSnsUserId);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class SnsAdaptorService_postSnsInvitationMessage_result {
  static $isValidate = false;

  static $_TSPEC = array(
    1 => array(
      'var' => 'e',
      'isRequired' => false,
      'type' => TType::STRUCT,
      'class' => '\TalkException',
      ),
    );

  /**
   * @var \TalkException
   */
  public $e = null;

  public function __construct($vals=null) {
    if (is_array($vals)) {
      if (isset($vals['e'])) {
        $this->e = $vals['e'];
      }
    }
  }

  public function getName() {
    return 'SnsAdaptorService_postSnsInvitationMessage_result';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->e = new \TalkException();
            $xfer += $this->e->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('SnsAdaptorService_postSnsInvitationMessage_result');
    if ($this->e !== null) {
      $xfer += $output->writeFieldBegin('e', TType::STRUCT, 1);
      $xfer += $this->e->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}


