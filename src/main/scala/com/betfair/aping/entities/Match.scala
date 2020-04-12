package com.betfair.aping.entities

case class Match (
  // Only present if no rollup
  betId: Option[String] = None,
  // Only present if no rollup
  matchId: Option[String] = None,
  // Indicates if the bet is a Back or a LAY
  side: Side,
  // Either actual match price or avg match price depending on rollup. This value is not meaningful for activity on LINE markets and is not guaranteed to be returned or maintained for these markets.
  price: Double,
  // Size matched at in this fragment, or at this price or avg price depending on rollup
  size: Double,
  // Only present if no rollup
  matchDate: Option[Date] = None
)