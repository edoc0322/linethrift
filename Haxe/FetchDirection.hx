/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class FetchDirection {
  public static inline var FORWARD : Int = 1;
  public static inline var BACKWARD : Int = 2;

  public static var VALID_VALUES = { new IntSet( [FORWARD, BACKWARD]); };
  public static var VALUES_TO_NAMES = { [
    FORWARD => "FORWARD",
    BACKWARD => "BACKWARD"
  ]; };
}
