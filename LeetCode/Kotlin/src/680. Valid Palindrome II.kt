private fun validPalindrome(s: String): Boolean {
    var l = 0
    var r = s.length - 1

    fun isValid(left: Int, right: Int): Boolean {
        var i = left
        var j = right

        while (i < j) {
            if (s[i] != s[j]) return false
            i++
            j--
        }

        return true
    }

    while (l < r) {
        if (s[l] != s[r]) return isValid(l + 1, r) || isValid(l, r - 1)
        l++
        r--
    }

    return true
}

fun main() {

    println(validPalindrome("radar"))
    println(validPalindrome("racecars"))
    println(validPalindrome("radars"))
    println(validPalindrome("aba"))
    println(validPalindrome("abca"))
    println(validPalindrome("abc"))
}