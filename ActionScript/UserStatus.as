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
  public class UserStatus   {
    public static const NORMAL:int = 0;
    public static const UNBOUND:int = 1;
    public static const UNREGISTERED:int = 2;

    public static const VALID_VALUES:Set = new Set(NORMAL, UNBOUND, UNREGISTERED);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[NORMAL] = "NORMAL";
      VALUES_TO_NAMES[UNBOUND] = "UNBOUND";
      VALUES_TO_NAMES[UNREGISTERED] = "UNREGISTERED";

    }
  }
}
