package com.betfair.aping.entities

case class VenueResult (
  // Venue
  venue: Option[String] = None,
  // Count of markets associated with this Venue
  marketCount: Option[Int] = None
)