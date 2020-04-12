package com.betfair.aping.entities

case class MarketDescription (
  // If 'true' the market supports 'Keep' bets if the market is to be turned in-play
  persistenceEnabled: Boolean,
  // If 'true' the market supports Betfair SP betting
  bspMarket: Boolean,
  // The market start time
  marketTime: Date,
  // The market suspend time
  suspendTime: Date,
  // settled time
  settleTime: Option[Date] = None,
  // See MarketBettingType
  bettingType: MarketBettingType,
  // If 'true' the market is set to turn in-play
  turnInPlayEnabled: Boolean,
  // Market base type
  marketType: String,
  // The market regulator. Value include “GIBRALTAR REGULATOR" (.com), MR_ESP (Betfair.es markets), MR_IT (Betfair.it). GIBRALTAR REGULATOR = MR_INT in the Stream API
  regulator: String,
  // The commission rate applicable to the market
  marketBaseRate: Double,
  // Indicates whether or not the user's discount rate is taken into account on this market. If ‘false’ all users will be charged the same commission rate, regardless of discount rate.
  discountAllowed: Boolean,
  // The wallet to which the market belongs.
  wallet: Option[String] = None,
  // The market rules.
  rules: Option[String] = None,
  // Indicates whether rules have a date included.
  rulesHasDate: Option[Boolean] = None,
  // The divisor is returned for the marketType EACH_WAY only and refers to the fraction of the win odds at which the place portion of an each way bet is settled
  eachWayDivisor: Option[Double] = None,
  // Any additional information regarding the market
  clarifications: Option[String] = None,
  // Line range info for line markets
  lineRangeInfo: Option[MarketLineRangeInfo] = None,
  // An external identifier of a race type
  raceType: Option[String] = None,
  // Details about the price ladder in use for this market.
  priceLadderDescription: Option[PriceLadderDescription] = None
)