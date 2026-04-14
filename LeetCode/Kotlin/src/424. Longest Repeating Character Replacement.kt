fun characterReplacementBF(
    s: String,
    k: Int,
): Int {
    val chars: Set<Char> = s.toSet() // Max 26 or size of input alphabet

    // O(|L| * n) where |L| is the cardinality of the input alphabet

    var res = 0

    for (c in chars) {
        var l = 0
        var count = 0

        for (r in s.indices) {
            if (s[r] != c) count++

            while (l < r && count > k) {
                if (s[l++] != c) count--
            }

            res = maxOf(res, r - l + 1)
        }
    }

    return res
}
