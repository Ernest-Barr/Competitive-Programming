import kotlin.math.abs

fun mirrorDistance(n: Int): Int {
    fun reverse(num: Int): Int {
        var res = 0

        var cpy = num

        while (cpy != 0) {
            res *= 10
            res += cpy % 10
            cpy /= 10
        }

        return res
    }

    return abs(n - reverse(n))
}
