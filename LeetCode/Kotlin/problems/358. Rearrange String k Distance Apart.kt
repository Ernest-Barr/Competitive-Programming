import java.util.PriorityQueue

fun rearrangeString(s: String, k: Int): String {
    val n = s.length
    var res = ""

    data class Item(var idx: Int, var freq: Int, var char: Char)
    val max: PriorityQueue<Item> = PriorityQueue(compareByDescending<Item> { it.freq }.thenBy { it.char })
    val min: PriorityQueue<Item> = PriorityQueue(compareBy<Item> { it.idx })
    val map: MutableMap<Char, Int> = mutableMapOf()

    for (c in s) map[c] = if (c in map) map[c]!! + 1 else 1
    for ((char, freq) in map) min.offer(Item(0, freq, char))

    while (res.length != n) {
        while (min.isNotEmpty() && min.peek().idx <= res.length) max.offer(min.poll())

        if (max.isEmpty()) return ""

        val curr = max.poll()
        curr.freq -= 1
        curr.idx = res.length + k
        res += curr.char

        if (curr.freq > 0) min.offer(curr)
    }

    return res
}