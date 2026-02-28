private fun nextGreatestLetter(letters: CharArray, target: Char): Char {
    val n = letters.size

    var l = 0
    var r = n - 1

    while (l <= r) {
        val m = l + (r - l) / 2

        when {
            letters[m] <= target -> l = m + 1
            else -> r = m - 1
        }
    }


    return if (l == n) letters[0] else letters[l]
}