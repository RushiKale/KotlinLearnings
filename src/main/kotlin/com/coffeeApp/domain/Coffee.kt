package com.coffeeApp.domain

data class Coffee(val name : String, val size : Size, val price : Double) {
    val id : Int = counter++

    companion object{
        var counter = 1;
    }

    override fun toString(): String {
        return "Coffee(id=$id,name='$name', size=$size, price=$price)"
    }


}