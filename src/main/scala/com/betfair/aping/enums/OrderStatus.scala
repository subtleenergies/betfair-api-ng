package com.betfair.aping.enums

object OrderStatus extends Enumeration {
  type OrderStatus = Value
  val PENDING, EXECUTION_COMPLETE, EXECUTABLE, EXPIRED = Value
}
