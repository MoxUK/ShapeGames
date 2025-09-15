package shop.bankaccount.service.impl

import shop.bankaccount.service.AccountService
import shop.bankaccount.entity.BankAccount

class AccountServiceImpl : AccountService   {
    override fun withdraw(account: BankAccount, amount: Double) : Boolean   {
        return account.withdraw(amount)
    }

    override fun deposit(account: BankAccount, amount: Double) : Boolean    {
        return account.deposit(amount)
    }
}