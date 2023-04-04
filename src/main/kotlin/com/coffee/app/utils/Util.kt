package com.coffee.app.utils

import com.coffee.app.domain.Menu
import com.coffee.app.domain.Order

class Util {


    fun orderNewCoffee( order: Order, coffeeID : Int, quantity : Int) {
        if(coffeeID < 1 || coffeeID > Menu.coffeeList.size ){
            println("Invalid Coffee ID... Can not proceed...")
            return
        }
        if(quantity < 1){
            println("Invalid Quantity... Unable to proceed...")
            return
        }
        val coffee = DBUtils.getCoffeeById(coffeeID)
        if (coffee != null) order.addCoffee(coffee,quantity)
    }

    fun cancelOrder(order: Order, coffeeID: Int){
        val coffee = DBUtils.getCoffeeById(coffeeID)
        if (coffee != null) order.removeCoffee(coffee)
    }




}