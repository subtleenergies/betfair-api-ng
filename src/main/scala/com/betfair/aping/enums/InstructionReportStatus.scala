package com.betfair.aping.enums

object InstructionReportStatus extends Enumeration {
  type InstructionReportStatus = Value
  val SUCCESS, FAILURE, TIMEOUT = Value
}
