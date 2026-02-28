private fun hasPath(maze: Array<IntArray>, start: IntArray, destination: IntArray): Boolean {
    val m = maze.size
    val n = maze[0].size
    val queue: ArrayDeque<Pair<Int, Int>> = ArrayDeque()
    val visited: MutableSet<Pair<Int, Int>> = mutableSetOf()
    val dest = Pair(destination[0], destination[1])
    val src = Pair(start[0], start[1])
    val adj = arrayOf(
        Pair(1, 0),
        Pair(-1, 0),
        Pair(0, 1),
        Pair(0, -1)
    )

    queue.addLast(src)
    visited.add(src)

    while (queue.isNotEmpty()) {
        val u = queue.removeFirst()
        if (u == dest) return true

        for ((x, y) in adj) {
            var (r, c) = u

            while (r in 0..<m  && c in 0..<n && maze[r][c] == 0) {
                r += x
                c += y
            }

            val v = Pair(r - x, c - y)

            if (v !in visited) {
                queue.addLast(v)
                visited.add(v)
            }
        }
    }

    return false
}