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

class CreateSquareRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'reqSeq',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'square',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\Square',
        ),
        3 => array(
            'var' => 'creator',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\SquareMember',
        ),
    );

    /**
     * @var int
     */
    public $reqSeq = null;
    /**
     * @var \Square
     */
    public $square = null;
    /**
     * @var \SquareMember
     */
    public $creator = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['reqSeq'])) {
                $this->reqSeq = $vals['reqSeq'];
            }
            if (isset($vals['square'])) {
                $this->square = $vals['square'];
            }
            if (isset($vals['creator'])) {
                $this->creator = $vals['creator'];
            }
        }
    }

    public function getName()
    {
        return 'CreateSquareRequest';
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
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->reqSeq);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRUCT) {
                        $this->square = new \Square();
                        $xfer += $this->square->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRUCT) {
                        $this->creator = new \SquareMember();
                        $xfer += $this->creator->read($input);
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
        $xfer += $output->writeStructBegin('CreateSquareRequest');
        if ($this->reqSeq !== null) {
            $xfer += $output->writeFieldBegin('reqSeq', TType::I32, 1);
            $xfer += $output->writeI32($this->reqSeq);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->square !== null) {
            if (!is_object($this->square)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('square', TType::STRUCT, 2);
            $xfer += $this->square->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->creator !== null) {
            if (!is_object($this->creator)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('creator', TType::STRUCT, 3);
            $xfer += $this->creator->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}