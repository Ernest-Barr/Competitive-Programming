import kotlin.math.abs

private fun totalDistance(s: String): Int {
    fun manhattan(
        r1: Int,
        c1: Int,
        r2: Int,
        c2: Int,
    ): Int = abs(r1 - r2) + abs(c1 - c2)

    val grid =
        listOf(
            "qwertyuiop",
            "asdfghjkl",
            "zxcvbnm",
        )

    val map: Array<IntArray> = Array(26) { IntArray(2) { 0 } }
    var res = 0

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            map[grid[i][j] - 'a'] = intArrayOf(i, j)
        }
    }

    var prev = 'a'
    for (c in s) {
        val s = prev - 'a'
        val t = c - 'a'

        res += manhattan(map[s][0], map[s][1], map[t][0], map[t][1])
        prev = c
    }

    return res
}
