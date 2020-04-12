package com.betfair.aping.entities

case class PlaceInstructionReport (
  // whether the command succeeded or failed
  status: InstructionReportStatus,
  // cause of failure, or null if command succeeds
  errorCode: Option[InstructionReportErrorCode] = None,
  // The status of the order, if the instruction succeeded. If the instruction was unsuccessful, no value is provided.
  orderStatus: Option[OrderStatus] = None,
  // The instruction that was requested
  instruction: PlaceInstruction,
  // The bet ID of the new bet. Will be null on failure or if order was placed asynchronously.
  betId: Option[String] = None,
  // Will be null if order was placed asynchronously
  placedDate: Option[Date] = None,
  // Will be null if order was placed asynchronously. This value is not meaningful for activity on LINE markets and is not guaranteed to be returned or maintained for these markets.
  averagePriceMatched: Option[Price] = None,
  // Will be null if order was placed asynchronously
  sizeMatched: Option[Size] = None
)