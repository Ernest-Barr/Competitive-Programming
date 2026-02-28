import kotlin.math.abs

private fun findClosest(x: Int, y: Int, z: Int): Int {
    val dx = abs(z - x)
    val dy = abs(z - y)
    return if (dx == dy) 0 else if (dx < dy) 1 else 2
}