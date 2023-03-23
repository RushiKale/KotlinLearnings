package com.coffeeApp.interfaces

import com.coffeeApp.domain.Order

interface PrintOrderIF {
    fun printOrderDetails(order : Order)
}