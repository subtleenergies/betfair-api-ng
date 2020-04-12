package com.betfair.aping.entities

case class StartingPrices (
  // What the starting price would be if the market was reconciled now taking into account the SP bets as well as unmatched exchange bets on the same selection in the exchange. This data is cached and update every 60 seconds. Please note: Type Double may contain numbers, INF, -INF, and NaN.
  nearPrice: Option[Double] = None,
  // What the starting price would be if the market was reconciled now taking into account only the currently place SP bets. The Far Price is not as complicated but not as accurate and only accounts for money on the exchange at SP. This data is cached and updated every 60 seconds. Please note: Type Double may contain numbers, INF, -INF, and NaN.
  farPrice: Option[Double] = None,
  // The total amount of back bets matched at the actual Betfair Starting Price. Pre-reconciliation, this field is zero for all prices except 1.01 (for Market on Close bets) and at the limit price for any Limit on Close bets.
  backStakeTaken: Option[List[PriceSize]] = None,
  // The lay amount matched at the actual Betfair Starting Price. Pre-reconciliation, this field is zero for all prices except 1.01 (for Market on Close bets) and at the limit price for any Limit on Close bets.
  layLiabilityTaken: Option[List[PriceSize]] = None,
  // The final BSP price for this runner. Only available for a BSP market that has been reconciled.
  actualSP: Option[Double] = None
)