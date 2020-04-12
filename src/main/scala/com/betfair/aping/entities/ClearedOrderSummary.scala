package com.betfair.aping.entities

case class ClearedOrderSummary (
  // The id of the event type bet on. Available at EVENT_TYPE groupBy level or lower.
  eventTypeId: Option[EventTypeId] = None,
  // The id of the event bet on. Available at EVENT groupBy level or lower.
  eventId: Option[EventId] = None,
  // The id of the market bet on. Available at MARKET groupBy level or lower.
  marketId: Option[MarketId] = None,
  // The id of the selection bet on. Available at RUNNER groupBy level or lower.
  selectionId: Option[SelectionId] = None,
  // The handicap.  Enter the specific handicap value (returned by RUNNER in listMaketBook) if the market is an Asian handicap market. Available at MARKET groupBy level or lower.
  handicap: Option[Handicap] = None,
  // The id of the bet. Available at BET groupBy level.
  betId: Option[BetId] = None,
  // The date the bet order was placed by the customer. Only available at BET groupBy level.
  placedDate: Option[Date] = None,
  // The turn in play persistence state of the order at bet placement time. This field will be empty or omitted on true SP bets. Only available at BET groupBy level.
  persistenceType: Option[PersistenceType] = None,
  // The type of bet (e.g standard limited-liability Exchange bet (LIMIT), a standard BSP bet (MARKET_ON_CLOSE), or a minimum-accepted-price BSP bet (LIMIT_ON_CLOSE)). If the bet has a OrderType of MARKET_ON_CLOSE and a persistenceType of MARKET_ON_CLOSE then it is a bet which has transitioned from LIMIT to MARKET_ON_CLOSE. Only available at BET groupBy level.
  orderType: Option[OrderType] = None,
  // Whether the bet was a back or lay bet. Available at SIDE groupBy level or lower.
  side: Option[Side] = None,
  // A container for all the ancillary data and localised text valid for this Item
  itemDescription: Option[ItemDescription] = None,
  // The settlement outcome of the bet. Tri-state (WIN/LOSE/PLACE) to account for Each Way bets where the place portion of the bet won but the win portion lost. The profit/loss amount in this case could be positive or negative depending on the price matched at. Only available at BET groupBy level.
  betOutcome: Option[String] = None,
  // The average requested price across all settled bet orders under this Item. Available at SIDE groupBy level or lower. For LINE markets this is the line position requested. For LINE markets this is the line position requested.
  priceRequested: Option[Price] = None,
  // The date and time the bet order was settled by Betfair. Available at SIDE groupBy level or lower.
  settledDate: Option[Date] = None,
  // The date and time the last bet order was matched by Betfair. Available on Settled orders only.
  lastMatchedDate: Option[Date] = None,
  // The number of actual bets within this grouping (will be 1 for BET groupBy)
  betCount: Option[Int] = None,
  // The cumulative amount of commission paid by the customer across all bets under this Item, in the account currency. Available at EXCHANGE, EVENT_TYPE, EVENT and MARKET level groupings only.
  commission: Option[Size] = None,
  // The average matched price across all settled bets or bet fragments under this Item. Available at SIDE groupBy level or lower. For LINE markets this is the line position matched at.
  priceMatched: Option[Price] = None,
  // If true, then the matched price was affected by a reduction factor due to of a runner removal from this Horse Racing market.
  priceReduced: Option[Boolean] = None,
  // The cumulative bet size that was settled as matched or voided under this Item, in the account currency. Available at SIDE groupBy level or lower.
  sizeSettled: Option[Size] = None,
  // The profit or loss (negative profit) gained on this line, in the account currency
  profit: Option[Size] = None,
  // The amount of the bet that was available to be matched, before cancellation or lapsing, in the account currency
  sizeCancelled: Option[Size] = None,
  // The order reference defined by the customer for the bet order
  customerOrderRef: Option[String] = None,
  // The strategy reference defined by the customer for the bet order
  customerStrategyRef: Option[String] = None
)