private fun maximumLengthSubstring(s: String): Int {
    var res = 0
    val n = s.length

    for (i in 0..<n) {
        val freq = IntArray(26) { 0 }
        for (j in i..<n) {
            freq[s[j] - 'a']++

            if (freq[s[j] - 'a'] <= 2) res = maxOf(res, j - i + 1) else break
        }
    }

    return res
}
