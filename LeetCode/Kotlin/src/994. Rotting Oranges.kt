private fun orangesRotting(grid: Array<IntArray>): Int {
    val n = grid.size
    val m = grid[0].size
    var res = 0
    var oranges = 0

    val queue: ArrayDeque<Pair<Int, Int>> = ArrayDeque()

    for (i in grid.indices) {
        for (j in grid[i].indices) {
            when (grid[i][j]) {
                2 -> queue.addLast(Pair(i, j))
                1 -> oranges++
            }
        }
    }

    while (queue.isNotEmpty() && oranges > 0) {
        for (i in 0..<queue.size) {
            val front = queue.removeFirst()
            val adj: Array<Pair<Int, Int>> = arrayOf(
                Pair(front.first + 1, front.second),
                Pair(front.first - 1, front.second),
                Pair(front.first, front.second + 1),
                Pair(front.first, front.second - 1)
            )

            for (v in adj) {
                val i = v.first
                val j = v.second
                if (i !in 0..<n || j !in 0..<m || grid[i][j] != 1) continue
                grid[i][j] = 2
                oranges--
                queue.addLast(v)
            }
        }
        res++
    }

    return if (oranges == 0) res else -1
}
