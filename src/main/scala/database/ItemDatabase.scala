package database

import model.Item

object ItemDatabase {
 val itemList=new scala.collection.mutable.ListBuffer[Item]()
 val chips=new Item("chips",2,10)
  val nuts=new Item("nuts",3,30)
  val candies=new Item("candies",20,1)
  val biscuits=new Item("biscuits",5,20)
  val  coldDrinks=new Item("cold drink",12,25)
  itemList+=chips
  itemList+=nuts
  itemList+=candies
  itemList+=biscuits
  itemList+=coldDrinks
  def addItem(item:Item)={
    if(itemList.find(item)){

    }else{

    }
  }
}
