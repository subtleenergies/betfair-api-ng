package com.betfair.aping

import com.betfair.aping.enums._

package object entities {
  type MarketType = String
  type Venue = String
  type MarketId = String
  type SelectionId = Long
  type Handicap = Double
  type EventId = String
  type EventTypeId = String
  type CountryCode = String
  type ExchangeId = String
  type CompetitionId = String
  type Price = Double
  type Size = Double
  type BetId = String
  type MatchId = String
  type CustomerOrderRef = String
  type CustomerStrategyRef = String
  type MarketProjection = MarketProjection.MarketProjection
  type PriceData = PriceData.PriceData
  type MatchProjection = MatchProjection.MatchProjection
  type OrderProjection = OrderProjection.OrderProjection
  type MarketStatus = MarketStatus.MarketStatus
  type RunnerStatus = RunnerStatus.RunnerStatus
  type TimeGranularity = TimeGranularity.TimeGranularity
  type Side = Side.Side
  type OrderStatus = OrderStatus.OrderStatus
  type OrderBy = OrderBy.OrderBy
  type SortDir = SortDir.SortDir
  type OrderType = OrderType.OrderType
  type MarketSort = MarketSort.MarketSort
  type MarketBettingType = MarketBettingType.MarketBettingType
  type ExecutionReportStatus = ExecutionReportStatus.ExecutionReportStatus
  type ExecutionReportErrorCode = ExecutionReportErrorCode.ExecutionReportErrorCode
  type PersistenceType = PersistenceType.PersistenceType
  type InstructionReportStatus = InstructionReportStatus.InstructionReportStatus
  type InstructionReportErrorCode = InstructionReportErrorCode.InstructionReportErrorCode
  type RollupModel = RollupModel.RollupModel
  type GroupBy = GroupBy.GroupBy
  type BetStatus = BetStatus.BetStatus
  type TimeInForce = TimeInForce.TimeInForce
  type BetTargetType = BetTargetType.BetTargetType
  type PriceLadderType = PriceLadderType.PriceLadderType
  type Date = java.time.LocalDate
}