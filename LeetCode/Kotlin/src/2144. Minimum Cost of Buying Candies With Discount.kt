private fun minimumCost(cost: IntArray): Int {
    cost.sort()

    var count = 0
    var res = 0

    for (i in cost.indices.reversed()) {
        if (count == 2) {
            count = 0
            continue
        }

        res += cost[i]
        count++
    }

    return res
}
