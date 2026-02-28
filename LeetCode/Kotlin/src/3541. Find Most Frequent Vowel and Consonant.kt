fun maxFreqSum(s: String): Int {
    val map: MutableMap<Char, Int> = mutableMapOf()
    val vowels = setOf('a', 'e', 'i', 'o', 'u')

    var maxVowel = 0
    var maxConsonant = 0

    for (c in s) if (c in map) map[c] = map[c]!! + 1 else map[c] = 1
    for ((c, i) in map) if (c in vowels) maxVowel = maxOf(maxVowel, i) else maxConsonant = maxOf(maxConsonant, i)

    return maxVowel + maxConsonant
}