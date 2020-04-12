package com.betfair.aping.entities

case class RunnerCatalog (
  // The unique id for the selection. Please note: The selectionId can be mapped to the runner name using the output from listMarketCatalogue
  selectionId: Long,
  // The name of the runner
  runnerName: String,
  // The handicap applies to market with the MarketBettingType ASIAN_HANDICAP_SINGLE_LINE & ASIAN_HANDICAP_DOUBLE_LINE only otherwise '0'
  handicap: Double,
  // The sort priority of this runner. Indicates the order in which the runners are displayed on the Betfair Exchange website.
  sortPriority: Int,
  // Metadata associated with the runner.  For a description of this data for Horse Racing, please see Runner Metadata Description
  metadata: Option[Map[String,String]] = None
)