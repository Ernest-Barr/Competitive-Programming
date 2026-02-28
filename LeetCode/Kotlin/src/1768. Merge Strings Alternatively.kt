private fun mergeAlternately(word1: String, word2: String): String {
    var i = 0
    var res = ""
    val n = maxOf(word1.length, word2.length)
    while (i < n) {
        if (i < word1.length) res += word1[i]
        if (i < word2.length) res += word2[i]
        i++
    }

    return res
}

fun main() {
    println(mergeAlternately("abc", "pqr") == "apbqcr")
    println(mergeAlternately("ab", "pqrs") == "apbqrs")
    println(mergeAlternately("abcd", "pq") == "apbqcd")
}