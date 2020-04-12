package com.betfair.aping.entities

case class LimitOnCloseOrder (
  // The size of the bet. See Min BSP Liability
  liability: Double,
  // The limit price of the bet if LOC
  price: Double
)