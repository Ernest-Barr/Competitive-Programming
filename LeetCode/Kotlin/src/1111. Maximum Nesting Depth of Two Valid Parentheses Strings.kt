private fun maxDepthAfterSplit(seq: String): IntArray {
    var depth = 0
    val n = seq.length
    val res = IntArray(n) { 0 }

    for (i in seq.indices) {
        res[i] = when (seq[i]) {
            '(' -> ++depth % 2
            else -> depth-- % 2
        }
    }

    return res
}
