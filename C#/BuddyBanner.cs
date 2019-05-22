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
public partial class BuddyBanner : TBase
{
  private BuddyBannerLinkType _buddyBannerLinkType;
  private string _buddyBannerLink;
  private string _buddyBannerImageUrl;

  /// <summary>
  /// 
  /// <seealso cref="BuddyBannerLinkType"/>
  /// </summary>
  public BuddyBannerLinkType BuddyBannerLinkType
  {
    get
    {
      return _buddyBannerLinkType;
    }
    set
    {
      __isset.buddyBannerLinkType = true;
      this._buddyBannerLinkType = value;
    }
  }

  public string BuddyBannerLink
  {
    get
    {
      return _buddyBannerLink;
    }
    set
    {
      __isset.buddyBannerLink = true;
      this._buddyBannerLink = value;
    }
  }

  public string BuddyBannerImageUrl
  {
    get
    {
      return _buddyBannerImageUrl;
    }
    set
    {
      __isset.buddyBannerImageUrl = true;
      this._buddyBannerImageUrl = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool buddyBannerLinkType;
    public bool buddyBannerLink;
    public bool buddyBannerImageUrl;
  }

  public BuddyBanner() {
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
          case 1:
            if (field.Type == TType.I32) {
              BuddyBannerLinkType = (BuddyBannerLinkType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              BuddyBannerLink = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              BuddyBannerImageUrl = iprot.ReadString();
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
      TStruct struc = new TStruct("BuddyBanner");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.buddyBannerLinkType) {
        field.Name = "buddyBannerLinkType";
        field.Type = TType.I32;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)BuddyBannerLinkType);
        oprot.WriteFieldEnd();
      }
      if (BuddyBannerLink != null && __isset.buddyBannerLink) {
        field.Name = "buddyBannerLink";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(BuddyBannerLink);
        oprot.WriteFieldEnd();
      }
      if (BuddyBannerImageUrl != null && __isset.buddyBannerImageUrl) {
        field.Name = "buddyBannerImageUrl";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(BuddyBannerImageUrl);
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
    StringBuilder __sb = new StringBuilder("BuddyBanner(");
    bool __first = true;
    if (__isset.buddyBannerLinkType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("BuddyBannerLinkType: ");
      __sb.Append(BuddyBannerLinkType);
    }
    if (BuddyBannerLink != null && __isset.buddyBannerLink) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("BuddyBannerLink: ");
      __sb.Append(BuddyBannerLink);
    }
    if (BuddyBannerImageUrl != null && __isset.buddyBannerImageUrl) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("BuddyBannerImageUrl: ");
      __sb.Append(BuddyBannerImageUrl);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

