/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;
import haxe.io.Bytes;
import haxe.ds.IntMap;
import haxe.ds.StringMap;
import haxe.ds.ObjectMap;

#if flash
import flash.errors.ArgumentError;
#end

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;


class PaymentReservationResult implements TBase {
  
  static var STRUCT_DESC = { new TStruct("PaymentReservationResult"); };
  static var ORDER_ID_FIELD_DESC = { new TField("orderId", TType.STRING, 1); };
  static var CONFIRM_URL_FIELD_DESC = { new TField("confirmUrl", TType.STRING, 2); };
  static var EXTRAS_FIELD_DESC = { new TField("extras", TType.MAP, 3); };

  @:isVar
  public var orderId(get,set) : String;
  @:isVar
  public var confirmUrl(get,set) : String;
  @:isVar
  public var extras(get,set) : StringMap< String>;

  inline static var ORDERID_FIELD_ID : Int = 1;
  inline static var CONFIRMURL_FIELD_ID : Int = 2;
  inline static var EXTRAS_FIELD_ID : Int = 3;


  public function new() {
  }

  public function get_orderId() : String {
    return this.orderId;
  }

  public function set_orderId(orderId:String) : String {
    this.orderId = orderId;
    return this.orderId;
  }

  public function unsetOrderId() : Void {
    this.orderId = null;
  }

  // Returns true if field orderId is set (has been assigned a value) and false otherwise
  public function isSetOrderId() : Bool {
    return this.orderId != null;
  }

  public function get_confirmUrl() : String {
    return this.confirmUrl;
  }

  public function set_confirmUrl(confirmUrl:String) : String {
    this.confirmUrl = confirmUrl;
    return this.confirmUrl;
  }

  public function unsetConfirmUrl() : Void {
    this.confirmUrl = null;
  }

  // Returns true if field confirmUrl is set (has been assigned a value) and false otherwise
  public function isSetConfirmUrl() : Bool {
    return this.confirmUrl != null;
  }

  public function get_extras() : StringMap< String> {
    return this.extras;
  }

  public function set_extras(extras:StringMap< String>) : StringMap< String> {
    this.extras = extras;
    return this.extras;
  }

  public function unsetExtras() : Void {
    this.extras = null;
  }

  // Returns true if field extras is set (has been assigned a value) and false otherwise
  public function isSetExtras() : Bool {
    return this.extras != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case ORDERID_FIELD_ID:
      if (value == null) {
        unsetOrderId();
      } else {
        this.orderId = value;
      }

    case CONFIRMURL_FIELD_ID:
      if (value == null) {
        unsetConfirmUrl();
      } else {
        this.confirmUrl = value;
      }

    case EXTRAS_FIELD_ID:
      if (value == null) {
        unsetExtras();
      } else {
        this.extras = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case ORDERID_FIELD_ID:
      return this.orderId;
    case CONFIRMURL_FIELD_ID:
      return this.confirmUrl;
    case EXTRAS_FIELD_ID:
      return this.extras;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case ORDERID_FIELD_ID:
      return isSetOrderId();
    case CONFIRMURL_FIELD_ID:
      return isSetConfirmUrl();
    case EXTRAS_FIELD_ID:
      return isSetExtras();
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function read( iprot : TProtocol) : Void {
    iprot.IncrementRecursionDepth();
    try
    {
      var field : TField;
      iprot.readStructBegin();
      while (true)
      {
        field = iprot.readFieldBegin();
        if (field.type == TType.STOP) { 
          break;
        }
        switch (field.id)
        {
          case ORDERID_FIELD_ID:
            if (field.type == TType.STRING) {
              this.orderId = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case CONFIRMURL_FIELD_ID:
            if (field.type == TType.STRING) {
              this.confirmUrl = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case EXTRAS_FIELD_ID:
            if (field.type == TType.MAP) {
              {
                var _map308 = iprot.readMapBegin();
                this.extras = new StringMap< String>();
                for( _i309 in 0 ... _map308.size)
                {
                  var _key310 : String;
                  var _val311 : String;
                  _key310 = iprot.readString();
                  _val311 = iprot.readString();
                  this.extras.set( _key310, _val311);
                }
                iprot.readMapEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          default:
            TProtocolUtil.skip(iprot, field.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      iprot.DecrementRecursionDepth();
    }
    catch(e:Dynamic)
    {
      iprot.DecrementRecursionDepth();
      throw e;
    }

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public function write(oprot:TProtocol) : Void {
    validate();
    oprot.IncrementRecursionDepth();
    try
    {
      oprot.writeStructBegin(STRUCT_DESC);
      if (this.orderId != null) {
        oprot.writeFieldBegin(ORDER_ID_FIELD_DESC);
        oprot.writeString(this.orderId);
        oprot.writeFieldEnd();
      }
      if (this.confirmUrl != null) {
        oprot.writeFieldBegin(CONFIRM_URL_FIELD_DESC);
        oprot.writeString(this.confirmUrl);
        oprot.writeFieldEnd();
      }
      if (this.extras != null) {
        oprot.writeFieldBegin(EXTRAS_FIELD_DESC);
        {
          var _sizeCounter313 : Int = 0;
          for( _key312 in this.extras) {
            _sizeCounter313++;
          }
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, _sizeCounter313));
          for( elem314 in this.extras.keys())
          {
            oprot.writeString(elem314);
            oprot.writeString(this.extras.get(elem314));
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
      oprot.DecrementRecursionDepth();
    }
    catch(e:Dynamic)
    {
      oprot.DecrementRecursionDepth();
      throw e;
    }
  }

  public function toString() : String {
    var ret : String = "PaymentReservationResult(";
    var first : Bool = true;

    ret += "orderId:";
    if (this.orderId == null) {
      ret += "null";
    } else {
      ret += this.orderId;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "confirmUrl:";
    if (this.confirmUrl == null) {
      ret += "null";
    } else {
      ret += this.confirmUrl;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "extras:";
    if (this.extras == null) {
      ret += "null";
    } else {
      ret += this.extras;
    }
    first = false;
    ret += ")";
    return ret;
  }

  public function validate() : Void {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

