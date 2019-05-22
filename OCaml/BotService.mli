(*
 Autogenerated by Thrift Compiler (0.11.0)

 DO NOT EDIT UNLESS YOU ARE SURE YOU KNOW WHAT YOU ARE DOING
*)

open Thrift
open Line_types

class virtual iface :
object
  method virtual notifyLeaveGroup : string option -> unit
  method virtual notifyLeaveRoom : string option -> unit
  method virtual getBotUseInfo : string option -> botUseInfo
  method virtual sendChatCheckedByWatermark : Int32.t option -> string option -> Int64.t option -> Int32.t option -> unit
end

class client : Protocol.t -> Protocol.t -> 
object
  method notifyLeaveGroup : string -> unit
  method notifyLeaveRoom : string -> unit
  method getBotUseInfo : string -> botUseInfo
  method sendChatCheckedByWatermark : Int32.t -> string -> Int64.t -> Int32.t -> unit
end

class processor : iface ->
object
  inherit Processor.t

  val processMap : (string, int * Protocol.t * Protocol.t -> unit) Hashtbl.t
  method process : Protocol.t -> Protocol.t -> bool
end

