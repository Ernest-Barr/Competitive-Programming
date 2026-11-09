private fun queensAttacktheKing(queens: Array<IntArray>, king: IntArray): List<List<Int>> {
    val n = 8
    val res: MutableList<List<Int>> = mutableListOf()
    val grid: Array<IntArray> = Array(8) { IntArray (8 ) { 0 } }

    for ((i, j) in queens) grid[i][j] = 1

    for (dx in -1..1) {
        for (dy in -1..1) {
            if (dx == 0 && dy == 0) continue

            var vx = king[0] + dx
            var vy = king[1] + dy

            while (vx in 0..<n && vy in 0..<n) {
                if (grid[vx][vy] == 1) {
                    res.add(listOf(vx, vy))
                    break
                }

                vx += dx
                vy += dy
            }
        }
    }

    return res
}
