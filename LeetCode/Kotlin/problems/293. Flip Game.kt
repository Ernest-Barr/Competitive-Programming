fun generatePossibleNextMoves(s: String): List<String> {
    val res: MutableList<String> = mutableListOf()
    val n = s.length

    for (i in 1..<n) {
        if (s[i - 1] == '+' && s[i] == '+') {
            res.add(s.substring(0, i - 1) + "--" + s.substring(i + 1))
        }
    }

    return res
}