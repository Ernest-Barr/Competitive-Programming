private fun shareCandies(candies: IntArray, k: Int): Int {
    val n = candies.size
    val map: MutableMap<Int, Int> = mutableMapOf()

    for (candy in candies) map[candy] = if (candy in map) map[candy]!! + 1 else 1

    for (i in 0..<k) {
        when {
            map[candies[i]] == 1 -> map.remove(candies[i])
            else -> map[candies[i]] = map[candies[i]]!! - 1
        }
    }

    var res = maxOf(0, map.size)

    for (i in k..<n) {
        map[candies[i - k]] = if (candies[i- k] in map) map[candies[i - k]]!! + 1 else 1
        if (map[candies[i]] == 1) map.remove(candies[i]) else map[candies[i]] = map[candies[i]]!! - 1
        res = maxOf(res, map.size)
    }

    return res
}
