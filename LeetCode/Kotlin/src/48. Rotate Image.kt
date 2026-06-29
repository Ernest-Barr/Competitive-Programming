private fun rotate(matrix: Array<IntArray>): Unit {
    val n = matrix.size

    // Transpose & Reflect
    for (i in 0..<n) {
        for (j in (i + 1)..<n) matrix[i][j] = matrix[j][i].also { matrix[j][i] = matrix[i][j] }
        for (j in 0..<(n / 2)) matrix[i][j] = matrix[i][n - j - 1].also { matrix[i][n - j - 1] = matrix[i][j] }
    }
}
