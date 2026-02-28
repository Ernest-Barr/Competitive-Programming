private fun isPalindrome(s: String): Boolean {
    var start = 0
    var end = s.length - 1
    val str = s.lowercase()
    while (start <= end) {
        if (!str[start].isLetterOrDigit()) {
            start++
        } else if (!str[end].isLetterOrDigit()) {
            end--
        } else if (str[start] != str[end]) {
            return false
        } else {
            start++
            end--
        }
    }
    return true
}