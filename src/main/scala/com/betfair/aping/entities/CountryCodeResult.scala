package com.betfair.aping.entities

case class CountryCodeResult (
  // The ISO-2 code for the event.  A list of ISO-2 codes is available via http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
  countryCode: Option[String] = None,
  // Count of markets associated with this Country Code
  marketCount: Option[Int] = None
)