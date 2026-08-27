private fun getHappyString(n: Int, k: Int): String {
    val strings: MutableList<String> = mutableListOf()
    val curr: MutableList<Char> = mutableListOf()

    fun backtrack(i: Int ) {
        if (i == n) {
            strings.add(curr.joinToString(""))
            return
        }

        for (c in 'a'..'c') {
            if (curr.isEmpty() || curr.last() != c) {
                curr.add(c)
                backtrack(i + 1)
                curr.removeLast()
            }
        }
    }

    backtrack(0)


    strings.sort()

    // for (str in strings) println(str)

    return if (k > strings.size) "" else strings[k - 1]
}
