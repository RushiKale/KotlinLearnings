package com.cafe.app.domain

open class Item(val id : Int, val name : String, val price : Double) {

    override fun toString(): String {
        return "id=$id, name='$name', price=$price"
    }

}