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
public partial class ReportSquareMessageRequest : TBase
{
  private string _squareMid;
  private string _squareChatMid;
  private string _squareMessageId;
  private ReportType _reportType;
  private string _otherReason;

  public string SquareMid
  {
    get
    {
      return _squareMid;
    }
    set
    {
      __isset.squareMid = true;
      this._squareMid = value;
    }
  }

  public string SquareChatMid
  {
    get
    {
      return _squareChatMid;
    }
    set
    {
      __isset.squareChatMid = true;
      this._squareChatMid = value;
    }
  }

  public string SquareMessageId
  {
    get
    {
      return _squareMessageId;
    }
    set
    {
      __isset.squareMessageId = true;
      this._squareMessageId = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="ReportType"/>
  /// </summary>
  public ReportType ReportType
  {
    get
    {
      return _reportType;
    }
    set
    {
      __isset.reportType = true;
      this._reportType = value;
    }
  }

  public string OtherReason
  {
    get
    {
      return _otherReason;
    }
    set
    {
      __isset.otherReason = true;
      this._otherReason = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool squareMid;
    public bool squareChatMid;
    public bool squareMessageId;
    public bool reportType;
    public bool otherReason;
  }

  public ReportSquareMessageRequest() {
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
            if (field.Type == TType.String) {
              SquareMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.String) {
              SquareChatMid = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.String) {
              SquareMessageId = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.I32) {
              ReportType = (ReportType)iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.String) {
              OtherReason = iprot.ReadString();
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
      TStruct struc = new TStruct("ReportSquareMessageRequest");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (SquareMid != null && __isset.squareMid) {
        field.Name = "squareMid";
        field.Type = TType.String;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareMid);
        oprot.WriteFieldEnd();
      }
      if (SquareChatMid != null && __isset.squareChatMid) {
        field.Name = "squareChatMid";
        field.Type = TType.String;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareChatMid);
        oprot.WriteFieldEnd();
      }
      if (SquareMessageId != null && __isset.squareMessageId) {
        field.Name = "squareMessageId";
        field.Type = TType.String;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(SquareMessageId);
        oprot.WriteFieldEnd();
      }
      if (__isset.reportType) {
        field.Name = "reportType";
        field.Type = TType.I32;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)ReportType);
        oprot.WriteFieldEnd();
      }
      if (OtherReason != null && __isset.otherReason) {
        field.Name = "otherReason";
        field.Type = TType.String;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(OtherReason);
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
    StringBuilder __sb = new StringBuilder("ReportSquareMessageRequest(");
    bool __first = true;
    if (SquareMid != null && __isset.squareMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareMid: ");
      __sb.Append(SquareMid);
    }
    if (SquareChatMid != null && __isset.squareChatMid) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareChatMid: ");
      __sb.Append(SquareChatMid);
    }
    if (SquareMessageId != null && __isset.squareMessageId) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("SquareMessageId: ");
      __sb.Append(SquareMessageId);
    }
    if (__isset.reportType) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("ReportType: ");
      __sb.Append(ReportType);
    }
    if (OtherReason != null && __isset.otherReason) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("OtherReason: ");
      __sb.Append(OtherReason);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

