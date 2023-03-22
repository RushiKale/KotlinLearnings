package com.kotlin.basic

data class Box(val length : Double,val breadth : Double, val height : Double) {
    fun getVolume() : Double {
        return length * breadth * height
    }
}