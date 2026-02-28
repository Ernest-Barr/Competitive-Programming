private fun maxVowels(s: String, k: Int): Int {
    val n = s.length
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0

    for (i in 0..<k) if (s[i] in vowels) count++

    var res = count

    for (i in k..<n) {
        if (s[i] in vowels) count++
        if (s[i - k] in vowels) count--

        res = maxOf(res, count)
    }

    return res
}