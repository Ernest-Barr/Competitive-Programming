private fun reverseDegree(s: String): Int {
    var res = 0

    for (i in s.indices) res += ('z' - s[i] + 1) * (i + 1)

    return res
}
