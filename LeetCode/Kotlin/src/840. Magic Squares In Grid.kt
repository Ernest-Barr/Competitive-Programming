fun numMagicSquaresInside(grid: Array<IntArray>): Int {
    val n = grid.size
    val m = grid[0].size

    if (n < 3 || m < 3) return 0

    fun isValid(r: Int, c: Int): Boolean {
        val top = r - 1
        val bottom = r + 1
        val left = c - 1
        val right = c + 1
        // Check all numbers are unique
        val visited: BooleanArray = BooleanArray(10) { false }

        for (i in top..bottom) {
            for (j in left..right) {
                val num = grid[i][j]
                if (num !in 1..9 || visited[num]) return false
                visited[num] = true
            }
        }
        // Check Rows

        val firstRow = grid[top][left] + grid[top][c] + grid[top][right]
        val secondRow = grid[r][left] + grid[r][c] + grid[r][right]
        val thirdRow = grid[bottom][left] + grid[bottom][c] + grid[bottom][right]

        if (firstRow != secondRow || secondRow != thirdRow) return false
        // Check Columns
        val firstCol = grid[top][left] + grid[r][left] + grid[bottom][left]
        val secondCol = grid[top][c] + grid[r][c] + grid[bottom][c]
        val thirdCol = grid[top][right] + grid[r][right] + grid[bottom][right]
        if (firstCol != secondCol || secondCol != thirdCol) return false

        // Check diagonals
        val first = grid[top][left] + grid[r][c] + grid[bottom][right]
        val second = grid[top][right] + grid[r][c] + grid[bottom][left]

        return first == second && first == firstRow && firstRow == firstCol
    }

    var res = 0

    for (i in 1..<n - 1) {
        for (j in 1..<m - 1) {
            if (isValid(i, j)) res++
        }
    }

    return res
}