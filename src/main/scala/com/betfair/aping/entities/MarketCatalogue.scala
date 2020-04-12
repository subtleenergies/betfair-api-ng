package com.betfair.aping.entities

case class MarketCatalogue (
  // The unique identifier for the market. MarketId's are prefixed with '1.'
  marketId: String,
  // The name of the market
  marketName: String,
  // The time this market starts at, only returned when the MARKET_START_TIME enum is passed in the marketProjections
  marketStartTime: Option[Date] = None,
  // Details about the market
  description: Option[MarketDescription] = None,
  // The total amount of money matched on the market
  totalMatched: Option[Double] = None,
  // The runners (selections) contained in the market
  runners: Option[List[RunnerCatalog]] = None,
  // The Event Type the market is contained within
  eventType: Option[EventType] = None,
  // The competition the market is contained within. Usually only applies to Football competitions
  competition: Option[Competition] = None,
  // The event the market is contained within
  event: Option[Event] = None
)