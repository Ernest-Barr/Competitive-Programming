private fun reverseWords(s: String): String {
    var arr = s.split("\\s+".toRegex())
    var res = ""
    for (i in arr.size - 1 downTo 0) res += arr[i] + " "
    return res.trim()
}