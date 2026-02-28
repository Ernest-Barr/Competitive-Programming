import kotlin.math.abs

private fun largestTriangleArea(points: Array<IntArray>): Double {
    // A = 1/2 bh
    // A = 1/2 |x1y2 + x2y3 + x3y1 - x1y3 - x2y1 - x3y2|

    var res = 0.0

    for (i in points.indices) {
        for (j in i..<points.size) {
            for (k in j..<points.size) {
                val a = points[i]
                val b = points[j]
                val c = points[k]

                val area = 0.5 * abs((a[0] * b[1]) + (b[0] * c[1]) + (c[0] * a[1]) - (a[0] * c[1]) - (b[0] * a[1]) - (c[0] * b[1]))
                res = maxOf(res, area)
            }
        }
    }

    return res
}