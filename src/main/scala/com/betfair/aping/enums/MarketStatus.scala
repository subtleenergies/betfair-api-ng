package com.betfair.aping.enums

object MarketStatus extends Enumeration {
  type MarketStatus = Value
  val INACTIVE, OPEN, SUSPENDED, CLOSED = Value
}
