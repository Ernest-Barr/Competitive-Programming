private fun closeStrings(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false

    val freq1 = IntArray(26) { 0 }
    val freq2 = IntArray(26) { 0 }

    for (c in word1) freq1[c - 'a']++
    for (c in word2) freq2[c - 'a']++

    for (i in freq1.indices) if (freq1[i] == 0 && freq2[i] != 0 || freq1[i] != 0 && freq2[i] == 0) return false

    freq1.sort()
    freq2.sort()

    for (i in freq1.indices) if (freq1[i] != freq2[i]) return false

    return true
}