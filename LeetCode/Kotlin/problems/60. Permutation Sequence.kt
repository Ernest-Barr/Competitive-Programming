//TODO: Optimize
private fun getPermutationBF(n: Int, k: Int): String {
    val perm: MutableList<List<Int>> = mutableListOf()

    fun backtrack(i: Int, sol: MutableList<Int>) {
        if (i == n) {
            perm.add(sol.toList())
            return
        }

        for (j in 1..n) {
            if (j in sol) continue
            sol.add(j)
            backtrack(i + 1, sol)
            sol.removeLast()
        }
    }

    backtrack(0, mutableListOf())

    return perm[k - 1].joinToString("")
}