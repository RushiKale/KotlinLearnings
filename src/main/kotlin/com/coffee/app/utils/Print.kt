package com.coffee.app.utils

import com.coffee.app.domain.Menu
import com.coffee.app.domain.Order
import com.coffee.app.interfaces.*
import java.util.Formatter

class Print() : PrintIF, PrintInstructionsIF {

    companion object{
        fun printHeader(){
            val fmt = Formatter()
            fmt.format("%1s\n","-------------------------------------")
            fmt.format("%5s %13s %7s %7s\n", "ID", "NAME", "SIZE", "PRICE")
            fmt.format("%1s\n","-------------------------------------")
           print(fmt)
        }
    }

    override fun print(obj : CoffeeList) {
        obj.printList()
    }

    override fun printInstructions() {
        println("1 : Order Coffee")
        println("2 : Update quantity")
        println("3 : Cancel coffee")
        println("4 : Print Order Details")
        println("5 : Print Invoice")
        println("6 : Exit")
    }
}