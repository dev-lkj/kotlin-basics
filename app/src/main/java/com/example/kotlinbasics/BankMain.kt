package com.example.kotlinbasics

fun main(){

    val tonyBankAccount = BankAccount("Tony Lee", 1338.20)

    tonyBankAccount.deposit(200.0)
    tonyBankAccount.withdraw(1200.00)
    tonyBankAccount.deposit(3000.00)
    tonyBankAccount.deposit(2000.00)
    tonyBankAccount.withdraw(3333.00)

    tonyBankAccount.displayTransactionHistory()
    println("${tonyBankAccount.accountHolder}'s balance is ${tonyBankAccount.balance}")

}