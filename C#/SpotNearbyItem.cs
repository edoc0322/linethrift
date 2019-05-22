/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class SpotNearbyItem : TBase
{
  private SpotItem _spotItem;
  private Location _location;

  public SpotItem SpotItem
  {
    get
    {
      return _spotItem;
    }
    set
    {
      __isset.spotItem = true;
      this._spotItem = value;
    }
  }

  public Location Location
  {
    get
    {
      return _location;
    }
    set
    {
      __isset.location = true;
      this._location = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool spotItem;
    public bool location;
  }

  public SpotNearbyItem() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 2:
            if (field.Type == TType.Struct) {
              SpotItem = new SpotItem();
              SpotItem.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.Struct) {
              Location = new Location();
              Location.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("SpotNearbyItem");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SpotItem != null && __isset.spotItem) {
        field.Name = "spotItem";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        SpotItem.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Location != null && __isset.location) {
        field.Name = "location";
        field.Type = TType.Struct;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        Location.Write(oprot);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("SpotNearbyItem(");
    bool __first = true;
    if (SpotItem != null && __isset.spotItem) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SpotItem: ");
      __sb.Append(SpotItem== null ? "<null>" : SpotItem.ToString());
    }
    if (Location != null && __isset.location) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Location: ");
      __sb.Append(Location== null ? "<null>" : Location.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

