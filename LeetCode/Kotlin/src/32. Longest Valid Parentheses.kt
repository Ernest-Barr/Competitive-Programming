private fun longestValidParentheses(s: String): Int {
    // Maintain "sliding window", count open and close at each iteration.
    var openCount = 0
    var closeCount = 0

    var res = 0
    for (c in s) {
        when (c) {
            ')' -> {
                closeCount++
            }

            '(' -> {
                openCount++
            }
        }

        if (openCount == closeCount) res = maxOf(res, openCount * 2)
        if (closeCount > openCount) {
            openCount = 0
            closeCount = 0
        }
    }

    openCount = 0
    closeCount = 0

    for (i in s.length - 1 downTo 0) {
        val c = s[i]

        when (c) {
            ')' -> {
                closeCount++
            }

            '(' -> {
                openCount++
            }
        }

        if (openCount == closeCount) res = maxOf(res, openCount * 2)

        if (openCount > closeCount) {
            openCount = 0
            closeCount = 0
        }
    }

    return res
}