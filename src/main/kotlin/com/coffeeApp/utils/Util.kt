package com.coffeeApp.utils

import com.coffeeApp.domain.Coffee
import com.coffeeApp.domain.Menu
import com.coffeeApp.domain.Order
import com.coffeeApp.domain.Size
import java.util.Scanner

class Util {



    fun orderNewCoffee(menu: Menu, order: Order,coffeeID : Int) {
        println("Enter Coffee Id You want to order : (1 to ${menu.list.size-1}")
        if(coffeeID < 1 || coffeeID >= menu.list.size ){
            println("Invalid Coffee ID... Can not proceed...")
            return
        }
        val coffee = menu.list.get(coffeeID)
        if (coffee != null) order.addCoffee(coffee) else return




    }



}