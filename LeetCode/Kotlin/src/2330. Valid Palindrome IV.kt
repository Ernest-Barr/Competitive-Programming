private fun makePalindrome(s: String): Boolean {
    val n = s.length
    var l = 0
    var r = n - 1
    var count = 0

    while (l < r) if (s[l++] != s[r--]) count++

    return count < 3
}
