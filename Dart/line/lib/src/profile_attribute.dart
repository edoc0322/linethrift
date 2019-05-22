/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.profile_attribute;

class ProfileAttribute {
  static const int ALL = 511;
  static const int EMAIL = 1;
  static const int DISPLAY_NAME = 2;
  static const int PHONETIC_NAME = 4;
  static const int PICTURE = 8;
  static const int STATUS_MESSAGE = 16;
  static const int ALLOW_SEARCH_BY_USERID = 32;
  static const int ALLOW_SEARCH_BY_EMAIL = 64;
  static const int BUDDY_STATUS = 128;
  static const int MUSIC_PROFILE = 256;

  static final Set<int> VALID_VALUES = new Set.from([
    ALL
    , EMAIL
    , DISPLAY_NAME
    , PHONETIC_NAME
    , PICTURE
    , STATUS_MESSAGE
    , ALLOW_SEARCH_BY_USERID
    , ALLOW_SEARCH_BY_EMAIL
    , BUDDY_STATUS
    , MUSIC_PROFILE
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    ALL: 'ALL'
    , EMAIL: 'EMAIL'
    , DISPLAY_NAME: 'DISPLAY_NAME'
    , PHONETIC_NAME: 'PHONETIC_NAME'
    , PICTURE: 'PICTURE'
    , STATUS_MESSAGE: 'STATUS_MESSAGE'
    , ALLOW_SEARCH_BY_USERID: 'ALLOW_SEARCH_BY_USERID'
    , ALLOW_SEARCH_BY_EMAIL: 'ALLOW_SEARCH_BY_EMAIL'
    , BUDDY_STATUS: 'BUDDY_STATUS'
    , MUSIC_PROFILE: 'MUSIC_PROFILE'
  };
}
