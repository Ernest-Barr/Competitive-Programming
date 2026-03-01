import java.util.PriorityQueue

fun minDistinctFreqPair(nums: IntArray): IntArray {
    val map: MutableMap<Int, Int> = mutableMapOf()
    val pq: PriorityQueue<Pair<Int, Int>> =
        PriorityQueue(compareBy<Pair<Int, Int>> { it.first }.thenBy { it.second })
    val res: IntArray = IntArray(2)

    for (num in nums) map[num] = if (num in map) map[num]!! + 1 else 1

    for ((num, freq) in map) pq.offer(Pair(num, freq))

    val first = pq.poll()
    res[0] = first.first

    while (pq.isNotEmpty() && pq.peek().second == first.second) pq.poll()

    if (pq.isEmpty()) return intArrayOf(-1, -1)

    res[1] = pq.peek().first

    return res
}
