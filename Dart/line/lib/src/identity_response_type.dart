/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.identity_response_type;

class IdentityResponseType {
  static const int UNKNOWN = 0;
  static const int SUCCESS = 1;
  static const int REQUIRE_SERVER_SIDE_EMAIL = 2;
  static const int REQUIRE_CLIENT_SIDE_EMAIL = 3;

  static final Set<int> VALID_VALUES = new Set.from([
    UNKNOWN
    , SUCCESS
    , REQUIRE_SERVER_SIDE_EMAIL
    , REQUIRE_CLIENT_SIDE_EMAIL
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    UNKNOWN: 'UNKNOWN'
    , SUCCESS: 'SUCCESS'
    , REQUIRE_SERVER_SIDE_EMAIL: 'REQUIRE_SERVER_SIDE_EMAIL'
    , REQUIRE_CLIENT_SIDE_EMAIL: 'REQUIRE_CLIENT_SIDE_EMAIL'
  };
}
