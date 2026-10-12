fun minimumCosts(regular: IntArray, express: IntArray, expressCost: Int): LongArray {
    val n = regular.size
    val dp: Array<LongArray> = Array(2) { LongArray(n + 1) { 0 } }
    val res: LongArray = LongArray(n) { 0 }

    dp[0][0] = 0L
    dp[1][0] = expressCost.toLong()

    for (i in 0..<n) {
        dp[0][i + 1] = minOf(dp[0][i], dp[1][i]) + regular[i]
        dp[1][i + 1] = minOf(dp[1][i], dp[0][i] + expressCost) + express[i]
        res[i] = minOf(dp[0][i + 1], dp[1][i + 1])
    }

    return res
}
