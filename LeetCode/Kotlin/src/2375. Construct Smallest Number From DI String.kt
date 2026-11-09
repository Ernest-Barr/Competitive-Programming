private fun smallestNumber(pattern: String): String {
    // 8! possible numbers = 40320 worst case
    // For each number verify if it meets pattern
    // Take the minimum of such number

    val n = pattern.length
    val used = BooleanArray(9) { false }
    var res = "9".repeat(15)

    fun dfs(curr: StringBuilder) {
        if (curr.length == n + 1) {
            for (i in 0..<n) {
                when (pattern[i]) {
                    'I' -> if (curr[i] > curr[i + 1]) return
                    else -> if (curr[i] < curr[i + 1]) return
                }
            }

            res = minOf(res, curr.toString())
            return
        }

        for (i in 1..9) {
            if (used[i - 1]) continue
            curr.append('0' + i)
            used[i - 1] = true
            dfs(curr)
            curr.setLength(curr.length - 1)
            used[i - 1] = false
        }
    }

    dfs(StringBuilder())

    return res
}
