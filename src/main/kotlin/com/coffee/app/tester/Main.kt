package com.coffee.app.tester

import com.coffee.app.domain.Invoice
import com.coffee.app.domain.Menu
import com.coffee.app.domain.Order
import com.coffee.app.utils.Color
import com.coffee.app.utils.Util
import java.util.*
fun main() {
    val sc : Scanner = Scanner(System.`in`)
    var choice : Int = 0
    val util : Util = Util()

    println(Menu)
    println("Enter Your Name : ")
    val name = sc.nextLine()
    println("Welcome $name")
    val order : Order = Order(name)
    while(choice != 5){
        println("1 : Order Coffee")
        println("2 : Update quantity")
        println("3 : Cancel coffee")
        println("4 : Print Order Details")
        println("5 : Print Invoice")
        println("6 : Exit")
        choice = sc.nextInt()
        when(choice){
            1,2 -> {
                println("Enter Coffee ID : ")
                val coffeeID = sc.nextInt()
                println("How Many coffee you want : ")
                val quantity : Int = sc.nextInt()
                util.orderNewCoffee(order,coffeeID,quantity)
            }
            3 -> {
                println(order)
                println("Enter Coffee ID you want to remove from Order : ")
                val quantity : Int = sc.nextInt()
                util.cancelOrder(order,quantity)
            }
            4 ->  println(order)
            5 ->  println(Invoice(order))
            else -> println("${Color.GREEN.value}Invalid Input... Please Try Again...${Color.RESET.value}")

        }
    }
}