fun spellchecker(wordlist: Array<String>, queries: Array<String>): Array<String> {
    val set: MutableSet<String> = wordlist.toMutableSet()
    val map: MutableMap<String, String> = mutableMapOf()
    val res: MutableList<String> = mutableListOf()

    fun isVowel(ch: Char): Boolean {
        val c = ch.lowercaseChar()
        return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')
    }

    fun omitVowels(s: String): String {
        val str = StringBuilder(s)

        for (i in str.indices) {
            if (isVowel(str[i])) str[i] = '1'
        }

        return str.toString()
    }
    // three cases:
    // Case One: query is in word list/set
    // Case two: Capitalization is only diff
    // Case three: Same word except for vowels, different number of vowels = reject

    for (word in wordlist) {
        val lower = word.lowercase()
        val removedVowels = omitVowels(lower)
        if (lower !in map) map[lower] = word
        // if (lower in set) continue
        if (removedVowels !in map) map[removedVowels] = word
    }

    for (query in queries) {
        val lower = query.lowercase()
        val removed = omitVowels(lower)

        when {
            query in set -> res.add(query)
            lower in map -> res.add(map[lower]!!)
            removed in map -> res.add(map[removed]!!)
            else -> res.add("")
        }
    }

    return res.toTypedArray()
}
