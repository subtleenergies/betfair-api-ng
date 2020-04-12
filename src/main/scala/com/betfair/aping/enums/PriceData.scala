package com.betfair.aping.enums

object PriceData extends Enumeration {
  type PriceData = Value
  val SP_AVAILABLE, SP_TRADED, EX_BEST_OFFERS, EX_ALL_OFFERS, EX_TRADED = Value
}
