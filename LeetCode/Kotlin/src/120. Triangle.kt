fun minimumTotal(triangle: List<List<Int>>): Int {
    val n = triangle.size
    val memo: Array<Array<Int>> = Array(n) { Array(n) { Integer.MIN_VALUE } }

    fun dfs(i: Int, j: Int): Int {
        if (i == n) return 0
        if (memo[i][j] != Integer.MIN_VALUE) return memo[i][j]
        memo[i][j] = triangle[i][j] + minOf(dfs(i + 1, j), dfs(i + 1, j + 1))
        return memo[i][j]
    }

    return dfs(0, 0)
}