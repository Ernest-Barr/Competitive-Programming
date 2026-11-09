private fun combinationSum3(k: Int, n: Int): List<List<Int>> {
    val res: MutableList<List<Int>> = mutableListOf()

    fun dfs(curr: MutableList<Int>, sum: Int, i: Int) {
        if (sum > n) return

        if (curr.size == k && sum == n) {
            res.add(curr.toList())
            return
        }

        for (j in i..9) {
            curr.add(j)
            dfs(curr, sum + j, j + 1)
            curr.removeLast()
        }
    }

    dfs(mutableListOf(), 0, 1)

    return res
}
