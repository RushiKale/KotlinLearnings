package com.coffee.app.utils

import com.coffee.app.domain.Menu
import com.coffee.app.domain.Order

class Util {


    fun orderNewCoffee( order: Order, coffeeID : Int, quantity : Int) {

        val coffee = DBUtils.getCoffeeById(coffeeID)
        if (coffee != null) order.addCoffee(coffee,quantity)
    }

    fun cancelOrder(order: Order, coffeeID: Int){
        val coffee = DBUtils.getCoffeeById(coffeeID)
        if (coffee != null) order.removeCoffee(coffee)
    }




}