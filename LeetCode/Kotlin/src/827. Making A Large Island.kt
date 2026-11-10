import java.util.Stack

private fun largestIsland(grid: Array<IntArray>): Int {
    val n = grid.size
    val stack: Stack<IntArray> = Stack()
    val component: Array<IntArray> = Array (n) { IntArray(n) { -1 } }
    val area: MutableMap<Int, Int> = mutableMapOf()
    val d = arrayOf(intArrayOf(1,0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))

    var res = 0
    var c = 1

    for (i in 0..<n) {
        for (j in 0..<n) {
            if (grid[i][j] == 1 && component[i][j] == -1) {
                var size = 1
                component[i][j] = c
                stack.push(intArrayOf(i ,j))

                while (stack.isNotEmpty()) {
                    val (ux, uy) = stack.pop()

                    for ((dx, dy) in d) {
                        val vx = ux + dx
                        val vy = uy + dy

                        if (vx in 0..<n && vy in 0..<n && grid[vx][vy] == 1 && component[vx][vy] == -1) {
                            component[vx][vy] = c
                            stack.push(intArrayOf(vx, vy))
                            size++
                        }
                    }
                }

                res = maxOf(res, size)
                area[c++] = size
            }
        }
    }

    for (i in 0..<n) {
        for (j in 0..<n) {
            if (component[i][j] == -1) {
                var curr = 1
                val used: MutableSet<Int> = mutableSetOf()

                for ((dx, dy) in d) {
                    val vx = i + dx
                    val vy = j + dy

                    if (vx in 0..<n && vy in 0..<n && component[vx][vy] != -1 && component[vx][vy] !in used) {
                        curr += area[component[vx][vy]]!!
                        used.add(component[vx][vy])
                    }
                }

                res = maxOf(res, curr)
            }
        }
    }

    return res
}
