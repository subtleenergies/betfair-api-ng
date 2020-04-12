package com.betfair.aping.entities

case class CurrentOrderSummary (
  // The bet ID of the original place order.
  betId: String,
  // The market id the order is for.
  marketId: String,
  // The selection id the order is for.
  selectionId: Long,
  // The handicap associated with the runner in case of Asian handicap markets, null otherwise.
  handicap: Double,
  // The price and size of the bet.
  priceSize: PriceSize,
  // Not to be confused with size. This is the liability of a given BSP bet.
  bspLiability: Double,
  // BACK/LAY
  side: Side,
  // Either EXECUTABLE (an unmatched amount remains) or EXECUTION_COMPLETE (no unmatched amount remains).
  status: OrderStatus,
  // What to do with the order at turn-in-play.
  persistenceType: PersistenceType,
  // BSP Order type.
  orderType: OrderType,
  // The date, to the second, the bet was placed.
  placedDate: Date,
  // The date, to the second, of the last matched bet fragment (where applicable)
  matchedDate: Date,
  // The average price matched at. Voided match fragments are removed from this average calculation. The price is automatically adjusted in the event of non runners being declared with applicable reduction factors. Please note: This value is not meaningful for activity on LINE markets and is not guaranteed to be returned or maintained for these markets.
  averagePriceMatched: Option[Double] = None,
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
  // The regulator authorisation code.
  regulatorAuthCode: Option[String] = None,
  // The regulator Code.
  regulatorCode: Option[String] = None,
  // The order reference defined by the customer for this bet
  customerOrderRef: Option[String] = None,
  // The strategy reference defined by the customer for this bet
  customerStrategyRef: Option[String] = None
)