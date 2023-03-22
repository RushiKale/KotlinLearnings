package com.app.domain

data class Bank(val name : String,val city : String) {
    val bankId : Int = id++

    companion object{
        var id : Int = 1000
    }

    override fun toString(): String {
        return " bankId=$bankId='$name', city='$city')"
    }


}