private fun exist(board: Array<CharArray>, word: String): Boolean {
    val m = board.size
    val n = board[0].size

    val d: Array<IntArray> = arrayOf(
        intArrayOf(0, 1),
        intArrayOf(0, -1),
        intArrayOf(1, 0),
        intArrayOf(-1, 0)
    )

    val visited = Array(m) { BooleanArray(n) { false } }

    fun dfs(i: Int, j: Int, curr: MutableList<Char>): Boolean {
        if (curr.size == word.length) return true

        visited[i][j] = true

        for ((dx, dy) in d) {
            val vx = i + dx
            val vy = j + dy

            if (vx in 0..<m && vy in 0..<n && !visited[vx][vy] && board[vx][vy] == word[curr.size]) {
                visited[vx][vy] = true
                curr.add(board[vx][vy])

                if (dfs(vx, vy, curr)) return true

                visited[vx][vy] = false
                curr.removeLast()
            }
        }

        visited[i][j] = false

        return false
    }

    for (i in 0..<m) {
        for (j in (0..<n)) {
            if (board[i][j] == word[0]) {
                if (dfs(i, j, mutableListOf(word[0]))) return true
            }
        }
    }

    return false
}
