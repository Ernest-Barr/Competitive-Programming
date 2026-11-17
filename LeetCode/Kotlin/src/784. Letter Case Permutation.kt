private fun letterCasePermutation(s: String): List<String> {
    val res: MutableList<String> = mutableListOf()
    val n = s.length

    fun dfs(curr: StringBuilder, i: Int) {
        if (curr.length == n) {
            res.add(curr.toString())
            return
        }

        for (j in i..<n) {
            var c = if (s[j].isLetter()) s[j].lowercaseChar() else s[j]
            curr.append(c)
            dfs(curr, j + 1)
            curr.setLength(curr.length - 1)

            if (c.isLetter()) {
                curr.append(c.uppercaseChar())
                dfs(curr, j + 1)
                curr.setLength(curr.length - 1)
            }
        }
    }


    dfs(StringBuilder(), 0)
    return res
}
