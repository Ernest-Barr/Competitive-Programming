// Brute Force
fun rangeAddQueries(n: Int, queries: Array<IntArray>): Array<IntArray> {
    val res: Array<IntArray> = Array(n) { IntArray(n) { 0 } }

    for (q in queries) {
        val r1 = q[0]
        val c1 = q[1]
        val r2 = q[2]
        val c2 = q[3]

        for (i in r1..r2) {
            for (j in c1..c2) {
                res[i][j]++
            }
        }
    }

    return res
}

//TODO: Optimize