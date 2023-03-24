package com.coffee.app.interfaces

import com.coffee.app.domain.Order

interface PrintOrderIF {
    fun printOrderDetails(order : Order)
}