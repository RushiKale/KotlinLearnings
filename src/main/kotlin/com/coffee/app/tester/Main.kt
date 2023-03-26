package com.coffee.app.tester

import com.coffee.app.domain.Invoice
import com.coffee.app.domain.Menu
import com.coffee.app.domain.Order
import com.coffee.app.utils.Color
import com.coffee.app.utils.Print
import com.coffee.app.utils.Util
import java.util.*
fun main() {
    val menu: Menu = Menu()
    val printer : Print = Print()

    val sc : Scanner = Scanner(System.`in`)
    var choice : Int = 0
    val util : Util = Util()

    printer.print(menu)
    println("Enter Your Name : ")
    val name = sc.nextLine()
    println("Welcome $name")
    val order : Order = Order(name)
    while(choice != 6){
        printer.printInstructions()
        choice = sc.nextInt()
        when(choice){
            1,2 -> {
                println("Enter Coffee ID : ")
                val coffeeID = sc.nextInt()
                println("How Many coffee you want : ")
                val quantity : Int = sc.nextInt()
                util.orderNewCoffee(menu,order,coffeeID,quantity)
            }
            3 -> {
                printer.print(order)
                println("Enter Coffee ID you want to remove from Order : ")
                val quantity : Int = sc.nextInt()
                util.cancelOrder(menu,order,quantity)
            }
            4 ->  printer.print(order)
            5 ->  {
                printer.print(Invoice(order))
                choice = 6
            }
            else -> println("${Color.GREEN.value}Invalid Input... Please Try Again...${Color.RESET.value}")

        }
    }
}