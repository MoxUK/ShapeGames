package shop.bankaccount.service

import shop.bankaccount.entity.BankAccount

interface AccountService {
    fun withdraw(account: BankAccount, amount: Double): Boolean
    fun deposit(account: BankAccount, amount: Double): Boolean
}