fun longestPalindrome(s: String): String {
    val n = s.length

    fun isPalindrome(l: Int, r: Int): Pair<Int, Int> {
        var i = l
        var j = r

        while (i >= 0 && j < n && s[i] == s[j]) {
            i--
            j++
        }

        return Pair(i + 1, j - 1)
    }

    var res: Pair<Int, Int> = Pair(0, 0)
    var resLen = 0

    for (i in s.indices) {
        val odd = isPalindrome(i, i)
        val even = isPalindrome(i, i + 1)

        val oddLen = odd.second - odd.first
        val evenLen = even.second - even.first

        if (oddLen > resLen) {
            res = odd
            resLen = oddLen
        }

        if (evenLen > resLen) {
            res = even
            resLen = evenLen
        }

        if (resLen == n) return s
    }

    return s.substring(res.first, res.second + 1)
}