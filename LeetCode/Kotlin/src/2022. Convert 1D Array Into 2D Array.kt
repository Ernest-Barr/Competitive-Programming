fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
    if (m * n != original.size) return arrayOf()

    val res: Array<IntArray> = Array(m) { IntArray(n) { 0 } }
    for (i in original.indices) res[i / n][i % n] = original[i]

    return res
}