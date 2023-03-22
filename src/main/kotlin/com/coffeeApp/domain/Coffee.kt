package com.coffeeApp.domain

data class Coffee(val name : String, val size : Size, val price : Double) {
    val id : Long = counter++

    companion object{
        var counter = 0L;
    }

}