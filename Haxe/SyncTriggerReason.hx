/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class SyncTriggerReason {
  public static inline var OTHER : Int = 0;
  public static inline var REVISION_GAP_TOO_LARGE : Int = 1;
  public static inline var OPERATION_EXPIRED : Int = 2;

  public static var VALID_VALUES = { new IntSet( [OTHER, REVISION_GAP_TOO_LARGE, OPERATION_EXPIRED]); };
  public static var VALUES_TO_NAMES = { [
    OTHER => "OTHER",
    REVISION_GAP_TOO_LARGE => "REVISION_GAP_TOO_LARGE",
    OPERATION_EXPIRED => "OPERATION_EXPIRED"
  ]; };
}
