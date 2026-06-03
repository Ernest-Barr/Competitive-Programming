private fun findFarmland(land: Array<IntArray>): Array<IntArray> {

    val queue: ArrayDeque<Pair<Int, Int>> = ArrayDeque()
    val res: MutableList<IntArray> = mutableListOf()
    val m = land.size
    val n = land[0].size
    val visited: Array<BooleanArray> = Array(m) { BooleanArray(n) { false }}

    fun neighbors(i: Int, j: Int) = listOf(Pair(i + 1, j), Pair(i - 1, j), Pair(i, j + 1), Pair(i, j - 1))

    for (i in 0..<m) {
        for (j in 0..<n) {
            if (land[i][j] == 1 && !visited[i][j]) {
                visited[i][j] = true
                queue.add(Pair(i, j))

                /**
                Rows should be y
                Cols should be x
                 */

                var minX = j
                var minY = i
                var maxX = j
                var maxY = i

                while (queue.isNotEmpty()) {
                    val u = queue.removeFirst()
                    for (v in neighbors(u.first, u.second)) {
                        val x = v.second
                        val y = v.first
                        if (x in 0..<n && y in 0..<m && land[y][x] == 1 && !visited[y][x]) {
                            when {
                                x <= minX && y <= minY -> {
                                    minX = x
                                    minY = y
                                }

                                x >= maxX && y >= maxY -> {
                                    maxX = x
                                    maxY = y
                                }
                            }

                            visited[y][x] = true
                            queue.add(Pair(y,x))
                        }
                    }
                }

                res.add(intArrayOf(minY, minX, maxY, maxX))
            }
        }
    }

    return res.toTypedArray()
}
