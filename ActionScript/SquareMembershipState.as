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
  public class SquareMembershipState   {
    public static const JOIN_REQUESTED:int = 1;
    public static const JOINED:int = 2;
    public static const REJECTED:int = 3;
    public static const LEFT:int = 4;
    public static const KICK_OUT:int = 5;
    public static const BANNED:int = 6;
    public static const DELETED:int = 7;

    public static const VALID_VALUES:Set = new Set(JOIN_REQUESTED, JOINED, REJECTED, LEFT, KICK_OUT, BANNED, DELETED);
    public static const VALUES_TO_NAMES:Dictionary = new Dictionary();
    {
      VALUES_TO_NAMES[JOIN_REQUESTED] = "JOIN_REQUESTED";
      VALUES_TO_NAMES[JOINED] = "JOINED";
      VALUES_TO_NAMES[REJECTED] = "REJECTED";
      VALUES_TO_NAMES[LEFT] = "LEFT";
      VALUES_TO_NAMES[KICK_OUT] = "KICK_OUT";
      VALUES_TO_NAMES[BANNED] = "BANNED";
      VALUES_TO_NAMES[DELETED] = "DELETED";

    }
  }
}
