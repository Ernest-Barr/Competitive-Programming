private fun processQueries(queries: IntArray, m: Int): IntArray {
    val n = queries.size
    val p: MutableList<Int> = MutableList(m) { it + 1 }
    val res: IntArray = IntArray(n) { 0 }

    for (i in queries.indices) {
        for (j in p.indices) {
            if (queries[i] == p[j]) {
                res[i] = j
                p.add(0, p.removeAt(j))
                break
            }
        }
    }

    return res
}
