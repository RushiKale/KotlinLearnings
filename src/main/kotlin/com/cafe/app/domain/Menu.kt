package com.cafe.app.domain

import com.cafe.app.utils.DBUtils
import com.coffee.app.utils.Color
import java.util.*

object Menu{

    val itemList : List<Item> = DBUtils.getListOfMenu()

    override fun toString(): String {
        val fmt = Formatter()
        fmt.format("%1s\n","${Color.BOLD.value}${Color.GREEN.value}-------------------------------------")
            .format("%5s %13s %7s\n", "ID", "NAME", "PRICE")
            .format("%1s\n","-------------------------------------${Color.RESET.value}${Color.BLUE.value}")
        itemList.forEach{ item -> fmt.format("%5s %13s %7s\n",item.id,item.name,item.price) }
        fmt.format("%1s", Color.RESET.value)
        return fmt.toString()


    }


}