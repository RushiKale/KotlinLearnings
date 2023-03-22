package com.coffeeApp.utils

import com.coffeeApp.domain.Menu
import com.coffeeApp.interfaces.PrintMenuIF

class PrintMenu() : PrintMenuIF {

    override fun printMenu(menu: Menu) {
        println("Your Menu is : ")
        menu.list.forEach{ println("${it.key}  ${it.value}" )}
    }

}