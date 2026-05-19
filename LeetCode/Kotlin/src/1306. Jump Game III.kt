import java.util.Stack

fun canReach(arr: IntArray, start: Int): Boolean {
    val n = arr.size
    val stack: Stack<Int> = Stack()
    val visited: Array<Boolean> = Array(n) { false }
    val map: Array<MutableList<Int>> = Array(n) { mutableListOf() }

    for ((i, num) in arr.withIndex()) {
        map[i].add(i + num)
        map[i].add(i - num)
    }

    stack.push(start)
    visited[start] = true

    while (stack.isNotEmpty()) {
        val u = stack.pop()

        if (arr[u] == 0) return true

        for (v in map[u]) {
            if (v in 0..<n && !visited[v]) {
                if (arr[v] == 0) return true
                visited[v] = true
                stack.push(v)
            }
        }
    }

    return false
}
