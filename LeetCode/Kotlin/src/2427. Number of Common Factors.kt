import kotlin.math.min

private fun commonFactors(a: Int, b: Int): Int {
    var res = 0
    val n = min(a, b)
    for (i in 1..n) {
        if (a % i == 0 && b % i == 0) res++
    }

    return res
}