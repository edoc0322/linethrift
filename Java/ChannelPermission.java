/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2019-09-28")
public enum ChannelPermission implements org.apache.thrift.TEnum {
  PROFILE(0),
  FRIENDS(1),
  GROUP(2);

  private final int value;

  private ChannelPermission(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static ChannelPermission findByValue(int value) { 
    switch (value) {
      case 0:
        return PROFILE;
      case 1:
        return FRIENDS;
      case 2:
        return GROUP;
      default:
        return null;
    }
  }
}
