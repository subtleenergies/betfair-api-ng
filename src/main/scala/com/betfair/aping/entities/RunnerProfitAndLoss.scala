package com.betfair.aping.entities

case class RunnerProfitAndLoss (
  // The unique identifier for the selection
  selectionId: Option[SelectionId] = None,
  // Profit or loss for the market if this selection is the winner.
  ifWin: Option[Double] = None,
  // Profit or loss for the market if this selection is the loser. Only returned for multi-winner odds markets.
  ifLose: Option[Double] = None,
  // Profit or loss for the market if this selection is placed. Applies to marketType EACH_WAY only.
  ifPlace: Option[Double] = None
)