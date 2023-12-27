package com.example.bankaccountapp

fun main(){
    val kushagraAccount=BankAccountDetails("Kushagra",100.0)
    println(kushagraAccount.accountHolder)
    kushagraAccount.deposit(1000.0)
    kushagraAccount.withdraw(100.0099)
    kushagraAccount.withdraw(99.0)
    kushagraAccount.deposit(1.0)
    println(kushagraAccount.displayTransactionHistory())

}