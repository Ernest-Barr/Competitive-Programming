private fun maxProfit(prices: IntArray): Int {
    var res = 0
    for (i in 1..<prices.size) {
        val price = prices[i] - prices[i - 1]
        if (price > 0) res += price
    }

    return res
}