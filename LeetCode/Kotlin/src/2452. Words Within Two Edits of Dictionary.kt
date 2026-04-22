fun twoEditWords(
    queries: Array<String>,
    dictionary: Array<String>,
): List<String> {
    val res: MutableList<String> = mutableListOf()

    for (query in queries) {
        for (word in dictionary) {
            if (query == word) {
                res.add(query)
                break
            }

            var count = 0

            for (i in query.indices) {
                if (query[i] != word[i]) count++
            }

            if (count <= 2) {
                res.add(query)
                break
            }
        }
    }

    return res
}
