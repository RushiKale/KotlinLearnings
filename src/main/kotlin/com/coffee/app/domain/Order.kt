package com.coffee.app.domain

import com.coffee.app.interfaces.CoffeeList
import com.coffee.app.utils.Color
import java.util.*

data class Order(val customerName : String) : CoffeeList{
    val orderID = counter++
    val mapOfCoffeeToQuantity : MutableMap<Coffee,Int> = mutableMapOf()

    companion object {
        var counter = 100
    }

    fun addCoffee(coffee: Coffee, quantity : Int){
        if(quantity < 1){
            println("${Color.GREEN.value}Quantity can not be zero or minus${Color.RESET.value}")
            return
        }
        mapOfCoffeeToQuantity[coffee] = quantity
        println("${Color.GREEN.value} $quantity ${coffee.size} ${coffee.name} added to order ${Color.RESET.value}")

    }

    fun removeCoffee(coffee: Coffee){
        if(mapOfCoffeeToQuantity.contains(coffee)) {
            mapOfCoffeeToQuantity.remove(coffee)
            println("${Color.GREEN.value}${coffee.name} with ID : ${coffee.id} is canceled ${Color.RESET.value}")
        }
        else println("${Color.GREEN.value} ${coffee.name} is not present in order${Color.RESET.value}")
    }

    override fun printList()  {
        if(mapOfCoffeeToQuantity.isEmpty()){
            println("Order is Empty")
            return
        }

        val fmt = Formatter()
        fmt.format("%1s",Color.BOLD.value)
            .format("%34s\n","ORDER DETAILS")
            .format("%25s %2s %5s\n","CUSTOMER NAME",":",this.customerName.uppercase())
            .format("%25s %2s %5s\n","ORDER NUMBER",":",this.orderID)
            .format("%1s\n","${Color.GREEN.value}----------------------------------------------------")
            .format("%5s %13s %7s %7s %10s\n", "ID", "NAME", "SIZE", "PRICE","QUANTITY")
            .format("%1s\n","----------------------------------------------------${Color.RESET.value}${Color.BLUE.value}")
        mapOfCoffeeToQuantity.forEach{ (coffee,quantity) -> fmt.format("%5s %13s %7s %7s %10s\n",coffee.id,coffee.name,coffee.size,coffee.price,quantity) }
        fmt.format("%1s", Color.RESET.value)
        print(fmt)
    }


}