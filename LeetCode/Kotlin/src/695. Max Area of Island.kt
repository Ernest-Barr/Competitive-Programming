fun maxAreaOfIsland(grid: Array<IntArray>): Int {
    var res = 0
    val n = grid.size
    val m = grid[0].size

    fun visit(r: Int, c: Int): Int {
        if (r < n && c < m && r >= 0 && c >= 0 && grid[r][c] == 1) {
            grid[r][c] = 0
            return 1 + visit(r + 1, c) + visit(r - 1, c) + visit(r, c + 1) + visit(r, c - 1)
        }
        return 0
    }

    for (i in 0..<n) {
        for (j in 0..<m) {
            if (grid[i][j] == 1) res = maxOf(res, visit(i, j))
        }
    }

    return res
}