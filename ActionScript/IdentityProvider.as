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
  public class IdentityProvider   {
    public static const UNKNOWN:int = 0;
    public static const LINE:int = 1;
    public static const NAVER_KR:int = 2;
    public static const LINE_PHONE:int = 3;

    public static const VALID_VALUES:Set = new Set(UNKNOWN, LINE, NAVER_KR, LINE_PHONE);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[UNKNOWN] = "UNKNOWN";
      VALUES_TO_NAMES[LINE] = "LINE";
      VALUES_TO_NAMES[NAVER_KR] = "NAVER_KR";
      VALUES_TO_NAMES[LINE_PHONE] = "LINE_PHONE";

    }
  }
}
