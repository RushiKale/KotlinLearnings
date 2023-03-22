package com.coffeeApp.domain

data class Order(val customerName : String) {
    val orderID = counter++
    val orderItems : Map<Coffee,Int>

    companion object {
        var counter = 100
    }
}