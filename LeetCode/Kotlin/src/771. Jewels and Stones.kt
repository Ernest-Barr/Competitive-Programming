private fun numJewelsInStones(jewels: String, stones: String): Int {
    val map: MutableMap<Char, Int> = mutableMapOf()
    var res = 0

    for (c in stones) map[c] = map.getOrDefault(c, 0) + 1
    for (c in jewels) if (c in map) res += map[c]!!

    return res
}

fun main() {
    println(numJewelsInStones("z","ZZ") == 0)
    println(numJewelsInStones("aA","aAAbbbb") == 3)
}