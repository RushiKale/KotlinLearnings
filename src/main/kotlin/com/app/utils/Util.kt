package com.app.utils

import com.app.domain.*
import java.util.*

object Util {
    var customers : MutableMap<Int,Customer> = mutableMapOf()
    var banks : MutableMap<Int,Bank> = mutableMapOf()
    val sc = Scanner(System.`in`)

    fun dummyData(){
        var bank :Bank = Bank("ICICI","PUNE")
        banks[bank.bankId] = bank
        val bank1 = Bank("HDFC","MUMBAI")
        banks[bank1.bankId] = bank1

        val customer1 :  Customer = Customer("Rushikesh","Pune", Account(AccountType.SAVING,bank))
        val customer2 :  Customer = Customer("ujwal","Pune", Account(AccountType.SAVING,bank))
        val customer3 :  Customer = Customer("Udit","Pune", Account(AccountType.CURRENT,bank))
        val customer4 :  Customer = Customer("Tejesh","Pune", Account(AccountType.CURRENT,bank))
        val customer5 :  Customer = Customer("Trishal","Pune", Account(AccountType.CURRENT,bank))

        customers[customer1.customerId] = customer1
        customers[customer2.customerId] = customer2
        customers[customer3.customerId] = customer3
        customers[customer4.customerId] = customer4
        customers[customer5.customerId] = customer5
    }

    fun addNewCustomer(name: String, city: String, bankID: Int, accountTypeId: Int) : Boolean{
        val bank : Bank = banks.get(bankID) ?: return false
        val newCustomer : Customer = Customer(name,city, Account(AccountType.values()[accountTypeId],bank))
        customers[newCustomer.customerId] = newCustomer
        println(newCustomer)
        return true
    }

    fun validateUser(accNo: Int, password: String):Customer? {
        val customer = customers.get(accNo)?: return null
        return if(customer.password == password) customer else null
    }

    fun printCustomerDetails(c: Customer) {
        println("---------------------------------------------")
        println(c)
        println("---------------------------------------------")

    }

    fun transferAmount(customerId: Int, receiverAccountNo: Int, amount: Double): Boolean {
        val sender : Customer = customers.get(customerId) ?: return false
        val receiver: Customer = customers.get(receiverAccountNo) ?: return false
        if(amount > sender.account.balance){
            println("You dont have enough balance to complete this transaction")
            return false
        }
        sender.account.balance = sender.account.balance - amount
        receiver.account.balance = receiver.account.balance + amount
        return true
    }


    fun register(){
        println("Enter Branch ID of  Bank You want to select")
        banks.forEach{
            println("${it.key} - ${it.value.name}")
        }
        var bankID : Int = sc.nextInt()
        println("Select Account Type")
        AccountType.values().forEach {
            println("${it.ordinal} - ${it.name}")
        }
        val accountTypeId : Int = sc.nextInt()
        println("Enter Name and City")
        var name : String = sc.next()
        var city : String = sc.next()
        if(Util.addNewCustomer(name,city,bankID,accountTypeId))
            println("Customer registered successfully..")
        else
            println("Something went wrong... Try Again...")
    }


    fun login(){
        println("Enter your Account No")
        val accNo : Int = sc.nextInt()
        val password : String = sc.next()
        val authorizedCustomer = Util.validateUser(accNo,password)
        if(authorizedCustomer == null){
            println("Invalid Credentials.. Try Again")
            return
        }else{
            println("User successfully logged in...")
        }
        var choice : Int = 0
        var login = true
        while(login){
            println("Enter \n1. User Info \n2.Check Balance \n3.Transfer Amount \n4.Logout")
            choice = sc.nextInt()
            when(choice){
                1 -> printCustomerDetails(authorizedCustomer)
                2->  println("Your balance is ${authorizedCustomer.account.balance}")
                3->{
                    println("Enter amount you want to transfer : ")
                    val amount = sc.nextInt().toDouble()
                    println("Enter Receiver account ID ")
                    val receiverAccountNo : Int = sc.nextInt()
                    if(transferAmount(authorizedCustomer.customerId,receiverAccountNo,amount)){
                        println("Transaction Completed...")
                    }
                    else{
                        println("Transaction Failed...")
                    }

                }
                4->{
                    println("Logged off...")
                    login = false
                }
                else ->{
                    println("Invalid Input")
                }
            }
        }
    }


    fun searchUser() {
        println("1. Search by CustomerID")
        println("2. Search by Name")
        when (sc.nextInt()) {
            1 -> searchByCustomerId()
            2 -> searchByName()
            else -> println("Wrong Input...")

        }
    }


    fun searchByCustomerId(): Customer? {
        println("Enter cutsomerID ")
        val id = sc.nextInt()
        return customers.get(id)
    }

    fun searchByName(){
        println("Enter Customer Name to Search ")
        val name = sc.next()
        val customer : Map<Int, Customer> = customers.filter { (k,v) -> v.Name == name }
        customer.forEach { println(it)}
    }



    fun admin() {
        println("Enter Username and Password : ")
        var userName = sc.next()
        var password = sc.next()
        if(userName != "admin" || password != "admin"){
            println("Failed to Login... Please Try Again...")
            return
        }

        println("1. Search user Details")
        println("2. Delete User - YET TO COMPLETE")
        println("3. Show Transactions ")
        println("4. Add New Banks")

        var choice = 0
        var run = true
        while(run){
            when(choice){
                1 -> searchUser()
                2 -> deleteUser()
                3 -> run = false
                else -> println("Invalid Input.. Try Again..")

            }
        }
    }

    private fun deleteUser() {
        println("NOT COMPLETED...")
    }


}