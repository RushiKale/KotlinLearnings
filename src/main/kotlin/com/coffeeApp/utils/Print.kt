package com.coffeeApp.utils

import com.coffeeApp.domain.Menu
import com.coffeeApp.domain.Order
import com.coffeeApp.interfaces.PrintInstructionsIF
import com.coffeeApp.interfaces.PrintMenuIF
import com.coffeeApp.interfaces.PrintOrderIF

class Print() : PrintMenuIF,PrintInstructionsIF,PrintOrderIF {

    override fun printMenu(menu: Menu) {
        println("Your Menu is : ")
        menu.list.forEach{ println("${it.key}  ${it.value}" )}
    }

    override fun printInstructions() {
        println("1 : Add Coffee to Order")
        println("2 : Print Order Details")

    }

    override fun printOrderDetails(order: Order) {
        println("----------------------------------------------------------------")
        println("---------------------- ORDER DETAILS ---------------------------")
        println("             CUSTOMER NAME : ${order.customerName.uppercase()}")
        println("              ORDER NUMBER : ${order.orderID}")
        order.orderItems.forEach{ println("${it.key}\t Quantity : ${it.value}")
        }
    }
}