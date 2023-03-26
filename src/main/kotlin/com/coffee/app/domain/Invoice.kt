package com.coffee.app.domain

import com.coffee.app.interfaces.CoffeeList
import java.util.*

class Invoice(private val order: Order) : CoffeeList {
    override fun printList() {
        val obj : CoffeeList = order
        val fmt = Formatter()
        obj.printList()
        val totalAmount = order.mapOfCoffeeToQuantity.map { (coffee, quantity) -> coffee.price * quantity }.sum()
        fmt.format("%1s\n","----------------------------------------------------")
        fmt.format("%25s %2s %5s\n","TOTAL AMOUNT",":",totalAmount)
        fmt.format("%25s %2s %5s\n","REWARDS EARNED",":",totalAmount / 150)
        fmt.format("%1s\n","----------------------------------------------------")
        print(fmt)
    }
    }
