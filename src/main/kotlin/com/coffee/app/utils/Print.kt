package com.coffee.app.utils

import com.coffee.app.domain.Menu
import com.coffee.app.domain.Order
import com.coffee.app.interfaces.PrintInstructionsIF
import com.coffee.app.interfaces.PrintInvoiceIF
import com.coffee.app.interfaces.PrintMenuIF
import com.coffee.app.interfaces.PrintOrderIF
import java.util.Formatter

class Print() : PrintMenuIF, PrintInstructionsIF, PrintOrderIF, PrintInvoiceIF {

    override fun printMenu(menu: Menu) {
        val fmt : Formatter = Formatter()
        fmt.format("%1s\n","-------------------------------------")
        fmt.format("%5s %13s %7s %7s\n", "ID", "NAME", "SIZE", "PRICE")
        fmt.format("%1s\n","-------------------------------------")

        menu.list.forEach{
            fmt.format("%5s %13s %7s %7s\n",it.value.id,it.value.name,it.value.size,it.value.price)
        }
        println(fmt)

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
        val fmt : Formatter = Formatter()

        fmt.format("%1s\n","-------------------------------------")
        fmt.format("%26s\n","ORDER DETAILS")
        fmt.format("%18s %2s %5s\n","CUSTOMER NAME",":",order.customerName.uppercase())
        fmt.format("%18s %2s %5s\n","ORDER NUMBER",":",order.orderID)
        fmt.format("%1s\n","-------------------------------------")
        fmt.format("%5s %13s %7s %7s\n", "ID", "NAME", "SIZE", "PRICE")
        fmt.format("%1s\n","-------------------------------------")

//        println("----------------------------------------------------------------")
//        println("---------------------- ORDER DETAILS ---------------------------")
//        println("               CUSTOMER NAME : ${order.customerName.uppercase()}")
//        println("                ORDER NUMBER : ${order.orderID} ")
//        println("")
//        order.orderItems.forEach{ println("${it.key}\t Quantity : ${it.value}") }
        order.orderItems.forEach{ fmt.format("%5s %13s %7s %7s\n",it.key.id,it.key.name,it.key.size,it.key.price) }

        println(fmt)
    }


    override fun printInvoice(order: Order) {
        val amountList = order.orderItems.map { (coffee, quantity) -> coffee.price * quantity }
        var index = 0
        val totalAmount = amountList.sum()
        val fmt : Formatter = Formatter()
        printOrderDetails(order)
        fmt.format("%1s\n","-------------------------------------")
        fmt.format("%18s %2s %5s\n","TOTAL AMOUNT",":",totalAmount)
        fmt.format("%18s %2s %5s\n","REWARDS EARNED",":",totalAmount / 150)
        fmt.format("%1s\n","-------------------------------------")
        println(fmt)

    }
}