package com.cafe.app.domain

import com.cafe.app.utils.Color
import java.util.*

data class Order(val customerName : String){
    val orderId = counter++
    val mapOfCoffeeToQuantity : MutableMap<Item,Int> = mutableMapOf()

    companion object { var counter = 100 }

    fun addItem(item : Item, quantity : Int){
        println("Inside add coffee...")
        if(quantity < 1){
            println("${Color.GREEN.value}Quantity can not be zero or minus${Color.RESET.value}")
            return
        }
        mapOfCoffeeToQuantity[item] = quantity
        println("${Color.GREEN.value} $quantity ${item.name} added to order ${Color.RESET.value}")

    }

    fun removeCoffee(item: Item){
        if(mapOfCoffeeToQuantity.contains(item)) {
            mapOfCoffeeToQuantity.remove(item)
            println("${Color.GREEN.value}${item.name} with ID : ${item.id} is canceled ${Color.RESET.value}")
        }
        else println("${Color.GREEN.value} ${item.name} is not present in order${Color.RESET.value}")
    }

    override fun toString(): String {
        if(mapOfCoffeeToQuantity.isEmpty()){
            return "Order is Empty"
        }
        val fmt = Formatter()
        fmt.format("%1s",Color.BOLD.value)
            .format("%34s\n","ORDER DETAILS")
            .format("%25s %2s %5s\n","CUSTOMER NAME",":",this.customerName.uppercase())
            .format("%25s %2s %5s\n","ORDER NUMBER",":",this.orderId)
            .format("%1s\n","${Color.GREEN.value}----------------------------------------------------")
            .format("%5s %13s %7s %10s\n", "ID", "NAME", "PRICE","QUANTITY")
            .format("%1s\n","----------------------------------------------------${Color.RESET.value}${Color.BLUE.value}")
        mapOfCoffeeToQuantity.forEach{ (coffee,quantity) -> fmt.format("%5s %13s %7s %10s\n",coffee.id,coffee.name,coffee.price,quantity) }
        fmt.format("%1s", Color.RESET.value)
        return fmt.toString()
    }


}