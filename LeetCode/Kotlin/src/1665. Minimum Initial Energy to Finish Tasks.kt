private fun minimumEffort(tasks: Array<IntArray>): Int {
    fun isValid(energy: Int): Boolean {
        var num = energy

        for ((required, start) in tasks) {
            if (start > num) return false

            num -= required
        }

        return true
    }

    var res = Int.MAX_VALUE

    // Sort
    tasks.sortWith(compareBy {it[0] - it[1]})

    // Binary Search

    var l = 0
    var r = Int.MAX_VALUE// Sum of required?

    while (l <= r) {
        val m = l + (r - l) / 2

        when (isValid(m)) {
            true -> {
                res = m
                r = m - 1
            }

            false -> l = m + 1
        }
    }

    return res
}
