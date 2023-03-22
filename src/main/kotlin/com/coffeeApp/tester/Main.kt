package com.coffeeApp.tester

import com.coffeeApp.domain.Menu
import com.coffeeApp.utils.Print
import java.util.*

fun main() {
    val menu: Menu = Menu()
    val printer : Print = Print()
    printer.printMenu(menu)
    val sc : Scanner = Scanner(System.`in`)
    var choice : Int = 0

    println("Enter Your Name : ")
    val name = sc.next()
    println("Welcome $name")

    while(choice != 3){
        printer.printInstructions()
        choice = sc.nextInt()
        when(choice){
            1 -> {

            }
        }
    }

}