import java.util.Stack

fun allPathsSourceTarget(graph: Array<IntArray>): List<List<Int>> {
    val res: MutableList<List<Int>> = mutableListOf()
    val stack: Stack<List<Int>> = Stack()
    val t = graph.size - 1

    stack.push(listOf(0))

    while (stack.isNotEmpty()) {
        val path = stack.pop()
        val u = path.last()

        if (u == t) {
            res.add(path)
            continue
        }

        for (v in graph[u]) {
            val curr = path.toMutableList()
            curr.add(v)
            stack.push(curr)
        }
    }

    return res
}
