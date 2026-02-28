fun maxOperations(s: String): Int {
    var res = 0
    var count = 0

    for (i in s.indices) {
        when (s[i]) {
            '1' -> count++
            '0' -> if (i > 0 && s[i - 1] == '1') res += count
        }
    }

    return res
}