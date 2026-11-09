private fun countServers(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val rows = IntArray(m) { 0 }
    val cols = IntArray(n) { 0 }

    var res = 0

    for (i in 0..<m) {
        for (j in 0..<n) {
            if (grid[i][j] == 1) {
                rows[i]++
                cols[j]++
            }
        }
    }

    for (i in 0..<m) {
        for (j in 0..<n) {
            if (grid[i][j] == 1 && (rows[i] != 1 || cols[j] != 1)) {
                res++
            }
        }
    }

    return res
}
