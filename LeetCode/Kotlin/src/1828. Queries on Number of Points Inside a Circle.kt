fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray {
    data class Point(val x: Int, val y: Int)

    fun inDisk(c: Point, p: Point, r: Int): Boolean = ((c.x - p.x) * (c.x - p.x) + (c.y - p.y) * (c.y - p.y)) <= r * r

    val res: IntArray = IntArray(queries.size) { 0 }

    for (i in queries.indices) {
        var num = 0
        val c = Point(queries[i][0], queries[i][1])
        val r = queries[i][2]

        for (j in points.indices) if (inDisk(c, Point(points[j][0], points[j][1]), r)) num++

        res[i] = num
    }

    return res
}