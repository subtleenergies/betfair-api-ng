package com.betfair.aping.entities

case class ClearedOrderSummaryReport (
  // The list of cleared orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
  clearedOrders: List[ClearedOrderSummary],
  // Indicates whether there are further result items beyond this page. Note that underlying data is highly time-dependent and the subsequent search orders query might return an empty result.
  moreAvailable: Boolean
)