private fun reverseWords(s: String): String {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val words = s.split(" ").toMutableList()
    val n = words.size

    fun vowelCount(str: String): Int {
        var res = 0
        for (c in str) if (c in vowels) res++
        return res
    }

    val count = vowelCount(words[0])

    for (i in 1..<n) if (vowelCount(words[i]) == count) words[i] = words[i].reversed()

    return words.joinToString(" ")
}