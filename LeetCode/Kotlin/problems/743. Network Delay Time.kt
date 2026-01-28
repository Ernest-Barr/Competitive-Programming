import java.util.PriorityQueue

fun networkDelayTime(times: Array<IntArray>, n: Int, k: Int): Int {
    val dist: IntArray = IntArray(n) { Int.MAX_VALUE }
    val adj: MutableMap<Int, MutableList<Pair<Int, Int>>> = mutableMapOf()
    val heap: PriorityQueue<Pair<Int, Int>> = PriorityQueue(compareBy { it.second })

    for (i in 0..<n) adj[i] = mutableListOf()
    for ((u, v, w) in times) adj[u - 1]!!.add(Pair(v - 1, w))

    heap.offer(Pair(k - 1, 0))
    dist[k - 1] = 0

    while (heap.isNotEmpty()) {
        val (u, curr) = heap.poll()

        if (curr > dist[u]) continue

        for ((v, weight) in adj[u]!!) {
            val total = curr + weight

            if (total < dist[v]) {
                dist[v] = total
                heap.offer(Pair(v, total))
            }
        }
    }

    return if (dist.any { it == Int.MAX_VALUE }) -1 else dist.max()
}