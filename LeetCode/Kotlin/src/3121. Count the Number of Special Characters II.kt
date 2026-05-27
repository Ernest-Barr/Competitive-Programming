private fun numberOfSpecialChars(word: String): Int {
    // val upper: MutableMap<Char, Int> = mutableMapOf()
    // val lower: MutableMap<Char, Int> = mutableMapOf()
    val lower: IntArray = IntArray(26) { -1 }
    val upper: IntArray = IntArray(26) { -1 }
    // val n = word.length
    var res = 0

    /*
        Mark the first appearance of an uppercase
        Mark the last appearance of a lowercase, naively
    */

    for ((i, c) in word.withIndex()) {
        when {
            c in 'a'..'z' -> lower[c - 'a'] = i
            else -> if (upper[c - 'A'] == -1) upper[c - 'A'] = i
        }
    }

    for (i in 0..<26) {
        if (lower[i] != -1 && upper[i] != -1) {
            if (lower[i] < upper[i]) res++
        }
    }

    return res
}
