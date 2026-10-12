private fun removeOuterParentheses(s: String): String {
    /**
    (()()) (()) (() (()))
    depth  1 = remove
     */

    val res: StringBuilder = StringBuilder()
    var depth = 0

    for (c in s) {
        when (c) {
            '(' -> if (++depth != 1) res.append(c)
            ')' -> if (depth-- != 1) res.append(c)
        }
    }

    return res.toString()
}
