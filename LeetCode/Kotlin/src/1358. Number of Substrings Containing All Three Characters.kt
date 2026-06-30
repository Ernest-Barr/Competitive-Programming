private fun numberOfSubstrings(s: String): Int {
    var res = 0
    var l = 0
    val n = s.length
    val map: MutableMap<Char, Int> = mutableMapOf(
        'a' to 0,
        'b' to 0,
        'c' to 0
    )

    for (r in s.indices) {
        map[s[r]] = map[s[r]]!! + 1

        while (l < r && map['a']!! > 0 && map['b']!! > 0 && map['c']!! > 0) {
            map[s[l]] =  map[s[l]]!! - 1
            // println(s.substring(l , r + 1))
            res += n - r
            l++
        }
    }

    return res
}
