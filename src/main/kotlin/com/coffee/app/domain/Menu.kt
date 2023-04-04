package com.coffee.app.domain

import com.coffee.app.utils.Color
import com.coffee.app.utils.DBUtils
import java.util.*

object Menu{
     val coffeeList : List<Coffee> = DBUtils.getListOfCoffee()

    override fun toString(): String {
        val fmt = Formatter()
        fmt.format("%1s\n","${Color.BOLD.value}${Color.GREEN.value}-------------------------------------")
            .format("%5s %13s %7s %7s\n", "ID", "NAME", "SIZE", "PRICE")
            .format("%1s\n","-------------------------------------${Color.RESET.value}${Color.BLUE.value}")
        coffeeList.forEach{ coffee -> fmt.format("%5s %13s %7s %7s\n",coffee.id,coffee.name,coffee.size,coffee.price) }
        fmt.format("%1s",Color.RESET.value)
        return fmt.toString()
    }


}