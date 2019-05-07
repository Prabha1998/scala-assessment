package database

import model.{Coin, Money}

object MoneyDatabase {
 val moneyList=new scala.collection.mutable.ListBuffer[Money]
 val one =new Money(1,5,Coin)
  val two=new Money(2,4,Coin)
  val five=new Money(5,10,Coin)
  val ten=new Money(10,4,Coin)
}
