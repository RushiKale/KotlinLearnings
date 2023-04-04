package com.coffee.app.utils

import com.coffee.app.domain.Coffee
import com.coffee.app.domain.Menu
import com.coffee.app.domain.Size

object DBUtils {
    fun getListOfCoffee() : List<Coffee>{
        return listOf(
            Coffee("Americano", Size.HALF,150.0),
            Coffee("Americano", Size.FULL,300.0),
            Coffee("Cappuccino", Size.HALF,150.0),
            Coffee("Cappuccino", Size.FULL,300.0),
            Coffee("Chocolate", Size.HALF,150.0),
            Coffee("Chocolate", Size.FULL,300.0),
            Coffee("Espresso", Size.HALF,150.0),
            Coffee("Espresso", Size.FULL,300.0),
            Coffee("Late", Size.HALF,150.0)
        )
    }

    fun getCoffeeById(id : Int) : Coffee?{
        return Menu.coffeeList.find { it.id == id }
    }
}