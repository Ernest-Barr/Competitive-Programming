private fun maximalNetworkRank(n: Int, roads: Array<IntArray>): Int {
    var res = 0
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()

    for ((u, v) in roads) {
        map.getOrPut(u) { mutableListOf() }.add(v)
        map.getOrPut(v) { mutableListOf() }.add(u)
    }

    for (u in  0..n) {
        if (u !in map) continue
        for (v in u + 1..<n) {
            if (v !in map) continue
            val edges: MutableSet<Pair<Int, Int>> = mutableSetOf()
            for (w in map[u]!!) edges.add(if (u < w) Pair(u, w) else Pair(w, u))
            for (w in map[v]!!) edges.add(if (v < w) Pair(v, w) else Pair(w, v))
            res = maxOf(res, edges.size)
        }
    }

    return res
}
