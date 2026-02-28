fun isStrictlyPalindromic(n: Int): Boolean {

    fun isPalindrome(str: String): Boolean {
        var l = 0
        var r = str.length - 1

        while (l < r) {
            if (str[l] == str[r]) {
                l++
                r--
            } else {
                return false
            }
        }
        return true
    }

    for (i in 2..n - 2) {
        if (!isPalindrome(n.toString(i))) return false
    }

    return true
}