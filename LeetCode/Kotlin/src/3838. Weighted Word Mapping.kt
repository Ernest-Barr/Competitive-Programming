private fun mapWordWeights(words: Array<String>, weights: IntArray): String {
    var res = ""

    val map: MutableMap<Char, Int> = mutableMapOf()

    for ((i, weight) in weights.withIndex()) map['a' + i] = weight


    for (word in words) {
        var sum = 0

        for (c in word) sum += map[c]!!

        res += 'z' - (sum % 26)
    }

    return res
}
