private fun nextBeautifulNumber(n: Int): Int {
    // Freq of digits in both integers has to be the same
    // Count freq of digits
    fun isBalanced(number: Int): Boolean {
        val digits: MutableList<Int> = MutableList(10) {0}
        var num = number

        while (num != 0) {
            digits[num % 10]++
            num /= 10
        }

        for (i in digits.indices) if (digits[i] != 0 && digits[i] != i) return false
        return true
    }

    for (i in n + 1..1e7.toInt()) if (isBalanced(i)) return i
    return -1
}  