import java.util.PriorityQueue

private fun minSetSize(arr: IntArray): Int {
    val n = arr.size
    val map: MutableMap<Int, Int> = mutableMapOf()

    var curr = n
    var res = 0

    for (num in arr) map[num] = (map[num] ?: 0) + 1

    val pq: PriorityQueue<Int> = PriorityQueue(compareByDescending { it })

    for (freq in map.values) pq.offer(freq)

    while (pq.isNotEmpty() && curr > n / 2) {
        curr -= pq.poll()
        res++
    }

    return res
}
