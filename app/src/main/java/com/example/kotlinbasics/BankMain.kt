package com.example.kotlinbasics

fun main(){

//    val tonyBankAccount = BankAccount("Tony Lee", 1338.20)
//
//    tonyBankAccount.deposit(200.0)
//    tonyBankAccount.withdraw(1200.00)
//    tonyBankAccount.deposit(3000.00)
//    tonyBankAccount.deposit(2000.00)
//    tonyBankAccount.withdraw(3333.00)
//
//    tonyBankAccount.displayTransactionHistory()
//    println("${tonyBankAccount.accountHolder}'s balance is ${tonyBankAccount.balance}")

//    val numbers = listOf(1,2,3)
//    val doubled = numbers.map{ it * 2 } // Result [2,4,6]
//    println(doubled)

//    val blueRoseVase = Vase(color = "Blue", design = "Rose")
//    val redRoseVase = blueRoseVase.copy(color= "Red")
//    println(blueRoseVase)
//    println(redRoseVase)

    // nullable string
    val name : String? = "Ella"
    name?.let{
        println(it.toUpperCase())
    }


}


data class Vase(val color:String, val design: String)