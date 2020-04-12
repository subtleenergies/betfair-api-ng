package com.betfair.aping.enums

object RollupModel extends Enumeration {
  type RollupModel = Value
  val STAKE, PAYOUT, MANAGED_LIABILITY, NONE = Value
}
