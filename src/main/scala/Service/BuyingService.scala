package Service

import model.{Item, VendingMachine}

object BuyingService {
  def buyItem(item:String,quantity:Int,money:Int): Unit ={
    for( databaseItem<-VendingMachine.getItemList if databaseItem.name==item){
      if(databaseItem.count>=quantity && money>=quantity*databaseItem.cost){
        updateCount(databaseItem,quantity)
        getChange(databaseItem,money,quantity)
      }
      else
        throw new RuntimeException
    }
  }

  private def updateCount(item:Item,quantity:Int){
      item.count=item.count-quantity
  }

  private def getChange(item: Item, money: Int,quantity:Int): Unit = {
      val returnAmount=money-item.cost*quantity

  }
}
