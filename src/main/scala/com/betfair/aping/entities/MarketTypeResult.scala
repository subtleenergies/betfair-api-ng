package com.betfair.aping.entities

case class MarketTypeResult (
  // Market Type
  marketType: Option[String] = None,
  // Count of markets associated with this marketType
  marketCount: Option[Int] = None
)