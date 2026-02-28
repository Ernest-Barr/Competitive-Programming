private fun minCost(costs: Array<IntArray>): Int {
    val m = costs.size
    val n = costs[0].size
    val dp: Array<IntArray> = Array (m) { IntArray(n) { Int.MAX_VALUE } }

    dp[0] = costs[0]

    for (i in 1..<m) {
        for (j in 0..<n) {
            dp[i][j] = costs[i][j] + when (j) {
                0 -> minOf(dp[i - 1][1], dp[i - 1][2])
                1 -> minOf(dp[i - 1][0], dp[i - 1][2])
                else -> minOf(dp[i - 1][0], dp[i - 1][1])
            }
        }
    }

    return dp[m - 1].min()
}