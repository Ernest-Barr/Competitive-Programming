private fun closedIsland(grid: Array<IntArray>): Int {
    val m = grid.size
    val n = grid[0].size
    val d = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
    var res = 0

    for (i in 0..<m) {
        for (j in 0..<n) {
            if (grid[i][j] == 0) {
                val queue: ArrayDeque<IntArray> = ArrayDeque()

                grid[i][j] = -1
                queue.add(intArrayOf(i, j))
                var flag = true

                while (queue.isNotEmpty()) {
                    val (ux, uy) = queue.removeFirst()

                    for ((dx, dy) in d) {
                        val vx = ux + dx
                        val vy = uy + dy

                        if (vx in 0..<m && vy in 0..<n && grid[vx][vy] == 0) {
                            grid[vx][vy] = -1
                            queue.add(intArrayOf(vx, vy))
                        } else if (vx !in 0..<m || vy !in 0..<n) {
                            flag = false
                        }
                    }
                }

                if (flag) res++
            }

        }
    }

    return res
}
