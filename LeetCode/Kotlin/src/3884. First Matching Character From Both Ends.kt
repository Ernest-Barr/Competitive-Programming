fun firstMatchingIndex(s: String): Int {
    val n = s.length

    for (i in s.indices) if (s[i] == s[n - i - 1]) return i

    return -1
}
