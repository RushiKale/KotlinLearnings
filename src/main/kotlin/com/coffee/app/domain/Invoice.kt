package com.coffee.app.domain

import com.coffee.app.interfaces.CoffeeList
import com.coffee.app.utils.Color
import java.util.*

class Invoice(private val order: Order) : CoffeeList {
    override fun printList() {
        val obj : CoffeeList = order
        val fmt = Formatter()
        obj.printList()
        val totalAmount = order.mapOfCoffeeToQuantity.map { (coffee, quantity) -> coffee.price * quantity }.sum()
        fmt.format("%1s\n","${Color.BOLD.value}${Color.GREEN.value}----------------------------------------------------")
            .format("%25s %2s %5s\n","TOTAL AMOUNT",":",totalAmount)
            .format("%25s %2s %5s\n","REWARDS EARNED",":",totalAmount / 150)
            .format("%1s\n","----------------------------------------------------${Color.RESET.value}")
        print(fmt)
    }
    }
