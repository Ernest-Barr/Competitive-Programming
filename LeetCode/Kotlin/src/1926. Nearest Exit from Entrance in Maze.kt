fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
    val n = maze.size
    val m = maze[0].size
    val queue: ArrayDeque<List<Int>> = ArrayDeque()
    val visited: MutableSet<List<Int>> = mutableSetOf()

    val e = listOf(entrance[0], entrance[1])
    queue.add(e)
    visited.add(e)

    var res = 0

    val adj = listOf(
        listOf(0, 1),
        listOf(0, -1),
        listOf(1, 0),
        listOf(-1, 0)
    )

    while (queue.isNotEmpty()) {
        repeat(queue.size) {
            val front = queue.removeFirst()

            if (res > 0 && (front[0] == n - 1 || front[0] == 0 || front[1] == 0 || front[1] == m - 1)) return res

            for (dir in adj) {
                val i = front[0] + dir[0]
                val j = front[1] + dir[1]
                val cell = listOf(i, j)

                if (i !in 0..<n || j !in 0..<m || maze[i][j] == '+' || cell in visited) continue

                queue.addLast(cell)
                visited.add(cell)
            }
        }
        res++
    }

    return -1
}