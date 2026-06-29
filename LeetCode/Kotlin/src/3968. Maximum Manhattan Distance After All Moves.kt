import kotlin.math.abs

private fun maxDistance(moves: String): Int {
    // |xi - xj| + |yi - yj|
    // -1, 0 = |0 + 2| + |0 + 0|
    // -1,-1 = | 0 + 1| + |0 + 1| = 2

    var res = 0
    var dx = 0
    var dy = 0

    fun manhattan(x: Int, y: Int) = abs(0 - x) + abs(0 - y)

    for (move in moves) {
        when (move) {
            'U' -> dy++
            'D' -> dy--
            'L' -> dx--
            'R' -> dx++
            else -> res++
        }
    }

    return res + manhattan(dx, dy)
}
