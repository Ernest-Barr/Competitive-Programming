import java.util.*

fun reorganizeString(s: String): String {
    if (s.length == 1) return s
    val heap: PriorityQueue<Pair<Char, Int>> = PriorityQueue(compareByDescending<Pair<Char, Int>> {it.second}.thenByDescending{it.first})
    val map: MutableMap<Char, Int> = mutableMapOf()

    for (c in s) map[c] = if (c in map) map[c]!! + 1 else 1
    for ((c, freq) in map) heap.offer(Pair(c,freq))

    var res = ""

    while (heap.size > 1) {
        val top = heap.poll()
        val next = heap.poll()

        res += top.first
        res += next.first

        if (top.second - 1 > 0) heap.offer(Pair(top.first, top.second - 1))
        if (next.second - 1 > 0) heap.offer(Pair(next.first, next.second - 1))
    }

    if (heap.isNotEmpty()) {
        val top = heap.poll()
        if (top.second > 1) return ""

        res += top.first
    }

    return res
}