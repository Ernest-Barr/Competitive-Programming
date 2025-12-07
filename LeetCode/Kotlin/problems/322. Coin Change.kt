fun coinChange(coins: IntArray, amount: Int): Int {
    val n = coins.size
    val dp: IntArray = IntArray(amount + 1) { 10001 }

    dp[0] = 0

    for (i in 1..amount) {
        for (coin in coins) {
            if (coin <= i) dp[i] = minOf(dp[i], dp[i - coin] + 1)
        }
    }

    return if (dp[amount] <= amount) dp[amount] else -1
}