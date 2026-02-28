fun countPermutations(complexity: IntArray): Int {
    val root = complexity[0]
    val n = complexity.size
    val mod = (1e9 + 7.0).toLong()

    for (c in 1..<n) if (complexity[c] <= root) return 0
    var res: Long  = 1
    for (i in 1..<n) res = res * i % mod

    return res.toInt()
}