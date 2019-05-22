/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum NotificationStatus implements org.apache.thrift.TEnum {
  NOTIFICATION_ITEM_EXIST(1),
  TIMELINE_ITEM_EXIST(2),
  NOTE_GROUP_NEW_ITEM_EXIST(4),
  TIMELINE_BUDDYGROUP_CHANGED(8),
  NOTE_ONE_TO_ONE_NEW_ITEM_EXIST(16),
  ALBUM_ITEM_EXIST(32),
  TIMELINE_ITEM_DELETED(64),
  OTOGROUP_ITEM_EXIST(128),
  GROUPHOME_NEW_ITEM_EXIST(256),
  GROUPHOME_HIDDEN_ITEM_CHANGED(512),
  NOTIFICATION_ITEM_CHANGED(1024),
  BEAD_ITEM_HIDE(2048),
  BEAD_ITEM_SHOW(4096);

  private final int value;

  private NotificationStatus(int value) {
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
  public static NotificationStatus findByValue(int value) { 
    switch (value) {
      case 1:
        return NOTIFICATION_ITEM_EXIST;
      case 2:
        return TIMELINE_ITEM_EXIST;
      case 4:
        return NOTE_GROUP_NEW_ITEM_EXIST;
      case 8:
        return TIMELINE_BUDDYGROUP_CHANGED;
      case 16:
        return NOTE_ONE_TO_ONE_NEW_ITEM_EXIST;
      case 32:
        return ALBUM_ITEM_EXIST;
      case 64:
        return TIMELINE_ITEM_DELETED;
      case 128:
        return OTOGROUP_ITEM_EXIST;
      case 256:
        return GROUPHOME_NEW_ITEM_EXIST;
      case 512:
        return GROUPHOME_HIDDEN_ITEM_CHANGED;
      case 1024:
        return NOTIFICATION_ITEM_CHANGED;
      case 2048:
        return BEAD_ITEM_HIDE;
      case 4096:
        return BEAD_ITEM_SHOW;
      default:
        return null;
    }
  }
}
