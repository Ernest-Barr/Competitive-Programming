import java.util.Stack

fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
    // 0 - Unmarked
    // 1 - Permanent mark
    // -1 - Temporary mark
    val stack: Stack<Int> = Stack()
    val marks: IntArray = IntArray(numCourses) { 0 }
    val adj: MutableMap<Int, MutableList<Int>> = mutableMapOf();

    for (i in 0..<numCourses) adj[i] = mutableListOf()
    for ((u, v) in prerequisites) adj[u]!!.add(v)

    for (i in 0..<numCourses) {
        if (marks[i] == 0) {
            stack.push(i)

            while (stack.isNotEmpty()) {
                val u = stack.peek()

                when (marks[u]) {
                    -1 -> {
                        marks[u] = 1
                        stack.pop()
                        continue
                    }

                    1 -> {
                        stack.pop()
                        continue
                    }

                    0 -> marks[u] = -1
                }

                for (v in adj[u]!!) {
                    when (marks[v]) {
                        1 -> continue
                        -1 -> return false
                        0 -> stack.push(v)
                    }
                }
            }
        }
    }

    return true
}