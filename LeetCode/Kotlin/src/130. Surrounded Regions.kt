private fun solve(board: Array<CharArray>): Unit {
    val n = board.size
    val m = board[0].size

    fun visit(i: Int, j: Int) {
        if (i !in 0..<n || j !in 0..<m || board[i][j] != 'O') return
        board[i][j] = '.'
        visit(i + 1, j)
        visit(i - 1, j)
        visit(i, j + 1)
        visit(i, j - 1)
    }

    for (i in board.indices) {
        if (board[i][0] == 'O') visit(i, 0)
        if (board[i][m - 1] == 'O') visit(i, m - 1)
    }

    for (i in board[0].indices) {
        if (board[0][i] == 'O') visit(0, i)
        if (board[n - 1][i] == 'O') visit(n - 1, i)
    }

    for (i in board.indices) {
        for (j in board[i].indices) {
            board[i][j] = when (board[i][j]) {
                'O' -> 'X'
                '.' -> 'O'
                else -> continue
            }
        }
    }
}