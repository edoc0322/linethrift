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


class SearchCollection_args implements TBase {
  
  static var STRUCT_DESC = { new TStruct("searchCollection_args"); };
  static var QUERY_FIELD_DESC = { new TField("query", TType.STRING, 1); };
  static var PARAM_FIELD_DESC = { new TField("param", TType.STRUCT, 2); };

  @:isVar
  public var query(get,set) : String;
  @:isVar
  public var param(get,set) : SearchPagingParameter;

  inline static var QUERY_FIELD_ID : Int = 1;
  inline static var PARAM_FIELD_ID : Int = 2;


  public function new() {
  }

  public function get_query() : String {
    return this.query;
  }

  public function set_query(query:String) : String {
    this.query = query;
    return this.query;
  }

  public function unsetQuery() : Void {
    this.query = null;
  }

  // Returns true if field query is set (has been assigned a value) and false otherwise
  public function isSetQuery() : Bool {
    return this.query != null;
  }

  public function get_param() : SearchPagingParameter {
    return this.param;
  }

  public function set_param(param:SearchPagingParameter) : SearchPagingParameter {
    this.param = param;
    return this.param;
  }

  public function unsetParam() : Void {
    this.param = null;
  }

  // Returns true if field param is set (has been assigned a value) and false otherwise
  public function isSetParam() : Bool {
    return this.param != null;
  }

  public function setFieldValue(fieldID : Int, value : Dynamic) : Void {
    switch (fieldID) {
    case QUERY_FIELD_ID:
      if (value == null) {
        unsetQuery();
      } else {
        this.query = value;
      }

    case PARAM_FIELD_ID:
      if (value == null) {
        unsetParam();
      } else {
        this.param = value;
      }

    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  public function getFieldValue(fieldID : Int) : Dynamic {
    switch (fieldID) {
    case QUERY_FIELD_ID:
      return this.query;
    case PARAM_FIELD_ID:
      return this.param;
    default:
      throw new ArgumentError("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public function isSet(fieldID : Int) : Bool {
    switch (fieldID) {
    case QUERY_FIELD_ID:
      return isSetQuery();
    case PARAM_FIELD_ID:
      return isSetParam();
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
          case QUERY_FIELD_ID:
            if (field.type == TType.STRING) {
              this.query = iprot.readString();
            } else { 
              TProtocolUtil.skip(iprot, field.type);
            }
          case PARAM_FIELD_ID:
            if (field.type == TType.STRUCT) {
              this.param = new SearchPagingParameter();
              this.param.read(iprot);
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
      if (this.query != null) {
        oprot.writeFieldBegin(QUERY_FIELD_DESC);
        oprot.writeString(this.query);
        oprot.writeFieldEnd();
      }
      if (this.param != null) {
        oprot.writeFieldBegin(PARAM_FIELD_DESC);
        this.param.write(oprot);
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
    var ret : String = "searchCollection_args(";
    var first : Bool = true;

    ret += "query:";
    if (this.query == null) {
      ret += "null";
    } else {
      ret += this.query;
    }
    first = false;
    if (!first) ret +=  ", ";
    ret += "param:";
    if (this.param == null) {
      ret += "null";
    } else {
      ret += this.param;
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

