package com.betfair.aping.entities

case class Event (
  // The unique id for the event
  id: Option[String] = None,
  // The name of the event
  name: Option[String] = None,
  // The ISO-2 code for the event.  A list of ISO-2 codes is available via http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2
  countryCode: Option[String] = None,
  // This is timezone in which the event is taking place.
  timezone: Option[String] = None,
  // venue
  venue: Option[String] = None,
  // The scheduled start date and time of the event. This is Europe/London (GMT) by default
  openDate: Option[Date] = None
)