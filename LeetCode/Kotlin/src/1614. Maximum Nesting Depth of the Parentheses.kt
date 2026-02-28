fun maxDepth(s: String): Int {
    var res = 0
    var openC = 0

    for (c in s) {
        when (c) {
            '(' -> res = maxOf(res, ++openC)
            ')' -> openC--
        }
    }

    return res
}