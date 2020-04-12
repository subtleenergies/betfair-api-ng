package com.betfair.aping.enums

object MarketSort extends Enumeration {
  type MarketSort = Value
  val MINIMUM_TRADED, MAXIMUM_TRADED, MINIMUM_AVAILABLE, MAXIMUM_AVAILABLE, FIRST_TO_START, LAST_TO_START = Value
}
