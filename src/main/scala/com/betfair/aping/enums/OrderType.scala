package com.betfair.aping.enums

object OrderType extends Enumeration {
  type OrderType = Value
  val LIMIT, LIMIT_ON_CLOSE, MARKET_ON_CLOSE = Value
}
