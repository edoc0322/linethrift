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
  public class SnsIdType   {
    public static const FACEBOOK:int = 1;
    public static const SINA:int = 2;
    public static const RENREN:int = 3;
    public static const FEIXIN:int = 4;
    public static const BBM:int = 5;

    public static const VALID_VALUES:Set = new Set(FACEBOOK, SINA, RENREN, FEIXIN, BBM);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[FACEBOOK] = "FACEBOOK";
      VALUES_TO_NAMES[SINA] = "SINA";
      VALUES_TO_NAMES[RENREN] = "RENREN";
      VALUES_TO_NAMES[FEIXIN] = "FEIXIN";
      VALUES_TO_NAMES[BBM] = "BBM";

    }
  }
}