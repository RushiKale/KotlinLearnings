package com.coffeeApp.domain

data class Order(val customerName : String) {
    val orderID = counter++
    val orderItems : Map<Coffee,Int> = mutableMapOf()

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