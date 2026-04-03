private fun minCost(n: Int): Int {
    var res = 0

    var a = n

    while (a != 0) {
        a -= 1
        res += a
    }

    return res
}
