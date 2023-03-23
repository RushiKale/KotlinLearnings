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
    val name = sc.next()
    println("Welcome $name")
    val order : Order = Order(name)
    while(choice != 3){
        printer.printInstructions()
        choice = sc.nextInt()
        when(choice){
            1 -> {
                println("Enter Coffee ID : ")
                val coffeeID = sc.nextInt()
                util.orderNewCoffee(menu,order,coffeeID)
            }
            2 ->  printer.printOrderDetails(order)

            else -> println("Try Again")

        }
    }


    /*
    *
    * Need to ask how many Quantity you want ?  -> then direct update
    * Cost calculation at the time of bill printing
    *
    *
    * */

}