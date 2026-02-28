import java.util.Stack

fun findCircleNum(isConnected: Array<IntArray>): Int {
    val n = isConnected.size
    val stack: Stack<Int> = Stack()
    val visited: BooleanArray = BooleanArray(n) { false }
    var res = 0

    for (i in 0..<n) {
        if (!visited[i]) {
            stack.push(i)

            while (stack.isNotEmpty()) {
                val u = stack.pop()
                visited[u] = true
                for (v in isConnected[u].indices) {
                        if (visited[v] || isConnected[u][v] == 0) continue

                    visited[v] = true
                    stack.push(v)
                }
            }

            res++
        }
    }

    return res
}