package com.betfair.aping.entities

case class CancelInstructionReport (
  // whether the command succeeded or failed
  status: InstructionReportStatus,
  // cause of failure, or null if command succeeds
  errorCode: Option[InstructionReportErrorCode] = None,
  // The instruction that was requested
  instruction: Option[CancelInstruction] = None,
  // 
  sizeCancelled: Double,
  // 
  cancelledDate: Option[Date] = None
)