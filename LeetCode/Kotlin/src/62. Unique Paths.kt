fun uniquePaths(m: Int, n: Int): Int {
    val memo: Array<IntArray> = Array(m) { IntArray(n) { Integer.MIN_VALUE } }

    fun dfs(i: Int, j: Int): Int {
        if (i == m - 1 && j == n - 1) return 1
        if (memo[i][j] != Integer.MIN_VALUE) return memo[i][j]

        var down = 0
        var right = 0

        if (i != m - 1) down = dfs(i + 1, j)
        if (j != n - 1) right = dfs(i, j + 1)

        memo[i][j] = down + right
        return memo[i][j]
    }

    return dfs(0, 0)
}

