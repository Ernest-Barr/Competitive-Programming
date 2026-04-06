import kotlin.math.cbrt

fun findGoodIntegers(n: Int): List<Int> {
    // 1k is upper bound
    // all values need to be stricly less than cbrt(n)
    // Two Pointers or n^2?
    val map: MutableMap<Int, Int> = mutableMapOf()
    val upper = cbrt(n.toDouble()).toInt()
    val res: MutableList<Int> = mutableListOf()

    for (i in 1..upper) {
        for (j in (i + 1)..upper) {
            val sum = (i * i * i) + (j * j * j)
            map[sum] = if (sum in map) map[sum]!! + 1 else 1
        }
    }

    for ((num, freq) in map) if (freq >= 2 && num <= n) res.add(num)

    res.sort()

    return res
}
