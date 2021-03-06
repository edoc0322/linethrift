/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
module CallService;

import thrift.base;
import thrift.codegen.base;
import thrift.util.hashset;

import line_types;

interface CallService {
  UserStatus getUserStatus(string mid);
  void updateProfileAttributeForChannel(ProfileAttribute profileAttribute, string value);
  void updateExtendedProfileAttribute(ExtendedProfileAttribute attr, ref const(ExtendedProfile) extendedProfile);
  SimpleChannelContact[] getAllSimpleChannelContacts(bool statusSticonFallbackDisabled);
  string[RegistrationType] getUserIdentities();
  PaidCallDialing markPaidCallAd(string dialedNumber, string language, bool disableCallerId);
  bool isGroupMember(string groupId);
  PhoneInfoForChannel getPhoneInfoFromPhoneNumber(string region, string phoneNumber);
  PaidCallRedeemResult redeemPaidCallVoucher(string serial, string language);
  string[string] getPreferredDisplayName(string[] mids);
  Contact[] getContactsForChannel(string[] ids);
  CoinProductItem[] getCallCreditProducts(PaymentType appStoreCode, PaymentPgType pgCode, string country, string language);
  CompactContact[] getCompactContacts(long lastModifiedTimestamp);
  void notifyNotiCenterEvent(ref const(NotiCenterEventData) event);
  bool isInContact(string mid);
  SimpleChannelContact[] lookupGroupMembers(string groupId, string[] mids);
  Room getRoomInformation(string roomMid);
  GroupCall getGroupCall(string chatMid);
  bool isAllowSecondaryDeviceLogin();
  SimpleChannelClient getPrimaryClientForChannel();
  Room createRoomWithBuddy(int reqSeq, string buddyMid, string[] contactIds);
  string getDisplayName(string mid);
  PaidCallMetadataResult getPaidCallMetadata(string language);
  string getMid();
  string getUserCountryForBilling(string country, string remoteIp);
  string[] getFavoriteGroupIdsForChannel();
  PaidCallHistoryResult getPaidCallHistory(long start, int size, string language);
  void sendPinCodeOperation(string verifier);
  void inviteIntoGroupCall(string chatMid, string[] memberMids, GroupCallMediaType mediaType);
  string[] getFriendMids();
  MetaProfile getMetaProfile();
  Message sendMessageForChannel(ref const(Message) message);
  long activeBuddySubscriberCount();
  CoinHistoryResult getCallCreditPurchaseHistory(ref const(CoinHistoryCondition) request);
  bool isRoomMember(string roomId);
  Message sendSystemOAMessage(ref const(Message) message);
  PaidCallResponse acquirePaidCallRoute(PaidCallType paidCallType, string dialedNumber, string language, string networkCode, bool disableCallerId, string referer, string adSessionId);
  Group[] getGroupsForChannel(string[] groupIds);
  long getUserCreateTime();
  string registerChannelCP(string cpId, string registerPassword);
  PaymentReservationResult reserveCallCreditPurchase(ref const(CoinPurchaseReservation) request);
  PaidCallCurrencyExchangeRate[] acquirePaidCallCurrencyExchangeRate(string language);
  string[] getRoomMemberMidsForAppPlatform(string roomId);
  PaidCallBalance[] getPaidCallBalanceList(string language);
  string[PersonalInfo] getPersonalInfos(HashSet!(PersonalInfo) requiredPersonalInfos);
  SimpleChannelClient[] getPrimaryClientsForChannel(string[] userMids);
  ContactTransition addBuddyToContact(string buddyMid);
  string[] getGroupMemberMidsForAppPlatform(string groupId);
  string getUserLanguage();
  PaidCallResponse lookupPaidCall(string dialedNumber, string language, string referer);
  ExtendedProfile getExtendedProfile();
  CompactContact[string] getReverseCompactContacts(string[] ids);
  PaidCallAdResult getPaidCallAdStatus();
  Contact findContactByUseridWithoutAbuseBlockForChannel(string userid);
  string[] getGroupMemberMids(string groupId);
  Message sendMessageWithoutRelationship(ref const(Message) message);
  long[string] displayBuddySubscriberCountInBulk(string[] mids);
  SimpleChannelContact[] lookupRoomMembers(string roomId, string[] mids);
  string[] getFavoriteMidsForChannel();
  string[] getAllContactIdsForChannel();
  long displayBuddySubscriberCount();
  Profile getProfileForChannel();
  UserTicketResponse[] getUserTickets(string[] userMids);
  string[] getOAFriendMids();
  PaidCallUserRate[] searchPaidCallUserRate(string countryCode, string language);
  string[] getJoinedGroupIdsForChannel();
  GroupCallRoute acquireGroupCallRoute(string chatMid, GroupCallMediaType mediaType);
  string[] getUserMidsWhoAddedMe();
  IdentityCredential getIdentityCredential();
  void addOperationForChannel(OpType opType, string param1, string param2, string param3);
  SimpleChannelContact[] getSimpleChannelContacts(string[] ids, bool statusSticonFallbackDisabled);
  long getUserLastSentMessageTimeStamp(string mid);

  alias line_types.TalkException TalkException;

