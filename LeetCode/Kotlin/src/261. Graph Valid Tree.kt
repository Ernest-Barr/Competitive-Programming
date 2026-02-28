fun validTree(n: Int, edges: Array<IntArray>): Boolean {
    if (edges.size != n - 1) return false

    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    val queue: ArrayDeque<Int> = ArrayDeque()
    val visited: MutableSet<Int> = mutableSetOf()

    for (i in 0..<n) map[i] = mutableListOf()

    for (e in edges) {
        val u = e[0]
        val v = e[1]
        map[u]!!.add(v)
        map[v]!!.add(u)
    }

    queue.add(0)
    visited.add(0)

    while (queue.isNotEmpty()) {
        val u = queue.removeFirst()
        for (v in map[u]!!) {
            if (v in visited) continue
            queue.addLast(v)
            visited.add(v)
        }
        visited.add(u)
    }

    return visited.size == n
}