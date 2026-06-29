private fun maxIceCream(costs: IntArray, coins: Int): Int {
    costs.sort()

    if (coins < costs[0]) return 0

    var res = 0
    var c = coins
    var i = 0

    while (i < costs.size && costs[i] <= c) {
        res++
        c -= costs[i++]
    }

    return res
}
