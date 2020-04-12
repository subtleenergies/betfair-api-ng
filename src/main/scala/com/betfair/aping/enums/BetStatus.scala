package com.betfair.aping.enums

object BetStatus extends Enumeration {
  type BetStatus = Value
  val SETTLED, VOIDED, LAPSED, CANCELLED = Value
}
