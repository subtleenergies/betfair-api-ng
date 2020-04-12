package com.betfair.aping.entities

case class ExchangePrices (
  // 
  availableToBack: Option[List[PriceSize]] = None,
  // 
  availableToLay: Option[List[PriceSize]] = None,
  // 
  tradedVolume: Option[List[PriceSize]] = None
)