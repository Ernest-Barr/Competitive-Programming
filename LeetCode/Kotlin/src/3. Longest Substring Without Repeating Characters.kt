private fun lengthOfLongestSubstring(s: String): Int {
    val set: MutableSet<Char> = mutableSetOf()
    var res = 0
    var l = 0

    for (r in s.indices) {
        while (s[r] in set) {
            set.remove(s[l])
            l++
        }

        set.add(s[r])
        res = maxOf(res, set.size)
    }

    return res
}
