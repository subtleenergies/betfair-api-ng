package com.betfair.aping.entities

case class ReplaceInstruction (
  // Unique identifier for the bet
  betId: String,
  // The price to replace the bet at
  newPrice: Double
)