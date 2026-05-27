import kotlin.math.abs

class WordDistance(val words: Array<String>) {
    val map: MutableMap<String, MutableList<Int>> = mutableMapOf()
    //  vall n = words.size
    init {
        for ((i, word) in words.withIndex()) {
            if (word !in map) map[word] = mutableListOf()
            map[word]!!.add(i)
        }
    }

    fun shortest(word1: String, word2: String): Int {
        var res = Int.MAX_VALUE
        for (i in map[word1]!!) {
            for (j in map[word2]!!) {
                res = minOf(res, abs(i - j))
            }
        }

        return res
    }

}

/**
 * Your WordDistance object will be instantiated and called as such:
 * var obj = WordDistance(wordsDict)
 * var param_1 = obj.shortest(word1,word2)
 */
