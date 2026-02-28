fun countComponents(n: Int, edges: Array<IntArray>): Int {
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    val queue: ArrayDeque<Int> = ArrayDeque()
    val visited: MutableSet<Int> = mutableSetOf()
    var res = 0

    for (i in 0..<n) map[i] = mutableListOf()

    for ((u, v) in edges) {
        map[u]!!.add(v)
        map[v]!!.add(u)
    }

    for (i in 0..<n) {
        if (i !in visited) {
            queue.add(i)
            visited.add(i)

            while (queue.isNotEmpty()) {
                val u = queue.removeFirst()
                visited.add(u)

                for (v in map[u]!!) {
                    if (v in visited) continue
                    visited.add(v)
                    queue.add(v)
                }
            }

            res++
        }
    }

    return res
}