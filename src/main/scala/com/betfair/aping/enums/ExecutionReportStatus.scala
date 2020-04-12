package com.betfair.aping.enums

object ExecutionReportStatus extends Enumeration {
  type ExecutionReportStatus = Value
  val SUCCESS, FAILURE, PROCESSED_WITH_ERRORS, TIMEOUT = Value
}
