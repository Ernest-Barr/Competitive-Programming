fun findJudge(n: Int, trust: Array<IntArray>): Int {
    val inDeg: MutableList<Int> = MutableList(n + 1) { 0 }
    val outDeg: MutableList<Int> = MutableList(n + 1) { 0 }

    for ((u,v) in trust) {
        inDeg[v]++
        outDeg[u]++
    }

    for (i in 1..n) if (inDeg[i] == n - 1 && outDeg[i] == 0) return i

    return -1
}