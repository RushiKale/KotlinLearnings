package com.app.domain

class Account(val accountType : AccountType, val bank: Bank, var balance : Double = 10000.0) {
    val accountNo : Int = (bank.bankId*10) + id++

    companion object{
        var id : Int = 1
    }

    override fun toString(): String {
        return "accountNo=$accountNo, accountType=$accountType, balance=$balance \nbank=$bank)"
    }

}