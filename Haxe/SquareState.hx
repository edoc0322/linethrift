/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class SquareState {
  public static inline var ALIVE : Int = 0;
  public static inline var DELETED : Int = 1;
  public static inline var SUSPENDED : Int = 2;

  public static var VALID_VALUES = { new IntSet( [ALIVE, DELETED, SUSPENDED]); };
  public static var VALUES_TO_NAMES = { [
    ALIVE => "ALIVE",
    DELETED => "DELETED",
    SUSPENDED => "SUSPENDED"
  ]; };
}
