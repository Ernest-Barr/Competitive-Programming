private fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
    val res: MutableList<Int> = mutableListOf()

    words.forEachIndexed { i, s ->
        if (x in s) res.add(i)
    }

    return res
}