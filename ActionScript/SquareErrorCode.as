/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package 
{
import org.apache.thrift.Set;
import flash.utils.Dictionary;
  public class SquareErrorCode   {
    public static const UNKNOWN:int = 0;
    public static const INTERNAL_ERROR:int = 500;
    public static const NOT_IMPLEMENTED:int = 501;
    public static const TRY_AGAIN_LATER:int = 503;
    public static const MAINTENANCE:int = 505;
    public static const ILLEGAL_ARGUMENT:int = 400;
    public static const AUTHENTICATION_FAILURE:int = 401;
    public static const FORBIDDEN:int = 403;
    public static const NOT_FOUND:int = 404;
    public static const REVISION_MISMATCH:int = 409;
    public static const PRECONDITION_FAILED:int = 410;

    public static const VALID_VALUES:Set = new Set(UNKNOWN, INTERNAL_ERROR, NOT_IMPLEMENTED, TRY_AGAIN_LATER, MAINTENANCE, ILLEGAL_ARGUMENT, AUTHENTICATION_FAILURE, FORBIDDEN, NOT_FOUND, REVISION_MISMATCH, PRECONDITION_FAILED);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[UNKNOWN] = "UNKNOWN";
      VALUES_TO_NAMES[INTERNAL_ERROR] = "INTERNAL_ERROR";
      VALUES_TO_NAMES[NOT_IMPLEMENTED] = "NOT_IMPLEMENTED";
      VALUES_TO_NAMES[TRY_AGAIN_LATER] = "TRY_AGAIN_LATER";
      VALUES_TO_NAMES[MAINTENANCE] = "MAINTENANCE";
      VALUES_TO_NAMES[ILLEGAL_ARGUMENT] = "ILLEGAL_ARGUMENT";
      VALUES_TO_NAMES[AUTHENTICATION_FAILURE] = "AUTHENTICATION_FAILURE";
      VALUES_TO_NAMES[FORBIDDEN] = "FORBIDDEN";
      VALUES_TO_NAMES[NOT_FOUND] = "NOT_FOUND";
      VALUES_TO_NAMES[REVISION_MISMATCH] = "REVISION_MISMATCH";
      VALUES_TO_NAMES[PRECONDITION_FAILED] = "PRECONDITION_FAILED";

    }
  }
}