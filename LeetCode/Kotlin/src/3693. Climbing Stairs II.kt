private fun climbStairs(n: Int, costs: IntArray): Int {
    val dp: IntArray = IntArray(n + 1) { Int.MAX_VALUE }
    dp[0] = 0

    for (i in 1..n) {
        for (j in 1..3) {
            if (i - j < 0) continue
            dp[i] = minOf(dp[i], dp[i - j] + costs[i - 1] + j * j)
        }
    }

    // println(dp.joinToString(","))

    return dp[n]
}
