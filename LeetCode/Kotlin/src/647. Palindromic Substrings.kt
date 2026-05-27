fun countSubstrings(s: String): Int {
    val n = s.length

    fun countPalindromes(i: Int, j: Int): Int {
        var l = i
        var r = j
        var res = 0

        while (l >= 0 && r < n && s[l] == s[r]) {
            l--
            r++
            res++
        }

        return res
    }

    var res = 0

    for (i in s.indices) res += countPalindromes(i, i) + countPalindromes(i, i + 1)

    return res
}
