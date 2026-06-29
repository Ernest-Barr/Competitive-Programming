private fun validStrings(n: Int): List<String> {
    val res: MutableList<String> = mutableListOf()

    fun dfs(str: MutableList<Char>) {
        if (str.size == n) {
            res.add(str.joinToString(""))
            return
        }

        when (str.lastOrNull() ?: '1') {
            '1' -> {
                for (c in "01") {
                    str.add(c)
                    dfs(str)
                    str.removeLast()
                }
            }

            else -> {
                str.add('1')
                dfs(str)
                str.removeLast()
            }
        }
    }

    dfs(mutableListOf())

    return res
}
