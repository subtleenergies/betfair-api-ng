package com.betfair.aping.enums

object RunnerStatus extends Enumeration {
  type RunnerStatus = Value
  val ACTIVE, WINNER, LOSER, PLACED, REMOVED_VACANT, REMOVED, HIDDEN = Value
}
