/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;

class SnsIdType {
  public static inline var FACEBOOK : Int = 1;
  public static inline var SINA : Int = 2;
  public static inline var RENREN : Int = 3;
  public static inline var FEIXIN : Int = 4;
  public static inline var BBM : Int = 5;

  public static var VALID_VALUES = { new IntSet( [FACEBOOK, SINA, RENREN, FEIXIN, BBM]); };
  public static var VALUES_TO_NAMES = { [
    FACEBOOK => "FACEBOOK",
    SINA => "SINA",
    RENREN => "RENREN",
    FEIXIN => "FEIXIN",
    BBM => "BBM"
  ]; };
}
