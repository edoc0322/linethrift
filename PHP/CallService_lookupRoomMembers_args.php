<?php
/**
 * Autogenerated by Thrift Compiler (0.13.0)
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

class CallService_lookupRoomMembers_args
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'roomId',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'mids',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRING,
            'elem' => array(
                'type' => TType::STRING,
                ),
        ),
    );

    /**
     * @var string
     */
    public $roomId = null;
    /**
     * @var string[]
     */
    public $mids = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['roomId'])) {
                $this->roomId = $vals['roomId'];
            }
            if (isset($vals['mids'])) {
                $this->mids = $vals['mids'];
            }
        }
    }

    public function getName()
    {
        return 'CallService_lookupRoomMembers_args';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->roomId);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->mids = array();
                        $_size2341 = 0;
                        $_etype2344 = 0;
                        $xfer += $input->readListBegin($_etype2344, $_size2341);
                        for ($_i2345 = 0; $_i2345 < $_size2341; ++$_i2345) {
                            $elem2346 = null;
                            $xfer += $input->readString($elem2346);
                            $this->mids []= $elem2346;
                        }
                        $xfer += $input->readListEnd();
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

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('CallService_lookupRoomMembers_args');
        if ($this->roomId !== null) {
            $xfer += $output->writeFieldBegin('roomId', TType::STRING, 1);
            $xfer += $output->writeString($this->roomId);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->mids !== null) {
            if (!is_array($this->mids)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('mids', TType::LST, 2);
            $output->writeListBegin(TType::STRING, count($this->mids));
            foreach ($this->mids as $iter2347) {
                $xfer += $output->writeString($iter2347);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}