private fun getNoZeroIntegers(n: Int): IntArray {
    fun isValid(i: Int): Boolean {
        var num = i

        while (num != 0) {
            if (num % 10 == 0) return false
            num /= 10
        }

        return true
    }

    for (i in 1..n) {
        if (isValid(i) && isValid(n - i)) return intArrayOf(i, n - i)
    }

    return intArrayOf()
}