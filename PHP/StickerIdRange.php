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

class StickerIdRange
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'start',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'size',
            'isRequired' => false,
            'type' => TType::I32,
        ),
    );

    /**
     * @var int
     */
    public $start = null;
    /**
     * @var int
     */
    public $size = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['start'])) {
                $this->start = $vals['start'];
            }
            if (isset($vals['size'])) {
                $this->size = $vals['size'];
            }
        }
    }

    public function getName()
    {
        return 'StickerIdRange';
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
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->start);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->size);
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
        $xfer += $output->writeStructBegin('StickerIdRange');
        if ($this->start !== null) {
            $xfer += $output->writeFieldBegin('start', TType::I64, 1);
            $xfer += $output->writeI64($this->start);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->size !== null) {
            $xfer += $output->writeFieldBegin('size', TType::I32, 2);
            $xfer += $output->writeI32($this->size);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}