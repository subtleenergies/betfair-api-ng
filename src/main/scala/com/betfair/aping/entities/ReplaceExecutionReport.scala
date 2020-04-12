package com.betfair.aping.entities

case class ReplaceExecutionReport (
  // Echo of the customerRef if passed.
  customerRef: Option[String] = None,
  // 
  status: ExecutionReportStatus,
  // 
  errorCode: Option[ExecutionReportErrorCode] = None,
  // Echo of marketId passed
  marketId: Option[String] = None,
  // 
  instructionReports: Option[List[ReplaceInstructionReport]] = None
)