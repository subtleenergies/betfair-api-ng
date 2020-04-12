package com.betfair.aping.entities

case class TimeRange (
  // from
  from: Option[Date] = None,
  // to
  to: Option[Date] = None
)