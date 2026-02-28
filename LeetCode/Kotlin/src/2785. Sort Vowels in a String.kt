fun sortVowels(s: String): String {
    val str = StringBuilder(s)
    val mapping = mutableMapOf(
        'A' to 0, 'E' to 1, 'I' to 2, 'O' to 3, 'U' to 4,
        'a' to 5, 'e' to 6, 'i' to 7, 'o' to 8, 'u' to 9
    )
    val count = IntArray(10) { 0 }
    val q = ArrayDeque<Char>()

    for (c in str) {
        if (c in mapping) count[mapping[c]!!]++
    }

    for ((c, i) in mapping) {
        for (j in 0..<count[i]) {
            q.addLast(c)
        }
    }

    for (i in str.indices) {
        if (str[i] in mapping) str[i] = q.removeFirst()
    }

    return str.toString()
}