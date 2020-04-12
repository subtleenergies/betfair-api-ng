package com.betfair.aping.enums

object OrderBy extends Enumeration {
  type OrderBy = Value
  val BY_BET, BY_MARKET, BY_MATCH_TIME, BY_PLACE_TIME, BY_SETTLED_TIME, BY_VOID_TIME = Value
}
