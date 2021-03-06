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

final class BuddyResultState
{
    const ACCEPTED = 1;

    const SUCCEEDED = 2;

    const FAILED = 3;

    const CANCELLED = 4;

    const NOTIFY_FAILED = 5;

    const STORING = 11;

    const UPLOADING = 21;

    const NOTIFYING = 31;

    const REMOVING_SUBSCRIPTION = 41;

    const UNREGISTERING_ACCOUNT = 42;

    const NOTIFYING_LEAVE_CHAT = 43;

    static public $__names = array(
        1 => 'ACCEPTED',
        2 => 'SUCCEEDED',
        3 => 'FAILED',
        4 => 'CANCELLED',
        5 => 'NOTIFY_FAILED',
        11 => 'STORING',
        21 => 'UPLOADING',
        31 => 'NOTIFYING',
        41 => 'REMOVING_SUBSCRIPTION',
        42 => 'UNREGISTERING_ACCOUNT',
        43 => 'NOTIFYING_LEAVE_CHAT',
    );
}

