import kotlin.math.abs

private fun minQueenMoves(source: IntArray, target: IntArray): Int {
    return when {
        source[0] == target[0] && target[1] == source[1] -> 0
        source[0] == target[0] || source[1] == target[1] || abs(source[0] - target[0]) == abs(source[1] - target[1]) -> 1
        else -> 2
    }
}
