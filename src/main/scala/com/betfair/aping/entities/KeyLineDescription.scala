package com.betfair.aping.entities

case class KeyLineDescription (
  // A list of KeyLineSelection objects
  keyLine: Option[List[KeyLineSelection]] = None
)