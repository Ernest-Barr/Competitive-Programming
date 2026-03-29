fun areSimilar(
    mat: Array<IntArray>,
    k: Int,
): Boolean {
    val m = mat.size
    val n = mat[0].size
    val shifts = k % n

    for (i in 0..<m) {
        for (j in 0..<n) {
            when (i % 2) {
                0 -> if (mat[i][j] != mat[i][(n + j - shifts) % n]) return false
                1 -> if (mat[i][j] != mat[i][(j + shifts) % n]) return false
            }
        }
    }

    return true
}
