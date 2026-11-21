private fun findMismatchedSegments(s1: String, s2: String): List<List<String>> {
    val res: MutableList<List<String>> = mutableListOf()
    val n = s1.length
    var curr = 0

    for (i in 0..<n) {
        when {
            s1[i] == s2[i] && curr > 0 -> {
                res.add(listOf(s1.substring(i - curr, i), s2.substring(i - curr, i)))
                curr = 0
            }

            s1[i] != s2[i] -> curr++
        }
    }

    if (curr > 0) res.add(listOf(s1.substring(n - curr, n), s2.substring(n - curr, n)))

    return res
}
