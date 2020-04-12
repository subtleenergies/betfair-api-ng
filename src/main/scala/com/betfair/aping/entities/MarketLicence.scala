package com.betfair.aping.entities

case class MarketLicence (
  // The wallet from which funds will be taken when betting on this market
  wallet: String,
  // The rules for this market
  rules: Option[String] = None,
  // The market's start date and time are relevant to the rules.
  rulesHasDate: Option[Boolean] = None,
  // Clarifications to the rules for the market
  clarifications: Option[String] = None
)