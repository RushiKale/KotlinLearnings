package com.cafe.app.domain

import com.cafe.app.utils.Color
import java.util.*

class Invoice(private val order: Order){
    override fun toString(): String {
        if(order.mapOfCoffeeToQuantity.isEmpty()){
            return "Order is Empty"
        }

        val fmt = Formatter()
        val totalAmount = order.mapOfCoffeeToQuantity.map { (coffee, quantity) -> coffee.price * quantity }.sum()
        fmt.format("%1s\n","${Color.BOLD.value}${Color.GREEN.value}----------------------------------------------------")
            .format("%25s %2s %5s\n","TOTAL AMOUNT",":",totalAmount)
            .format("%25s %2s %5s\n","REWARDS EARNED",":",totalAmount / 150)
            .format("%1s\n","----------------------------------------------------${Color.RESET.value}")
        return order.toString() + fmt.toString()
    }
}
