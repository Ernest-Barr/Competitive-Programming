private fun totalReplacements(ranks: IntArray): Int {
    var res = 0
    val n = ranks.size
    var min = ranks[0]

    for (i in 1..<n) {
        if (ranks[i] < min) {
            min = ranks[i]
            res++
        }
    }

    return res
}
