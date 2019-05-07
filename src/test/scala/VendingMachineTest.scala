import database.ItemDatabase.itemList
import model.{Coin, Item, Money, Note}
import org.scalatest.{BeforeAndAfter, FunSuite}

class VendingMachineTest extends FunSuite with BeforeAndAfter{
  before{
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
    val one =new Money(1,5,Coin)
    val two=new Money(2,4,Coin)
    val five=new Money(5,10,Coin)
    val ten=new Money(10,4,Coin)
    val tenN =new Money(1,5,Note)
    val twenty=new Money(2,4,Note)
    val fiftyN=new Money(5,10,Note)
    val hundredN=new Money(10,4,Note)



  }
 test("vending machine test"){
  
 }
}
