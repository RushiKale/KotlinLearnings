package com.kotlin.basic


fun main() {
    val arrayOfBox : Array<Box> = Array(3) {  Box(1.0, 2.0, 3.0) }
    arrayOfBox.forEach { println(it) }


}

