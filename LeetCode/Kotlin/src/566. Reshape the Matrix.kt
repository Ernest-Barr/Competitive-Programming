private fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
    val n = mat.size * mat[0].size

    return when {
        n != r * c -> mat
        else -> {
            val res: Array<IntArray> = Array(r) { IntArray(c) { 0 }}
            var curr = 0

            for (i in mat.indices) {
                for (j in mat[0].indices) {
                    res[curr / c][curr % c] = mat[i][j]
                    curr++
                }
            }

            res
        }
    }
}
