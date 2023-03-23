package com.coffeeApp.domain

data class Order(val customerName : String) {
    val orderID = counter++
    val orderItems : MutableMap<Coffee,Int> = mutableMapOf()

    companion object {
        var counter = 100
    }

    fun addCoffee(coffee: Coffee,quantity : Int){
        if(quantity < 1){
            println("Quantity can not be zero or minus")
            return
        }
        orderItems[coffee] = quantity
        /*
         if(orderItems.containsKey(coffee)){
             orderItems[coffee] = quantity
         }
         else{
             orderItems[coffee] = 1
         }
         */
    }

    fun removeCoffee(coffee: Coffee){
        if(orderItems.contains(coffee)) orderItems.remove(coffee) else println("${coffee.name} is not present in order...")
        /*val quantity = orderItems[coffee]?:0
         if(quantity == 1){
            orderItems.remove(coffee)
         }else if(quantity > 1){
             orderItems[coffee] = quantity - 1
         }else{
             println("Quantity can not be zero or minus")
         }*/
    }


}