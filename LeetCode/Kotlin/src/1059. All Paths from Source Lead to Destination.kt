import java.util.Stack

fun leadsToDestinationBF(
    n: Int,
    edges: Array<IntArray>,
    source: Int,
    destination: Int,
): Boolean {
    if (n == 1 && edges.size == 0 && source == destination) return true
    val map: MutableMap<Int, MutableList<Int>> = mutableMapOf()

    for (i in 0..<n) map[i] = mutableListOf()
    for ((u, v) in edges) map[u]!!.add(v)

    // println(map)

    val stack: Stack<Int> = Stack()
    val visited: BooleanArray = BooleanArray(n) { false }

    stack.push(source)
    visited[source] = true
    var reachable = false

    // Verify the destination node is reachable

    while (stack.isNotEmpty()) {
        val u = stack.pop()

        for (v in map[u]!!) {
            if (!visited[v]) {
                if (v == destination) {
                    reachable = true
                }

                stack.push(v)
                visited[v] = true
            }
        }

        // if (reachable) break
    }

    val sub: MutableList<Int> = mutableListOf() // Subgraph that is reachable from source

    for (i in visited.indices) if (visited[i]) sub.add(i)

    // Topological Sort via dfs to detect cycles starting from source
    var res = false

    if (reachable) {
        // println("Reachable")
        // 0 - Unmarked
        // 1 - Permanent mark
        // -1 - Temporary mark

        val marks: MutableMap<Int, Int> = mutableMapOf()

        fun dfs(u: Int): Boolean {
            when {
                marks[u] == -1 -> return false
                marks[u] == 1 -> return true
            }

            marks[u] = -1

            for (v in map[u]!!) {
                if (!dfs(v)) return false
            }

            marks[u] = 1

            return true
        }

        res = dfs(source)
    }

    // Guarantee that only one node has out degree of 0 within subgraph generated form source
    // println("Failure at end")

    for (i in sub) if (i != destination && map[i]!!.size == 0) return false

    return res
}
