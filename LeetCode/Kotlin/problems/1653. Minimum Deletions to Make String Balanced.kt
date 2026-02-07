private fun minimumDeletions(s: String): Int {
    val n = s.length
    val suf = IntArray(n) { 0 }
    val pref = IntArray(n) { 0 }
    var res = n

    for (i in 1..<n) pref[i] = if (s[i - 1] == 'b') pref[i - 1] + 1 else pref[i - 1]
    for (i in (n - 2) downTo 0) suf[i] = if (s[i + 1] == 'a') suf[i + 1] + 1 else suf[i + 1]
    for (i in 0..<n) res = minOf(res, pref[i] + suf[i])

    return res
}