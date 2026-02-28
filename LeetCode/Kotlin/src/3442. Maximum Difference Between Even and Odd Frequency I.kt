private fun maxDifference(s: String): Int {
    var odd = Int.MIN_VALUE
    var even = Int.MAX_VALUE

    val map: MutableMap<Char, Int> = mutableMapOf()

    for (c in s) map[c] = if (map[c] == null) 1 else map[c]!! + 1

    for (i in map.values) if (i % 2 == 0) even = minOf(even, i) else odd = maxOf(odd, i)

    return odd - even
}

fun main() {
    println(maxDifference("aaaaabbc") == 3)
    println(maxDifference("abcabcab") == 1)
    println(maxDifference("mmsmsym") == -1)
}