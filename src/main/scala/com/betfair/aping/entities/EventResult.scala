package com.betfair.aping.entities

case class EventResult (
  // Event
  event: Option[Event] = None,
  // Count of markets associated with this event
  marketCount: Option[Int] = None
)