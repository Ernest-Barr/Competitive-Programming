import kotlin.math.abs

fun furthestDistanceFromOrigin(moves: String): Int {
    var l = 0
    var r = 0
    var u = 0

    for (c in moves) {
        when (c) {
            'L' -> l++
            'R' -> r++
            else -> u++
        }
    }

    return abs(l - r) + u
}
