import java.util.Stack

fun remainingMethods(n: Int, k: Int, invocations: Array<IntArray>): List<Int> {
    val stack: Stack<Int> = Stack()
    val res: MutableList<Int> = mutableListOf()
    val map: Array<MutableList<Int>> = Array(n) { mutableListOf() }
    val marked: BooleanArray = BooleanArray(n) { false }

    for ((u,v) in invocations) map[u].add(v)

    stack.push(k)
    marked[k] = true

    while (stack.isNotEmpty()) {
        val u = stack.pop()

        for (v in map[u]) {
            if (marked[v]) continue
            marked[v] = true
            stack.add(v)
        }
    }

    for ((u,v) in invocations) {
        if (!marked[u] && marked[v]) {
            for (i in 0..<n) res.add(i)

            return res
        }
    }

    for (i in 0..<n) if (!marked[i]) res.add(i)

    return res
}
