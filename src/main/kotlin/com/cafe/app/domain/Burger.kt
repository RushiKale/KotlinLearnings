package com.cafe.app.domain

class Burger(id:Int,name : String,price : Double = 0.0):Item(id, name, price) {

    override fun toString(): String {
        return "${super.toString()} "
    }

}