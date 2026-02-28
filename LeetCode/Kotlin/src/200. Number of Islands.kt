private fun numIslands(grid: Array<CharArray>): Int {
    var res = 0
    val n = grid.size
    val m = grid[0].size

    fun visit(r: Int, c: Int) {
        if (r < n && c < m && r >= 0 && c >= 0 && grid[r][c] == '1') {
            grid[r][c] = '0'
            visit(r + 1, c)
            visit(r - 1, c)
            visit(r, c + 1)
            visit(r, c - 1)
        }
    }

    for (i in 0..<n) {
        for (j in 0..<m) {
            if (grid[i][j] == '1') {
                visit(i, j)
                res++
            }
        }
    }

    return res
}