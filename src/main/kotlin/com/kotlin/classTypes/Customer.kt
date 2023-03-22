package com.kotlin.classTypes

import java.time.LocalDate

data class Customer(val name : String,val email : String, val dob : LocalDate) {
    /***
     *  lateinit -
     */
    val id : Int = customerId++
    var servicePlan : ServicePlan = ServicePlan.NO_PLAN
    var password : String = "DEFAULT_PASSWORD"

    constructor( name : String, email : String,  password : String, dob : LocalDate,plan : String):this(name,email, dob){
        this.password = password
        servicePlan = when(plan){
            "GOLD" -> ServicePlan.GOLD
            "DIAMOND" -> ServicePlan.DIAMOND
            "PLATINUM" -> ServicePlan.PLATINUM
            else -> ServicePlan.NO_PLAN
        }
    }

    companion object{
        var customerId : Int = 1
    }

}

enum class ServicePlan(val price : Double,val services : List<String>) {
    NO_PLAN(0.0, listOf()),
    SILVER(100.0, listOf("service 1")),
    GOLD(200.0, listOf("services 1","services 2")),
    DIAMOND(300.0,listOf("services 1","services 2","Service 3")),
    PLATINUM(400.0,listOf("services 1","services 2","Service 3","Service 4"))
}


