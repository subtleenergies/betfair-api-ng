package com.betfair.aping.enums

object MatchProjection extends Enumeration {
  type MatchProjection = Value
  val NO_ROLLUP, ROLLED_UP_BY_PRICE, ROLLED_UP_BY_AVG_PRICE = Value
}
