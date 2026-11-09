import java.util.PriorityQueue
import kotlin.math.abs

private fun minCostConnectPoints(points: Array<IntArray>): Int {
    val n = points.size
    var res = 0

    fun manhattan(u: Int, v: Int) = abs(points[v][0] - points[u][0]) + abs(points[v][1] - points[u][1])

    val visited = BooleanArray(n) { false }
    val pq: PriorityQueue<Pair<Int, Int>> = PriorityQueue(compareBy<Pair<Int, Int>> { it.second })
    pq.offer(Pair(0, 0))

    while (pq.isNotEmpty()) {
        val (u, w) = pq.poll()

        if (visited[u]) continue

        res += w
        visited[u] = true

        for (v in 0..<n) if (!visited[v]) pq.offer(Pair(v, manhattan(u, v)))
    }

    return res
}
