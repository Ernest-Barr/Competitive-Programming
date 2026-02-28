import java.util.*

fun kClosest(points: Array<IntArray>, k: Int): Array<IntArray> {

    val pq = PriorityQueue<Pair<IntArray, Int>>(compareBy { it.second })

    // d^2 = (x2 - x1)^2 + (y2 - y1)^2

    for (p in points) {
        val distSquared: Int = p[0] * p[0] + p[1] * p[1]
        pq.offer(Pair(p, distSquared))
    }

    val res = Array(k) { IntArray(2) { 0 } }

    for (i in res.indices) res[i] = pq.poll().first

    return res
}
