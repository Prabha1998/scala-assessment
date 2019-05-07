package model

import database.{ItemDatabase, MoneyDatabase}

import scala.collection.mutable.ListBuffer

class VendingMachine (var itemList:ListBuffer[Item], var moneyList:ListBuffer[Money]){

}
object VendingMachine{
  val vendingMachine=new VendingMachine(ItemDatabase.itemList,MoneyDatabase.moneyList)


  def addItem(item:Item)={
    for(databaseItem<-vendingMachine.itemList){
      if (item==databaseItem)
      updateItem(item,databaseItem)
      else
      vendingMachine.itemList+=item
    }
  }


  def addMoney(money:Money)= {
    for (databaseMoney <- vendingMachine.moneyList) {
      if (money == databaseMoney)
        updateMoney(money, databaseMoney)
      else
        vendingMachine.moneyList += money
    }
  }

  def getItemList=vendingMachine.itemList

  def updateItem(item:Item,databaseItem:Item)=databaseItem.count=databaseItem.count+item.count

  def updateMoney(money:Money,databaseMoney:Money)=databaseMoney.count=databaseMoney.count+money.count

}
