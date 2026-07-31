import java.util.PriorityQueue

private fun minimumPushes(word: String): Int {
    // 8 valid keys
    var cost = 1
    var count = 0
    val map: MutableMap<Char, Int> = mutableMapOf()
    val pq: PriorityQueue<Pair<Char, Int>> = PriorityQueue<Pair<Char,Int>>(compareByDescending { it.second })

    val n = word.length
    var res = 0

    for (c in word) map[c] = if (c in map) map[c]!! + 1 else 1
    for ((c, freq) in map) pq.add(Pair(c, freq))

    while (pq.isNotEmpty()) {
        res += cost * pq.poll().second
        if (++count % 8 == 0) cost++
    }

    return res
}
