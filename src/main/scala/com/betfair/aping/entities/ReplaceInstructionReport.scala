package com.betfair.aping.entities

case class ReplaceInstructionReport (
  // whether the command succeeded or failed
  status: InstructionReportStatus,
  // cause of failure, or null if command succeeds
  errorCode: Option[InstructionReportErrorCode] = None,
  // Cancelation report for the original order
  cancelInstructionReport: Option[CancelInstructionReport] = None,
  // Placement report for the new order
  placeInstructionReport: Option[PlaceInstructionReport] = None
)