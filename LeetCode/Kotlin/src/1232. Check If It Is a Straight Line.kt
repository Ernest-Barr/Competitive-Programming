import kotlin.math.sign

fun checkStraightLine(coordinates: Array<IntArray>): Boolean {
    if (coordinates.size == 2) return true

    data class Point(val x: Int, val y: Int)

    fun orientation(a: Point, b: Point, c: Point): Int =
        (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)).sign

    val p0 = Point(coordinates[0][0], coordinates[0][1])
    val p1 = Point(coordinates[1][0], coordinates[1][1])

    for (p in coordinates) {
        val pi = Point(p[0], p[1])
        if (orientation(p0, p1, pi) != 0) return false
    }

    return true
}