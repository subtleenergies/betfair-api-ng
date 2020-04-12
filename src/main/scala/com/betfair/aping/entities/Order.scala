package com.betfair.aping.entities

case class Order (
  // 
  betId: String,
  // BSP Order type.
  orderType: OrderType,
  // Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
  status: OrderStatus,
  // What to do with the order at turn-in-play
  persistenceType: PersistenceType,
  // Indicates if the bet is a Back or a LAY.For LINE markets customers either Buy a line (LAY bet, winning if outcome is greater than the taken line (price)) or Sell a line (BACK bet, winning if outcome is less than the taken line (price))
  side: Side,
  // The price of the bet. Please note: LINE markets operate at even-money odds of 2.0. However, price for these markets refers to the line positions available as defined by the markets min-max range and interval steps
  price: Double,
  // The size of the bet.
  size: Double,
  // Not to be confused with size. This is the liability of a given BSP bet.
  bspLiability: Double,
  // The date, to the second, the bet was placed.
  placedDate: Date,
  // The average price matched at. Voided match fragments are removed from this average calculation. For MARKET_ON_CLOSE BSP bets this reports the matched SP price following the SP reconciliation process. This value is not meaningful for activity on LINE markets and is not guaranteed to be returned or maintained for these markets.
  avgPriceMatched: Option[Double] = None,
  // The current amount of this bet that was matched.
  sizeMatched: Option[Double] = None,
  // The current amount of this bet that is unmatched.
  sizeRemaining: Option[Double] = None,
  // The current amount of this bet that was lapsed.
  sizeLapsed: Option[Double] = None,
  // The current amount of this bet that was cancelled.
  sizeCancelled: Option[Double] = None,
  // The current amount of this bet that was voided.
  sizeVoided: Option[Double] = None,
  // The customer order reference sent for this bet
  customerOrderRef: Option[CustomerOrderRef] = None,
  // The customer strategy reference sent for this bet
  customerStrategyRef: Option[CustomerStrategyRef] = None
)