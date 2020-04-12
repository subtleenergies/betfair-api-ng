package com.betfair.aping.enums

object OrderProjection extends Enumeration {
  type OrderProjection = Value
  val ALL, EXECUTABLE, EXECUTION_COMPLETE = Value
}
