package com.coffeeApp.interfaces

import com.coffeeApp.domain.Order

interface PrintInvoiceIF {
    fun printInvoice(order: Order)
}