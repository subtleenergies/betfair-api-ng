package com.betfair.aping.entities

case class EventTypeResult (
  // The ID identifying the Event Type
  eventType: Option[EventType] = None,
  // Count of markets associated with this eventType
  marketCount: Option[Int] = None
)