private fun islandPerimeter(grid: Array<IntArray>): Int {
    val n = grid.size
    val m = grid[0].size
    var res = 0

    fun visit(r: Int, c: Int): Int {
        if (r > n - 1 || c > m - 1 || r < 0 || c < 0 || grid[r][c] == 0) return 1
        if (grid[r][c] == -1) return 0
        grid[r][c] = -1
        return visit(r + 1, c) + visit(r - 1, c) + visit(r, c + 1) + visit(r, c - 1)
    }

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            if (grid[i][j] == 1) res += visit(i, j)
        }
    }

    return res
}