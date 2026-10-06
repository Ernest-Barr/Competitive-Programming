private fun scoreOfParentheses(s: String): Int {
    /**
    Only update score when "()" is read in, a pair of parentheses at a certain depth will have a multiplier associateed with it. The outer pair of parentheses in (())  do not count as +1 score
    Since Depth multiplies score by a power of 2, use bit shifting to track the score at a given depth
     */
    var res = 0
    var depth = 0

    for (i in s.indices) {
        when (s[i]) {
            '(' -> depth++
            ')'-> {
                depth--

                if (s[i - 1] == '(') res += 1 shl depth
            }
        }
    }

    return res
}
