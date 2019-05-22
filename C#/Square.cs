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
public partial class Square : TBase
{
  private string _mid;
  private string _name;
  private string _welcomeMessage;
  private string _profileImageObsHash;
  private string _desc;
  private bool _searchable;
  private SquareType _type;
  private int _categoryID;
  private string _invitationURL;
  private long _revision;
  private bool _ableToUseInvitationTicket;
  private SquareState _state;

  public string Mid
  {
    get
    {
      return _mid;
    }
    set
    {
      __isset.mid = true;
      this._mid = value;
    }
  }

  public string Name
  {
    get
    {
      return _name;
    }
    set
    {
      __isset.name = true;
      this._name = value;
    }
  }

  public string WelcomeMessage
  {
    get
    {
      return _welcomeMessage;
    }
    set
    {
      __isset.welcomeMessage = true;
      this._welcomeMessage = value;
    }
  }

  public string ProfileImageObsHash
  {
    get
    {
      return _profileImageObsHash;
    }
    set
    {
      __isset.profileImageObsHash = true;
      this._profileImageObsHash = value;
    }
  }

  public string Desc
  {
    get
    {
      return _desc;
    }
    set
    {
      __isset.desc = true;
      this._desc = value;
    }
  }

  public bool Searchable
  {
    get
    {
      return _searchable;
    }
    set
    {
      __isset.searchable = true;
      this._searchable = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareType"/>
  /// </summary>
  public SquareType Type
  {
    get
    {
      return _type;
    }
    set
    {
      __isset.type = true;
      this._type = value;
    }
  }

  public int CategoryID
  {
    get
    {
      return _categoryID;
    }
    set
    {
      __isset.categoryID = true;
      this._categoryID = value;
    }
  }

  public string InvitationURL
  {
    get
    {
      return _invitationURL;
    }
    set
    {
      __isset.invitationURL = true;
      this._invitationURL = value;
    }
  }

  public long Revision
  {
    get
    {
      return _revision;
    }
    set
    {
      __isset.revision = true;
      this._revision = value;
    }
  }

  public bool AbleToUseInvitationTicket
  {
    get
    {
      return _ableToUseInvitationTicket;
    }
    set
    {
      __isset.ableToUseInvitationTicket = true;
      this._ableToUseInvitationTicket = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="SquareState"/>
  /// </summary>
  public SquareState State
  {
    get
    {
      return _state;
    }
    set
    {
      __isset.state = true;
      this._state = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool mid;
    public bool name;
    public bool welcomeMessage;
    public bool profileImageObsHash;
    public bool desc;
    public bool searchable;
    public bool type;
    public bool categoryID;
    public bool invitationURL;
    public bool revision;
    public bool ableToUseInvitationTicket;
    public bool state;
  }

  public Square() {
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
            if (field.Type == TType.String) {
              Mid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.String) {
              Name = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              WelcomeMessage = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              ProfileImageObsHash = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.String) {
              Desc = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Bool) {
              Searchable = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.I32) {
              Type = (SquareType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 8:
            if (field.Type == TType.I32) {
              CategoryID = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 9:
            if (field.Type == TType.String) {
              InvitationURL = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 10:
            if (field.Type == TType.I64) {
              Revision = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 11:
            if (field.Type == TType.Bool) {
              AbleToUseInvitationTicket = iprot.ReadBool();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 12:
            if (field.Type == TType.I32) {
              State = (SquareState)iprot.ReadI32();
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
      TStruct struc = new TStruct("Square");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Mid != null && __isset.mid) {
        field.Name = "mid";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Mid);
        oprot.WriteFieldEnd();
      }
      if (Name != null && __isset.name) {
        field.Name = "name";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Name);
        oprot.WriteFieldEnd();
      }
      if (WelcomeMessage != null && __isset.welcomeMessage) {
        field.Name = "welcomeMessage";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(WelcomeMessage);
        oprot.WriteFieldEnd();
      }
      if (ProfileImageObsHash != null && __isset.profileImageObsHash) {
        field.Name = "profileImageObsHash";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(ProfileImageObsHash);
        oprot.WriteFieldEnd();
      }
      if (Desc != null && __isset.desc) {
        field.Name = "desc";
        field.Type = TType.String;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Desc);
        oprot.WriteFieldEnd();
      }
      if (__isset.searchable) {
        field.Name = "searchable";
        field.Type = TType.Bool;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(Searchable);
        oprot.WriteFieldEnd();
      }
      if (__isset.type) {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Type);
        oprot.WriteFieldEnd();
      }
      if (__isset.categoryID) {
        field.Name = "categoryID";
        field.Type = TType.I32;
        field.ID = 8;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(CategoryID);
        oprot.WriteFieldEnd();
      }
      if (InvitationURL != null && __isset.invitationURL) {
        field.Name = "invitationURL";
        field.Type = TType.String;
        field.ID = 9;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(InvitationURL);
        oprot.WriteFieldEnd();
      }
      if (__isset.revision) {
        field.Name = "revision";
        field.Type = TType.I64;
        field.ID = 10;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Revision);
        oprot.WriteFieldEnd();
      }
      if (__isset.ableToUseInvitationTicket) {
        field.Name = "ableToUseInvitationTicket";
        field.Type = TType.Bool;
        field.ID = 11;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(AbleToUseInvitationTicket);
        oprot.WriteFieldEnd();
      }
      if (__isset.state) {
        field.Name = "state";
        field.Type = TType.I32;
        field.ID = 12;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)State);
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
    StringBuilder __sb = new StringBuilder("Square(");
    bool __first = true;
    if (Mid != null && __isset.mid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Mid: ");
      __sb.Append(Mid);
    }
    if (Name != null && __isset.name) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Name: ");
      __sb.Append(Name);
    }
    if (WelcomeMessage != null && __isset.welcomeMessage) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("WelcomeMessage: ");
      __sb.Append(WelcomeMessage);
    }
    if (ProfileImageObsHash != null && __isset.profileImageObsHash) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ProfileImageObsHash: ");
      __sb.Append(ProfileImageObsHash);
    }
    if (Desc != null && __isset.desc) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Desc: ");
      __sb.Append(Desc);
    }
    if (__isset.searchable) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Searchable: ");
      __sb.Append(Searchable);
    }
    if (__isset.type) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Type: ");
      __sb.Append(Type);
    }
    if (__isset.categoryID) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("CategoryID: ");
      __sb.Append(CategoryID);
    }
    if (InvitationURL != null && __isset.invitationURL) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("InvitationURL: ");
      __sb.Append(InvitationURL);
    }
    if (__isset.revision) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Revision: ");
      __sb.Append(Revision);
    }
    if (__isset.ableToUseInvitationTicket) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("AbleToUseInvitationTicket: ");
      __sb.Append(AbleToUseInvitationTicket);
    }
    if (__isset.state) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("State: ");
      __sb.Append(State);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
