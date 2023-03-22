package com.coffeeApp.domain

class Menu {
    val list : Map<Int,Coffee>

    init{
        val americano_H = Coffee("Americano",Size.H,150.0)
        val americano_F = Coffee("Americano",Size.F,300.0)
        val cappuccino_H = Coffee("cappuccino",Size.H,150.0)
        val cappuccino_F = Coffee("cappuccino",Size.F,300.0)
        val chocolate_H = Coffee("chocolate",Size.H,150.0)
        val chocolate_F = Coffee("chocolate",Size.F,300.0)
        val espresso_H = Coffee("espresso",Size.H,150.0)
        val espresso_F = Coffee("espresso",Size.F,300.0)
        val late_H = Coffee("late",Size.H,150.0)
        val late_F = Coffee("late",Size.F,300.0)
        val mocha_H = Coffee("Mocha",Size.H,350.0)
        val mocha_F = Coffee("Mocha",Size.F,300.0)

        list = mapOf(Pair(1,americano_H), Pair(2,americano_F),
            Pair(3,cappuccino_H), Pair(4,cappuccino_F),
            Pair(5,chocolate_H), Pair(6,chocolate_F),
            Pair(7,espresso_H), Pair(8,espresso_F),
            Pair(9,mocha_H), Pair(10,mocha_F),
            Pair(11,late_H), Pair(12,late_F)
        )
    }
}