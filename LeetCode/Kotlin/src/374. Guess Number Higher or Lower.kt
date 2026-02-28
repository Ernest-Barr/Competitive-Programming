private fun guess(n: Int) = 0 // Ignore
private fun guessNumber(n: Int): Int {
    var res = 0
    var l = 0
    var r = n
    while (l <= r) {
        val m = l + (r - l) / 2
        when (guess(m)) {
            -1 -> r = m - 1
            1 -> l = m + 1
            else -> return m
        }
    }
    return -1
}

// No test cases, requires guess function that is implemented by LeetCode