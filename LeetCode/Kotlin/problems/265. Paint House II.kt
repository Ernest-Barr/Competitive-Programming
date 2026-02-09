private fun minCostII(costs: Array<IntArray>): Int {
    val m = costs.size
    val n = costs[0].size
    val dp: Array<IntArray> = Array (m) { IntArray(n) { Int.MAX_VALUE } }

    dp[0] = costs[0]

    for (i in 1..<m) {
        for (j in 0..<n) {
            for (k in 0..<n) {
                if (j == k) continue
                dp[i][j] = minOf(dp[i][j], costs[i][j] + dp[i - 1][k])
            }
        }
    }

    return dp[m - 1].min()
}