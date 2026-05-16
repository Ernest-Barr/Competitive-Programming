private fun balancedStringSplit(s: String): Int {
    val n = s.length
    var l = if (s[0] == 'L') 1 else 0
    var r = if (s[0] == 'R') 1 else 0
    var res = 0


    for (i in 1..<n) {
        if (s[i] == 'L') l++ else r++


        if (l == r) {
            res++
            l = 0
            r = 0
        }
    }


    return res
}
