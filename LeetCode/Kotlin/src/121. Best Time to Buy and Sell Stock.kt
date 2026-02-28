private fun maxProfit(prices: IntArray): Int {
    var res: Int = 0
    var min: Int = Integer.MAX_VALUE

    for (i in prices) {
        if (i < min) min = i
        res = maxOf(res, i - min)
    }

    return res
}

fun main() {
    println(maxProfit(intArrayOf(7,1,5,3,6,4)) == 5)
    println(maxProfit(intArrayOf(7,6,4,3,1)) == 0)
}