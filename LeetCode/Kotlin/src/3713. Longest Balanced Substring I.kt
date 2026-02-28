fun longestBalanced(s: String): Int {
    val n = s.length
    var res = 0

    for (i in 0..<n) {
        val map: MutableMap<Char, Int> = mutableMapOf()
        for (j in i..<n) {
            var valid = true
            val c = s[j]

            map[c] = if (c in map) map[c]!! + 1 else 1

            val m = map.values.size
            val frequencies = map.values.toList()

            for (i in 1..<m) {
                if (frequencies[i] != frequencies[i - 1]) {
                    valid = false
                    break
                }
            }

            if (valid) res = maxOf(res, j - i + 1)
        }
    }

    return res
}