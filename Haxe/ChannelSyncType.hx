/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class ChannelSyncType {
  public static inline var SYNC : Int = 0;
  public static inline var REMOVE : Int = 1;
  public static inline var REMOVE_ALL : Int = 2;

  public static var VALID_VALUES = { new IntSet( [SYNC, REMOVE, REMOVE_ALL]); };
  public static var VALUES_TO_NAMES = { [
    SYNC => "SYNC",
    REMOVE => "REMOVE",
    REMOVE_ALL => "REMOVE_ALL"
  ]; };
}
