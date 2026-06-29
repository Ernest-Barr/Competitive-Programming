private fun generateValidStrings(n: Int, k: Int): List<String> {
    val strs: MutableList<String> = mutableListOf()

    fun backtrack(str: StringBuilder) {
        if (str.length == n) {
            strs.add(str.toString())
            return
        }

        for (c in "01") {
            str.append(c)
            backtrack(str)
            str.deleteCharAt(str.length - 1)
        }
    }

    backtrack(StringBuilder())

    val res: MutableList<String> = mutableListOf()

    for (str in strs) {
        var c = 0

        for (i in 1..<n) {
            if (str[i] == '1') {
                if (str[i - 1] == '1') {
                    c += k + 1
                    break
                } else {
                    c += i
                }
            }
        }

        if (c <= k) res.add(str)
    }
    return res
}
