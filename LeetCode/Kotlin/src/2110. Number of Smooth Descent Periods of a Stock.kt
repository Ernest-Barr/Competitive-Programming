fun getDescentPeriods(prices: IntArray): Long {
    val n = prices.size
    if (n < 2) return n.toLong()

    var res = 1L
    var curr = 1L

    for (i in 1..<n) {
        curr = if (prices[i - 1] - prices[i] == 1) ++curr else 1
        res += curr
    }

    return res
}