/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum PMType implements org.apache.thrift.TEnum {
  DEFAULT(1),
  VIEW_VIDEO(2);

  private final int value;

  private PMType(int value) {
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
  public static PMType findByValue(int value) { 
    switch (value) {
      case 1:
        return DEFAULT;
      case 2:
        return VIEW_VIDEO;
      default:
        return null;
    }
  }
}
