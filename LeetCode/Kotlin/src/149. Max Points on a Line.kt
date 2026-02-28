import kotlin.math.sign

fun maxPoints(points: Array<IntArray>): Int {
    if (points.size == 1) return 1
    data class Point(val x: Int, val y: Int)

    fun orientation(a: Point, b: Point, c: Point): Int =
        (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)).sign

    val n = points.size
    var res = 0

    for (i in points.indices) {
        val a = Point(points[i][0], points[i][1])
        for (j in i..<n) {
            var curr = 0
            val b = Point(points[j][0], points[j][1])
            for (k in points.indices) {
                if (a != b && orientation(a, b, Point(points[k][0], points[k][1])) == 0) curr++
            }
            res = maxOf(res, curr)
        }
    }

    return res
}