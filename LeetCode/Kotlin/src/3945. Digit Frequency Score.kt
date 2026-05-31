fun digitFrequencyScore(n: Int): Int {
    var res = 0
    val map: MutableMap<Int, Int> = mutableMapOf()

    var num = n

    while (num != 0) {
        val d = num % 10
        map[d] = if (d in map) map[d]!! + 1 else 1
        num /= 10
    }

    for ((d, freq) in map) res += d * freq

    return res
}
