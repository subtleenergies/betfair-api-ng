package com.betfair.aping.entities

case class PriceLadderDescription (
  // The type of price ladder.
  `type`: Option[PriceLadderType] = None
)