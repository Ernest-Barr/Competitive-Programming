private fun gameOfLife(board: Array<IntArray>): Unit {
    val m = board.size
    val n = board[0].size
    val res: Array<IntArray> = Array(m) { IntArray(n) { 0 } }

    for (i in 0..<m) {
        for (j in 0..<n) {
            var adj = 0

            for (dx in -1..1) {
                for (dy in -1..1) {
                    if (dx == 0 && dy == 0) continue

                    val x = i + dx
                    val y = j + dy

                    if (x in 0..<m && y in 0..<n && board[x][y] == 1) adj++
                }
            }

            res[i][j] = when (board[i][j]) {
                1 -> if (adj in 2..3) 1 else 0
                else -> if (adj == 3) 1 else 0
            }
        }
    }

    for (i in 0..<m) {
        for (j in 0..<n) {
            board[i][j] = res[i][j]
        }
    }
}
