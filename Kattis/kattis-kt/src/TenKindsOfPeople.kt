import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val rows = nextInt()
    val cols = nextInt()
    nextLine() // consume the newline

    val g: Array<String> = Array(rows) { nextLine() }
    val adj = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
    val queue: ArrayDeque<IntArray> = ArrayDeque()
    val map: Array<IntArray> = Array(rows) { IntArray(cols) { -1 } }
    var count = 0

    for (i in 0..<rows) {
        for (j in 0..<cols) {
            if (map[i][j] == -1) {
                queue.add(intArrayOf(i, j))
                map[i][j] = count

                while (queue.isNotEmpty()) {
                    val (ux, uy) = queue.pollFirst()

                    for ((dx, dy) in adj) {
                        val vx = ux + dx
                        val vy = uy + dy

                        if (vx in 0..<rows && vy in 0..<cols && map[vx][vy] == -1 && g[ux][uy] == g[vx][vy]) {
                            map[vx][vy] = count
                            queue.add(intArrayOf(vx, vy))
                        }
                    }
                }
                count++
            }
        }
    }

    repeat(nextInt()) {
        val r1 = nextInt() - 1
        val c1 = nextInt() - 1
        val r2 = nextInt() - 1
        val c2 = nextInt() - 1

        println(
            when {
                map[r1][c1] == map[r2][c2] && g[r2][c2] == '0' -> "binary"
                map[r1][c1] == map[r2][c2] && g[r1][c1] == '1' -> "decimal"
                else -> "neither"
            }
        )
    }
}
