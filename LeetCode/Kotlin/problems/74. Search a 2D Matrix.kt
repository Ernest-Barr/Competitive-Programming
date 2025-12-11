fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    val n = matrix.size
    val m = matrix[0].size

    var l = 0
    var r = m * n - 1

    while (l <= r) {
        val mid = l + (r - l) / 2
        val midVal = matrix[mid / m][mid % m]

        when {
            midVal == target -> return true
            midVal < target -> l = mid + 1
            else -> r = mid - 1
        }
    }

    return false
}