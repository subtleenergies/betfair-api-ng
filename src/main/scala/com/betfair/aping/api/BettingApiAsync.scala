package com.betfair.aping.api

import com.betfair.aping.entities._

trait BettingApiAsync[F[_]] {
  def listEventTypes(filter: Option[MarketFilter], locale: Option[String]): F[List[EventTypeResult]]
  def listCompetitions(filter: Option[MarketFilter], locale: Option[String]): F[List[CompetitionResult]]
  def listTimeRanges(filter: Option[MarketFilter], granularity: Option[TimeGranularity]): F[List[TimeRangeResult]]
  def listEvents(filter: Option[MarketFilter], locale: Option[String]): F[List[EventResult]]
  def listMarketTypes(filter: Option[MarketFilter], locale: Option[String]): F[List[MarketTypeResult]]
  def listCountries(filter: Option[MarketFilter], locale: Option[String]): F[List[CountryCodeResult]]
  def listVenues(filter: Option[MarketFilter], locale: Option[String]): F[List[VenueResult]]
  def listMarketCatalogue(filter: Option[MarketFilter], marketProjection: Option[Set[MarketProjection]], sort: Option[MarketSort], maxResults: Option[Int], locale: Option[String]): F[List[MarketCatalogue]]
  def listMarketBook(marketIds: Option[List[String]], priceProjection: Option[PriceProjection], orderProjection: Option[OrderProjection], matchProjection: Option[MatchProjection], currencyCode: Option[String], locale: Option[String], matchedSince: Option[Date], betIds: Option[Set[BetId]]): F[List[MarketBook]]
  def listRunnerBook(marketId: Option[MarketId], selectionId: Option[SelectionId], handicap: Option[Double], priceProjection: Option[PriceProjection], orderProjection: Option[OrderProjection], matchProjection: Option[MatchProjection], includeOverallPosition: Option[Boolean], partitionMatchedByStrategyRef: Option[Boolean], customerStrategyRefs: Option[Set[String]], currencyCode: Option[String], locale: Option[String], matchedSince: Option[Date], betIds: Option[Set[BetId]]): F[List[MarketBook]]
  def listMarketProfitAndLoss(marketIds: Option[Set[MarketId]], includeSettledBets: Option[Boolean], includeBspBets: Option[Boolean], netOfCommission: Option[Boolean]): F[List[MarketProfitAndLoss]]
  def listCurrentOrders(betIds: Option[Set[String]], marketIds: Option[Set[String]], orderProjection: Option[OrderProjection], placedDateRange: Option[TimeRange], orderBy: Option[OrderBy], sortDir: Option[SortDir], fromRecord: Option[Int], recordCount: Option[Int]): F[CurrentOrderSummaryReport]
  def listClearedOrders(betStatus: Option[BetStatus], eventTypeIds: Option[Set[EventTypeId]], eventIds: Option[Set[EventId]], marketIds: Option[Set[MarketId]], runnerIds: Option[Set[RunnerId]], betIds: Option[Set[BetId]], side: Option[Side], settledDateRange: Option[TimeRange], groupBy: Option[GroupBy], includeItemDescription: Option[Boolean], locale: Option[String], fromRecord: Option[Int], recordCount: Option[Int]): F[ClearedOrderSummaryReport]
  def placeOrders(marketId: Option[String], instructions: Option[List[PlaceInstruction]], customerRef: Option[String], marketVersion: Option[MarketVersion], customerStrategyRef: Option[String], async: Option[Boolean]): F[PlaceExecutionReport]
  def cancelOrders(marketId: Option[String], instructions: Option[List[CancelInstruction]], customerRef: Option[String]): F[CancelExecutionReport]
  def replaceOrders(marketId: Option[String], instructions: Option[List[ReplaceInstruction]], customerRef: Option[String], marketVersion: Option[MarketVersion], async: Option[Boolean]): F[ReplaceExecutionReport]
  def updateOrders(marketId: Option[String], instructions: Option[List[UpdateInstruction]], customerRef: Option[String]): F[UpdateExecutionReport]
}