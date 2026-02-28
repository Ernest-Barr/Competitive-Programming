fun maximumWealth(accounts: Array<IntArray>): Int {
    return accounts.maxOf { it.sum() }
}