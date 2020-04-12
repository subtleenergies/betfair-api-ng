package com.betfair.aping.entities

case class Runner (
  // The unique id of the runner (selection)
  selectionId: Long,
  // The handicap.  Enter the specific handicap value (returned by RUNNER in listMaketBook) if the market is an Asian handicap market.
  handicap: Double,
  // The status of the selection (i.e., ACTIVE, REMOVED, WINNER, PLACED, LOSER, HIDDEN) Runner status information is available for 90 days following market settlement.
  status: RunnerStatus,
  // The adjustment factor applied if the selection is removed
  adjustmentFactor: Double,
  // The price of the most recent bet matched on this selection
  lastPriceTraded: Option[Double] = None,
  // The total amount matched on this runner
  totalMatched: Option[Double] = None,
  // If date and time the runner was removed
  removalDate: Option[Date] = None,
  // The BSP related prices for this runner
  sp: Option[StartingPrices] = None,
  // The Exchange prices available for this runner
  ex: Option[ExchangePrices] = None,
  // List of orders in the market
  orders: Option[List[Order]] = None,
  // List of matches (i.e, orders that have been fully or partially executed)
  matches: Option[List[Match]] = None,
  // List of matches for each strategy, ordered by matched data
  matchesByStrategy: Option[Map[String,Match]] = None
)