/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.chat_app_exception_code;

class ChatAppExceptionCode {
  static const int INVALID_REQUEST = 1;
  static const int UNAUTHORIZED = 2;
  static const int SERVER_ERROR = 100;

  static final Set<int> VALID_VALUES = new Set.from([
    INVALID_REQUEST
    , UNAUTHORIZED
    , SERVER_ERROR
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    INVALID_REQUEST: 'INVALID_REQUEST'
    , UNAUTHORIZED: 'UNAUTHORIZED'
    , SERVER_ERROR: 'SERVER_ERROR'
  };
}
