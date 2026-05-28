private fun satisfiesConditions(grid: Array<IntArray>): Boolean {
    val m = grid.size
    val n = grid[0].size

    for (i in 0..<m) {
        for (j in 0..<n) {
            when {
                i + 1 < m && grid[i][j] != grid[i + 1][j] -> return false
                j + 1 < n && grid[i][j] == grid[i][j + 1] -> return false
            }
        }
    }

    return true
}
