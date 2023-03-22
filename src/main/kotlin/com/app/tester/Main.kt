package com.app.tester

import com.app.domain.AccountType
import com.app.utils.Util
import java.util.*

fun main() {
    Util.dummyData()
    var run : Boolean = true
    var sc : Scanner = Scanner(System.`in`)
    var ch : Int = 0
    while(run){
        println("1. Register new User")
        println("2. Login as User")
        println("3. Login as Admin")
        println("4. Exit")
        ch = sc.nextInt()
        when(ch){
            1 -> Util.register()
            2 -> Util.login()
            3 -> Util.admin()
            4 -> {
                run = false
                println("Thank You..")

            }
            else -> println("Invalid Input..")

        }
    }
}