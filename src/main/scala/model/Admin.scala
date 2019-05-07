package model

trait Admin {

  def addItem(item:Item)={
   VendingMachine.addItem(item)
  }
  def addMoney(money:Money)={
  VendingMachine.addMoney(money)
  }

}
