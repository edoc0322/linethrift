(*
 Autogenerated by Thrift Compiler (0.11.0)

 DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING
*)

open Thrift
open Line_types

class virtual iface :
object
  method virtual getSnsFriends : SnsIdType.t option -> string option -> Int32.t option -> Int32.t option -> snsFriends
  method virtual getSnsMyProfile : SnsIdType.t option -> string option -> snsProfile
  method virtual postSnsInvitationMessage : SnsIdType.t option -> string option -> string option -> unit
end

class client : Protocol.t -> Protocol.t -> 
object
  method getSnsFriends : SnsIdType.t -> string -> Int32.t -> Int32.t -> snsFriends
  method getSnsMyProfile : SnsIdType.t -> string -> snsProfile
  method postSnsInvitationMessage : SnsIdType.t -> string -> string -> unit
end

class processor : iface ->
object
  inherit Processor.t

  val processMap : (string, int * Protocol.t * Protocol.t -> unit) Hashtbl.t
  method process : Protocol.t -> Protocol.t -> bool
end
