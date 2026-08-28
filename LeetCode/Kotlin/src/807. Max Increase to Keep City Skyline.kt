import kotlin.math.abs

private fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
    /**
    [3, 0, 8, 4] [8, 4, 8, 7]
    [2, 4, 5, 7] [7, 4, 7, 7]
    [9, 2, 6, 3] [9, 4, 8, 7]
    [0, 3, 1, 0] [3, 3, 3, 3]
    values in each row and column must be <= max value of row and column
     */

    var res = 0
    val n = grid.size

    val cols = IntArray(n) { 0 }
    val rows = IntArray(n) { 0 }

    for (i in 0..<n) {
        for (j in 0..<n) {
            cols[i] = maxOf(cols[i], grid[j][i])
            rows[i] = maxOf(rows[i], grid[i][j])
        }
    }

    for (i in 0..<n) {
        for (j in 0..<n) {
            res += abs(grid[i][j] - minOf(cols[j], rows[i]))
        }
    }

    return res
}
