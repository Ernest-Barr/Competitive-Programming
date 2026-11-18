private fun minChanges(s: String): Int {
    var res = 0
    val n = s.length

    for (i in 0..<n step 2) if (s[i] != s[i + 1]) res++

    return res
}
