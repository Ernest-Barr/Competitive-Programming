fun findSmallestSetOfVertices(
    n: Int,
    edges: List<List<Int>>,
): List<Int> {
    val res: MutableList<Int> = mutableListOf()
    val g: Array<MutableList<Int>> = Array(n) { mutableListOf() }

    for ((u, v) in edges) g[v].add(u)

    for (i in g.indices) if (g[i].size == 0) res.add(i)

    return res
}
