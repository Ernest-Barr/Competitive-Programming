import java.util.PriorityQueue

fun lastStoneWeight(stones: IntArray): Int {
    val pq: PriorityQueue<Int> = PriorityQueue(compareByDescending{it})
    stones.forEach {pq.offer(it)}

    while (pq.size > 1) {
        val y = pq.poll()
        val x = pq.poll()

        if (y > x) pq.offer(y - x)
    }

    return when {
        pq.isNotEmpty() -> pq.poll()
        else -> 0
    }
}