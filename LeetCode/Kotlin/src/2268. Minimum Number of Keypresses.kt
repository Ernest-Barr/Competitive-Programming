import java.util.PriorityQueue

private fun minimumKeypresses(s: String): Int {
    val freq: MutableMap<Char, Int> = mutableMapOf()
    val pq: PriorityQueue<Int> = PriorityQueue(compareByDescending { it })
    var res = 0
    var count = 0
    var press = 1

    for (c in s) freq[c] = (freq[c] ?: 0) + 1

    for ((_, num) in freq) pq.offer(num)

    while (pq.isNotEmpty()) {
        res += press * pq.poll()
        count++

        if (count % 9 == 0) press++
    }

    return res
}
