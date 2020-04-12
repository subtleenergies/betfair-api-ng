package com.betfair.aping.entities

case class MarketProfitAndLoss (
  // The unique identifier for the market
  marketId: Option[String] = None,
  // The commission rate applied to P&L values. Only returned if netOfCommision option is requested
  commissionApplied: Option[Double] = None,
  // Calculated profit and loss data.
  profitAndLosses: Option[List[RunnerProfitAndLoss]] = None
)