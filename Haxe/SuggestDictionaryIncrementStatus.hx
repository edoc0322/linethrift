/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class SuggestDictionaryIncrementStatus {
  public static inline var SUCCESS : Int = 0;
  public static inline var INVALID_REVISION : Int = 1;
  public static inline var TOO_LARGE_DATA : Int = 2;
  public static inline var SCHEME_CHANGED : Int = 3;
  public static inline var RETRY : Int = 4;
  public static inline var FAIL : Int = 5;
  public static inline var TOO_OLD_DATA : Int = 6;

  public static var VALID_VALUES = { new IntSet( [SUCCESS, INVALID_REVISION, TOO_LARGE_DATA, SCHEME_CHANGED, RETRY, FAIL, TOO_OLD_DATA]); };
  public static var VALUES_TO_NAMES = { [
    SUCCESS => "SUCCESS",
    INVALID_REVISION => "INVALID_REVISION",
    TOO_LARGE_DATA => "TOO_LARGE_DATA",
    SCHEME_CHANGED => "SCHEME_CHANGED",
    RETRY => "RETRY",
    FAIL => "FAIL",
    TOO_OLD_DATA => "TOO_OLD_DATA"
  ]; };
}
