/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.redirect_type;

class RedirectType {
  static const int NONE = 0;
  static const int EXPIRE_SECOND = 1;

  static final Set<int> VALID_VALUES = new Set.from([
    NONE
    , EXPIRE_SECOND
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    NONE: 'NONE'
    , EXPIRE_SECOND: 'EXPIRE_SECOND'
  };
}
