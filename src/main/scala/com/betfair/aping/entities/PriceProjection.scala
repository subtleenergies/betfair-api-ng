package com.betfair.aping.entities

case class PriceProjection (
  // The basic price data you want to receive in the response.
  priceData: Option[Set[PriceData]] = None,
  // Options to alter the default representation of best offer prices Applicable to EX_BEST_OFFERS priceData selection
  exBestOffersOverrides: Option[ExBestOffersOverrides] = None,
  // Indicates if the returned prices should include virtual prices. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS priceData selections, default value is false. Please note: This must be set to 'true' replicate the display of prices on the Betfair Exchange website.
  virtualise: Option[Boolean] = None,
  // Indicates if the volume returned at each price point should be the absolute value or a cumulative sum of volumes available at the price and all better prices. If unspecified defaults to false. Applicable to EX_BEST_OFFERS and EX_ALL_OFFERS price projections. Not supported as yet.
  rolloverStakes: Option[Boolean] = None
)