/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class AvailableChatTypes {
  public static inline var PERSONAL : Int = 1;
  public static inline var ROOM : Int = 2;
  public static inline var GROUP : Int = 3;
  public static inline var SQUARE_CHAT : Int = 4;

  public static var VALID_VALUES = { new IntSet( [PERSONAL, ROOM, GROUP, SQUARE_CHAT]); };
  public static var VALUES_TO_NAMES = { [
    PERSONAL => "PERSONAL",
    ROOM => "ROOM",
    GROUP => "GROUP",
    SQUARE_CHAT => "SQUARE_CHAT"
  ]; };
}
