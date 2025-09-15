package shop.user.entity

import shop.bankaccount.entity.BankAccount

class User(val name: String, val account: BankAccount) {
    fun showBalance()   {
        println("$name's balance: ${account.getBalance()}")
    }
}