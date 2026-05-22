fun fixedPoint(arr: IntArray): Int {
    val n = arr.size
    var l = 0
    var r = n - 1
    var res = -1

    while (l <= r) {
        val m = l + (r - l) / 2

        when {
            arr[m] == m -> {
                res = m
                r = m  - 1
            }
            arr[m] < m -> l = m + 1
            else -> r = m - 1
        }
    }

    return res
}
