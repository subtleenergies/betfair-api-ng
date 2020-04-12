package com.betfair.aping.entities

case class ItemDescription (
  // The event type name, translated into the requested locale. Available at EVENT_TYPE groupBy or lower.
  eventTypeDesc: Option[String] = None,
  // The eventName, or openDate + venue, translated into the requested locale. Available at EVENT groupBy or lower.
  eventDesc: Option[String] = None,
  // The market name or racing market type ("Win", "To Be Placed (2 places)", "To Be Placed (5 places)" etc) translated into the requested locale. Available at MARKET groupBy or lower.
  marketDesc: Option[String] = None,
  // The market type e.g. MATCH_ODDS, PLACE, WIN etc.
  marketType: Option[String] = None,
  // The start time of the market (in ISO-8601 format, not translated). Available at MARKET groupBy or lower.
  marketStartTime: Option[Date] = None,
  // The runner name, maybe including the handicap, translated into the requested locale. Available at BET groupBy.
  runnerDesc: Option[String] = None,
  // The number of winners on a market. Available at BET groupBy.
  numberOfWinners: Option[Int] = None,
  // The divisor is returned for the marketType EACH_WAY only and refers to the fraction of the win odds at which the place portion of an each way bet is settled
  eachWayDivisor: Option[Double] = None
)