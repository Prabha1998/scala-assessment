package model

import database.{ItemDatabase, MoneyDatabase}

import scala.collection.mutable.ListBuffer

class VendingMachine (var itemList:ListBuffer[Item], var moneyList:ListBuffer[Money]){

}
object VendingMachine{
  val vendingMachine=new VendingMachine(ItemDatabase.itemList,MoneyDatabase.moneyList)
  def addItem(item:Item)={vendingMachine.itemList+=item}
  def addMoney(money:Money)={vendingMachine.moneyList+=money}
  def getItemList=vendingMachine.itemList

}
