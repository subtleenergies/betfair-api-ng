package com.betfair.aping.entities

case class CompetitionResult (
  // Competition
  competition: Option[Competition] = None,
  // Count of markets associated with this competition
  marketCount: Option[Int] = None,
  // Region in which this competition is happening
  competitionRegion: Option[String] = None
)