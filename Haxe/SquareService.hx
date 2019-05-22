/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package;

import org.apache.thrift.helper.*;
import haxe.io.Bytes;
import haxe.ds.IntMap;
import haxe.ds.StringMap;
import haxe.ds.ObjectMap;

#if flash
import flash.errors.ArgumentError;
#end

import org.apache.thrift.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.protocol.*;


interface SquareService {

  function getSquareChatAnnouncements(request : GetSquareChatAnnouncementsRequest) : GetSquareChatAnnouncementsResponse;

  function deleteSquareChatAnnouncement(request : DeleteSquareChatAnnouncementRequest) : DeleteSquareChatAnnouncementResponse;

  function createSquareChatAnnouncement(request : CreateSquareChatAnnouncementRequest) : CreateSquareChatAnnouncementResponse;

  function getNoteStatus(request : GetNoteStatusRequest) : GetNoteStatusResponse;

  function getSquareStatus(request : GetSquareStatusRequest) : GetSquareStatusResponse;

  function reportSquareMember(request : ReportSquareMemberRequest) : ReportSquareMemberResponse;

  function reportSquareMessage(request : ReportSquareMessageRequest) : ReportSquareMessageResponse;

  function reportSquareChat(request : ReportSquareChatRequest) : ReportSquareChatResponse;

  function reportSquare(request : ReportSquareRequest) : ReportSquareResponse;

  function updateSquareMemberRelation(request : UpdateSquareMemberRelationRequest) : UpdateSquareMemberRelationResponse;

  function updateSquareAuthority(request : UpdateSquareAuthorityRequest) : UpdateSquareAuthorityResponse;

  function updateSquareChatMember(request : UpdateSquareChatMemberRequest) : UpdateSquareChatMemberResponse;

  function updateSquareChat(request : UpdateSquareChatRequest) : UpdateSquareChatResponse;

  function refreshSubscriptions(request : RefreshSubscriptionsRequest) : RefreshSubscriptionsResponse;

  function removeSubscriptions(request : RemoveSubscriptionsRequest) : RemoveSubscriptionsResponse;

  function rejectSquareMembers(request : RejectSquareMembersRequest) : RejectSquareMembersResponse;

  function updateSquareMembers(request : UpdateSquareMembersRequest) : UpdateSquareMembersResponse;

  function updateSquareMember(request : UpdateSquareMemberRequest) : UpdateSquareMemberResponse;

  function updateSquareFeatureSet(request : UpdateSquareFeatureSetRequest) : UpdateSquareFeatureSetResponse;

  function getSquareFeatureSet(request : GetSquareFeatureSetRequest) : GetSquareFeatureSetResponse;

  function searchSquares(request : SearchSquaresRequest) : SearchSquaresResponse;

  function updateSquare(request : UpdateSquareRequest) : UpdateSquareResponse;

  function getCategories(request : GetSquareCategoriesRequest) : GetSquareCategoriesResponse;

  function searchSquareMembers(request : SearchSquareMembersRequest) : SearchSquareMembersResponse;

  function fetchSquareChatEvents(request : FetchSquareChatEventsRequest) : FetchSquareChatEventsResponse;

  function fetchMyEvents(request : FetchMyEventsRequest) : FetchMyEventsResponse;

  function markAsRead(request : MarkAsReadRequest) : MarkAsReadResponse;

  function getSquareAuthority(request : GetSquareAuthorityRequest) : GetSquareAuthorityResponse;

  function sendMessage(request : SendMessageRequest) : SendMessageResponse;

  function leaveSquare(request : LeaveSquareRequest) : LeaveSquareResponse;

  function leaveSquareChat(request : LeaveSquareChatRequest) : LeaveSquareChatResponse;

  function joinSquareChat(request : JoinSquareChatRequest) : JoinSquareChatResponse;

  function joinSquare(request : JoinSquareRequest) : JoinSquareResponse;

  function inviteToSquare(request : InviteToSquareRequest) : InviteToSquareResponse;

  function inviteToSquareChat(request : InviteToSquareChatRequest) : InviteToSquareChatResponse;

  function getSquareMember(request : GetSquareMemberRequest) : GetSquareMemberResponse;

  function getSquareMembers(request : GetSquareMembersRequest) : GetSquareMembersResponse;

  function getSquareMemberRelation(request : GetSquareMemberRelationRequest) : GetSquareMemberRelationResponse;

  function getSquareMemberRelations(request : GetSquareMemberRelationsRequest) : GetSquareMemberRelationsResponse;

  function getSquareChatMembers(request : GetSquareChatMembersRequest) : GetSquareChatMembersResponse;

  function getSquareChatStatus(request : GetSquareChatStatusRequest) : GetSquareChatStatusResponse;

  function getSquareChat(request : GetSquareChatRequest) : GetSquareChatResponse;

  function getSquare(request : GetSquareRequest) : GetSquareResponse;

  function getJoinedSquares(request : GetJoinedSquaresRequest) : GetJoinedSquaresResponse;

  function getJoinedSquareChats(request : GetJoinedSquareChatsRequest) : GetJoinedSquareChatsResponse;

  function approveSquareMembers(request : ApproveSquareMembersRequest) : ApproveSquareMembersResponse;

  function createSquareChat(request : CreateSquareChatRequest) : CreateSquareChatResponse;

  function createSquare(request : CreateSquareRequest) : CreateSquareResponse;

  function deleteSquareChat(request : DeleteSquareChatRequest) : DeleteSquareChatResponse;

  function deleteSquare(request : DeleteSquareRequest) : DeleteSquareResponse;

  function destroyMessage(request : DestroyMessageRequest) : DestroyMessageResponse;

  function getJoinableSquareChats(request : GetJoinableSquareChatsRequest) : GetJoinableSquareChatsResponse;

  function getInvitationTicketUrl(request : GetInvitationTicketUrlRequest) : GetInvitationTicketUrlResponse;

  function findSquareByInvitationTicket(request : FindSquareByInvitationTicketRequest) : FindSquareByInvitationTicketResponse;

}

