package com.betfair.aping.entities

case class UpdateInstruction (
  // Unique identifier for the bet
  betId: String,
  // The new persistence type to update this bet to
  newPersistenceType: PersistenceType
)