private fun canPermutePalindrome(s: String): Boolean {
    val n = s.length
    val freq: IntArray = IntArray(26) { 0 }
    var c = 0

    for (c in s) freq[c - 'a']++
    for (num in freq) if (num and 1 == 1 && c++ > 0) return false

    return true
}
