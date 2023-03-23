package com.coffeeApp.domain

data class Order(val customerName : String) {
    val orderID = counter++
    val orderItems : MutableMap<Coffee,Int> = mutableMapOf()

    companion object {
        var counter = 100
    }

    fun addCoffee(coffee: Coffee){
        if(orderItems.containsKey(coffee)){
            val quantity = orderItems[coffee] ?: 0
            orderItems[coffee] = quantity + 1
        }
        else{
            orderItems.put(coffee,1)
        }
    }

    fun removeCoffee(coffee: Coffee){
        val quantity = orderItems[coffee]?:0
         if(quantity == 1){
            orderItems.remove(coffee)
         }else if(quantity > 1){
             orderItems[coffee] = quantity - 1
         }else{
             println("Quantity can not be zero or minus")
         }
    }


}