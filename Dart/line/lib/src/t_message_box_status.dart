/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.t_message_box_status;

class TMessageBoxStatus {
  static const int ACTIVATED = 1;
  static const int UNREAD = 2;

  static final Set<int> VALID_VALUES = new Set.from([
    ACTIVATED
    , UNREAD
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    ACTIVATED: 'ACTIVATED'
    , UNREAD: 'UNREAD'
  };
}
