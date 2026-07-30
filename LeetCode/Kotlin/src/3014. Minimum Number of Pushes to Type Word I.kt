private fun minimumPushes(word: String): Int {
    // 8 valid keys
    var cost = 0
    val map: MutableMap<Char, Int> = mutableMapOf()
    var res = 0

    for (c in word) {
        if (map.size % 8 == 0) cost++
        if (c !in map) map[c] = cost

        res += map[c]!!
    }

    return res
}
