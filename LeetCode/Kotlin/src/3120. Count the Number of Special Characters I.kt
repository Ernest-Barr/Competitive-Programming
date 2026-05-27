private fun numberOfSpecialChars(word: String): Int {
    val n = word.length
    val lower: BooleanArray = BooleanArray(26) { false }
    val upper: BooleanArray = BooleanArray(26) { false }
    var res = 0

    for (c in word) {
        when {
            c in 'a'..'z' -> lower[c - 'a'] = true
            else -> upper[c - 'A'] = true
        }
    }

    // println(lower.joinToString(","))
    // println(upper.joinToString(","))



    for (i in 0..<26) if (lower[i] && upper[i]) res++

    return res
}
