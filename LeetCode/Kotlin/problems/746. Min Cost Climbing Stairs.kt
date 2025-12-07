fun minCostClimbingStairs(cost: IntArray): Int {
    val n = cost.size
    val dp: IntArray = IntArray(n) { Int.MAX_VALUE }

    dp[0] = cost[0]
    dp[1] = cost[1]

    for (i in 2..<n) {
        dp[i] = cost[i] + minOf(dp[i - 1], dp[i - 2])
    }

    return minOf(dp[n - 1], dp[n - 2])
}