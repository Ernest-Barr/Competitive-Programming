fun findTheDifference(s: String, t: String): Char {
    val table = IntArray(26) { 0 }

    for (c in s) table[c - 'a']++
    for (c in t) table[c - 'a']--

    for (i in table.indices) if (table[i] != 0) return 'a' + i

    return ' '
}