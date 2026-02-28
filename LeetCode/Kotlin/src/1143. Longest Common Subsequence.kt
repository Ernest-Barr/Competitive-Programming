fun longestCommonSubsequence(text1: String, text2: String): Int {
    val n = text1.length
    val m = text2.length
    val dp: Array<IntArray> = Array(n + 1) { IntArray(m + 1) { 0 } }

    for (i in 1..n) {
        for (j in 1..m) {
            dp[i][j] = when {
                text1[i - 1] == text2[j - 1] -> 1 + dp[i - 1][j - 1]
                else -> maxOf(dp[i - 1][j], dp[i][j - 1])
            }
        }
    }

    return dp[n][m]
}