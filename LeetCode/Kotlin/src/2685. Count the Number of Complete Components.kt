import java.util.Stack

private fun countCompleteComponents(n: Int, edges: Array<IntArray>): Int {
    var res = 0
    val stack: Stack<Int> = Stack()
    val map: Array<MutableList<Int>> = Array(n) { mutableListOf() }
    val visited: BooleanArray = BooleanArray(n) { false }

    for ((u, v) in edges) {
        map[v].add(u)
        map[u].add(v)
    }

    // Get Number of components
    for (i in 0..<n) {
        if (!visited[i]) {
            var m = 1
            var edges = 0
            stack.push(i)
            visited[i] = true

            while (stack.isNotEmpty()) {
                val u = stack.pop()

                for (v in map[u]!!) {
                    if (!visited[v]) {
                        stack.add(v)
                        visited[v] = true
                        m++
                    }
                }
                // m*(m-1)/2 dividing by 2 truncates integer values
                edges += map[u].size
            }

            if (m * (m - 1) == edges) res++

            // println(component.joinToString(","))
            // println(m)
            // println(edges)
            // println()
        }
    }

    return res
}
