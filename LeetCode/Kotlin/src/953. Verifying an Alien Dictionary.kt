fun isAlienSorted(words: Array<String>, order: String): Boolean {
    val alphabet: MutableMap<Char, Int> = mutableMapOf()
    val n = words.size

    for (i in order.indices) alphabet[order[i]] = i
    // println(alphabet)

    for (i in 1..<n) {
        val m = words[i].length
        val k = words[i - 1].length
        var a = 0
        var b = 0
        var valid = false

        while (a < m && b < k) {
            when {
                alphabet[words[i][a]]!! > alphabet[words[i - 1][b]]!! -> {
                    valid = true
                    break
                }

                alphabet[words[i][a++]]!! < alphabet[words[i - 1][b++]]!! -> return false
            }
        }

        if (!valid && k > m) return false
    }


    return true
}