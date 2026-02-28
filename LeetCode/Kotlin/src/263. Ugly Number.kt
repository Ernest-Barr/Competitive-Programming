private fun isUgly(n: Int): Boolean {
    if (n <= 0) return false
    var num = n

    while (num > 1) {
        num /= when {
            num % 2 == 0 -> 2
            num % 3 == 0 -> 3
            num % 5 == 0 -> 5
            else -> return false
        }
    }

    return true
}