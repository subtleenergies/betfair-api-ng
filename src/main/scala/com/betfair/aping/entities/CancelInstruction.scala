package com.betfair.aping.entities

case class CancelInstruction (
  // The betId
  betId: Option[String] = None,
  // If supplied then this is a partial cancel.  Should be set to 'null' if no size reduction is required.
  sizeReduction: Option[Double] = None
)