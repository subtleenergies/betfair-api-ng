package com.betfair.aping.entities

case class CurrentOrderSummaryReport (
  // The list of current orders returned by your query. This will be a valid list (i.e. empty or non-empty but never 'null').
  currentOrders: List[CurrentOrderSummary],
  // Indicates whether there are further result items beyond this page. Note that underlying data is highly time-dependent and the subsequent search orders query might return an empty result.
  moreAvailable: Boolean
)