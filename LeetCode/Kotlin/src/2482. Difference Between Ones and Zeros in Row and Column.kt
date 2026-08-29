private fun onesMinusZeros(grid: Array<IntArray>): Array<IntArray> {
    val m = grid.size
    val n = grid[0].size
    val res: Array<IntArray> = Array(m) { IntArray(n) { 0 } }
    val rowOnes: IntArray = IntArray(m) { 0 }
    val colOnes: IntArray = IntArray(n) { 0 }

    for (i in 0..<m) {
        for (j in 0..<n) {
            if (grid[i][j] == 1) {
                rowOnes[i]++
                colOnes[j]++
            }
        }
    }

    for (i in 0..<m) {
        for (j in 0..<n) {
            res[i][j] = rowOnes[i] + colOnes[j] - (m - rowOnes[i]) - (n - colOnes[j])
        }
    }

    return res
}
