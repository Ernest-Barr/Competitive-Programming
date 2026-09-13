private fun tictactoe(moves: Array<IntArray>): String {
    val n = moves.size
    val grid: Array<CharArray> = Array(3) { CharArray(3) { ' ' } }
    for ((i, pair) in moves.withIndex()) grid[pair[0]][pair[1]] = if (i % 2 == 0) 'X' else 'O'

    fun diagonal(c: Char): Boolean =
        grid[1][1] == c && ((grid[0][0] == c && grid[2][2] == c) || (grid[0][2] == c && grid[2][0] == c))

    fun column(c: Char, j: Int): Boolean = grid[0][j] == c && grid[1][j] == c && grid[2][j] == c

    for ((i, row) in grid.withIndex()) {
        when {
            row.all { it == 'X' } -> return "A"
            row.all { it == 'O' } -> return "B"
        }
    }

    for (i in 0..<3) {
        when {
            column('X', i) -> return "A"
            column('O', i) -> return "B"
        }
    }

    return when {
        diagonal('X') -> "A"
        diagonal('O') -> "B"
        n == 9 -> "Draw"
        else -> "Pending"
    }
}
