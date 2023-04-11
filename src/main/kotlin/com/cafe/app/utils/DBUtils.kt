package com.cafe.app.utils

import com.cafe.app.domain.Burger
import com.cafe.app.domain.Coffee
import com.cafe.app.domain.Item
import com.cafe.app.domain.Menu


object DBUtils {
    fun getListOfMenu() : List<Item>{
        return listOf(
            Coffee(1,"Coffee",30.0),
            Burger(2,"Burger",50.0)
        )

    }

    fun getCoffeeById(id : Int) : Item? {
        return Menu.itemList.find { it.id == id }
    }
}