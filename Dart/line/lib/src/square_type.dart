/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.square_type;

class SquareType {
  static const int CLOSED = 0;
  static const int OPEN = 1;

  static final Set<int> VALID_VALUES = new Set.from([
    CLOSED
    , OPEN
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    CLOSED: 'CLOSED'
    , OPEN: 'OPEN'
  };
}
