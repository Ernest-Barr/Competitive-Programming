import java.util.Stack

fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
    // Temporary Mark = -1
    // Unmarked = 0
    // Permanent Mark = 1

    val stack: Stack<Int> = Stack()
    val marks: IntArray = IntArray(numCourses) { 0 }
    val adj: MutableMap<Int, MutableList<Int>> = mutableMapOf()
    val res: MutableList<Int> = mutableListOf()

    for (i in 0..<numCourses) adj[i] = mutableListOf()
    for ((u, v) in prerequisites) adj[u]!!.add(v)

    for (i in 0..<numCourses) {
        if (marks[i] != 0) continue
        stack.push(i)

        while (stack.isNotEmpty()) {
            val u = stack.peek()

            when (marks[u]) {
                -1 -> {
                    marks[u] = 1
                    res.add(u)
                    stack.pop()
                    continue
                }

                1 -> {
                    stack.pop()
                    continue
                }

                0 -> {
                    marks[u] = -1

                    for (v in adj[u]!!) {
                        when (marks[v]) {
                            -1 -> return intArrayOf()
                            1 -> continue
                            0 -> stack.push(v)
                        }
                    }
                }
            }
        }
    }

    return res.toIntArray()
}