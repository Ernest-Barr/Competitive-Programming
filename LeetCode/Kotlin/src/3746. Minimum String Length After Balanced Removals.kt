import kotlin.math.abs

fun minLengthAfterRemovals(s: String): Int {
    var a = 0
    var b = 0

    for (c in s) {
        when (c) {
            'a' -> a++
            'b' -> b++
        }
    }

    return abs(a - b)
}