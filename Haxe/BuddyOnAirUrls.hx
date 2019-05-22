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


class BuddyOnAirUrls implements TBase {
  
  static var STRUCT_DESC = { new TStruct("BuddyOnAirUrls"); };
  static var HLS_FIELD_DESC = { new TField("hls", TType.MAP, 1); };
  static var SMOOTH_STREAMING_FIELD_DESC = { new TField("smoothStreaming", TType.MAP, 2); };

  @:isVar
  public var hls(get,set) : StringMap< String>;
  @:isVar
  public var smoothStreaming(get,set) : StringMap< String>;

  inline static var HLS_FIELD_ID : Int = 1;
  inline static var SMOOTHSTREAMING_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_hls() : StringMap< String> {
    return this.hls;
  }

  public function set_hls(hls:StringMap< String>) : StringMap< String> {
    this.hls = hls;
    return this.hls;
  }

  public function unsetHls() : Void {
    this.hls = null;
  }

  // Returns true if field hls is set (has been assigned a value) and false otherwise
  public function isSetHls() : Bool {
    return this.hls != null;
  }

  public function get_smoothStreaming() : StringMap< String> {
    return this.smoothStreaming;
  }

  public function set_smoothStreaming(smoothStreaming:StringMap< String>) : StringMap< String> {
    this.smoothStreaming = smoothStreaming;
    return this.smoothStreaming;
  }

  public function unsetSmoothStreaming() : Void {
    this.smoothStreaming = null;
  }

  // Returns true if field smoothStreaming is set (has been assigned a value) and false otherwise
  public function isSetSmoothStreaming() : Bool {
    return this.smoothStreaming != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case HLS_FIELD_ID:
      if (value == null) {
        unsetHls();
      } else {
        this.hls = value;
      }

    case SMOOTHSTREAMING_FIELD_ID:
      if (value == null) {
        unsetSmoothStreaming();
      } else {
        this.smoothStreaming = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case HLS_FIELD_ID:
      return this.hls;
    case SMOOTHSTREAMING_FIELD_ID:
      return this.smoothStreaming;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case HLS_FIELD_ID:
      return isSetHls();
    case SMOOTHSTREAMING_FIELD_ID:
      return isSetSmoothStreaming();
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
          case HLS_FIELD_ID:
            if (field.type == TType.MAP) {
              {
                var _map167 = iprot.readMapBegin();
                this.hls = new StringMap< String>();
                for( _i168 in 0 ... _map167.size)
                {
                  var _key169 : String;
                  var _val170 : String;
                  _key169 = iprot.readString();
                  _val170 = iprot.readString();
                  this.hls.set( _key169, _val170);
                }
                iprot.readMapEnd();
              }
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case SMOOTHSTREAMING_FIELD_ID:
            if (field.type == TType.MAP) {
              {
                var _map171 = iprot.readMapBegin();
                this.smoothStreaming = new StringMap< String>();
                for( _i172 in 0 ... _map171.size)
                {
                  var _key173 : String;
                  var _val174 : String;
                  _key173 = iprot.readString();
                  _val174 = iprot.readString();
                  this.smoothStreaming.set( _key173, _val174);
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
      if (this.hls != null) {
        oprot.writeFieldBegin(HLS_FIELD_DESC);
        {
          var _sizeCounter176 : Int = 0;
          for( _key175 in this.hls) {
            _sizeCounter176++;
          }
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, _sizeCounter176));
          for( elem177 in this.hls.keys())
          {
            oprot.writeString(elem177);
            oprot.writeString(this.hls.get(elem177));
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (this.smoothStreaming != null) {
        oprot.writeFieldBegin(SMOOTH_STREAMING_FIELD_DESC);
        {
          var _sizeCounter179 : Int = 0;
          for( _key178 in this.smoothStreaming) {
            _sizeCounter179++;
          }
          oprot.writeMapBegin(new TMap(TType.STRING, TType.STRING, _sizeCounter179));
          for( elem180 in this.smoothStreaming.keys())
          {
            oprot.writeString(elem180);
            oprot.writeString(this.smoothStreaming.get(elem180));
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
    var ret : String = "BuddyOnAirUrls(";
    var first : Bool = true;

    ret += "hls:";
    if (this.hls == null) {
      ret += "null";
    } else {
      ret += this.hls;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "smoothStreaming:";
    if (this.smoothStreaming == null) {
      ret += "null";
    } else {
      ret += this.smoothStreaming;
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

