package com.cafe.app.utils

import com.cafe.app.domain.Order

class Util {


    fun orderNewCoffee( order: Order, coffeeID : Int, quantity : Int) {
        val coffee = DBUtils.getCoffeeById(coffeeID)
        if (coffee != null) order.addItem(coffee,quantity)
    }

    fun cancelOrder(order: Order, coffeeID: Int){
        val coffee = DBUtils.getCoffeeById(coffeeID)
        if (coffee != null) order.removeCoffee(coffee)
    }




}