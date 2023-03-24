package com.coffeeApp.tester

import com.coffeeApp.domain.*
import com.coffeeApp.utils.*
import java.util.*
fun main() {
    val menu: Menu = Menu()
    val printer : Print = Print()
    printer.printMenu(menu)
    val sc : Scanner = Scanner(System.`in`)
    var choice : Int = 0
    val util : Util = Util()

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
                printer.printOrderDetails(order)
                println("Enter Coffee ID you want to remove from Order : ")
                val quantity : Int = sc.nextInt()
                util.cancelOrder(menu,order,quantity)
            }
            4 ->  printer.printOrderDetails(order)
            5 ->  {
                printer.printInvoice(order)
                choice = 6
            }
            else -> println("Try Again")

        }
    }
}