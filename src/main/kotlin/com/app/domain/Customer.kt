package com.app.domain

class Customer(val Name : String,val city : String,val account: Account ) {
    val customerId : Int = id++
    var password : String = "1234"

    companion object{
        var id : Int = 1
    }

    override fun toString(): String {
        return "customerId=$customerId,Name='$Name', city='$city', \naccount=$account)"
    }

}