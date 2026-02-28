fun uniquePathsWithObstacles(grid: Array<IntArray>): Int {
    if (grid[0][0] == 1) return 0

    val m = grid.size
    val n = grid[0].size
    val dp: Array<IntArray> = Array(m) { IntArray(n) { 1 } }

    for (i in 1..<m) dp[i][0] = if (dp[i - 1][0] == 1 && grid[i][0] == 0) 1 else 0
    for (i in 1..<n) dp[0][i] = if (dp[0][i - 1] == 1 && grid[0][i] == 0) 1 else 0

    for (i in 1..<m) {
        for (j in 1..<n) {
            dp[i][j] = when (grid[i][j]) {
                0 -> dp[i - 1][j] + dp[i][j - 1]
                else -> 0
            }
        }
    }

    return dp[m - 1][n - 1]
}