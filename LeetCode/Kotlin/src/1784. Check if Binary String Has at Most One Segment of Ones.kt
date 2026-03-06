fun checkOnesSegment(s: String): Boolean {
    var i = 0
    val n = s.length

    while (i < n) if (s[i++] == '0') break

    for (j in i..<n) if (s[j] == '1') return false

    return true
}
