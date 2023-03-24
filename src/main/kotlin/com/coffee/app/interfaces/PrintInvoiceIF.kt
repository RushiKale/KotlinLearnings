package com.coffee.app.interfaces

import com.coffee.app.domain.Order

interface PrintInvoiceIF {
    fun printInvoice(order: Order)
}