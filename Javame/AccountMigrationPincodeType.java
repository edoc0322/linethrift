/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
public class AccountMigrationPincodeType implements org.apache.thrift.TEnum {

  public static final AccountMigrationPincodeType NOT_APPLICABLE = new AccountMigrationPincodeType(0);
  public static final AccountMigrationPincodeType NOT_SET = new AccountMigrationPincodeType(1);
  public static final AccountMigrationPincodeType SET = new AccountMigrationPincodeType(2);
  public static final AccountMigrationPincodeType NEED_ENFORCED_INPUT = new AccountMigrationPincodeType(3);

  private final int value;

  private AccountMigrationPincodeType(int value) {
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
  public static AccountMigrationPincodeType findByValue(int value) { 
    switch (value) {
      case 0:
        return NOT_APPLICABLE;
      case 1:
        return NOT_SET;
      case 2:
        return SET;
      case 3:
        return NEED_ENFORCED_INPUT;
      default:
        return null;
    }
  }
}
