package com.betfair.aping.entities

case class PlaceInstruction (
  // 
  orderType: OrderType,
  // The selection_id.
  selectionId: Long,
  // The handicap associated with the runner in case of Asian handicap markets (e.g. marketTypes ASIAN_HANDICAP_DOUBLE_LINE, ASIAN_HANDICAP_SINGLE_LINE) null otherwise.
  handicap: Option[Double] = None,
  // Back or Lay
  side: Side,
  // A simple exchange bet for immediate execution
  limitOrder: Option[LimitOrder] = None,
  // Bets are matched if, and only if, the returned starting price is better than a specified price. In the case of back bets, LOC bets are matched if the calculated starting price is greater than the specified price. In the case of lay bets, LOC bets are matched if the starting price is less than the specified price. If the specified limit is equal to the starting price, then it may be matched, partially matched, or may not be matched at all, depending on how much is needed to balance all bets against each other (MOC, LOC and normal exchange bets)
  limitOnCloseOrder: Option[LimitOnCloseOrder] = None,
  // Bets remain unmatched until the market is reconciled. They are matched and settled at a price that is representative of the market at the point the market is turned in-play. The market is reconciled to find a starting price and MOC bets are settled at whatever starting price is returned. MOC bets are always matched and settled, unless a starting price is not available for the selection. Market on Close bets can only be placed before the starting price is determined
  marketOnCloseOrder: Option[MarketOnCloseOrder] = None,
  // An optional reference customers can set to identify instructions.. No validation will be done on uniqueness and the string is limited to 32 characters. If an empty string is provided it will be treated as null.
  customerOrderRef: Option[String] = None
)