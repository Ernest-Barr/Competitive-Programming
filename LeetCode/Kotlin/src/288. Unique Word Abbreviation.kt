private class ValidWordAbbr(dictionary: Array<String>) {
    val words: MutableMap<String, String> = mutableMapOf()

    init {
        for (word in dictionary) {
            val a = word[0] + (word.length - 2).toString() + word[word.length - 1]
            words[word] = a
        }
    }

    fun isUnique(word: String): Boolean {
        val a = word[0] + (word.length - 2).toString() + word[word.length - 1]

        for ((s, abb) in words) {
            if (abb == a && s != word) return false
        }

        return true
    }

}
