package com.coffee.app.utils


import com.coffee.app.interfaces.*

class Print() : PrintIF, PrintInstructionsIF {

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