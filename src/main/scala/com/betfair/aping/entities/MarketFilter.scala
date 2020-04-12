package com.betfair.aping.entities

case class MarketFilter (
  // Restrict markets by any text associated with the market such as the Name, Event, Competition, etc. You can include a wildcard (*) character as long as it is not the first character.
  textQuery: Option[String] = None,
  // DEPRECATED
  exchangeIds: Option[Set[String]] = None,
  // Restrict markets by event type associated with the market. (i.e., Football, Hockey, etc)
  eventTypeIds: Option[Set[String]] = None,
  // Restrict markets by the event id associated with the market.
  eventIds: Option[Set[String]] = None,
  // Restrict markets by the competitions associated with the market.
  competitionIds: Option[Set[String]] = None,
  // Restrict markets by the market id associated with the market.
  marketIds: Option[Set[String]] = None,
  // Restrict markets by the venue associated with the market. Currently only Horse Racing markets have venues.
  venues: Option[Set[String]] = None,
  // Restrict to bsp markets only, if True or non-bsp markets if False. If not specified then returns both BSP and non-BSP markets
  bspOnly: Option[Boolean] = None,
  // Restrict to markets that will turn in play if True or will not turn in play if false. If not specified, returns both.
  turnInPlayEnabled: Option[Boolean] = None,
  // Restrict to markets that are currently in play if True or are not currently in play if false. If not specified, returns both.
  inPlayOnly: Option[Boolean] = None,
  // Restrict to markets that match the betting type of the market (i.e. Odds, Asian Handicap Singles, Asian Handicap Doubles or Line)
  marketBettingTypes: Option[Set[MarketBettingType]] = None,
  // Restrict to markets that are in the specified country or countries
  marketCountries: Option[Set[String]] = None,
  // Restrict to markets that match the type of the market (i.e., MATCH_ODDS, HALF_TIME_SCORE). You should use this instead of relying on the market name as the market type codes are the same in all locales. Please note: All marketTypes are available via the listMarketTypes operations.
  marketTypeCodes: Option[Set[String]] = None,
  // Restrict to markets with a market start time before or after the specified date
  marketStartTime: Option[TimeRange] = None,
  // Restrict to markets that I have one or more orders in these status.
  withOrders: Option[Set[OrderStatus]] = None,
  // Restrict by race type (i.e. Hurdle, Flat, Bumper, Harness, Chase)
  raceTypes: Option[Set[String]] = None
)