private fun findCenter(edges: Array<IntArray>): Int {
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()

    for ((u, v) in edges) {
        if (v !in map) map[v] = mutableListOf()
        if (u !in map) map[u] = mutableListOf()

        map[u]!!.add(v)
        map[v]!!.add(u)
    }

    val n = map.size

    for ((u, edges) in map) if (edges.size == n - 1) return u

    return -1
}
