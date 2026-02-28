private fun strStr(haystack: String, needle: String): Int {
    if (needle == haystack) return 0
    if (needle.length > haystack.length) return -1

    val len = needle.length
    for (i in 0..haystack.length - len) {
        var substr = ""
        for (j in i..<i + len) substr += haystack[j]
        if (needle == substr) return i
    }
    return -1
}
