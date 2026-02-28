import java.util.PriorityQueue

fun minCost(n: Int, edges: Array<IntArray>): Int {
    val adj: MutableMap<Int, MutableList<Pair<Int, Int>>> = mutableMapOf()
    val dist: IntArray = IntArray(n) { Int.MAX_VALUE }
    val heap: PriorityQueue<Pair<Int, Int>> = PriorityQueue(compareBy { it.second })

    for (i in 0..<n) adj[i] = mutableListOf()

    for ((u, v, w) in edges) {
        adj[u]!!.add(Pair(v, w))
        adj[v]!!.add(Pair(u, 2 * w))
    }

    dist[0] = 0
    heap.offer(Pair(0, 0))

    while (heap.isNotEmpty()) {
        val (u, curr) = heap.poll()

        if (curr > dist[u]) continue

        for ((v, weight) in adj[u]!!) {
            val total = dist[u] + weight

            if (total < dist[v]) {
                dist[v] = total
                heap.add(Pair(v, total))
            }
        }
    }

    return if (dist[n - 1] != Int.MAX_VALUE) dist[n - 1] else -1
}