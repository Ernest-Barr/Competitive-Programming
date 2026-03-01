private fun minPartitions(n: String): Int {
    var res = 0
    for (c in n) res = maxOf(res, c - '0')

    return res
}
