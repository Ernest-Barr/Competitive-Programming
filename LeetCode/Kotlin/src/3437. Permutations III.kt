private fun permute(n: Int): Array<IntArray> {
    val res: MutableSet<IntArray> = mutableSetOf()

    fun dfs(curr: MutableList<Int>) {
        if (curr.size == n) {
            res.add(curr.toIntArray())
            return
        }

        for (i in 1..n) {
            if (i in curr || curr.isNotEmpty() && curr[curr.size - 1] % 2 == i % 2) continue
            curr.add(i)
            dfs(curr)
            curr.removeLast()
        }
    }


    dfs(mutableListOf())

    return res.toTypedArray()
}
