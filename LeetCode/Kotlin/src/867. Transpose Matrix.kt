private fun transpose(matrix: Array<IntArray>): Array<IntArray> {
    val m = matrix.size
    val n = matrix[0].size
    val res: Array<IntArray> = Array(n) { IntArray(m) { 0 } }

    for (i in 0..<m) {
        for (j in 0..<n) {
            res[j][i] = matrix[i][j]
        }
    }

    return res
}
