package com.betfair.aping.entities

case class MarketBook (
  // The unique identifier for the market. MarketId's are prefixed with '1.'
  marketId: String,
  // True if the data returned by listMarketBook will be delayed. The data may be delayed because you are not logged in with a funded account or you are using an Application Key that does not allow up to date data.
  isMarketDataDelayed: Boolean,
  // The status of the market, for example OPEN, SUSPENDED, CLOSED (settled), etc.
  status: Option[MarketStatus] = None,
  // The number of seconds an order is held until it is submitted into the market. Orders are usually delayed when the market is in-play
  betDelay: Option[Int] = None,
  // True if the market starting price has been reconciled
  bspReconciled: Option[Boolean] = None,
  // If false, runners may be added to the market
  complete: Option[Boolean] = None,
  // True if the market is currently in play
  inplay: Option[Boolean] = None,
  // The number of selections that could be settled as winners
  numberOfWinners: Option[Int] = None,
  // The number of runners in the market
  numberOfRunners: Option[Int] = None,
  // The number of runners that are currently active. An active runner is a selection available for betting
  numberOfActiveRunners: Option[Int] = None,
  // The most recent time an order was executed
  lastMatchTime: Option[Date] = None,
  // The total amount matched
  totalMatched: Option[Double] = None,
  // The total amount of orders that remain unmatched
  totalAvailable: Option[Double] = None,
  // True if cross matching is enabled for this market.
  crossMatching: Option[Boolean] = None,
  // True if runners in the market can be voided. Please note - this doesn't include horse racing markets under which bets are voided on non-runners with any applicable reduction factor applied/
  runnersVoidable: Option[Boolean] = None,
  // The version of the market. The version increments whenever the market status changes, for example, turning in-play, or suspended when a goal is scored.
  version: Option[Long] = None,
  // Information about the runners (selections) in the market.
  runners: Option[List[Runner]] = None,
  // Description of a markets key line for valid market types
  keyLineDescription: Option[KeyLineDescription] = None
)