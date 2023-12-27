package com.example.bankaccountapp

class BankAccountDetails (var accountHolder:String,var accountBalance:Double) {
    private val accountHistory= mutableListOf<String>()
    fun deposit(amount:Double){
    accountBalance+=amount
    accountHistory.add("$accountHolder deposited $$amount")
     }
    fun withdraw(amount:Double){
        if(amount<=accountBalance) {
            accountBalance -= amount
            accountHistory.add("$accountHolder withdrawn $${amount}")
        }
        else{
            println("Insufficient Balance")
        }
    }
    fun displayTransactionHistory(){
        println("Transaction History For $accountHolder")
        for (historyData in accountHistory){
            println(historyData)
        }
        println("Current Account Balance : $accountBalance")
    }
}