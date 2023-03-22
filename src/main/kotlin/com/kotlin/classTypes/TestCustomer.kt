package com.kotlin.classTypes

import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
//
//fun main() {
//    val mutableCustomerList : MutableList<Customer> = mutableListOf()
//    var run = true
//    var choice : Int
//    val util : Utils = Utils()
//    val sc = Scanner(System.`in`)
//    while (run){
//        println("Enter your choice")
//        println("1. To add The Data")
//        choice = sc.nextInt()
//        when(choice){
//            1 -> {
//                println("Enter Customer Name : ")
//                val name = sc.next()
//                println("Enter Email : ")
//                val email = sc.next()
//                println("Enter Password : ")
//                val password = sc.next()
//                println("Enter Date Of Birth : ")
//                val dob = LocalDate.parse(sc.next())
//                println("Enter Service Plan : ")
//                val servicePlan = sc.next()
//                util.addNewCustomer(name,email,password,dob,servicePlan)
//            }
//
//            else -> println("Bhai ye kya kr raha hai.. mat kr...")
//
//        }
//
//    }
//
//
//
//}

fun main() {
    val dob = LocalDate.parse("1994-06-18")
    val util = Utils()
    util.addNewCustomer("Rushi","rk@gmail.com","RK123",dob,ServicePlan.NO_PLAN.toString())
    util.addNewCustomer("Rushi","rk@gmail.com","RK123",dob,ServicePlan.DIAMOND.toString())
    util.customerList.forEach{ println(it)}
//    val c1 = Customer("Rushi","rk@gmail.com","RK123",dob,ServicePlan.NO_PLAN)
    val valid:Boolean = true
    if(valid){
        100
    }
    else{
        200
    }
}


//fun main() {
//    println(Customer.customerId)
//}