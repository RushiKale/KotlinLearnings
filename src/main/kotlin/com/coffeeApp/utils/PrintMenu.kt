package com.coffeeApp.utils

import com.coffeeApp.domain.Menu
import com.coffeeApp.interfaces.PrintInstructionsIF
import com.coffeeApp.interfaces.PrintMenuIF

class Print() : PrintMenuIF,PrintInstructionsIF {

    override fun printMenu(menu: Menu) {
        println("Your Menu is : ")
        menu.list.forEach{ println("${it.key}  ${it.value}" )}
    }

    override fun printInstructions() {
        println("1 : Add Coffee to Order")
    }
}