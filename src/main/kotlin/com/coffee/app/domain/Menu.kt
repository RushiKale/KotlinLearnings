package com.coffee.app.domain

import com.coffee.app.interfaces.CoffeeList
import com.coffee.app.utils.Print
import java.util.*

class Menu : CoffeeList {
    val mapOfIdToCoffee : Map<Int, Coffee>

    init{
        val americano_H = Coffee("Americano", Size.HALF,150.0)
        val americano_F = Coffee("Americano", Size.FULL,300.0)
        val cappuccino_H = Coffee("cappuccino", Size.HALF,150.0)
        val cappuccino_F = Coffee("cappuccino", Size.FULL,300.0)
        val chocolate_H = Coffee("chocolate", Size.HALF,150.0)
        val chocolate_F = Coffee("chocolate", Size.FULL,300.0)
        val espresso_H = Coffee("espresso", Size.HALF,150.0)
        val espresso_F = Coffee("espresso", Size.FULL,300.0)
        val late_H = Coffee("late", Size.HALF,150.0)


        mapOfIdToCoffee = mapOf(Pair(americano_H.id,americano_H), Pair(americano_F.id,americano_F),
            Pair(cappuccino_H.id,cappuccino_H), Pair(cappuccino_F.id,cappuccino_F),
            Pair(chocolate_H.id,chocolate_H), Pair(chocolate_F.id,chocolate_F),
            Pair(espresso_H.id,espresso_H), Pair(espresso_F.id,espresso_F),
            Pair(late_H.id,late_H)
        )
    }

    override fun printList() {
        Print.printHeader()
        val fmt = Formatter()
        mapOfIdToCoffee.forEach{ (id,coffee) -> fmt.format("%5s %13s %7s %7s\n",id,coffee.name,coffee.size,coffee.price) }
        print(fmt)
    }
}