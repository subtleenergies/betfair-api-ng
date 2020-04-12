package com.betfair.aping.entities

case class RunnerId (
  // The id of the market bet on
  marketId: MarketId,
  // The id of the selection bet on
  selectionId: SelectionId,
  // The handicap associated with the runner in case of asian handicap markets, otherwise returns '0.0'.
  handicap: Option[Handicap] = None
)