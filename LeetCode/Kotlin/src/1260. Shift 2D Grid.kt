private fun shiftGrid(grid: Array<IntArray>, c: Int): List<List<Int>> {
    val m = grid.size
    val n = grid[0].size
    var nums: MutableList<Int> = mutableListOf()
    val res: MutableList<MutableList<Int>> = MutableList(m) { MutableList(n) { 0 }}
    val k = c % (m * n)

    for (i in 0..<m) {
        for (j in 0..<n) {
            nums.add(grid[i][j])
        }
    }

    nums = (nums.takeLast(k) + nums.dropLast(k)).toMutableList()

    for ((i, num) in nums.withIndex()) res[i / n][i % n] = num

    return res
}
