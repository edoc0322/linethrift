/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class SquareFeatureSetAttribute {
  public static inline var CREATING_SECRET_SQUARE_CHAT : Int = 1;
  public static inline var INVITING_INTO_OPEN_SQUARE_CHAT : Int = 2;

  public static var VALID_VALUES = { new IntSet( [CREATING_SECRET_SQUARE_CHAT, INVITING_INTO_OPEN_SQUARE_CHAT]); };
  public static var VALUES_TO_NAMES = { [
    CREATING_SECRET_SQUARE_CHAT => "CREATING_SECRET_SQUARE_CHAT",
    INVITING_INTO_OPEN_SQUARE_CHAT => "INVITING_INTO_OPEN_SQUARE_CHAT"
  ]; };
}
