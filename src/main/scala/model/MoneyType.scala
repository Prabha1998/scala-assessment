package model

sealed trait MoneyType
case object Coin extends MoneyType
case object Note extends MoneyType
