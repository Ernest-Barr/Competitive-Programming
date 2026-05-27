import kotlin.math.abs

fun shortestDistance(words: Array<String>, word1: String, word2: String): Int {
    val map: MutableMap<String, MutableList<Int>> = mutableMapOf()

    var res = Int.MAX_VALUE
    val n = words.size

    for ((i, word) in words.withIndex()) {
        if (word !in map) map[word] = mutableListOf()
        map[word]!!.add(i)
    }

    for (i in map[word1]!!) {
        for (j in map[word2]!!) {
            res = minOf(res, abs(i - j))
        }
    }

    return res
}
