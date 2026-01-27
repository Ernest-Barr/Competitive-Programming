import kotlin.math.abs
import kotlin.math.max

fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
    var res = 0
    val n = points.size

    for (i in 0..<n - 1) {
        val (x1, y1) = points[i]
        val (x2, y2) = points[i + 1]
        res += max(abs(x2 - x1), abs(y2 - y1))
    }

    return res
}