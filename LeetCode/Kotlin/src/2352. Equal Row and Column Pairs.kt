private fun equalPairs(grid: Array<IntArray>): Int {
    var res = 0
    val map: MutableMap<List<Int>, Int> = mutableMapOf()

    for (row in grid) {
        val list = row.toList()
        map[list] = (map[list] ?: 0) + 1
    }

    for (i in grid.indices) {
        val list: MutableList<Int> = mutableListOf()

        for (j in grid[0].indices) {
            list.add(grid[j][i])
        }

        res += map[list] ?: 0
    }

    return res
}
