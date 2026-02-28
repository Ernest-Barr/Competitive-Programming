fun countNegativesBF(grid: Array<IntArray>): Int {
    var res = 0

    for (row in grid) {
        for (num in row) {
            if (num < 0) res++
        }
    }

    return res
}

fun countNegatives(grid: Array<IntArray>): Int {
    val n = grid.size
    val m = grid[0].size

    var res = 0
    var curr = m - 1

    for (row in grid) {
        while (curr >= 0 && row[curr] < 0) curr--
        res += m - curr - 1
    }

    return res
} 