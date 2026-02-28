import java.util.*

private fun frequencySort(s: String): String {
    val map: MutableMap<Char, Int> = mutableMapOf()
    val heap: PriorityQueue<Pair<String, Int>> = PriorityQueue(compareByDescending { it.second })

    for (c in s) map[c] = if (c in map) map[c]!! + 1 else 1
    for ((c, freq) in map) heap.offer(Pair(c.toString(), freq))

    var res = ""
    while (heap.isNotEmpty()) {
        val top = heap.poll()
        res += top.first.repeat(top.second)
    }

    return res
}