private fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
    val map: MutableMap<List<Int>, Int> = mutableMapOf()
    var res = 0

    for (i in dominoes.indices) {
        val a = dominoes[i][0]
        val b = dominoes[i][1]
        val list = if (a < b) listOf(a, b) else listOf(b, a)
        map[list] = map.getOrDefault(list, 0) + 1
    }

    for (count in map.values) if (count > 1) res += (count * (count - 1) / 2)
    return res
}


fun main() {

    println(
        numEquivDominoPairs(
            arrayOf(
                intArrayOf(1, 2), intArrayOf(2, 1), intArrayOf(3, 4), intArrayOf(5, 6)
            )
        ) == 1
    )
    println(
        numEquivDominoPairs(
            arrayOf(
                intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 1), intArrayOf(1, 2), intArrayOf(2, 2)
            )
        ) == 3
    )

}