/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.email_confirmation_type;

class EmailConfirmationType {
  static const int SERVER_SIDE_EMAIL = 0;
  static const int CLIENT_SIDE_EMAIL = 1;

  static final Set<int> VALID_VALUES = new Set.from([
    SERVER_SIDE_EMAIL
    , CLIENT_SIDE_EMAIL
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    SERVER_SIDE_EMAIL: 'SERVER_SIDE_EMAIL'
    , CLIENT_SIDE_EMAIL: 'CLIENT_SIDE_EMAIL'
  };
}
