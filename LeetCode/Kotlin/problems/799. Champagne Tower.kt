fun champagneTower(poured: Int, query_row: Int, query_glass: Int): Double {
    val dp: Array<DoubleArray> = Array(101) { DoubleArray(101) { 0.0 } }
    dp[0][0] = poured / 1.0

    for (i in 0..query_row) {
        for (j in 0..i) {
            val next = (dp[i][j] - 1.0) / 2.0
            if (next > 0.0) {
                dp[i + 1][j] += next
                dp[i + 1][j + 1] += next
            }
        }
    }

    return minOf(dp[query_row][query_glass], 1.0)
}