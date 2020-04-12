package com.betfair.aping.entities

case class MarketVersion (
  // A non-monotonically increasing number indicating market changes
  version: Option[Long] = None
)