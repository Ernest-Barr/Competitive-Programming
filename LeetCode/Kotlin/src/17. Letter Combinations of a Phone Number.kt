private fun letterCombinations(digits: String): List<String> {
    if (digits == "") return listOf()
    val res: MutableList<String> = mutableListOf()
    val map: Map<Int, String> = mapOf(
        2 to "abc",
        3 to "def",
        4 to "ghi",
        5 to "jkl",
        6 to "mno",
        7 to "pqrs",
        8 to "tuv",
        9 to "wxyz"
    )

    fun backtrack(i: Int, comb: StringBuilder) {
        if (i == digits.length) {
            res.add(comb.toString())
            return
        }

        for (letter in map[digits[i].digitToInt()]!!) {
            comb.append(letter)
            backtrack(i + 1, comb)
            comb.deleteCharAt(comb.length - 1)
        }
    }

    backtrack(0, StringBuilder(""))
    return res
}