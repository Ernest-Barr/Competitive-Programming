fun generateParenthesis(n: Int): List<String> {
    val res: MutableList<String> = mutableListOf()

    fun backtrack(i: Int, j: Int, comb: StringBuilder) {
        if (i == j && i + j == n * 2) {
            res.add(comb.toString())
            return
        }

        if (i < n) {
            comb.append("(")
            backtrack(i + 1, j, comb)
            comb.deleteCharAt(comb.length - 1)
        }

        if (j < i) {
            comb.append(")")
            backtrack(i, j  + 1, comb)
            comb.deleteCharAt(comb.length - 1)
        }
    }

    backtrack(0, 0, StringBuilder(""))

    return res
}