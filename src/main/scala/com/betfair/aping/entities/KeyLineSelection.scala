package com.betfair.aping.entities

case class KeyLineSelection (
  // Selection ID of the runner in the key line handicap.
  selectionId: Option[SelectionId] = None,
  // Handicap value of the key line.
  handicap: Option[Handicap] = None
)