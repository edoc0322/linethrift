/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
library line.src.contact_setting;

class ContactSetting {
  static const int CONTACT_SETTING_NOTIFICATION_DISABLE = 1;
  static const int CONTACT_SETTING_DISPLAY_NAME_OVERRIDE = 2;
  static const int CONTACT_SETTING_CONTACT_HIDE = 4;
  static const int CONTACT_SETTING_FAVORITE = 8;
  static const int CONTACT_SETTING_DELETE = 16;

  static final Set<int> VALID_VALUES = new Set.from([
    CONTACT_SETTING_NOTIFICATION_DISABLE
    , CONTACT_SETTING_DISPLAY_NAME_OVERRIDE
    , CONTACT_SETTING_CONTACT_HIDE
    , CONTACT_SETTING_FAVORITE
    , CONTACT_SETTING_DELETE
  ]);
  static final Map<int, String> VALUES_TO_NAMES = {
    CONTACT_SETTING_NOTIFICATION_DISABLE: 'CONTACT_SETTING_NOTIFICATION_DISABLE'
    , CONTACT_SETTING_DISPLAY_NAME_OVERRIDE: 'CONTACT_SETTING_DISPLAY_NAME_OVERRIDE'
    , CONTACT_SETTING_CONTACT_HIDE: 'CONTACT_SETTING_CONTACT_HIDE'
    , CONTACT_SETTING_FAVORITE: 'CONTACT_SETTING_FAVORITE'
    , CONTACT_SETTING_DELETE: 'CONTACT_SETTING_DELETE'
  };
}
