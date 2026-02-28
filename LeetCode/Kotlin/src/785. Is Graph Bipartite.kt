fun isBipartite(graph: Array<IntArray>): Boolean {
    /*
        Colors
        0 - Unamrked
        1 - Set 1
        -1 - Set 2
     */

    val queue: ArrayDeque<Int> = ArrayDeque()
    val colors: MutableList<Int> = MutableList(graph.size) { 0 }

    for (i in graph.indices) {
        if (colors[i] == 0) {
            queue.add(i)
            colors[i] = 1

            while (queue.isNotEmpty()) {
                val u = queue.removeFirst()
                val opposite = colors[u] * - 1

                for (v in graph[u]) {
                    when (colors[v]) {
                        opposite -> continue
                        0 -> colors[v] = opposite
                        colors[u] -> return false
                    }

                    queue.add(v)
                }
            }
        }
    }

    return true
}