  enum methodMeta = [
    TMethodMeta(`getUserStatus`, 
      [TParamMeta(`mid`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`updateProfileAttributeForChannel`, 
      [TParamMeta(`profileAttribute`, 2), TParamMeta(`value`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`updateExtendedProfileAttribute`, 
      [TParamMeta(`attr`, 1), TParamMeta(`extendedProfile`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getAllSimpleChannelContacts`, 
      [TParamMeta(`statusSticonFallbackDisabled`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getUserIdentities`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`markPaidCallAd`, 
      [TParamMeta(`dialedNumber`, 2), TParamMeta(`language`, 3), TParamMeta(`disableCallerId`, 4)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`isGroupMember`, 
      [TParamMeta(`groupId`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPhoneInfoFromPhoneNumber`, 
      [TParamMeta(`region`, 1), TParamMeta(`phoneNumber`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`redeemPaidCallVoucher`, 
      [TParamMeta(`serial`, 2), TParamMeta(`language`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPreferredDisplayName`, 
      [TParamMeta(`mids`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getContactsForChannel`, 
      [TParamMeta(`ids`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getCallCreditProducts`, 
      [TParamMeta(`appStoreCode`, 2), TParamMeta(`pgCode`, 3), TParamMeta(`country`, 4), TParamMeta(`language`, 5)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getCompactContacts`, 
      [TParamMeta(`lastModifiedTimestamp`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`notifyNotiCenterEvent`, 
      [TParamMeta(`event`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`isInContact`, 
      [TParamMeta(`mid`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`lookupGroupMembers`, 
      [TParamMeta(`groupId`, 1), TParamMeta(`mids`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getRoomInformation`, 
      [TParamMeta(`roomMid`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getGroupCall`, 
      [TParamMeta(`chatMid`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`isAllowSecondaryDeviceLogin`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPrimaryClientForChannel`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`createRoomWithBuddy`, 
      [TParamMeta(`reqSeq`, 1), TParamMeta(`buddyMid`, 2), TParamMeta(`contactIds`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getDisplayName`, 
      [TParamMeta(`mid`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPaidCallMetadata`, 
      [TParamMeta(`language`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getMid`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getUserCountryForBilling`, 
      [TParamMeta(`country`, 2), TParamMeta(`remoteIp`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getFavoriteGroupIdsForChannel`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPaidCallHistory`, 
      [TParamMeta(`start`, 2), TParamMeta(`size`, 3), TParamMeta(`language`, 4)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`sendPinCodeOperation`, 
      [TParamMeta(`verifier`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`inviteIntoGroupCall`, 
      [TParamMeta(`chatMid`, 2), TParamMeta(`memberMids`, 3), TParamMeta(`mediaType`, 4)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getFriendMids`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getMetaProfile`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`sendMessageForChannel`, 
      [TParamMeta(`message`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`activeBuddySubscriberCount`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getCallCreditPurchaseHistory`, 
      [TParamMeta(`request`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`isRoomMember`, 
      [TParamMeta(`roomId`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`sendSystemOAMessage`, 
      [TParamMeta(`message`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`acquirePaidCallRoute`, 
      [TParamMeta(`paidCallType`, 2), TParamMeta(`dialedNumber`, 3), TParamMeta(`language`, 4), TParamMeta(`networkCode`, 5), TParamMeta(`disableCallerId`, 6), TParamMeta(`referer`, 7), TParamMeta(`adSessionId`, 8)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getGroupsForChannel`, 
      [TParamMeta(`groupIds`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getUserCreateTime`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`registerChannelCP`, 
      [TParamMeta(`cpId`, 2), TParamMeta(`registerPassword`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`reserveCallCreditPurchase`, 
      [TParamMeta(`request`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`acquirePaidCallCurrencyExchangeRate`, 
      [TParamMeta(`language`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getRoomMemberMidsForAppPlatform`, 
      [TParamMeta(`roomId`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPaidCallBalanceList`, 
      [TParamMeta(`language`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPersonalInfos`, 
      [TParamMeta(`requiredPersonalInfos`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPrimaryClientsForChannel`, 
      [TParamMeta(`userMids`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`addBuddyToContact`, 
      [TParamMeta(`buddyMid`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getGroupMemberMidsForAppPlatform`, 
      [TParamMeta(`groupId`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getUserLanguage`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`lookupPaidCall`, 
      [TParamMeta(`dialedNumber`, 2), TParamMeta(`language`, 3), TParamMeta(`referer`, 4)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getExtendedProfile`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getReverseCompactContacts`, 
      [TParamMeta(`ids`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getPaidCallAdStatus`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`findContactByUseridWithoutAbuseBlockForChannel`, 
      [TParamMeta(`userid`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getGroupMemberMids`, 
      [TParamMeta(`groupId`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`sendMessageWithoutRelationship`, 
      [TParamMeta(`message`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`displayBuddySubscriberCountInBulk`, 
      [TParamMeta(`mids`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`lookupRoomMembers`, 
      [TParamMeta(`roomId`, 1), TParamMeta(`mids`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getFavoriteMidsForChannel`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getAllContactIdsForChannel`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`displayBuddySubscriberCount`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getProfileForChannel`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getUserTickets`, 
      [TParamMeta(`userMids`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getOAFriendMids`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`searchPaidCallUserRate`, 
      [TParamMeta(`countryCode`, 2), TParamMeta(`language`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getJoinedGroupIdsForChannel`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`acquireGroupCallRoute`, 
      [TParamMeta(`chatMid`, 2), TParamMeta(`mediaType`, 3)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getUserMidsWhoAddedMe`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getIdentityCredential`, 
      [],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`addOperationForChannel`, 
      [TParamMeta(`opType`, 1), TParamMeta(`param1`, 2), TParamMeta(`param2`, 3), TParamMeta(`param3`, 4)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getSimpleChannelContacts`, 
      [TParamMeta(`ids`, 1), TParamMeta(`statusSticonFallbackDisabled`, 2)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    ),
    TMethodMeta(`getUserLastSentMessageTimeStamp`, 
      [TParamMeta(`mid`, 1)],
      [TExceptionMeta(`e`, 1, `TalkException`)]
    )
  ];
}
