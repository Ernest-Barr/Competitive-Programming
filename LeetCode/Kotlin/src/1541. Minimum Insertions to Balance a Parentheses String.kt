private fun minInsertions(s: String): Int {
    val n = s.length
    var res = 0

    var i = 0
    var l = 0

    while (i < n) {
        when (s[i]) {
            '(' -> {
                l++
                i++
            }

            else -> {
                if (l > 0) l-- else res++

                when {
                    i + 1 < n && s[i + 1] == ')' -> i +=2

                    else -> {
                        res++
                        i++
                    }
                }
            }
        }
    }

    return res + l * 2
}
