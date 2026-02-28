import kotlin.math.sqrt

private fun countTriples(n: Int): Int {
    var res = 0

    for (a in 1..n) {
        for (b in a..n) {
            val sum = (a * a + b * b)
            val c = sqrt(sum.toDouble()).toInt()
            if (c <= n && c * c == sum) res += 2
        }
    }

    return res
}