private fun findDegrees(matrix: Array<IntArray>): IntArray {
    val n = matrix.size

    val res: IntArray = IntArray(n) { 0 }

    for (i in matrix.indices) {
        var deg = 0

        for (j in matrix[i].indices) {
            if (matrix[i][j] == 1) deg++
        }

        res[i] = deg
    }

    return res
}
