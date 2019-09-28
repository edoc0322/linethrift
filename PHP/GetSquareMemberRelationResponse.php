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

class GetSquareMemberRelationResponse
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'squareMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'targetSquareMemberMid',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'relation',
            'isRequired' => false,
            'type' => TType::STRUCT,
            'class' => '\SquareMemberRelation',
        ),
    );

    /**
     * @var string
     */
    public $squareMid = null;
    /**
     * @var string
     */
    public $targetSquareMemberMid = null;
    /**
     * @var \SquareMemberRelation
     */
    public $relation = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['squareMid'])) {
                $this->squareMid = $vals['squareMid'];
            }
            if (isset($vals['targetSquareMemberMid'])) {
                $this->targetSquareMemberMid = $vals['targetSquareMemberMid'];
            }
            if (isset($vals['relation'])) {
                $this->relation = $vals['relation'];
            }
        }
    }

    public function getName()
    {
        return 'GetSquareMemberRelationResponse';
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
                        $xfer += $input->readString($this->squareMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->targetSquareMemberMid);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRUCT) {
                        $this->relation = new \SquareMemberRelation();
                        $xfer += $this->relation->read($input);
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
        $xfer += $output->writeStructBegin('GetSquareMemberRelationResponse');
        if ($this->squareMid !== null) {
            $xfer += $output->writeFieldBegin('squareMid', TType::STRING, 1);
            $xfer += $output->writeString($this->squareMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->targetSquareMemberMid !== null) {
            $xfer += $output->writeFieldBegin('targetSquareMemberMid', TType::STRING, 2);
            $xfer += $output->writeString($this->targetSquareMemberMid);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->relation !== null) {
            if (!is_object($this->relation)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('relation', TType::STRUCT, 3);
            $xfer += $this->relation->write($output);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}