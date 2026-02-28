fun countUnguarded(m: Int, n: Int, guards: Array<IntArray>, walls: Array<IntArray>): Int {
    // 1 = Guard
    // 0 = unmarked
    // -1 = Invalid
    // 2 = Wall

    val grid: Array<IntArray> = Array(m) {IntArray(n) { 0 }}

    fun dfs(i: Int, j:Int, dir: Char) {
        if (i !in 0..<m || j !in 0..<n || grid[i][j] == 2 || grid[i][j] == 1) return
        grid[i][j] = -1

        when (dir) {
            'U' -> dfs(i - 1, j, 'U')
            'D' -> dfs(i + 1, j, 'D')
            'L' -> dfs(i, j - 1, 'L')
            'R' -> dfs(i, j + 1, 'R')
        }
    }

    for (wall in walls) grid[wall[0]][wall[1]] = 2

    for (guard in guards) grid[guard[0]][guard[1]] = 1

    for (guard in guards) {
        val i = guard[0]
        val j = guard[1]

        dfs(i - 1, j, 'U')
        dfs(i + 1 ,j, 'D')
        dfs(i, j - 1, 'L')
        dfs(i, j + 1, 'R')
    }

    return grid.sumOf {i -> i.count {j -> j == 0}}
}