private fun getFood(grid: Array<CharArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val queue: ArrayDeque<Triple<Int, Int, Int>> = ArrayDeque()

    var start: Triple<Int, Int, Int> = Triple(0, 0, 0)

    for (i in 0..<m) {
        for (j in 0..<n) {
            if (grid[i][j] == '*') {
                start = Triple(i, j, 0)
                grid[i][j] = 'X'
            }
        }
    }

    queue.add(start)

    val d = arrayOf(
        intArrayOf(1, 0),
        intArrayOf(-1, 0),
        intArrayOf(0, 1),
        intArrayOf(0, -1)
    )

    while (queue.isNotEmpty()) {
        val (x, y, depth) = queue.removeFirst()

        for ((dx, dy) in d) {
            val vx = x + dx
            val vy = y + dy
            
            if (vx in 0..<m && vy in 0..<n && grid[vx][vy] != 'X') {
                if (grid[vx][vy] == '#') return depth + 1
                grid[vx][vy] = 'X'
                queue.add(Triple(vx, vy, depth + 1))
            }
        }
    }

    return -1
}
