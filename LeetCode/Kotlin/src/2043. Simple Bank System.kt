private class Bank(var balance: LongArray) {

    fun isValidAcc(n: Int) = n >= 1 && n <= balance.size

    fun transfer(account1: Int, account2: Int, money: Long): Boolean {
        if (!(isValidAcc(account1) && isValidAcc(account2))) return false
        if (balance[account1 - 1] - money < 0) return false

        balance[account1 - 1] -= money
        balance[account2 - 1] += money
        return true
    }

    fun deposit(account: Int, money: Long): Boolean {
        if (!isValidAcc(account)) return false

        balance[account - 1] += money
        return true
    }

    fun withdraw(account: Int, money: Long): Boolean {
        if (!isValidAcc(account)) return false

        if (balance[account - 1] - money < 0) return false

        balance[account - 1] -= money

        return true
    }

}