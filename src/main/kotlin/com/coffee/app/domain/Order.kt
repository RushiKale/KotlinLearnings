package com.coffee.app.domain

import com.coffee.app.interfaces.CoffeeList
import com.coffee.app.utils.Print
import java.util.*

data class Order(val customerName : String) : CoffeeList{
    val orderID = counter++
    val mapOfCoffeeToQuantity : MutableMap<Coffee,Int> = mutableMapOf()

    companion object {
        var counter = 100
    }

    fun addCoffee(coffee: Coffee, quantity : Int){
        if(quantity < 1){
            println("Quantity can not be zero or minus")
            return
        }
        mapOfCoffeeToQuantity[coffee] = quantity
    }

    fun removeCoffee(coffee: Coffee){
        if(mapOfCoffeeToQuantity.contains(coffee)) mapOfCoffeeToQuantity.remove(coffee) else println("${coffee.name} is not present in order...")
    }

    override fun printList()  {
        val fmt = Formatter()
        fmt.format("%26s\n","ORDER DETAILS")
            .format("%25s %2s %5s\n","CUSTOMER NAME",":",this.customerName.uppercase())
            .format("%25s %2s %5s\n","ORDER NUMBER",":",this.orderID)
            .format("%1s\n","----------------------------------------------------")
            .format("%5s %13s %7s %7s %10s\n", "ID", "NAME", "SIZE", "PRICE","QUANTITY")
            .format("%1s\n","----------------------------------------------------")
        mapOfCoffeeToQuantity.forEach{ (coffee,quantity) -> fmt.format("%5s %13s %7s %7s %10s\n",coffee.id,coffee.name,coffee.size,coffee.price,quantity) }
        print(fmt)
    }


}