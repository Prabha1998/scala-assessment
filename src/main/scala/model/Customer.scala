package model

import scala.collection.mutable

trait Customer {
  def getItemList:List[Item]={
    VendingMachine.getItemList.toList
  }
  def getItemList(names:String*)={
    val itemList=new mutable.ListBuffer[Item] ()
    for(databaseItem<-VendingMachine.getItemList){
      for(item<-names){
        if(databaseItem.name==item)
          itemList+=databaseItem
      }
    }
    itemList.toList
  }


}
