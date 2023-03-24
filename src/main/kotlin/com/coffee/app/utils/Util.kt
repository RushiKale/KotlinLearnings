package com.coffee.app.utils

import com.coffee.app.domain.Coffee
import com.coffee.app.domain.Menu
import com.coffee.app.domain.Order
import com.coffee.app.domain.Size
import java.util.Scanner

class Util {



    fun orderNewCoffee(menu: Menu, order: Order, coffeeID : Int, quantity : Int) {
        if(coffeeID < 1 || coffeeID > menu.list.size ){
            println("Invalid Coffee ID... Can not proceed...")
            return
        }
        if(quantity < 1){
            println("Invalid Quantity... Unable to proceed...")
            return
        }
        val coffee = menu.list.get(coffeeID)
        if (coffee != null) order.addCoffee(coffee,quantity)
    }

    fun cancelOrder(menu: Menu, order: Order, coffeeID: Int){
        val coffee = menu.list.get(coffeeID)
        if (coffee != null) order.removeCoffee(coffee)
    }




}