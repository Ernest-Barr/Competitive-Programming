private fun numOfStrings(patterns: Array<String>, word: String): Int {
    var res = 0

    for (pattern in patterns) if (pattern in word) res++

    return res
}
