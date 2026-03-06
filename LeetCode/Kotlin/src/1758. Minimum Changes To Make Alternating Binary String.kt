private fun minOperations(s: String): Int {
    // 10
    var first = 0

    for (i in s.indices) {
        if (i % 2 == 0 && s[i] != '1') {
            first++
        } else if (i % 2 == 1 && s[i] == '1') {
            first++
        }
    }
    // 01
    var second = 0

    for (i in s.indices) {
        if (i % 2 == 0 && s[i] != '0') {
            second++
        } else if (i % 2 == 1 && s[i] == '0') {
            second++
        }
    }

    return minOf(first, second)
}
