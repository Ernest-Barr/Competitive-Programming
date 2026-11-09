private fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    val res: MutableList<List<Int>> = mutableListOf()
    val n = candidates.size

    candidates.sort()

    fun dfs(curr: MutableList<Int>, sum: Int, i: Int) {
        if (sum > target) return

        if (sum == target) {
            res.add(curr.toList())
            return
        }

        for (j in i..<n) {
            if (j > i && candidates[j - 1] == candidates[j]) continue
            curr.add(candidates[j])
            dfs(curr, sum + candidates[j], j + 1)
            curr.removeLast()
        }
    }

    dfs(mutableListOf(), 0, 0)

    return res.toList()
}
