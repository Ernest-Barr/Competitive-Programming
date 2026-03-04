fun numSpecial(mat: Array<IntArray>): Int {
    val n = mat.size
    val m = mat[0].size
    val rc = IntArray(n) { 0 }
    val cc = IntArray(m) { 0 }

    var res = 0

    for (i in mat.indices) {
        for (j in mat[0].indices) {
            if (mat[i][j] == 1) {
                rc[i]++
                cc[j]++
            }
        }
    }

    for (i in mat.indices) {
        for (j in mat[0].indices) {
            if (mat[i][j] == 1 && rc[i] == 1 && cc[j] == 1) res++
        }
    }

    return res
}
