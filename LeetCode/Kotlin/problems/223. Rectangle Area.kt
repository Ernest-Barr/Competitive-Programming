fun computeArea(ax1: Int, ay1: Int, ax2: Int, ay2: Int, bx1: Int, by1: Int, bx2: Int, by2: Int): Int {
    val area = ((ax2 - ax1) * (ay2 - ay1)) + ((bx2 - bx1) * (by2 - by1))
    val x = maxOf(0, minOf(ax2, bx2) - maxOf(ax1, bx1))
    val y = maxOf(0, minOf(ay2, by2) - maxOf(ay1, by1))

    return area - (x * y)
}