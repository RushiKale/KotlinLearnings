package com.coffeeApp.domain

class Order(val customerName : String) {
    val orderID = counter++
    var orderItems : MutableMap<Coffee,Int> = mutableMapOf()

    companion object {
        var counter = 100
    }

    fun addCoffee(coffee: Coffee){
        if(orderItems.containsKey(coffee)){
            orderItems[coffee] = orderItems.get(coffee) + 1
        }
        else{
            orderItems.put(coffee,1)
        }
    }


}