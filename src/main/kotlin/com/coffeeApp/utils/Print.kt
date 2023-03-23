package com.coffeeApp.utils

import com.coffeeApp.domain.Menu
import com.coffeeApp.domain.Order
import com.coffeeApp.interfaces.PrintInstructionsIF
import com.coffeeApp.interfaces.PrintInvoiceIF
import com.coffeeApp.interfaces.PrintMenuIF
import com.coffeeApp.interfaces.PrintOrderIF

class Print() : PrintMenuIF,PrintInstructionsIF,PrintOrderIF,PrintInvoiceIF {

    override fun printMenu(menu: Menu) {
        println("Your Menu is : ")
        menu.list.forEach{ println("${it.key}  ${it.value}" )}
    }

    override fun printInstructions() {
        println("1 : Order Coffee")
        println("2 : Update quantity")
        println("3 : Cancel coffee")
        println("4 : Print Order Details")
        println("5 : Print Invoice")
        println("6 : Exit")

    }

    override fun printOrderDetails(order: Order) {
        println("----------------------------------------------------------------")
        println("---------------------- ORDER DETAILS ---------------------------")
        println("               CUSTOMER NAME : ${order.customerName.uppercase()}")
        println("                ORDER NUMBER : ${order.orderID} ")
        println("")
        order.orderItems.forEach{ println("${it.key}\t Quantity : ${it.value}") }
        println("\n----------------------------------------------------------------")
    }


    override fun printInvoice(order: Order) {
        val amountList = order.orderItems.map { (coffee, quantity) -> coffee.price * quantity }
        var index = 0
        val totalAmount = amountList.sum()
        printOrderDetails(order)

        println("                TOTAL AMOUNT : $totalAmount             ")
        println("              REWARDS EARNED : ${totalAmount / 150 }             ")
        println("\n----------------------------------------------------------------")

    }
}