package com.kotlin.classTypes

import java.time.LocalDate

class Utils {


    val customerList : MutableList<Customer> = mutableListOf()

    val DOB_MIN : LocalDate = LocalDate.of(1995, 1, 1);



    fun validateEmail(email : String):Boolean{
        if(emailAlreadyExist(email))
            return false
        return email.contains("@") && (email.endsWith(".com") || email.endsWith(".org"))
    }

    private fun emailAlreadyExist(email : String): Boolean {
        customerList.forEach{if (it.email == email) return true}
        return false
    }

    fun validatePassword(password: String): Boolean{
//        return password.contains("[a-z]+[A-Z]+[#@$%*\\-]+[0-9]+")
        return true
    }

    fun validateDob(dateOfBirth: LocalDate):Boolean{
        return dateOfBirth.isBefore(DOB_MIN)
    }

    fun addNewCustomer(name: String, email: String, password: String, dob: LocalDate, servicePlan: String) {
        if(validateEmail(email) && validatePassword(password) && validateDob(dob)){
//            val plan : ServicePlan = ServicePlan.valueOf(servicePlan)
            val newCustomer = Customer(name,email,password,dob,servicePlan)
//            customerList.forEach{
//                if(it == newCustomer) {
//                    println("Customer already exist...")
//                    return
//                }
//            }
            if (customerList.contains(newCustomer)) {
                println("Customer already exist...")
                return
            }

            customerList.add(newCustomer)

            println("-------- New Customer added --------")
            println(newCustomer)
            println("------------------------------------")
        }
        else{
            println("Try again...")
        }
    }


}