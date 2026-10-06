private fun minAddToMakeValid(s: String): Int {
    var l = 0
    var res = 0

    /**
    ))(( -> 4
     */

    for (c in s) {
        when (c) {
            '(' -> l++
            ')' -> if (l > 0) l-- else res++
        }
    }

    return res + l
}
