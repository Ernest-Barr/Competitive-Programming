private fun isRectangleOverlap(rec1: IntArray, rec2: IntArray): Boolean {
    // To be clear, two rectangles that only touch at the corner or edges do not overlap.
    val (x1, y1, x2, y2) = rec1
    val (x3, y3, x4, y4) = rec2

    return (x1 in x3..<x4 || x3 in x1..<x2) && (y1 in y3..<y4 || y3 in y1..<y2)
}


private fun isRectangleOverlapContrapositive(rec1: IntArray, rec2: IntArray): Boolean {
    /**
    This is one such case where its simpler to prove the contrapositive than to directly prove the statement.
     */

    val (x1, y1, x2, y2) = rec1
    val (x3, y3, x4, y4) = rec2

    return when {
        x1 == x2 || y1 == y2 || x3 == x4 || y3 == y4 -> false
        else -> x2 > x3 && y2 > y3 && x1 < x4 && y1 < y4
    }
}
