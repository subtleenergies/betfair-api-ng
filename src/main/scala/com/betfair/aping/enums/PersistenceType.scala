package com.betfair.aping.enums

object PersistenceType extends Enumeration {
  type PersistenceType = Value
  val LAPSE, PERSIST, MARKET_ON_CLOSE = Value
}
