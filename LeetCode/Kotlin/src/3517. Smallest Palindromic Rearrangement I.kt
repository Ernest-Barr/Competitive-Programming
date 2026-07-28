private fun smallestPalindrome(s: String): String {
    val n = s.length
    val res: CharArray = CharArray(n) {' '}
    val freq: IntArray = IntArray(26) { 0 }

    for (c in s) freq[c - 'a']++

    var i = 0

    for (c in 'a'..'z') {
        while (freq[c - 'a'] != 0) {
            when (freq[c - 'a'] % 2) {
                0 -> {
                    res[i] = c
                    res[n - i - 1] = c
                    freq[c - 'a'] -= 2
                    i++
                }

                1 -> {
                    res[n / 2] = c
                    freq[c - 'a']--
                }
            }
        }
    }

    return res.joinToString("")
}
