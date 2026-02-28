fun maxProfit(prices: IntArray, fee: Int): Int {
    // var res = 0
    val n = prices.size

    //  n x 2 = choice of bought/ sold on each day

    val dp: Array<IntArray> = Array(n) { IntArray(2) { Int.MIN_VALUE } }

    dp[0][0] = -prices[0]
    dp[0][1] = 0

    // Recurrence:
    // For Purchase: maxOf(dp[i-1][0], prices[i]  - dp[i - 1][1])
    // For Sale: maxOf(dp[i - 1][1], prices[i] + dp[i - 1][0] - fee)
    // Taking max handles not making a transcation ^^^^^

    for (i in 1..<n) {
        dp[i][0] = maxOf(dp[i - 1][0], dp[i - 1][1] - prices[i]) // Buy
        dp[i][1] = maxOf(dp[i - 1][1], prices[i] + dp[i - 1][0] - fee) // Sell
    }

    // for (arr in dp) {
    //     println(arr.joinToString(","))
    // }

    return dp[n - 1][1]
}