package com.betfair.aping.enums

object MarketBettingType extends Enumeration {
  type MarketBettingType = Value
  val ODDS, LINE, RANGE, ASIAN_HANDICAP_DOUBLE_LINE, ASIAN_HANDICAP_SINGLE_LINE, FIXED_ODDS = Value
}
