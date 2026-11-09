private fun maxCoins(piles: IntArray): Int {
    val n = piles.size
    piles.sort()

    var res = 0
    var r = n - 2
    var l = 0

    while (l < r) {
        res += piles[r]

        r -= 2
        l++
    }

    return res
}
