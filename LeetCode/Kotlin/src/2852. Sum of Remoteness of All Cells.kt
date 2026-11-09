import java.util.Stack
import kotlin.math.abs

private fun sumRemoteness(grid: Array<IntArray>): Long {
    // R[i]][j] = abs(sum of your component - sum of all other components)
    val m = grid.size
    val n = grid[0].size
    val stack: Stack<Pair<Int, Int>> = Stack()
    var res = 0L
    var component = 0
    var total = 0L

    val d: Array<IntArray> = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))

    // Maps Point to component
    val comp: MutableMap<Pair<Int, Int>, Int> = mutableMapOf()

    // Maps component to sum
    val sums: MutableMap<Int, Long> = mutableMapOf()

    for (i in 0..<m) {
        for (j in 0..<n) {
            if (grid[i][j] != -1) {
                val start = Pair(i, j)
                stack.push(start)
                comp[start] = component

                var sum = 0L + grid[i][j]
                grid[i][j] = -1

                while (stack.isNotEmpty()) {
                    val (ux, uy) = stack.pop()

                    for ((dx, dy) in d) {
                        val vx = ux + dx
                        val vy = uy + dy

                        if (vx in 0..<m && vy in 0..<n && grid[vx][vy] != -1) {
                            val v = Pair(vx, vy)
                            sum += grid[vx][vy]
                            comp[v] = component
                            stack.push(v)
                            grid[vx][vy] = -1
                        }
                    }
                }

                sums[component] = sum
                total += sum
                component++
            }
        }
    }

    for ((_, c) in comp) res += abs(total - sums[c]!!)

    return res
}
