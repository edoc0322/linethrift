/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.sub_type;

class SubType {
  static const int GENERAL = 0;
  static const int CREATORS = 1;

  static final Set<int> VALID_VALUES = new Set.from([
    GENERAL
    , CREATORS
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    GENERAL: 'GENERAL'
    , CREATORS: 'CREATORS'
  };
}