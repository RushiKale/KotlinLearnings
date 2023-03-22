package com.kotlin

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val list = setOf<Int>(1,2,3)
    println(list)
    println(list)
    println(list)
    println(list)
    println(list)
    println(list)

}

data class Book(val titie : String = "Title"+id++){
    companion object{
        var id = 1
    }
}