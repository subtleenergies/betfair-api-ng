package com.betfair.aping.entities

case class TimeRangeResult (
  // TimeRange
  timeRange: Option[TimeRange] = None,
  // Count of markets associated with this TimeRange
  marketCount: Option[Int] = None
)