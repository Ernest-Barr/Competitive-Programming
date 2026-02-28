fun isIsomorphic(s: String, t: String): Boolean {
    val mapS: MutableMap<Char, Int> = mutableMapOf()
    val mapT: MutableMap<Char, Int> = mutableMapOf()

    for (i in s.indices) {
        if (s[i] !in mapS) mapS[s[i]] = i
        if (t[i] !in mapT) mapT[t[i]] = i

        if (mapT[t[i]] != mapS[s[i]]) return false
    }

    return true
}