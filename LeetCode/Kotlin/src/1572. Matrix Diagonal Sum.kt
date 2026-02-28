fun diagonalSum(mat: Array<IntArray>): Int {
    val n = mat.size
    val isOdd = n % 2 == 1
    val mid = n / 2
    var res = 0

    for (i in mat.indices) {
        if (isOdd && i == mid) continue
        res += mat[i][i]
    }

    for (i in mat.indices.reversed()) res += mat[i][n - 1 - i]

    return res
}