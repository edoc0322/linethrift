/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum AsymmetricKeyAlgorithm implements org.apache.thrift.TEnum {
  ASYMMETRIC_KEY_ALGORITHM_RSA(1),
  ASYMMETRIC_KEY_ALGORITHM_ECDH(2);

  private final int value;

  private AsymmetricKeyAlgorithm(int value) {
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
  public static AsymmetricKeyAlgorithm findByValue(int value) { 
    switch (value) {
      case 1:
        return ASYMMETRIC_KEY_ALGORITHM_RSA;
      case 2:
        return ASYMMETRIC_KEY_ALGORITHM_ECDH;
      default:
        return null;
    }
  }
}
